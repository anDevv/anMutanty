package me.animo.mutant;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.animo.mutanty.config.Config;
import me.animo.mutanty.listener.Eat;
import me.animo.mutanty.utils.Recipe;

public class Main extends JavaPlugin{
	
	public static Main inst;
	
	public static Main getInst() {
		return inst;
		
		
	}
	@Override
	public void onEnable() {
		inst = this;
		saveDefaultConfig();
		Config.load();
		Recipe.initRecipe();
		Bukkit.getPluginManager().registerEvents(new Eat(), this);
	}

}
