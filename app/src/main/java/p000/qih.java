package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 4)
public final class qih<K, V> extends pih<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: e */
    public static final int f74554e = 0;

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        ec2.m28824assert(hasNextKey());
        m19526c(m19525b() + 2);
        return new ls9(m19524a()[m19525b() - 2], m19524a()[m19525b() - 1]);
    }
}
