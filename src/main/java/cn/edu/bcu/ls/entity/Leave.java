package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.edu.bcu.ls.config.IgnoreSwaggerParameter;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-edu-bcu-ls-entity-Leave")
@Data
@NoArgsConstructor
public class Leave {
    /**
     * 请假id
     */
    @ApiModelProperty(value = "请假id")
    private Integer leaveId;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private String userId;

    /**
     * 请假说明
     */
    @ApiModelProperty(value = "请假说明")
    private String leaveText;

    /**
     * 请假证明
     */
    @ApiModelProperty(value = "请假证明")
    private String leavePic;

    /**
     * 请假类别 0：事假 1：病假
     */
    @ApiModelProperty(value = "请假类别 0：事假 1：病假")
    private Integer leaveType;

    /**
     * 请假开始日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "请假开始日期")
    private Date leaveStartDate;
    
    @ApiModelProperty(value = "请假开始日期 时间传这个")
    private String leaveStartDateString;

    /**
     * 请假结束日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "请假结束日期")
    private Date leaveEndDate;
    
    @ApiModelProperty(value = "请假结束日期 时间传这个")
    private String leaveEndDateString;

    /**
     * 请假单发布时间
     */
    @ApiModelProperty(value = "请假单发布时间")
    private Date leavePostDate;

    /**
     * 请假状态 0：未审核 1：驳回 2：通过
     */
    @ApiModelProperty(value = "请假状态 0：未审核 1：驳回 2：通过")
    private Integer leaveState;
    
    @IgnoreSwaggerParameter
    private User user;
}