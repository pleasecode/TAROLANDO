package br.com.pleasecode.tarolando.error;

public class ResourceNotFoundExceptionDetails extends ErrorDetails{
	
	private ResourceNotFoundExceptionDetails() {}	
	
	public static final class Builder {
		private String titulo;
		private int status;
		private String detalhes;
		private long momento;
		private String classeError;
		
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
		
		public ResourceNotFoundExceptionDetails build() {
			ResourceNotFoundExceptionDetails resourceNotFoundExceptionDetails = new ResourceNotFoundExceptionDetails();
			resourceNotFoundExceptionDetails.titulo = this.titulo;
			resourceNotFoundExceptionDetails.detalhes = this.detalhes;
			resourceNotFoundExceptionDetails.momento = this.momento;
			resourceNotFoundExceptionDetails.status = this.status;
			resourceNotFoundExceptionDetails.classeError = this.classeError;
			return resourceNotFoundExceptionDetails;
		}
	}
	
}
