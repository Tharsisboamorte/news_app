package br.com.newsapp.domain.usecases.news


import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import br.com.newsapp.data.local.NewsDao
import br.com.newsapp.domain.model.Article

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}