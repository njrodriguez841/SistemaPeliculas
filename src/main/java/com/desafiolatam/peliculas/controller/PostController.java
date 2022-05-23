package com.desafiolatam.peliculas.controller;

import com.desafiolatam.peliculas.controller.client.PostClient;
import com.desafiolatam.peliculas.dto.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("post")
@AllArgsConstructor
public class PostController {

    final PostClient postClient = null;

    @GetMapping
    public List<PostDTO> getPosts(){
        return postClient.getPosts();
    }


}
