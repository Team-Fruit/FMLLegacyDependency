package net.minecraftforge.fml.common.event;

import cpw.mods.fml.common.event.FMLEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.fml.common.LoaderState;

public abstract class FMLStateEvent extends FMLEvent {
	public FMLStateEvent(final Object... data) {
	}

	public abstract LoaderState.ModState getModState();

	public Side getSide() {
		return null;
	}
}