package cn.edu.bcu.ls.entity;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Love")
@Data
@NoArgsConstructor
public class Love {
    /**
    * 点赞id
    */
    @ApiModelProperty(value="点赞id")
    private Integer loveId;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private String userId;

    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
    private Integer articleId;
    
    
    
}