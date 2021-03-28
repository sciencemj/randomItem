package sciencemj.sciencemj;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new mainEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
