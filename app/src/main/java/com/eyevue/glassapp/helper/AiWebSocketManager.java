package com.eyevue.glassapp.helper;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.ReturnCode;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.AudioEndBean;
import com.eyevue.common.bean.p006ai.AiCommandBean;
import com.eyevue.common.bean.p006ai.AiMessageBean;
import com.eyevue.common.bean.p006ai.AiPhotoBean;
import com.eyevue.common.bean.p006ai.ImageCommandBean;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.utils.AudioTrackUtils;
import com.eyevue.glassapp.view.translate.simultaneous.C2957a;
import com.watchfun.base.BaseApplication;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.translatemodule.bean.AudioBean;
import com.watchfun.translatemodule.bean.WsMessageBean;
import com.watchfun.translatemodule.utils.MD5Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.imgcodecs.Imgcodecs;
import p000.C14131vk;
import p000.b1h;
import p000.csd;
import p000.f3f;
import p000.i00;
import p000.jk5;
import p000.kii;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.st5;
import p000.u1b;
import p000.u77;
import p000.vfe;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class AiWebSocketManager {
    public static final String IS_SUPPORT_DUPLEX = "is_support_duplex";
    private static volatile AiWebSocketManager aiSocketManager;
    protected String aiContentString;
    private String aiVoicePath;
    private String apiSecret;
    private String appId;
    protected AsrDataListener asrDataListener;
    protected String asrString;
    private AudioManager audioManager;
    private String baseUrl;
    private String curOutputFileName;
    private int curOutputSampleRate;
    protected String curPcmOutputPath;
    protected String curStartTimeId;
    private AudioFocusRequest focusRequest;
    protected boolean isAsring;
    private boolean isAudioEnd;
    private boolean isFirstPlay;
    private boolean isMutePcmByte;
    private boolean isStopAi;
    protected Context mContext;
    private kii mWebSocketClient;
    private String testPcmName;
    protected String ttsFilepath;
    private final String TAG = "AiWebSocketManager";
    protected final Handler handler = new Handler(Looper.getMainLooper());
    protected final long ALIVE_TIME = 10000;
    public int connectTimes = 0;
    public final int CONNECT_TIMES_TIP = 5;
    private boolean isStartFromPhone = true;
    private boolean isDialogueEnd = true;
    private boolean isCanUseAi = true;
    protected final long NO_SPEAK_TIME = 10000;
    private final long AI_ANSWER_TIME_OUT = 30000;
    private String aiCommand = "";
    public boolean isSaveTestPcm = false;
    public final Runnable reConnectRun = new Runnable() { // from class: nl
        @Override // java.lang.Runnable
        public final void run() {
            this.f64825a.reConnect();
        }
    };
    public final Runnable aliveRun = new Runnable() { // from class: com.eyevue.glassapp.helper.AiWebSocketManager.3
        @Override // java.lang.Runnable
        public void run() {
            AiWebSocketManager.this.send("{\"command\":\"ping\",\"timestamp\":" + (System.currentTimeMillis() / 1000) + "}");
            AiWebSocketManager aiWebSocketManager = AiWebSocketManager.this;
            aiWebSocketManager.handler.postDelayed(aiWebSocketManager.aliveRun, 10000L);
        }
    };
    public final Runnable noSpeakRun = new Runnable() { // from class: com.eyevue.glassapp.helper.AiWebSocketManager.4
        @Override // java.lang.Runnable
        public void run() {
            AiWebSocketManager.this.stopAi();
            C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
        }
    };
    public final Runnable aiAnswerTimeOutRun = new Runnable() { // from class: com.eyevue.glassapp.helper.AiWebSocketManager.5
        @Override // java.lang.Runnable
        public void run() {
            AiWebSocketManager.this.stopAi();
            C2957a.getInstance().playRaw(C2531R.raw.ai_answered_timeout);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.helper.AiWebSocketManager$1 */
    public class C26381 implements AudioTrackUtils.OnPcmDataPlayListener {
        public C26381() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPlayEnd$0() {
            zgb.defaultCenter().publish(new csd());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPlayEnd$1() {
            AiWebSocketManager.this.isMutePcmByte = false;
        }

        @Override // com.eyevue.glassapp.utils.AudioTrackUtils.OnPcmDataPlayListener
        public void onPlayEnd() {
            if (AiWebSocketManager.this.isAudioEnd) {
                AudioTrackUtils.getInstance().stop();
                AiWebSocketManager.this.handler.postDelayed(new Runnable() { // from class: com.eyevue.glassapp.helper.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AiWebSocketManager.C26381.lambda$onPlayEnd$0();
                    }
                }, 500L);
                if (AiWebSocketManager.this.isStopAi) {
                    return;
                }
                AiWebSocketManager.this.requestAudioFocus();
                C2957a.getInstance().playRaw(C2531R.raw.ai_answered_music);
                AiWebSocketManager.this.handler.postDelayed(new Runnable() { // from class: com.eyevue.glassapp.helper.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18286a.lambda$onPlayEnd$1();
                    }
                }, 500L);
                AiWebSocketManager aiWebSocketManager = AiWebSocketManager.this;
                aiWebSocketManager.handler.removeCallbacks(aiWebSocketManager.noSpeakRun);
                AiWebSocketManager aiWebSocketManager2 = AiWebSocketManager.this;
                aiWebSocketManager2.handler.postDelayed(aiWebSocketManager2.noSpeakRun, 10000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.helper.AiWebSocketManager$2 */
    public class C26392 extends kii {
        public C26392(URI serverUri, Map httpHeaders) {
            super(serverUri, (Map<String, String>) httpHeaders);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessage$0(AudioEndBean audioEndBean) {
            AiWebSocketManager.this.convertPcmToMp3(AiWebSocketManager.this.curPcmOutputPath + pj4.f71071b + AiWebSocketManager.this.curStartTimeId + p43.f69617m + audioEndBean.getMessageId() + ".pcm", AiWebSocketManager.this.curPcmOutputPath + pj4.f71071b + AiWebSocketManager.this.curStartTimeId + p43.f69617m + audioEndBean.getMessageId() + ".mp3", audioEndBean.getOutputSampleRate());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessage$1() {
            AiWebSocketManager.this.requestAudioFocus();
        }

        @Override // p000.kii
        public void onClose(int code, String reason, boolean remote) {
            AsrDataListener asrDataListener = AiWebSocketManager.this.asrDataListener;
            if (asrDataListener != null) {
                asrDataListener.onClose(code);
                AiWebSocketManager aiWebSocketManager = AiWebSocketManager.this;
                int i = aiWebSocketManager.connectTimes;
                if (i != 0 && i % 5 == 0) {
                    aiWebSocketManager.asrDataListener.onReconnectFail();
                }
                if (!TextUtils.isEmpty(AiWebSocketManager.this.asrString)) {
                    AiWebSocketManager aiWebSocketManager2 = AiWebSocketManager.this;
                    AsrDataListener asrDataListener2 = aiWebSocketManager2.asrDataListener;
                    if (asrDataListener2 != null) {
                        asrDataListener2.onUserMessage(aiWebSocketManager2.asrString, aiWebSocketManager2.curStartTimeId, true);
                    }
                    AiWebSocketManager.this.asrString = "";
                }
                if (!TextUtils.isEmpty(AiWebSocketManager.this.aiContentString)) {
                    AiWebSocketManager aiWebSocketManager3 = AiWebSocketManager.this;
                    AsrDataListener asrDataListener3 = aiWebSocketManager3.asrDataListener;
                    if (asrDataListener3 != null) {
                        asrDataListener3.onAiMessage(aiWebSocketManager3.aiContentString, aiWebSocketManager3.aiVoicePath, AiWebSocketManager.this.curStartTimeId, true);
                    }
                    AiWebSocketManager.this.aiContentString = "";
                }
            }
            AiWebSocketManager.this.stopAi();
            AiWebSocketManager.this.isDialogueEnd = true;
            AiWebSocketManager aiWebSocketManager4 = AiWebSocketManager.this;
            aiWebSocketManager4.handler.removeCallbacks(aiWebSocketManager4.aliveRun);
            AiWebSocketManager aiWebSocketManager5 = AiWebSocketManager.this;
            aiWebSocketManager5.handler.removeCallbacks(aiWebSocketManager5.reConnectRun);
            AiWebSocketManager aiWebSocketManager6 = AiWebSocketManager.this;
            aiWebSocketManager6.handler.postDelayed(aiWebSocketManager6.reConnectRun, 2000L);
            if (u77.f86964h) {
                return;
            }
            zi9.m26852e("AiWebSocketManager", "onClose " + code + ",reason:" + reason + ",remote:" + remote);
        }

        @Override // p000.kii
        public void onError(Exception e) {
            AsrDataListener asrDataListener = AiWebSocketManager.this.asrDataListener;
            if (asrDataListener != null) {
                asrDataListener.onError(e);
            }
            if (u77.f86964h) {
                return;
            }
            zi9.m26852e("AiWebSocketManager", "Error " + e.getMessage());
        }

        @Override // p000.kii
        public void onMessage(String msg) throws Throwable {
            if (TextUtils.isEmpty(msg)) {
                return;
            }
            try {
                String string = new JSONObject(msg).getString("type");
                if (string.equals("pong")) {
                    return;
                }
                if (string.equals("clearPlayingAudio")) {
                    AudioTrackUtils.getInstance().stop();
                    return;
                }
                if (string.equals("realtimeError")) {
                    C2957a.getInstance().stopAudio();
                    AiWebSocketManager.this.stopAiNoStopAudio();
                    return;
                }
                if (string.equals("audio")) {
                    AudioBean audioBean = (AudioBean) sc7.fromJson(msg, AudioBean.class);
                    byte[] bArr = new byte[audioBean.getAudioData().size()];
                    AiWebSocketManager.this.isAudioEnd = false;
                    for (int i = 0; i < audioBean.getAudioData().size(); i++) {
                        bArr[i] = audioBean.getAudioData().get(i).byteValue();
                    }
                    AiWebSocketManager.this.curOutputFileName = AiWebSocketManager.this.curStartTimeId + p43.f69617m + audioBean.getMessageId();
                    AiWebSocketManager.this.ttsFilepath = AiWebSocketManager.this.curPcmOutputPath + pj4.f71071b + AiWebSocketManager.this.curOutputFileName + ".pcm";
                    AiWebSocketManager.this.curOutputSampleRate = audioBean.getOutputSampleRate();
                    AiWebSocketManager.saveByteToPCMFile(bArr, AiWebSocketManager.this.ttsFilepath, true);
                    C2957a.getInstance().stopAudio();
                    if (AiWebSocketManager.this.isStopAi) {
                        return;
                    }
                    AudioTrackUtils.getInstance().play(bArr);
                    return;
                }
                C2473f.m4173i("AiWebSocketManager", "onMessage:::" + msg);
                if (string.equals("audioEnd")) {
                    AiWebSocketManager.this.isAudioEnd = true;
                    final AudioEndBean audioEndBean = (AudioEndBean) sc7.fromJson(msg, AudioEndBean.class);
                    zi9.m26852e("AiWebSocketManager", "音频结束:::" + msg);
                    if (audioEndBean.getAudioFormat().equals(st5.f82815c)) {
                        C2478k.getSinglePool().execute(new Runnable() { // from class: com.eyevue.glassapp.helper.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f18287a.lambda$onMessage$0(audioEndBean);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (string.equals("realtimeStarted")) {
                    AiWebSocketManager.this.isDialogueEnd = false;
                    AiWebSocketManager.this.curStartTimeId = String.valueOf(System.currentTimeMillis());
                    AudioTrackUtils.getInstance().stop();
                    return;
                }
                if (string.equals("realtimeStopped")) {
                    AiWebSocketManager.this.isDialogueEnd = true;
                    AiWebSocketManager.this.isFirstPlay = false;
                    if (!TextUtils.isEmpty(AiWebSocketManager.this.asrString)) {
                        AiWebSocketManager aiWebSocketManager = AiWebSocketManager.this;
                        AsrDataListener asrDataListener = aiWebSocketManager.asrDataListener;
                        if (asrDataListener != null) {
                            asrDataListener.onUserMessage(aiWebSocketManager.asrString, aiWebSocketManager.curStartTimeId, true);
                        }
                        AiWebSocketManager.this.asrString = "";
                    }
                    if (!TextUtils.isEmpty(AiWebSocketManager.this.aiContentString)) {
                        AiWebSocketManager aiWebSocketManager2 = AiWebSocketManager.this;
                        AsrDataListener asrDataListener2 = aiWebSocketManager2.asrDataListener;
                        if (asrDataListener2 != null) {
                            asrDataListener2.onAiMessage(aiWebSocketManager2.aiContentString, aiWebSocketManager2.aiVoicePath, AiWebSocketManager.this.curStartTimeId, true);
                        }
                        AiWebSocketManager.this.aiContentString = "";
                    }
                    AiWebSocketManager.this.exitAiMsg();
                    return;
                }
                if (string.equals("realtimeChat")) {
                    AiMessageBean aiMessageBean = (AiMessageBean) sc7.fromJson(msg, AiMessageBean.class);
                    if (TextUtils.isEmpty(aiMessageBean.getText())) {
                        return;
                    }
                    if (!AiWebSocketManager.this.isFirstPlay) {
                        AiWebSocketManager.this.isFirstPlay = true;
                    }
                    AiWebSocketManager aiWebSocketManager3 = AiWebSocketManager.this;
                    aiWebSocketManager3.handler.removeCallbacks(aiWebSocketManager3.aiAnswerTimeOutRun);
                    AiWebSocketManager.this.aiVoicePath = AiWebSocketManager.this.curPcmOutputPath + pj4.f71071b + AiWebSocketManager.this.curStartTimeId + p43.f69617m + aiMessageBean.getMessageId() + ".mp3";
                    AiWebSocketManager.this.aiContentString = aiMessageBean.getText();
                    AsrDataListener asrDataListener3 = AiWebSocketManager.this.asrDataListener;
                    if (asrDataListener3 != null) {
                        asrDataListener3.onAiMessage(aiMessageBean.getText(), AiWebSocketManager.this.aiVoicePath, AiWebSocketManager.this.curStartTimeId, aiMessageBean.isFinal());
                    }
                    if (aiMessageBean.isFinal()) {
                        AiWebSocketManager aiWebSocketManager4 = AiWebSocketManager.this;
                        aiWebSocketManager4.aiContentString = "";
                        if (jk5.isPlayCommand(aiWebSocketManager4.aiCommand)) {
                            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: com.eyevue.glassapp.helper.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f18289a.lambda$onMessage$1();
                                }
                            }, 1500L);
                        }
                        AiWebSocketManager.this.aiCommand = "";
                        return;
                    }
                    return;
                }
                if (string.equals("visual_qa")) {
                    AiPhotoBean aiPhotoBean = (AiPhotoBean) sc7.fromJson(msg, AiPhotoBean.class);
                    AsrDataListener asrDataListener4 = AiWebSocketManager.this.asrDataListener;
                    if (asrDataListener4 != null) {
                        asrDataListener4.onPhotoIdentify(aiPhotoBean.getQuery());
                        return;
                    }
                    return;
                }
                if (string.equals("general_command") || string.equals("telephone")) {
                    try {
                        AiCommandBean aiCommandBean = (AiCommandBean) sc7.fromJson(msg, AiCommandBean.class);
                        AiWebSocketManager.this.aiCommand = aiCommandBean.getContent();
                        AsrDataListener asrDataListener5 = AiWebSocketManager.this.asrDataListener;
                        if (asrDataListener5 != null) {
                            asrDataListener5.onCommand(aiCommandBean.getContent(), aiCommandBean.getQueryDesc());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (string.equals("transcribe")) {
                    WsMessageBean wsMessageBean = (WsMessageBean) sc7.fromJson(msg, WsMessageBean.class);
                    if (TextUtils.isEmpty(wsMessageBean.getText())) {
                        return;
                    }
                    AiWebSocketManager.this.asrString = wsMessageBean.getText();
                    AiWebSocketManager.this.isStopAi = false;
                    AiWebSocketManager aiWebSocketManager5 = AiWebSocketManager.this;
                    AsrDataListener asrDataListener6 = aiWebSocketManager5.asrDataListener;
                    if (asrDataListener6 != null) {
                        asrDataListener6.onUserMessage(aiWebSocketManager5.asrString, wsMessageBean.getStartTimeId(), wsMessageBean.isFinal());
                    }
                    if (wsMessageBean.isFinal()) {
                        if (!vfe.getInstance().getBoolean(AiWebSocketManager.IS_SUPPORT_DUPLEX, false)) {
                            AiWebSocketManager.this.isMutePcmByte = true;
                        }
                        AiWebSocketManager.this.asrString = "";
                        C2957a.getInstance().playRaw(C2531R.raw.ai_thinking_music);
                        AiWebSocketManager aiWebSocketManager6 = AiWebSocketManager.this;
                        aiWebSocketManager6.handler.removeCallbacks(aiWebSocketManager6.aiAnswerTimeOutRun);
                        AiWebSocketManager aiWebSocketManager7 = AiWebSocketManager.this;
                        aiWebSocketManager7.handler.postDelayed(aiWebSocketManager7.aiAnswerTimeOutRun, 30000L);
                    }
                    AiWebSocketManager aiWebSocketManager8 = AiWebSocketManager.this;
                    aiWebSocketManager8.handler.removeCallbacks(aiWebSocketManager8.noSpeakRun);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // p000.kii
        public void onOpen(f3f serverHandshake) {
            AsrDataListener asrDataListener = AiWebSocketManager.this.asrDataListener;
            if (asrDataListener != null) {
                asrDataListener.onOpen();
            }
            AiWebSocketManager aiWebSocketManager = AiWebSocketManager.this;
            aiWebSocketManager.connectTimes = 0;
            aiWebSocketManager.handler.removeCallbacks(aiWebSocketManager.aliveRun);
            AiWebSocketManager aiWebSocketManager2 = AiWebSocketManager.this;
            aiWebSocketManager2.handler.postDelayed(aiWebSocketManager2.aliveRun, 10000L);
            zi9.m26855i("AiWebSocketManager", "Opened");
        }
    }

    public static class AsrDataListener implements DataListener {
        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onAiMessage(String msg, String voicePath, String startTimeId, boolean isFinal) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onClose(int code) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onCommand(String cmd, List<AiCommandBean.QueryDescDTO> queryDesc) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onError(Exception e) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onOpen() {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onPhotoIdentify(String query) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onReconnectFail() {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onStopRecord() {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onTts(File file) {
        }

        @Override // com.eyevue.glassapp.helper.AiWebSocketManager.DataListener
        public void onUserMessage(String msg, String startTimeId, boolean isFinal) {
        }
    }

    public interface DataListener {
        void onAiMessage(String msg, String voicePath, String startTimeId, boolean isFinal);

        void onClose(int code);

        void onCommand(String cmd, List<AiCommandBean.QueryDescDTO> queryDesc);

        void onError(Exception e);

        void onOpen();

        void onPhotoIdentify(String query);

        void onReconnectFail();

        void onStopRecord();

        void onTts(File file);

        void onUserMessage(String msg, String startTimeId, boolean isFinal);
    }

    public AiWebSocketManager() {
        AudioTrackUtils.getInstance().setmOnPcmDataPlayListener(new C26381());
    }

    private void abandonAudioFocus() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.audioManager;
        if (audioManager == null || (audioFocusRequest = this.focusRequest) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    private Map<String, String> buildHttpHeader() {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5Util.stringToMD5(this.appId + this.apiSecret + strValueOf);
        map.put("x-request-appid", this.appId);
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-sign", strStringToMD5);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitAiMsg() {
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: ql
            @Override // java.lang.Runnable
            public final void run() {
                AiWebSocketManager.lambda$exitAiMsg$2();
            }
        }, 500L);
    }

    public static AiWebSocketManager getInstance() {
        if (aiSocketManager == null) {
            synchronized (AiWebSocketManager.class) {
                try {
                    if (aiSocketManager == null) {
                        aiSocketManager = new AiWebSocketManager();
                    }
                } finally {
                }
            }
        }
        return aiSocketManager;
    }

    private void initWebScoket(URI mUri) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar == null || !kiiVar.isOpen()) {
            this.mWebSocketClient = new C26392(mUri, buildHttpHeader());
            C2478k.getCachedPool().execute(new Runnable() { // from class: pl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71223a.lambda$initWebScoket$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$exitAiMsg$2() {
        C14131vk c14131vk = new C14131vk();
        c14131vk.f91476b = u1b.f86555d;
        zgb.defaultCenter().publish(c14131vk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebScoket$0() {
        try {
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar != null) {
                kiiVar.connectBlocking();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reConnect$3() {
        try {
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar != null) {
                kiiVar.clearHeaders();
                for (Map.Entry<String, String> entry : buildHttpHeader().entrySet()) {
                    this.mWebSocketClient.addHeader(entry.getKey(), entry.getValue());
                }
                this.mWebSocketClient.reconnectBlocking();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestAudioFocus$4(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopAi$1() {
        if (TextUtils.isEmpty(this.curOutputFileName) || this.curOutputSampleRate <= 0) {
            return;
        }
        convertPcmToMp3(this.curPcmOutputPath + pj4.f71071b + this.curOutputFileName + ".pcm", this.curPcmOutputPath + pj4.f71071b + this.curOutputFileName + ".mp3", this.curOutputSampleRate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAudioFocus() {
        if (this.audioManager == null) {
            this.audioManager = (AudioManager) BaseApplication.getInstance().getSystemService("audio");
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        if (this.focusRequest == null) {
            this.focusRequest = new AudioFocusRequest.Builder(3).setAudioAttributes(audioAttributesBuild).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: rl
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    AiWebSocketManager.lambda$requestAudioFocus$4(i);
                }
            }).build();
        }
        if (this.audioManager.requestAudioFocus(this.focusRequest) == 1) {
            Log.i("AiWebSocketManager", "音频焦点获取成功");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String saveByteToPCMFile(byte[] bytes, String mp3Filepath, boolean isAppend) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(mp3Filepath);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, isAppend);
                try {
                    fileOutputStream2.write(bytes);
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

    private void stopReset() {
        if (this.isAsring || !this.isDialogueEnd) {
            stopAiAsr();
            send("{\"command\": \"stopRealtimeSpeechChat\"}");
        }
        this.isStartFromPhone = true;
        this.isStopAi = true;
        this.isFirstPlay = false;
        this.isAudioEnd = true;
        this.isMutePcmByte = false;
        this.isDialogueEnd = true;
        this.isAsring = false;
        this.aiCommand = "";
        this.handler.removeCallbacks(this.aiAnswerTimeOutRun);
        this.handler.removeCallbacks(this.noSpeakRun);
        abandonAudioFocus();
        exitAiMsg();
    }

    public byte[] convertByteBufferToBytes(ByteBuffer buffer) {
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return bArr;
    }

    public void convertPcmToMp3(String pcmPath, String mp3Path, int outputSampleRate) {
        File file = new File(pcmPath);
        new File(mp3Path);
        if (file.exists()) {
            FFmpegSession fFmpegSessionExecute = FFmpegKit.execute(String.format(Locale.US, "-y -f s16le -ar %d -ac 1 -i \"%s\" -codec:a libmp3lame -b:a 64k -q:a 2 \"%s\"", Integer.valueOf(outputSampleRate), pcmPath.replace("\" ", "\\\" "), mp3Path.replace("\" ", "\\\" ")));
            boolean zDelete = xt5.delete(file);
            if (!ReturnCode.isSuccess(fFmpegSessionExecute.getReturnCode())) {
                zi9.m26852e("AiWebSocketManager", "PCM 转换为 MP3 失败 delete:" + zDelete);
                return;
            }
            zi9.m26855i("AiWebSocketManager", "PCM 转换为 MP3 成功:" + mp3Path + " delete:" + zDelete);
        }
    }

    public AsrDataListener getAsrDataListener() {
        return this.asrDataListener;
    }

    public String getLanguage() {
        String string = vfe.getInstance().getString("CURRENT_LANGUAGE");
        return (TextUtils.isEmpty(string) || vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true)) ? Locale.getDefault().toString() : string;
    }

    public String getOutputPath() {
        File file = new File(BaseApplication.getInstance().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/tts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public String getTestOutputPath() {
        File file = new File(BaseApplication.getInstance().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/test");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public kii getWebSocketClient() {
        return this.mWebSocketClient;
    }

    public boolean isAsring() {
        return this.isAsring;
    }

    public boolean isCanUseAi() {
        return this.isCanUseAi;
    }

    public boolean isClose() {
        kii kiiVar = this.mWebSocketClient;
        return kiiVar == null || kiiVar.isClosed();
    }

    public boolean isDialogueEnd() {
        return this.isDialogueEnd;
    }

    public boolean isOpen() {
        kii kiiVar = this.mWebSocketClient;
        return kiiVar != null && kiiVar.isOpen();
    }

    public boolean isStartFromPhone() {
        return this.isStartFromPhone;
    }

    public void reConnect() {
        this.connectTimes++;
        C2478k.getCachedPool().execute(new Runnable() { // from class: sl
            @Override // java.lang.Runnable
            public final void run() {
                this.f82141a.lambda$reConnect$3();
            }
        });
    }

    public void release() {
        stopAi();
        stopSocket();
    }

    public void send(String msg) {
        try {
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar == null || !kiiVar.isOpen()) {
                return;
            }
            if (!msg.contains("ping")) {
                zi9.m26855i("AiWebSocketManager", "::发数据::::" + msg);
            }
            this.mWebSocketClient.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendPhotoMsg(String query, String imageToBase64) {
        send(sc7.toJson(new ImageCommandBean("identifyImage", query, Collections.singletonList("data:image/jpeg;base64," + imageToBase64))));
    }

    public void setAsrDataListener(AsrDataListener asrDataListener) {
        this.asrDataListener = asrDataListener;
    }

    public void setCanUseAi(boolean canUseAi) {
        this.isCanUseAi = canUseAi;
    }

    public void setMutePcmByte(boolean mutePcmByte) {
        this.isMutePcmByte = mutePcmByte;
    }

    public void startAiAsr(boolean isStartFromPhone) {
        this.isStartFromPhone = isStartFromPhone;
        zi9.m26852e("AiWebSocketManager", "startAiAsr:::" + this.isDialogueEnd);
        if (!this.isDialogueEnd) {
            this.handler.removeCallbacks(this.noSpeakRun);
            this.handler.postDelayed(this.noSpeakRun, 10000L);
            return;
        }
        this.isAsring = true;
        this.isMutePcmByte = false;
        this.aiCommand = "";
        this.curPcmOutputPath = getOutputPath();
        this.testPcmName = b1h.ShowDateStr(System.currentTimeMillis());
        String string = vfe.getInstance().getString("SP_KEY_LOCATION_LATITUDE");
        String string2 = vfe.getInstance().getString("SP_KEY_LOCATION_LONGITUDE");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("command", "startRealtimeSpeechChat");
            jSONObject.put("isSupportPhoto", true);
            jSONObject.put("latitude", string);
            jSONObject.put("longitude", string2);
            jSONObject.put("mode", "duplex");
            jSONObject.put("role", u77.f86967k);
            jSONObject.put("roleName", u77.f86968l);
            jSONObject.put("realtimeProvider", u77.f86966j);
            String language = getLanguage();
            if (!TextUtils.isEmpty(language) && (language.contains("zh_TW") || language.contains("zh_HK") || language.contains("zh_MO"))) {
                jSONObject.put(BaseCallActivity.f25142j2, "zh-TW");
            }
            if (TextUtils.isEmpty(u77.f86960d)) {
                send(jSONObject.toString());
            } else {
                jSONObject.put("name", u77.f86960d);
                send(jSONObject.toString());
            }
            this.handler.removeCallbacks(this.noSpeakRun);
            this.handler.postDelayed(this.noSpeakRun, 10000L);
            requestAudioFocus();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void startSocket(Context context, String appId, String apiSecret) {
        this.mContext = context;
        this.appId = appId;
        this.apiSecret = apiSecret;
        this.baseUrl = i00.f45350W;
        C2473f.m4168e("AiWebSocketManager", "baseUrl:" + this.baseUrl);
        try {
            initWebScoket(new URI(this.baseUrl));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void stopAi() {
        if (this.isAsring || !getInstance().isCanUseAi()) {
            ModUtils.sendViaBle().stopVoiceRecognition();
        }
        C2478k.getSinglePool().execute(new Runnable() { // from class: ol
            @Override // java.lang.Runnable
            public final void run() {
                this.f67973a.lambda$stopAi$1();
            }
        });
        stopReset();
        AudioTrackUtils.getInstance().stop();
        C2957a.getInstance().stopAudio();
    }

    public void stopAiAsr() {
        this.isAsring = false;
    }

    public void stopAiNoStopAudio() {
        ModUtils.sendViaBle().stopVoiceRecognition();
        stopReset();
    }

    public void stopAiNoStopSdk() {
        C2957a.getInstance().stopAudio();
        AudioTrackUtils.getInstance().stop();
        stopReset();
        this.isDialogueEnd = true;
    }

    public void stopSocket() {
        try {
            try {
                kii kiiVar = this.mWebSocketClient;
                if (kiiVar != null && kiiVar.isOpen()) {
                    this.mWebSocketClient.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.mWebSocketClient = null;
        }
    }

    public void unRegisterAsrDataListener() {
        this.asrDataListener = null;
    }

    public void send(byte[] data) {
        try {
            String str = getTestOutputPath() + pj4.f71071b + this.testPcmName + ".pcm";
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar != null && kiiVar.isOpen()) {
                if (this.isMutePcmByte) {
                    byte[] bArr = new byte[Imgcodecs.IMWRITE_JPEGXL_QUALITY];
                    this.mWebSocketClient.send(bArr);
                    if (this.isSaveTestPcm) {
                        saveByteToPCMFile(bArr, str, true);
                    }
                } else {
                    this.mWebSocketClient.send(data);
                    if (this.isSaveTestPcm) {
                        saveByteToPCMFile(data, str, true);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
