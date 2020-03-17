package com.shiqiye.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shiqiye.bean.Lianluo;
import com.shiqiye.bean.Peijian;

public interface LianluoService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询配件数据
	 * @return
	 * @return: List<Lianluo>
	 */
	PageInfo<Lianluo> selects(Lianluo lianluo,Integer page,Integer pageSize);
	
	/**
	 * 
	 * @Title: peijian 
	 * @Description: 配件查询
	 * @return
	 * @return: List<Peijian>
	 */
	List<Peijian> peijian();

	
	/**
	 * 
	 * @Title: peijian_id 
	 * @Description: 配件ID查询
	 * @return
	 * @return: String
	 */
	String peijian_id(Integer id);
	
	
	int insert(Lianluo lianluo, Peijian peijian);
}
