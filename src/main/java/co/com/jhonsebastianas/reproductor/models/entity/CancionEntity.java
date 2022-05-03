package co.com.jhonsebastianas.reproductor.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CANCION")
public class CancionEntity implements Serializable {

    private static final long serialVersionUID = -9116547112220424688L;

    @Id
    @Column(name = "ID_CANCION")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCancion;
    
    @Column(name = "ID_ALBUM")
    private Long idAlbum;
    
    @ManyToOne
    @JoinColumn(name = "ID_ALBUM",referencedColumnName = "ID_ALBUM", updatable = false, insertable = false)
    private AlbumEntity album;
    
    @Column(name = "NOMBRE")
    private String nombreCancion;
    
    @Column(name = "FECHA_PUBLICACION")
    private Date fechaPublicacion;

    public Long getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Long idCancion) {
        this.idCancion = idCancion;
    }

    public Long getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        this.idAlbum = idAlbum;
    }

    public AlbumEntity getAlbum() {
        return album;
    }

    public void setAlbum(AlbumEntity album) {
        this.album = album;
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
