package co.com.jhonsebastianas.reproductor.manager;

import java.util.List;

import co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;

/**
 * Interface encargada de las reglas de negocio de la entidad Album<br>
 * Creado el 12/04/2022 a las 4:56:39 p. m. <br>
 * 
 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
 */
public interface AlbumManager {

	/**
	 * Método encargado de registrar un nuevo album.<br>
	 * Creado el 12/04/2022 a las 4:58:12 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param album
	 */
	void registrarNuevoAlbum(AlbumDTO album);

	/**
	 * Método encargado de actualizar un nuevo album.<br>
	 * Creado el 19/04/2022 a las 5:42:29 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @param album
	 * @return
	 */
	ResponseDTO actualizarAlbum(AlbumDTO album);

	/**
	 * Método encargado de retornar todos los albums<br>
	 * Creado el 12/04/2022 a las 4:59:14 p. m. <br>
	 * 
	 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
	 * @return
	 */
	List<AlbumEntity> findAll();

}
