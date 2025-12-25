package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Team;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface TeamMapper {

    // 팀 등록
    int insert(Team teamDto);

    // 팀 수정
    int update(@Param("userId") Long userId, @Param("teamId") Long teamId, @Param("team") Team teamDto);
    
    // 팀 삭제
    int delete(@Param("userId") Long userId, @Param("teamId") Long teamId);
    
    // 팀 조회
    Team findByUserId(@Param("userId") Long userId, @Param("teamId") Long teamId);

}
