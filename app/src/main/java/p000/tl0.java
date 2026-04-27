package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class tl0 extends ise {

    /* JADX INFO: renamed from: a */
    public final String f85164a;

    /* JADX INFO: renamed from: b */
    public final long f85165b;

    public tl0(String str, long j) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.f85164a = str;
        this.f85165b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ise)) {
            return false;
        }
        ise iseVar = (ise) obj;
        return this.f85164a.equals(iseVar.getSdkName()) && this.f85165b == iseVar.getMillis();
    }

    @Override // p000.ise
    public long getMillis() {
        return this.f85165b;
    }

    @Override // p000.ise
    public String getSdkName() {
        return this.f85164a;
    }

    public int hashCode() {
        int iHashCode = (this.f85164a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f85165b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f85164a + ", millis=" + this.f85165b + "}";
    }
}
