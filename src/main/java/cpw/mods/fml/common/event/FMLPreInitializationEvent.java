package cpw.mods.fml.common.event;

import java.io.File;

import org.apache.logging.log4j.Logger;

public abstract class FMLPreInitializationEvent extends FMLStateEvent {
	public abstract File getSourceFile();

	public abstract File getSuggestedConfigurationFile();

	public abstract Logger getModLog();
}