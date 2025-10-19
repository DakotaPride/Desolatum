package net.dakotapride.desolatum.terrablender;

import net.dakotapride.desolatum.Desolatum;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class DesolatumBiomes {
    public static final ResourceKey<Biome> OBSIDISED_END_HIGHLANDS = register("obsidised_end_highlands");
    public static final ResourceKey<Biome> END_DUNES = register("end_dunes");
    public static final ResourceKey<Biome> RICH_END_DUNES = register("rich_end_dunes");
    public static final ResourceKey<Biome> VIRIDIAN_HIGHLANDS = register("viridian_highlands");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, Desolatum.location(name));
    }
}
