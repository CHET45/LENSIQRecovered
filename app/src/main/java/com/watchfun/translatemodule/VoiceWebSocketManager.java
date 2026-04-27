package com.watchfun.translatemodule;

import android.text.TextUtils;
import com.watchfun.translatemodule.AudioRecorder;
import com.watchfun.translatemodule.bean.WebsocketConfigBean;
import p000.sc7;

/* JADX INFO: loaded from: classes6.dex */
public class VoiceWebSocketManager extends BaseWebSocketManager {
    private static volatile VoiceWebSocketManager mVoiceSocketManager;
    private final String TAG = "VoiceWebSocketManager";
    public String speechProvider = "";
    private int tranlationMode = 1;
    public String translationProvider = "";

    public VoiceWebSocketManager() {
        AudioRecorder.getInstance().createDefaultAudio();
        this.VAD_START = 10800000L;
        this.VAD_END = 10800000L;
    }

    public static VoiceWebSocketManager getInstance() {
        if (mVoiceSocketManager == null) {
            synchronized (VoiceWebSocketManager.class) {
                try {
                    if (mVoiceSocketManager == null) {
                        mVoiceSocketManager = new VoiceWebSocketManager();
                    }
                } finally {
                }
            }
        }
        return mVoiceSocketManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$0(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$1(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    private void resetData() {
        this.sttContent = "";
        this.sttTransContent = "";
        this.asrString = "";
        this.asrTransString = "";
    }

    private void startWssRecord(boolean z, String str) {
        if (!z || TextUtils.isEmpty(str)) {
            AudioRecorder.getInstance().startRecord(new AudioRecorder.RecordStreamListener() { // from class: agi
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f1599a.lambda$startWssRecord$1(bArr, i, i2);
                }
            });
        } else {
            AudioRecorder.getInstance().startRecord(str, new AudioRecorder.RecordStreamListener() { // from class: zfi
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f105028a.lambda$startWssRecord$0(bArr, i, i2);
                }
            });
        }
    }

    public void release() {
        stopAsr();
        stopSocket();
        AudioRecorder.getInstance().release();
        this.handler.removeCallbacksAndMessages(null);
        this.speechProvider = "";
        this.translationProvider = "";
        mVoiceSocketManager = null;
    }

    public void setSpeechProvider(String str) {
        this.speechProvider = str;
    }

    public void setTranlationMode(int i) {
        this.tranlationMode = i;
    }

    public void setTranslationProvider(String str) {
        this.translationProvider = str;
    }

    public void startAsr(String str, boolean z, String str2) {
        stop(false, this.curStartTimeId);
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        WebsocketConfigBean websocketConfigBean = new WebsocketConfigBean("startSpeech", str, "", this.tranlationMode, str3, false);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        startWssRecord(z, str2);
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

    public void stopWssRecord() {
        AudioRecorder.getInstance().stopRecord();
    }
}
