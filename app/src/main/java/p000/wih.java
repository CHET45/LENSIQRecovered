package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 4)
public final class wih<K, V> extends pih<K, V, V> {

    /* JADX INFO: renamed from: e */
    public static final int f94371e = 0;

    @Override // java.util.Iterator
    public V next() {
        ec2.m28824assert(hasNextKey());
        m19526c(m19525b() + 2);
        return (V) m19524a()[m19525b() - 1];
    }
}
