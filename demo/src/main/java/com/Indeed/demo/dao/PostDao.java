package com.Indeed.demo.dao;

import com.Indeed.demo.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {
}