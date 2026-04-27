package com.watchfun.translatewebsocket.strategy;

import android.content.Context;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface WebSocketManagerStrategy {
    BaseNewWebSocketManager getInstance();

    void getOpen();

    boolean isAsring();

    void release();

    void sendInitCommand(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i);

    void setAsrDataListener(BaseNewWebSocketManager.AsrDataListener asrDataListener);

    void startAsr(String str, String str2, long j);

    void startAsrSocket(Context context, String str, String str2, String str3, String str4, Map<String, String> map);

    void stopAsr();

    void unRegisterAsrDataListener();
}
