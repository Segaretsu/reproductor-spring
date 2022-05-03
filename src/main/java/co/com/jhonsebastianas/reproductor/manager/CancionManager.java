package co.com.jhonsebastianas.reproductor.manager;

import java.util.List;

import co.com.jhonsebastianas.reproductor.models.dto.CancionDTO;
import co.com.jhonsebastianas.reproductor.models.dto.ResponseDTO;
import co.com.jhonsebastianas.reproductor.models.entity.CancionEntity;

/**
 * Interface encargada de la capa de negocio de las canciones. <br>
 * Creado el 3/05/2022 a las 11:10:58 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
public interface CancionManager {

	/**
	 * Método encargado de registrar una cación. <br>
	 * Creado el 3/05/2022 a las 11:15:08 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param nuevaCancion
	 * @return
	 */
	ResponseDTO registrarCancion(CancionDTO nuevaCancion);

	/**
	 * Método encargado de modificar una canción. <br>
	 * Creado el 3/05/2022 a las 11:15:20 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param idCancion
	 * @param cancionModificada
	 * @return
	 */
	ResponseDTO modificarCancion(Long idCancion, CancionDTO cancionModificada);

	/**
	 * Método encargado de eliminar una canción. <br>
	 * Creado el 3/05/2022 a las 11:15:39 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param idCancion
	 * @return
	 */
	ResponseDTO eliminarCancion(Long idCancion);

	/**
	 * Método encargado de retornar la lista de canciones registradas. <br>
	 * Creado el 3/05/2022 a las 11:15:56 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @return
	 */
	List<CancionEntity> findAllCanciones();

}
