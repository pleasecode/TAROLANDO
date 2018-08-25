package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Agente;

public class AgenteSerializer extends StdSerializer<Agente> {
	
	public AgenteSerializer() {
        this(null);
    }

	protected AgenteSerializer(Class<Agente> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(Agente agente, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
		generator.writeStartObject();
		generator.writeNumberField("id", agente.getId());
		generator.writeStringField("nome", agente.getNome());
		generator.writeEndObject();
		
	}


}
