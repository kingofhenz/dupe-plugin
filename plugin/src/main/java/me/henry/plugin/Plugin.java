package me.henry.plugin;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[dupe-Plugin]" + "plugin enabled");
        getCommand("dupe").setExecutor(new TotCommands());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.DARK_RED + "[dupe-Plugin]" + "bye -kingofhenz#3817");
    }
}
