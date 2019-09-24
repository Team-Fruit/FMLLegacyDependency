package net.minecraftforge.fml.event.lifecycle;

import java.util.function.Predicate;
import java.util.stream.Stream;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModContainer;

public class ModLifecycleEvent extends Event {
	private final ModContainer container;

	public ModLifecycleEvent(final ModContainer container) {
		this.container = container;
	}

	public final String description() {
		final String cn = getClass().getName();
		return cn.substring(cn.lastIndexOf('.')+1);
	}

	public Stream<InterModComms.IMCMessage> getIMCStream() {
		return InterModComms.getMessages(this.container.getModId());
	}

	public Stream<InterModComms.IMCMessage> getIMCStream(final Predicate<String> methodFilter) {
		return InterModComms.getMessages(this.container.getModId(), methodFilter);
	}

	@Override
	public String toString() {
		return description();
	}
}