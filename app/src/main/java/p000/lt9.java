package p000;

import android.util.Pair;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.security.AuthProvider;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import p000.amc;

/* JADX INFO: loaded from: classes3.dex */
public class lt9 {

    /* JADX INFO: Add missing generic type declarations: [K1, V1] */
    /* JADX INFO: renamed from: lt9$a */
    public static class C8967a<K1, V1> implements InterfaceC8968b<K1, V1> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8969c f58706a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f58707b;

        public C8967a(InterfaceC8969c interfaceC8969c, Map map) {
            this.f58706a = interfaceC8969c;
            this.f58707b = map;
        }

        @Override // p000.lt9.InterfaceC8968b
        public void execute(K1 k1, V1 v1) {
            Pair pairTransform = this.f58706a.transform(k1, v1);
            this.f58707b.put(pairTransform.first, pairTransform.second);
        }
    }

    /* JADX INFO: renamed from: lt9$b */
    public interface InterfaceC8968b<K, V> {
        void execute(K k, V v);
    }

    /* JADX INFO: renamed from: lt9$c */
    public interface InterfaceC8969c<K1, V1, K2, V2> {
        Pair<K2, V2> transform(K1 k1, V1 v1);
    }

    private lt9() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <K, V> void forAllDo(Map<K, V> map, InterfaceC8968b<K, V> interfaceC8968b) {
        if (map == null || interfaceC8968b == null) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            interfaceC8968b.execute(entry.getKey(), entry.getValue());
        }
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> HashMap<K, V> newHashMap(Pair<K, V>... pairArr) {
        amc.C0328a c0328a = (HashMap<K, V>) new HashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    c0328a.put(pair.first, pair.second);
                }
            }
        }
        return c0328a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> Hashtable<K, V> newHashTable(Pair<K, V>... pairArr) {
        AuthProvider authProvider = (Hashtable<K, V>) new Hashtable();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    authProvider.put(pair.first, pair.second);
                }
            }
        }
        return authProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Pair<K, V>... pairArr) {
        FFmpegKitConfig.C24201 c24201 = (LinkedHashMap<K, V>) new LinkedHashMap();
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    c24201.put(pair.first, pair.second);
                }
            }
        }
        return c24201;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> TreeMap<K, V> newTreeMap(Comparator<K> comparator, Pair<K, V>... pairArr) {
        if (comparator == null) {
            throw new IllegalArgumentException("comparator must not be null");
        }
        tad tadVar = (TreeMap<K, V>) new TreeMap(comparator);
        if (pairArr != null && pairArr.length != 0) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    tadVar.put(pair.first, pair.second);
                }
            }
        }
        return tadVar;
    }

    @SafeVarargs
    public static <K, V> Map<K, V> newUnmodifiableMap(Pair<K, V>... pairArr) {
        return Collections.unmodifiableMap(newHashMap(pairArr));
    }

    public static int size(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String toString(Map map) {
        return map == null ? "null" : map.toString();
    }

    public static <K1, V1, K2, V2> Map<K2, V2> transform(Map<K1, V1> map, InterfaceC8969c<K1, V1, K2, V2> interfaceC8969c) {
        if (map != null && interfaceC8969c != null) {
            try {
                Map<K2, V2> map2 = (Map) map.getClass().newInstance();
                forAllDo(map, new C8967a(interfaceC8969c, map2));
                return map2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
