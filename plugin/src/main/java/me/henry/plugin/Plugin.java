package me.henry.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.HumanEntity;

public final class Plugin extends JavaPlugin implements Listener {
 @Override
    public boolean onCommand(CommandSender sender,Command cmd,String label,  String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            
        }
}
