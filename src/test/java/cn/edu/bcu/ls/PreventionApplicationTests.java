package cn.edu.bcu.ls;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.radians;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import cn.edu.bcu.ls.entity.ReportTemp;
import cn.edu.bcu.ls.entity.UserTemp;
import cn.edu.bcu.ls.utils.RedisUtil;

@SpringBootTest
class PreventionApplicationTests {
	@Autowired
	private RedisUtil redisUtil;
	 @Autowired
	    private ApplicationContext appCtx;

	    @Autowired
	    private StringEncryptor codeSheepEncryptorBean;

	@Test
	void contextLoads() {
		// redisUtil.set("5", 4);
			System.out.println(redisUtil.get("4"));
		
	}
	

}
