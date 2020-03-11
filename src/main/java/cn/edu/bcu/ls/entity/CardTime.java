package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-CardTime")
@Data
@NoArgsConstructor
public class CardTime {
    /**
    * 打卡时间
    */
    @ApiModelProperty(value="打卡时间")
    private Integer cardTimeId;

    /**
    * 打卡起始时间
    */
    @ApiModelProperty(value="打卡起始时间")
    private Date cardStartTime;

    /**
    * 打卡结束时间
    */
    @ApiModelProperty(value="打卡结束时间")
    private Date cardEndTime;

    /**
    * 打卡名称
    */
    @ApiModelProperty(value="打卡名称")
    private String cardTimeName;
}