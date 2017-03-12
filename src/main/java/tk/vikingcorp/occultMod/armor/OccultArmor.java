package tk.vikingcorp.occultMod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import tk.vikingcorp.occultMod.ModItems;
import tk.vikingcorp.occultMod.assist.LogHelper;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultArmor extends ItemArmor {

	public OccultArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
		this.setCreativeTab(RegisterHelper.tabOccultMod);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "occultmod:textures/models/armor/occultArmor_1.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    //Apply nightvision if wearing OccultCrown
		if (itemStack.getItem() == ModItems.occultCrown) {
	        effectPlayer(player, Potion.nightVision, 0);
	    }
		
		//Allow flight if wearing occultBoots
		if (!player.capabilities.isCreativeMode){
			
			if (player.getEquipmentInSlot(1) != null && player.getEquipmentInSlot(1).getItem() == ModItems.occultBoots){
				player.capabilities.allowFlying = true;
			}
			else{
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
			}
		}
		
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier)
	{
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 200)
	        player.addPotionEffect(new PotionEffect(potion.id, 400, amplifier, true));
	}
	
}
