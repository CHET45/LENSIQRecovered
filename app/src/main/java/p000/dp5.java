package p000;

import p000.p42;

/* JADX INFO: loaded from: classes7.dex */
public final class dp5 extends pfb {

    /* JADX INFO: renamed from: b */
    public boolean f30317b;

    /* JADX INFO: renamed from: c */
    public final n4g f30318c;

    /* JADX INFO: renamed from: d */
    public final p42.EnumC10788a f30319d;

    /* JADX INFO: renamed from: e */
    public final q42[] f30320e;

    public dp5(n4g n4gVar, q42[] q42VarArr) {
        this(n4gVar, p42.EnumC10788a.PROCESSED, q42VarArr);
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public n4g m9285a() {
        return this.f30318c;
    }

    @Override // p000.pfb, p000.o42
    public void appendTimeoutInsight(y48 y48Var) {
        y48Var.appendKeyValue("error", this.f30318c).appendKeyValue("progress", this.f30319d);
    }

    @Override // p000.pfb, p000.o42
    public void start(p42 p42Var) {
        v7d.checkState(!this.f30317b, "already started");
        this.f30317b = true;
        for (q42 q42Var : this.f30320e) {
            q42Var.streamClosed(this.f30318c);
        }
        p42Var.closed(this.f30318c, this.f30319d, new fta());
    }

    public dp5(n4g n4gVar, p42.EnumC10788a enumC10788a, q42[] q42VarArr) {
        v7d.checkArgument(!n4gVar.isOk(), "error must not be OK");
        this.f30318c = n4gVar;
        this.f30319d = enumC10788a;
        this.f30320e = q42VarArr;
    }
}
