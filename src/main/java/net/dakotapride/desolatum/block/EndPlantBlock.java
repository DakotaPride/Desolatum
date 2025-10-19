package net.dakotapride.desolatum.block;

import net.dakotapride.desolatum.util.DesolatumTags;
import net.dakotapride.desolatum.util.DesolatumUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EndPlantBlock extends TallGrassBlock {
    public EndPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(BlockTags.DIRT) || DesolatumUtils.isEndStoneAdjacent(state);
    }
}
