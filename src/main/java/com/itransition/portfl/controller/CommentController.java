package com.itransition.portfl.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Artur on 09.04.2017.
 */
@RestController
@RequestMapping( value = "/comment" )
public class CommentController {

    @GetMapping( value = "/get")
    public ResponseEntity<?> getCommentsByImageId(@RequestParam int id){
        return ResponseEntity.ok("comments");
    }

    @PostMapping( value = "/add" )
    public ResponseEntity<?> addCommentsByImageId(@RequestBody String commen){
        return ResponseEntity.ok("add");
    }

}
