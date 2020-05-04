package com.monolito.filters.impl;

import com.monolito.filters.Converter;

public class ConverterImpl implements Converter<String, Boolean> {

	@Override
	public String latexToUnicode(String text, Boolean match) {
		if(match) {
			return text
					.replaceAll("\\\\alpha", "α")
					.replaceAll("\\\\beta", "β");
		}
		return text;
	}

}
