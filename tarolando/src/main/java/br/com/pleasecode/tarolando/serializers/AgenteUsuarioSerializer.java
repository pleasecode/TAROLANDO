package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.AgenteUsuario;

public class AgenteUsuarioSerializer extends StdSerializer<AgenteUsuario> {
	
	public AgenteUsuarioSerializer(){
		this(null);
	}

	protected AgenteUsuarioSerializer(Class<AgenteUsuario> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(AgenteUsuario arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
		arg1.writeStartObject();
		arg1.writeStringField("username", arg0.getUsername());
		//arg1.writeObjectField("agente", arg0.getAgente().);
		arg1.writeEndObject();
		
	}
	
	

}
