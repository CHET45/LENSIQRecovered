package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface frb<K, V> extends Map<K, V> {

    /* JADX INFO: renamed from: frb$a */
    public static abstract class AbstractC5941a<T extends frb<K, V>, K, V> {
        public abstract void onMapChanged(T sender, K key);
    }

    void addOnMapChangedCallback(AbstractC5941a<? extends frb<K, V>, K, V> callback);

    void removeOnMapChangedCallback(AbstractC5941a<? extends frb<K, V>, K, V> callback);
}
