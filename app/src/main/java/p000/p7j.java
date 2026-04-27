package p000;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p024firebaseauthapi.zzahv;

/* JADX INFO: loaded from: classes5.dex */
public final class p7j {

    /* JADX INFO: renamed from: a */
    public volatile int f69946a;

    /* JADX INFO: renamed from: b */
    public final q5j f69947b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f69948c;

    public p7j(lw5 lw5Var) {
        this(lw5Var.getApplicationContext(), new q5j(lw5Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.f69946a > 0 && !this.f69948c;
    }

    public final void zza() {
        this.f69947b.zzb();
    }

    @fdi
    private p7j(Context context, q5j q5jVar) {
        this.f69948c = false;
        this.f69946a = 0;
        this.f69947b = q5jVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new s7j(this));
    }

    public final void zza(int i) {
        if (i > 0 && this.f69946a == 0) {
            this.f69946a = i;
            if (zzb()) {
                this.f69947b.zzc();
            }
        } else if (i == 0 && this.f69946a != 0) {
            this.f69947b.zzb();
        }
        this.f69946a = i;
    }

    public final void zza(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long jZza = zzahvVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzahvVar.zzb() + (jZza * 1000);
        q5j q5jVar = this.f69947b;
        q5jVar.f73298b = jZzb;
        q5jVar.f73299c = -1L;
        if (zzb()) {
            this.f69947b.zzc();
        }
    }
}
