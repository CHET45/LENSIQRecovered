package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class pl0 extends oae {

    /* JADX INFO: renamed from: c */
    public final String f71303c;

    /* JADX INFO: renamed from: d */
    public final String f71304d;

    /* JADX INFO: renamed from: e */
    public final String f71305e;

    /* JADX INFO: renamed from: f */
    public final String f71306f;

    /* JADX INFO: renamed from: g */
    public final long f71307g;

    public pl0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f71303c = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f71304d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f71305e = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f71306f = str4;
        this.f71307g = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oae)) {
            return false;
        }
        oae oaeVar = (oae) obj;
        return this.f71303c.equals(oaeVar.getRolloutId()) && this.f71304d.equals(oaeVar.getParameterKey()) && this.f71305e.equals(oaeVar.getParameterValue()) && this.f71306f.equals(oaeVar.getVariantId()) && this.f71307g == oaeVar.getTemplateVersion();
    }

    @Override // p000.oae
    public String getParameterKey() {
        return this.f71304d;
    }

    @Override // p000.oae
    public String getParameterValue() {
        return this.f71305e;
    }

    @Override // p000.oae
    public String getRolloutId() {
        return this.f71303c;
    }

    @Override // p000.oae
    public long getTemplateVersion() {
        return this.f71307g;
    }

    @Override // p000.oae
    public String getVariantId() {
        return this.f71306f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f71303c.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71304d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71305e.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f71306f.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f71307g;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f71303c + ", parameterKey=" + this.f71304d + ", parameterValue=" + this.f71305e + ", variantId=" + this.f71306f + ", templateVersion=" + this.f71307g + "}";
    }
}
