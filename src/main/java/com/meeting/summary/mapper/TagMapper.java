package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Meeting;
import com.meeting.summary.domain.Tag;
import com.meeting.summary.domain.Team;
import com.meeting.summary.domain.TeamMember;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface TagMapper {

    // 태그 등록
    int insert(@Param("userId") Long userId, @Param("tag") Tag tagDto);

    // 태그 수정
    int update(@Param("userId") Long userId, @Param("tagId") Long tagId, @Param("tag") Tag tagDto);
    
    // 태그 삭제
    int delete(@Param("userId") Long userId, @Param("tagId") Long tagId);
    
    // 태그 조회
    Team findByUserId(@Param("userId") Long userId, @Param("tagId") Long tagId);
    
    // 태그 목록 조회
    List<Tag> findAllByUserId(@Param("userId") Long userId);


}
