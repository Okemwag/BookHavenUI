package com.okemwag.bookpedia.book.data.network

import com.okemwag.bookpedia.book.data.dto.BookWorkDto
import com.okemwag.bookpedia.book.data.dto.SearchResponseDto
import com.okemwag.bookpedia.core.domain.DataError
import com.okemwag.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}