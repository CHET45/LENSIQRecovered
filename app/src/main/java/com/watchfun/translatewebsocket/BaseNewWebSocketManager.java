package com.watchfun.translatewebsocket;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.translatewebsocket.bean.AudioNewBean;
import com.watchfun.translatewebsocket.bean.AudioNewEndBean;
import com.watchfun.translatewebsocket.bean.WsNewTransMessageBean;
import com.watchfun.translatewebsocket.utils.AudioNewHeaderExtractor;
import com.watchfun.translatewebsocket.utils.MD5NewUtil;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.a32;
import p000.amc;
import p000.g55;
import p000.go7;
import p000.jk5;
import p000.kii;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.st5;

/* JADX INFO: loaded from: classes7.dex */
public class BaseNewWebSocketManager {
    public static final int STATE_CLOSE = 0;
    public static final int STATE_CONNCETING = 2;
    public static final int STATE_OPEN = 1;
    public static boolean isStartAsr;
    private String apiSecret;
    private String appId;
    protected AsrDataListener asrDataListener;
    protected String asrString;
    protected String asrTransString;
    protected String curStartTimeId;
    protected boolean isAsring;
    protected String lastNotSendStartMsg;
    protected Context mContext;
    private URI mUri;
    protected kii mWebSocketClient;
    private Map<String, String> mWebsocketHeaders;
    public int messageId;
    private OnWebsockeOpentListener onWebsockeOpentListener;
    protected String sourLanguage;
    public long startTimeId;
    protected String sttContent;
    protected String sttTransContent;
    private String targetHost;
    protected String ttsFilepath;
    private final String TAG = "BaseNewWebSocketManager";
    protected long VAD_START = 8000;
    protected long VAD_END = 8000;
    public String startAsrLanguage = "";
    public String startAsrTargetLanguage = "";
    protected final Handler handler = new Handler(Looper.getMainLooper());
    protected final long ALIVE_TIME = 10000;
    protected int model = 1;
    public final int FREETALK_MODE = 1;
    public final int TRANS_MODE = 2;
    public final int EAR_PHONE_MODE = 3;
    public final int GLASSES_PHONE_MODE = 4;
    public final int TWO_EAR_MODE = 5;
    public final int SIMULTANEOUS_TRANS_MODE = 6;
    public final int CARD_SIMULTANEOUS_TRANS_MODE = 7;
    public final int VIDEO_CALL_TRANS_MODEL = 8;
    public final int REAL_TIME_TRANS_MODEL = 9;
    public final int AI_SUBTITLES_TRANS_MODEL = 10;
    public final int CALL_TRANSLATION_MODEL = 11;
    public final int KEYSTROKE_TRANS_MODEL = 12;
    public final int TRANS_LONG_CLICK_MODE = 13;
    public int connectTimes = 0;
    public final int CONNECT_TIMES_TIP = 5;
    public Map<String, String> contentMap = new HashMap();
    public Map<String, String> transContentMap = new HashMap();
    protected boolean handleSpeechStopped = true;
    protected boolean isSendPcmData = true;
    protected volatile int connectState = 0;
    public String BACKUP_HOST = "ai.watchfun.cn";
    public String BACKUP_URL = "wss://" + this.BACKUP_HOST + "/ws/v2/translation";
    public String sessionId = "";
    public String outputFormat = amc.f2088w;
    public int outputSampleRate = 44100;
    public String code = "";
    private String currentAudioSegmentId = "";
    private boolean isAudioSegmentStarted = false;
    private boolean isAudioSegmentEnded = false;
    private boolean isAudioSegmentCallbacked = false;
    public final Runnable stopRun = new Runnable() { // from class: com.watchfun.translatewebsocket.BaseNewWebSocketManager.2
        @Override // java.lang.Runnable
        public void run() {
            AsrDataListener asrDataListener = BaseNewWebSocketManager.this.asrDataListener;
            if (asrDataListener != null) {
                asrDataListener.onVadTimeOut();
            }
            BaseNewWebSocketManager.this.stopAsr();
            BaseNewWebSocketManager baseNewWebSocketManager = BaseNewWebSocketManager.this;
            baseNewWebSocketManager.stop(true, baseNewWebSocketManager.curStartTimeId);
        }
    };
    public final Runnable reConnectRun = new Runnable() { // from class: ls0
        @Override // java.lang.Runnable
        public final void run() {
            this.f58574a.reConnect();
        }
    };
    public final Runnable aliveRun = new Runnable() { // from class: com.watchfun.translatewebsocket.BaseNewWebSocketManager.3
        @Override // java.lang.Runnable
        public void run() {
            BaseNewWebSocketManager.this.send("{\"command\":\"ping\",\"timestamp\":" + System.currentTimeMillis() + "}");
            BaseNewWebSocketManager baseNewWebSocketManager = BaseNewWebSocketManager.this;
            baseNewWebSocketManager.handler.postDelayed(baseNewWebSocketManager.aliveRun, 10000L);
        }
    };

    public static class AsrDataListener implements DataListener {
        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onClose(int i) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onError(Exception exc) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageContinuous(String str, String str2, String str3, String str4, boolean z) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onMessageOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onOpen() {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onReconnectFail() {
        }

        public void onSpeakInfo(WsNewTransMessageBean wsNewTransMessageBean) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onStopRecord() {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTts(File file) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsEnd() {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsMp3(byte[] bArr) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onTtsPcm(byte[] bArr, int i) {
        }

        @Override // com.watchfun.translatewebsocket.BaseNewWebSocketManager.DataListener
        public void onVadTimeOut() {
        }
    }

    public interface DataListener {
        void onClose(int i);

        void onError(Exception exc);

        void onMessageContinuous(String str, String str2, String str3, String str4, boolean z);

        void onMessageOnce(String str, String str2, String str3, String str4, String str5, boolean z);

        void onOpen();

        void onReconnectFail();

        void onStopRecord();

        void onTts(File file);

        void onTtsEnd();

        void onTtsMp3(byte[] bArr);

        void onTtsPcm(byte[] bArr, int i);

        void onVadTimeOut();
    }

    public interface OnWebsockeOpentListener {
        void onOpen();
    }

    private Map<String, String> buildHttpHeader() {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5NewUtil.stringToMD5(this.appId + this.apiSecret + strValueOf);
        map.put("x-request-appid", this.appId);
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-sign", strStringToMD5);
        map.put(go7.f40586w, this.targetHost);
        Map<String, String> map2 = this.mWebsocketHeaders;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    private String getTtsFilePath(String str, String str2) {
        int i = this.model;
        if (i != 1 && i != 7) {
            return getOutputPath() + pj4.f71071b + str + ".mp3";
        }
        return getOutputPath() + pj4.f71071b + str + p43.f69617m + str2 + ".mp3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAudioByteMessage(long j, int i, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        onMessage(bArr, String.valueOf(j), String.valueOf(i), this.outputFormat, this.ttsFilepath, this.outputSampleRate);
    }

    private void handleAudioEndMessage(String str) {
        AudioNewEndBean audioNewEndBean = (AudioNewEndBean) sc7.fromJson(str, AudioNewEndBean.class);
        Log.e("BaseNewWebSocketManager", "音频结束: " + str + ", startTimeId: " + audioNewEndBean.getStartTimeId());
        if (TextUtils.isEmpty(audioNewEndBean.getStartTimeId())) {
            return;
        }
        onAudioEnd(audioNewEndBean.getStartTimeId(), audioNewEndBean.getMessageId(), audioNewEndBean.getAudioFormat(), audioNewEndBean.getOutputSampleRate());
    }

    private void handleAudioMessage(String str) {
        AudioNewBean audioNewBean = (AudioNewBean) sc7.fromJson(str, AudioNewBean.class);
        int size = audioNewBean.getAudioData().size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < audioNewBean.getAudioData().size(); i++) {
            bArr[i] = audioNewBean.getAudioData().get(i).byteValue();
        }
        Log.i("BaseNewWebSocketManager", "音频数据: " + size);
        onMessage(bArr, audioNewBean.getStartTimeId(), audioNewBean.getMessageId(), audioNewBean.getAudioFormat() == null ? amc.f2088w : audioNewBean.getAudioFormat(), this.ttsFilepath, audioNewBean.getOutputSampleRate() == 0 ? 16000 : audioNewBean.getOutputSampleRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOpen() {
        onOpen();
    }

    private void handleReTryStartAsr() {
        onReTryStartAsr();
    }

    private void handleSpeechStoppedMessage(String str) {
        if (this.handleSpeechStopped) {
            Log.i("BaseNewWebSocketManager", "statusValue :" + str);
            stop(true, this.curStartTimeId);
            this.contentMap.remove(this.curStartTimeId);
            this.transContentMap.remove(this.curStartTimeId);
            Log.i("BaseNewWebSocketManager", "后台停止识别！当前会话:" + this.curStartTimeId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStatusMessage(JSONObject jSONObject, long j) {
        try {
            Log.i("BaseNewWebSocketManager", "onMessage: " + jSONObject.toString());
            JSONObject jSONObject2 = jSONObject.getJSONObject("status");
            String string = jSONObject2.getString("status");
            Log.i("BaseNewWebSocketManager", "sessionId: " + this.sessionId + " | status: " + string + " | message: " + jSONObject2.getString(g55.f38799h) + " | jsonTimestamp: " + jSONObject.optLong("timestamp", 0L) + " | paramTimestamp: " + j);
            if (string.equals("initialized")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
                this.outputFormat = jSONObject3.getString("outputFormat");
                this.outputSampleRate = jSONObject3.getInt("outputSampleRate");
                Log.i("BaseNewWebSocketManager", "outputFormat: " + this.outputFormat + " | outputSampleRate: " + this.outputSampleRate);
                handleReTryStartAsr();
            }
            if (string.equals("stopped")) {
                handleSpeechStoppedMessage(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTranscribeMessage(JSONObject jSONObject, long j, int i, long j2) {
        try {
            WsNewTransMessageBean wsNewTransMessageBean = (WsNewTransMessageBean) sc7.fromJson(jSONObject.getJSONObject("translation").toString(), WsNewTransMessageBean.class);
            this.sourLanguage = wsNewTransMessageBean.getSourceLanguage();
            this.asrString = wsNewTransMessageBean.getSourceText();
            this.asrTransString = wsNewTransMessageBean.getTargetText();
            String ttsFilePath = getTtsFilePath(String.valueOf(j2), String.valueOf(i));
            this.ttsFilepath = ttsFilePath;
            Log.i("BaseNewWebSocketManager", "ttsFilepath--------------=" + this.ttsFilepath);
            updateContentCache(j2, wsNewTransMessageBean);
            AsrDataListener asrDataListener = this.asrDataListener;
            if (asrDataListener != null) {
                asrDataListener.onMessageContinuous(this.sttContent, this.sttTransContent, ttsFilePath, String.valueOf(j2), wsNewTransMessageBean.isFinal());
                this.asrDataListener.onMessageOnce(this.sourLanguage, this.asrString, this.asrTransString, ttsFilePath, String.valueOf(j2), wsNewTransMessageBean.isFinal());
                this.asrDataListener.onSpeakInfo(wsNewTransMessageBean);
            }
            if (wsNewTransMessageBean.isFinal()) {
                this.asrString = "";
                this.asrTransString = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initWebScoket(URI uri) {
        final String host = uri.getHost();
        final String path = uri.getPath();
        Log.e("BaseNewWebSocketManager", "initWebScoket 当前uri : " + path + " 当前 reqHost : " + host);
        final String scheme = uri.getScheme();
        C2478k.getCachedPool().execute(new Runnable() { // from class: ms0
            @Override // java.lang.Runnable
            public final void run() {
                this.f61897a.lambda$initWebScoket$0(host);
            }
        });
        if (this.mWebSocketClient == null || this.connectState == 0) {
            this.mWebSocketClient = new kii(uri, buildHttpHeader()) { // from class: com.watchfun.translatewebsocket.BaseNewWebSocketManager.1
                @Override // p000.kii
                public void onClose(int i, String str, boolean z) {
                    BaseNewWebSocketManager.this.connectState = 0;
                    AsrDataListener asrDataListener = BaseNewWebSocketManager.this.asrDataListener;
                    if (asrDataListener != null) {
                        asrDataListener.onClose(i);
                        BaseNewWebSocketManager baseNewWebSocketManager = BaseNewWebSocketManager.this;
                        int i2 = baseNewWebSocketManager.connectTimes;
                        if (i2 != 0 && i2 % 5 == 0) {
                            baseNewWebSocketManager.asrDataListener.onReconnectFail();
                        }
                    }
                    BaseNewWebSocketManager baseNewWebSocketManager2 = BaseNewWebSocketManager.this;
                    baseNewWebSocketManager2.handler.removeCallbacks(baseNewWebSocketManager2.aliveRun);
                    BaseNewWebSocketManager baseNewWebSocketManager3 = BaseNewWebSocketManager.this;
                    baseNewWebSocketManager3.handler.removeCallbacks(baseNewWebSocketManager3.reConnectRun);
                    if (1000 != i) {
                        BaseNewWebSocketManager baseNewWebSocketManager4 = BaseNewWebSocketManager.this;
                        baseNewWebSocketManager4.handler.postDelayed(baseNewWebSocketManager4.reConnectRun, 2000L);
                    }
                    BaseNewWebSocketManager baseNewWebSocketManager5 = BaseNewWebSocketManager.this;
                    baseNewWebSocketManager5.stop(true, baseNewWebSocketManager5.curStartTimeId);
                }

                @Override // p000.kii
                public void onError(Exception exc) {
                    BaseNewWebSocketManager.this.connectState = 0;
                    BaseNewWebSocketManager.this.sessionId = "";
                    if ((exc instanceof UnknownHostException) || (exc instanceof SSLException) || (exc instanceof SocketTimeoutException) || ((exc instanceof IOException) && exc.getMessage() != null && (exc.getMessage().contains(a32.C0034g.f248b) || exc.getMessage().contains("TIMED_OUT") || exc.getMessage().contains("Unable to resolve host") || exc.getMessage().contains("No address associated with hostname")))) {
                        BaseNewWebSocketManager baseNewWebSocketManager = BaseNewWebSocketManager.this;
                        baseNewWebSocketManager.mUri = URI.create(baseNewWebSocketManager.BACKUP_URL);
                        BaseNewWebSocketManager baseNewWebSocketManager2 = BaseNewWebSocketManager.this;
                        baseNewWebSocketManager2.targetHost = baseNewWebSocketManager2.BACKUP_HOST;
                    }
                    AsrDataListener asrDataListener = BaseNewWebSocketManager.this.asrDataListener;
                    if (asrDataListener != null) {
                        asrDataListener.onError(exc);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
                @Override // p000.kii
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onMessage(java.lang.String r11) {
                    /*
                        Method dump skipped, instruction units count: 364
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.watchfun.translatewebsocket.BaseNewWebSocketManager.C42471.onMessage(java.lang.String):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
                @Override // p000.kii
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onOpen(p000.f3f r6) {
                    /*
                        r5 = this;
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        r0 = 1
                        r6.connectState = r0
                        java.lang.String r6 = "onOpen:"
                        java.lang.String r1 = "BaseNewWebSocketManager"
                        android.util.Log.e(r1, r6)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        android.os.Handler r2 = r6.handler
                        java.lang.Runnable r6 = r6.aliveRun
                        r2.removeCallbacks(r6)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        android.os.Handler r2 = r6.handler
                        java.lang.Runnable r6 = r6.aliveRun
                        r3 = 10000(0x2710, double:4.9407E-320)
                        r2.postDelayed(r6, r3)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager.access$000(r6)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        java.lang.String r6 = r6.lastNotSendStartMsg
                        boolean r6 = android.text.TextUtils.isEmpty(r6)
                        if (r6 != 0) goto L79
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        java.lang.String r2 = r6.lastNotSendStartMsg
                        java.lang.String r6 = r6.curStartTimeId
                        boolean r6 = r2.contains(r6)
                        if (r6 == 0) goto L79
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r2 = "当前的会话start发送失败，websocket连接成功后再发送一次:"
                        r6.append(r2)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r2 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        java.lang.String r2 = r2.lastNotSendStartMsg
                        r6.append(r2)
                        java.lang.String r6 = r6.toString()
                        android.util.Log.e(r1, r6)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        java.lang.String r2 = r6.lastNotSendStartMsg
                        r6.send(r2)
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        int r2 = r6.model
                        if (r2 == r0) goto L93
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$AsrDataListener r6 = r6.asrDataListener
                        if (r6 == 0) goto L67
                        r6.onOpen()
                    L67:
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$OnWebsockeOpentListener r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.access$100(r6)
                        if (r6 == 0) goto L93
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$OnWebsockeOpentListener r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.access$100(r6)
                        r6.onOpen()
                        goto L93
                    L79:
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$AsrDataListener r6 = r6.asrDataListener
                        if (r6 == 0) goto L82
                        r6.onOpen()
                    L82:
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$OnWebsockeOpentListener r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.access$100(r6)
                        if (r6 == 0) goto L93
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.this
                        com.watchfun.translatewebsocket.BaseNewWebSocketManager$OnWebsockeOpentListener r6 = com.watchfun.translatewebsocket.BaseNewWebSocketManager.access$100(r6)
                        r6.onOpen()
                    L93:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r0 = "reqHost="
                        r6.append(r0)
                        java.lang.String r0 = r4
                        r6.append(r0)
                        java.lang.String r0 = " reqUrl="
                        r6.append(r0)
                        java.lang.String r0 = r5
                        r6.append(r0)
                        java.lang.String r0 = " reqProtol="
                        r6.append(r0)
                        java.lang.String r0 = r6
                        r6.append(r0)
                        java.lang.String r0 = "resCode=1000 action=onOpen resMsg=(null)"
                        r6.append(r0)
                        java.lang.String r6 = r6.toString()
                        android.util.Log.e(r1, r6)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.watchfun.translatewebsocket.BaseNewWebSocketManager.C42471.onOpen(f3f):void");
                }

                @Override // p000.kii
                public void onMessage(ByteBuffer byteBuffer) {
                    super.onMessage(byteBuffer);
                    try {
                        byte[] bArrByteBufferToByteArraySafe = AudioNewHeaderExtractor.byteBufferToByteArraySafe(byteBuffer);
                        if (!AudioNewHeaderExtractor.hasHeaders(bArrByteBufferToByteArraySafe)) {
                            Log.i("BaseNewWebSocketManager", "文件数据长度不足，无法包含消息头部");
                            return;
                        }
                        byte[] bArrExtractPcmData = AudioNewHeaderExtractor.extractPcmData(bArrByteBufferToByteArraySafe);
                        BaseNewWebSocketManager baseNewWebSocketManager = BaseNewWebSocketManager.this;
                        if (baseNewWebSocketManager.asrDataListener != null) {
                            if (baseNewWebSocketManager.outputFormat.equals(st5.f82815c)) {
                                BaseNewWebSocketManager baseNewWebSocketManager2 = BaseNewWebSocketManager.this;
                                baseNewWebSocketManager2.asrDataListener.onTtsPcm(bArrExtractPcmData, baseNewWebSocketManager2.outputSampleRate);
                            } else {
                                BaseNewWebSocketManager.this.asrDataListener.onTtsMp3(bArrExtractPcmData);
                            }
                        }
                        long jExtractStartTimeId = AudioNewHeaderExtractor.extractStartTimeId(bArrByteBufferToByteArraySafe);
                        int iExtractSessionId = AudioNewHeaderExtractor.extractSessionId(bArrByteBufferToByteArraySafe);
                        Log.i("BaseNewWebSocketManager", "快速提取 - StartTimeId: " + jExtractStartTimeId);
                        Log.i("BaseNewWebSocketManager", "快速提取 - SessionId: " + iExtractSessionId);
                        BaseNewWebSocketManager.this.handleAudioByteMessage(jExtractStartTimeId, iExtractSessionId, bArrExtractPcmData);
                        Log.i("BaseNewWebSocketManager", "音频数据: " + bArrExtractPcmData.length);
                        Log.i("BaseNewWebSocketManager", "PCM数据长度: " + bArrExtractPcmData.length + " 字节");
                        for (byte b : bArrExtractPcmData) {
                            String.format("%02X ", Byte.valueOf(b));
                        }
                    } catch (Exception e) {
                        System.err.println("测试出错: " + e.getMessage());
                        e.printStackTrace();
                        BaseNewWebSocketManager.this.resetAudioSegmentMarkers();
                    }
                }
            };
            C2478k.getCachedPool().execute(new Runnable() { // from class: ns0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65424a.lambda$initWebScoket$1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebScoket$0(String str) {
        try {
            Log.e("BaseNewWebSocketManager", "解析成功: " + Arrays.toString(InetAddress.getAllByName(str)));
        } catch (UnknownHostException unused) {
            Log.e("BaseNewWebSocketManager", "解析失败，无详细 DNS 数据");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebScoket$1() {
        try {
            if (this.mWebSocketClient != null) {
                this.connectState = 2;
                this.mWebSocketClient.connectBlocking();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reConnect$2() {
        try {
            initWebScoket(this.mUri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioSegmentMarkers() {
        this.currentAudioSegmentId = "";
        this.isAudioSegmentStarted = false;
        this.isAudioSegmentEnded = false;
        this.isAudioSegmentCallbacked = false;
    }

    private void updateContentCache(long j, WsNewTransMessageBean wsNewTransMessageBean) {
        String strValueOf = String.valueOf(j);
        Log.i("BaseNewWebSocketManager", "wsMessageBean.isFinal() =" + wsNewTransMessageBean.isFinal());
        if (!wsNewTransMessageBean.isFinal()) {
            if (TextUtils.isEmpty(this.contentMap.get(strValueOf))) {
                this.sttContent = wsNewTransMessageBean.getSourceText();
            } else {
                this.sttContent = this.contentMap.get(strValueOf) + wsNewTransMessageBean.getSourceText();
            }
            if (TextUtils.isEmpty(this.transContentMap.get(strValueOf))) {
                this.sttTransContent = wsNewTransMessageBean.getTargetText();
                return;
            }
            this.sttTransContent = this.transContentMap.get(strValueOf) + wsNewTransMessageBean.getTargetText();
            return;
        }
        if (TextUtils.isEmpty(this.contentMap.get(strValueOf))) {
            this.contentMap.put(strValueOf, wsNewTransMessageBean.getSourceText());
        } else {
            this.contentMap.put(strValueOf, this.contentMap.get(strValueOf) + wsNewTransMessageBean.getSourceText());
        }
        if (TextUtils.isEmpty(this.transContentMap.get(strValueOf))) {
            this.transContentMap.put(strValueOf, wsNewTransMessageBean.getTargetText());
        } else {
            this.transContentMap.put(strValueOf, this.transContentMap.get(strValueOf) + wsNewTransMessageBean.getTargetText());
        }
        this.sttContent = this.contentMap.get(strValueOf);
        this.sttTransContent = this.transContentMap.get(strValueOf);
    }

    public void convertPcmToMp3(String str, String str2, int i) throws Exception {
        File file = new File(str);
        new File(str2);
        if (file.exists()) {
            if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format(Locale.US, "-y -f s16le -ar %d -ac 1 -i \"%s\" -codec:a libmp3lame -b:a 64k -q:a 2 \"%s\"", Integer.valueOf(i), str.replace("\" ", "\\\" "), str2.replace("\" ", "\\\" "))).getReturnCode())) {
                Log.e("BaseNewWebSocketManager", "PCM 转换为 MP3 失败");
                return;
            }
            Log.i("BaseNewWebSocketManager", "PCM 转换为 MP3 成功:" + str2);
        }
    }

    public AsrDataListener getAsrDataListener() {
        return this.asrDataListener;
    }

    public int getConnectState() {
        return this.connectState;
    }

    public String getOutputPath() {
        if (this.mContext == null) {
            return "";
        }
        File file = new File(this.mContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/tts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public kii getWebSocketClient() {
        return this.mWebSocketClient;
    }

    public boolean isAsring() {
        StringBuilder sb = new StringBuilder();
        sb.append("stop--isAsring()-");
        sb.append(this.isAsring);
        return this.isAsring;
    }

    public boolean isClose() {
        kii kiiVar = this.mWebSocketClient;
        return kiiVar == null || kiiVar.isClosed();
    }

    public boolean isOpen() {
        kii kiiVar = this.mWebSocketClient;
        return kiiVar != null && kiiVar.isOpen();
    }

    public void onAudioEnd(String str, int i, String str2, int i2) {
    }

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public void onOpen() {
    }

    public void onReTryStartAsr() {
    }

    public void reConnect() {
        this.connectTimes++;
        C2478k.getCachedPool().execute(new Runnable() { // from class: ks0
            @Override // java.lang.Runnable
            public final void run() {
                this.f55220a.lambda$reConnect$2();
            }
        });
    }

    public void resetTime() {
        this.VAD_START = 8000L;
        this.VAD_END = 8000L;
    }

    public void send(String str) {
        try {
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar == null || !kiiVar.isOpen()) {
                return;
            }
            if (!str.contains("ping")) {
                Log.i("BaseNewWebSocketManager", "发数据 : " + str);
            }
            this.mWebSocketClient.send(str);
            if (str.contains("start")) {
                Log.i("BaseNewWebSocketManager", "发数据 : start" + str);
                this.lastNotSendStartMsg = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAsrDataListener(AsrDataListener asrDataListener) {
        this.asrDataListener = asrDataListener;
    }

    public void setLogSwitch(boolean z) {
    }

    public void setOnWebsockeOpentListener(OnWebsockeOpentListener onWebsockeOpentListener) {
        this.onWebsockeOpentListener = onWebsockeOpentListener;
    }

    public void setSendPcmData(boolean z) {
        this.isSendPcmData = z;
    }

    public void setVadTime(long j, long j2) {
        this.VAD_START = j;
        this.VAD_END = j2;
    }

    public void startSocket(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        this.mContext = context;
        this.appId = str2;
        this.apiSecret = str3;
        this.targetHost = str4;
        this.mWebsocketHeaders = map;
        try {
            URI uri = new URI(str);
            this.mUri = uri;
            initWebScoket(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void stop(boolean z, String str) {
    }

    public void stopAsr() {
        AudioNewRecorder.getInstance().stopRecord();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", jk5.f51004j);
            jSONObject.put("sessionId", this.sessionId);
            jSONObject.put("timestamp", System.currentTimeMillis());
            send(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
            this.handler.removeCallbacks(this.aliveRun);
            this.handler.removeCallbacks(this.stopRun);
            this.handler.removeCallbacks(this.reConnectRun);
            this.lastNotSendStartMsg = "";
        } finally {
            this.mWebSocketClient = null;
        }
    }

    public void unRegisterAsrDataListener() {
        this.asrDataListener = null;
    }

    public void onMessage(byte[] bArr, String str, String str2, String str3, String str4, int i) {
    }

    public void send(byte[] bArr) {
        try {
            kii kiiVar = this.mWebSocketClient;
            if (kiiVar != null && kiiVar.isOpen() && this.isAsring && this.isSendPcmData) {
                this.mWebSocketClient.send(bArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
