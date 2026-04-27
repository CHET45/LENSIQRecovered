package com.eyevue.glassapp.utils;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class AudioManagerUtil {
    private static final String TAG = "AudioManagerUtil";
    private static AudioManagerUtil instance;
    private AudioManager audioManager;

    private AudioManagerUtil(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.audioManager = audioManager;
        if (audioManager == null) {
            Log.e(TAG, "初始化AudioManager失败！");
        }
    }

    public static AudioManagerUtil getInstance() {
        AudioManagerUtil audioManagerUtil = instance;
        if (audioManagerUtil != null) {
            return audioManagerUtil;
        }
        throw new IllegalStateException("AudioManagerUtil尚未初始化，请在Application中调用init()方法");
    }

    public static void init(Context context) {
        if (instance == null) {
            synchronized (AudioManagerUtil.class) {
                try {
                    if (instance == null) {
                        instance = new AudioManagerUtil(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public AudioManager getAudioManager() {
        return this.audioManager;
    }
}
