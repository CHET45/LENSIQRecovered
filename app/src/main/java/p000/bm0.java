package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.xpg;

/* JADX INFO: loaded from: classes5.dex */
public final class bm0 extends xpg.AbstractC15246b {

    /* JADX INFO: renamed from: a */
    public final int f14087a;

    /* JADX INFO: renamed from: b */
    public final int f14088b;

    /* JADX INFO: renamed from: c */
    public final String f14089c;

    /* JADX INFO: renamed from: d */
    public final String f14090d;

    /* JADX INFO: renamed from: e */
    public final xpg.AbstractC15245a f14091e;

    public bm0(int i, int i2, String str, String str2, @hib xpg.AbstractC15245a abstractC15245a) {
        this.f14087a = i;
        this.f14088b = i2;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.f14089c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.f14090d = str2;
        this.f14091e = abstractC15245a;
    }

    @Override // p000.xpg.AbstractC15246b
    @hib
    /* JADX INFO: renamed from: a */
    public xpg.AbstractC15245a mo3240a() {
        return this.f14091e;
    }

    @Override // p000.xpg.AbstractC15246b
    /* JADX INFO: renamed from: c */
    public String mo3241c() {
        return this.f14090d;
    }

    @Override // p000.xpg.AbstractC15246b
    /* JADX INFO: renamed from: d */
    public int mo3242d() {
        return this.f14088b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xpg.AbstractC15246b)) {
            return false;
        }
        xpg.AbstractC15246b abstractC15246b = (xpg.AbstractC15246b) obj;
        if (this.f14087a == abstractC15246b.mo3243f() && this.f14088b == abstractC15246b.mo3242d() && this.f14089c.equals(abstractC15246b.mo3244g()) && this.f14090d.equals(abstractC15246b.mo3241c())) {
            xpg.AbstractC15245a abstractC15245a = this.f14091e;
            if (abstractC15245a == null) {
                if (abstractC15246b.mo3240a() == null) {
                    return true;
                }
            } else if (abstractC15245a.equals(abstractC15246b.mo3240a())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xpg.AbstractC15246b
    /* JADX INFO: renamed from: f */
    public int mo3243f() {
        return this.f14087a;
    }

    @Override // p000.xpg.AbstractC15246b
    /* JADX INFO: renamed from: g */
    public String mo3244g() {
        return this.f14089c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f14087a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f14088b) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f14089c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f14090d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        xpg.AbstractC15245a abstractC15245a = this.f14091e;
        return iHashCode ^ (abstractC15245a == null ? 0 : abstractC15245a.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f14087a + ", existenceFilterCount=" + this.f14088b + ", projectId=" + this.f14089c + ", databaseId=" + this.f14090d + ", bloomFilter=" + this.f14091e + "}";
    }
}
