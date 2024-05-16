package com.nilofer.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilofer.workshopmongo.domain.Post;
import com.nilofer.workshopmongo.repository.PostRespository;
import com.nilofer.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRespository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findbByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
