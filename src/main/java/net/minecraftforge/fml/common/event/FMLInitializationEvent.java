package net.minecraftforge.fml.common.event;

import cpw.mods.fml.common.event.FMLStateEvent;
import net.minecraftforge.fml.common.LoaderState;

public class FMLInitializationEvent extends FMLStateEvent {
	public FMLInitializationEvent(final Object... data) {
	}

	public LoaderState.ModState getModState() {
		return null;
	}
}