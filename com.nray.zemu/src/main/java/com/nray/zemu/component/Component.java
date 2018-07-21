package com.nray.zemu.component;

public interface Component {
	public void write(int val, int address) throws java.lang.ArrayIndexOutOfBoundsException;
	public int read(int address) throws java.lang.ArrayIndexOutOfBoundsException;
}
