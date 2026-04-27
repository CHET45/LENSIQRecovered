package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ca1 implements xj5 {

    /* JADX INFO: renamed from: e */
    public static final int f16055e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f16056f = 16973;

    /* JADX INFO: renamed from: d */
    public final bof f16057d = new bof(f16056f, 2, rva.f79812b1);

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f16057d.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f16057d.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f16057d.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return this.f16057d.sniff(ak5Var);
    }
}
