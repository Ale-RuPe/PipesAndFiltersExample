package com.monolito.filters.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.monolito.filters.Export;

public class ExportImpl implements Export<String>{

	@Override
	public void txtUpload(String text) {
		//.. Upload response in a TXT file
		System.out.println("Text message was saved on 'outputfile.txt' in the project's root");
		export(text);
	}

	public void export(String text) {
		String fileName ="outputfile.txt";

		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
			br.write(text);
	        br.newLine();
	        br.close();
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
}
