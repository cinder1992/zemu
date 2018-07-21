package com.nray.zemu.component;
import org.json.*;

public final class ComponentFactory {
	public static Component createComponent(JSONObject Component) {
		JSONObject ComponentData;
		try {
			ComponentData = Component.getJSONObject("ComponentData");
		}
		catch (JSONException e) {
			throw e;
		}
		switch (Component.getString("Type").toUpperCase()) {
			case "RAM":
				return new Ram(ComponentData);
				
			case "ROM":
				return new Rom(ComponentData);

			default:
				return null;
		}
	}
}
