package net.minecraftforge.fml;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

import net.minecraftforge.api.distmarker.Dist;

public final class DistExecutor {
	private DistExecutor() {
	}

	public static <T> T callWhenOn(final Dist dist, final Supplier<Callable<T>> toRun) {
		return null;
	}

	public static void runWhenOn(final Dist dist, final Supplier<Runnable> toRun) {
	}

	public static <T> T runForDist(final Supplier<Supplier<T>> clientTarget, final Supplier<Supplier<T>> serverTarget) {
		throw new IllegalArgumentException("UNSIDED?");
	}
}