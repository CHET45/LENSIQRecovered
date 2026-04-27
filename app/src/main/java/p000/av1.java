package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class av1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f11914a = "Channel was closed";

    @yjd
    public static final void cancelConsumed(@yfb hsd<?> hsdVar, @gib Throwable th) {
        cv1.cancelConsumed(hsdVar, th);
    }

    @xxb
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(@yfb ud1<E> ud1Var, @yfb qy6<? super hsd<? extends E>, ? extends R> qy6Var) {
        return (R) gv1.consume(ud1Var, qy6Var);
    }

    @gib
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object consumeEach(@yfb ud1<E> ud1Var, @yfb qy6<? super E, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        return gv1.consumeEach(ud1Var, qy6Var, zy2Var);
    }

    @yfb
    @yjd
    public static final qy6<Throwable, bth> consumes(@yfb hsd<?> hsdVar) {
        return gv1.consumes(hsdVar);
    }

    @yfb
    @yjd
    public static final qy6<Throwable, bth> consumesAll(@yfb hsd<?>... hsdVarArr) {
        return gv1.consumesAll(hsdVarArr);
    }

    @yfb
    @yjd
    public static final <E, K> hsd<E> distinctBy(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super K>, ? extends Object> gz6Var) {
        return gv1.distinctBy(hsdVar, e13Var, gz6Var);
    }

    @yfb
    @yjd
    public static final <E> hsd<E> filter(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return gv1.filter(hsdVar, e13Var, gz6Var);
    }

    @yfb
    @yjd
    public static final <E> hsd<E> filterNotNull(@yfb hsd<? extends E> hsdVar) {
        return gv1.filterNotNull(hsdVar);
    }

    @yfb
    @yjd
    public static final <E, R> hsd<R> map(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return gv1.map(hsdVar, e13Var, gz6Var);
    }

    @yfb
    @yjd
    public static final <E, R> hsd<R> mapIndexed(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb kz6<? super Integer, ? super E, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return gv1.mapIndexed(hsdVar, e13Var, kz6Var);
    }

    @gib
    @yjd
    public static final <E, C extends nye<? super E>> Object toChannel(@yfb hsd<? extends E> hsdVar, @yfb C c, @yfb zy2<? super C> zy2Var) {
        return gv1.toChannel(hsdVar, c, zy2Var);
    }

    @gib
    @yjd
    public static final <E, C extends Collection<? super E>> Object toCollection(@yfb hsd<? extends E> hsdVar, @yfb C c, @yfb zy2<? super C> zy2Var) {
        return gv1.toCollection(hsdVar, c, zy2Var);
    }

    @gib
    public static final <E> Object toList(@yfb hsd<? extends E> hsdVar, @yfb zy2<? super List<? extends E>> zy2Var) {
        return cv1.toList(hsdVar, zy2Var);
    }

    @gib
    @yjd
    public static final <E> Object toMutableSet(@yfb hsd<? extends E> hsdVar, @yfb zy2<? super Set<E>> zy2Var) {
        return gv1.toMutableSet(hsdVar, zy2Var);
    }

    @yfb
    public static final <E> Object trySendBlocking(@yfb nye<? super E> nyeVar, E e) {
        return bv1.trySendBlocking(nyeVar, e);
    }

    public static final <E, R> R consume(@yfb hsd<? extends E> hsdVar, @yfb qy6<? super hsd<? extends E>, ? extends R> qy6Var) {
        return (R) cv1.consume(hsdVar, qy6Var);
    }

    @gib
    public static final <E> Object consumeEach(@yfb hsd<? extends E> hsdVar, @yfb qy6<? super E, bth> qy6Var, @yfb zy2<? super bth> zy2Var) {
        return cv1.consumeEach(hsdVar, qy6Var, zy2Var);
    }

    @gib
    @yjd
    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(@yfb hsd<? extends scc<? extends K, ? extends V>> hsdVar, @yfb M m, @yfb zy2<? super M> zy2Var) {
        return gv1.toMap(hsdVar, m, zy2Var);
    }

    @yfb
    @yjd
    public static final <E, R, V> hsd<V> zip(@yfb hsd<? extends E> hsdVar, @yfb hsd<? extends R> hsdVar2, @yfb e13 e13Var, @yfb gz6<? super E, ? super R, ? extends V> gz6Var) {
        return gv1.zip(hsdVar, hsdVar2, e13Var, gz6Var);
    }
}
