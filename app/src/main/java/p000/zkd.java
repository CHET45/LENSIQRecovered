package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class zkd {
    private zkd() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i) {
        Set<Integer> setKeySet = new dld().quantize(iArr, i).f14066a.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = it.next().intValue();
            i2++;
        }
        return cld.quantize(iArr, iArr2, i);
    }
}
