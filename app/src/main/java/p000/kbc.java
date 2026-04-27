package p000;

import p000.qz8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class kbc implements qz8.InterfaceC11771a {

    /* JADX INFO: renamed from: c */
    public static final int f53551c = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qy6<Integer, Object> f53552a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final oz6<ubc, Integer, zl2, Integer, bth> f53553b;

    /* JADX WARN: Multi-variable type inference failed */
    public kbc(@gib qy6<? super Integer, ? extends Object> qy6Var, @yfb oz6<? super ubc, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        this.f53552a = qy6Var;
        this.f53553b = oz6Var;
    }

    @yfb
    public final oz6<ubc, Integer, zl2, Integer, bth> getItem() {
        return this.f53553b;
    }

    @Override // p000.qz8.InterfaceC11771a
    @gib
    public qy6<Integer, Object> getKey() {
        return this.f53552a;
    }
}
