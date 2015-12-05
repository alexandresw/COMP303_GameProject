package com.centennial.comp303.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	
	
	
}
