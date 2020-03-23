package com.bit.exam06;

public class WriteArticleServiceImpl {
	private ArticleDAO articleDAO;
	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	public void pro() {
		articleDAO.insert();
	}
}