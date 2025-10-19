package net.dakotapride.desolatum;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@Mod(value = Desolatum.ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Desolatum.ID, value = Dist.CLIENT)
public class DesolatumClient {
    public DesolatumClient(ModContainer container) {}

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {}

    @SubscribeEvent
    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            registerBuiltinResourcePack(event, "desaturated_purpura", PackSource.BUILT_IN, false);
            registerBuiltinResourcePack(event, "desolatum_resources", PackSource.BUILT_IN, false);
        }
    }

    private static void registerBuiltinResourcePack(AddPackFindersEvent event, String folder, PackSource source, boolean alwaysActive) {
        event.addPackFinders(
                Desolatum.location("assets/desolatum/resourcepacks/" + folder),
                PackType.CLIENT_RESOURCES,
                Component.literal(Desolatum.ID + "/" + folder),
                source,
                alwaysActive,
                Pack.Position.TOP);
    }
}
