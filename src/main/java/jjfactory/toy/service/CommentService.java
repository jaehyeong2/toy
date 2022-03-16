package jjfactory.toy.service;

import jjfactory.toy.model.Board;
import jjfactory.toy.model.Comment;
import jjfactory.toy.repository.BoardRepository;
import jjfactory.toy.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class CommentService {
    private final CommentRepository commentRepository;

    public void save(Comment comment){
        commentRepository.save(comment);
    }

    public void deleteById(Long id){
        commentRepository.deleteById(id);
    }

    public void updateById(Long id, Comment req){
        Comment findComment = commentRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("조회 실패");
        });
        findComment.setContent(req.getContent());
    }
}
