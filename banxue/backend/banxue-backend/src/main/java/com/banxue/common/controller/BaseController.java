package com.banxue.common.controller;

import org.springframework.stereotype.Controller;

import com.banxue.system.domain.UserDO;
import com.banxue.utils.ShiroUtils;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}