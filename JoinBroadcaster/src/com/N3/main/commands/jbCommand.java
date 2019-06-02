package com.N3.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class jbCommand extends JavaPlugin implements CommandExecutor {

	// This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command jbCommand, String jb, String[] reload) {
    	  if (sender instanceof Player) {
              Player player = (Player) sender;
              this.saveDefaultConfig();
              this.reloadConfig();
              this.getConfig();
              sender.sendMessage("Reload Complete");
          }

          // If the player (or console) uses our command correct, we can return true
          return true;
    }
}
