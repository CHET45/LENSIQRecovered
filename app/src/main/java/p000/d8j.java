package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class d8j implements q8j {

    /* JADX INFO: renamed from: a */
    public final Bitmap f28770a;

    /* JADX INFO: renamed from: b */
    public final qv7 f28771b;

    public d8j(Bitmap bitmap) {
        this.f28770a = bitmap;
        k6j k6jVar = new k6j();
        int i = a8j.f651a[bitmap.getConfig().ordinal()];
        k6jVar.mo14559a(i != 1 ? i != 2 ? 0 : 1 : 8);
        k6jVar.mo14560b(1);
        this.f28771b = k6jVar.mo14561c();
    }

    public final Bitmap zza() {
        return this.f28770a;
    }

    @Override // p000.q8j
    public final qv7 zzb() {
        return this.f28771b;
    }

    @Override // p000.q8j
    public final void zzc() {
        this.f28770a.recycle();
    }
}
