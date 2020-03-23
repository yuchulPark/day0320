package com.bit.exam05;

public class WriteArticleServiceImpl {
	private ArticleDAO articleDAO;
	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	public void pro() {
		articleDAO.insert();
	}
}
