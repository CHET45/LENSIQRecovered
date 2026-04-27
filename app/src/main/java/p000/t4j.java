package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class t4j extends ex5 {

    /* JADX INFO: renamed from: a */
    public String f83721a;

    /* JADX INFO: renamed from: b */
    public String f83722b;

    /* JADX INFO: renamed from: c */
    public boolean f83723c = false;

    /* JADX INFO: renamed from: d */
    public boolean f83724d = false;

    @Override // p000.ex5
    public final void forceRecaptchaFlowForTesting(boolean z) {
        this.f83724d = z;
    }

    @Override // p000.ex5
    public final void setAppVerificationDisabledForTesting(boolean z) {
        this.f83723c = z;
    }

    @Override // p000.ex5
    public final void setAutoRetrievedSmsCodeForPhoneNumber(@hib String str, @hib String str2) {
        this.f83721a = str;
        this.f83722b = str2;
    }

    @hib
    public final String zza() {
        return this.f83721a;
    }

    @hib
    public final String zzb() {
        return this.f83722b;
    }

    public final boolean zzc() {
        return this.f83724d;
    }

    public final boolean zzd() {
        return (this.f83721a == null || this.f83722b == null) ? false : true;
    }

    public final boolean zze() {
        return this.f83723c;
    }
}
