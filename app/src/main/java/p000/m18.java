package p000;

import java.io.IOException;
import p000.iz1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m18 extends fz1 {

    /* JADX INFO: renamed from: j */
    public final iz1 f59569j;

    /* JADX INFO: renamed from: k */
    public iz1.InterfaceC7669b f59570k;

    /* JADX INFO: renamed from: l */
    public long f59571l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f59572m;

    public m18(ih3 ih3Var, yh3 yh3Var, kq6 kq6Var, int i, @hib Object obj, iz1 iz1Var) {
        super(ih3Var, yh3Var, 2, kq6Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f59569j = iz1Var;
    }

    @Override // p000.vc9.InterfaceC13997e
    public void cancelLoad() {
        this.f59572m = true;
    }

    public void init(iz1.InterfaceC7669b interfaceC7669b) {
        this.f59570k = interfaceC7669b;
    }

    @Override // p000.vc9.InterfaceC13997e
    public void load() throws IOException {
        if (this.f59571l == 0) {
            this.f59569j.init(this.f59570k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            yh3 yh3VarSubrange = this.f38044b.subrange(this.f59571l);
            i4g i4gVar = this.f38051i;
            wu3 wu3Var = new wu3(i4gVar, yh3VarSubrange.f101491g, i4gVar.open(yh3VarSubrange));
            while (!this.f59572m && this.f59569j.read(wu3Var)) {
                try {
                } finally {
                    this.f59571l = wu3Var.getPosition() - this.f38044b.f101491g;
                }
            }
        } finally {
            vh3.closeQuietly(this.f38051i);
        }
    }
}
