package p000;

import android.os.Handler;
import p000.vp0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface qp0 {

    /* JADX INFO: renamed from: a */
    public static final long f75058a = Long.MIN_VALUE;

    void addEventListener(Handler handler, vp0.InterfaceC14197a interfaceC14197a);

    long getBandwidthEstimate();

    void onBytesTransferred(ih3 ih3Var, int i);

    void onNetworkTypeChange(long j);

    void onTransferEnd(ih3 ih3Var);

    void onTransferInitializing(ih3 ih3Var);

    void onTransferStart(ih3 ih3Var);

    void removeEventListener(vp0.InterfaceC14197a interfaceC14197a);
}
