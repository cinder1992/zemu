package com.nray.zemu.component;
import org.json.*;

public class Ram implements Component {
	private int contents[];
	
	public Ram(JSONObject ComponentData) {
		this.contents = new int[(int) ComponentData.getNumber("Size")];
	}
	
	@Override
	public void write(int val, int address) {
		this.contents[address] = val;
	}

	@Override
	public int read(int address) {
		return this.contents[address];
	}

}
