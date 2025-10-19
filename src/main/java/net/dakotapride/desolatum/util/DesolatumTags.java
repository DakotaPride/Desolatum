package net.dakotapride.desolatum.util;

import net.dakotapride.desolatum.Desolatum;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Locale;

public class DesolatumTags {
    public enum Items {
        SHEARS("c", "tools/shear"),



        ;

        TagKey<Item> tag;

        Items() {
            String id = name().toLowerCase(Locale.ROOT);
            tag = TagKey.create(BuiltInRegistries.ITEM.key(), Desolatum.location(id));
        }

        Items(String namespace, String id) {
            tag = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(namespace, id));
        }

        Items(String id) {
            tag = TagKey.create(BuiltInRegistries.ITEM.key(), Desolatum.location(id));
        }

        public TagKey<Item> getTag() {
            return tag;
        }
    }

    public enum Blocks {
        END_STONE_TYPE("stone_types/end_stone"),
        PURPURA_STONE_TYPE("stone_types/purpura"),
        END_STONE_REPLACEABLE(),
        CHLORITE_REPLACEABLE(),
        COMMON_END_STONE("c", "end_stones"),


        ;

        TagKey<Block> tag;

        Blocks() {
            String id = name().toLowerCase(Locale.ROOT);
            tag = TagKey.create(BuiltInRegistries.BLOCK.key(), Desolatum.location(id));
        }
        Blocks(String namespace, String id) {
            tag = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(namespace, id));
        }

        Blocks(String id) {
            tag = TagKey.create(BuiltInRegistries.BLOCK.key(), Desolatum.location(id));
        }

        public TagKey<Block> getTag() {
            return tag;
        }
    }
}
