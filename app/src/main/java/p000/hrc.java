package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class hrc<K, V> extends AbstractC7141i4<K> implements ey7<K> {

    /* JADX INFO: renamed from: c */
    public static final int f44642c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final uqc<K, V> f44643b;

    public hrc(@yfb uqc<K, V> uqcVar) {
        this.f44643b = uqcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44643b.containsKey(obj);
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f44643b.size();
    }

    @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<K> iterator() {
        return new irc(this.f44643b.getNode$runtime_release());
    }
}
