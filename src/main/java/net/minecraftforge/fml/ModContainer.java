package net.minecraftforge.fml;

import net.minecraftforge.eventbus.api.Event;

public abstract class ModContainer {
	public final String getModId() {
		return null;
	}

	public final String getNamespace() {
		return null;
	}

	public abstract boolean matches(Object mod);

	public abstract Object getMod();

	protected void acceptEvent(final Event e) {
	}
}