package org.example.test.service;

import org.example.test.dto.Com1EmpDto;

import java.util.List;

public interface Com1EmpService {
    int insert(Com1EmpDto dto);
    int delete(int empNo);
    int update(Com1EmpDto dto);
    Com1EmpDto getData(int empNo);
    List<Com1EmpDto> getList();
    List<Com1EmpDto> getListAdmin();
    List<Com1EmpDto> getListStaff();
    List<Com1EmpDto> getListPart();
    List<Com1EmpDto> getListByStoreNum(int storeNum);
    long getCount(Com1EmpDto dto);
    long isDuplicateECall(String eCall);
    long isDuplicateEmail(String email);
    List<Com1EmpDto> getListPaging(Com1EmpDto dto);
    List<Com1EmpDto> getListPagingStaff(Com1EmpDto dto);
    List<Com1EmpDto> getListPagingPart(Com1EmpDto dto);
}
