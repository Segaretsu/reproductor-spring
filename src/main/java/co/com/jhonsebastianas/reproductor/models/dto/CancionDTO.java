package co.com.jhonsebastianas.reproductor.models.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Creado el 3/05/2022 a las 11:11:36 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
public class CancionDTO implements Serializable {

	private static final long serialVersionUID = 7338432397345208466L;

	private Long idAlbum;

	private String nombreCancion;

	private Date fechaPublicacion;

	public Long getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Long idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

}
