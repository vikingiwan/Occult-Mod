package tk.vikingcorp.occultMod;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import tk.vikingcorp.occultMod.assist.RegisterHelper;
import tk.vikingcorp.occultMod.items.OccultModItem;
import tk.vikingcorp.occultMod.items.OccultPickaxe;

public class ModItems
{
	//Tool Material
	public static final Item.ToolMaterial occultToolMaterial = EnumHelper.addToolMaterial("occultToolMaterial", 1337, 1337, 10.0F, 3.0F, 30);
	
	//Add Items
	public static Item occultIngot = new OccultModItem().setUnlocalizedName("occultIngot").setTextureName("occultmod:occultIngot");
	public static Item occultRod = new OccultModItem().setUnlocalizedName("occultRod").setTextureName("occultmod:occultRod");
	public static Item occultPickaxe = new OccultPickaxe(occultToolMaterial).setUnlocalizedName("occultPickaxe").setTextureName("occultmod:occultPickaxe");
	
	public static void init()
	{
		RegisterHelper.registerItem(occultIngot);
		RegisterHelper.registerItem(occultPickaxe);
		RegisterHelper.registerItem(occultRod);
	}
}
