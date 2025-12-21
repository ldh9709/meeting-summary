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
/* 회의록 태그 정보 */
public class Tag {
	private Long tagId;					//태그 고유번호(SEQ)
	private String tagName; 			//태그 이름
	private boolean deleted;			//삭제 여부. 기본값 false, 삭제 시 true
	private String createdBy;			//생성자
	private LocalDateTime createdDate;	//생성 시각
	private String modifiedBy;			//수정자
	private LocalDateTime modifiedDate;	//수정 시각
}
