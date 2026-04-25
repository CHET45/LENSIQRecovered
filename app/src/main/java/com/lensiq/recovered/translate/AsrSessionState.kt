package com.lensiq.recovered.translate

data class AsrSessionState(
    var isRecording: Boolean = false,
    var lastPartialText: String = "",
    var lastFinalText: String = ""
)
