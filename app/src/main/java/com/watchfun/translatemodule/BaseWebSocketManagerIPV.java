package com.watchfun.translatemodule;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2478k;
import com.watchfun.translatemodule.bean.AudioBean;
import com.watchfun.translatemodule.bean.SpeechStopBean;
import com.watchfun.translatemodule.bean.WsMessageBean;
import com.watchfun.translatemodule.utils.MD5Util;
import java.io.File;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000.C1922bk;
import p000.f3f;
import p000.go7;
import p000.kii;
import p000.p43;
import p000.pj4;
import p000.sc7;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebSocketManagerIPV {
    private String apiSecret;
    private String appId;
    protected AsrDataListener asrDataListener;
    protected String asrString;
    protected String asrTransString;
    protected String curStartTimeId;
    protected boolean isAsring;
    private boolean isStopSocket;
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
    private final String TAG = "WebSocket";
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
    public final Runnable stopRun = new Runnable() { // from class: com.watchfun.translatemodule.BaseWebSocketManagerIPV.2
        @Override // java.lang.Runnable
        public void run() {
            BaseWebSocketManagerIPV.this.stopAsr();
            BaseWebSocketManagerIPV baseWebSocketManagerIPV = BaseWebSocketManagerIPV.this;
            baseWebSocketManagerIPV.stop(true, baseWebSocketManagerIPV.curStartTimeId);
        }
    };
    public final Runnable reConnectRun = new Runnable() { // from class: cv0
        @Override // java.lang.Runnable
        public final void run() {
            this.f27711a.lambda$new$3();
        }
    };
    public final Runnable aliveRun = new Runnable() { // from class: com.watchfun.translatemodule.BaseWebSocketManagerIPV.3
        @Override // java.lang.Runnable
        public void run() {
            BaseWebSocketManagerIPV.this.send("{\"command\":\"ping\",\"timestamp\":" + (System.currentTimeMillis() / 1000) + "}");
            BaseWebSocketManagerIPV baseWebSocketManagerIPV = BaseWebSocketManagerIPV.this;
            baseWebSocketManagerIPV.handler.postDelayed(baseWebSocketManagerIPV.aliveRun, 10000L);
        }
    };

    public static class AsrDataListener implements DataListener {
        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onClose(int i) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onError(Exception exc) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onMessageContinuous(String str, String str2, String str3, String str4, boolean z) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onMessageOnce(String str, String str2, String str3, String str4, String str5, boolean z) {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onOpen() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onReconnectFail() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onStopRecord() {
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManagerIPV.DataListener
        public void onTts(File file) {
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

    private kii createClient(final InetAddress inetAddress, final AtomicBoolean atomicBoolean, final List<kii> list) {
        if (this.mUri.getPort() != -1) {
            this.mUri.getPort();
        } else {
            "wss".equals(this.mUri.getScheme());
        }
        zi9.m26850d("WebSocket", "尝试连接: " + inetAddress.getHostAddress());
        return new kii(this.mUri, buildHttpHeader()) { // from class: com.watchfun.translatemodule.BaseWebSocketManagerIPV.1
            @Override // p000.kii
            public void onClose(int i, String str, boolean z) {
                BaseWebSocketManagerIPV.this.handleClose(i, str, z);
                zi9.m26855i("WebSocket", "onClose " + i + ",reason:" + str + ",remote:" + z);
            }

            @Override // p000.kii
            public void onError(Exception exc) {
                zi9.m26855i("WebSocket", "Error " + exc.getMessage());
                BaseWebSocketManagerIPV baseWebSocketManagerIPV = BaseWebSocketManagerIPV.this;
                if (baseWebSocketManagerIPV.mWebSocketClient == this) {
                    AsrDataListener asrDataListener = baseWebSocketManagerIPV.asrDataListener;
                    if (asrDataListener != null) {
                        asrDataListener.onError(exc);
                    }
                    zi9.m26852e("WebSocket", "连接错误: " + exc.getClass().getSimpleName());
                    if (exc instanceof UnknownHostException) {
                        zi9.m26850d("WebSocket", "DNS 解析失败，重连");
                    }
                    BaseWebSocketManagerIPV.this.mWebSocketClient.close();
                }
            }

            @Override // p000.kii
            public void onMessage(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    if (str.contains("audio")) {
                        zi9.m26855i("WebSocket", "onMessage : 收到音频数据，内容省略");
                    } else if (!str.contains("pong")) {
                        zi9.m26855i("WebSocket", "onMessage : " + str);
                    }
                    String string = new JSONObject(str).getString("type");
                    if (string.equals("configSet") || string.equals("pong") || string.equals("speechStarted")) {
                        return;
                    }
                    if (string.equals("audio")) {
                        AudioBean audioBean = (AudioBean) sc7.fromJson(str, AudioBean.class);
                        byte[] bArr = new byte[audioBean.getAudioData().size()];
                        for (int i = 0; i < audioBean.getAudioData().size(); i++) {
                            bArr[i] = audioBean.getAudioData().get(i).byteValue();
                        }
                        BaseWebSocketManagerIPV.this.onMessage(bArr, audioBean.getStartTimeId(), audioBean.getMessageId());
                        return;
                    }
                    if (string.equals(C1922bk.b.f13909m) && BaseWebSocketManagerIPV.this.handleSpeechStopped) {
                        String startTimeId = ((SpeechStopBean) sc7.fromJson(str, SpeechStopBean.class)).getStartTimeId();
                        if (TextUtils.isEmpty(startTimeId) || BaseWebSocketManagerIPV.this.curStartTimeId.equals(startTimeId)) {
                            BaseWebSocketManagerIPV.this.stop(true, startTimeId);
                            BaseWebSocketManagerIPV.this.contentMap.remove(startTimeId);
                            BaseWebSocketManagerIPV.this.transContentMap.remove(startTimeId);
                        }
                        zi9.m26855i("WebSocket", "后台停止识别！！！" + BaseWebSocketManagerIPV.this.curStartTimeId + ":::" + startTimeId);
                        return;
                    }
                    if (string.equals("transcribe")) {
                        WsMessageBean wsMessageBean = (WsMessageBean) sc7.fromJson(str, WsMessageBean.class);
                        BaseWebSocketManagerIPV.this.sourLanguage = wsMessageBean.getLanguage();
                        BaseWebSocketManagerIPV.this.asrString = wsMessageBean.getText();
                        BaseWebSocketManagerIPV.this.asrTransString = wsMessageBean.getTargetText();
                        int i2 = BaseWebSocketManagerIPV.this.model;
                        String str2 = (i2 == 3 || i2 == 4) ? BaseWebSocketManagerIPV.this.getOutputPath() + pj4.f71071b + wsMessageBean.getStartTimeId() + p43.f69617m + wsMessageBean.getMessageId() + ".mp3" : BaseWebSocketManagerIPV.this.getOutputPath() + pj4.f71071b + wsMessageBean.getStartTimeId() + ".mp3";
                        BaseWebSocketManagerIPV.this.ttsFilepath = str2;
                        if (wsMessageBean.isFinal()) {
                            if (TextUtils.isEmpty(BaseWebSocketManagerIPV.this.contentMap.get(wsMessageBean.getStartTimeId()))) {
                                BaseWebSocketManagerIPV.this.contentMap.put(wsMessageBean.getStartTimeId(), wsMessageBean.getText());
                            } else {
                                BaseWebSocketManagerIPV.this.contentMap.put(wsMessageBean.getStartTimeId(), BaseWebSocketManagerIPV.this.contentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getText());
                            }
                            if (TextUtils.isEmpty(BaseWebSocketManagerIPV.this.transContentMap.get(wsMessageBean.getStartTimeId()))) {
                                BaseWebSocketManagerIPV.this.transContentMap.put(wsMessageBean.getStartTimeId(), wsMessageBean.getTargetText());
                            } else {
                                BaseWebSocketManagerIPV.this.transContentMap.put(wsMessageBean.getStartTimeId(), BaseWebSocketManagerIPV.this.transContentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getTargetText());
                            }
                            BaseWebSocketManagerIPV baseWebSocketManagerIPV = BaseWebSocketManagerIPV.this;
                            baseWebSocketManagerIPV.sttContent = baseWebSocketManagerIPV.contentMap.get(wsMessageBean.getStartTimeId());
                            BaseWebSocketManagerIPV baseWebSocketManagerIPV2 = BaseWebSocketManagerIPV.this;
                            baseWebSocketManagerIPV2.sttTransContent = baseWebSocketManagerIPV2.transContentMap.get(wsMessageBean.getStartTimeId());
                        } else {
                            if (TextUtils.isEmpty(BaseWebSocketManagerIPV.this.contentMap.get(wsMessageBean.getStartTimeId()))) {
                                BaseWebSocketManagerIPV.this.sttContent = wsMessageBean.getText();
                            } else {
                                BaseWebSocketManagerIPV.this.sttContent = BaseWebSocketManagerIPV.this.contentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getText();
                            }
                            if (TextUtils.isEmpty(BaseWebSocketManagerIPV.this.transContentMap.get(wsMessageBean.getStartTimeId()))) {
                                BaseWebSocketManagerIPV.this.sttTransContent = wsMessageBean.getTargetText();
                            } else {
                                BaseWebSocketManagerIPV.this.sttTransContent = BaseWebSocketManagerIPV.this.transContentMap.get(wsMessageBean.getStartTimeId()) + wsMessageBean.getTargetText();
                            }
                        }
                        BaseWebSocketManagerIPV baseWebSocketManagerIPV3 = BaseWebSocketManagerIPV.this;
                        AsrDataListener asrDataListener = baseWebSocketManagerIPV3.asrDataListener;
                        if (asrDataListener != null) {
                            asrDataListener.onMessageContinuous(baseWebSocketManagerIPV3.sttContent, baseWebSocketManagerIPV3.sttTransContent, str2, wsMessageBean.getStartTimeId(), false);
                            BaseWebSocketManagerIPV baseWebSocketManagerIPV4 = BaseWebSocketManagerIPV.this;
                            baseWebSocketManagerIPV4.asrDataListener.onMessageOnce(baseWebSocketManagerIPV4.sourLanguage, baseWebSocketManagerIPV4.asrString, baseWebSocketManagerIPV4.asrTransString, str2, wsMessageBean.getStartTimeId(), wsMessageBean.isFinal());
                        }
                        if (wsMessageBean.isFinal()) {
                            BaseWebSocketManagerIPV baseWebSocketManagerIPV5 = BaseWebSocketManagerIPV.this;
                            baseWebSocketManagerIPV5.asrString = "";
                            baseWebSocketManagerIPV5.asrTransString = "";
                        }
                        BaseWebSocketManagerIPV baseWebSocketManagerIPV6 = BaseWebSocketManagerIPV.this;
                        baseWebSocketManagerIPV6.handler.removeCallbacks(baseWebSocketManagerIPV6.stopRun);
                        BaseWebSocketManagerIPV baseWebSocketManagerIPV7 = BaseWebSocketManagerIPV.this;
                        baseWebSocketManagerIPV7.handler.postDelayed(baseWebSocketManagerIPV7.stopRun, baseWebSocketManagerIPV7.VAD_END);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // p000.kii
            public void onOpen(f3f f3fVar) {
                if (!atomicBoolean.compareAndSet(false, true)) {
                    close();
                    return;
                }
                zi9.m26855i("WebSocket", "onOpen 连接成功: " + inetAddress.getHostAddress());
                BaseWebSocketManagerIPV.this.mWebSocketClient = this;
                synchronized (list) {
                    try {
                        for (kii kiiVar : list) {
                            if (kiiVar != this) {
                                kiiVar.close();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                BaseWebSocketManagerIPV baseWebSocketManagerIPV = BaseWebSocketManagerIPV.this;
                baseWebSocketManagerIPV.connectTimes = 0;
                baseWebSocketManagerIPV.handler.removeCallbacks(baseWebSocketManagerIPV.aliveRun);
                BaseWebSocketManagerIPV baseWebSocketManagerIPV2 = BaseWebSocketManagerIPV.this;
                baseWebSocketManagerIPV2.handler.postDelayed(baseWebSocketManagerIPV2.aliveRun, 10000L);
                AsrDataListener asrDataListener = BaseWebSocketManagerIPV.this.asrDataListener;
                if (asrDataListener != null) {
                    asrDataListener.onOpen();
                }
                if (BaseWebSocketManagerIPV.this.onWebsockeOpentListener != null) {
                    BaseWebSocketManagerIPV.this.onWebsockeOpentListener.onOpen();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClose(int i, String str, boolean z) {
        AsrDataListener asrDataListener = this.asrDataListener;
        if (asrDataListener != null) {
            asrDataListener.onClose(i);
            int i2 = this.connectTimes;
            if (i2 != 0 && i2 % 5 == 0) {
                this.asrDataListener.onReconnectFail();
            }
        }
        this.handler.removeCallbacks(this.reConnectRun);
        StringBuilder sb = new StringBuilder();
        sb.append("handleClose 是否重连:");
        sb.append(!this.isStopSocket);
        zi9.m26855i("WebSocket", sb.toString());
        if (!this.isStopSocket) {
            this.handler.postDelayed(this.reConnectRun, 2000L);
        }
        stop(true, this.curStartTimeId);
    }

    private void initWebSocket() {
        if (this.mWebSocketClient != null) {
            zi9.m26855i("WebSocket", "已有连接，先关闭");
            this.mWebSocketClient.close();
            this.mWebSocketClient = null;
        }
        this.isStopSocket = false;
        zi9.m26850d("WebSocket", "开始连接: " + this.mUri.toString());
        C2478k.getCachedPool().execute(new Runnable() { // from class: bv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14845a.lambda$initWebSocket$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebSocket$0(InetAddress inetAddress, AtomicBoolean atomicBoolean, List list) {
        try {
            zi9.m26852e("WebSocket", "组建连接IPV6::" + inetAddress.getHostAddress());
            kii kiiVarCreateClient = createClient(inetAddress, atomicBoolean, list);
            synchronized (list) {
                list.add(kiiVarCreateClient);
            }
            if (kiiVarCreateClient.connectBlocking(5L, TimeUnit.SECONDS)) {
                return;
            }
            zi9.m26852e("WebSocket", "IPv6 连接失败");
        } catch (Exception e) {
            zi9.m26852e("WebSocket", "IPv6 异常: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebSocket$1(AtomicBoolean atomicBoolean, InetAddress inetAddress, List list) {
        try {
            Thread.sleep(300L);
            if (atomicBoolean.get()) {
                return;
            }
            zi9.m26852e("WebSocket", "组建连接IPV4::" + inetAddress.getHostAddress());
            kii kiiVarCreateClient = createClient(inetAddress, atomicBoolean, list);
            synchronized (list) {
                list.add(kiiVarCreateClient);
            }
            if (kiiVarCreateClient.connectBlocking(5L, TimeUnit.SECONDS)) {
                return;
            }
            zi9.m26852e("WebSocket", "IPv4 连接失败");
        } catch (Exception e) {
            zi9.m26852e("WebSocket", "IPv4 异常: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebSocket$2() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.mUri.getHost());
            if (allByName.length == 0) {
                zi9.m26852e("WebSocket", "DNS 无返回地址");
                this.handler.removeCallbacks(this.reConnectRun);
                this.handler.postDelayed(this.reConnectRun, 2000L);
                return;
            }
            final InetAddress inetAddress = null;
            final InetAddress inetAddress2 = null;
            for (InetAddress inetAddress3 : allByName) {
                if ((inetAddress3 instanceof Inet6Address) && inetAddress == null) {
                    inetAddress = inetAddress3;
                } else if ((inetAddress3 instanceof Inet4Address) && inetAddress2 == null) {
                    inetAddress2 = inetAddress3;
                }
            }
            if (inetAddress == null && inetAddress2 == null) {
                zi9.m26852e("WebSocket", "没有可用的 IPv6/IPv4 地址");
                this.handler.removeCallbacks(this.reConnectRun);
                this.handler.postDelayed(this.reConnectRun, 2000L);
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final ArrayList arrayList = new ArrayList();
            if (inetAddress != null) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: dv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30923a.lambda$initWebSocket$0(inetAddress, atomicBoolean, arrayList);
                    }
                });
            }
            if (inetAddress2 != null) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: ev0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34108a.lambda$initWebSocket$1(atomicBoolean, inetAddress2, arrayList);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            zi9.m26852e("WebSocket", "连接异常: " + e.getMessage());
            this.handler.removeCallbacks(this.reConnectRun);
            this.handler.postDelayed(this.reConnectRun, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        zi9.m26855i("WebSocket", "reConnectRun Reconnect");
        this.connectTimes++;
        initWebSocket();
    }

    public AsrDataListener getAsrDataListener() {
        return this.asrDataListener;
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

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public void resetTime() {
        this.VAD_START = 8000L;
        this.VAD_END = 8000L;
    }

    public void send(String str) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar == null) {
            zi9.m26852e("WebSocket", "发数据失败，未连接::::" + str);
            return;
        }
        if (!kiiVar.isOpen()) {
            zi9.m26852e("WebSocket", "发数据失败，未连接::::" + str);
            return;
        }
        if (!str.contains("ping")) {
            zi9.m26855i("WebSocket", "发数据::::" + str);
        }
        this.mWebSocketClient.send(str);
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
            this.mUri = new URI(str);
            initWebSocket();
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
        this.isStopSocket = true;
        try {
            try {
                kii kiiVar = this.mWebSocketClient;
                if (kiiVar != null && kiiVar.isOpen()) {
                    zi9.m26852e("WebSocket", "主动断开socket");
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

    public void onMessage(byte[] bArr, String str, String str2) {
    }

    public void send(byte[] bArr) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar != null && kiiVar.isOpen() && this.isAsring && this.isSendPcmData) {
            this.mWebSocketClient.send(bArr);
        }
    }
}
