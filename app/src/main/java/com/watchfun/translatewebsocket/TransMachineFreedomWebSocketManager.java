package com.watchfun.translatewebsocket;

import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.translatewebsocket.AudioNewRecorder;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.TransMachineFreedomWebSocketManager;
import com.watchfun.translatewebsocket.bean.WebsocketNewConfigBean;
import com.watchfun.translatewebsocket.utils.DynamicNewMP3Merger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p000.igg;
import p000.k95;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.st5;
import p000.xt5;
import p000.zi9;

/* JADX INFO: loaded from: classes7.dex */
public class TransMachineFreedomWebSocketManager extends BaseNewWebSocketManager {

    @igg({"StaticFieldLeak"})
    private static volatile TransMachineFreedomWebSocketManager mTranslateSocketManager;
    private boolean isSendFileToPlay;
    private OnTtsMp3Listener onTtsMp3Listener;
    private long startTime;
    private final String TAG = "TransMachineWebSocketManager";
    private final ByteArrayOutputStream pcmBuffer = new ByteArrayOutputStream();
    private ExecutorService saveMp3FileExecutor = Executors.newFixedThreadPool(1);
    private int outputSampleRate = 16000;
    public String speakerId = k95.f53083Y4;
    public String ttsProvider = "watchTts";
    public String asrProvider = "";
    public String translationProvider = "";
    public String language = "";
    public String targetLanguage = "";
    public String outputRate = "";
    private final DynamicNewMP3Merger dynamicMP3Merger = new DynamicNewMP3Merger();

    public interface OnTtsMp3Listener {
        void onTTSMp3(byte[] bArr, boolean z, boolean z2, String str, int i, String str2);
    }

    public TransMachineFreedomWebSocketManager() {
        AudioNewRecorder.getInstance().createDefaultAudio();
    }

    public static TransMachineFreedomWebSocketManager getInstance() {
        if (mTranslateSocketManager == null) {
            synchronized (TransMachineFreedomWebSocketManager.class) {
                try {
                    if (mTranslateSocketManager == null) {
                        mTranslateSocketManager = new TransMachineFreedomWebSocketManager();
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
        C2473f.m4173i("TransMachineWebSocketManager", str + ":::mp3地址:::" + str2);
        try {
            convertPcmToMp3(str, str2, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$release$1(File file) {
        return file.getName().toLowerCase().endsWith(".pcm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        xt5.deleteFilesInDirWithFilter(new File(getOutputPath()), new FileFilter() { // from class: yah
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return TransMachineFreedomWebSocketManager.lambda$release$1(file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$3(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$4(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    private void resetData() {
        this.handler.removeCallbacks(this.stopRun);
        this.sttContent = "";
        this.sttTransContent = "";
        this.asrString = "";
        this.asrTransString = "";
        this.ttsFilepath = "";
        BaseNewWebSocketManager.isStartAsr = false;
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

    private synchronized void saveMp3ToFile(String str) {
        try {
            if (!xt5.isFileExists(str)) {
                xt5.createOrExistsFile(str);
            }
            saveByteToPCMFile(this.dynamicMP3Merger.merge(), str, true);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void start(String str) {
        if (!TextUtils.isEmpty(str)) {
            xt5.createOrExistsFile(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startAsrPcmTest-------------------->>:");
        sb.append(str);
        startWssRecord(str);
        this.isSendFileToPlay = false;
        this.ttsFilepath = "";
        this.isAsring = true;
        this.handler.removeCallbacks(this.stopRun);
        this.handler.postDelayed(this.stopRun, this.VAD_START);
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
        try {
            send(sc7.toJson(new WebsocketNewConfigBean("init", this.language, this.targetLanguage, 7, this.outputRate, this.speakerId, this.asrProvider, this.translationProvider, this.ttsProvider, System.currentTimeMillis())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onAudioEnd(String str, int i, String str2, final int i2) {
        super.onAudioEnd(str, i, str2, i2);
        this.outputSampleRate = i2;
        if (str2.contains(st5.f82815c) && !this.isAsring) {
            final String str3 = getOutputPath() + pj4.f71071b + str + ".pcm";
            C2478k.getSinglePool().execute(new Runnable() { // from class: wah
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93840a.lambda$onAudioEnd$0(str3, i2);
                }
            });
            this.pcmBuffer.reset();
        } else if (xt5.isFileExists(this.ttsFilepath) && xt5.getFileByPath(this.ttsFilepath).length() > 0 && !this.isSendFileToPlay) {
            C2473f.m4168e("TransMachineWebSocketManager", "onAudioEnd最后回调音频数据:" + this.ttsFilepath);
            this.asrDataListener.onTts(xt5.getFileByPath(this.ttsFilepath));
            this.isSendFileToPlay = true;
        }
        BaseNewWebSocketManager.AsrDataListener asrDataListener = this.asrDataListener;
        if (asrDataListener != null) {
            asrDataListener.onTtsEnd();
        }
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onMessage(byte[] bArr, String str, String str2, String str3, String str4, int i) throws Throwable {
        super.onMessage(bArr, str, str2, str3, str4, i);
        if (str3.contains(st5.f82815c)) {
            saveByteToPCMFile(bArr, getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".pcm", true);
            if (this.asrDataListener != null && this.curStartTimeId.equals(str)) {
                try {
                    this.pcmBuffer.write(bArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                byte[] byteArray = this.pcmBuffer.toByteArray();
                if (byteArray.length > 0 && !this.isAsring) {
                    Log.e("TransMachineWebSocketManager", "发送pcm数据:" + byteArray.length);
                    this.asrDataListener.onTtsPcm(byteArray, i);
                    this.pcmBuffer.reset();
                }
            }
        } else {
            String str5 = getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".mp3";
            this.dynamicMP3Merger.addFragment(str5, bArr);
            byte[] bArrMerge = this.dynamicMP3Merger.merge();
            saveByteToPCMFile(bArrMerge, str5, false);
            if (this.asrDataListener != null && this.curStartTimeId.equals(str) && xt5.isFileExists(str5) && !this.isSendFileToPlay && !this.isAsring && bArrMerge.length > 5000) {
                C2473f.m4173i("TransMachineWebSocketManager", "最后播放音频:" + str5);
                this.asrDataListener.onTts(xt5.getFileByPath(str5));
                this.isSendFileToPlay = true;
            }
        }
        this.ttsFilepath = getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".mp3";
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void onReTryStartAsr() {
        super.onReTryStartAsr();
        StringBuilder sb = new StringBuilder();
        sb.append("isStartAsr>>:");
        sb.append(BaseNewWebSocketManager.isStartAsr);
        if (BaseNewWebSocketManager.isStartAsr) {
            startAsr(this.startAsrLanguage, this.startAsrTargetLanguage, this.VAD_START);
        }
    }

    public void release() {
        resetTime();
        stopAsr();
        stopSocket();
        AudioNewRecorder.getInstance().release();
        this.handler.removeCallbacksAndMessages(null);
        this.dynamicMP3Merger.release();
        if (!TextUtils.isEmpty(getOutputPath())) {
            C2478k.getCachedPool().execute(new Runnable() { // from class: xah
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97391a.lambda$release$2();
                }
            });
        }
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

    public void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public void setSpeakerIdAndTTSProvider() {
        setSpeakerId(k95.f53083Y4);
        setOutputFormat(st5.f82815c);
        setTtsProvider(zi9.f105182a);
    }

    public void setSpeechProvider(String str) {
        this.asrProvider = str;
    }

    public void setTranslationProvider(String str) {
        this.translationProvider = str;
    }

    public void setTtsProvider(String str) {
        this.ttsProvider = str;
    }

    public void startAsr(String str, String str2, long j) {
        stop(false, this.curStartTimeId);
        if (TextUtils.isEmpty(this.sessionId)) {
            BaseNewWebSocketManager.isStartAsr = true;
        }
        this.VAD_START = j;
        this.VAD_END = j;
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
        start("");
    }

    public void startWssRecord(String str) {
        if (TextUtils.isEmpty(str)) {
            AudioNewRecorder.getInstance().startRecord(new AudioNewRecorder.RecordStreamListener() { // from class: abh
                @Override // com.watchfun.translatewebsocket.AudioNewRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f1050a.lambda$startWssRecord$4(bArr, i, i2);
                }
            });
        } else {
            AudioNewRecorder.getInstance().startRecord(str, new AudioNewRecorder.RecordStreamListener() { // from class: zah
                @Override // com.watchfun.translatewebsocket.AudioNewRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f104643a.lambda$startWssRecord$3(bArr, i, i2);
                }
            });
        }
    }

    @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager
    public void stop(boolean z, String str) {
        super.stop(z, str);
        AudioNewRecorder.getInstance().stopRecord();
        if (this.isAsring) {
            this.isAsring = false;
            StringBuilder sb = new StringBuilder();
            sb.append("stop------------------isAsring-----------22------");
            sb.append(this.isAsring);
            if (this.asrDataListener != null) {
                if (!TextUtils.isEmpty(this.contentMap.get(str)) && !TextUtils.isEmpty(this.transContentMap.get(str))) {
                    this.asrDataListener.onMessageContinuous(this.contentMap.get(str), this.transContentMap.get(str), this.ttsFilepath, str, true);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("stop------------------isHideViewCallback-----------------");
                sb2.append(z);
                if (z) {
                    this.asrDataListener.onStopRecord();
                }
            }
            resetData();
        }
    }
}
