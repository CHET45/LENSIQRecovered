package p000;

/* JADX INFO: loaded from: classes7.dex */
public class gu1<T> extends fu1<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final gz6<vdd<? super T>, zy2<? super bth>, Object> f41127d;

    public /* synthetic */ gu1(gz6 gz6Var, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(gz6Var, (i2 & 2) != 0 ? a05.f2a : e13Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? gf1.f39657a : gf1Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ <T> Object m11990e(gu1<T> gu1Var, vdd<? super T> vddVar, zy2<? super bth> zy2Var) {
        Object objInvoke = gu1Var.f41127d.invoke(vddVar, zy2Var);
        return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
    }

    @Override // p000.fu1
    @gib
    /* JADX INFO: renamed from: c */
    public Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var) {
        return m11990e(this, vddVar, zy2Var);
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new gu1(this.f41127d, e13Var, i, gf1Var);
    }

    @Override // p000.fu1
    @yfb
    public String toString() {
        return "block[" + this.f41127d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gu1(@yfb gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(e13Var, i, gf1Var);
        this.f41127d = gz6Var;
    }
}
