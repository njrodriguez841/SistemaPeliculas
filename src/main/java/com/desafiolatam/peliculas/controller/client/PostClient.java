package com.desafiolatam.peliculas.controller.client;

import com.desafiolatam.peliculas.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/posts")
public interface PostClient {


    @GetMapping
    List<PostDTO> getPosts();

}
