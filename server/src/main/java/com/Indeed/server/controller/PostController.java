package com.Indeed.server.controller;


import com.Indeed.server.dto.PostDTO;
import com.Indeed.server.model.PostModel;
import com.Indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Slf4j
@RequiredArgsConstructor
public class PostController {

    final PostService postService;

    @PostMapping("/post")
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        log.info("Saving post ######");

        return this.postService.savePost(postDTORequest);
    }
}
