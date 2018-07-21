package com.nray.zemu.core;

public interface Core {
	/**
	 * Runs the core for x clock cycles
	 * @param	cycles	The number of Cycles to run
	 * @return the number of clock cycles actually executed
	 */
	public int run(int cycles);
}
