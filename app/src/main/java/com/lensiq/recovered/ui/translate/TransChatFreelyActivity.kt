package com.lensiq.recovered.ui.translate

import android.os.Bundle
import android.widget.TextView
import com.lensiq.recovered.base.BaseAsrTransActivity

class TransChatFreelyActivity : BaseAsrTransActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply { text = "Free conversation translation" })
    }
}
