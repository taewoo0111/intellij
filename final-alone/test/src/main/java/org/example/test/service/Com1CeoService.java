package org.example.test.service;

import org.example.test.dto.Com1CeoDto;

import java.util.List;

public interface Com1CeoService {
    int insert(Com1CeoDto dto);
    int delete(int empNo);
    int update(Com1CeoDto dto);
    Com1CeoDto getData(int empNo);
    List<Com1CeoDto> getList();
    long isDuplicateECall(String eCall);
    long isDuplicateEmail(String email);
}
