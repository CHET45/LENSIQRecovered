package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jqf implements iqf {

    /* JADX INFO: renamed from: a */
    public final boolean f51524a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<r78, r78, fw5<r78>> f51525b;

    /* JADX WARN: Multi-variable type inference failed */
    public jqf(boolean z, @yfb gz6<? super r78, ? super r78, ? extends fw5<r78>> gz6Var) {
        this.f51524a = z;
        this.f51525b = gz6Var;
    }

    @Override // p000.iqf
    @yfb
    /* JADX INFO: renamed from: createAnimationSpec-TemP2vQ */
    public fw5<r78> mo30316createAnimationSpecTemP2vQ(long j, long j2) {
        return this.f51525b.invoke(r78.m32079boximpl(j), r78.m32079boximpl(j2));
    }

    @Override // p000.iqf
    public boolean getClip() {
        return this.f51524a;
    }

    @yfb
    public final gz6<r78, r78, fw5<r78>> getSizeAnimationSpec() {
        return this.f51525b;
    }

    public /* synthetic */ jqf(boolean z, gz6 gz6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? true : z, gz6Var);
    }
}
