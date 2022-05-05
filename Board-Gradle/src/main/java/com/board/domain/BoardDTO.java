package com.board.domain;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

	// TB_BOARD
	private Long idx;			// 번호(PK)
	private String title;		// 제목
	private String content;		// 내용
	private String writer;		// 작성자
	private int viewCnt;		// 조회수
	private String noticeYn;	// 공지 여부
	private String secretYn;	// 비밀 여부
	private String deleteYn;	// 삭제 여부
	//DTO의 LocalDateTime 타입은 DB 쪽의 타입과 맞지 않아 LocalDateTime -> DATE 타입으로 변경
	private Date insertTime;	// 등록일
	private Date updateTime;	// 수정일
	private Date deleteTime;	// 삭제일

}