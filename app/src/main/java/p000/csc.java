package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class csc<K, V> extends AbstractC7141i4<K> implements ey7<K> {

    /* JADX INFO: renamed from: c */
    public static final int f27302c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final rrc<K, V> f27303b;

    public csc(@yfb rrc<K, V> rrcVar) {
        this.f27303b = rrcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f27303b.containsKey(obj);
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f27303b.size();
    }

    @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<K> iterator() {
        return new dsc(this.f27303b);
    }
}
