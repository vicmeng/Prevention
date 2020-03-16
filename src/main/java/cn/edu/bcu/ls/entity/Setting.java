package cn.edu.bcu.ls.entity;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Setting")
@Data
@NoArgsConstructor
public class Setting {
    /**
    * 设置编号
    */
    @ApiModelProperty(value="设置编号")
    private Integer settingId;

    /**
    * 学校名称
    */
    @ApiModelProperty(value="学校名称")
    private String settingSchoolName;

    /**
    * 首页轮播图
    */
    @ApiModelProperty(value="首页轮播图")
    private String settingPic;
    
    @ApiModelProperty(hidden = true)
    private List<String> Pic;
}