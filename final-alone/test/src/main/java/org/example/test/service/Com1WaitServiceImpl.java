package org.example.test.service;

import org.example.test.dto.Com1WaitDto;
import org.example.test.mappers.Com1WaitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Com1WaitServiceImpl implements Com1WaitService{

    @Autowired private Com1WaitMapper com1WaitMapper;

    @Override
    public int insert(Com1WaitDto dto) {
        return com1WaitMapper.insert(dto);
    }

    @Override
    public int delete(int empNo) {
        return com1WaitMapper.delete(empNo);
    }

    @Override
    public Com1WaitDto getData(int empNo) {
        return com1WaitMapper.getData(empNo);
    }

    @Override
    public List<Com1WaitDto> getListAdmin() {
        return com1WaitMapper.getListAdmin();
    }

    @Override
    public List<Com1WaitDto> getListStaff() {
        return com1WaitMapper.getListStaff();
    }

    @Override
    public List<Com1WaitDto> getListPart() {
        return com1WaitMapper.getListPart();
    }
}
