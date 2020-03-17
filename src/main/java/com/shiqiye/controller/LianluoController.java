package com.shiqiye.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.shiqiye.service.LianluoService;

@Controller
public class LianluoController {
	@Resource
	private LianluoService lianluoService;
}
