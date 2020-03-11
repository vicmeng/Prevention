package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "cn-edu-bcu-ls-entity-Notice")
@Data
@NoArgsConstructor
public class Notice {
    /**
     * 公告id
     */
    @ApiModelProperty(value = "公告id")
    private Integer noticeId;

    /**
     * userid 学管负责人
     */
    @ApiModelProperty(value = "userid 学管负责人")
    private Integer userId;

    /**
     * 公告发布部门
     */
    @ApiModelProperty(value = "公告发布部门")
    private String noticePart;

    /**
     * 公告标题
     */
    @ApiModelProperty(value = "公告标题")
    private String noticeTitle;

    /**
     * 公告内容
     */
    @ApiModelProperty(value = "公告内容")
    private String noticeText;

    /**
     * 公告图片
     */
    @ApiModelProperty(value = "公告图片")
    private String noticePic;

    /**
     * 公告上传日期
     */
    @ApiModelProperty(value = "公告上传日期")
    private Date noticeDate;

    /**
     * 公告状态 0：未上架 1：上架
     */
    @ApiModelProperty(value = "公告状态 0：未上架 1：上架")
    private Integer noticeState;
}