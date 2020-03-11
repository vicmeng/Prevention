package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-edu-bcu-ls-entity-Clazz")
@Data
@NoArgsConstructor
public class Clazz {
    /**
     * 班级编号
     */
    @ApiModelProperty(value = "班级编号")
    private Integer clazzId;

    /**
     * 所属学部编号
     */
    @ApiModelProperty(value = "所属学部编号")
    private Integer depId;

    /**
     * 班级辅导员用户编号
     */
    @ApiModelProperty(value = "班级辅导员用户编号")
    private Integer clazzTeacherId;

    /**
     * 班级名称
     */
    @ApiModelProperty(value = "班级名称")
    private String clazzName;
}