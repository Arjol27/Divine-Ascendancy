package com.da.main;

import com.da.blocks.BlockRegistry;
import com.da.items.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModelManager {
	
	public static ModelManager INSTANCE = new ModelManager();

	public static void registerItemRenders(){
		registerItemRender(ItemRegistry.divineCore);
	}
	
	public static void registerBlockRenders(){
		registerBlockRender(BlockRegistry.altarCore);
	}
	
	private static void registerItemRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	private static void registerBlockRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}
