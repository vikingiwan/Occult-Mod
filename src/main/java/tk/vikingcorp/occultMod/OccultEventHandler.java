package tk.vikingcorp.occultMod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OccultEventHandler
{
	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event)
	{
		EntityLivingBase base = event.entityLiving;

		if(base.getEquipmentInSlot(4) != null && base.getEquipmentInSlot(4).getItem() == ModItems.occultCrown)
		{
			event.setCanceled(true);
		}
	}
}
