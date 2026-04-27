package com.watchfun.translatewebsocket.strategy;

import android.content.Context;
import com.watchfun.translatewebsocket.BaseNewWebSocketManager;
import com.watchfun.translatewebsocket.TransMachineFreedomWebSocketManager;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TransMachineFreedomStrategy implements WebSocketManagerStrategy {
    private final TransMachineFreedomWebSocketManager manager = TransMachineFreedomWebSocketManager.getInstance();

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public BaseNewWebSocketManager getInstance() {
        return this.manager;
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void getOpen() {
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public boolean isAsring() {
        return this.manager.isAsring();
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void release() {
        this.manager.release();
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void sendInitCommand(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.manager.sendInitCommand(str, str2, str3, str4, str5, str6, str7, i);
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void setAsrDataListener(BaseNewWebSocketManager.AsrDataListener asrDataListener) {
        this.manager.setAsrDataListener(asrDataListener);
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void startAsr(String str, String str2, long j) {
        this.manager.startAsr(str, str2, j);
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void startAsrSocket(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        this.manager.startSocket(context, str, str2, str3, str4, map);
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void stopAsr() {
        this.manager.stopAsr();
    }

    @Override // com.watchfun.translatewebsocket.strategy.WebSocketManagerStrategy
    public void unRegisterAsrDataListener() {
        this.manager.unRegisterAsrDataListener();
    }
}
