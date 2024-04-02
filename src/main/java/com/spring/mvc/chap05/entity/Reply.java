package com.spring.mvc.chap05.entity;

/*
   CREATE TABLE tbl_reply (
      reply_no INT AUTO_INCREMENT,
      reply_text VARCHAR(1000) NOT NULL,
      reply_writer VARCHAR(100) NOT NULL,
      reply_date DATETIME DEFAULT CURRENT_TIMESTAMP,
      board_No INT,
      CONSTRAINT pk_reply PRIMARY KEY(reply_no),
      CONSTRAINT fk_reply FOREIGN KEY(board_No) REFERENCES tbl_board(board_No)
      ON DELETE CASCADE
   );
*/


import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reply {

   private int replyNo;
   private String replyText;
   private String replyWriter;
   private LocalDateTime replyDate;
   private int boardNo;
   private LocalDateTime updateDate;


}












































