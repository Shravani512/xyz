package com.Indeed.server.service;

import com.Indeed.server.dao.PostDao;
import com.Indeed.server.dto.PostDTO;
import com.Indeed.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImplementation {

    @Autowired
    PostDao postDao;

    public PostModel savePost(PostDTO postDTO)
    {
        PostModel postModel=new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setExperience(postDTO.getExperience());
        postModel.setDescription(postDTO.getType());
        postModel.setTechnology(postDTO.getTechnology());
        postModel.setSalary(postDTO.getSalary());
        postModel.setDescription(postDTO.getDescription());

        return postDao.save(postModel);
    }
}
