package co.com.jhonsebastianas.reproductor.models.dto;

import java.io.Serializable;
import java.util.Date;

public class AlbumDTO implements Serializable {

	private static final long serialVersionUID = -7201573150751592635L;
	private Long idAlbum;
	private String nombre;
	private Date fechaPublicacion;

	public Long getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Long idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

}
