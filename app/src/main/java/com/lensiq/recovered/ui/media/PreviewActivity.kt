package com.lensiq.recovered.ui.media

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply { text = "Media preview placeholder" })
    }
}
