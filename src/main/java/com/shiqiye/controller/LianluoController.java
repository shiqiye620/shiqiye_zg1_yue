package com.shiqiye.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.shiqiye.bean.Lianluo;
import com.shiqiye.bean.Peijian;
import com.shiqiye.service.LianluoService;

@Controller
public class LianluoController {
	@Resource
	private LianluoService lianluoService;
	
	@RequestMapping("selects")
	private String selects(Model m,Lianluo lianluo,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize) {
		System.out.println(123);
		System.out.println(lianluo);
		PageInfo<Lianluo> info = lianluoService.selects(lianluo, page, pageSize);
		m.addAttribute("info", info);
		return "selects";
		
	}
	
	@RequestMapping("toAdd")
	private String toAdd() {
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("peijian")
	private Object peijian() {
		return lianluoService.peijian();
	}
	
	@ResponseBody
	@RequestMapping("peijian_id")
	private Object peijian_id(Integer id) {
		return lianluoService.peijian_id(id);
	}
	
	@ResponseBody
	@PostMapping("add")
	public boolean add(MultipartFile file,Lianluo lianluo,Peijian peijian,HttpSession session) {
		//文件上传
		if(null!=file && !file.isEmpty()) {
			String path="d:/pic/";
			//文件的原始名字
			String filename = file.getOriginalFilename();
			//为了防止文件重复名字,需要改变文件的名字
			String newfilename = UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
			
			File f = new File(path, newfilename);
			
			//把文件写入硬盘
			try {
				file.transferTo(f);
				lianluo.setJiagong_price(newfilename);//文件的名称
				
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lianluoService.insert(lianluo,peijian)>0;//增加文章;
	}
	
}
