package org.example.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("UsingDto")
@Builder
public class UsingDto {
    private int comNum;
    private String comName;
    private int comId;
    private String createdAt;
}
