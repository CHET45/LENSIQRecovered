package p000;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public class i5h extends k2b {

    /* JADX INFO: renamed from: a */
    public final String f45811a;

    /* JADX INFO: renamed from: b */
    @hib
    public final k5h f45812b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f45813c;

    public i5h(@efb String str, @hib k5h k5hVar, @hib String str2) {
        this.f45811a = Preconditions.checkNotEmpty(str);
        this.f45812b = k5hVar;
        this.f45813c = str2;
    }

    @Override // p000.k2b
    @efb
    public String getFactorId() {
        return j5h.f49585a;
    }

    @hib
    public final k5h zza() {
        return this.f45812b;
    }

    @hib
    public final String zzb() {
        return this.f45813c;
    }

    @efb
    public final String zzc() {
        return this.f45811a;
    }
}
