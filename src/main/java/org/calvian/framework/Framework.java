package org.calvian.framework;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.calvian.framework.events.*;

import static org.bukkit.Bukkit.getServer;

public final class Framework extends JavaPlugin {

    public static Framework instance;
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        config = getConfig();
        instance = this;
        new MainListener();

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Framework getInstance(){
        return instance;
    }




}
