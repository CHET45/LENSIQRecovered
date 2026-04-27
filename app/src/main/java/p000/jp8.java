package p000;

import p000.hp8;

/* JADX INFO: loaded from: classes7.dex */
public interface jp8<T, V> extends hp8<V>, qy6<T, V> {

    /* JADX INFO: renamed from: jp8$a */
    public static final class C8004a {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    /* JADX INFO: renamed from: jp8$b */
    public interface InterfaceC8005b<T, V> extends hp8.InterfaceC6964c<V>, qy6<T, V> {
    }

    V get(T t);

    @gib
    @jjf(version = "1.1")
    Object getDelegate(T t);

    @Override // p000.hp8
    @yfb
    InterfaceC8005b<T, V> getGetter();
}
