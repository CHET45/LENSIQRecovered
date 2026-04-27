package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class ald implements ykd {

    /* JADX INFO: renamed from: a */
    public Map<Integer, Integer> f2003a;

    public Map<Integer, Integer> getColorToCount() {
        return this.f2003a;
    }

    @Override // p000.ykd
    public bld quantize(int[] iArr, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i2));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(iIntValue));
        }
        this.f2003a = linkedHashMap;
        return new bld(linkedHashMap);
    }
}
