package com.meeting.summary.domain;

import java.time.LocalDateTime;

/* 회의록 정보 */
public class meeting {
	private long id; 						//회의록 고유번호(SEQ)
	private String title;					//회의록 제목
	private String body;					//회의록 내용
	private String description;				//회의록 메모
	private String visibility;				//회의록 공개상태(공개/비공개)
	private String status;					//회의록 상태(요약완료/요약미완료)
	private LocalDateTime startTime;		//회의 시작 시간
	private LocalDateTime endTime;			//회의 종료 시간
	private boolean isDeleted;				//삭제 여부. 기본값 false, 삭제 시 true
	private String createdBy;				//생성자
	private LocalDateTime createdDate;		//생성 시각
	private String modifiedBy;				//수정자
	private LocalDateTime modifiedDate;		//수정 시각
}