package peanut.tta;


import java.io.File;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import peanut.tta.block.ModBlocks;
import peanut.tta.item.ModItems;
import peanut.tta.item.ToolMaterials;
import peanut.tta.item.crafting.CraftingManager;
import peanut.tta.item.crafting.FurnaceRecipes;
import peanut.tta.lib.Reference;
import peanut.tta.proxy.CommonProxy;
import peanut.tta.world.ModGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class throughtheages {
	@Instance(Reference.MOD_ID)
	public static throughtheages instance;

	@SidedProxy(clientSide = "peanut.tta.proxy.ClientProxy", serverSide = "peanut.tta.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	    public void serverStarting(FMLServerStartingEvent event)
	    {

	    }
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		
		// Initialize mod items
        ModItems.init();

        // Initialize mod blocks
        ModBlocks.init();
        
       
	}
        public void initConfiguration(FMLInitializationEvent event){
    		Configuration config = new Configuration(new File("config/tta.cfg"));
    		config.load();
    		
    		
    		config.save();
    		
    		
    	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.initRenderingAndTextures();
		
		//Initialize mod smelting recipes
		FurnaceRecipes.init();
		
		 // Initialize mod ore gen
        ModGen.init();
		
		//Initialize mod crafting recipes
		CraftingManager.init();
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}