package jjfactory.toy.service;

import jjfactory.toy.model.Member;
import jjfactory.toy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequiredArgsConstructor
@Service
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public void join(Member member){
        memberRepository.save(member);
    }

//    @Transactional(readOnly = true)
//    public void login(String username, String password){
//
//    }

}
