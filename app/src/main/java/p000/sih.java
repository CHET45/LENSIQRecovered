package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 4)
public final class sih<K, V> extends pih<K, V, K> {

    /* JADX INFO: renamed from: e */
    public static final int f81942e = 0;

    @Override // java.util.Iterator
    public K next() {
        ec2.m28824assert(hasNextKey());
        m19526c(m19525b() + 2);
        return (K) m19524a()[m19525b() - 2];
    }
}
