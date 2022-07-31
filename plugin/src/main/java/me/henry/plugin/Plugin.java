package me.henry.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;



public final class Plugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[dupe-Plugin]" + "plugin enabled");
        getCommand("heal").setExecutor(new TotCommands());
        getCommand("dupe").setExecutor(new TotCommands());
        getCommand("feed").setExecutor(new TotCommands());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "[dupe-Plugin]" + "bye -kingofhenz#3817");
    }
}
