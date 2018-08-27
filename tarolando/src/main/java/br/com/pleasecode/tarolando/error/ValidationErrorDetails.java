package br.com.pleasecode.tarolando.error;

import br.com.pleasecode.tarolando.error.ResourceNotFoundExceptionDetails.Builder;

public class ValidationErrorDetails extends ErrorDetails {
	private String field;
	private String fieldMessage;

	public ValidationErrorDetails() {}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFieldMessage() {
		return fieldMessage;
	}



	public void setFieldMessage(String fieldMessage) {
		this.fieldMessage = fieldMessage;
	}



	public static final class Builder {
		private String titulo;
		private int status;
		private String detalhes;
		private long momento;
		private String classeError;
		private String field;
		private String fieldMessage;
		
		private Builder() {}
		
		public static Builder newBuilder() {
			return new Builder();
		}
		
		public Builder titulo (String titulo) {
			this.titulo =  titulo;
			return this;
		}
		
		public Builder status(int status) {
			this.status = status;
			return this;
		}
		
		public Builder detalhes(String detalhes) {
			this.detalhes = detalhes;
			return this;
		}
		
		public Builder momento(long momento) {
			this.momento = momento;
			return this;
		} 
		
		public Builder classError(String classeError) {
			this.classeError = classeError;
			return this;
		}
		
		public Builder field(String field) {
			this.field = field;
			return this;
		}
		
		public Builder fieldMessage(String fieldMessage) {
			this.fieldMessage = fieldMessage;
			return this;
		}
		
		public ValidationErrorDetails build() {
			ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
			validationErrorDetails.titulo = this.titulo;
			validationErrorDetails.detalhes = this.detalhes;
			validationErrorDetails.momento = this.momento;
			validationErrorDetails.status = this.status;
			validationErrorDetails.classeError = this.classeError;
			validationErrorDetails.field = this.field;
			validationErrorDetails.fieldMessage = this.fieldMessage;
			return validationErrorDetails;
		}
	}
	
}
