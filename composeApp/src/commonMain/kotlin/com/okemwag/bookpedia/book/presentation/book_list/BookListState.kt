package com.okemwag.bookpedia.book.presentation.book_list

import com.okemwag.bookpedia.book.domain.Book
import com.okemwag.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)