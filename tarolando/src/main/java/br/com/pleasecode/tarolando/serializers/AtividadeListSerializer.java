package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Atividade;
import br.com.pleasecode.tarolando.model.Local;

public class AtividadeListSerializer extends StdSerializer<List<Atividade>> {
	
	public AtividadeListSerializer() {
		this(null);
	}

	protected AtividadeListSerializer(Class<List<Atividade>> t) {
		super(t);
	}

	@Override
	public void serialize(List<Atividade> arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
		
		List<Atividade> titles= new ArrayList<Atividade>(arg0.size());
                
        for(Atividade atividade: arg0){
        	atividade.setLocais(null);
        	titles.add(atividade);
        }
        
        arg1.writeObject(titles);
	}
	
}
