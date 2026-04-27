package p000;

/* JADX INFO: renamed from: zd */
/* JADX INFO: loaded from: classes7.dex */
public final class C16091zd {
    @yfb
    @xxb
    public static final <E> nye<E> actor(@yfb x13 x13Var, @yfb e13 e13Var, int i, @yfb b23 b23Var, @gib qy6<? super Throwable, bth> qy6Var, @yfb gz6<? super InterfaceC0187ae<E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(x13Var, e13Var);
        au1 au1VarChannel$default = nu1.Channel$default(i, null, null, 6, null);
        C15619yd hx8Var = b23Var.isLazy() ? new hx8(e13VarNewCoroutineContext, au1VarChannel$default, gz6Var) : new C15619yd(e13VarNewCoroutineContext, au1VarChannel$default, true);
        if (qy6Var != null) {
            ((sj8) hx8Var).invokeOnCompletion(qy6Var);
        }
        ((AbstractC12833t0) hx8Var).start(b23Var, hx8Var, gz6Var);
        return (nye<E>) hx8Var;
    }

    public static /* synthetic */ nye actor$default(x13 x13Var, e13 e13Var, int i, b23 b23Var, qy6 qy6Var, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            b23Var = b23.f12441a;
        }
        b23 b23Var2 = b23Var;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        return actor(x13Var, e13Var2, i3, b23Var2, qy6Var, gz6Var);
    }
}
