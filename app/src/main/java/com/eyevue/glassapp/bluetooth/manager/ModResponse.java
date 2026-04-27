package com.eyevue.glassapp.bluetooth.manager;

import com.eyevue.glassapp.bluetooth.protocol.Datagram;
import com.eyevue.glassapp.bluetooth.protocol.FileDatagram;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ModResponse {
    public abstract void onRequestSyncDataResponse(Datagram datagram, byte[] data);

    public abstract void onRequestSyncFileResponse(FileDatagram fileDatagram, byte[] data);
}
