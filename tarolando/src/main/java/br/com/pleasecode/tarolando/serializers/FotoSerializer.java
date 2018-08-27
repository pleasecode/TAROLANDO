package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Foto;

public class FotoSerializer extends StdSerializer<Foto>{

	public FotoSerializer() {
		this(null);
		// TODO Auto-generated constructor stub
	}
	
	public FotoSerializer(Class<Foto> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(Foto arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
		// TODO Auto-generated method stub
		arg1.writeStartObject();
		arg1.writeNumberField("id", arg0.getId());
		arg1.writeStringField("id", arg0.getImagemUrl());
		arg1.writeEndObject();
	}

	
}
