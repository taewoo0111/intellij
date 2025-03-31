package org.example.test.service;

import org.example.test.dto.Com1SaleDto;
import org.example.test.dto.SaleRequestDto;

import java.util.List;

public interface Com1SaleService {
    int insert(Com1SaleDto dto);
    int update(Com1SaleDto dto);
    int getStoreDaySale(SaleRequestDto dto);
    int getStoreMonthSale(SaleRequestDto dto);
    int getStoreYearSale(SaleRequestDto dto);
    List<Com1SaleDto> getListAll();
    List<Com1SaleDto> getListSaleByYear();
    List<Com1SaleDto> getListSaleByMonth();
    List<Com1SaleDto> getListSaleByStore(int storeNum);
    List<Com1SaleDto> getListMonthSale(int storeNum);
    List<Com1SaleDto> getListYearSale(int storeNum);
    List<Com1SaleDto> getListByDate(String date);
}
