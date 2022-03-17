//package jjfactory.toy;
//
//import jjfactory.toy.model.Board;
//import jjfactory.toy.model.Comment;
//import jjfactory.toy.model.Member;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//
//@Component
//@RequiredArgsConstructor
//public class InitDB {
//
//    private final InitService initService;
//
//    @PostConstruct
//    public void init(){
//        initService.dbInit1();
//        initService.dbInit2();
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService{
//
//        private final EntityManager em;
//
//        public void dbInit1(){
//            Member member1 = new Member("lee","test1","1234");
//            em.persist(member1);
//
//            Member member2 = new Member("kim","test2","1234");
//            em.persist(member2);
//
//            Board board1 = new Board("TITLE1","test1이 쓴 글");
//            Board board2 = new Board("TITLE1","test2가 쓴 글");
//
//            board1.setMember(member1);
//            board2.setMember(member2);
//
//            em.persist(board1);
//            em.persist(board2);
//
//            Comment comment1 = new Comment("댓글 1");
//            Comment comment2 = new Comment("댓글 2");
//
//            comment1.setMember(member1);
//            comment1.setBoard(board1);
//
//            comment2.setMember(member1);
//            comment2.setBoard(board1);
//
//            em.persist(comment1);
//            em.persist(comment2);
//
//        }
//
//        public void dbInit2(){
//            Member member1 = new Member("lee","test3","1234");
//            em.persist(member1);
//
//            Member member2 = new Member("kim","test4","1234");
//            em.persist(member2);
//
//            Board board1 = new Board("TITLE3","test1이 쓴 글");
//            Board board2 = new Board("TITLE4","test2가 쓴 글");
//
//            board1.setMember(member1);
//            board2.setMember(member2);
//
//            em.persist(board1);
//            em.persist(board2);
//
//            Comment comment1 = new Comment("댓글 1");
//            Comment comment2 = new Comment("댓글 2");
//
//            comment1.setMember(member1);
//            comment1.setBoard(board1);
//
//            comment2.setMember(member2);
//            comment2.setBoard(board1);
//
//            em.persist(comment1);
//            em.persist(comment2);
//        }
//    }
//}
