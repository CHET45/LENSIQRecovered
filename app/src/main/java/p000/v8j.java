package p000;

import android.media.Image;

/* JADX INFO: loaded from: classes5.dex */
@c5e(19)
public final class v8j implements q8j {

    /* JADX INFO: renamed from: a */
    public final Image f90349a;

    /* JADX INFO: renamed from: b */
    public final qv7 f90350b;

    public v8j(Image image) {
        this.f90349a = image;
        k6j k6jVar = new k6j();
        k6jVar.mo14560b(3);
        int format = image.getFormat();
        k6jVar.mo14559a(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.f90350b = k6jVar.mo14561c();
    }

    public final Image zza() {
        return this.f90349a;
    }

    @Override // p000.q8j
    public final qv7 zzb() {
        return this.f90350b;
    }

    @Override // p000.q8j
    public final void zzc() {
        this.f90349a.close();
    }
}
