package net.minecraftforge.eventbus.api;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = RUNTIME)
@Target(value = METHOD)
public @interface SubscribeEvent {
	EventPriority priority() default EventPriority.NORMAL;

	boolean receiveCanceled() default false;
}
