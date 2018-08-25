package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Atividade;

public class AtividadeSerializer extends StdSerializer<Atividade>{
	
	public AtividadeSerializer() {
        this(null);
    }


	protected AtividadeSerializer(Class<Atividade> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(Atividade arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException, JsonProcessingException {
		arg1.writeStartObject();
		arg1.writeNumberField("id", arg0.getId());
		arg1.writeStringField("nome", arg0.getNome());
		arg1.writeEndObject();
		
	}

}
