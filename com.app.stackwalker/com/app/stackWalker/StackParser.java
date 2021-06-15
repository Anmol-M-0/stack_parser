package com.app.stackWalker;

import java.util.stream.Stream;

import com.app.multi.StackInfo;
import static java.util.stream.Collectors.*;

public class StackParser implements StackInfo {

	@Override
	public String getStackCount() {
		return "java 9 " + StackWalker.getInstance()
										.walk(Stream::count);
	}

	@Override
	public String getStack() {
		return StackWalker.getInstance()
							.walk(frames->frames.map(Object::toString)
									.collect(joining("\n")));
	}

}
