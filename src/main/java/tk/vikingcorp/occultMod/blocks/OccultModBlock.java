package tk.vikingcorp.occultMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultModBlock extends Block
{
	public OccultModBlock(Material material)
	{
		super(material);
		setCreativeTab(RegisterHelper.tabOccultMod);
	}
}
