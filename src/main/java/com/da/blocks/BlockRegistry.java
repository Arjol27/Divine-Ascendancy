package com.da.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistry {

	public static Block altarCore = new altarCore(Material.GROUND);
	public static ItemBlock altarCoreIB = new altarCoreIB(altarCore);
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event){
		IForgeRegistry registry = event.getRegistry();
		registry.register(altarCore);
		GameRegistry.register(altarCoreIB);
	}
	
}
