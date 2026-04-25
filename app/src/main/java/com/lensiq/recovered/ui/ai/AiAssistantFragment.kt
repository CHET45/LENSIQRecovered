package com.lensiq.recovered.ui.ai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.lensiq.recovered.ai.AiWebSocketManager
import com.lensiq.recovered.data.ai.AiChatMessage
import com.lensiq.recovered.data.ai.AiChatRepository
import kotlinx.coroutines.launch

class AiAssistantFragment : Fragment() {
    private val repository by lazy { AiChatRepository.inMemory() }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL; setPadding(32, 32, 32, 32)
            addView(TextView(context).apply { text = "AI Assistant"; textSize = 22f })
            addView(Button(context).apply { text = "Start voice / duplex"; setOnClickListener { startAssistant() } })
        }
    }
    private fun startAssistant() {
        lifecycleScope.launch {
            repository.save(AiChatMessage.user("voice session started"))
            AiWebSocketManager.connect()
        }
    }
}
