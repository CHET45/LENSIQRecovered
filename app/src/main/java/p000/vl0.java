package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class vl0 extends e2g {

    /* JADX INFO: renamed from: a */
    public final long f91552a;

    /* JADX INFO: renamed from: b */
    public final long f91553b;

    /* JADX INFO: renamed from: c */
    public final long f91554c;

    public vl0(long j, long j2, long j3) {
        this.f91552a = j;
        this.f91553b = j2;
        this.f91554c = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e2g)) {
            return false;
        }
        e2g e2gVar = (e2g) obj;
        return this.f91552a == e2gVar.getEpochMillis() && this.f91553b == e2gVar.getElapsedRealtime() && this.f91554c == e2gVar.getUptimeMillis();
    }

    @Override // p000.e2g
    public long getElapsedRealtime() {
        return this.f91553b;
    }

    @Override // p000.e2g
    public long getEpochMillis() {
        return this.f91552a;
    }

    @Override // p000.e2g
    public long getUptimeMillis() {
        return this.f91554c;
    }

    public int hashCode() {
        long j = this.f91552a;
        int i = (((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f91553b;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j3 = this.f91554c;
        return i2 ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f91552a + ", elapsedRealtime=" + this.f91553b + ", uptimeMillis=" + this.f91554c + "}";
    }
}
