package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class bn0 implements xj5 {

    /* JADX INFO: renamed from: f */
    public static final int f14163f = 1718909296;

    /* JADX INFO: renamed from: g */
    public static final int f14164g = 1635150182;

    /* JADX INFO: renamed from: h */
    public static final int f14165h = 4;

    /* JADX INFO: renamed from: d */
    public final jhc f14166d = new jhc(4);

    /* JADX INFO: renamed from: e */
    public final bof f14167e = new bof(-1, -1, rva.f79809a1);

    private boolean readAndCompareFourBytes(ak5 ak5Var, int i) throws IOException {
        this.f14166d.reset(4);
        ak5Var.peekFully(this.f14166d.getData(), 0, 4);
        return this.f14166d.readUnsignedInt() == ((long) i);
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f14167e.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f14167e.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f14167e.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        ak5Var.advancePeekPosition(4);
        return readAndCompareFourBytes(ak5Var, 1718909296) && readAndCompareFourBytes(ak5Var, 1635150182);
    }
}
