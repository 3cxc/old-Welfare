package welfare.welfare.event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class GithubGui implements Listener {
    @EventHandler
    public void Githubgui(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单"))//防止拿走了物品
            event.setCancelled(true);
        try {
            if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.CRAFTING_TABLE)) {
                if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.sendMessage(ChatColor.AQUA + "想要告诉我们插件的问题？");
                    player.sendMessage(ChatColor.AQUA + "访问下面的网址来给我们提出建议吧！");
                    player.sendMessage(ChatColor.AQUA + "https://github.com/3cxc/Welfare");
                }
            }
        } catch (NullPointerException ignored) {

        }
    }
}
