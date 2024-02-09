package br.com.newsapp.presentation.bookmark

import br.com.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)