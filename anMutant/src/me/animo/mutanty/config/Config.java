package me.animo.mutanty.config;

import java.util.List;

import org.bukkit.Material;

import me.animo.mutant.Main;

public class Config {
	
	public static String MUTANTNAME;
	public static List<String> MUTANTLORE;
	public static Integer SILA_TIME;
	public static Integer APS_TIME;
	public static Integer REGEN_TIME;
	public static Integer FIRE_TIME;
	public static Integer SPEED_TIME;
	public static Integer SILA_MOC;
	public static Integer APS_MOC;
	public static Integer REGEN_MOC;
	public static Integer FIRE_MOC;
	public static Integer SPEED_MOC;
	public static Material CRAFT_1;
	public static Material CRAFT_2;
	public static Material CRAFT_3;
	public static Material CRAFT_4;
	public static Material CRAFT_5;
	public static Material CRAFT_6;
	public static Material CRAFT_7;
	public static Material CRAFT_8;
	public static Material CRAFT_9;
	
	public static void load() {
		Config.MUTANTNAME = Main.getInst().getConfig().getString("mutant.name");
		Config.MUTANTLORE = Main.getInst().getConfig().getStringList("mutant.lore");
		Config.SILA_TIME = Main.getInst().getConfig().getInt("sila.czas");
		Config.APS_TIME = Main.getInst().getConfig().getInt("aps.czas");
		Config.FIRE_TIME = Main.getInst().getConfig().getInt("fire.czas");
		Config.SPEED_TIME = Main.getInst().getConfig().getInt("speed.czas");
		Config.REGEN_TIME = Main.getInst().getConfig().getInt("regen.czas");
		Config.SILA_MOC = Main.getInst().getConfig().getInt("sila.moc");
		Config.APS_MOC = Main.getInst().getConfig().getInt("aps.moc");
		Config.FIRE_MOC = Main.getInst().getConfig().getInt("fire.moc");
		Config.SPEED_MOC = Main.getInst().getConfig().getInt("speed.moc");
		Config.CRAFT_1 = Material.valueOf(Main.getInst().getConfig().getString("crafting.1"));
		Config.CRAFT_2 = Material.valueOf(Main.getInst().getConfig().getString("crafting.2"));
		Config.CRAFT_3 = Material.valueOf(Main.getInst().getConfig().getString("crafting.3"));
		Config.CRAFT_4 = Material.valueOf(Main.getInst().getConfig().getString("crafting.4"));
		Config.CRAFT_5 = Material.valueOf(Main.getInst().getConfig().getString("crafting.5"));
		Config.CRAFT_6 = Material.valueOf(Main.getInst().getConfig().getString("crafting.6"));
		Config.CRAFT_7 = Material.valueOf(Main.getInst().getConfig().getString("crafting.7"));
		Config.CRAFT_8 = Material.valueOf(Main.getInst().getConfig().getString("crafting.8"));
		Config.CRAFT_9 = Material.valueOf(Main.getInst().getConfig().getString("crafting.9"));
		Config.REGEN_MOC = Main.getInst().getConfig().getInt("regen.moc");
		
	}

}
