package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.Meeting;
import com.meeting.summary.domain.Users;

/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface UsersMapper {

    // 회원 가입
    int insert(Users userDto);

    // 회원 수정
    int update(@Param("userId") Long userId, @Param("user") Users userDto);
    
    // 회원 삭제
    int delete(@Param("userId") Long userId);
    
    // 회원 조회
    Users findByUserId(@Param("userId") Long userId);

}
