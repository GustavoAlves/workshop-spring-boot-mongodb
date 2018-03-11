package com.gustavoalves.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoalves.workshopmongo.domain.Post;
import com.gustavoalves.workshopmongo.repositories.PostRepository;
import com.gustavoalves.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
	    return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
