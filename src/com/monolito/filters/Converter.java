package com.monolito.filters;

public interface Converter<T,B> {
	T latexToUnicode(T text, B match);
}
