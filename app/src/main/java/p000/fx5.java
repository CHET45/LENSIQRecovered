package p000;

import com.google.firebase.auth.AuthCredential;

/* JADX INFO: loaded from: classes5.dex */
public final class fx5 extends xw5 {

    /* JADX INFO: renamed from: b */
    @hib
    public AuthCredential f37938b;

    /* JADX INFO: renamed from: c */
    @hib
    public String f37939c;

    public fx5(@efb String str, @efb String str2) {
        super(str, str2);
    }

    @hib
    public final String getEmail() {
        return this.f37939c;
    }

    @hib
    public final AuthCredential getUpdatedCredential() {
        return this.f37938b;
    }

    @efb
    public final fx5 zza(@efb AuthCredential authCredential) {
        this.f37938b = authCredential;
        return this;
    }

    @efb
    public final fx5 zza(@efb String str) {
        this.f37939c = str;
        return this;
    }
}
