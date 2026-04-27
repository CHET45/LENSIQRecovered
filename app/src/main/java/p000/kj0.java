package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.c15;

/* JADX INFO: loaded from: classes4.dex */
public final class kj0 extends ax0 {

    /* JADX INFO: renamed from: a */
    public final List<ni9> f54243a;

    public kj0(List<ni9> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f54243a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ax0) {
            return this.f54243a.equals(((ax0) obj).getLogRequests());
        }
        return false;
    }

    @Override // p000.ax0
    @efb
    @c15.InterfaceC2147a(name = "logRequest")
    public List<ni9> getLogRequests() {
        return this.f54243a;
    }

    public int hashCode() {
        return this.f54243a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f54243a + "}";
    }
}
