package com.wildan.mysimplecleanarchitecture.data

import com.wildan.mysimplecleanarchitecture.domain.IMessageRepository
import com.wildan.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}