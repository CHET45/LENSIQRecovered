package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public enum oh7 implements nfg<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> nfg<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // p000.nfg
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
