package com.watchfun.translatewebsocket;

import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.translatewebsocket.AudioScreenRecorder;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.bean.WebsocketNewConfigBean;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import p000.igg;
import p000.k95;
import p000.pj4;
import p000.sc7;
import p000.st5;
import p000.xt5;

/* JADX INFO: loaded from: classes7.dex */
public class AiSubtitlesWebSocketManager extends BaseNewWebSocketManager {

    @igg({"StaticFieldLeak"})
    private static volatile AiSubtitlesWebSocketManager mTranslateSocketManager;
    private boolean isSendFileToPlay;
    private OnTtsMp3Listener onTtsMp3Listener;
    private long startTime;
    private final String TAG = "AiSubtitlesWebSocketManager";
    private final ByteArrayOutputStream pcmBuffer = new ByteArrayOutputStream();
    public String speakerId = k95.f53083Y4;
    public String ttsProvider = "watchTts";
    public String asrProvider = "";
    public String translationProvider = "";
    public String language = "";
    public String targetLanguage = "";
    public String outputRate = "";
    private String outputFormat = st5.f82815c;

    public interface OnTtsMp3Listener {
        void onTTSMp3(byte[] bArr, boolean z, boolean z2, String str, int i, String str2);
    }

    public AiSubtitlesWebSocketManager() {
        AudioScreenRecorder.getInstance().createAudioRecorder();
        this.VAD_START = 86400000L;
        this.VAD_END = 86400000L;
    }

    public static AiSubtitlesWebSocketManager getInstance() {
        if (mTranslateSocketManager == null) {
            synchronized (AiSubtitlesWebSocketManager.class) {
                try {
                    if (mTranslateSocketManager == null) {
                        mTranslateSocketManager = new AiSubtitlesWebSocketManager();
                    }
                } finally {
                }
            }
        }
        return mTranslateSocketManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAudioEnd$0(String str, int i) {
        String str2 = getOutputPath() + pj4.f71071b + xt5.getFileNameNoExtension(str) + ".mp3";
        C2473f.m4173i("AiSubtitlesWebSocketManager", str + ":::mp3地址:::" + str2);
        try {
            convertPcmToMp3(str, str2, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$1(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    private void resetData() {
        this.handler.removeCallbacks(this.stopRun);
        this.sttContent = "";
        this.sttTransContent = "";
        this.asrString = "";
        this.asrTransString = "";
        this.ttsFilepath = "";
    }

    public static String saveByteBufferToPCMFile(ByteBuffer byteBuffer, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, true);
                try {
                    fileOutputStream2.getChannel().write(byteBuffer);
                    fileOutputStream2.close();
                    String absolutePath = fileByPath.getAbsolutePath();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static String saveByteToPCMFile(byte[] bArr, String str, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, z);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    String absolutePath = fileByPath.getAbsolutePath();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    private void startWssRecord(boolean z, String str) {
        if (!z || TextUtils.isEmpty(str)) {
            AudioScreenRecorder.getInstance().startRecord(new AudioScreenRecorder.RecordStreamListener() { // from class: com.watchfun.translatewebsocket.AiSubtitlesWebSocketManager.1
                @Override // com.watchfun.translatewebsocket.AudioScreenRecorder.RecordStreamListener
                public void recordOfByte(byte[] bArr, int i, int i2) {
                    AiSubtitlesWebSocketManager.this.send(bArr);
                }
            });
        } else {
            AudioScreenRecorder.getInstance().startRecord(str, new AudioScreenRecorder.RecordStreamListener() { // from class: bl
                @Override // com.watchfun.translatewebsocket.AudioScreenRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f14043a.lambda$startWssRecord$1(bArr, i, i2);
                }
            });
        }
    }

    public byte[] getMp3Bytes(byte[] bArr) {
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public String getOutputFormat() {
        return this.outputFormat;
    }

    public void init() {
        this.curStartTimeId = System.currentTimeMillis() + "";
        send(sc7.toJson(new WebsocketNewConfigBean("init", this.language, this.targetLanguage, 10, this.outputRate, this.speakerId, this.asrProvider, this.translationProvider, this.ttsProvider, System.currentTimeMillis())));
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onAudioEnd(String str, int i, String str2, final int i2) {
        super.onAudioEnd(str, i, str2, i2);
        this.outputSampleRate = i2;
        if (str2.contains(st5.f82815c) && !this.isAsring) {
            final String str3 = getOutputPath() + pj4.f71071b + str + ".pcm";
            C2478k.getSinglePool().execute(new Runnable() { // from class: cl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16858a.lambda$onAudioEnd$0(str3, i2);
                }
            });
            this.pcmBuffer.reset();
        } else if (xt5.isFileExists(this.ttsFilepath) && xt5.getFileByPath(this.ttsFilepath).length() > 0 && !this.isSendFileToPlay) {
            C2473f.m4168e("AiSubtitlesWebSocketManager", "onAudioEnd最后回调音频数据:" + this.ttsFilepath);
            this.asrDataListener.onTts(xt5.getFileByPath(this.ttsFilepath));
            this.isSendFileToPlay = true;
        }
        BaseNewWebSocketManager.AsrDataListener asrDataListener = this.asrDataListener;
        if (asrDataListener != null) {
            asrDataListener.onTtsEnd();
        }
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onMessage(byte[] bArr, String str, String str2, String str3, String str4, int i) {
        super.onMessage(bArr, str, str2, str3, str4, i);
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onOpen() {
        super.onOpen();
        webSocketOpen();
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onReTryStartAsr() {
        super.onReTryStartAsr();
        StringBuilder sb = new StringBuilder();
        sb.append("isStartAsr>>:");
        sb.append(BaseNewWebSocketManager.isStartAsr);
        if (BaseNewWebSocketManager.isStartAsr) {
            startAsr(this.startAsrLanguage, this.startAsrTargetLanguage, true);
        }
    }

    public void release() {
        stopAsr();
        stopSocket();
        AudioNewRecorder.getInstance().release();
        this.handler.removeCallbacksAndMessages(null);
        resetProvider();
        mTranslateSocketManager = null;
    }

    public void resetProvider() {
        this.speakerId = k95.f53083Y4;
        this.ttsProvider = "watchTts";
        this.asrProvider = "";
        this.translationProvider = "";
    }

    public void sendInitCommand(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.language = str;
        this.targetLanguage = str2;
        this.outputRate = str3;
        this.speakerId = str4;
        this.asrProvider = str5;
        this.translationProvider = str6;
        this.ttsProvider = str7;
        init();
    }

    public void setOnTtsMp3Listener(OnTtsMp3Listener onTtsMp3Listener) {
        this.onTtsMp3Listener = onTtsMp3Listener;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    public void startAsr(String str, String str2, boolean z) {
        stop(false, this.curStartTimeId);
        if (TextUtils.isEmpty(this.sessionId)) {
            BaseNewWebSocketManager.isStartAsr = true;
        }
        this.startAsrLanguage = str;
        this.startAsrTargetLanguage = str2;
        this.curStartTimeId = String.valueOf(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "start");
            jSONObject.put("sessionId", this.sessionId);
            jSONObject.put("sourceLanguage", this.startAsrLanguage);
            jSONObject.put(BaseCallActivity.f25143k2, this.startAsrTargetLanguage);
            jSONObject.put("timestamp", System.currentTimeMillis());
            send(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        startWssRecord(z, "");
        this.isAsring = true;
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
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
        AudioScreenRecorder.getInstance().stopRecord();
    }

    public void webSocketOpen() {
        init();
    }
}
