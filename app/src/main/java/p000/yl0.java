package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public final class yl0 extends z3g.AbstractC15980b {

    /* JADX INFO: renamed from: a */
    public final int f101945a;

    /* JADX INFO: renamed from: b */
    public final String f101946b;

    /* JADX INFO: renamed from: c */
    public final int f101947c;

    /* JADX INFO: renamed from: d */
    public final long f101948d;

    /* JADX INFO: renamed from: e */
    public final long f101949e;

    /* JADX INFO: renamed from: f */
    public final boolean f101950f;

    /* JADX INFO: renamed from: g */
    public final int f101951g;

    /* JADX INFO: renamed from: h */
    public final String f101952h;

    /* JADX INFO: renamed from: i */
    public final String f101953i;

    public yl0(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f101945a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f101946b = str;
        this.f101947c = i2;
        this.f101948d = j;
        this.f101949e = j2;
        this.f101950f = z;
        this.f101951g = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f101952h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f101953i = str3;
    }

    @Override // p000.z3g.AbstractC15980b
    public int arch() {
        return this.f101945a;
    }

    @Override // p000.z3g.AbstractC15980b
    public int availableProcessors() {
        return this.f101947c;
    }

    @Override // p000.z3g.AbstractC15980b
    public long diskSpace() {
        return this.f101949e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z3g.AbstractC15980b)) {
            return false;
        }
        z3g.AbstractC15980b abstractC15980b = (z3g.AbstractC15980b) obj;
        return this.f101945a == abstractC15980b.arch() && this.f101946b.equals(abstractC15980b.model()) && this.f101947c == abstractC15980b.availableProcessors() && this.f101948d == abstractC15980b.totalRam() && this.f101949e == abstractC15980b.diskSpace() && this.f101950f == abstractC15980b.isEmulator() && this.f101951g == abstractC15980b.state() && this.f101952h.equals(abstractC15980b.manufacturer()) && this.f101953i.equals(abstractC15980b.modelClass());
    }

    public int hashCode() {
        int iHashCode = (((((this.f101945a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101946b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101947c) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f101948d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f101949e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f101950f ? 1231 : 1237)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101951g) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101952h.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101953i.hashCode();
    }

    @Override // p000.z3g.AbstractC15980b
    public boolean isEmulator() {
        return this.f101950f;
    }

    @Override // p000.z3g.AbstractC15980b
    public String manufacturer() {
        return this.f101952h;
    }

    @Override // p000.z3g.AbstractC15980b
    public String model() {
        return this.f101946b;
    }

    @Override // p000.z3g.AbstractC15980b
    public String modelClass() {
        return this.f101953i;
    }

    @Override // p000.z3g.AbstractC15980b
    public int state() {
        return this.f101951g;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f101945a + ", model=" + this.f101946b + ", availableProcessors=" + this.f101947c + ", totalRam=" + this.f101948d + ", diskSpace=" + this.f101949e + ", isEmulator=" + this.f101950f + ", state=" + this.f101951g + ", manufacturer=" + this.f101952h + ", modelClass=" + this.f101953i + "}";
    }

    @Override // p000.z3g.AbstractC15980b
    public long totalRam() {
        return this.f101948d;
    }
}
