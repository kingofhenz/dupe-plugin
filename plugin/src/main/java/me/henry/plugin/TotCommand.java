package me.henry.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TotCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command cmd,String label,  String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
        }
        if (cmd.getName().equalsIgnoreCase("heal")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setHealth(20);
            }

        }
        if (cmd.getName().equalsIgnoreCase("dupe")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.getInventory().addItem(player.getItemInHand());
            }

            if (cmd.getName().equalsIgnoreCase("feed")){
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    player.setSaturation(20);
                }
            }
        }
        return true;
    }
}
