package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class pih<K, V, T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f71037d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public Object[] f71038a = nih.f64689e.getEMPTY$runtime_release().getBuffer$runtime_release();

    /* JADX INFO: renamed from: b */
    public int f71039b;

    /* JADX INFO: renamed from: c */
    public int f71040c;

    @yfb
    /* JADX INFO: renamed from: a */
    public final Object[] m19524a() {
        return this.f71038a;
    }

    /* JADX INFO: renamed from: b */
    public final int m19525b() {
        return this.f71040c;
    }

    /* JADX INFO: renamed from: c */
    public final void m19526c(int i) {
        this.f71040c = i;
    }

    public final K currentKey() {
        ec2.m28824assert(hasNextKey());
        return (K) this.f71038a[this.f71040c];
    }

    @yfb
    public final nih<? extends K, ? extends V> currentNode() {
        ec2.m28824assert(hasNextNode());
        Object obj = this.f71038a[this.f71040c];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (nih) obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.f71040c < this.f71039b;
    }

    public final boolean hasNextNode() {
        ec2.m28824assert(this.f71040c >= this.f71039b);
        return this.f71040c < this.f71038a.length;
    }

    public final void moveToNextKey() {
        ec2.m28824assert(hasNextKey());
        this.f71040c += 2;
    }

    public final void moveToNextNode() {
        ec2.m28824assert(hasNextNode());
        this.f71040c++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(@yfb Object[] objArr, int i, int i2) {
        this.f71038a = objArr;
        this.f71039b = i;
        this.f71040c = i2;
    }

    public final void reset(@yfb Object[] objArr, int i) {
        reset(objArr, i, 0);
    }
}
