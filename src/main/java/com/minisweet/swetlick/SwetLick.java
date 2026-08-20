package com.minisweet.swetlick;

import com.minisweet.swetlick.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwetLick implements ModInitializer {
	public static final String MOD_ID = "swetlick";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}