package com.shiqiye.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shiqiye.bean.Lianluo;
import com.shiqiye.bean.Peijian;
import com.shiqiye.dao.LianluoMapper;
import com.shiqiye.service.LianluoService;

@Service
public class LianluoServiceImpl implements LianluoService{
	@Resource
	private LianluoMapper lianluoMapper;

	@Override
	public PageInfo<Lianluo> selects(Lianluo lianluo,Integer page,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		List<Lianluo> list = lianluoMapper.selects(lianluo);
		return new PageInfo<Lianluo>(list);
	}

	@Override
	public List<Peijian> peijian() {
		// TODO Auto-generated method stub
		return lianluoMapper.peijian();
	}

	@Override
	public String peijian_id(Integer id) {
		// TODO Auto-generated method stub
		return lianluoMapper.peijian_id(id);
	}

	@Override
	public int insert(Lianluo lianluo, Peijian peijian) {
		// TODO Auto-generated method stub
		Integer peijian_id = peijian.getId();
		lianluo.setPeijian_id(peijian_id);
		try {
			lianluoMapper.addlianluo(lianluo);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
