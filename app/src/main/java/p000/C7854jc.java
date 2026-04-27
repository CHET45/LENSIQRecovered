package p000;

/* JADX INFO: renamed from: jc */
/* JADX INFO: loaded from: classes.dex */
public final class C7854jc {
    @yfb
    public static final <I, O> AbstractC11416qc<bth> registerForActivityResult(@yfb InterfaceC6211gc interfaceC6211gc, @yfb AbstractC8767lc<I, O> abstractC8767lc, I i, @yfb AbstractC12973tc abstractC12973tc, @yfb final qy6<? super O, bth> qy6Var) {
        return new C8282kc(interfaceC6211gc.registerForActivityResult(abstractC8767lc, abstractC12973tc, new InterfaceC5717fc() { // from class: hc
            @Override // p000.InterfaceC5717fc
            public final void onActivityResult(Object obj) {
                qy6Var.invoke(obj);
            }
        }), abstractC8767lc, i);
    }

    @yfb
    public static final <I, O> AbstractC11416qc<bth> registerForActivityResult(@yfb InterfaceC6211gc interfaceC6211gc, @yfb AbstractC8767lc<I, O> abstractC8767lc, I i, @yfb final qy6<? super O, bth> qy6Var) {
        return new C8282kc(interfaceC6211gc.registerForActivityResult(abstractC8767lc, new InterfaceC5717fc() { // from class: ic
            @Override // p000.InterfaceC5717fc
            public final void onActivityResult(Object obj) {
                qy6Var.invoke(obj);
            }
        }), abstractC8767lc, i);
    }
}
