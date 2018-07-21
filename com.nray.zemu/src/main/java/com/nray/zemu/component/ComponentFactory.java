package com.nray.zemu.component;
import org.json.*;

public final class ComponentFactory {
	public static Component createComponent(JSONObject Component) {
		JSONObject ComponentData = Component.getJSONObject("ComponentData");
		switch (Component.getString("Type").toUpperCase()) {
			case "RAM":
				return new Ram(ComponentData);

			default:
				return null;
		}
	}
}
