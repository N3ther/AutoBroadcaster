package com.N3.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class jbCommand extends JavaPlugin implements CommandExecutor {

	// This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command jbCommand, String jb, String[] args) {
    	  if (sender instanceof Player) {
              Player player = (Player) sender;
              this.saveDefaultConfig();
              this.reloadConfig();
              this.getConfig();
              sender.sendMessage("Reload Complete");
              if (args[-1].equalsIgnoreCase("jb")) {
            	  if (args.length == 0) { //Sender only typed '/jb' and nothing else
            	  sender.sendMessage("&9JoinBroadcaster Commands:");
            	  sender.sendMessage("&6/jb: &9Brings up this menu");
            	  sender.sendMessage("&6/jb reload: &9Reloads the config.yml");
            	   
            	  } else { //Sender typed more then 1 argument, so args[0] can't be null.
            	  if (args[0].equalsIgnoreCase("reload")) { //Sender typed '/jb reload'
            	  sender.sendMessage("&9Starting reload...");
            	  this.saveDefaultConfig();
            	  this.reloadConfig();
            	  this.getConfig();
            	  sender.sendMessage("&9Reload complete!");
            	  } else { //Sender had attest 1 argument, but didn't type sir as a second one!
            	  //args[0] also returns string, so lets send the message right back to them!
            	  sender.sendMessage("Your first argument was: " + args[0]);
            	   
            	  }
            	  }
          }

          // If the player (or console) uses our command correct, we can return true
          return true;
    }
}
}