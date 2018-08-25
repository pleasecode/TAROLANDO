package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Empresa;

public class EmpresaSerializer extends StdSerializer<Empresa> {

	protected EmpresaSerializer(Class<Empresa> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(Empresa arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
		// TODO Auto-generated method stub
		arg1.writeStartObject();
		arg1.writeNumberField("id", arg0.getId());
		arg1.writeEndObject();
	}

}
