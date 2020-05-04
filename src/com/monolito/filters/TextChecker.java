package com.monolito.filters;

public interface TextChecker<T,W,B> {
	T messageToLower(T message);
	
	B textChecker(T text, W words);
}
