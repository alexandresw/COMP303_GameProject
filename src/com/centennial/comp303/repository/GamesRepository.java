package com.centennial.comp303.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.centennial.comp303.domain.Game;

@Repository
public class GamesRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void add(Game game) {
      em.persist(game);
    }

	public List<Game> list() {
      return em.createQuery("select t from Game t").getResultList();
    }

	public Game findById(Long id) {
		return em.find(Game.class, id);
	}

	public List findByType(String type) {
		Query query = em.createQuery("select t from Game t where t.type = :paramType");
		query.setParameter("paramType", type);
		return query.getResultList();
	}
	
	
	
}
