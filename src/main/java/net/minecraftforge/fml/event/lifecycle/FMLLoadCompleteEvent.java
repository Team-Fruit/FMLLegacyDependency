package net.minecraftforge.fml.event.lifecycle;

import net.minecraftforge.fml.ModContainer;

public class FMLLoadCompleteEvent extends ModLifecycleEvent {
	public FMLLoadCompleteEvent(final ModContainer container) {
		super(container);
	}
}