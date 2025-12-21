package com.meeting.summary.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data				//Getter, Setter
@NoArgsConstructor	//기본 생성자(파라미터 없는 생성자) 생성 가능
@AllArgsConstructor	//모든 필드를 파라미터로 받는 생성자 생성 가능 
@Builder			//빌더 패턴 사용 가능
/* 회의록 정보 */
public class Meeting {
	private Long meetingId; 				//회의록 고유번호(SEQ)
	private Long userId;					//사용자 고유번호(FK)
	private String title;					//회의록 제목
	private String body;					//회의록 내용
	private String description;				//회의록 메모
	private String visibility;				//회의록 공개상태(공개/비공개)
	private String status;					//회의록 상태(요약완료/요약미완료)
	private LocalDate meetingDate;			//회의일
	private LocalDateTime startTime;		//회의 시작 시간
	private LocalDateTime endTime;			//회의 종료 시간
	private boolean deleted;				//삭제 여부. 기본값 false, 삭제 시 true
	private Long createdBy;					//생성자
	private LocalDateTime createdDate;		//생성 시각
	private Long modifiedBy;				//수정자
	private LocalDateTime modifiedDate;		//수정 시각
}