package net.dakotapride.desolatum.registry;

import net.dakotapride.desolatum.Desolatum;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DesolatumItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Desolatum.ID);

    public static final DeferredItem<Item> VILIDALLUM_SHARD = register("vilidallum_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VIRIDITE_SHARD = register("viridite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DECREPIT_STICK = register("decrepit_stick", () -> new Item(new Item.Properties()));

    // Collective Registration
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static DeferredItem<Item> register(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
}
