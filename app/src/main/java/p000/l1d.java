package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class l1d implements xj5 {

    /* JADX INFO: renamed from: e */
    public static final int f55939e = 35152;

    /* JADX INFO: renamed from: f */
    public static final int f55940f = 2;

    /* JADX INFO: renamed from: d */
    public final bof f55941d = new bof(f55939e, 2, "image/png");

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f55941d.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f55941d.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f55941d.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return this.f55941d.sniff(ak5Var);
    }
}
