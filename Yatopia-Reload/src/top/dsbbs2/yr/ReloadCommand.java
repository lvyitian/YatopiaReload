package top.dsbbs2.yr;

/*import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.command.defaults.BukkitCommand;

import com.google.common.collect.Lists;

import java.util.*;
*/
public class ReloadCommand //extends BukkitCommand
{
	/*
    public ReloadCommand(final String name) {
        super(name);
        this.description = "Reloads the server configuration and plugins";
        this.usageMessage = "/reload [permissions|commands|confirm]";
        this.setPermission("bukkit.command.reload");
        this.setAliases(Arrays.asList("rl"));
    }
    
    @Override
    public boolean execute(final CommandSender sender, final String currentAlias, final String[] args) {
        if (!this.testPermission(sender)) {
            return true;
        }
        boolean confirmed = System.getProperty("LetMeReload") != null;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("permissions")) {
                Bukkit.getServer().reloadPermissions();
                Command.broadcastCommandMessage(sender, ChatColor.GREEN + "Permissions successfully reloaded.");
                return true;
            }
            if ("commands".equalsIgnoreCase(args[0])) {
                if (Bukkit.getServer().reloadCommandAliases()) {
                    Command.broadcastCommandMessage(sender, ChatColor.GREEN + "Command aliases successfully reloaded.");
                }
                else {
                    Command.broadcastCommandMessage(sender, ChatColor.RED + "An error occurred while trying to reload command aliases.");
                }
                return true;
            }
            if (!"confirm".equalsIgnoreCase(args[0])) {
                Command.broadcastCommandMessage(sender, ChatColor.RED + "Usage: " + this.usageMessage);
                return true;
            }
            confirmed = true;
        }
        if (!confirmed) {
            Command.broadcastCommandMessage(sender, ChatColor.RED + "Are you sure you wish to reload your server? Doing so may cause bugs and memory leaks. It is recommended to restart instead of using /reload. To confirm, please type " + ChatColor.YELLOW + "/reload confirm");
            return true;
        }
        Command.broadcastCommandMessage(sender, ChatColor.RED + "Please note that this command is not supported and may cause issues when using some plugins.");
        Command.broadcastCommandMessage(sender, ChatColor.RED + "If you encounter any issues please use the /stop command to restart your server.");
        Bukkit.reload();
        Command.broadcastCommandMessage(sender, ChatColor.GREEN + "Reload complete.");
        return true;
    }
    
    @Override
    public List<String> tabComplete(final CommandSender sender, final String alias, final String[] args) throws IllegalArgumentException {
        return Lists.newArrayList("commands","permissions");
    }*/
}