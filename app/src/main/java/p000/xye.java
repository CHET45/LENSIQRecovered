package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@u7e
public abstract class xye<T> {
    @gib
    public abstract Object yield(T t, @yfb zy2<? super bth> zy2Var);

    @gib
    public final Object yieldAll(@yfb Iterable<? extends T> iterable, @yfb zy2<? super bth> zy2Var) {
        Object objYieldAll;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objYieldAll = yieldAll(iterable.iterator(), zy2Var)) == pd8.getCOROUTINE_SUSPENDED()) ? objYieldAll : bth.f14751a;
    }

    @gib
    public abstract Object yieldAll(@yfb Iterator<? extends T> it, @yfb zy2<? super bth> zy2Var);

    @gib
    public final Object yieldAll(@yfb vye<? extends T> vyeVar, @yfb zy2<? super bth> zy2Var) {
        Object objYieldAll = yieldAll(vyeVar.iterator(), zy2Var);
        return objYieldAll == pd8.getCOROUTINE_SUSPENDED() ? objYieldAll : bth.f14751a;
    }
}
