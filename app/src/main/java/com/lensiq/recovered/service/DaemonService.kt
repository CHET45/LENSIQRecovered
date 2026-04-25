package com.lensiq.recovered.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class DaemonService : Service() { override fun onBind(intent: Intent?): IBinder? = null }
class AiAssistantService : Service() { override fun onBind(intent: Intent?): IBinder? = null }
class AlarmService : Service() { override fun onBind(intent: Intent?): IBinder? = null }
