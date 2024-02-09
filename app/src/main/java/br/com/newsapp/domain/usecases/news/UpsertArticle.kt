package br.com.newsapp.domain.usecases.news


import br.com.newsapp.data.local.NewsDao
import br.com.newsapp.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}