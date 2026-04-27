package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public final class zl0 extends z3g.AbstractC15981c {

    /* JADX INFO: renamed from: a */
    public final String f105367a;

    /* JADX INFO: renamed from: b */
    public final String f105368b;

    /* JADX INFO: renamed from: c */
    public final boolean f105369c;

    public zl0(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f105367a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f105368b = str2;
        this.f105369c = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z3g.AbstractC15981c)) {
            return false;
        }
        z3g.AbstractC15981c abstractC15981c = (z3g.AbstractC15981c) obj;
        return this.f105367a.equals(abstractC15981c.osRelease()) && this.f105368b.equals(abstractC15981c.osCodeName()) && this.f105369c == abstractC15981c.isRooted();
    }

    public int hashCode() {
        return ((((this.f105367a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f105368b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f105369c ? 1231 : 1237);
    }

    @Override // p000.z3g.AbstractC15981c
    public boolean isRooted() {
        return this.f105369c;
    }

    @Override // p000.z3g.AbstractC15981c
    public String osCodeName() {
        return this.f105368b;
    }

    @Override // p000.z3g.AbstractC15981c
    public String osRelease() {
        return this.f105367a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f105367a + ", osCodeName=" + this.f105368b + ", isRooted=" + this.f105369c + "}";
    }
}
