package co.com.jhonsebastianas.reproductor.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALBUM")
public class AlbumEntity implements Serializable {

	private static final long serialVersionUID = 1786911240985101807L;

	@Id
	@Column(name = "ID_ALBUM")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAlbum;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "FECHA_PUBLICACION")
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
