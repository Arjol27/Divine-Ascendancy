package com.da.proxy;

import com.da.items.ItemRegistry;
import com.da.main.ModelManager;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerModels() {
		
		ModelManager.INSTANCE.registerItemRenders();
		ModelManager.INSTANCE.registerBlockRenders();
		
		super.registerModels();
	}

}

