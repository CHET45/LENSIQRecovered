package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class bwi extends cwi {

    /* JADX INFO: renamed from: a */
    public final int f15118a;

    /* JADX INFO: renamed from: b */
    public final long f15119b;

    public bwi(int i, long j) {
        this.f15118a = i;
        this.f15119b = j;
    }

    @Override // p000.cwi
    /* JADX INFO: renamed from: a */
    public final int mo3468a() {
        return this.f15118a;
    }

    @Override // p000.cwi
    /* JADX INFO: renamed from: b */
    public final long mo3469b() {
        return this.f15119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwi) {
            cwi cwiVar = (cwi) obj;
            if (this.f15118a == cwiVar.mo3468a() && this.f15119b == cwiVar.mo3469b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15119b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f15118a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f15118a + ", eventTimestamp=" + this.f15119b + "}";
    }
}
