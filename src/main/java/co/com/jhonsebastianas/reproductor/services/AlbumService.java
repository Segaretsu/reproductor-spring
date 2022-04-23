package co.com.jhonsebastianas.reproductor.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.jhonsebastianas.reproductor.manager.AlbumManager;
import co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Servicio encargado de exponer la Api para los Albums. <br>
 * Creado el 12/04/2022 a las 5:17:23 p. m. <br>
 * 
 * @author <a href="http://www.quipux.com/">Quipux Software.</a></br>
 */
@Path("album")
@Api("album")
@Component
public class AlbumService {
	
	@Autowired
	private AlbumManager albumManager;
	
	@POST
	@Path("/registrarAlbum")
	@ApiOperation(value = "registrarAlbum", notes = "Registra un nuevo Albúm")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void registrarAlbum(AlbumDTO album) {
		this.albumManager.registrarNuevoAlbum(album);
	}
	
	@PUT
	@Path("/actualizarAlbum/{idAlbum}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO actualizarAlbum(@PathParam("idAlbum") Long idAlbum, AlbumDTO album) {
		album.setIdAlbum(idAlbum);
		return this.albumManager.actualizarAlbum(album);
	}
	
	@GET
	@Path("/findAllAlbums")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<AlbumEntity> findAllAlbums () {
		return this.albumManager.findAll();
	}

}
