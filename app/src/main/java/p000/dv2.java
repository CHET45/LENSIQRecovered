package p000;

import java.io.IOException;
import p000.iz1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class dv2 extends xr0 {

    /* JADX INFO: renamed from: o */
    public final int f30928o;

    /* JADX INFO: renamed from: p */
    public final long f30929p;

    /* JADX INFO: renamed from: q */
    public final iz1 f30930q;

    /* JADX INFO: renamed from: r */
    public long f30931r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f30932s;

    /* JADX INFO: renamed from: t */
    public boolean f30933t;

    public dv2(ih3 ih3Var, yh3 yh3Var, kq6 kq6Var, int i, @hib Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, iz1 iz1Var) {
        super(ih3Var, yh3Var, kq6Var, i, obj, j, j2, j3, j4, j5);
        this.f30928o = i2;
        this.f30929p = j6;
        this.f30930q = iz1Var;
    }

    /* JADX INFO: renamed from: b */
    public iz1.InterfaceC7669b m9383b(bs0 bs0Var) {
        return bs0Var;
    }

    @Override // p000.vc9.InterfaceC13997e
    public final void cancelLoad() {
        this.f30932s = true;
    }

    @Override // p000.xca
    public long getNextChunkIndex() {
        return this.f97520j + ((long) this.f30928o);
    }

    @Override // p000.xca
    public boolean isLoadCompleted() {
        return this.f30933t;
    }

    @Override // p000.vc9.InterfaceC13997e
    public final void load() throws IOException {
        if (this.f30931r == 0) {
            bs0 bs0VarM25420a = m25420a();
            bs0VarM25420a.setSampleOffsetUs(this.f30929p);
            iz1 iz1Var = this.f30930q;
            iz1.InterfaceC7669b interfaceC7669bM9383b = m9383b(bs0VarM25420a);
            long j = this.f99009k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.f30929p;
            long j3 = this.f99010l;
            iz1Var.init(interfaceC7669bM9383b, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f30929p);
        }
        try {
            yh3 yh3VarSubrange = this.f38044b.subrange(this.f30931r);
            i4g i4gVar = this.f38051i;
            wu3 wu3Var = new wu3(i4gVar, yh3VarSubrange.f101491g, i4gVar.open(yh3VarSubrange));
            do {
                try {
                    if (this.f30932s) {
                        break;
                    }
                } finally {
                    this.f30931r = wu3Var.getPosition() - this.f38044b.f101491g;
                }
            } while (this.f30930q.read(wu3Var));
            vh3.closeQuietly(this.f38051i);
            this.f30933t = !this.f30932s;
        } catch (Throwable th) {
            vh3.closeQuietly(this.f38051i);
            throw th;
        }
    }
}
