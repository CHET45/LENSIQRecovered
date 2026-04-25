package com.lensiq.recovered.base

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import com.lensiq.recovered.translate.AsrSessionState
import com.lensiq.recovered.translate.TranslationSocketStrategy

abstract class BaseAsrTransActivity : AppCompatActivity() {
    protected val audioPermissions = arrayOf(Manifest.permission.RECORD_AUDIO, Manifest.permission.BLUETOOTH_CONNECT)
    protected var sourceLanguage: String = "auto"
    protected var targetLanguage: String = "en"
    protected val asrState = AsrSessionState()
    protected var socketStrategy: TranslationSocketStrategy? = null
    protected open fun startAsrSocket() { socketStrategy?.connect(sourceLanguage, targetLanguage) }
    protected open fun startAsr() { asrState.isRecording = true }
    protected open fun stopAsr() { asrState.isRecording = false; socketStrategy?.disconnect() }
    protected open fun onPartialTranscription(text: String) {}
    protected open fun onFinalTranslation(source: String, translated: String) {}
}
