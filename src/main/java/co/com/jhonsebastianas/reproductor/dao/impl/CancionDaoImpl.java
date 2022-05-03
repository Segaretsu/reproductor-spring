package co.com.jhonsebastianas.reproductor.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.jhonsebastianas.reproductor.dao.CancionDao;
import co.com.jhonsebastianas.reproductor.models.entity.CancionEntity;

/**
 * Método encargado de la capa de datos de canciones. <br>
 * Creado el 3/05/2022 a las 11:05:14 a. m. <br>
 *
 * @author <a href="https://www.jhonsebastianas.com/">JhonSebastianAS.</a></br>
 */
@Repository
public class CancionDaoImpl implements CancionDao {
	
	@Autowired
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.CancionDao#insert(co.com.jhonsebastianas.reproductor.models.entity.CancionEntity)
	 */
	@Override
	public void insert(CancionEntity cancion) {
		this.entityManager.persist(cancion);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.CancionDao#update(co.com.jhonsebastianas.reproductor.models.entity.CancionEntity)
	 */
	@Override
	public void update(CancionEntity cancion) {
		this.entityManager.merge(cancion);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.CancionDao#delete(co.com.jhonsebastianas.reproductor.models.entity.CancionEntity)
	 */
	@Override
	public void delete(CancionEntity cancion) {
		this.entityManager.remove(cancion);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.CancionDao#findByPk(java.lang.Long)
	 */
	@Override
	public CancionEntity findByPk(Long idCancion) {
		return this.entityManager.find(CancionEntity.class, idCancion);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.CancionDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CancionEntity> findAll() {
		Query query = this.entityManager.createNativeQuery("SELECT * FROM CANCION", CancionEntity.class);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

}
