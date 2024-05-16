package com.nilofer.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nilofer.workshopmongo.domain.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);

}
