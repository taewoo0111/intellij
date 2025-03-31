package org.example.test.service;

import java.util.List;

public interface Com1Service {
    int insertStore(String storeCall);
    int deleteStore(int storeNum);
    List<Integer> getStoreNumList();
}
