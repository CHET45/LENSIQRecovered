package com.lensiq.recovered.ui

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lensiq.recovered.ui.ai.AiAssistantFragment
import com.lensiq.recovered.ui.device.HomeFragment
import com.lensiq.recovered.ui.media.PhotoListFragment
import com.lensiq.recovered.ui.profile.MineFragment

class MainActivity : AppCompatActivity() {
    private val containerId = 1001
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = FrameLayout(this).apply { id = containerId }
        val nav = BottomNavigationView(this).apply {
            menu.add(0, 1, 0, "Home")
            menu.add(0, 2, 1, "AI")
            menu.add(0, 3, 2, "Album")
            menu.add(0, 4, 3, "Mine")
            setOnItemSelectedListener {
                show(when (it.itemId) { 2 -> AiAssistantFragment(); 3 -> PhotoListFragment(); 4 -> MineFragment(); else -> HomeFragment() })
                true
            }
        }
        setContentView(LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; addView(root, LinearLayout.LayoutParams(-1, 0, 1f)); addView(nav) })
        if (savedInstanceState == null) show(HomeFragment())
    }
    private fun show(fragment: Fragment) = supportFragmentManager.beginTransaction().replace(containerId, fragment).commit()
}
