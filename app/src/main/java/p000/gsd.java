package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gsd<E> implements wgi {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final fq1<xu1<? extends E>> f40949a;

    /* JADX WARN: Multi-variable type inference failed */
    public gsd(@yfb fq1<? super xu1<? extends E>> fq1Var) {
        this.f40949a = fq1Var;
    }

    @Override // p000.wgi
    public void invokeOnCancellation(@yfb sue<?> sueVar, int i) {
        this.f40949a.invokeOnCancellation(sueVar, i);
    }
}
