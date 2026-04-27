package p000;

import p000.qz8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class vx8 implements qz8.InterfaceC11771a {

    /* JADX INFO: renamed from: e */
    public static final int f92554e = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qy6<Integer, Object> f92555a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<dy8, Integer, ib7> f92556b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<Integer, Object> f92557c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final oz6<by8, Integer, zl2, Integer, bth> f92558d;

    /* JADX WARN: Multi-variable type inference failed */
    public vx8(@gib qy6<? super Integer, ? extends Object> qy6Var, @yfb gz6<? super dy8, ? super Integer, ib7> gz6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super by8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        this.f92555a = qy6Var;
        this.f92556b = gz6Var;
        this.f92557c = qy6Var2;
        this.f92558d = oz6Var;
    }

    @yfb
    public final oz6<by8, Integer, zl2, Integer, bth> getItem() {
        return this.f92558d;
    }

    @Override // p000.qz8.InterfaceC11771a
    @gib
    public qy6<Integer, Object> getKey() {
        return this.f92555a;
    }

    @yfb
    public final gz6<dy8, Integer, ib7> getSpan() {
        return this.f92556b;
    }

    @Override // p000.qz8.InterfaceC11771a
    @yfb
    public qy6<Integer, Object> getType() {
        return this.f92557c;
    }
}
