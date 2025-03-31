package org.example.test.service;

import org.example.test.dto.UsingDto;
import org.example.test.mappers.UsingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsingServiceImpl implements UsingService{

    @Autowired private UsingMapper usingMapper;

    @Override
    public int insertUsing(String comName) {
        return usingMapper.insertUsing(comName);
    }

    @Override
    public int deleteUsing(int comId) {
        return usingMapper.deleteUsing(comId);
    }

    @Override
    public List<UsingDto> getList() {
        return usingMapper.getList();
    }

    @Override
    public List<Integer> getComIdList() {
        return usingMapper.getComIdList();
    }

    @Override
    public String getComName(int comId) {
        return usingMapper.getComName(comId);
    }
}
