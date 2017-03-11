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
		FMLCommonHandler.instance().bus().register(events);
    	MinecraftForge.EVENT_BUS.register(events);
		ModItems.init();
		ModBlocks.init();
		RegisterHelper.registerWorldGen();
	}
	
	//INIT
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		RegisterHelper.registerRecipes();
	}
	
	//POST-INIT
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
