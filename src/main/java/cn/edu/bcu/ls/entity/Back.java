package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cn.edu.bcu.ls.config.IgnoreSwaggerParameter;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Back")
@Data
@NoArgsConstructor
public class Back {
    /**
    * 返回id
    */
    @ApiModelProperty(value="返回id")
    private Integer backId;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private String userId;

    /**
    * 返回地(省市区)
    */
    @ApiModelProperty(value="返回地(省市区)")
    private String backPlace;

    /**
    * 交通工具：飞机-》地铁-》公交 自驾
    */
    @ApiModelProperty(value="交通工具：飞机-》地铁-》公交 自驾")
    private String backTraffic;

    /**
    * 交通工具车次号、以及时间（小程序需要提示 地铁、公交 的乘坐时间）
    */
    @ApiModelProperty(value="交通工具车次号、以及时间（小程序需要提示 地铁、公交 的乘坐时间）")
    private String backTrafficNo;

    /**
    * 车票信息(图片 自驾不用上传此项)
    */
    @ApiModelProperty(value="车票信息(图片 自驾不用上传此项)")
    private String backTrafficPic;
    
    
    @ApiParam(hidden = true)
    private List<String> TrafficPics;

    /**
    * 返校目标时间
    */
    @ApiModelProperty(value="返校目标时间")
    private Date backTargetTime;

    /**
    * 返回登记/申请 发送时间
    */
    @ApiModelProperty(value="返回登记/申请 发送时间")
    private Date backPostTime;

    /**
    * 返回原因
    */
    @ApiModelProperty(value="返回原因")
    private String backReason;

    /**
    * 返校证明(图片)
    */
    @ApiModelProperty(value="返校证明(图片)")
    private String backCert;
    @ApiParam(hidden = true)
    private List<String> Certs111;
    /**
    * 是否发热 0：不发热 1：发热
    */
    @ApiModelProperty(value="是否发热 0：不发热 1：发热")
    private Integer backIsferver;

    /**
    * 是否有接触式 0：否 1：是
    */
    @ApiModelProperty(value="是否有接触式 0：否 1：是")
    private Integer backIscontact;

    /**
    * 是否就医 0：否 1：是
    */
    @ApiModelProperty(value="是否就医 0：否 1：是")
    private Integer backIshospital;

    /**
    * 返校类别 0：申请 1：登记
    */
    @ApiModelProperty(value="返校类别 0：申请 1：登记")
    private Integer backType;

    /**
    * 是否审批 0：无 1：有
    */
    @ApiModelProperty(value="是否审批 0：无 1：有")
    private Integer backState;

    /**
    * 审批人
    */
    @ApiModelProperty(value="审批人")
    private String backApplyName;

    /**
    * 审批不通过原因
    */
    @ApiModelProperty(value="审批不通过原因")
    private String backRefuseReason;
    
    @IgnoreSwaggerParameter
    private User user;
}