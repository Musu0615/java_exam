package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index(Member member) {

		repository.findAll().forEach(System.out::println);

		System.out.println(repository.load(2));

		Member member2 = new Member();
		member2.setName("涼");
		member2.setAge(25);
		member2.setDep_id(5);
		repository.save(member2);

		member.setName("シロー");
		member.setId(2);
		member.setAge(32);
		member.setDep_id(2);
		repository.save(member);
		return "member";
	}
}
