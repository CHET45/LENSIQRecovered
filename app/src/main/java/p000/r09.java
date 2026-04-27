package p000;

import p000.qz8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class r09 implements qz8.InterfaceC11771a {

    /* JADX INFO: renamed from: d */
    public static final int f76682d = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qy6<Integer, Object> f76683a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<Integer, Object> f76684b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final oz6<fz8, Integer, zl2, Integer, bth> f76685c;

    /* JADX WARN: Multi-variable type inference failed */
    public r09(@gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        this.f76683a = qy6Var;
        this.f76684b = qy6Var2;
        this.f76685c = oz6Var;
    }

    @yfb
    public final oz6<fz8, Integer, zl2, Integer, bth> getItem() {
        return this.f76685c;
    }

    @Override // p000.qz8.InterfaceC11771a
    @gib
    public qy6<Integer, Object> getKey() {
        return this.f76683a;
    }

    @Override // p000.qz8.InterfaceC11771a
    @yfb
    public qy6<Integer, Object> getType() {
        return this.f76684b;
    }
}
