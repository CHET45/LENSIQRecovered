package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class vpg extends nfc {
    @Override // p000.nfc
    public List<v5d> getValueSources(mfc mfcVar) {
        ArrayList arrayList = new ArrayList();
        for (int i : ((upg) mfcVar.getAnnotation(upg.class)).ints()) {
            arrayList.add(v5d.forValue("ints", Integer.valueOf(i)));
        }
        return arrayList;
    }
}
