package net.dakotapride.desolatum.terrablender;

import net.dakotapride.desolatum.registry.DesolatumBlocks;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class ModSurfaceRuleData {
    private static final SurfaceRules.RuleSource END_STONE = makeStateRule(Blocks.END_STONE);
    private static final SurfaceRules.RuleSource OBSIDISED_END_STONE = makeStateRule(DesolatumBlocks.OBSIDISED_END_STONE.get());
    private static final SurfaceRules.RuleSource DUSTY_END_STONE = makeStateRule(DesolatumBlocks.DUSTY_END_STONE.get());
    private static final SurfaceRules.RuleSource CHLORITE = makeStateRule(DesolatumBlocks.CHLORITE.get());
    private static final SurfaceRules.RuleSource PURPURA = makeStateRule(DesolatumBlocks.PURPURA.get());

    public static SurfaceRules.RuleSource makeRules() {
        //SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        //SurfaceRules.RuleSource endSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, END_STONE), END_STONE);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DesolatumBiomes.OBSIDISED_END_HIGHLANDS),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(OBSIDISED_END_STONE)))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(DesolatumBiomes.END_DUNES),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(DUSTY_END_STONE)),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(DUSTY_END_STONE)))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DesolatumBiomes.RICH_END_DUNES),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(DUSTY_END_STONE)),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(DUSTY_END_STONE)))),

                SurfaceRules.ifTrue(SurfaceRules.isBiome(DesolatumBiomes.VIRIDIAN_HIGHLANDS),
                        SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(CHLORITE)),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.sequence(CHLORITE))))
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
