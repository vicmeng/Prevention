package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@ApiModel(value="cn-edu-bcu-ls-entity-Appear")
@Data
@NoArgsConstructor
public class Appear {
    /**
     * 问题上报ID
     */
    @ApiModelProperty(value = "问题上报ID")
    private Integer appear_id;

    /**
     * 问题上报者ID
     */
    @ApiModelProperty(value = "问题上报者ID")
    private String appear_userid;

    /**
     * 问题上报接收人ID
     */
    @ApiModelProperty(value = "问题上报接收人ID")
    private String appear_userid2;

    /**
     * 问题上报内容
     */
    @ApiModelProperty(value = "问题上报内容")
    private String appear_text;

    /**
     * 问题上报时间
     */
    @ApiModelProperty(value = "问题上报时间")
    private Date appear_posttime;
}
