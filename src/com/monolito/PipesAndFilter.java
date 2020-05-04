package com.monolito;

import com.monolito.filters.impl.ConverterImpl;
import com.monolito.filters.impl.ExportImpl;
import com.monolito.filters.impl.TextCheckerImpl;

public class PipesAndFilter {	
	
	public static void main(String[] args) {
		String message  = "Im feeling \\beta!";
		String[] forbiddenWords = {"isn't","i'm","don't"};
		
		TextCheckerImpl checker = new TextCheckerImpl();
		ConverterImpl converter = new ConverterImpl();
		ExportImpl export = new ExportImpl();
		
		String messageLower = checker.messageToLower(message);
		Boolean isValid = checker.textChecker(messageLower, forbiddenWords);
		
		String unicode = converter.latexToUnicode(message, isValid );
		
		export.txtUpload(unicode);
	}
	
}
