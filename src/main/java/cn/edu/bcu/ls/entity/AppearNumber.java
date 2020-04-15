package cn.edu.bcu.ls.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class AppearNumber {
    @ApiModelProperty(value = "问题上报ID")
    private Integer appear_id;
    @ApiModelProperty(value = "问题上报者ID")
    private String appear_userid;
    @ApiModelProperty(value = "问题上报接收人ID")
    private String appear_userid2;

}
