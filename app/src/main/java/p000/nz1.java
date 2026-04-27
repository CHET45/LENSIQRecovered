package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nz1 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, mz1> f66107a = new LinkedHashMap();

    public void add(mz1 mz1Var) {
        long[] jArr = mz1Var.f62834h;
        if (jArr.length <= 0 || this.f66107a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f66107a.put(Long.valueOf(mz1Var.f62834h[0]), mz1Var);
    }

    public void clear() {
        this.f66107a.clear();
    }

    public mz1 merge() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (mz1 mz1Var : this.f66107a.values()) {
            arrayList.add(mz1Var.f62831e);
            arrayList2.add(mz1Var.f62832f);
            arrayList3.add(mz1Var.f62833g);
            arrayList4.add(mz1Var.f62834h);
        }
        return new mz1(rd8.concat((int[][]) arrayList.toArray(new int[arrayList.size()][])), im9.concat((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), im9.concat((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), im9.concat((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int size() {
        return this.f66107a.size();
    }
}
