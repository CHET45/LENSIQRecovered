package com.lensiq.recovered.data.ai

class AiChatRepository private constructor() {
    private val messages = mutableListOf<AiChatMessage>()
    suspend fun save(message: AiChatMessage) { messages += message }
    suspend fun history(): List<AiChatMessage> = messages.toList()
    companion object { fun inMemory() = AiChatRepository() }
}
