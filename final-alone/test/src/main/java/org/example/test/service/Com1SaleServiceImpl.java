package org.example.test.service;

import org.example.test.dto.Com1SaleDto;
import org.example.test.dto.SaleRequestDto;
import org.example.test.mappers.Com1SaleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Com1SaleServiceImpl implements Com1SaleService{

    @Autowired private Com1SaleMapper com1SaleMapper;

    @Override
    public int insert(Com1SaleDto dto) {
        return com1SaleMapper.insert(dto);
    }

    @Override
    public int update(Com1SaleDto dto) {
        return com1SaleMapper.update(dto);
    }

    @Override
    public int getStoreDaySale(SaleRequestDto dto) {
        return com1SaleMapper.getStoreDaySale(dto);
    }

    @Override
    public int getStoreMonthSale(SaleRequestDto dto) {
        return com1SaleMapper.getStoreMonthSale(dto);
    }

    @Override
    public int getStoreYearSale(SaleRequestDto dto) {
        return com1SaleMapper.getStoreYearSale(dto);
    }

    @Override
    public List<Com1SaleDto> getListAll() {
        return com1SaleMapper.getListAll();
    }

    @Override
    public List<Com1SaleDto> getListSaleByYear() {
        return com1SaleMapper.getListSaleByYear();
    }

    @Override
    public List<Com1SaleDto> getListSaleByMonth() {
        return com1SaleMapper.getListSaleByMonth();
    }

    @Override
    public List<Com1SaleDto> getListSaleByStore(int storeNum) {
        return com1SaleMapper.getListSaleByStore(storeNum);
    }

    @Override
    public List<Com1SaleDto> getListMonthSale(int storeNum) {
        return com1SaleMapper.getListMonthSale(storeNum);
    }

    @Override
    public List<Com1SaleDto> getListYearSale(int storeNum) {
        return com1SaleMapper.getListYearSale(storeNum);
    }

    @Override
    public List<Com1SaleDto> getListByDate(String date) {
        return com1SaleMapper.getListByDate(date);
    }
}
