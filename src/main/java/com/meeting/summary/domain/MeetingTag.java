package com.meeting.summary.domain;

/* 회의록과 태그 중간 테이블 */
public class MeetingTag {
	private Long meetingTagId;	//중간 테이블 고유 번호(SEQ)
	private Long meetingId;		//회의록 번호(FK)
	private Long tagId;			//태그 번호(FK)
}