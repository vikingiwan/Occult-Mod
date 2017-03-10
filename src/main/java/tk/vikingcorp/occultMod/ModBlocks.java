package tk.vikingcorp.occultMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.vikingcorp.occultMod.assist.RegisterHelper;
import tk.vikingcorp.occultMod.blocks.OccultModBlock;

public class ModBlocks
{
	
	public static Block occultOre = new OccultModBlock(Material.rock).setBlockName("occultOre");
	
	public static void init()
	{
		RegisterHelper.registerBlock(occultOre);
	}
}
