package com.N3.main;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import com.N3.events.JoinMsg;
import com.N3.main.commands.jbCommand;

public class Main extends JavaPlugin {

FileConfiguration config = this.getConfig();

	@Override
	public void onEnable() {
		//generates the config
		this.saveDefaultConfig();
		config.addDefault("message", "Welcome to the server, event.getPlayer().getName()!");
		config.addDefault("newPlayerMessage", "Hello, and welcome to the server! Please do /rules and read them carefully!");
		config.addDefault("autoUpdate", true);
		config.addDefault("updateDevVersions", false);
		//registers the JoinMsg event
		getServer().getPluginManager().registerEvents(new JoinMsg(), this);
		//gets the config
		this.getConfig();
		this.getCommand("jb reload").setExecutor(new jbCommand());
	}

	
	@Override
	public void onDisable() {
		
	}
}
