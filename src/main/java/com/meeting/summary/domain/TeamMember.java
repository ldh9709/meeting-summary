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
/* 팀 정보 */
public class TeamMember {
	private Long teamMemberId;				//팀 멤버 고유번호(SEQ)
	private Long teamId;					//팀 고유번호(FK)
	private Long userId;					//사용자 고유번호(FK)
	private String role; 					//팀 직책 -> 추후 ENUM으로 변경
	private String status; 					//상태(가입/대기)
    private LocalDateTime joinedDate;		//가입일자
	private boolean deleted;				//삭제 여부. 기본값 false, 삭제 시 true
	private Long createdBy;					//생성자
	private LocalDateTime createdDate;		//생성 시각
	private Long modifiedBy;				//수정자
	private LocalDateTime modifiedDate;		//수정 시각
	
}
