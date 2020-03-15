package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.edu.bcu.ls.config.IgnoreSwaggerParameter;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-edu-bcu-ls-entity-Clock")
@Data
@NoArgsConstructor
public class Clock {
    /**
     * 打卡id
     */
    @ApiModelProperty(value = "打卡id")
    private Integer clockId;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private String userId;

    /**
     * 打卡时间编号
     */
    @ApiModelProperty(value = "打卡时间编号")
    private Integer cardTimeId;

    /**
     * 用户体温
     */
    @ApiModelProperty(value = "用户体温")
    private Double clockTemp;

    /**
     * 用户备注
     */
    @ApiModelProperty(value = "用户备注")
    private String clockRemark;

    /**
     * 打卡日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "打卡日期")
    private Date clockTime;

    /**
     * 是否不适  0：适 1：不适
     */
    @ApiModelProperty(value = "是否不适  0：适 1：不适")
    private Integer clockState;
    @IgnoreSwaggerParameter
    private User user;
    @IgnoreSwaggerParameter
    private CardTime cardTime;
}