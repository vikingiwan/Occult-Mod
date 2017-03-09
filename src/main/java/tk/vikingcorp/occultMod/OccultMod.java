package tk.vikingcorp.occultMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import tk.vikingcorp.occultMod.assist.Reference;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)

public class OccultMod 
{
	//PRE-INIT
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		//ModBlocks.init();
	}
	
	//INIT
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	//POST-INIT
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
