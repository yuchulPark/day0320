package com.bit.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.EmpVO;

public class EmpManager {
    private static SqlSessionFactory factory;
    static {
        try {
            Reader reader = 
                    Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
            factory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int insert(EmpVO e) {
        int re = -1;
        SqlSession session = factory.openSession(true);
        re = session.insert("emp.insert", e);
        session.close();
        return re;
    }
    public static List<EmpVO> managerList() {
        SqlSession session = factory.openSession();
        List<EmpVO> list =  session.selectList("emp.managerList");
        session.close();
        return list;
    }
}
