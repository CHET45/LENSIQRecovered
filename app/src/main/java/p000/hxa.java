package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class hxa extends g58 implements gxa {

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<qxa, bth> f45189d;

    /* JADX WARN: Multi-variable type inference failed */
    public hxa(@yfb qy6<? super qxa, bth> qy6Var, @yfb qy6<? super f58, bth> qy6Var2) {
        super(qy6Var2);
        this.f45189d = qy6Var;
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof hxa) && ((hxa) obj).f45189d == this.f45189d;
    }

    @yfb
    public final qy6<qxa, bth> getConsumer() {
        return this.f45189d;
    }

    public int hashCode() {
        return this.f45189d.hashCode();
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        this.f45189d.invoke(qxaVar);
    }
}
