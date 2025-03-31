package org.example.test.service;

import org.example.test.dto.Com1CeoDto;
import org.example.test.mappers.Com1CeoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Com1CeoServiceImpl implements Com1CeoService{

    @Autowired private Com1CeoMapper com1CeoMapper;

    @Override
    public int insert(Com1CeoDto dto) {
        return com1CeoMapper.insert(dto);
    }

    @Override
    public int delete(int empNo) {
        return com1CeoMapper.delete(empNo);
    }

    @Override
    public int update(Com1CeoDto dto) {
        return com1CeoMapper.update(dto);
    }

    @Override
    public Com1CeoDto getData(int empNo) {
        return com1CeoMapper.getData(empNo);
    }

    @Override
    public List<Com1CeoDto> getList() {
        return com1CeoMapper.getList();
    }

    @Override
    public long isDuplicateECall(String eCall) {
        return com1CeoMapper.isDuplicateECall(eCall);
    }

    @Override
    public long isDuplicateEmail(String email) {
        return com1CeoMapper.isDuplicateEmail(email);
    }
}
