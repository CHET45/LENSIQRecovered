package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class h45 extends nfc {

    /* JADX INFO: renamed from: a */
    public Class<?> f42305a;

    public h45(Class<?> cls) {
        this.f42305a = cls;
    }

    @Override // p000.nfc
    public List<v5d> getValueSources(mfc mfcVar) {
        Object[] enumConstants = this.f42305a.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(v5d.forValue(obj.toString(), obj));
        }
        return arrayList;
    }
}
