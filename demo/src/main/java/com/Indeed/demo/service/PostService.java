package com.Indeed.demo.service;

import com.Indeed.demo.dto.PostDTO;
import com.Indeed.demo.model.PostModel;

import java.util.List;

public interface PostService {

    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}