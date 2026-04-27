package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jj7 implements xj5 {

    /* JADX INFO: renamed from: f */
    public static final int f50710f = 1718909296;

    /* JADX INFO: renamed from: g */
    public static final int f50711g = 1751476579;

    /* JADX INFO: renamed from: h */
    public static final int f50712h = 4;

    /* JADX INFO: renamed from: d */
    public final jhc f50713d = new jhc(4);

    /* JADX INFO: renamed from: e */
    public final bof f50714e = new bof(-1, -1, "image/heif");

    private boolean readAndCompareFourBytes(ak5 ak5Var, int i) throws IOException {
        this.f50713d.reset(4);
        ak5Var.peekFully(this.f50713d.getData(), 0, 4);
        return this.f50713d.readUnsignedInt() == ((long) i);
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f50714e.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f50714e.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f50714e.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        ak5Var.advancePeekPosition(4);
        return readAndCompareFourBytes(ak5Var, 1718909296) && readAndCompareFourBytes(ak5Var, 1751476579);
    }
}
