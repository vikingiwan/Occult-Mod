package tk.vikingcorp.occultMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultModItem extends Item
{
	public OccultModItem()
	{
		super();
		setCreativeTab(RegisterHelper.tabOccultMod);
	}
}
