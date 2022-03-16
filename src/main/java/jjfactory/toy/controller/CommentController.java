package jjfactory.toy.controller;

import jjfactory.toy.model.Board;
import jjfactory.toy.model.Comment;
import jjfactory.toy.service.BoardService;
import jjfactory.toy.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<?> save(@RequestBody Comment comment){
        commentService.save(comment);
        return new ResponseEntity<>("저장완료",HttpStatus.OK);
    }

    @DeleteMapping("/comment/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        commentService.deleteById(id);
        return new ResponseEntity<>("삭제완료",HttpStatus.OK);
    }

    @PutMapping("/comment/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody Comment comment){
        commentService.updateById(id,comment);
        return new ResponseEntity<>("수정완료",HttpStatus.OK);
    }
}
