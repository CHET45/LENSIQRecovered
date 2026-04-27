package p000;

import java.io.IOException;
import java.io.InputStream;
import p000.t98;

/* JADX INFO: loaded from: classes6.dex */
public class rq5 implements t98.InterfaceC12959b {

    /* JADX INFO: renamed from: a */
    public final InputStream f79022a;

    /* JADX INFO: renamed from: b */
    public final byte[] f79023b;

    /* JADX INFO: renamed from: c */
    public final z2b f79024c;

    /* JADX INFO: renamed from: d */
    public final int f79025d;

    /* JADX INFO: renamed from: e */
    public final cn4 f79026e;

    /* JADX INFO: renamed from: f */
    public final go1 f79027f = e0c.with().callbackDispatcher();

    public rq5(int i, @efb InputStream inputStream, @efb z2b z2bVar, cn4 cn4Var) {
        this.f79025d = i;
        this.f79022a = inputStream;
        this.f79023b = new byte[cn4Var.getReadBufferSize()];
        this.f79024c = z2bVar;
        this.f79026e = cn4Var;
    }

    @Override // p000.t98.InterfaceC12959b
    public long interceptFetch(yk4 yk4Var) throws IOException {
        if (yk4Var.getCache().isInterrupt()) {
            throw nc8.f63949a;
        }
        e0c.with().downloadStrategy().inspectNetworkOnWifi(yk4Var.getTask());
        int i = this.f79022a.read(this.f79023b);
        if (i == -1) {
            return i;
        }
        this.f79024c.write(this.f79025d, this.f79023b, i);
        long j = i;
        yk4Var.increaseCallbackBytes(j);
        if (this.f79027f.isFetchProcessMoment(this.f79026e)) {
            yk4Var.flushNoCallbackIncreaseBytes();
        }
        return j;
    }
}
