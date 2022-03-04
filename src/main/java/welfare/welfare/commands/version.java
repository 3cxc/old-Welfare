package welfare.welfare.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class version implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;//输出信息
            player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：6.4");//Message可以防止某人刷信息到全服玩家的消息框
            player.sendMessage(ChatColor.AQUA + "更新内容：增加子GUI，优化功能");
        }else {
            System.out.println(ChatColor.BLUE + "Welfare 当前版本：6.4");
            System.out.println(ChatColor.AQUA + "更新内容：更新内容：增加子GUI，优化功能");
        }

        return false;
    }
}
