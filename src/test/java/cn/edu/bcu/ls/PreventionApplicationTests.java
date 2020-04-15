package cn.edu.bcu.ls;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.radians;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.edu.bcu.ls.entity.ReportTemp;
import cn.edu.bcu.ls.entity.UserTemp;
import cn.edu.bcu.ls.utils.RedisUtil;

@SpringBootTest
class PreventionApplicationTests {
	@Autowired
	private RedisUtil redisUtil;
	@Test
	void contextLoads() {
		
		redisUtil.set("1", 1);
		System.out.println(redisUtil.get("1"));
	}

}
