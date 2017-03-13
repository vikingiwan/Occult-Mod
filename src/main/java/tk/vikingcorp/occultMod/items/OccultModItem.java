package tk.vikingcorp.occultMod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tk.vikingcorp.occultMod.ModItems;
import tk.vikingcorp.occultMod.assist.RegisterHelper;

public class OccultModItem extends Item
{
	public OccultModItem()
	{
		super();
		setCreativeTab(RegisterHelper.tabOccultMod);	
	}
	
	
	/*
	 *SAVE FOR LATER 
	 *
	public void addInformation(ItemStack itemstack, EntityPlayer player, List itemInfo, boolean par4)
	{
			itemInfo.add("§7A godly relic of the past that's rumored to make you invincible");
	}
	
	 @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
		double curX = player.posX;
		double curY = player.posY;
		double curZ = player.posZ;
		return itemStack;
    	
    }
    */
	
}

