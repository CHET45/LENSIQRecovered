package p000;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7
public final class ezd<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final zyd f34614a;

    private ezd(@wx1 K key, @wx1 V value, zyd cause) {
        super(key, value);
        this.f34614a = (zyd) v7d.checkNotNull(cause);
    }

    public static <K, V> ezd<K, V> create(@wx1 K key, @wx1 V value, zyd cause) {
        return new ezd<>(key, value, cause);
    }

    public zyd getCause() {
        return this.f34614a;
    }

    public boolean wasEvicted() {
        return this.f34614a.mo27150a();
    }
}
