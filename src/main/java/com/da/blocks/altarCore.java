package com.da.blocks;

import com.da.main.DivineAscendancy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class altarCore extends Block {

	public altarCore(Material material) {
		super(material);
		this.setUnlocalizedName(DivineAscendancy.MODID + ":" + "AltarCore");
		this.setRegistryName("altarCore");
	}
	
}
