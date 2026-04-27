package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class fsc<K, V> extends AbstractC10126o0<V> implements bx7<V> {

    /* JADX INFO: renamed from: b */
    public static final int f37612b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final rrc<K, V> f37613a;

    public fsc(@yfb rrc<K, V> rrcVar) {
        this.f37613a = rrcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f37613a.containsValue(obj);
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f37613a.size();
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<V> iterator() {
        return new gsc(this.f37613a);
    }
}
