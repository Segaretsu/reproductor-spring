package co.com.jhonsebastianas.reproductor.dao;

import java.util.List;

import co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;

/**
 * Interface encargada de la capa de datos de la entity Album. <br>
 * Creado el 11/04/2022 a las 5:31:53 p. m. <br>
 * 
 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
 */
public interface AlbumDao {

	/**
	 * Método encargado de registrar un Album. <br>
	 * Creado el 11/04/2022 a las 5:34:59 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param album
	 */
	void insert(AlbumEntity album);

	/**
	 * Método encargado de actualizar un Album. <br>
	 * Creado el 11/04/2022 a las 5:35:42 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param album
	 */
	void update(AlbumEntity album);

	/**
	 * Método encargado de eliminar un album. <br>
	 * Creado el 11/04/2022 a las 5:36:16 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param album
	 */
	void delete(AlbumEntity album);

	/**
	 * Método encargado de encontrar un Album por la Pk. <br>
	 * Creado el 11/04/2022 a las 5:37:04 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param idAlbum
	 * @return
	 */
	AlbumEntity findByPk(Long idAlbum);

	/**
	 * Método encargado de consultar todos los albunes DTO. <br>
	 * Creado el 11/04/2022 a las 5:39:20 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @return
	 */
	List<AlbumDTO> findAllAlbumsDTO();

	/**
	 * Método encargado de consultar todos los albunes Entity. <br>
	 * Creado el 11/04/2022 a las 5:41:24 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @return
	 */
	List<AlbumEntity> findAllAlbumsEntity();
}