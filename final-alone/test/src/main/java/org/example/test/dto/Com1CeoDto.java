package org.example.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Alias("Com1CeoDto")
public class Com1CeoDto {
    private int comId;
    private int empNo;
    private String eName;
    private String role;
    private String eCall;
    private String ePwd;
}
