package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Tag;
import com.meeting.summary.domain.Team;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface MeetingTagMapper {

    // 팀 태그 등록
    int insert(@Param("userId") Long userId,@Param("meetingTag") Tag meetingTagDto);

    // 팀 태그 수정
    int update(@Param("userId") Long userId, @Param("meetingTagId") Long meetingTagId, @Param("meetingTag") Tag meetingTagDto);
    
    // 팀 태그 삭제
    int delete(@Param("userId") Long userId, @Param("meetingTagId") Long meetingTagId);
    
    // 팀 태그 조회
    Team findByUserId(@Param("userId") Long userId, @Param("meetingTagId") Long meetingTagId);
    
    // 팀 태그 목록 조회
    List<Tag> findAllByUserId(@Param("userId") Long userId);


}
