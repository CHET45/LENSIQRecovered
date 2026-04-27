package p000;

import com.google.android.gms.internal.p024firebaseauthapi.zzaif;

/* JADX INFO: loaded from: classes5.dex */
public final class v9j implements InterfaceC11342q8 {

    /* JADX INFO: renamed from: j */
    public final int f90417j;

    /* JADX INFO: renamed from: k */
    public final String f90418k;

    /* JADX INFO: renamed from: l */
    public final String f90419l;

    /* JADX INFO: renamed from: m */
    public final C10216o8 f90420m;

    public v9j(zzaif zzaifVar) {
        int i = 5;
        this.f90418k = zzaifVar.zzg() ? zzaifVar.zzc() : zzaifVar.zzb();
        this.f90419l = zzaifVar.zzb();
        C10216o8 r9jVar = null;
        if (!zzaifVar.zzh()) {
            this.f90417j = 3;
            this.f90420m = null;
            return;
        }
        String strZzd = zzaifVar.zzd();
        strZzd.hashCode();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i = 6;
                break;
            case "PASSWORD_RESET":
                i = 0;
                break;
            case "VERIFY_EMAIL":
                i = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i = 4;
                break;
            case "RECOVER_EMAIL":
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        this.f90417j = i;
        if (i == 4 || i == 3) {
            this.f90420m = null;
            return;
        }
        if (zzaifVar.zzf()) {
            r9jVar = new w9j(zzaifVar.zzb(), u6j.zza(zzaifVar.zza()));
        } else if (zzaifVar.zzg()) {
            r9jVar = new t9j(zzaifVar.zzc(), zzaifVar.zzb());
        } else if (zzaifVar.zze()) {
            r9jVar = new r9j(zzaifVar.zzb());
        }
        this.f90420m = r9jVar;
    }

    @Override // p000.InterfaceC11342q8
    @hib
    public final String getData(int i) {
        if (this.f90417j == 4) {
            return null;
        }
        if (i == 0) {
            return this.f90418k;
        }
        if (i != 1) {
            return null;
        }
        return this.f90419l;
    }

    @Override // p000.InterfaceC11342q8
    @hib
    public final C10216o8 getInfo() {
        return this.f90420m;
    }

    @Override // p000.InterfaceC11342q8
    public final int getOperation() {
        return this.f90417j;
    }
}
