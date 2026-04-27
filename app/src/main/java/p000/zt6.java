package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class zt6 implements q6h {

    /* JADX INFO: renamed from: d */
    public final q6h f106062d;

    public zt6(q6h q6hVar) {
        this.f106062d = q6hVar;
    }

    @Override // p000.q6h
    public void durationUs(long j) {
        this.f106062d.durationUs(j);
    }

    @Override // p000.q6h
    public void format(C1213a c1213a) {
        this.f106062d.format(c1213a);
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z) throws IOException {
        return this.f106062d.sampleData(bh3Var, i, z);
    }

    @Override // p000.q6h
    public void sampleMetadata(long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
        this.f106062d.sampleMetadata(j, i, i2, i3, c11325a);
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i) {
        this.f106062d.sampleData(jhcVar, i);
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
        return this.f106062d.sampleData(bh3Var, i, z, i2);
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i, int i2) {
        this.f106062d.sampleData(jhcVar, i, i2);
    }
}
