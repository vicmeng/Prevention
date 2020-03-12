package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Article")
@Data
@NoArgsConstructor
public class Article {
    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
    private Integer articleId;

    /**
    * 文章主人公
    */
    @ApiModelProperty(value="文章主人公")
    private String userId;

    /**
    * 发布者id
    */
    @ApiModelProperty(value="发布者id")
    private String userAdminId;

    /**
    * 文章可见范围（全部或学部编号）
    */
    @ApiModelProperty(value="文章可见范围（全部或学部编号）")
    private String articleScope;

    /**
    * 文章标题
    */
    @ApiModelProperty(value="文章标题")
    private String articleTitle;

    /**
    * 文章内容
    */
    @ApiModelProperty(value="文章内容")
    private String articleText;

    /**
    * 文章图片
    */
    @ApiModelProperty(value="文章图片")
    private String articlePic;

    /**
    * 文章点赞量
    */
    @ApiModelProperty(value="文章点赞量")
    private Integer articleLike;

    /**
    * 文章发布日期
    */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy年MM月dd日HH点mm分ss秒")
    @ApiModelProperty(value="文章发布日期")
    private Date articleDate;

    /**
    * 文章类型 0：好人好事 1：学习记录
    */
    @ApiModelProperty(value="文章类型 0：好人好事 1：学习记录")
    private Integer articleType;

    /**
    * 文章状态
    */
    @ApiModelProperty(value="文章状态")
    private Integer articleState;
}