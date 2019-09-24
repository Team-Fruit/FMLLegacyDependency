package net.minecraftforge.fml.relauncher;

public enum Side {
	CLIENT,
	SERVER;

	public boolean isServer() {
		return !isClient();
	}

	public boolean isClient() {
		return this==Side.CLIENT;
	}
}