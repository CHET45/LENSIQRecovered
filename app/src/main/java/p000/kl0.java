package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class kl0 extends n9c {

    /* JADX INFO: renamed from: a */
    public final int f54585a;

    /* JADX INFO: renamed from: b */
    public final m7b f54586b;

    public kl0(int i, m7b m7bVar) {
        this.f54585a = i;
        if (m7bVar == null) {
            throw new NullPointerException("Null mutation");
        }
        this.f54586b = m7bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n9c)) {
            return false;
        }
        n9c n9cVar = (n9c) obj;
        return this.f54585a == n9cVar.getLargestBatchId() && this.f54586b.equals(n9cVar.getMutation());
    }

    @Override // p000.n9c
    public int getLargestBatchId() {
        return this.f54585a;
    }

    @Override // p000.n9c
    public m7b getMutation() {
        return this.f54586b;
    }

    public int hashCode() {
        return ((this.f54585a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f54586b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f54585a + ", mutation=" + this.f54586b + "}";
    }
}
