package net.minecraftforge.fml.javafmlmod;

import net.minecraftforge.eventbus.api.IEventBus;

public class FMLJavaModLoadingContext {
	private final FMLModContainer container;

	FMLJavaModLoadingContext(final FMLModContainer container) {
		this.container = container;
	}

	public IEventBus getModEventBus() {
		return this.container.getEventBus();
	}

	public static FMLJavaModLoadingContext get() {
		return null;
	}
}