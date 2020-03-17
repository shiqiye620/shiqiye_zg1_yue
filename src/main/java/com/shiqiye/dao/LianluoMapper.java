package com.shiqiye.dao;

import java.util.List;

import com.shiqiye.bean.Lianluo;
import com.shiqiye.bean.Peijian;

public interface LianluoMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询配件数据
	 * @return
	 * @return: List<Lianluo>
	 */
	List<Lianluo> selects(Lianluo lianluo);
	
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

	void addlianluo(Lianluo lianluo);

}
