package com.lensiq.recovered.ui.translate

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.lensiq.recovered.base.BaseAsrTransActivity

class RealTimeTranslationActivity : BaseAsrTransActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; setPadding(32, 32, 32, 32)
            addView(TextView(context).apply { text = "Real-time translation" })
            addView(Button(context).apply { text = "Start"; setOnClickListener { startAsrSocket(); startAsr() } })
        })
    }
}
