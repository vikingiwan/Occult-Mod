package tk.vikingcorp.occultMod.armor;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultArmor extends ItemArmor {

	public OccultArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
		this.setCreativeTab(RegisterHelper.tabOccultMod);
	}

}
