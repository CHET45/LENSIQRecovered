package com.lensiq.recovered.data.ai

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ai_chat_messages")
data class AiChatMessage(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val role: String,
    val text: String,
    val createdAt: Long = System.currentTimeMillis()
) {
    companion object {
        fun user(text: String) = AiChatMessage(role = "user", text = text)
        fun assistant(text: String) = AiChatMessage(role = "assistant", text = text)
    }
}
