package p000;

import androidx.media3.common.C1213a;
import java.io.EOFException;
import java.io.IOException;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yd4 implements q6h {

    /* JADX INFO: renamed from: d */
    public final byte[] f101224d = new byte[4096];

    @Override // p000.q6h
    public void format(C1213a c1213a) {
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
        int i3 = bh3Var.read(this.f101224d, 0, Math.min(this.f101224d.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.q6h
    public void sampleMetadata(long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i, int i2) {
        jhcVar.skipBytes(i);
    }
}
