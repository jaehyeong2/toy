package jjfactory.toy.repository;

import jjfactory.toy.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private final EntityManager em;

    public Member save(Member member){
        em.persist(member);
        return member;
    }

    public Member findById(Long id){
        Member member = em.find(Member.class, id);
        return member;
    }

//    @PostConstruct
//    public void init(){
//        Member member = new Member("lee","user1","1234");
//        em.persist(member);
//    }
}
