package com.meeting.summary.domain;

import java.time.LocalDateTime;

/* 사용자 정보 */
public class User {
	private Long userId;					//사용자 고유번호(SEQ)
	private String loginId;					//사용자 ID
	private String userPassword; 			//사용자 비밀번호
	private String name; 					//사용자 이름
	private String email;					//사용자 이메일
	private String role;					//사용자 역할(관리자, 사용자)
	private LocalDateTime lastLoginDate;	//마지막으로 로그인한 시각
	private boolean isDeleted;				//삭제 여부. 기본값 false, 삭제 시 true
	private String createdBy;				//생성자
	private LocalDateTime createdDate;		//생성 시각
	private String modifiedBy;				//수정자
	private LocalDateTime modifiedDate;		//수정 시각
	
}
