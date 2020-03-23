package com.bit.exam;

public class WriterArticleServiceImpl {
	private ArticleDAO articleDAO;

	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	public void pro() {
		articleDAO.insert();
	}
}
