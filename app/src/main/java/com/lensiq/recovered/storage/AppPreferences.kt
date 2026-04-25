package com.lensiq.recovered.storage

import android.content.Context

class AppPreferences(context: Context) {
    private val prefs = context.getSharedPreferences("lensiq", Context.MODE_PRIVATE)
    fun hasAcceptedPrivacy(): Boolean = prefs.getBoolean("privacy_accepted", true)
    fun hasValidToken(): Boolean = prefs.getString("token", "local-dev")?.isNotBlank() == true
}
