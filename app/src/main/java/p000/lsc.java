package p000;

import java.util.Collection;
import java.util.Set;
import p000.oqc;

/* JADX INFO: loaded from: classes.dex */
public interface lsc<E> extends ey7<E>, oqc<E> {

    /* JADX INFO: renamed from: lsc$a */
    public interface InterfaceC8954a<E> extends Set<E>, oqc.InterfaceC10501a<E>, fp8 {
        @Override // p000.oqc.InterfaceC10501a
        @yfb
        lsc<E> build();
    }

    @yfb
    lsc<E> add(E e);

    @yfb
    lsc<E> addAll(@yfb Collection<? extends E> collection);

    @yfb
    InterfaceC8954a<E> builder();

    @yfb
    lsc<E> clear();

    @yfb
    lsc<E> remove(E e);

    @yfb
    lsc<E> removeAll(@yfb Collection<? extends E> collection);

    @yfb
    lsc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var);

    @yfb
    lsc<E> retainAll(@yfb Collection<? extends E> collection);
}
