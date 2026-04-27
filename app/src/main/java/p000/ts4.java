package p000;

import java.io.EOFException;
import java.io.IOException;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ts4 implements r6h {

    /* JADX INFO: renamed from: d */
    public final byte[] f85701d = new byte[4096];

    @Override // p000.r6h
    public void format(kq6 kq6Var) {
    }

    @Override // p000.r6h
    public int sampleData(ah3 ah3Var, int i, boolean z, int i2) throws IOException {
        int i3 = ah3Var.read(this.f85701d, 0, Math.min(this.f85701d.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.r6h
    public void sampleMetadata(long j, int i, int i2, int i3, @hib r6h.C11906a c11906a) {
    }

    @Override // p000.r6h
    public void sampleData(ihc ihcVar, int i, int i2) {
        ihcVar.skipBytes(i);
    }
}
