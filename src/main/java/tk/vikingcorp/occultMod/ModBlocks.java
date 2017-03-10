package tk.vikingcorp.occultMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.vikingcorp.occultMod.assist.RegisterHelper;
import tk.vikingcorp.occultMod.blocks.OccultModBlock;

public class ModBlocks
{
	
	public static Block occultOre = new OccultModBlock(Material.rock).setBlockName("occultOre").setBlockTextureName("occultmod:occultOre").setHardness(2.0F).setResistance(2000.0F);
	public static Block occultBlock = new OccultModBlock(Material.iron).setBlockName("occultBlock").setBlockTextureName("occultmod:occultBlock");
	
	public static void init()
	{
		RegisterHelper.registerBlock(occultOre);
		RegisterHelper.registerBlock(occultBlock);
	}
}
