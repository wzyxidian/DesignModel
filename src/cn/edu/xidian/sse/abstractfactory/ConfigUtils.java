package cn.edu.xidian.sse.abstractfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

/**
 * 
 * @author zhiyong wang
 * Ω‚Œˆ≈‰÷√Œƒº˛
 *
 */
public class ConfigUtils {

	private String packages;
	private String database;
	
	
	public String getPackages() {
		return packages;
	}

	public String getDatabase() {
		return database;
	}
	
	public static ConfigUtils getInstance(){
		return new ConfigUtils();
	}
	
	public ConfigUtils(){
		File file = new File("F:\\GitWorkspace\\DesignModel\\src\\cn\\edu\\xidian\\sse\\abstractfactory\\config.properties");
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(file));
			this.packages = p.getProperty("package");
			this.database = p.getProperty("database");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
