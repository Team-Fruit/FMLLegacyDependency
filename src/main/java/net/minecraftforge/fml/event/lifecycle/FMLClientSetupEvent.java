package net.minecraftforge.fml.event.lifecycle;

import net.minecraftforge.fml.ModContainer;

public class FMLClientSetupEvent extends ModLifecycleEvent {
	public FMLClientSetupEvent(final ModContainer container) {
		super(container);
	}
}