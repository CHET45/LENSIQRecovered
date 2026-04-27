package p000;

import p000.qz8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class z19 implements qz8.InterfaceC11771a {

    /* JADX INFO: renamed from: e */
    public static final int f103659e = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qy6<Integer, Object> f103660a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<Integer, Object> f103661b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qy6<Integer, q0g> f103662c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final oz6<f29, Integer, zl2, Integer, bth> f103663d;

    /* JADX WARN: Multi-variable type inference failed */
    public z19(@gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @gib qy6<? super Integer, q0g> qy6Var3, @yfb oz6<? super f29, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        this.f103660a = qy6Var;
        this.f103661b = qy6Var2;
        this.f103662c = qy6Var3;
        this.f103663d = oz6Var;
    }

    @yfb
    public final oz6<f29, Integer, zl2, Integer, bth> getItem() {
        return this.f103663d;
    }

    @Override // p000.qz8.InterfaceC11771a
    @gib
    public qy6<Integer, Object> getKey() {
        return this.f103660a;
    }

    @gib
    public final qy6<Integer, q0g> getSpan() {
        return this.f103662c;
    }

    @Override // p000.qz8.InterfaceC11771a
    @yfb
    public qy6<Integer, Object> getType() {
        return this.f103661b;
    }
}
