package net.dakotapride.desolatum.util;

import net.minecraft.world.level.block.state.BlockState;

public class DesolatumUtils {
    public static boolean isEndStoneAdjacent(BlockState state) {
        return state.is(DesolatumTags.Blocks.CHLORITE_REPLACEABLE.getTag()) || state.is(DesolatumTags.Blocks.PURPURA_STONE_TYPE.getTag());
    }
}
