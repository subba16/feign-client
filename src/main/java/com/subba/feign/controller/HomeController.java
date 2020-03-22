package com.subba.feign.controller;

import com.subba.feign.dto.Post;
import com.subba.feign.dto.User;
import com.subba.feign.dto.client.FeignRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    FeignRestClient restClient;

    @GetMapping("/users")
    public List<User> getUsers(){
        return restClient.getUsers();
    }

    @GetMapping("/posts")
    public ResponseEntity<?> getPosts(){
        return restClient.getPosts();
    }

    @GetMapping("/post")
    public ResponseEntity<?> getPost(@RequestParam("id") String id){
        return restClient.getPost(id);
    }

    @GetMapping("/users2")
    public ResponseEntity<?> getUsers2(){
        return restClient.getUsers2();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") String id){
        return restClient.getUser(id);

    }

    @GetMapping("/posts/{postId}")
    public Post getPostById(@PathVariable("postId") Long postId){
        return restClient.getPostById(postId);
    }


}
