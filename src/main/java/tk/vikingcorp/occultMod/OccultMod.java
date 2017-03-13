package tk.vikingcorp.occultMod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import tk.vikingcorp.occultMod.assist.LogHelper;
import tk.vikingcorp.occultMod.assist.Reference;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)

public class OccultMod 
{
	//Set event handler
	OccultEventHandler events = new OccultEventHandler();
	
	//PRE-INIT
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LogHelper.info("Starting Pre Initialization");
		FMLCommonHandler.instance().bus().register(events);
    	MinecraftForge.EVENT_BUS.register(events);
		LogHelper.info("Registering Items and blocks");
    	ModItems.init();
		ModBlocks.init();
		LogHelper.info("Registering WorldGeneration");
		RegisterHelper.registerWorldGen();
		LogHelper.info("Pre Initialization complete!");
	}
	
	//INIT
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		LogHelper.info("Starting Initialization");
		LogHelper.info("Registering recipes");
		RegisterHelper.registerRecipes();
		LogHelper.info("Initialization complete!");
	}
	
	//POST-INIT
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Starting Post Initialization");
		RegisterHelper.registerAchievements();
		LogHelper.info("Post Initialization complete!");
	}
	
	
}
