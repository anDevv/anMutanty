package me.animo.mutanty.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.animo.mutanty.config.Config;
import me.animo.mutanty.utils.Util;

public class Eat implements Listener{
	
	
	@EventHandler
	public void eat(PlayerItemConsumeEvent e) {
		Player p = e.getPlayer();
		if (e.getItem().getType().equals(Material.GOLDEN_APPLE)) {
			ItemMeta m = e.getItem().getItemMeta();
			if (m.getDisplayName().equals(Util.fix(Config.MUTANTNAME)) || m.getLore().equals(Util.fix(Config.MUTANTLORE))) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20*Config.APS_TIME, Config.APS_MOC));
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20*Config.SILA_TIME, Config.SILA_MOC));
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20*Config.REGEN_TIME, Config.REGEN_MOC));
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20*Config.FIRE_TIME, Config.FIRE_MOC));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*Config.SPEED_TIME, Config.SPEED_MOC));
				ItemStack toRemove = new ItemStack(e.getItem().clone());
				toRemove.setAmount(1);
				p.getInventory().removeItem(toRemove);
			}
		}
		
	}

}
