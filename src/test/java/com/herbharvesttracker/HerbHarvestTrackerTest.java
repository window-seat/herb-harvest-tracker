package com.herbharvesttracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HerbHarvestTrackerTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HerbHarvestTrackerPlugin.class);
		RuneLite.main(args);
	}
}