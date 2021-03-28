package sciencemj.sciencemj;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class mainEvent implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        if (e.isDropItems()){
            Random r = new Random();
            e.getBlock().getDrops().clear();
            e.getBlock().getDrops().add(new ItemStack(Material.values()[r.nextInt(Material.values().length) - 1], r.nextInt(32)));
        }
    }
}
