package com.shiqiye.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shiqiye.dao.LianluoMapper;
import com.shiqiye.service.LianluoService;

@Service
public class LianluoServiceImpl implements LianluoService{
	@Resource
	private LianluoMapper lianluoMapper;
}
