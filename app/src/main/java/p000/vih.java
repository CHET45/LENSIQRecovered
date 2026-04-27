package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class vih<K, V> extends pih<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f */
    public static final int f91281f = 8;

    /* JADX INFO: renamed from: e */
    @yfb
    public final zqc<K, V> f91282e;

    public vih(@yfb zqc<K, V> zqcVar) {
        this.f91282e = zqcVar;
    }

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        ec2.m28824assert(hasNextKey());
        m19526c(m19525b() + 2);
        return new x5b(this.f91282e, m19524a()[m19525b() - 2], m19524a()[m19525b() - 1]);
    }
}
