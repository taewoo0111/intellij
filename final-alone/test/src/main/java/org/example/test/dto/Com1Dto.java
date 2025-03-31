package org.example.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Alias("Com1Dto")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Com1Dto {
    private int comNum;
    private String storeCall;
}
