package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public final class zk0 extends ir5.AbstractC7573c {

    /* JADX INFO: renamed from: a */
    public final wr5 f105333a;

    /* JADX INFO: renamed from: b */
    public final ir5.AbstractC7573c.a f105334b;

    public zk0(wr5 wr5Var, ir5.AbstractC7573c.a aVar) {
        if (wr5Var == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f105333a = wr5Var;
        if (aVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.f105334b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ir5.AbstractC7573c)) {
            return false;
        }
        ir5.AbstractC7573c abstractC7573c = (ir5.AbstractC7573c) obj;
        return this.f105333a.equals(abstractC7573c.getFieldPath()) && this.f105334b.equals(abstractC7573c.getKind());
    }

    @Override // p000.ir5.AbstractC7573c
    public wr5 getFieldPath() {
        return this.f105333a;
    }

    @Override // p000.ir5.AbstractC7573c
    public ir5.AbstractC7573c.a getKind() {
        return this.f105334b;
    }

    public int hashCode() {
        return ((this.f105333a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f105334b.hashCode();
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f105333a + ", kind=" + this.f105334b + "}";
    }
}
