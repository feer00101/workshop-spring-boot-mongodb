package com.nilofer.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.nilofer.workshopmongo.domain.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String> {

}
