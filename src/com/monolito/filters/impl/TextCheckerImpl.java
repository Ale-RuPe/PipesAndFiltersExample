package com.monolito.filters.impl;

import java.util.Arrays;

import com.monolito.filters.TextChecker;

public class TextCheckerImpl implements TextChecker<String, String[], Boolean>{

	@Override
	public String messageToLower(String message) {
		return message.toLowerCase();
	}
	
	@Override
	public Boolean textChecker(String text, String[] fWords) {
		return Arrays.stream(fWords).noneMatch(text::contains);
	}

}
