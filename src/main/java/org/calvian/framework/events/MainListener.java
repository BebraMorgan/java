package org.calvian.framework.events;

import org.bukkit.event.Listener;
import org.calvian.framework.Framework;

import static org.bukkit.Bukkit.getServer;

public class MainListener{

    public MainListener(){
        getServer().getPluginManager().registerEvents(new EnchantListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new EntityListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new HangingListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new InventoryListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new VehicleListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new WeatherListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new WorldListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new BlockListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new ServerListener(), Framework.getInstance());
        getServer().getPluginManager().registerEvents(new PlayerListener(), Framework.getInstance());
    }

}
