package com.example.studysample_01.utils

class Event<out T>(private val content: T) {

    private var hasBeenHandled = false // 하나의 이벤트 처리에 대해 한 번만 처리하기 위해서 사용

    fun getContentIfNotHandled(): T? {

        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

}