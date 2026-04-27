package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public final class xk0 extends ir5.AbstractC7571a {

    /* JADX INFO: renamed from: c */
    public final euf f98247c;

    /* JADX INFO: renamed from: d */
    public final ci4 f98248d;

    /* JADX INFO: renamed from: e */
    public final int f98249e;

    public xk0(euf eufVar, ci4 ci4Var, int i) {
        if (eufVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f98247c = eufVar;
        if (ci4Var == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f98248d = ci4Var;
        this.f98249e = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ir5.AbstractC7571a)) {
            return false;
        }
        ir5.AbstractC7571a abstractC7571a = (ir5.AbstractC7571a) obj;
        return this.f98247c.equals(abstractC7571a.getReadTime()) && this.f98248d.equals(abstractC7571a.getDocumentKey()) && this.f98249e == abstractC7571a.getLargestBatchId();
    }

    @Override // p000.ir5.AbstractC7571a
    public ci4 getDocumentKey() {
        return this.f98248d;
    }

    @Override // p000.ir5.AbstractC7571a
    public int getLargestBatchId() {
        return this.f98249e;
    }

    @Override // p000.ir5.AbstractC7571a
    public euf getReadTime() {
        return this.f98247c;
    }

    public int hashCode() {
        return ((((this.f98247c.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98248d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98249e;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f98247c + ", documentKey=" + this.f98248d + ", largestBatchId=" + this.f98249e + "}";
    }
}
