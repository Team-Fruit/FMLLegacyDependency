package net.minecraftforge.fml;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InterModComms {
	public static final class IMCMessage {
		private final String modId;
		private final String method;
		private final String senderModId;
		private final Supplier<?> thing;

		IMCMessage(final String senderModId, final String modId, final String method, final Supplier<?> thing) {
			this.senderModId = senderModId;
			this.modId = modId;
			this.method = method;
			this.thing = thing;
		}

		public final String getSenderModId() {
			return this.senderModId;
		}

		public final String getModId() {
			return this.modId;
		}

		public final String getMethod() {
			return this.method;
		}

		@SuppressWarnings("unchecked")
		public final <T> Supplier<T> getMessageSupplier() {
			return (Supplier<T>) this.thing;
		}
	}

	public static boolean sendTo(final String modId, final String method, final Supplier<?> thing) {
		return false;
	}

	public static boolean sendTo(final String senderModId, final String modId, final String method, final Supplier<?> thing) {
		return false;
	}

	public static Stream<IMCMessage> getMessages(final String modId, final Predicate<String> methodMatcher) {
		return null;
	}

	public static Stream<IMCMessage> getMessages(final String modId) {
		return null;
	}
}