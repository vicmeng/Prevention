package cn.edu.bcu.ls.entity;

import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ArticleNumber {
	@ApiModelProperty(value = "文章id")
	private Integer article_id;
	@ApiModelProperty(value = "文章可见范围（全部或学部编号）")
	private String article_scope;
	@ApiModelProperty(value = "文章类型 0：好人好事 1：学习记录")
	private Integer article_type;
	@ApiModelProperty(value="文章状态")
	private Integer article_state;
	@ApiModelProperty(value="发布人id")
	private String user_admin_id;
}
