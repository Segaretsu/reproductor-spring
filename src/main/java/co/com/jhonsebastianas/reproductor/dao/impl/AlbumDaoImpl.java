package co.com.jhonsebastianas.reproductor.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.jhonsebastianas.reproductor.dao.AlbumDao;
import co.com.jhonsebastianas.reproductor.models.dto.AlbumDTO;
import co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity;

/**
 * Clase encargada de implementar la capa de datos del Album<br>
 * Creado el 11/04/2022 a las 5:43:12 p. m. <br>
 * 
 * @author <a href="https://www.jhonsebastianas.com/">Jhonsebastianas.</a></br>
 */
@Repository
public class AlbumDaoImpl implements AlbumDao {
	
	@Autowired
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#insert(co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity)
	 */
	@Override
	public void insert(AlbumEntity album) {
		this.entityManager.persist(album);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#update(co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity)
	 */
	@Override
	public void update(AlbumEntity album) {
		this.entityManager.merge(album);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#delete(co.com.jhonsebastianas.reproductor.models.entity.AlbumEntity)
	 */
	@Override
	public void delete(AlbumEntity album) {
		this.entityManager.remove(album);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#findByPk(java.lang.Long)
	 */
	@Override
	public AlbumEntity findByPk(Long idAlbum) {
		return this.entityManager.find(AlbumEntity.class, idAlbum);
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#findAllAlbumsDTO()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AlbumDTO> findAllAlbumsDTO() {
		try {
			Query query = this.entityManager.createNativeQuery(
					"SELECT * FROM ALBUM",
					AlbumDTO.class);
			return query.getResultList();
		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

	/* (non-Javadoc)
	 * @see co.com.jhonsebastianas.reproductor.dao.AlbumDao#findAllAlbumsEntity()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<AlbumEntity> findAllAlbumsEntity() {
		try {
			Query query = this.entityManager.createNativeQuery(
					"SELECT * FROM ALBUM",
					AlbumEntity.class);
			return query.getResultList();
		} catch (Exception ex) {
			return Collections.emptyList();
		}
	}

}
