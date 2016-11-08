package com.da.main;

import com.da.items.ItemRegistry;
import com.da.proxy.ClientProxy;
import com.da.proxy.CommonProxy;
import com.da.proxy.ServerProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DivineAscendancy.MODID, name = DivineAscendancy.MODNAME, version = DivineAscendancy.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class DivineAscendancy {

	public static final String MODID = "arpadasc";
	public static final String MODNAME = "Divine Ascendancy";
	public static final String VERSION = "0.1";
	
	public static final String CLIENT_PROXY = "com.da.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.da.proxy.ServerProxy";
	
	@Instance
	public static DivineAscendancy instance;
	
    @SidedProxy(clientSide = DivineAscendancy.CLIENT_PROXY, serverSide = DivineAscendancy.SERVER_PROXY)
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    	//ItemRegistry.initialize();    	
    	proxy.registerModels();
    	
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }

}
