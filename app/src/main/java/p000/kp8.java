package p000;

import p000.hp8;

/* JADX INFO: loaded from: classes7.dex */
public interface kp8<D, E, V> extends hp8<V>, gz6<D, E, V> {

    /* JADX INFO: renamed from: kp8$a */
    public static final class C8480a {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    /* JADX INFO: renamed from: kp8$b */
    public interface InterfaceC8481b<D, E, V> extends hp8.InterfaceC6964c<V>, gz6<D, E, V> {
    }

    V get(D d, E e);

    @gib
    @jjf(version = "1.1")
    Object getDelegate(D d, E e);

    @Override // p000.hp8
    @yfb
    InterfaceC8481b<D, E, V> getGetter();
}
