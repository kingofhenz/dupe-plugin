package me.henry.plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("helo");
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onPlayerJoin(PlayerJoinEvent event){

        event.setJoinMessage("fag");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("bye");
    }
}
