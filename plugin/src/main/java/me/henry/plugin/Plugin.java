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
    public boolean onCommand(CommandSender sender,Command cmd,String label,  String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            
        }
}
