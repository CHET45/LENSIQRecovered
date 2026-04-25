package com.lensiq.recovered.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lensiq.recovered.storage.AppPreferences
import com.lensiq.recovered.ui.auth.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prefs = AppPreferences(this)
        val next = if (prefs.hasAcceptedPrivacy() && prefs.hasValidToken()) MainActivity::class.java else LoginActivity::class.java
        startActivity(Intent(this, next))
        finish()
    }
}
