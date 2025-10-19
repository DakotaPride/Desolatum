package net.dakotapride.desolatum.mixin;

import net.dakotapride.desolatum.registry.DesolatumBlocks;
import net.dakotapride.desolatum.util.DesolatumUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChorusPlantBlock;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.TriState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChorusPlantBlock.class)
public abstract class ChorusPlantBlockMixin extends PipeBlock {
    public ChorusPlantBlockMixin(float apothem, Properties properties) {
        super(apothem, properties);
    }

    @Inject(method = "getStateWithConnections", at = @At("HEAD"), cancellable = true)
    private static void getStateWithConnections(BlockGetter level, BlockPos pos, BlockState state, CallbackInfoReturnable<BlockState> cir) {
        BlockState blockstate = level.getBlockState(pos.below());
        Block block = state.getBlock();
        TriState soilDecision = blockstate.canSustainPlant(level, pos.below(), Direction.UP, state);

        if (blockstate.is(DesolatumBlocks.DUSTY_END_STONE)) {
            cir.setReturnValue(state.trySetValue(DOWN, blockstate.is(block) || blockstate.is(Blocks.CHORUS_FLOWER) || DesolatumUtils.isEndStoneAdjacent(blockstate) || soilDecision.isTrue()));
        }
    }

    @Inject(method = "updateShape", at = @At("HEAD"), cancellable = true)
    private void updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos, CallbackInfoReturnable<BlockState> cir) {
        boolean flag = facing == Direction.DOWN && DesolatumUtils.isEndStoneAdjacent(facingState);
        if (facing == Direction.DOWN && facingState.is(DesolatumBlocks.DUSTY_END_STONE)) {
            cir.setReturnValue(state.setValue(PROPERTY_BY_DIRECTION.get(facing), flag));
        }
    }

    @Inject(method = "canSurvive", at = @At("HEAD"), cancellable = true)
    private void canSurvive(BlockState state, LevelReader level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            BlockPos blockpos = pos.relative(direction);

            BlockState blockstate2 = level.getBlockState(blockpos.below());
            if (blockstate2.is(DesolatumBlocks.DUSTY_END_STONE)) {
                cir.setReturnValue(true);
            }
        }
    }
}
