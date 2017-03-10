package tk.vikingcorp.occultMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.vikingcorp.occultMod.assist.RegisterHelper;
import tk.vikingcorp.occultMod.blocks.OccultBlock;
import tk.vikingcorp.occultMod.blocks.OccultModBlock;
import tk.vikingcorp.occultMod.blocks.OccultOre;

public class ModBlocks
{
	
	public static Block occultOre = new OccultOre(Material.rock).setBlockName("occultOre").setBlockTextureName("occultmod:occultOre");
	public static Block occultBlock = new OccultBlock(Material.iron).setBlockName("occultBlock").setBlockTextureName("occultmod:occultBlock");
	
	public static void init()
	{
		RegisterHelper.registerBlock(occultOre);
		RegisterHelper.registerBlock(occultBlock);
	}
}
