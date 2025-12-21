package com.meeting.summary.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data				//Getter, Setter
@NoArgsConstructor	//기본 생성자(파라미터 없는 생성자) 생성 가능
@AllArgsConstructor	//모든 필드를 파라미터로 받는 생성자 생성 가능 
@Builder			//빌더 패턴 사용 가능
/*GPT가 요약한 회의록 */
public class MeetingSummary {
	private Long meetingSummaryId;		//회의록 요약 고유번호(SEQ)
	private Long userId;				//사용자 고유번호(FK)
	private Long meetingId;				//회의록 고유번호(FK)
	private String summaryType;			//회의록 요약 타입(요약, 자세히 요약 등)
	private String summaryTitle;		//회의록 제목
	private String summaryBody;			//회의록 요약 내용
	private Integer useToken;			//사용한 토큰 수
	private boolean deleted;			//삭제 여부. 기본값 false, 삭제 시 true
	private String createdBy;			//생성자
	private LocalDateTime createdDate;	//생성 시각
	private String modifiedBy;			//수정자
	private LocalDateTime modifiedDate;	//수정 시각
	
}
