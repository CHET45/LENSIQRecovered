package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class re3 {

    /* JADX INFO: renamed from: a */
    public static final int f77979a = 1073741824;

    private re3() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> HashSet<T> m21183a(int i) {
        return new HashSet<>(calculateInitialCapacity(i));
    }

    private static int calculateInitialCapacity(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean hasDuplicates(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap<>(calculateInitialCapacity(i));
    }

    public static <T> List<T> presizedList(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }
}
