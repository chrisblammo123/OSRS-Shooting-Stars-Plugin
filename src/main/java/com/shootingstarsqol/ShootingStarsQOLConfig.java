package com.shootingstarsqol;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("shootingstarsqol")
public interface ShootingStarsQOLConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}

	@ConfigItem(
		keyName = "settingsMaybe",
		name = "elementName",
		description = "test hover test test"
	)
	default boolean box()
	{
		return true;
	}


}