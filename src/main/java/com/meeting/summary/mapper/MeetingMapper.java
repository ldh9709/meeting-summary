package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Meeting;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface MeetingMapper {

    // 회의록 등록(성공 시 1 반환)
    int insert(Meeting meetingDto);

    // 회의록 수정
    int update(@Param("userId") Long userId, @Param("meetingId") Long meetingId, @Param("meeting") Meeting meetingDto);
    
    // 회의록 삭제
    int delete(@Param("userId") Long userId, @Param("meetingId") Long meetingId);
    
    // 회의록 조회
    Meeting findByMeetingId(@Param("meetingId") Long meetingId);

    // 회의록 목록 조회
    List<Meeting> findAllByUserId(@Param("userId") Long userId);

}
