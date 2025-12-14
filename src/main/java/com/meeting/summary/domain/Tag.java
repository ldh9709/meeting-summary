package com.meeting.summary.domain;

import java.time.LocalDateTime;

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
