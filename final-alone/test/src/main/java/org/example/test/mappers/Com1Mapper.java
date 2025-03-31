package org.example.test.mappers;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Com1Mapper {
    // storeCall 로 insert 하는 메소드
    int insertStore(String storeCall);
    // storeNum 으로 delete 하는 메소드
    int deleteStore(int storeNum);
    // storeNum 의 목록을 가져오는 메소드
    List<Integer> getStoreNumList();
}
