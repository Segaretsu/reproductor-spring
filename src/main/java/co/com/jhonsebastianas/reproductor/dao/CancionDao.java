package co.com.jhonsebastianas.reproductor.dao;

import java.util.List;

import co.com.jhonsebastianas.reproductor.models.entity.CancionEntity;

/**
 * TODO: descripción <br>
 * Creado el 3/05/2022 a las 10:58:56 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
public interface CancionDao {

	/**
	 * Método encargado de registrar una cación <br>
	 * Creado el 3/05/2022 a las 11:02:12 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param cancion
	 */
	void insert(CancionEntity cancion);

	/**
	 * Método encargado de actualizar una canción. <br>
	 * Creado el 3/05/2022 a las 11:02:54 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param cancion
	 */
	void update(CancionEntity cancion);

	/**
	 * Método encargado de eliminar una canción. <br>
	 * Creado el 3/05/2022 a las 11:03:11 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param cancion
	 */
	void delete(CancionEntity cancion);

	/**
	 * Método encargado de encontrar una cación por id <br>
	 * Creado el 3/05/2022 a las 11:03:30 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @param idCancion
	 * @return
	 */
	CancionEntity findByPk(Long idCancion);

	/**
	 * Método encargado de retornar toda la lista de canciones. <br>
	 * Creado el 3/05/2022 a las 11:04:26 a. m. <br>
	 *
	 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
	 * @return
	 */
	List<CancionEntity> findAll();

//	List<CancionEntity> findBy ();
}
