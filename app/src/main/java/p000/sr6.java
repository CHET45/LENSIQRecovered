package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class sr6 implements xj5 {

    /* JADX INFO: renamed from: d */
    public final xj5 f82685d;

    public sr6(xj5 xj5Var) {
        this.f82685d = xj5Var;
    }

    @Override // p000.xj5
    public List<huf> getSniffFailureDetails() {
        return this.f82685d.getSniffFailureDetails();
    }

    @Override // p000.xj5
    public xj5 getUnderlyingImplementation() {
        return this.f82685d.getUnderlyingImplementation();
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f82685d.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f82685d.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
        this.f82685d.release();
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f82685d.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return this.f82685d.sniff(ak5Var);
    }
}
