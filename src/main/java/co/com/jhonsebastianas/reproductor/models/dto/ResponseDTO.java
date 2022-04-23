package co.com.jhonsebastianas.reproductor.models.dto;

import java.io.Serializable;

/**
 * Creado el 19/04/2022 a las 5:37:41 p. m. <br>
 * 
 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
 */
public class ResponseDTO implements Serializable {

	private static final long serialVersionUID = 4089550723478532212L;
	private Integer statusCode;
	private String message;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
