package com.watchfun.translatemodule;

import android.text.TextUtils;
import com.watchfun.translatemodule.bean.WebsocketConfigBean;
import p000.sc7;

/* JADX INFO: loaded from: classes6.dex */
public class CallWebSocketManager extends BaseWebSocketManager {
    private static volatile CallWebSocketManager mCallWebSocketManager;
    private final String TAG = "CallWebSocketManager";
    public String speechProvider = "";
    public String translationProvider = "";

    public CallWebSocketManager() {
        AudioRecorder.getInstance().createDefaultAudio();
        this.handleSpeechStopped = false;
        this.VAD_START = 10800000L;
        this.VAD_END = 10800000L;
    }

    public static CallWebSocketManager getInstance() {
        if (mCallWebSocketManager == null) {
            synchronized (CallWebSocketManager.class) {
                try {
                    if (mCallWebSocketManager == null) {
                        mCallWebSocketManager = new CallWebSocketManager();
                    }
                } finally {
                }
            }
        }
        return mCallWebSocketManager;
    }

    private void resetData() {
        this.sttContent = "";
        this.sttTransContent = "";
        this.asrString = "";
        this.asrTransString = "";
    }

    public void release() {
        stopAsr();
        stopSocket();
        AudioRecorder.getInstance().release();
        this.handler.removeCallbacksAndMessages(null);
        this.speechProvider = "";
        this.translationProvider = "";
        mCallWebSocketManager = null;
    }

    public void setSpeechProvider(String str) {
        this.speechProvider = str;
    }

    public void setTranslationProvider(String str) {
        this.translationProvider = str;
    }

    public void startAsr(String str, String str2) {
        stop(false, this.curStartTimeId);
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        WebsocketConfigBean websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, 2, str3, 0, false);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        send(sc7.toJson(websocketConfigBean));
        this.isAsring = true;
    }

    @Override // com.watchfun.translatemodule.BaseWebSocketManager
    public void stop(boolean z, String str) {
        super.stop(z, str);
        if (this.isAsring) {
            this.isAsring = false;
            if (this.asrDataListener != null) {
                if (!TextUtils.isEmpty(this.sttContent) && !TextUtils.isEmpty(this.sttTransContent)) {
                    this.asrDataListener.onMessageContinuous(this.sttContent, this.sttTransContent, "", "", true);
                }
                if (!TextUtils.isEmpty(this.asrString) && !TextUtils.isEmpty(this.asrTransString)) {
                    this.asrDataListener.onMessageOnce(this.sourLanguage, this.asrString, this.asrTransString, "", "", true);
                }
                if (z) {
                    this.asrDataListener.onStopRecord();
                }
            }
            resetData();
        }
    }
}
