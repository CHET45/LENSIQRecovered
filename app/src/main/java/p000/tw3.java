package p000;

import java.io.IOException;
import p000.ab0;
import p000.eda;
import p000.nig;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tw3 implements eda.InterfaceC5266b {

    /* JADX INFO: renamed from: d */
    public static final int f86161d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f86162e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f86163f = 2;

    /* JADX INFO: renamed from: g */
    public static final String f86164g = "DMCodecAdapterFactory";

    /* JADX INFO: renamed from: b */
    public int f86165b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f86166c;

    @Override // p000.eda.InterfaceC5266b
    public eda createAdapter(eda.C5265a c5265a) throws IOException {
        int i;
        int i2 = x0i.f95978a;
        if (i2 < 23 || ((i = this.f86165b) != 1 && (i != 0 || i2 < 31))) {
            return new nig.C9896b().createAdapter(c5265a);
        }
        int trackType = sva.getTrackType(c5265a.f32702c.f54989M);
        yh9.m25917i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + x0i.getTrackTypeString(trackType));
        return new ab0.C0138b(trackType, this.f86166c).createAdapter(c5265a);
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.f86166c = z;
    }

    @op1
    public tw3 forceDisableAsynchronous() {
        this.f86165b = 2;
        return this;
    }

    @op1
    public tw3 forceEnableAsynchronous() {
        this.f86165b = 1;
        return this;
    }
}
