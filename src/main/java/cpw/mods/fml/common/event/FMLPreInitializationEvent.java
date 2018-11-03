package cpw.mods.fml.common.event;

import java.io.File;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.ModMetadata;

public abstract class FMLPreInitializationEvent extends FMLStateEvent {
	public abstract File getSourceFile();

	public abstract ModMetadata getModMetadata();

	public abstract File getModConfigurationDirectory();

	public abstract File getSuggestedConfigurationFile();

	public abstract Properties getVersionProperties();

	public abstract Logger getModLog();
}