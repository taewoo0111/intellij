package org.example.test.service;

import org.example.test.dto.Com1EmpDto;
import org.example.test.mappers.Com1EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Com1EmpServiceImpl implements Com1EmpService{

    @Autowired private Com1EmpMapper com1EmpMapper;

    @Override
    public int insert(Com1EmpDto dto) {
        return com1EmpMapper.insert(dto);
    }

    @Override
    public int delete(int empNo) {
        return com1EmpMapper.delete(empNo);
    }

    @Override
    public int update(Com1EmpDto dto) {
        return com1EmpMapper.update(dto);
    }

    @Override
    public Com1EmpDto getData(int empNo) {
        return com1EmpMapper.getData(empNo);
    }

    @Override
    public List<Com1EmpDto> getList() {
        return com1EmpMapper.getList();
    }

    @Override
    public List<Com1EmpDto> getListAdmin() {
        return com1EmpMapper.getListAdmin();
    }

    @Override
    public List<Com1EmpDto> getListStaff() {
        return com1EmpMapper.getListStaff();
    }

    @Override
    public List<Com1EmpDto> getListPart() {
        return com1EmpMapper.getListPart();
    }

    @Override
    public List<Com1EmpDto> getListByStoreNum(int storeNum) {
        return com1EmpMapper.getListByStoreNum(storeNum);
    }

    @Override
    public long getCount(Com1EmpDto dto) {
        return com1EmpMapper.getCount(dto);
    }

    @Override
    public long isDuplicateECall(String eCall) {
        return com1EmpMapper.isDuplicateECall(eCall);
    }

    @Override
    public long isDuplicateEmail(String email) {
        return com1EmpMapper.isDuplicateEmail(email);
    }

    @Override
    public List<Com1EmpDto> getListPaging(Com1EmpDto dto) {
        return com1EmpMapper.getListPaging(dto);
    }

    @Override
    public List<Com1EmpDto> getListPagingStaff(Com1EmpDto dto) {
        return com1EmpMapper.getListPagingStaff(dto);
    }

    @Override
    public List<Com1EmpDto> getListPagingPart(Com1EmpDto dto) {
        return com1EmpMapper.getListPagingPart(dto);
    }
}
