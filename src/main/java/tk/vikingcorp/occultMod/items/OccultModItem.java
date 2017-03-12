package tk.vikingcorp.occultMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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

