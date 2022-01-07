package dev.norska.go;

import org.bukkit.plugin.java.JavaPlugin;

public class GappleOptions extends JavaPlugin {
	
	private static GappleOptions instance;
	
	public GappleOptions() { instance = this; }

	public static GappleOptions getInstance() { return instance; }

}