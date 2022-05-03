package co.com.jhonsebastianas.reproductor.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.jhonsebastianas.reproductor.manager.CancionManager;
import co.com.jhonsebastianas.reproductor.models.dto.CancionDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.CancionEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Servicios para las canciones.cancionAnterio <br>
 * Creado el 3/05/2022 a las 11:35:21 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
@Path("cancion")
@Api("cancion")
@Component
public class CancionAlbum {

	@Autowired
	private CancionManager cancionManager;

	@POST
	@Path("/registrarCancion")
	@ApiOperation(value = "registrarCancion", notes = "Registra una nueva canción")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO registrarCancion(CancionDTO cancion) {
		return this.cancionManager.registrarCancion(cancion);
	}

	@PUT
	@Path("/actualizarCancion/{idCancion}")
	@ApiOperation(value = "actualizarCancion", notes = "Actualiza una nueva canción")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO actualizarCancion(@PathParam("idCancion") Long idCancion, CancionDTO cancion) {
		return this.cancionManager.modificarCancion(idCancion, cancion);
	}

	@DELETE
	@Path("/eliminarCancion/{idCancion}")
	@ApiOperation(value = "eliminarCancion", notes = "Elimina una canción")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO actualizarCancion(@PathParam("idCancion") Long idCancion) {
		return this.cancionManager.eliminarCancion(idCancion);
	}

	@GET
	@Path("/findAll")
	@ApiOperation(value = "findAll", notes = "Encuentra todas las canciones")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<CancionEntity> findAllCancion() {
		return this.cancionManager.findAllCanciones();
	}

}
