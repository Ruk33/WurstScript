package de.peeeq.wurstscript.utils;

public class LineOffsets {
	int[] offsets = new int[128];
	int maxLine = 0;
	
	public final static LineOffsets dummy = new LineOffsets();
	
	
	public void set(int line, int offset) {
		maxLine = Math.max(line, maxLine);
		if (line >= offsets.length) {
			int[] offsets2 = new int[offsets.length*2];
			System.arraycopy(offsets, 0, offsets2, 0, offsets.length);
			offsets = offsets2;
		}
		offsets[line] = offset;
	}

	public int get(int line) {
		while (line >= 0 && offsets[line] == 0) {
			line--;
		}
		if (line >= 0) {
			return offsets[line];
		} else {
			return 0;
		}
	}
	
	public int getLine(int offset) {
		int min = 0;
		int max = maxLine;
		while (min < max) {
			int test = (min + max) / 2;
			int v = get(test);
			if (v < offset) {
				if (min == test) {
					min++;
				} else {
					min = test;
				}
			} else {
				max = test;
			}
		}
		return min;
	}
}