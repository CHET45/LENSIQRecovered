package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class gcd {

    /* JADX INFO: renamed from: a */
    public static SparseArray<acd> f39363a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<acd, Integer> f39364b;

    static {
        HashMap<acd, Integer> map = new HashMap<>();
        f39364b = map;
        map.put(acd.DEFAULT, 0);
        f39364b.put(acd.VERY_LOW, 1);
        f39364b.put(acd.HIGHEST, 2);
        for (acd acdVar : f39364b.keySet()) {
            f39363a.append(f39364b.get(acdVar).intValue(), acdVar);
        }
    }

    public static int toInt(@efb acd acdVar) {
        Integer num = f39364b.get(acdVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + acdVar);
    }

    @efb
    public static acd valueOf(int i) {
        acd acdVar = f39363a.get(i);
        if (acdVar != null) {
            return acdVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
