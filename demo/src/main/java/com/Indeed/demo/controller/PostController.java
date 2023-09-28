//package com.Indeed.demo.controller;
//
//import com.Indeed.demo.dto.PostDTO;
//import com.Indeed.demo.model.PostModel;
//import com.Indeed.demo.service.PostService;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
//
//@RestController
//@Slf4j
//@RequiredArgsConstructor
//@CrossOrigin
//public class PostController {
//
//    final PostService postService;
//
//    @PostMapping("/create")
//    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
//            log.info("Saving post ######");
//
//            return this.postService.savePost(postDTORequest);
//    }
//}
//
//
//

package com.Indeed.demo.controller;

import com.Indeed.demo.constants.APIConstants;
import com.Indeed.demo.dto.PostDTO;
import com.Indeed.demo.model.PostModel;
import com.Indeed.demo.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequiredArgsConstructor
public class PostController {


    final PostService postService;

    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }

    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");
        return this.postService.savePost(postDTORequest);
    }
}