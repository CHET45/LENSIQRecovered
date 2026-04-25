package com.lensiq.recovered.ai

object AiWebSocketManager {
    var connected: Boolean = false
        private set
    fun connect() { connected = true }
    fun disconnect() { connected = false }
    fun sendVoiceChunk(bytes: ByteArray) { require(connected) { "AI socket is not connected" } }
    fun sendText(text: String) { require(connected) { "AI socket is not connected" } }
}
