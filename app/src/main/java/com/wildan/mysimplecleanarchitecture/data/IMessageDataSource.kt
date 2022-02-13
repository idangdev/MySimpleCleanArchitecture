package com.wildan.mysimplecleanarchitecture.data

import com.wildan.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}