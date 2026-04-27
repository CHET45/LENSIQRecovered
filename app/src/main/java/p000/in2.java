package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class in2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object f47574a = new Object();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final yn2<hn2> f47575b = new C7516a();

    /* JADX INFO: renamed from: in2$a */
    public static final class C7516a implements yn2<hn2> {
    }

    @yfb
    public static final cn2 Composition(@yfb p40<?> p40Var, @yfb dn2 dn2Var) {
        return new hn2(dn2Var, p40Var, null, 4, null);
    }

    @yfb
    @dpg
    public static final sz2 ControlledComposition(@yfb p40<?> p40Var, @yfb dn2 dn2Var) {
        return new hn2(dn2Var, p40Var, null, 4, null);
    }

    @yfb
    public static final h9e ReusableComposition(@yfb p40<?> p40Var, @yfb dn2 dn2Var) {
        return new hn2(dn2Var, p40Var, null, 4, null);
    }

    @yfb
    public static final yn2<hn2> getCompositionImplServiceKey() {
        return f47575b;
    }

    @gib
    public static final <T> T getCompositionService(@yfb cn2 cn2Var, @yfb yn2<T> yn2Var) {
        zn2 zn2Var = cn2Var instanceof zn2 ? (zn2) cn2Var : null;
        if (zn2Var != null) {
            return (T) zn2Var.getCompositionService(yn2Var);
        }
        return null;
    }

    @yfb
    @sg5
    public static final e13 getRecomposeCoroutineContext(@yfb sz2 sz2Var) {
        e13 recomposeContext;
        hn2 hn2Var = sz2Var instanceof hn2 ? (hn2) sz2Var : null;
        return (hn2Var == null || (recomposeContext = hn2Var.getRecomposeContext()) == null) ? a05.f2a : recomposeContext;
    }

    @sg5
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(sz2 sz2Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i, int i2) {
        T t = list.get(i);
        list.set(i, list.get(i2));
        list.set(i2, t);
    }

    @yfb
    @sg5
    public static final cn2 Composition(@yfb p40<?> p40Var, @yfb dn2 dn2Var, @yfb e13 e13Var) {
        return new hn2(dn2Var, p40Var, e13Var);
    }

    @yfb
    @dpg
    @sg5
    public static final sz2 ControlledComposition(@yfb p40<?> p40Var, @yfb dn2 dn2Var, @yfb e13 e13Var) {
        return new hn2(dn2Var, p40Var, e13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(g5b g5bVar, int i, int i2) {
        int i3 = g5bVar.get(i);
        g5bVar.set(i, g5bVar.get(i2));
        g5bVar.set(i2, i3);
    }
}
