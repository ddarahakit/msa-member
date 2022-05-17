package com.ddarahakit.msamember.service;

import com.ddarahakit.msamember.entity.Member;
import com.ddarahakit.msamember.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public void test(){
        Member member = new Member();
        member.setEmail("test01@test.com");
        memberRepository.save(member);

    }
}
