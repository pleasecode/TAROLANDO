package br.com.pleasecode.tarolando.serializers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Local;

public class LocalListSerializer extends StdSerializer<List<Local>>{

	public LocalListSerializer(){
		this(null);
	}
	
	protected LocalListSerializer(Class<List<Local>> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(List<Local> arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
        List<Local> titles= new ArrayList<Local>(arg0.size());
        
        for(Local local: arg0){
        	local.setAtividades(null);
        	titles.add(local);
        }
        arg1.writeObject(titles);

	}
}
