package cn.edu.bcu.ls.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.entity.ReportNumber;
import cn.edu.bcu.ls.entity.ReportTemp;
import cn.edu.bcu.ls.entity.UserDor;
import cn.edu.bcu.ls.entity.UserTemp;
import cn.edu.bcu.ls.mapper.ReportMapper;
import cn.edu.bcu.ls.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;

	@Override
	public int deleteByPrimaryKey(Integer reportId) {
		// TODO Auto-generated method stub
		return reportMapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.insert(record);
	}

	@Override
	public int insertSelective(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.insertSelective(record);
	}

	@Override
	public List<Report> selectByPrimaryKey(ReportNumber reportNumber) {
		// TODO Auto-generated method stub
		return reportMapper.selectByPrimaryKey(reportNumber);
	}

	@Override
	public int updateByPrimaryKeySelective(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Report record) {
		// TODO Auto-generated method stub
		return reportMapper.updateByPrimaryKey(record);
	}

	public List<ReportTemp> queryTemp(String user_id, String date) {

		List<UserDor> queryUserId = reportMapper.queryUserId(user_id);
		List<ReportTemp> reportTemps = new ArrayList<>();
		for (UserDor userDor : queryUserId) {
			ReportTemp reportTemp = new ReportTemp();

			List<UserTemp> queryTemp = reportMapper.queryTemp(userDor.getUser_id());
			List<UserTemp> queryTemps = new ArrayList<UserTemp>();
//			System.out.println(queryTemp.get(0));
			for (int i = 0; i < queryTemp.size(); i++) {
				
				SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd");
				String time= bjSdf.format( queryTemp.get(i).getClock_time());
				
				if (time.equals(date)) {
					System.out.println(queryTemp.get(i));
					while (i < queryTemp.size()) {

						queryTemps.add(queryTemp.get(i));
						
						i++;
					}

				}
			}
			reportTemp.setUserTemps(queryTemps);
			reportTemp.setUser_name(userDor.getUser_name());
			reportTemp.setDormitory_build_id(userDor.getDormitory_build_id());
			reportTemp.setDormitory_house_id(userDor.getDormitory_house_id());
			reportTemps.add(reportTemp);
		}

		return reportTemps;

	}

}
