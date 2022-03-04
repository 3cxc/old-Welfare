package welfare.welfare;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Objects;

public class welguihub {
    public  static  void main_gui(Player player){
        //新建物品栏（GUI）
        Inventory welgui = Bukkit.createInventory(player,9, ChatColor.BLUE+"菜单");

        //新建物品

        //旧福利
        ItemStack zgui_bf_item = new ItemStack(Material.COAL);
        ItemMeta zgui_bf_item_meta = zgui_bf_item.getItemMeta();
        Objects.requireNonNull(zgui_bf_item_meta).setDisplayName(ChatColor.BLUE+"免费福利(旧)");
        ArrayList<String> zgui_bf_item_lore = new ArrayList<>();
        zgui_bf_item_lore.add(ChatColor.AQUA+"点我获得免费福利");
        zgui_bf_item_lore.add(ChatColor.AQUA+"这些煤应该足够你用了");
        zgui_bf_item_meta.setLore(zgui_bf_item_lore);
        zgui_bf_item.setItemMeta(zgui_bf_item_meta);

        //新福利
        ItemStack zgui_bfnew_item = new ItemStack(Material.COAL_BLOCK);
        ItemMeta zgui_bfnew_item_meta = zgui_bfnew_item.getItemMeta();
        Objects.requireNonNull(zgui_bfnew_item_meta).setDisplayName(ChatColor.BLUE+"免费福利(新)");
        ArrayList<String> zgui_bfnew_item_lore = new ArrayList<>();
        zgui_bfnew_item_lore.add(ChatColor.AQUA+"点我获得免费福利");
        zgui_bfnew_item_lore.add(ChatColor.AQUA+"这些煤应该足够你用了");
        zgui_bfnew_item_meta.setLore(zgui_bfnew_item_lore);
        zgui_bfnew_item.setItemMeta(zgui_bfnew_item_meta);

        //音乐
        ItemStack zgui_music_item = new ItemStack(Material.JUKEBOX);
        ItemMeta zgui_music_item_meta = zgui_music_item.getItemMeta();
        Objects.requireNonNull(zgui_music_item_meta).setDisplayName(ChatColor.BLUE+"音乐");
        ArrayList<String> zgui_music_item_lore = new ArrayList<>();
        zgui_music_item_lore.add(ChatColor.AQUA+"点我下载音乐材质包");
        zgui_music_item_lore.add(ChatColor.AQUA+"注：由BUGgugu制作");
        zgui_music_item_meta.setLore(zgui_music_item_lore);
        zgui_music_item.setItemMeta(zgui_music_item_meta);

        //彩蛋
        ItemStack zgui_404_item = new ItemStack(Material.BRICK);
        ItemMeta zgui_404_item_meta = zgui_404_item.getItemMeta();
        Objects.requireNonNull(zgui_404_item_meta).setDisplayName(ChatColor.RED+"自杀(假的)");
        ArrayList<String> zgui_404_item_lore = new ArrayList<>();
        zgui_404_item_lore.add(ChatColor.RED+"顾名思义");
        zgui_404_item_meta.setLore(zgui_404_item_lore);
        zgui_404_item.setItemMeta(zgui_404_item_meta);

        //Github
        ItemStack zgui_Git_item = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta zgui_Git_item_meta = zgui_Git_item.getItemMeta();
        Objects.requireNonNull(zgui_Git_item_meta).setDisplayName(ChatColor.AQUA+"我们的Github");
        ArrayList<String> zgui_Git_item_lore = new ArrayList<>();
        zgui_Git_item_lore.add(ChatColor.AQUA+"想要告诉我们插件的问题？");
        zgui_Git_item_lore.add(ChatColor.AQUA+"点我访问Github来提出建议吧！");
        zgui_Git_item_meta.setLore(zgui_Git_item_lore);
        zgui_Git_item.setItemMeta(zgui_Git_item_meta);

        //版本
        ItemStack zgui_ver_item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta zgui_ver_item_meta = zgui_ver_item.getItemMeta();
        Objects.requireNonNull(zgui_ver_item_meta).setDisplayName(ChatColor.AQUA+"插件版本");
        ArrayList<String> zgui_ver_item_lore = new ArrayList<>();
        zgui_ver_item_lore.add(ChatColor.AQUA+"插件当前版本：6.4");
        zgui_ver_item_lore.add(ChatColor.AQUA+"点我查看更新日志");
        zgui_ver_item_meta.setLore(zgui_ver_item_lore);
        zgui_ver_item.setItemMeta(zgui_ver_item_meta);

        //

        //设置物品
        welgui.setItem(0,zgui_bf_item);
        welgui.setItem(1,zgui_bfnew_item);
        welgui.setItem(2,zgui_music_item);
        welgui.setItem(3,zgui_404_item);
        welgui.setItem(4,zgui_Git_item);
        welgui.setItem(5,zgui_ver_item);

        //打开物品栏
        player.openInventory(welgui);
    }
    public static void confirm_bf_gui(Player player){//旧 福利 的确认GUI
        //新建旧 福利 物品栏（GUI）
        Inventory confirm_bf_Gui = Bukkit.createInventory(player,9, ChatColor.AQUA+"你确认要得到煤吗？");

        //旧 福利 确认
        ItemStack confirm_bf_item = new ItemStack(Material.EMERALD);
        ItemMeta confirm_bf_meta = confirm_bf_item.getItemMeta();
        Objects.requireNonNull(confirm_bf_meta).setDisplayName(ChatColor.GREEN + "确认");
        confirm_bf_item.setItemMeta(confirm_bf_meta);

        //旧 福利 取消
        ItemStack cancel_bf_item = new ItemStack(Material.BARRIER);
        ItemMeta cancel_bf_meta = cancel_bf_item.getItemMeta();
        Objects.requireNonNull(cancel_bf_meta).setDisplayName(ChatColor.RED + "取消");
        cancel_bf_item.setItemMeta(cancel_bf_meta);

        //设置旧 福利 物品
        confirm_bf_Gui.setItem(3,confirm_bf_item);
        confirm_bf_Gui.setItem(5,cancel_bf_item);

        //打开旧 福利 物品栏
        player.openInventory(confirm_bf_Gui);
    }
    public static void confirm_bfnew_gui(Player player){//新 福利 的确认GUI
        //新建物品栏（GUI）
        Inventory confirm_bfnew_Gui = Bukkit.createInventory(player,9, ChatColor.AQUA+"你确认要得到煤块吗？");

        //新 福利 确认
        ItemStack confirm_bfnew_item = new ItemStack(Material.EMERALD);
        ItemMeta confirm_bfnew_meta = confirm_bfnew_item.getItemMeta();
        Objects.requireNonNull(confirm_bfnew_meta).setDisplayName(ChatColor.GREEN + "确认");
        confirm_bfnew_item.setItemMeta(confirm_bfnew_meta);

        //新 福利 取消
        ItemStack cancel_bfnew_item = new ItemStack(Material.BARRIER);
        ItemMeta cancel_bfnew_meta = cancel_bfnew_item.getItemMeta();
        Objects.requireNonNull(cancel_bfnew_meta).setDisplayName(ChatColor.RED + "取消");
        cancel_bfnew_item.setItemMeta(cancel_bfnew_meta);

        //设置新 福利 物品
        confirm_bfnew_Gui.setItem(3,confirm_bfnew_item);
        confirm_bfnew_Gui.setItem(5,cancel_bfnew_item);

        //打开新 福利 物品栏
        player.openInventory(confirm_bfnew_Gui);
    }
}
