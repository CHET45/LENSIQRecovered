package com.lensiq.recovered.translate

interface TranslationSocketStrategy {
    fun connect(sourceLanguage: String, targetLanguage: String)
    fun sendPcm(bytes: ByteArray)
    fun disconnect()
}
