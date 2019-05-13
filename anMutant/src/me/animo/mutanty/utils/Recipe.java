package me.animo.mutanty.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import me.animo.mutanty.config.Config;

public class Recipe {
	
    public static ItemStack getItem() {
        ItemStack mutant = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta meta = mutant.getItemMeta();
        meta.setDisplayName(Util.fix(Config.MUTANTNAME));
        meta.setLore(Util.fix(Config.MUTANTLORE));
        mutant.setItemMeta((ItemMeta)meta);
        return mutant;
    }
	    
	    @SuppressWarnings("deprecation")
		public static void initRecipe() {
	        final ShapedRecipe recipe = new ShapedRecipe(getItem());
	        recipe.shape(new String[] { "qwe", "rty", "uio" });
	        recipe.setIngredient('q', Config.CRAFT_1);
	        recipe.setIngredient('w', Config.CRAFT_2);
	        recipe.setIngredient('e', Config.CRAFT_3);
	        recipe.setIngredient('r', Config.CRAFT_4);
	        recipe.setIngredient('t', Config.CRAFT_5);
	        recipe.setIngredient('y', Config.CRAFT_6);
	        recipe.setIngredient('u', Config.CRAFT_7);
	        recipe.setIngredient('i', Config.CRAFT_8);
	        recipe.setIngredient('o', Config.CRAFT_9);
	        Bukkit.addRecipe((org.bukkit.inventory.Recipe)recipe);
	    }
	
}
	
