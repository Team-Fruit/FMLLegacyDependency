package cpw.mods.fml.common.event;

import java.io.File;

import org.apache.logging.log4j.Logger;

public interface FMLPreInitializationEvent extends FMLStateEvent {
	public File getSourceFile();

	public File getSuggestedConfigurationFile();

	public Logger getModLog();
}