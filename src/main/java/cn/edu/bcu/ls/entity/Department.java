package cn.edu.bcu.ls.entity;

import cn.edu.bcu.ls.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Department")
@Data
@NoArgsConstructor
public class Department {
    /**
    * 学部编号
    */
    @ApiModelProperty(value="学部编号")
    private Integer depId;

    /**
    * 学部名称
    */
    @ApiModelProperty(value="学部名称")
    private String depName;

    /**
    * 学部主任用户编号
    */
    @ApiModelProperty(value="学部主任用户编号")
    private String depLeaderId;

    /**
    * 学部主任姓名
    */
    @ApiModelProperty(value="学部主任姓名")
    private String depLeaderName;

    /**
    * 学部主任电话
    */
    @ApiModelProperty(value="学部主任电话")
    private String depLeaderPhone;

    /**
    * 学部主任邮箱
    */
    @ApiModelProperty(value="学部主任邮箱")
    private String depLeaderEmail;
    
    @IgnoreSwaggerParameter
    private User user;
}