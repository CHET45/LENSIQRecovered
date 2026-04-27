package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class jrc<K, V> extends AbstractC10126o0<V> implements bx7<V> {

    /* JADX INFO: renamed from: b */
    public static final int f51615b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final uqc<K, V> f51616a;

    public jrc(@yfb uqc<K, V> uqcVar) {
        this.f51616a = uqcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f51616a.containsValue(obj);
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f51616a.size();
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<V> iterator() {
        return new krc(this.f51616a.getNode$runtime_release());
    }
}
