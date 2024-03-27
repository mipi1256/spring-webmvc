package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap04.entity.Person;
import com.spring.mvc.chap05.entity.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryImplTest {

   @Autowired
   private BoardRepository repository;

   @Test
   @DisplayName("게시글을 300개 저장해야 한다")
   void bulkInsertTest() {
      // given
      // 반복문을 이용하여 저장하시는데, 작성자, 제목, 내용에 제어변수 값을 붙여서 INSERT 해 주세요.
      for (int i = 1; i <= 300; i++) {
         Board board = new Board();
         board.setWriter("김테스트" + i);
         board.setTitle("테스트 제목" + i);
         board.setContent("테스트 내용" + i);
         repository.save(board);
      }

   }

   @Test
   @DisplayName("게시글 전체 조회하면 300개의 글이 조회되어야 한다.")
   void findAllTest() {
      List<Board> boardList = repository.findAll();
      assertEquals(300, boardList.size());
   }

   @Test
   @DisplayName("30번 게시물을 단일 조회하면 제목에 30이 포함되어 있어야 한다.")
   void findOneTest() {
      int boardNo = 30;

      Board board = repository.findOne(boardNo);

      assertTrue(board.getTitle().contains("30"));
   }
   
   @Test
   @DisplayName("29번 게시물을 삭제하고 다시 조회하면 조회되지 않아야 한다.")
   void deleteTest() {
      int boardNo = 29;

      repository.delete(boardNo);
      Board deleteBoard = repository.findOne(boardNo);

      assertNull(deleteBoard);
   }


}




































