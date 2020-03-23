package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.DeptDAO;
import com.bit.dao.EmpDAO;
import com.bit.vo.EmpVO;

@Controller
public class EmpController {
	@Autowired
    private DeptDAO ddao;
    @Autowired
    private EmpDAO edao;
    public void setDdao(DeptDAO ddao) {
        this.ddao = ddao;
    }
    public void setEdao(EmpDAO edao) {
        this.edao = edao;
    }
    @RequestMapping(value = "/insertEmp.do",method = RequestMethod.GET)
    public ModelAndView insertForm() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("dList", ddao.listAll());
        mav.addObject("mList", edao.managerList());
        return mav;
    }
    @RequestMapping(value = "/insertEmp.do",method = RequestMethod.POST)
    public ModelAndView insertSumbit(EmpVO e) {
        ModelAndView mav = new ModelAndView();
        int re = edao.insertEmp(e);
        mav.addObject("re", re);
        return mav;
    }
}
