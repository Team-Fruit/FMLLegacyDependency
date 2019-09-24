package net.minecraftforge.fml.common.event;

import java.util.Optional;

import net.minecraftforge.fml.common.LoaderState;

public class FMLPostInitializationEvent extends FMLStateEvent {
	public FMLPostInitializationEvent(final Object... data) {
		super(data);
	}

	@Override
	public LoaderState.ModState getModState() {
		return null;
	}

	public Optional<?> buildSoftDependProxy(final String modId, final String className, final Object... arguments) {
		return Optional.empty();
	}
}