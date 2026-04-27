package p000;

import java.io.IOException;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public class qeg implements xj5 {

    /* JADX INFO: renamed from: d */
    public final xj5 f74261d;

    /* JADX INFO: renamed from: e */
    public final peg.InterfaceC10936a f74262e;

    /* JADX INFO: renamed from: f */
    public reg f74263f;

    public qeg(xj5 xj5Var, peg.InterfaceC10936a interfaceC10936a) {
        this.f74261d = xj5Var;
        this.f74262e = interfaceC10936a;
    }

    @Override // p000.xj5
    public xj5 getUnderlyingImplementation() {
        return this.f74261d;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        reg regVar = new reg(bk5Var, this.f74262e);
        this.f74263f = regVar;
        this.f74261d.init(regVar);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f74261d.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
        this.f74261d.release();
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        reg regVar = this.f74263f;
        if (regVar != null) {
            regVar.resetSubtitleParsers();
        }
        this.f74261d.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return this.f74261d.sniff(ak5Var);
    }
}
