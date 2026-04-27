package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class pu2 implements gxa {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<vli, bth> f72075a;

    /* JADX INFO: renamed from: b */
    @gib
    public vli f72076b;

    /* JADX WARN: Multi-variable type inference failed */
    public pu2(@yfb qy6<? super vli, bth> qy6Var) {
        this.f72075a = qy6Var;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && ((pu2) obj).f72075a == this.f72075a;
    }

    public int hashCode() {
        return this.f72075a.hashCode();
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        vli vliVar = (vli) qxaVar.getCurrent(soi.getModifierLocalConsumedWindowInsets());
        if (md8.areEqual(vliVar, this.f72076b)) {
            return;
        }
        this.f72076b = vliVar;
        this.f72075a.invoke(vliVar);
    }
}
