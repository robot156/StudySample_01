package com.example.studysample_01.view

import android.util.Log
import androidx.lifecycle.*
import com.example.studysample_01.data.model.BookInfoModel
import com.example.studysample_01.data.model.BookSearchMapper
import com.example.studysample_01.domain.BookSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val bookSearchUseCase: BookSearchUseCase
) : ViewModel() {

    private val _documentData by lazy { MutableLiveData<List<BookInfoModel>>() }
    val documentData: LiveData<List<BookInfoModel>> get() = _documentData

    init {
        bookSearch()
    }

    private fun bookSearch() = viewModelScope.launch(Dispatchers.IO) {

        try {
            val entity = bookSearchUseCase.getSearchBookInfo(getKeyword())
            val model = BookSearchMapper.fromEntityModel(entity)
            _documentData.postValue(model.items)

        } catch (e: Exception) {
            Log.d("로그", "error $e")
        }
    }

    private fun getKeyword(): String {

        savedStateHandle.get<String>(DetailActivity.BOOK_SEARCH_KEYWORD)?.let { keyword ->
            return keyword
        }
        return ""
    }
}