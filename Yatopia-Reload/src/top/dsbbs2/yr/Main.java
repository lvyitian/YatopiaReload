package top.dsbbs2.yr;

/*import java.lang.reflect.Field;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.SimpleCommandMap;*/
import org.bukkit.plugin.java.JavaPlugin;

//@SuppressWarnings("unchecked")
public final class Main extends JavaPlugin {
	/*public static final Map<String, Command> mp;
	public static final Command origin;*/
	public static final String origin;
	static {
		origin=System.getProperty("Yatopia.DisableReloadCommand", "true");
		System.setProperty("Yatopia.DisableReloadCommand", "false");
		/*try {
			Server s = Bukkit.getServer();
			Field pwq = s.getClass().getDeclaredField("commandMap");
			pwq.setAccessible(true);
			Object m = pwq.get(s);
			Field c = SimpleCommandMap.class.getDeclaredField("knownCommands");
			c.setAccessible(true);
			mp = (Map<String, Command>) c.get(m);
			origin = mp.get("bukkit:reload");
			mp.put("bukkit:reload", new ReloadCommand("reload"));
		} catch (Throwable e) {
			if (e instanceof RuntimeException)
				throw (RuntimeException) e;
			else if (e instanceof Error)
				throw (Error) e;
			else
				throw new RuntimeException(e);
		}*/
	}

	@Override
	public void onEnable() {
		System.setProperty("Yatopia.DisableReloadCommand", "false");
	}

	@Override
	public void onLoad() {
		System.setProperty("Yatopia.DisableReloadCommand", "false");
	}

	@Override
	public void onDisable() {
		//mp.put("bukkit:reload", origin);
		System.setProperty("Yatopia.DisableReloadCommand",origin);
	}
}
