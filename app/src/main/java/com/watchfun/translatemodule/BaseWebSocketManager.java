package com.watchfun.translatemodule;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.translatemodule.bean.AudioBean;
import com.watchfun.translatemodule.bean.AudioEndBean;
import com.watchfun.translatemodule.bean.SpeechStopBean;
import com.watchfun.translatemodule.bean.WsMessageBean;
import com.watchfun.translatemodule.utils.MD5Util;
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
import org.json.JSONObject;
import p000.C1922bk;
import p000.a32;
import p000.amc;
import p000.go7;
import p000.kii;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebSocketManager {
    public static final int STATE_CLOSE = 0;
    public static final int STATE_CONNCETING = 2;
    public static final int STATE_OPEN = 1;
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
    private OnWebsockeOpentListener onWebsockeOpentListener;
    protected String sourLanguage;
    protected String sttContent;
    protected String sttTransContent;
    private String targetHost;
    protected String ttsFilepath;
    private final String TAG = "BaseWebSocketManager";
    protected final Handler handler = new Handler(Looper.getMainLooper());
    protected final long ALIVE_TIME = 10000;
    protected int model = 2;
    public final int ASR_MODE = 1;
    public final int TRANS_MODE = 2;
    public final int FREETALK_MODE = 3;
    public final int SIMULTANEOUS_MODE = 4;
    public int connectTimes = 0;
    public final int CONNECT_TIMES_TIP = 5;
    protected long VAD_START = 8000;
    protected long VAD_END = 8000;
    public Map<String, String> contentMap = new HashMap();
    public Map<String, String> transContentMap = new HashMap();
    protected boolean handleSpeechStopped = true;
    protected boolean isSendPcmData = true;
    protected volatile int connectState = 0;
    public String BACKUP_HOST = "ai.watchfunai.com";
    public String BACKUP_URL = "wss://" + this.BACKUP_HOST + "/ws/v1/translation";
    public final Runnable stopRun = new Runnable() { // from class: com.watchfun.translatemodule.BaseWebSocketManager.2
        @Override // java.lang.Runnable
        public void run() {
            BaseWebSocketManager.this.stopAsr();
            BaseWebSocketManager baseWebSocketManager = BaseWebSocketManager.this;
            baseWebSocketManager.stop(true, baseWebSocketManager.curStartTimeId);
        }
    };
    public final Runnable reConnectRun = new Runnable() { // from class: av0
        @Override // java.lang.Runnable
        public final void run() {
            this.f11913a.reConnect();
        }
    };
    public final Runnable aliveRun = new Runnable() { // from class: com.watchfun.translatemodule.BaseWebSocketManager.3
        @Override // java.lang.Runnable
        public void run() {
            BaseWebSocketManager.this.send("{\"command\":\"ping\",\"timestamp\":" + (System.currentTimeMillis() / 1000) + "}");
            BaseWebSocketManager baseWebSocketManager = BaseWebSocketManager.this;
            baseWebSocketManager.handler.postDelayed(baseWebSocketManager.aliveRun, 10000L);
        }
    };

    public static class AsrDataListener implements DataListener {
        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onClose(int i) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onError(Exception exc) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onMessageContinuous(String str, String str2, String str3, String str4, boolean z) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onMessageOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onOpen() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onReconnectFail() {
        }

        public void onSpeakInfo(WsMessageBean wsMessageBean) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onStopRecord() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onTts(File file) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onTtsEnd() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onTtsPcm(byte[] bArr, int i) {
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

        void onTtsPcm(byte[] bArr, int i);
    }

    public interface OnWebsockeOpentListener {
        void onOpen();
    }

    private Map<String, String> buildHttpHeader() {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5Util.stringToMD5(this.appId + this.apiSecret + strValueOf);
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

    private void initWebScoket(URI uri) {
        final String host = uri.getHost();
        final String path = uri.getPath();
        zi9.m26852e("BaseWebSocketManager", "initWebScoket 当前uri : " + path + " 当前 reqHost : " + host);
        final String scheme = uri.getScheme();
        C2478k.getCachedPool().execute(new Runnable() { // from class: xu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99330a.lambda$initWebScoket$0(host);
            }
        });
        if (this.mWebSocketClient == null || this.connectState == 0) {
            this.mWebSocketClient = new kii(uri, buildHttpHeader()) { // from class: com.watchfun.translatemodule.BaseWebSocketManager.1
                @Override // p000.kii
                public void onClose(int i, String str, boolean z) {
                    BaseWebSocketManager.this.connectState = 0;
                    AsrDataListener asrDataListener = BaseWebSocketManager.this.asrDataListener;
                    if (asrDataListener != null) {
                        asrDataListener.onClose(i);
                        BaseWebSocketManager baseWebSocketManager = BaseWebSocketManager.this;
                        int i2 = baseWebSocketManager.connectTimes;
                        if (i2 != 0 && i2 % 5 == 0) {
                            baseWebSocketManager.asrDataListener.onReconnectFail();
                        }
                    }
                    BaseWebSocketManager baseWebSocketManager2 = BaseWebSocketManager.this;
                    baseWebSocketManager2.handler.removeCallbacks(baseWebSocketManager2.aliveRun);
                    BaseWebSocketManager baseWebSocketManager3 = BaseWebSocketManager.this;
                    baseWebSocketManager3.handler.removeCallbacks(baseWebSocketManager3.reConnectRun);
                    if (1000 != i) {
                        BaseWebSocketManager baseWebSocketManager4 = BaseWebSocketManager.this;
                        baseWebSocketManager4.handler.postDelayed(baseWebSocketManager4.reConnectRun, 2000L);
                    }
                    BaseWebSocketManager baseWebSocketManager5 = BaseWebSocketManager.this;
                    baseWebSocketManager5.stop(true, baseWebSocketManager5.curStartTimeId);
                    zi9.m26852e("BaseWebSocketManager", "reqHost=" + host + " reqUrl=" + path + " reqProtol=" + scheme + " resCode=" + i + " action=onClose resMsg=" + str + " remote=" + z);
                    zi9.dOnlyEvent("reqHost=" + host + " reqUrl=" + path + " reqProtol=" + scheme + " resCode=" + i + " action=onClose resMsg=" + str + " remote=" + z);
                }

                @Override // p000.kii
                public void onError(Exception exc) {
                    BaseWebSocketManager.this.connectState = 0;
                    if ((exc instanceof UnknownHostException) || (exc instanceof SSLException) || (exc instanceof SocketTimeoutException) || ((exc instanceof IOException) && exc.getMessage() != null && (exc.getMessage().contains(a32.C0034g.f248b) || exc.getMessage().contains("TIMED_OUT") || exc.getMessage().contains("Unable to resolve host") || exc.getMessage().contains("No address associated with hostname")))) {
                        BaseWebSocketManager baseWebSocketManager = BaseWebSocketManager.this;
                        baseWebSocketManager.mUri = URI.create(baseWebSocketManager.BACKUP_URL);
                        BaseWebSocketManager baseWebSocketManager2 = BaseWebSocketManager.this;
                        baseWebSocketManager2.targetHost = baseWebSocketManager2.BACKUP_HOST;
                    }
                    AsrDataListener asrDataListener = BaseWebSocketManager.this.asrDataListener;
                    if (asrDataListener != null) {
                        asrDataListener.onError(exc);
                    }
                    zi9.m26852e("BaseWebSocketManager", "reqHost=" + host + " reqUrl=" + path + " reqProtol=" + scheme + " resCode=1001 action=onError resMsg=" + exc.getMessage());
                    zi9.dOnlyEvent("reqHost=" + host + " reqUrl=" + path + " reqProtol=" + scheme + " resCode=1001 action=onError resMsg=" + exc.getMessage());
                }

                @Override // p000.kii
                public void onMessage(String str) {
                    String str2;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        String string = new JSONObject(str).getString("type");
                        if (string.equals("configSet") || string.equals("pong")) {
                            return;
                        }
                        if (string.equals("speechStarted")) {
                            zi9.m26855i("BaseWebSocketManager", "onMessage : " + str);
                            return;
                        }
                        int length = 0;
                        if (string.equals("audio")) {
                            AudioBean audioBean = (AudioBean) sc7.fromJson(str, AudioBean.class);
                            int size = audioBean.getAudioData().size();
                            byte[] bArr = new byte[size];
                            while (length < audioBean.getAudioData().size()) {
                                bArr[length] = audioBean.getAudioData().get(length).byteValue();
                                length++;
                            }
                            zi9.m26855i("BaseWebSocketManager", "onMessage : 音频数据:" + size);
                            BaseWebSocketManager.this.onMessage(bArr, audioBean.getStartTimeId(), audioBean.getMessageId(), audioBean.getAudioFormat() == null ? amc.f2088w : audioBean.getAudioFormat(), audioBean.getOutputSampleRate() == 0 ? 16000 : audioBean.getOutputSampleRate());
                            return;
                        }
                        if (string.equals("audioEnd")) {
                            AudioEndBean audioEndBean = (AudioEndBean) sc7.fromJson(str, AudioEndBean.class);
                            zi9.m26852e("BaseWebSocketManager", "音频结束:::" + str + "::::" + audioEndBean.getStartTimeId());
                            if (TextUtils.isEmpty(audioEndBean.getStartTimeId())) {
                                return;
                            }
                            BaseWebSocketManager.this.onAudioEnd(audioEndBean.getStartTimeId(), audioEndBean.getMessageId(), audioEndBean.getAudioFormat(), audioEndBean.getOutputSampleRate());
                            return;
                        }
                        if (string.equals(C1922bk.b.f13909m) && BaseWebSocketManager.this.handleSpeechStopped) {
                            String startTimeId = ((SpeechStopBean) sc7.fromJson(str, SpeechStopBean.class)).getStartTimeId();
                            if (TextUtils.isEmpty(startTimeId) || BaseWebSocketManager.this.curStartTimeId.equals(startTimeId)) {
                                BaseWebSocketManager.this.stop(true, startTimeId);
                                BaseWebSocketManager.this.contentMap.remove(startTimeId);
                                BaseWebSocketManager.this.transContentMap.remove(startTimeId);
                            }
                            zi9.m26855i("BaseWebSocketManager", "后台停止识别！！！   当前会话:" + BaseWebSocketManager.this.curStartTimeId + ":::后台返回会话:" + startTimeId);
                            return;
                        }
                        if (string.equals("transcribe")) {
                            WsMessageBean wsMessageBean = (WsMessageBean) sc7.fromJson(str, WsMessageBean.class);
                            BaseWebSocketManager.this.sourLanguage = wsMessageBean.getLanguage();
                            BaseWebSocketManager.this.asrString = wsMessageBean.getText();
                            BaseWebSocketManager.this.asrTransString = wsMessageBean.getTargetText();
                            StringBuilder sb = new StringBuilder();
                            sb.append("onMessage transcribe asr长度:");
                            sb.append(TextUtils.isEmpty(BaseWebSocketManager.this.asrString) ? 0 : BaseWebSocketManager.this.asrString.length());
                            sb.append(", trans长度:");
                            if (!TextUtils.isEmpty(BaseWebSocketManager.this.asrTransString)) {
                                length = BaseWebSocketManager.this.asrTransString.length();
                            }
                            sb.append(length);
                            zi9.m26855i("BaseWebSocketManager", sb.toString());
                            int i = BaseWebSocketManager.this.model;
                            if (i == 3 || i == 4) {
                                str2 = BaseWebSocketManager.this.getOutputPath() + pj4.f71071b + wsMessageBean.getStartTimeId() + p43.f69617m + wsMessageBean.getMessageId() + ".mp3";
                            } else {
                                str2 = BaseWebSocketManager.this.getOutputPath() + pj4.f71071b + wsMessageBean.getStartTimeId() + ".mp3";
                            }
                            BaseWebSocketManager.this.ttsFilepath = str2;
                            if (wsMessageBean.isFinal()) {
                                if (TextUtils.isEmpty(BaseWebSocketManager.this.contentMap.get(wsMessageBean.getStartTimeId()))) {
                                    BaseWebSocketManager.this.contentMap.put(wsMessageBean.getStartTimeId(), wsMessageBean.getText());
                                } else {
                                    BaseWebSocketManager.this.contentMap.put(wsMessageBean.getStartTimeId(), BaseWebSocketManager.this.contentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getText());
                                }
                                if (TextUtils.isEmpty(BaseWebSocketManager.this.transContentMap.get(wsMessageBean.getStartTimeId()))) {
                                    BaseWebSocketManager.this.transContentMap.put(wsMessageBean.getStartTimeId(), wsMessageBean.getTargetText());
                                } else {
                                    BaseWebSocketManager.this.transContentMap.put(wsMessageBean.getStartTimeId(), BaseWebSocketManager.this.transContentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getTargetText());
                                }
                                BaseWebSocketManager baseWebSocketManager = BaseWebSocketManager.this;
                                baseWebSocketManager.sttContent = baseWebSocketManager.contentMap.get(wsMessageBean.getStartTimeId());
                                BaseWebSocketManager baseWebSocketManager2 = BaseWebSocketManager.this;
                                baseWebSocketManager2.sttTransContent = baseWebSocketManager2.transContentMap.get(wsMessageBean.getStartTimeId());
                            } else {
                                if (TextUtils.isEmpty(BaseWebSocketManager.this.contentMap.get(wsMessageBean.getStartTimeId()))) {
                                    BaseWebSocketManager.this.sttContent = wsMessageBean.getText();
                                } else {
                                    BaseWebSocketManager.this.sttContent = BaseWebSocketManager.this.contentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getText();
                                }
                                if (TextUtils.isEmpty(BaseWebSocketManager.this.transContentMap.get(wsMessageBean.getStartTimeId()))) {
                                    BaseWebSocketManager.this.sttTransContent = wsMessageBean.getTargetText();
                                } else {
                                    BaseWebSocketManager.this.sttTransContent = BaseWebSocketManager.this.transContentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getTargetText();
                                }
                            }
                            BaseWebSocketManager baseWebSocketManager3 = BaseWebSocketManager.this;
                            AsrDataListener asrDataListener = baseWebSocketManager3.asrDataListener;
                            if (asrDataListener != null) {
                                asrDataListener.onMessageContinuous(baseWebSocketManager3.sttContent, baseWebSocketManager3.sttTransContent, str2, wsMessageBean.getStartTimeId(), false);
                                BaseWebSocketManager baseWebSocketManager4 = BaseWebSocketManager.this;
                                baseWebSocketManager4.asrDataListener.onMessageOnce(baseWebSocketManager4.sourLanguage, baseWebSocketManager4.asrString, baseWebSocketManager4.asrTransString, str2, wsMessageBean.getStartTimeId(), wsMessageBean.isFinal());
                                BaseWebSocketManager.this.asrDataListener.onSpeakInfo(wsMessageBean);
                            }
                            if (wsMessageBean.isFinal()) {
                                BaseWebSocketManager baseWebSocketManager5 = BaseWebSocketManager.this;
                                baseWebSocketManager5.asrString = "";
                                baseWebSocketManager5.asrTransString = "";
                            }
                            BaseWebSocketManager baseWebSocketManager6 = BaseWebSocketManager.this;
                            baseWebSocketManager6.handler.removeCallbacks(baseWebSocketManager6.stopRun);
                            BaseWebSocketManager baseWebSocketManager7 = BaseWebSocketManager.this;
                            baseWebSocketManager7.handler.postDelayed(baseWebSocketManager7.stopRun, baseWebSocketManager7.VAD_END);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
                @Override // p000.kii
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onOpen(p000.f3f r6) {
                    /*
                        Method dump skipped, instruction units count: 225
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.watchfun.translatemodule.BaseWebSocketManager.C42371.onOpen(f3f):void");
                }
            };
            C2478k.getCachedPool().execute(new Runnable() { // from class: yu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102977a.lambda$initWebScoket$1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebScoket$0(String str) {
        try {
            zi9.m26852e("BaseWebSocketManager", "解析成功: " + Arrays.toString(InetAddress.getAllByName(str)));
        } catch (UnknownHostException unused) {
            zi9.m26852e("BaseWebSocketManager", "解析失败，无详细 DNS 数据");
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

    public void convertPcmToMp3(String str, String str2, int i) throws Exception {
        File file = new File(str);
        new File(str2);
        if (file.exists()) {
            if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format(Locale.US, "-y -f s16le -ar %d -ac 1 -i \"%s\" -codec:a libmp3lame -b:a 64k -q:a 2 \"%s\"", Integer.valueOf(i), str.replace("\" ", "\\\" "), str2.replace("\" ", "\\\" "))).getReturnCode())) {
                zi9.m26852e("BaseWebSocketManager", "PCM 转换为 MP3 失败");
                return;
            }
            zi9.m26855i("BaseWebSocketManager", "PCM 转换为 MP3 成功:" + str2);
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

    public void reConnect() {
        this.connectTimes++;
        C2478k.getCachedPool().execute(new Runnable() { // from class: zu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106089a.lambda$reConnect$2();
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
            if (kiiVar == null) {
                zi9.m26852e("BaseWebSocketManager", "发数据失败，未连接 : " + str);
                if (str.contains("startSpeech")) {
                    this.lastNotSendStartMsg = str;
                    return;
                }
                return;
            }
            if (!kiiVar.isOpen()) {
                zi9.m26852e("BaseWebSocketManager", "发数据失败，未连接 : " + str);
                if (str.contains("startSpeech")) {
                    this.lastNotSendStartMsg = str;
                    return;
                }
                return;
            }
            if (!str.contains("ping")) {
                zi9.m26855i("BaseWebSocketManager", "发数据 : " + str);
            }
            this.mWebSocketClient.send(str);
            if (str.contains("startSpeech")) {
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
        AudioRecorder.getInstance().stopRecord();
        send("{\"command\":\"stopSpeech\",\"startTimeId\":" + this.curStartTimeId + "}");
    }

    public void stopSocket() {
        try {
            try {
                kii kiiVar = this.mWebSocketClient;
                if (kiiVar != null && kiiVar.isOpen()) {
                    this.mWebSocketClient.close(1000);
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

    public void onMessage(byte[] bArr, String str, String str2, String str3, int i) {
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
