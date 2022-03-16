package jjfactory.toy.controller;

import jjfactory.toy.model.Board;
import jjfactory.toy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board")
    public ResponseEntity<?> save(@RequestBody Board board){
        boardService.save(board);
        return new ResponseEntity<>("저장완료",HttpStatus.OK);
    }

    @DeleteMapping("/board/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        boardService.deleteById(id);
        return new ResponseEntity<>("삭제완료",HttpStatus.OK);
    }

    @PutMapping("/board/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody Board board){
        boardService.updateById(id,board);
        return new ResponseEntity<>("수정완료",HttpStatus.OK);
    }
}
