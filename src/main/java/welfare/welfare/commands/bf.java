package welfare.welfare.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class bf implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
                player.sendMessage(ChatColor.BLUE + "你获得了福利");
                ItemStack bf_item = new ItemStack(Material.COAL);//给予福利
                player.getInventory().addItem(bf_item);
        }else {
            System.out.println(ChatColor.RED + "只有玩家可以执行");
        }

        return false;
    }
}
