package com.bit.exam07;

public class MysqlArticleDAO implements ArticleDAO {
	@Override
	public void insert() {
		System.out.println("DBMS mysql기반 insert를 수행완료");
	}
}
