package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public final class yk0 extends ir5.AbstractC7572b {

    /* JADX INFO: renamed from: a */
    public final long f101868a;

    /* JADX INFO: renamed from: b */
    public final ir5.AbstractC7571a f101869b;

    public yk0(long j, ir5.AbstractC7571a abstractC7571a) {
        this.f101868a = j;
        if (abstractC7571a == null) {
            throw new NullPointerException("Null offset");
        }
        this.f101869b = abstractC7571a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ir5.AbstractC7572b)) {
            return false;
        }
        ir5.AbstractC7572b abstractC7572b = (ir5.AbstractC7572b) obj;
        return this.f101868a == abstractC7572b.getSequenceNumber() && this.f101869b.equals(abstractC7572b.getOffset());
    }

    @Override // p000.ir5.AbstractC7572b
    public ir5.AbstractC7571a getOffset() {
        return this.f101869b;
    }

    @Override // p000.ir5.AbstractC7572b
    public long getSequenceNumber() {
        return this.f101868a;
    }

    public int hashCode() {
        long j = this.f101868a;
        return ((((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101869b.hashCode();
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f101868a + ", offset=" + this.f101869b + "}";
    }
}
