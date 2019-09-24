package net.minecraftforge.fml.javafmlmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;

public class FMLModContainer extends ModContainer {
	@Override
	public boolean matches(final Object mod) {
		return false;
	}

	@Override
	public Object getMod() {
		return null;
	}

	public IEventBus getEventBus() {
		return null;
	}
}