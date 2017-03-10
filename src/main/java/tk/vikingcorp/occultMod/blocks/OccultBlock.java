package tk.vikingcorp.occultMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultBlock extends Block
{
	public OccultBlock(Material material)
	{
		super(material);
		setCreativeTab(RegisterHelper.tabOccultMod);
		this.setHardness(2.0F);
		this.setResistance(2000.0F);
	}
}
