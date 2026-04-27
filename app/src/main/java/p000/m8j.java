package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class m8j implements q8j {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f60198a;

    /* JADX INFO: renamed from: b */
    public final qv7 f60199b;

    public m8j(ByteBuffer byteBuffer, int i) {
        this.f60198a = byteBuffer;
        k6j k6jVar = new k6j();
        k6jVar.mo14560b(2);
        k6jVar.mo14559a(i);
        this.f60199b = k6jVar.mo14561c();
    }

    public final ByteBuffer zza() {
        return this.f60198a;
    }

    @Override // p000.q8j
    public final qv7 zzb() {
        return this.f60199b;
    }

    @Override // p000.q8j
    public final void zzc() {
    }
}
