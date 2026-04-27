package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class h9j extends u8j {

    /* JADX INFO: renamed from: a */
    public String f42964a;

    /* JADX INFO: renamed from: b */
    public String f42965b;

    /* JADX INFO: renamed from: c */
    public String f42966c;

    @Override // p000.u8j
    public final u8j zza(@hib String str) {
        this.f42965b = str;
        return this;
    }

    @Override // p000.u8j
    public final u8j zzb(@hib String str) {
        this.f42966c = str;
        return this;
    }

    @Override // p000.u8j
    public final u8j zzc(@hib String str) {
        this.f42964a = str;
        return this;
    }

    @Override // p000.u8j
    public final a9j zza() {
        return new i9j(this.f42964a, this.f42965b, this.f42966c);
    }
}
