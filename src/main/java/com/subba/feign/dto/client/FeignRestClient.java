package com.subba.feign.dto.client;

import com.subba.feign.dto.Post;
import com.subba.feign.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="feign-client")
public interface FeignRestClient {

    @GetMapping("/users")
    public List<User> getUsers();

    @GetMapping("/posts")
    public ResponseEntity<?> getPosts();

    @GetMapping("/post")
    public ResponseEntity<?> getPost(@RequestParam("id") String id);

    @GetMapping("/users")
    public ResponseEntity<?> getUsers2();

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") String id);

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable("postId") Long postId);


}
