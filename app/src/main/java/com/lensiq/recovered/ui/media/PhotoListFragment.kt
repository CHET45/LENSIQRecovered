package com.lensiq.recovered.ui.media

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.lensiq.recovered.media.MediaImportCoordinator

class PhotoListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL; setPadding(32, 32, 32, 32)
            addView(TextView(context).apply { text = "Album / Media import"; textSize = 22f })
            addView(Button(context).apply { text = "Import from glasses"; setOnClickListener { MediaImportCoordinator.startImport(requireContext()) } })
            addView(TextView(context).apply { text = "Filters: all / photo / video / audio" })
        }
    }
}
