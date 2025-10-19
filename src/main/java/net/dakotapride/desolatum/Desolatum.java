package net.dakotapride.desolatum;

import com.mojang.logging.LogUtils;
import net.dakotapride.desolatum.registry.DesolatumBlocks;
import net.dakotapride.desolatum.registry.DesolatumCreativeModeTabs;
import net.dakotapride.desolatum.registry.DesolatumFeatures;
import net.dakotapride.desolatum.registry.DesolatumItems;
import net.dakotapride.desolatum.terrablender.DesolatumBiomes;
import net.dakotapride.desolatum.terrablender.ModSurfaceRuleData;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.SurfaceRuleManager;

@Mod(Desolatum.ID)
public class Desolatum {
    public static final String ID = "desolatum";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation location(String id) {
        return ResourceLocation.fromNamespaceAndPath(ID, id);
    }

    public Desolatum(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        DesolatumBlocks.register(modEventBus);
        DesolatumItems.register(modEventBus);
        DesolatumCreativeModeTabs.register(modEventBus);
        DesolatumFeatures.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        //modEventBus.addListener(this::creativeTabAdjustments);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // Weights are kept intentionally low as we add minimal biomes
            //Regions.register(new TestRegion1(location("end_0"), 2));
            EndBiomeRegistry.registerHighlandsBiome(DesolatumBiomes.OBSIDISED_END_HIGHLANDS, 10);
            EndBiomeRegistry.registerHighlandsBiome(DesolatumBiomes.END_DUNES, 10);
            EndBiomeRegistry.registerHighlandsBiome(DesolatumBiomes.RICH_END_DUNES, 2);
            EndBiomeRegistry.registerHighlandsBiome(DesolatumBiomes.VIRIDIAN_HIGHLANDS, 4);

            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, ID, ModSurfaceRuleData.makeRules());
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }

//    public void creativeTabAdjustments(BuildCreativeModeTabContentsEvent event) {
//        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS || event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
//            event.remove(Items.CRYING_OBSIDIAN.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
//    }

//    @EventBusSubscriber(modid = ID)
//    public static class DesolatumEvents {
//
//        @SubscribeEvent(priority = EventPriority.HIGHEST)
//        public static void registerOverrides(RegisterEvent event) {
//            if (event.getRegistryKey() == BuiltInRegistries.ITEM.key()) {
//                event.register(Registries.ITEM, ResourceLocation.withDefaultNamespace("crying_obsidian"), ChargedObsidianBlockItem::new);
//                //event.register(Registries.ITEM, ResourceLocation.withDefaultNamespace("ender_pearl"), () -> new Item(new Item.Properties().stacksTo(64)));
//            }
//        }
//    }
}
