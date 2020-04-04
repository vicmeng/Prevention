package cn.edu.bcu.ls;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.edu.bcu.ls.entity.ReportTemp;
import cn.edu.bcu.ls.entity.UserTemp;

@SpringBootTest
class PreventionApplicationTests {

	@Test
	void contextLoads() {
		List<ReportTemp> reportTemps = new ArrayList<ReportTemp>();
		// 标题
		List<String> text = null;
		// 每个人的名字
		List<String> name = null;
		// 每一天的度数
		List<List<Float>> tempList = null;
		// 一天中同宿舍人的度数
		List<Float> tem = new ArrayList<Float>();
		for (int i = 0; i < reportTemps.size(); i++) {
			// 获取i天的温度
			for (int k = 0; k < 5; k++) {
				// 获取每个i人中每个k天的温度
				Float clock_temp = reportTemps.get(k).getUserTemps().get(i).getClock_temp();
				tem.add(clock_temp);
			}

			// 把第i天温度插入数组

			tempList.add(tem);
		}
		// 遍历大数组
		for (ReportTemp reportTemp : reportTemps) {
			// 设置角标
			int j = 0;
			// 添加标题
			text.add(reportTemp.getUserTemps().get(j).getClock_time().toString());

			// 把获取人名

			name.add(reportTemp.getUser_name());

			j++;
		}

	}

}
