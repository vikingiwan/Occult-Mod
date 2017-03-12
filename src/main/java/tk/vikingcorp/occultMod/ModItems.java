package tk.vikingcorp.occultMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import tk.vikingcorp.occultMod.armor.OccultArmor;
import tk.vikingcorp.occultMod.assist.RegisterHelper;
import tk.vikingcorp.occultMod.items.OccultModItem;
import tk.vikingcorp.occultMod.items.OccultPickaxe;

public class ModItems
{
	//Tool Material
	public static final Item.ToolMaterial occultToolMaterial = EnumHelper.addToolMaterial("occultToolMaterial", 1337, 1337, 10.0F, 3.0F, 30);
	
	//Armour Material
	public static final ItemArmor.ArmorMaterial occultArmorMaterial = EnumHelper.addArmorMaterial("occultArmorMaterial", 1000000, new int[]{1000000,1000000,1000000,1000000}, 30);
	
	//Add Items
	
	//Crafting Items
	public static Item occultIngot = new OccultModItem().setUnlocalizedName("occultIngot").setTextureName("occultmod:occultIngot");
	public static Item occultRod = new OccultModItem().setUnlocalizedName("occultRod").setTextureName("occultmod:occultRod");
	
	//Tools
	public static Item occultPickaxe = new OccultPickaxe(occultToolMaterial).setUnlocalizedName("occultPickaxe").setTextureName("occultmod:occultPickaxe");
	
	//Armor
	public static Item occultCrown = new OccultArmor(occultArmorMaterial, 0, 0).setUnlocalizedName("occultCrown").setTextureName("occultmod:occultCrown");
	public static Item occultBoots = new OccultArmor(occultArmorMaterial, 0, 3).setUnlocalizedName("occultBoots").setTextureName("occultMod:occultBoots");
	
	public static void init()
	{
		RegisterHelper.registerItem(occultIngot);
		RegisterHelper.registerItem(occultPickaxe);
		RegisterHelper.registerItem(occultRod);
		RegisterHelper.registerItem(occultCrown);
		RegisterHelper.registerItem(occultBoots);
	}
}
