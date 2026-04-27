package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class us4 implements q6h {

    /* JADX INFO: renamed from: d */
    public final yd4 f89024d = new yd4();

    @Override // p000.q6h
    public void format(C1213a c1213a) {
        this.f89024d.format(c1213a);
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z) throws IOException {
        return this.f89024d.sampleData(bh3Var, i, z);
    }

    @Override // p000.q6h
    public void sampleMetadata(long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
        this.f89024d.sampleMetadata(j, i, i2, i3, c11325a);
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i) {
        this.f89024d.sampleData(jhcVar, i);
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
        return this.f89024d.sampleData(bh3Var, i, z, i2);
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i, int i2) {
        this.f89024d.sampleData(jhcVar, i, i2);
    }
}
