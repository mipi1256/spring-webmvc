package com.spring.mvc.chap05.entity;

/*
   CREATE TABLE tbl_board (
      board_No INT PRIMARY KEY AUTO_INCREMENT,
      title VARCHAR(100) NOT NULL,
      content VARCHAR(2000),
      view_count INT DEFAULT 0,
      reg_date DATETIME DEFAULT current_timestamp,
      writer VARCHAR(50) NOT NULL
   );
 */


import com.spring.mvc.chap05.dto.request.BoardWriteRequestDTO;
import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

   private int boardNo; // 게시글 번호
   private String title; // 제목
   private String content; // 내용
   private int viewCount; // 조회수
   private LocalDateTime regDate; // 작성일자 시간
   private String writer; // 작성자

   public Board(BoardWriteRequestDTO dto) {
      this.writer = dto.getWriter();
      this.title = dto.getTitle();
      this.content = dto.getContent();
      //this.reg_date = LocalDateTime.now(); You can add this date in Java or when the new data is insert(DB)
   }


}












































