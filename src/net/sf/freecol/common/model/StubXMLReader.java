package net.sf.freecol.common.model;

import java.io.IOException;
import java.io.InputStream;

import net.sf.freecol.common.io.FreeColXMLReader;

class StubXMLReader extends FreeColXMLReader{
	public String outputString = "";
	public StubXMLReader(InputStream inputStream) throws IOException {
		super(inputStream);
		// TODO Auto-generated constructor stub
	}

    public int getAttribute(String attributeName, int defaultValue) {
    	outputString += attributeName + '=' + String.valueOf(defaultValue) + ';';
    	return defaultValue;
    }
    
    public String getAttribute(String attributeName, String defaultValue) {
    	outputString += attributeName + '=' + defaultValue + ';';
    	return defaultValue;
    }

    public boolean getAttribute(String attributeName, boolean defaultValue) {
    	outputString += attributeName + '=' + String.valueOf(defaultValue) + ';';
    	return defaultValue;
    }
    
    public boolean shouldClearContainers() {
    	return true;
    }
}