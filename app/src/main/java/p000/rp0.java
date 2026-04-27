package p000;

import android.os.Handler;
import p000.up0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface rp0 {

    /* JADX INFO: renamed from: a */
    public static final long f78951a = Long.MIN_VALUE;

    void addEventListener(Handler handler, up0.InterfaceC13636a interfaceC13636a);

    long getBandwidthEstimate();

    void onBytesTransferred(gh3 gh3Var, int i);

    void onNetworkTypeChange(long j);

    void onTransferEnd(gh3 gh3Var);

    void onTransferInitializing(gh3 gh3Var);

    void onTransferStart(gh3 gh3Var);

    void removeEventListener(up0.InterfaceC13636a interfaceC13636a);
}
