package me.henry.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.HumanEntity;

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
