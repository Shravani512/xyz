package com.Indeed.server.service;

import com.Indeed.server.dto.PostDTO;
import com.Indeed.server.model.PostModel;

public interface PostService {

    public PostModel savePost(PostDTO post);
}
