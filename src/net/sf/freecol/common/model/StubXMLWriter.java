package net.sf.freecol.common.model;

import java.io.IOException;
import java.io.OutputStream;

import javax.xml.stream.XMLStreamException;

import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLWriter.WriteScope;

class StubXMLWriter extends FreeColXMLWriter
{
	public String outputString = "";
	
	public StubXMLWriter(OutputStream outputStream, WriteScope scope, boolean indent) throws IOException {
		super(outputStream, scope, indent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void writeAttribute(String attributeName, int value) throws XMLStreamException {
        outputString += attributeName + '=' + String.valueOf(value) + ';';
    }
	
	@Override
	public void writeAttribute(String attributeName, String value) throws XMLStreamException {
        outputString += attributeName + '=' + value + ';';
    }
}