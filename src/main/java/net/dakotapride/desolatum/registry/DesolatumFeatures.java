package net.dakotapride.desolatum.registry;

import net.dakotapride.desolatum.Desolatum;
import net.dakotapride.desolatum.worldgen.feature.EndBlobFeature;
import net.dakotapride.desolatum.worldgen.feature.ViriditeSpikeFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DesolatumFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, Desolatum.ID);
    public static final DeferredHolder<Feature<?>, Feature<NoneFeatureConfiguration>> VIRIDITE_SPIKE = register("viridite_spike", new ViriditeSpikeFeature(NoneFeatureConfiguration.CODEC));
    public static final DeferredHolder<Feature<?>, Feature<BlockStateConfiguration>> END_BLOB = register("end_blob", new EndBlobFeature(BlockStateConfiguration.CODEC));

    private static <C extends FeatureConfiguration> DeferredHolder<Feature<?>, Feature<C>> register(String key, Feature<C> value) {
        return FEATURES.register(key, () -> value);
        //return Registry.register(BuiltInRegistries.FEATURE, Desolatum.location(key), value);
    }

    public static void register(IEventBus bus) {
        FEATURES.register(bus);
    }
}
