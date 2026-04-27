package com.watchfun.transcommon.manager.trans;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.watchfun.translatemodule.AudioRecorder;
import com.watchfun.translatemodule.bean.WsMessageBean;
import com.watchfun.translatemodule.utils.MD5Util;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.e10;
import p000.f3f;
import p000.go7;
import p000.kii;
import p000.qc7;
import p000.ryg;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class AsrWebSocketManager {
    public static final String TargetHost = "ai.watchfun.cn";
    private static volatile AsrWebSocketManager mWebSocketManager;
    private String asrString;
    private String asrTransString;
    private boolean isAsring;
    private URI mUri;
    private kii mWebSocketClient;
    private OnWebsockeOpentListener onWebsockeOpentListener;
    private OnWebsocketListener onWebsocketListener;
    private String sourLanguage;
    private String sttContent;
    private String sttTransContent;
    private final String TAG = "WebSocketManager";
    private final String BASE_URL = "wss://ai.watchfun.cn/ws/transcribe?";
    private final StringBuffer sttBuffer = new StringBuffer();
    private final StringBuffer sttTransBuffer = new StringBuffer();
    private boolean isUseInsideRecord = true;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long VAD_START = 5000;
    private long VAD_END = 2000;
    private final Runnable stopRun = new Runnable() { // from class: o80
        @Override // java.lang.Runnable
        public final void run() {
            this.f66633a.stopSocket();
        }
    };

    public interface OnWebsockeOpentListener {
        void onOpen();
    }

    public interface OnWebsocketListener {
        void onClose(int i);

        void onError(Exception exc);

        void onMessageContinuous(String str, String str2, boolean z);

        void onMessageOnce(String str, String str2, String str3, boolean z);

        void onOpen();
    }

    public AsrWebSocketManager() {
        AudioRecorder.getInstance().createDefaultAudio();
    }

    private Map<String, String> buildHttpHeader() {
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String strStringToMD5 = MD5Util.stringToMD5(e10.f31486b + e10.f31487c + strValueOf);
        map.put("x-request-appid", e10.f31486b);
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-sign", strStringToMD5);
        map.put(go7.f40586w, "ai.watchfun.cn");
        return map;
    }

    public static AsrWebSocketManager getInstance() {
        if (mWebSocketManager == null) {
            synchronized (AsrWebSocketManager.class) {
                try {
                    if (mWebSocketManager == null) {
                        mWebSocketManager = new AsrWebSocketManager();
                    }
                } finally {
                }
            }
        }
        return mWebSocketManager;
    }

    private void initWebScoket(final boolean z, final String str) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar == null || !kiiVar.isOpen()) {
            this.mWebSocketClient = new kii(this.mUri, buildHttpHeader()) { // from class: com.watchfun.transcommon.manager.trans.AsrWebSocketManager.1
                @Override // p000.kii
                public void onClose(int i, String str2, boolean z2) {
                    if (AsrWebSocketManager.this.onWebsocketListener != null) {
                        AsrWebSocketManager.this.onWebsocketListener.onMessageContinuous(AsrWebSocketManager.this.sttContent, AsrWebSocketManager.this.sttTransContent, true);
                        if (!TextUtils.isEmpty(AsrWebSocketManager.this.asrString) && !TextUtils.isEmpty(AsrWebSocketManager.this.asrTransString)) {
                            AsrWebSocketManager.this.onWebsocketListener.onMessageOnce(AsrWebSocketManager.this.sourLanguage, AsrWebSocketManager.this.asrString, AsrWebSocketManager.this.asrTransString, true);
                        }
                        AsrWebSocketManager.this.onWebsocketListener.onClose(i);
                    }
                    if (AsrWebSocketManager.this.isUseInsideRecord) {
                        AudioRecorder.getInstance().stopRecord();
                    }
                    AsrWebSocketManager.this.resetData();
                    Log.i("Websocket", "onClose " + i);
                }

                @Override // p000.kii
                public void onError(Exception exc) {
                    if (AsrWebSocketManager.this.onWebsocketListener != null) {
                        AsrWebSocketManager.this.onWebsocketListener.onError(exc);
                    }
                    if (AsrWebSocketManager.this.isUseInsideRecord) {
                        AudioRecorder.getInstance().stopRecord();
                    }
                    AsrWebSocketManager.this.resetData();
                    Log.i("Websocket", "Error " + exc.getMessage());
                }

                @Override // p000.kii
                public void onMessage(String str2) {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    WsMessageBean wsMessageBean = (WsMessageBean) qc7.fromJson(str2, WsMessageBean.class);
                    AsrWebSocketManager.this.sourLanguage = wsMessageBean.getLanguage();
                    AsrWebSocketManager.this.asrString = wsMessageBean.getText();
                    AsrWebSocketManager.this.asrTransString = wsMessageBean.getTargetText();
                    if (wsMessageBean.isFinal()) {
                        AsrWebSocketManager asrWebSocketManager = AsrWebSocketManager.this;
                        StringBuffer stringBuffer = asrWebSocketManager.sttBuffer;
                        stringBuffer.append(wsMessageBean.getText());
                        asrWebSocketManager.sttContent = stringBuffer.toString();
                        AsrWebSocketManager asrWebSocketManager2 = AsrWebSocketManager.this;
                        StringBuffer stringBuffer2 = asrWebSocketManager2.sttTransBuffer;
                        stringBuffer2.append(wsMessageBean.getTargetText());
                        asrWebSocketManager2.sttTransContent = stringBuffer2.toString();
                    } else {
                        AsrWebSocketManager.this.sttContent = AsrWebSocketManager.this.sttBuffer.toString() + wsMessageBean.getText();
                        AsrWebSocketManager.this.sttTransContent = AsrWebSocketManager.this.sttTransBuffer.toString() + wsMessageBean.getTargetText();
                    }
                    if (AsrWebSocketManager.this.onWebsocketListener != null) {
                        AsrWebSocketManager.this.onWebsocketListener.onMessageContinuous(AsrWebSocketManager.this.sttContent, AsrWebSocketManager.this.sttTransContent, false);
                        AsrWebSocketManager.this.onWebsocketListener.onMessageOnce(AsrWebSocketManager.this.sourLanguage, AsrWebSocketManager.this.asrString, AsrWebSocketManager.this.asrTransString, wsMessageBean.isFinal());
                    }
                    if (wsMessageBean.isFinal()) {
                        AsrWebSocketManager.this.asrString = "";
                        AsrWebSocketManager.this.asrTransString = "";
                    }
                    AsrWebSocketManager.this.handler.removeCallbacks(AsrWebSocketManager.this.stopRun);
                    AsrWebSocketManager.this.handler.postDelayed(AsrWebSocketManager.this.stopRun, AsrWebSocketManager.this.VAD_END);
                }

                @Override // p000.kii
                public void onOpen(f3f f3fVar) {
                    if (AsrWebSocketManager.this.onWebsocketListener != null) {
                        AsrWebSocketManager.this.onWebsocketListener.onOpen();
                    }
                    if (AsrWebSocketManager.this.onWebsockeOpentListener != null) {
                        AsrWebSocketManager.this.onWebsockeOpentListener.onOpen();
                    }
                    AsrWebSocketManager.this.handler.removeCallbacks(AsrWebSocketManager.this.stopRun);
                    AsrWebSocketManager.this.handler.postDelayed(AsrWebSocketManager.this.stopRun, AsrWebSocketManager.this.VAD_START);
                    if (AsrWebSocketManager.this.isUseInsideRecord) {
                        AsrWebSocketManager.this.startWssRecord(z, str);
                    }
                    AsrWebSocketManager.this.isAsring = true;
                    yi9.m26095i("Websocket", "Opened");
                }
            };
            ryg.postOnBackgroundThread(new Runnable() { // from class: n80
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63479a.lambda$initWebScoket$0();
                }
            });
        }
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
    public /* synthetic */ void lambda$reConnect$1() {
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
    public /* synthetic */ void lambda$startWssRecord$2(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWssRecord$3(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetData() {
        this.handler.removeCallbacks(this.stopRun);
        this.sttBuffer.setLength(0);
        this.sttTransBuffer.setLength(0);
        this.sttContent = "";
        this.sttTransContent = "";
        this.asrString = "";
        this.asrTransString = "";
        this.isAsring = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startWssRecord(boolean z, String str) {
        if (!z || TextUtils.isEmpty(str)) {
            AudioRecorder.getInstance().startRecord(new AudioRecorder.RecordStreamListener() { // from class: m80
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f60176a.lambda$startWssRecord$3(bArr, i, i2);
                }
            });
        } else {
            AudioRecorder.getInstance().startRecord(str, new AudioRecorder.RecordStreamListener() { // from class: l80
                @Override // com.watchfun.translatemodule.AudioRecorder.RecordStreamListener
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f56742a.lambda$startWssRecord$2(bArr, i, i2);
                }
            });
        }
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

    public void reConnect() {
        ryg.postOnBackgroundThread(new Runnable() { // from class: k80
            @Override // java.lang.Runnable
            public final void run() {
                this.f52752a.lambda$reConnect$1();
            }
        });
    }

    public void release() {
        stopSocket();
        AudioRecorder.getInstance().release();
        this.handler.removeCallbacks(this.stopRun);
        if (mWebSocketManager != null) {
            mWebSocketManager = null;
        }
    }

    public void send(String str) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar == null || !kiiVar.isOpen()) {
            return;
        }
        this.mWebSocketClient.send(str);
    }

    public void setOnWebsockeOpentListener(OnWebsockeOpentListener onWebsockeOpentListener) {
        this.onWebsockeOpentListener = onWebsockeOpentListener;
    }

    public void setOnWebsocketListener(OnWebsocketListener onWebsocketListener) {
        this.onWebsocketListener = onWebsocketListener;
    }

    public void setUseInsideRecord(boolean z) {
        this.isUseInsideRecord = z;
    }

    public void setVadTime(long j, long j2) {
        this.VAD_START = j;
        this.VAD_END = j2;
    }

    public void startSocket(String str) {
        try {
            this.mUri = new URI("wss://ai.watchfun.cn/ws/transcribe?language=" + str);
            initWebScoket(false, "");
        } catch (URISyntaxException e) {
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
        } finally {
            this.mWebSocketClient = null;
        }
    }

    public void send(byte[] bArr) {
        kii kiiVar = this.mWebSocketClient;
        if (kiiVar == null || !kiiVar.isOpen()) {
            return;
        }
        this.mWebSocketClient.send(bArr);
    }

    public void startSocket(String str, String str2) {
        try {
            this.mUri = new URI("wss://ai.watchfun.cn/ws/transcribe?language=" + str);
            initWebScoket(true, str2);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void startSocket(String str, String str2, boolean z, String str3) {
        try {
            this.mUri = new URI("wss://ai.watchfun.cn/ws/transcribe?language=" + str + "&mode=2&targetLanguage=" + str2);
            initWebScoket(z, str3);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void startSocket(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            this.mUri = new URI("wss://ai.watchfun.cn/ws/transcribe?mode=3&language=" + ((Object) sb));
            initWebScoket(false, "");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
