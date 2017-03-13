package tk.vikingcorp.occultMod.assist;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import tk.vikingcorp.occultMod.Achievements;
import tk.vikingcorp.occultMod.ModBlocks;
import tk.vikingcorp.occultMod.ModItems;
import tk.vikingcorp.occultMod.OccultWorldGen;

public class RegisterHelper
{
	
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRecipes()
	{
		//Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.occultOre, new ItemStack(ModItems.occultIngot), 2.0F);
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.occultBlock), new Object[]{
		    	"III",
		    	"III",
		    	"III",
		    	'I', ModItems.occultIngot
		    	});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.occultRod), new Object[]{
				"  I",
				" S ",
				"I  ",
				'I', ModItems.occultIngot,
				'S', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.occultPickaxe), new Object[]{
				" II",
				" RI",
				"R  ",
				'I', ModItems.occultIngot,
				'R', ModItems.occultRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.occultCrown), new Object[]{
				"BEB",
				"ISI",
				"BIB",
				'I', ModItems.occultIngot,
				'B', ModBlocks.occultBlock,
				'E', Blocks.dragon_egg,
				'S', Items.nether_star
		});
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.occultIngot, 9), new Object[]
		{
		    	new ItemStack(ModBlocks.occultBlock)
		});
		
	}
	
	public static void registerWorldGen()
	{
		GameRegistry.registerWorldGenerator(new OccultWorldGen(), 0);
	}
	
	public static CreativeTabs tabOccultMod = new CreativeTabs("tabOccultMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(ModItems.occultIngot).getItem();
		}
	};
	
	public static void registerAchievements(){
		AchievementPage.registerAchievementPage(new AchievementPage("Occult Achievements", new Achievement[] {Achievements.achievementBecomeGodlike}));
		Achievements.achievementBecomeGodlike.registerStat();
	}
}
