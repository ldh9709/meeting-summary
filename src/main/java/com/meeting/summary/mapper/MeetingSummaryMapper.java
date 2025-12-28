package com.meeting.summary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.meeting.summary.domain.MeetingSummary;


/*
 * Param : MyBatis에서 사용하는 #{userId}와 같아야함 
 */
@Mapper
public interface MeetingSummaryMapper {

    // 회의록 요약 등록(성공 시 1 반환)
    int insert(MeetingSummary meetingSummaryDto);

    // 회의록 요약 수정
    int update(@Param("userId") Long userId, @Param("meetingSummaryId") Long meetingSummaryId, @Param("meetingSummary") MeetingSummary meetingSummaryDto);
    
    // 회의록 요약 삭제
    int delete(@Param("userId") Long userId, @Param("meetingSummaryId") Long meetingSummaryId);
    
    // 회의록 요약 조회
    MeetingSummary findByMeetingSummaryId(@Param("meetingSummaryId") Long meetingSummaryId);

    // 회의록 요약 목록 조회
    List<MeetingSummary> findAllByUserId(@Param("userId") Long userId);

}
