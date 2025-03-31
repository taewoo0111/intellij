package org.example.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Alias("SaleRequestDto")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleRequestDto {
    private String salesDate;
    private int storeNum;
    private int year;
    private int month;
    //private int week;
}
