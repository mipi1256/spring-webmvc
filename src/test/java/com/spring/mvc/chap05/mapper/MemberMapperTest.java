package com.spring.mvc.chap05.mapper;

import com.spring.mvc.chap05.entity.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberMapperTest {

   @Autowired
   MemberMapper memberMapper;

   @Test
   @DisplayName("회원가입에 성공해야 한다.")
   void saveTest() {
      // given
      Member member = new Member();
      member.setAccount("abc1234");
      member.setPassword("aabbcc1122");
      member.setName("김춘식");
      member.setEmail("chunsik@naver.com");
      // when
      memberMapper.save(member);
      // then
   }

   @Test
   @DisplayName("아이디가 abc1234인 계정을 조회하면 그 회원의 이름은 김춘식이어야 한다.")
   void findMemberTest() {
      // given
      String account = "abc1234";
      // when
      Member member = memberMapper.findMember(account);
      // then
      assertEquals(member.getName(), "김춘식");
   }

   @Test
   @DisplayName("계정이 abc1234일 경우 중복확인 결과값이 true여야 한다.")
   void duplicateTest() {
      // given
      String account = "abc1234";
      // when
      boolean accountFlag = memberMapper.isDuplicate("account", account);
      // then
      assertTrue(accountFlag);
   }

   @Test
   @DisplayName("이메일이 abc@naver.com일 경우 중복확인 결과값이 false여야 한다.")
   void duplicateEmailTest() {
      // given
      String email = "abc@naver.com";
      // when
      boolean emailFlag = memberMapper.isDuplicate("email", email);
      // then
      assertFalse(emailFlag);
   }

}








































