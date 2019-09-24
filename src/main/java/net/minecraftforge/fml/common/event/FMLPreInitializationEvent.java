package net.minecraftforge.fml.common.event;

import java.io.File;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.ModMetadata;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.LoaderState;

public class FMLPreInitializationEvent extends FMLStateEvent {
	public FMLPreInitializationEvent(final Object... data) {
		super(data);
	}

	@Override
	public LoaderState.ModState getModState() {
		return null;
	}

	public void applyModContainer(final ModContainer activeContainer) {
	}

	public File getSourceFile() {
		return null;
	}

	public ModMetadata getModMetadata() {
		return null;
	}

	public File getModConfigurationDirectory() {
		return null;
	}

	public File getSuggestedConfigurationFile() {
		return null;
	}

	public Properties getVersionProperties() {
		return null;
	}

	public Logger getModLog() {
		return null;
	}
}
