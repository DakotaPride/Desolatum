package net.dakotapride.desolatum.block;

import net.dakotapride.desolatum.util.DesolatumTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class DeadChorusPlantBlock extends EndPlantBlock {
    public DeadChorusPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onBlockExploded(BlockState state, Level level, BlockPos pos, Explosion explosion) {
        createEffectCloud(level, pos);
        super.onBlockExploded(state, level, pos, explosion);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        createEffectCloud(level, pos, player.getMainHandItem());
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    private static void createEffectCloud(Level level, BlockPos pos, ItemStack stack) {
        if (level instanceof ServerLevel server && !(stack.is(DesolatumTags.Items.SHEARS.getTag()) || EnchantmentHelper.hasTag(stack, EnchantmentTags.PREVENTS_DECORATED_POT_SHATTERING))) {
            AreaEffectCloud cloud = new AreaEffectCloud(level, pos.getX(), pos.getY(), pos.getZ());
            cloud.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 400, 0, false, true, true));
            server.addFreshEntity(cloud);
        }
    }

    private static void createEffectCloud(Level level, BlockPos pos) {
        if (level instanceof ServerLevel server) {
            AreaEffectCloud cloud = new AreaEffectCloud(level, pos.getX(), pos.getY(), pos.getZ());
            cloud.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 400, 0, false, true, true));
            server.addFreshEntity(cloud);
        }
    }
}
