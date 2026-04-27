package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nji implements xj5 {

    /* JADX INFO: renamed from: f */
    public static final int f64781f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f64782g = 1380533830;

    /* JADX INFO: renamed from: h */
    public static final int f64783h = 1464156752;

    /* JADX INFO: renamed from: d */
    public final jhc f64784d = new jhc(4);

    /* JADX INFO: renamed from: e */
    public final bof f64785e = new bof(-1, -1, "image/webp");

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f64785e.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f64785e.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f64785e.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        this.f64784d.reset(4);
        ak5Var.peekFully(this.f64784d.getData(), 0, 4);
        if (this.f64784d.readUnsignedInt() != 1380533830) {
            return false;
        }
        ak5Var.advancePeekPosition(4);
        this.f64784d.reset(4);
        ak5Var.peekFully(this.f64784d.getData(), 0, 4);
        return this.f64784d.readUnsignedInt() == 1464156752;
    }
}
