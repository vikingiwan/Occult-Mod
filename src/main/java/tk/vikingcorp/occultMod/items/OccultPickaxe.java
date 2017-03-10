package tk.vikingcorp.occultMod.items;

import net.minecraft.item.ItemPickaxe;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultPickaxe extends ItemPickaxe
{

	public OccultPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(RegisterHelper.tabOccultMod);
	}

}
