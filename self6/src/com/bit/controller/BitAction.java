package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BitAction {
	public String proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
