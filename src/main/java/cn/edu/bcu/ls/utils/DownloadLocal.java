package cn.edu.bcu.ls.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author 11379
 *
 */
@CrossOrigin(origins = { "http://localhost:8080", "null" })
public class  DownloadLocal {
	/**
	 * 
	 * @param request
	 * @param response
	 * @param r_content 
	 * 下载文档使用
	 */
	public static void downloadLocal(HttpServletRequest request, HttpServletResponse response,String r_content) {
		try {
			
			
	        // 得到f文件夹下面的所有文件。
		
			
			
			
			String filePath = r_content;
			System.out.println(filePath);
			//ClassPathResource cpr = new ClassPathResource(filePath);
			InputStream in = new FileInputStream(filePath);   
			HSSFWorkbook wb = new HSSFWorkbook(in);

			
			// 输出Excel文件

			OutputStream output = response.getOutputStream();

			response.reset();

			// 设置文件头

			response.setHeader("Content-Disposition",

					"attchement;filename=" + new String("报告信息.xls".getBytes("gb2312"), "ISO8859-1"));

			response.setContentType("application/msexcel");

			wb.write(output);

			wb.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
