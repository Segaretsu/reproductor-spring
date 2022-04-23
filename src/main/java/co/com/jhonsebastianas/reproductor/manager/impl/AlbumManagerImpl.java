package co.com.jhonsebastianas.reproductor.manager.impl;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.jhonsebastianas.reproductor.dao.AlbumDao;
import co.com.jhonsebastianas.reproductor.manager.AlbumManager;
import co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;

/**
 * Clase encargada de implementar las reglas de negocio de los albunes. <br>
 * Creado el 12/04/2022 a las 5:01:08 p. m. <br>
 * 
 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
 */
@Service
public class AlbumManagerImpl implements AlbumManager {

	@Autowired
	private AlbumDao albumDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.jhonsebastianas.reproductor.manager.AlbumManager#registrarNuevoAlbum(co.com
	 * .jhonsebastianas.reproductor.models.dto.AlbumDTO)
	 */
	@Override
	@Transactional
	public void registrarNuevoAlbum(AlbumDTO album) {
		AlbumEntity albumNuevo = new AlbumEntity();
		albumNuevo.setNombre(album.getNombre());
		albumNuevo.setFechaPublicacion(album.getFechaPublicacion());
		this.albumDao.insert(albumNuevo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.jhonsebastianas.reproductor.manager.AlbumManager#findAll()
	 */
	@Override
	@Transactional
	public List<AlbumEntity> findAll() {
		return albumDao.findAllAlbumsEntity();
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.manager.AlbumManager#actualizarAlbum(co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO)
	 */
	@Override
	@Transactional
	public ResponseDTO actualizarAlbum(AlbumDTO album) {
		AlbumEntity albumEntity = this.albumDao.findByPk(album.getIdAlbum());
		albumEntity.setNombre(album.getNombre());
		albumEntity.setFechaPublicacion(album.getFechaPublicacion());
		this.albumDao.update(albumEntity);
		
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setStatusCode(Response.Status.OK.getStatusCode());
		respuesta.setMessage("El albúm se actualizo con exito.");
		return respuesta;
	}

}
