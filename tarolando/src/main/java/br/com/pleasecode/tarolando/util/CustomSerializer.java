package br.com.pleasecode.tarolando.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.pleasecode.tarolando.model.Local;

public class CustomSerializer extends StdSerializer<List<Local>> {
	
	public CustomSerializer() {
        this(null);
    }

	protected CustomSerializer(Class<List<Local>> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(List<Local> locais,
		      JsonGenerator generator, 
		      SerializerProvider provider)  throws IOException, JsonProcessingException {
	      
		
			generator.writeStartArray();
	        for (Local local : locais) {
	        	
	        	generator.writeStartObject();
	    		generator.writeNumberField("id", local.getId());
	    		generator.writeEndObject();
	        }
	        generator.writeEndArray();
	        
	        
	       // generator.writeEndObject();
	}

}
