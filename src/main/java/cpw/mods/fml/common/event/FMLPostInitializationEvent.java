package cpw.mods.fml.common.event;

import java.util.Optional;

public abstract class FMLPostInitializationEvent extends FMLStateEvent {
	public abstract Optional<?> buildSoftDependProxy(String modId, String className, Object... arguments);
}