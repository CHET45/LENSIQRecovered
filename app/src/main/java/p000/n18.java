package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.hz1;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class n18 extends gz1 {

    /* JADX INFO: renamed from: j */
    public final hz1 f62951j;

    /* JADX INFO: renamed from: k */
    public hz1.InterfaceC7086b f62952k;

    /* JADX INFO: renamed from: l */
    @hib
    public mz1 f62953l;

    /* JADX INFO: renamed from: m */
    public long f62954m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f62955n;

    public n18(gh3 gh3Var, xh3 xh3Var, C1213a c1213a, int i, @hib Object obj, hz1 hz1Var) {
        super(gh3Var, xh3Var, 2, c1213a, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f62951j = hz1Var;
    }

    @Override // p000.uc9.InterfaceC13493e
    public void cancelLoad() {
        this.f62955n = true;
    }

    @hib
    public mz1 getChunkIndex() {
        return this.f62953l;
    }

    public void init(hz1.InterfaceC7086b interfaceC7086b) {
        this.f62952k = interfaceC7086b;
    }

    @Override // p000.uc9.InterfaceC13493e
    public void load() throws IOException {
        if (this.f62954m == 0) {
            this.f62951j.init(this.f62952k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            xh3 xh3VarSubrange = this.f41843b.subrange(this.f62954m);
            j4g j4gVar = this.f41850i;
            xu3 xu3Var = new xu3(j4gVar, xh3VarSubrange.f97806g, j4gVar.open(xh3VarSubrange));
            while (!this.f62955n && this.f62951j.read(xu3Var)) {
                try {
                } finally {
                    this.f62954m = xu3Var.getPosition() - this.f41843b.f97806g;
                    this.f62953l = this.f62951j.getChunkIndex();
                }
            }
        } finally {
            wh3.closeQuietly(this.f41850i);
        }
    }
}
