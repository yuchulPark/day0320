package com.bit.exam05;

public class MssqlArticleDAO implements ArticleDAO {
	@Override
	public void insert() {
		System.out.println("DBMS mssql 기반으로 insert를 수행함");
	}
}
