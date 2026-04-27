package p000;

import java.util.Collection;
import java.util.List;
import p000.oqc;

/* JADX INFO: loaded from: classes.dex */
public interface prc<E> extends jx7<E>, oqc<E> {

    /* JADX INFO: renamed from: prc$a */
    public interface InterfaceC11080a<E> extends List<E>, oqc.InterfaceC10501a<E>, yo8 {
        @Override // p000.oqc.InterfaceC10501a
        @yfb
        prc<E> build();
    }

    @yfb
    prc<E> add(int i, E e);

    @yfb
    prc<E> add(E e);

    @Override // java.util.List
    @yfb
    prc<E> addAll(int i, @yfb Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, p000.oqc, p000.lsc
    @yfb
    prc<E> addAll(@yfb Collection<? extends E> collection);

    @yfb
    InterfaceC11080a<E> builder();

    @Override // java.util.List, java.util.Collection, p000.oqc, p000.lsc
    @yfb
    prc<E> clear();

    @Override // java.util.List, java.util.Collection, p000.oqc, p000.lsc
    @yfb
    prc<E> remove(E e);

    @Override // java.util.List, java.util.Collection, p000.oqc, p000.lsc
    @yfb
    prc<E> removeAll(@yfb Collection<? extends E> collection);

    @yfb
    prc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var);

    @yfb
    prc<E> removeAt(int i);

    @Override // java.util.List, java.util.Collection, p000.oqc, p000.lsc
    @yfb
    prc<E> retainAll(@yfb Collection<? extends E> collection);

    @Override // java.util.List
    @yfb
    prc<E> set(int i, E e);
}
