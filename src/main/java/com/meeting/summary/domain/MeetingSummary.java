package com.meeting.summary.domain;

import java.time.LocalDateTime;

/*GPT가 요약한 회의록 */
public class MeetingSummary {
	private Long meetingSummaryId;		//회의록 요약 고유번호(SEQ)
	private Long userId;				//사용자 고유번호(FK)
	private Long meetingId;				//회의록 고유번호(FK)
	private String summaryType;			//회의록 요약 타입(요약, 자세히 요약 등)
	private String summaryTitle;		//회의록 제목
	private String summaryBody;			//회의록 요약 내용
	private String useToken;			//사용한 토큰 수
	private String createdBy;			//생성자
	private LocalDateTime createdDate;	//생성 시각
	private String modifiedBy;			//수정자
	private LocalDateTime modifiedDate;	//수정 시각
	
}
