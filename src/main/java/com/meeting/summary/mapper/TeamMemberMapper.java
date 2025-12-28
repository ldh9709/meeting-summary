package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Meeting;
import com.meeting.summary.domain.Team;
import com.meeting.summary.domain.TeamMember;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface TeamMemberMapper {

    // 팀 멤버 등록
    int insert(@Param("userId") Long userId, @Param("teamMember") TeamMember teamMemberDto);

    // 팀 멤버 수정
    int update(@Param("userId") Long userId, @Param("teamMemberId") Long teamMemberId, @Param("teamMember") Team teamMemberDto);
    
    // 팀 멤버 삭제
    int delete(@Param("userId") Long userId, @Param("teamMemberId") Long teamMemberId);
    
    // 팀 멤버 조회
    Team findByUserId(@Param("userId") Long userId, @Param("teamMemberId") Long teamMemberId);
    
    // 팀 멤버 목록 조회
    List<TeamMember> findAllByUserId(@Param("userId") Long userId);


}
