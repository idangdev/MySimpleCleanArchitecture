package com.wildan.mysimplecleanarchitecture.di

import com.wildan.mysimplecleanarchitecture.data.IMessageDataSource
import com.wildan.mysimplecleanarchitecture.data.MessageDataSource
import com.wildan.mysimplecleanarchitecture.data.MessageRepository
import com.wildan.mysimplecleanarchitecture.domain.IMessageRepository
import com.wildan.mysimplecleanarchitecture.domain.MessageInteractor
import com.wildan.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}