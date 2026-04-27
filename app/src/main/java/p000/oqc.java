package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface oqc<E> extends bx7<E> {

    /* JADX INFO: renamed from: oqc$a */
    public interface InterfaceC10501a<E> extends Collection<E>, vo8 {
        @yfb
        oqc<E> build();
    }

    @yfb
    oqc<E> add(E e);

    @yfb
    oqc<E> addAll(@yfb Collection<? extends E> collection);

    @yfb
    InterfaceC10501a<E> builder();

    @yfb
    oqc<E> clear();

    @yfb
    oqc<E> remove(E e);

    @yfb
    oqc<E> removeAll(@yfb Collection<? extends E> collection);

    @yfb
    oqc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var);

    @yfb
    oqc<E> retainAll(@yfb Collection<? extends E> collection);
}
