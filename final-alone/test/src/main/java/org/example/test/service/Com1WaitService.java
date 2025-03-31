package org.example.test.service;

import org.example.test.dto.Com1WaitDto;

import java.util.List;

public interface Com1WaitService {
    int insert(Com1WaitDto dto);
    int delete(int empNo);
    Com1WaitDto getData(int empNo);
    List<Com1WaitDto> getListAdmin();
    List<Com1WaitDto> getListStaff();
    List<Com1WaitDto> getListPart();
}
