package jjfactory.toy.repository;

import jjfactory.toy.model.Board;
import jjfactory.toy.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
