package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class bl0 extends d08 {

    /* JADX INFO: renamed from: a */
    public final int f14044a;

    /* JADX INFO: renamed from: b */
    public final ci4 f14045b;

    /* JADX INFO: renamed from: c */
    public final byte[] f14046c;

    /* JADX INFO: renamed from: d */
    public final byte[] f14047d;

    public bl0(int i, ci4 ci4Var, byte[] bArr, byte[] bArr2) {
        this.f14044a = i;
        if (ci4Var == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f14045b = ci4Var;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f14046c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f14047d = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d08)) {
            return false;
        }
        d08 d08Var = (d08) obj;
        if (this.f14044a == d08Var.getIndexId() && this.f14045b.equals(d08Var.getDocumentKey())) {
            boolean z = d08Var instanceof bl0;
            if (Arrays.equals(this.f14046c, z ? ((bl0) d08Var).f14046c : d08Var.getArrayValue())) {
                if (Arrays.equals(this.f14047d, z ? ((bl0) d08Var).f14047d : d08Var.getDirectionalValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.d08
    public byte[] getArrayValue() {
        return this.f14046c;
    }

    @Override // p000.d08
    public byte[] getDirectionalValue() {
        return this.f14047d;
    }

    @Override // p000.d08
    public ci4 getDocumentKey() {
        return this.f14045b;
    }

    @Override // p000.d08
    public int getIndexId() {
        return this.f14044a;
    }

    public int hashCode() {
        return ((((((this.f14044a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f14045b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f14046c)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f14047d);
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f14044a + ", documentKey=" + this.f14045b + ", arrayValue=" + Arrays.toString(this.f14046c) + ", directionalValue=" + Arrays.toString(this.f14047d) + "}";
    }
}
