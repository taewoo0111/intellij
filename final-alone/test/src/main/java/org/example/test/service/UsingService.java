package org.example.test.service;

import org.example.test.dto.UsingDto;

import java.util.List;

public interface UsingService {
    // 우리랑 계약하는 회사 추가
    int insertUsing(String comName);
    // 우리랑 계약하는 회사 삭제
    int deleteUsing(int comId);
    // 계약한 회사들 리스트로 반환
    List<UsingDto> getList();
    // 계약한 회사들의 comId를 리스트로 반환
    List<Integer> getComIdList();
    // comId로 회사 이름을 알아내는 메소드
    String getComName(int comId);
}
