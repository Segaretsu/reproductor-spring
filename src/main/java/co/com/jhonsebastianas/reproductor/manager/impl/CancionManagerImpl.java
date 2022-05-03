package co.com.jhonsebastianas.reproductor.manager.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import co.com.jhonsebastianas.reproductor.dao.AlbumDao;
import co.com.jhonsebastianas.reproductor.dao.CancionDao;
import co.com.jhonsebastianas.reproductor.manager.CancionManager;
import co.com.jhonsebastianas.reproductor.models.dto.CancionDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;
import co.com.jhonsebastianas.reproductor.models.entity.CancionEntity;

/**
 * Clase encargada de la capa de negocio de canciones. <br>
 * Creado el 3/05/2022 a las 11:16:41 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
@Service
public class CancionManagerImpl implements CancionManager {
	
	@Autowired
	private AlbumDao albumDao;
	
	@Autowired
	private CancionDao cancionDao;

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.manager.CancionManager#registrarCancion(co.com.jhonsebastianas.reproductor.models.dto.CancionDTO)
	 */
	@Override
	@Transactional
	public ResponseDTO registrarCancion(CancionDTO nuevaCancion) {
		AlbumEntity albumAsociado = this.albumDao.findByPk(nuevaCancion.getIdAlbum());
		if (albumAsociado == null) {
			ResponseDTO albumNoExiste = new ResponseDTO();
			albumNoExiste.setMessage("El albúm ingresado, no existe");
			albumNoExiste.setStatusCode(HttpStatus.NOT_FOUND.value());
			return albumNoExiste;
		}
		CancionEntity cancion = new CancionEntity();
		cancion.setIdAlbum(nuevaCancion.getIdAlbum());
		cancion.setNombreCancion(nuevaCancion.getNombreCancion());
		cancion.setFechaPublicacion(nuevaCancion.getFechaPublicacion());
		this.cancionDao.insert(cancion);
		
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setStatusCode(HttpStatus.OK.value());
		respuesta.setMessage("Canción registrada con exito");
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.manager.CancionManager#modificarCancion(java.lang.Long, co.com.jhonsebastianas.reproductor.models.dto.CancionDTO)
	 */
	@Override
	@Transactional
	public ResponseDTO modificarCancion(Long idCancion, CancionDTO cancionModificada) {
		CancionEntity cancionAnterio = this.cancionDao.findByPk(idCancion);
		if (cancionAnterio == null) {
			ResponseDTO cancionNoExiste = new ResponseDTO();
			cancionNoExiste.setMessage("La canción que trata de modificar no existe.");
			cancionNoExiste.setStatusCode(HttpStatus.NOT_FOUND.value());
			return cancionNoExiste;
		}
		
		AlbumEntity albumAsociado = this.albumDao.findByPk(cancionModificada.getIdAlbum());
		if (albumAsociado == null) {
			ResponseDTO albumNoExiste = new ResponseDTO();
			albumNoExiste.setMessage("El albúm ingresado, no existe");
			albumNoExiste.setStatusCode(HttpStatus.NOT_FOUND.value());
			return albumNoExiste;
		}
		
		cancionAnterio.setIdAlbum(cancionModificada.getIdAlbum());
		cancionAnterio.setNombreCancion(cancionModificada.getNombreCancion());
		cancionAnterio.setFechaPublicacion(cancionModificada.getFechaPublicacion());
		
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setMessage("Canción modificada con éxito.");
		respuesta.setStatusCode(HttpStatus.OK.value());
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.manager.CancionManager#eliminarCancion(java.lang.Long)
	 */
	@Override
	@Transactional
	public ResponseDTO eliminarCancion(Long idCancion) {
		CancionEntity cancionAnterio = this.cancionDao.findByPk(idCancion);
		if (cancionAnterio == null) {
			ResponseDTO cancionNoExiste = new ResponseDTO();
			cancionNoExiste.setMessage("La canción que trata de eliminar no existe.");
			cancionNoExiste.setStatusCode(HttpStatus.NOT_FOUND.value());
			return cancionNoExiste;
		}
		
		this.cancionDao.delete(cancionAnterio);
		
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setMessage("Canción eliminada con éxito.");
		respuesta.setStatusCode(HttpStatus.OK.value());
		return respuesta;
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.manager.CancionManager#findAllCanciones()
	 */
	@Override
	public List<CancionEntity> findAllCanciones() {
		return this.cancionDao.findAll();
	}

}
