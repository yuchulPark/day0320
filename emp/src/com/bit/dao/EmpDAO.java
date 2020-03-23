package com.bit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.db.EmpManager;
import com.bit.vo.EmpVO;

@Repository
public class EmpDAO {
	public int insertEmp(EmpVO e) {
        return EmpManager.insert(e);
    }
    public List<EmpVO> managerList(){
        return EmpManager.managerList();
    }
}
