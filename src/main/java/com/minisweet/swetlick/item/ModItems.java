package com.minisweet.swetlick.item;

import com.minisweet.swetlick.SwetLick;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RAW_RAPPHIRE = registerItem("raw_sapphire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SwetLick.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SwetLick.LOGGER.info("Registering Mod Items for " + SwetLick.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SAPPHIRE);
            entries.add(RAW_RAPPHIRE);
        });
    }
}
