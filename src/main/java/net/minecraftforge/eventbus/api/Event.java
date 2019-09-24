package net.minecraftforge.eventbus.api;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Objects;

public class Event {
	@Retention(value = RUNTIME)
	@Target(value = TYPE)
	public @interface HasResult {
	}

	public enum Result {
		DENY,
		DEFAULT,
		ALLOW
	}

	private boolean isCanceled = false;
	private Result result = Result.DEFAULT;
	private EventPriority phase = null;

	public Event() {
		setup();
	}

	public boolean isCancelable() {
		return false;
	}

	public boolean isCanceled() {
		return this.isCanceled;
	}

	public void setCanceled(final boolean cancel) {
		if (!isCancelable())
			throw new UnsupportedOperationException(
					"Attempted to call Event#setCanceled() on a non-cancelable event of type: "
							+this.getClass().getCanonicalName());
		this.isCanceled = cancel;
	}

	public boolean hasResult() {
		return false;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(final Result value) {
		this.result = value;
	}

	@Deprecated
	protected void setup() {
	}

	public EventPriority getPhase() {
		return this.phase;
	}

	public void setPhase(final EventPriority value) {
		Objects.requireNonNull(value, "setPhase argument must not be null");
		final int prev = this.phase==null ? -1 : this.phase.ordinal();
		if (prev>=value.ordinal())
			throw new IllegalArgumentException("Attempted to set event phase to "+value+" when already "+this.phase);
		this.phase = value;
	}
}
