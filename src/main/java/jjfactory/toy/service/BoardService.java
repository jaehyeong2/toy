package jjfactory.toy.service;

import jjfactory.toy.model.Board;
import jjfactory.toy.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class BoardService {
    private final BoardRepository boardRepository;

    public Long save(Board board){
        Board save = boardRepository.save(board);
        return save.getId();
    }

    public void deleteById(Long id){
        boardRepository.deleteById(id);
    }

    public void updateById(Long id, Board req){
        Board findBoard = boardRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("조회 실패");
        });
        findBoard.setTitle(req.getTitle());
        findBoard.setContent(req.getContent());
    }
}
