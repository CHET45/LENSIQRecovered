package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class i9j extends a9j {

    /* JADX INFO: renamed from: a */
    @hib
    public final String f46150a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f46151b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f46152c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a9j) {
            a9j a9jVar = (a9j) obj;
            String str = this.f46150a;
            if (str != null ? str.equals(a9jVar.zzd()) : a9jVar.zzd() == null) {
                String str2 = this.f46151b;
                if (str2 != null ? str2.equals(a9jVar.zzb()) : a9jVar.zzb() == null) {
                    String str3 = this.f46152c;
                    if (str3 != null ? str3.equals(a9jVar.zzc()) : a9jVar.zzc() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f46150a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f46151b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f46152c;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f46150a + ", playIntegrityToken=" + this.f46151b + ", recaptchaEnterpriseToken=" + this.f46152c + "}";
    }

    @Override // p000.a9j
    @hib
    public final String zzb() {
        return this.f46151b;
    }

    @Override // p000.a9j
    @hib
    public final String zzc() {
        return this.f46152c;
    }

    @Override // p000.a9j
    @hib
    public final String zzd() {
        return this.f46150a;
    }

    private i9j(@hib String str, @hib String str2, @hib String str3) {
        this.f46150a = str;
        this.f46151b = str2;
        this.f46152c = str3;
    }
}
