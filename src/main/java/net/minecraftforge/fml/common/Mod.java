package net.minecraftforge.fml.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mod {
	String value() default "";

	String modid() default "";

	String name() default "";

	String version() default "";

	String guiFactory() default "";

	String updateJSON() default "";

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	public @interface Instance {
		String value() default "";

		String owner() default "";
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.METHOD })
	public @interface EventHandler {
	}
}