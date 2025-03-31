package org.example.test.service;

import org.example.test.mappers.Com1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Com1ServiceImpl implements Com1Service{

    @Autowired private Com1Mapper com1Mapper;

    @Override
    public int insertStore(String storeCall) {
        return com1Mapper.insertStore(storeCall);
    }

    @Override
    public int deleteStore(int storeNum) {
        return com1Mapper.deleteStore(storeNum);
    }

    @Override
    public List<Integer> getStoreNumList() {
        return com1Mapper.getStoreNumList();
    }
}
