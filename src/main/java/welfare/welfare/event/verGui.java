package welfare.welfare.event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class verGui implements Listener {
    @EventHandler
    public void vergui(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单"))//防止拿走了物品
            event.setCancelled(true);
        try {
            if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.ENDER_CHEST)) {
                if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：6.3");//Message可以防止某人刷信息到全服玩家的消息框
                        player.sendMessage(ChatColor.AQUA + "更新内容：修复GUI的一个BUG，新增一个GUI功能");
                }
            }
        } catch (NullPointerException ignored) {

        }
    }
}
