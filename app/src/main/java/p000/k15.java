package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class k15 {

    /* JADX INFO: renamed from: a */
    public final q15 f52366a;

    /* JADX INFO: renamed from: b */
    public final byte[] f52367b;

    public k15(@efb q15 q15Var, @efb byte[] bArr) {
        if (q15Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f52366a = q15Var;
        this.f52367b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k15)) {
            return false;
        }
        k15 k15Var = (k15) obj;
        if (this.f52366a.equals(k15Var.f52366a)) {
            return Arrays.equals(this.f52367b, k15Var.f52367b);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.f52367b;
    }

    public q15 getEncoding() {
        return this.f52366a;
    }

    public int hashCode() {
        return ((this.f52366a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f52367b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f52366a + ", bytes=[...]}";
    }
}
