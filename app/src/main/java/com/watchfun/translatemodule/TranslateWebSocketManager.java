package com.watchfun.translatemodule;

import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.translatemodule.AudioRecorder;
import com.watchfun.translatemodule.BaseWebSocketManager;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import com.watchfun.translatemodule.bean.WebsocketConfigBean;
import com.watchfun.translatemodule.utils.DynamicMP3Merger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.igg;
import p000.k95;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.st5;
import p000.xt5;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TranslateWebSocketManager extends BaseWebSocketManager {

    @igg({"StaticFieldLeak"})
    private static volatile TranslateWebSocketManager mTranslateSocketManager;
    private boolean isSendFileToPlay;
    private final String TAG = "TranslateWebSocketManager";
    private final ByteArrayOutputStream pcmBuffer = new ByteArrayOutputStream();
    private int outputSampleRate = 16000;
    public String speakerId = k95.f53083Y4;
    public String ttsProvider = "watchTts";
    public String speechProvider = "";
    public String translationProvider = "";
    private final DynamicMP3Merger dynamicMP3Merger = new DynamicMP3Merger();

    public TranslateWebSocketManager() {
        AudioRecorder.getInstance().createDefaultAudio();
    }

    public static TranslateWebSocketManager getInstance() {
        if (mTranslateSocketManager == null) {
            synchronized (TranslateWebSocketManager.class) {
                try {
                    if (mTranslateSocketManager == null) {
                        mTranslateSocketManager = new TranslateWebSocketManager();
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
        zi9.m26855i("TranslateWebSocketManager", str + ":::mp3地址:::" + str2);
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
        xt5.deleteFilesInDirWithFilter(new File(getOutputPath()), new FileFilter() { // from class: xfh
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return TranslateWebSocketManager.lambda$release$1(file);
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

    private void start(String str) {
        startWssRecord(str);
        this.isSendFileToPlay = false;
        this.ttsFilepath = "";
        this.isAsring = true;
        this.handler.removeCallbacks(this.stopRun);
        this.handler.postDelayed(this.stopRun, this.VAD_START);
    }

    @Override // com.watchfun.translatemodule.BaseWebSocketManager
    public void onAudioEnd(String str, int i, String str2, final int i2) {
        final String str3;
        super.onAudioEnd(str, i, str2, i2);
        this.outputSampleRate = i2;
        if (!str2.contains(st5.f82815c) || this.isAsring) {
            int i3 = this.model;
            if (i3 != 3 && i3 != 4 && xt5.isFileExists(this.ttsFilepath) && xt5.getFileByPath(this.ttsFilepath).length() > 0 && !this.isSendFileToPlay) {
                zi9.m26852e("TranslateWebSocketManager", "onAudioEnd最后回调音频数据:" + this.ttsFilepath);
                this.asrDataListener.onTts(xt5.getFileByPath(this.ttsFilepath));
                this.isSendFileToPlay = true;
            }
        } else {
            int i4 = this.model;
            if (i4 == 3 || i4 == 4) {
                str3 = getOutputPath() + pj4.f71071b + str + p43.f69617m + i + ".pcm";
            } else {
                str3 = getOutputPath() + pj4.f71071b + str + ".pcm";
            }
            C2478k.getSinglePool().execute(new Runnable() { // from class: wfh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94121a.lambda$onAudioEnd$0(str3, i2);
                }
            });
            this.pcmBuffer.reset();
        }
        BaseWebSocketManager.AsrDataListener asrDataListener = this.asrDataListener;
        if (asrDataListener != null) {
            asrDataListener.onTtsEnd();
        }
    }

    @Override // com.watchfun.translatemodule.BaseWebSocketManager
    public void onMessage(byte[] bArr, String str, String str2, String str3, int i) throws Throwable {
        super.onMessage(bArr, str, str2, str3, i);
        int i2 = this.model;
        boolean z = true;
        if (i2 == 3 || i2 == 4) {
            if (str3.contains(st5.f82815c)) {
                saveByteToPCMFile(bArr, getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".pcm", true);
                if (this.asrDataListener != null && (this.curStartTimeId.equals(str) || this.model == 4)) {
                    this.asrDataListener.onTtsPcm(bArr, i);
                }
            } else {
                String str4 = getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".mp3";
                File fileByPath = xt5.getFileByPath(str4);
                if (fileByPath != null && fileByPath.length() != 0) {
                    z = false;
                }
                this.dynamicMP3Merger.addFragment(str4, bArr);
                saveByteToPCMFile(this.dynamicMP3Merger.merge(), str4, false);
                if (this.asrDataListener != null && ((this.curStartTimeId.equals(str) || this.model == 4) && z && xt5.isFileExists(str4))) {
                    zi9.m26855i("TranslateWebSocketManager", "流式播放音频:" + str4);
                    this.asrDataListener.onTts(xt5.getFileByPath(str4));
                }
            }
            this.ttsFilepath = getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".mp3";
            return;
        }
        if (str3.contains(st5.f82815c)) {
            saveByteToPCMFile(bArr, getOutputPath() + pj4.f71071b + str + ".pcm", true);
            if (this.asrDataListener != null && this.curStartTimeId.equals(str)) {
                try {
                    this.pcmBuffer.write(bArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                byte[] byteArray = this.pcmBuffer.toByteArray();
                if (byteArray.length > 0 && !this.isAsring) {
                    Log.e("TranslateWebSocketManager", "发送pcm数据:" + byteArray.length);
                    this.asrDataListener.onTtsPcm(byteArray, i);
                    this.pcmBuffer.reset();
                }
            }
        } else {
            String str5 = getOutputPath() + pj4.f71071b + str + ".mp3";
            this.dynamicMP3Merger.addFragment(str5, bArr);
            byte[] bArrMerge = this.dynamicMP3Merger.merge();
            saveByteToPCMFile(bArrMerge, str5, false);
            if (this.asrDataListener != null && this.curStartTimeId.equals(str) && xt5.isFileExists(str5) && !this.isSendFileToPlay && !this.isAsring && bArrMerge.length > 5000) {
                zi9.m26855i("TranslateWebSocketManager", "最后播放音频:" + str5);
                this.asrDataListener.onTts(xt5.getFileByPath(str5));
                this.isSendFileToPlay = true;
            }
        }
        this.ttsFilepath = getOutputPath() + pj4.f71071b + str + ".mp3";
    }

    public void release() {
        resetTime();
        stopAsr();
        stopSocket();
        AudioRecorder.getInstance().release();
        this.handler.removeCallbacksAndMessages(null);
        this.dynamicMP3Merger.release();
        if (!TextUtils.isEmpty(getOutputPath())) {
            C2478k.getCachedPool().execute(new Runnable() { // from class: vfh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91018a.lambda$release$2();
                }
            });
        }
        resetProvider();
        mTranslateSocketManager = null;
    }

    public void resetProvider() {
        this.speakerId = k95.f53083Y4;
        this.ttsProvider = "watchTts";
        this.speechProvider = "";
        this.translationProvider = "";
    }

    public void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public void setSpeechProvider(String str) {
        this.speechProvider = str;
    }

    public void setTranslationProvider(String str) {
        this.translationProvider = str;
    }

    public void setTtsProvider(String str) {
        this.ttsProvider = str;
    }

    public void startAsr(String str, String str2, boolean z) {
        stop(false, this.curStartTimeId);
        if (TextUtils.isEmpty(str2)) {
            this.model = 1;
        } else if (z) {
            this.model = 3;
        } else {
            this.model = 2;
        }
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        int i = this.model;
        WebsocketConfigBean websocketConfigBean = i == 3 ? new WebsocketConfigBean("startSpeech", str, str2, i, str3, 20000) : new WebsocketConfigBean("startSpeech", str, str2, i, str3, 1500);
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start("");
    }

    public void startAsrVad(String str, String str2, long j, float f) {
        stop(false, this.curStartTimeId);
        this.model = 3;
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        this.VAD_START = j;
        this.VAD_END = j;
        WebsocketConfigBean websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, this.model, str3, 0, f);
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start("");
    }

    public void startNormalAsrVad(String str, String str2, long j, boolean z, String str3) {
        stop(false, this.curStartTimeId);
        if (z) {
            this.model = 4;
        } else {
            this.model = 2;
        }
        String str4 = System.currentTimeMillis() + "";
        this.curStartTimeId = str4;
        this.VAD_START = j;
        this.VAD_END = j;
        WebsocketConfigBean websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, 2, str4, 0);
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start(str3);
    }

    public void startWssRecord(String str) {
        if (TextUtils.isEmpty(str)) {
            AudioRecorder.getInstance().startRecord(new AudioRecorder.RecordStreamListener() { // from class: zfh
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f105027a.lambda$startWssRecord$4(bArr, i, i2);
                }
            });
        } else {
            AudioRecorder.getInstance().startRecord(str, new AudioRecorder.RecordStreamListener() { // from class: yfh
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f101410a.lambda$startWssRecord$3(bArr, i, i2);
                }
            });
        }
    }

    @Override // com.watchfun.translatemodule.BaseWebSocketManager
    public void stop(boolean z, String str) {
        super.stop(z, str);
        AudioRecorder.getInstance().stopRecord();
        if (this.isAsring) {
            this.isAsring = false;
            if (this.asrDataListener != null) {
                int i = this.model;
                if (i != 3 && i != 4) {
                    if (xt5.isFileExists(this.ttsFilepath) && xt5.getFileByPath(this.ttsFilepath).length() > 0) {
                        zi9.m26852e("TranslateWebSocketManager", "最后回调音频数据:" + this.ttsFilepath);
                        this.asrDataListener.onTts(xt5.getFileByPath(this.ttsFilepath));
                        this.isSendFileToPlay = true;
                    }
                    if (this.curStartTimeId.equals(str)) {
                        byte[] byteArray = this.pcmBuffer.toByteArray();
                        if (byteArray.length > 0) {
                            Log.e("TranslateWebSocketManager", "最后结束发送pcm数据:" + byteArray.length);
                            this.asrDataListener.onTtsPcm(byteArray, this.outputSampleRate);
                            this.pcmBuffer.reset();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.contentMap.get(str)) && !TextUtils.isEmpty(this.transContentMap.get(str))) {
                    this.asrDataListener.onMessageContinuous(this.contentMap.get(str), this.transContentMap.get(str), this.ttsFilepath, str, true);
                }
                if (z) {
                    this.asrDataListener.onStopRecord();
                }
            }
            resetData();
        }
    }

    public void startNormalAsrVad(String str, String str2, long j, String str3, boolean z) {
        stop(false, this.curStartTimeId);
        this.model = 4;
        String str4 = System.currentTimeMillis() + "";
        this.curStartTimeId = str4;
        this.VAD_START = j;
        this.VAD_END = j;
        WebsocketConfigBean websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, z ? 3 : 2, str4, 0);
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start(str3);
    }

    public void startAsr(String str, String str2, boolean z, int i) {
        WebsocketConfigBean websocketConfigBean;
        stop(false, this.curStartTimeId);
        if (TextUtils.isEmpty(str2)) {
            this.model = 1;
        } else if (z) {
            this.model = 3;
        } else {
            this.model = 2;
        }
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        int i2 = this.model;
        if (i2 == 3) {
            websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, i2, str3, 20000);
        } else {
            websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, i2, str3, i == 2 ? 2000 : 1500);
        }
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start("");
    }

    public void startAsr(String str, String str2, boolean z, float f) {
        WebsocketConfigBean websocketConfigBean;
        stop(false, this.curStartTimeId);
        if (TextUtils.isEmpty(str2)) {
            this.model = 1;
        } else if (z) {
            this.model = 3;
        } else {
            this.model = 2;
        }
        String str3 = System.currentTimeMillis() + "";
        this.curStartTimeId = str3;
        int i = this.model;
        if (i == 3) {
            websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, i, str3, 20000, f);
        } else {
            websocketConfigBean = new WebsocketConfigBean("startSpeech", str, str2, i, str3, 1500, f);
        }
        websocketConfigBean.setSpeakerId(this.speakerId);
        websocketConfigBean.setTtsProvider(this.ttsProvider);
        websocketConfigBean.setSpeechProvider(this.speechProvider);
        websocketConfigBean.setTranslationProvider(this.translationProvider);
        send(sc7.toJson(websocketConfigBean));
        start("");
    }
}
