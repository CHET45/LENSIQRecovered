package com.lensiq.recovered.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class MineFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL; setPadding(32, 32, 32, 32)
            addView(TextView(context).apply { text = "Profile / Settings"; textSize = 22f })
            addView(TextView(context).apply { text = "Device binding, language, feedback, about, privacy, battery permissions, alarm" })
        }
}
