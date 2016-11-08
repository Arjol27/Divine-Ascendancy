package com.da.items;

import com.da.main.DivineAscendancy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class divineCore extends Item {

	public divineCore() {
		this.setUnlocalizedName(DivineAscendancy.MODID + ":" + "DivineCore");
		this.setRegistryName("divineCore");
		this.setCreativeTab(CreativeTabs.MISC);
	}
	
}
