package net.dakotapride.desolatum.registry;

import net.dakotapride.desolatum.Desolatum;
import net.dakotapride.desolatum.block.DeadChorusPlantBlock;
import net.dakotapride.desolatum.block.EndPlantBlock;
import net.dakotapride.desolatum.block.ObsidianSpikeBlock;
import net.dakotapride.desolatum.block.ObsidisedEndStoneBlock;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DesolatumBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Desolatum.ID);

    public static final DeferredBlock<Block> SHORT_INFIRMUM_WEEDS = register("short_infirmum_weeds",
            () -> new EndPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).instabreak().mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final DeferredBlock<Block> TALL_INFIRMUM_WEEDS = register("tall_infirmum_weeds",
            () -> new EndPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).instabreak().mapColor(MapColor.TERRACOTTA_PURPLE)));

    public static final DeferredBlock<Block> OBSIDISED_END_STONE = register("obsidised_end_stone",
            () -> new ObsidisedEndStoneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).mapColor(MapColor.COLOR_BLACK)));
    public static final DeferredBlock<Block> OBSIDIAN_SPIKE = register("obsidian_spike",
            () -> new ObsidianSpikeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POINTED_DRIPSTONE).mapColor(MapColor.COLOR_BLACK)));

    public static final DeferredBlock<Block> PURPURA = register("purpura",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<Block> POLISHED_PURPUR_BLOCK = register("polished_purpur_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPURA_SLAB = register("purpura_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> POLISHED_PURPUR_SLAB = register("polished_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPURA_STAIRS = register("purpura_stairs",
            () -> new StairBlock(DesolatumBlocks.PURPURA.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_PURPUR_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPURA_WALL = register("purpura_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> POLISHED_PURPUR_WALL = register("polished_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));
    public static final DeferredBlock<Block> PURPUR_WALL = register("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));

    public static final DeferredBlock<Block> OBSIDIAN_SLAB = register("obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_STAIRS = register("obsidian_stairs",
            () -> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_WALL = register("obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_SLAB = register("charged_obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_STAIRS = register("charged_obsidian_stairs",
            () -> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_WALL = register("charged_obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_OBSIDIAN = register("polished_obsidian",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_CHARGED_OBSIDIAN = register("polished_charged_obsidian",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_OBSIDIAN_SLAB = register("polished_obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_OBSIDIAN_STAIRS = register("polished_obsidian_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_OBSIDIAN_WALL = register("polished_obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_CHARGED_OBSIDIAN_SLAB = register("polished_charged_obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_CHARGED_OBSIDIAN_STAIRS = register("polished_charged_obsidian_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_CHARGED_OBSIDIAN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> POLISHED_CHARGED_OBSIDIAN_WALL = register("polished_charged_obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_BRICKS = register("obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_BRICK_SLAB = register("obsidian_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_BRICK_STAIRS = register("obsidian_brick_stairs",
            () -> new StairBlock(DesolatumBlocks.OBSIDIAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> OBSIDIAN_BRICK_WALL = register("obsidian_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_BRICKS = register("charged_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_BRICK_SLAB = register("charged_obsidian_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_BRICK_STAIRS = register("charged_obsidian_brick_stairs",
            () -> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));
    public static final DeferredBlock<Block> CHARGED_OBSIDIAN_BRICK_WALL = register("charged_obsidian_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN)));

    public static final DeferredBlock<Block> END_STONE_SLAB = register("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_STONE_STAIRS = register("end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_STONE_WALL = register("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CHISELED_END_STONE = register("chiseled_end_stone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> POLISHED_END_STONE = register("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> POLISHED_END_STONE_SLAB = register("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> POLISHED_END_STONE_WALL = register("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> DUSTY_END_STONE = register("dusty_end_stone",
            () -> new ColoredFallingBlock(new ColorRGBA(0xBBB78F), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(0.5F).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> RICH_DUSTY_END_STONE = register("rich_dusty_end_stone",
            () -> new ColoredFallingBlock(new ColorRGBA(0xBBB78F), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(0.5F).sound(SoundType.SUSPICIOUS_SAND)));

    public static final DeferredBlock<Block> CHLORITE = register("chlorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_SLAB = register("chlorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_STAIRS = register("chlorite_stairs",
            () -> new StairBlock(DesolatumBlocks.CHLORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_WALL = register("chlorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_BRICKS = register("chlorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_BRICK_SLAB = register("chlorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_BRICK_STAIRS = register("chlorite_brick_stairs",
            () -> new StairBlock(DesolatumBlocks.CHLORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHLORITE_BRICK_WALL = register("chlorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> CHISELED_CHLORITE = register("chiseled_chlorite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> POLISHED_CHLORITE = register("polished_chlorite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> POLISHED_CHLORITE_SLAB = register("polished_chlorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> POLISHED_CHLORITE_STAIRS = register("polished_chlorite_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_CHLORITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<Block> POLISHED_CHLORITE_WALL = register("polished_chlorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));

    public static final DeferredBlock<Block> PETALITE = register("petalite",
            () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_SLAB = register("petalite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_STAIRS = register("petalite_stairs",
            () -> new StairBlock(DesolatumBlocks.PETALITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_WALL = register("petalite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_BRICKS = register("petalite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_BRICK_SLAB = register("petalite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_BRICK_STAIRS = register("petalite_brick_stairs",
            () -> new StairBlock(DesolatumBlocks.PETALITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> PETALITE_BRICK_WALL = register("petalite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> CHISELED_PETALITE = register("chiseled_petalite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> POLISHED_PETALITE = register("polished_petalite",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> POLISHED_PETALITE_SLAB = register("polished_petalite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> POLISHED_PETALITE_STAIRS = register("polished_petalite_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_PETALITE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> POLISHED_PETALITE_WALL = register("polished_petalite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));

    public static final DeferredBlock<Block> MUDROCK = register("mudrock",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_SLAB = register("mudrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_STAIRS = register("mudrock_stairs",
            () -> new StairBlock(DesolatumBlocks.MUDROCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_WALL = register("mudrock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_BRICKS = register("mudrock_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_BRICK_SLAB = register("mudrock_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_BRICK_STAIRS = register("mudrock_brick_stairs",
            () -> new StairBlock(DesolatumBlocks.MUDROCK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> MUDROCK_BRICK_WALL = register("mudrock_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> CHISELED_MUDROCK = register("chiseled_mudrock",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> POLISHED_MUDROCK = register("polished_mudrock",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> POLISHED_MUDROCK_SLAB = register("polished_mudrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> POLISHED_MUDROCK_STAIRS = register("polished_mudrock_stairs",
            () -> new StairBlock(DesolatumBlocks.POLISHED_MUDROCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));
    public static final DeferredBlock<Block> POLISHED_MUDROCK_WALL = register("polished_mudrock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).strength(0.5F).mapColor(MapColor.TERRACOTTA_GRAY).sound(SoundType.MUD)));

    public static final DeferredBlock<Block> VIRIDITE_BLOCK = register("viridite_block",
            () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).noOcclusion()));
    public static final DeferredBlock<Block> VILIDALLUM_BLOCK = register("vilidallum_block",
            () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK).noOcclusion().mapColor(MapColor.COLOR_LIGHT_GREEN)));

    public static final DeferredBlock<Block> TRISTIS_SLUDGE = register("tristis_sludge",
            () -> new TransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD).strength(0.5F).mapColor(MapColor.TERRACOTTA_CYAN)));

    public static final DeferredBlock<Block> DEAD_CHORUS_PLANT = register("dead_chorus_plant",
            () -> new DeadChorusPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).instabreak().mapColor(MapColor.COLOR_LIGHT_GRAY)));


    // Create Building Suite compat
//    public static final DeferredBlock<Block> SMALL_END_STONE_BRICKS = register("small_end_stone_bricks",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));

    // Collective Registration
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = registerWithoutBlockItem(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> DeferredBlock<T> registerWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return DesolatumItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


}
