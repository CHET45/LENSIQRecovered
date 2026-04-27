package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class yvi {
    /* JADX INFO: renamed from: a */
    public static final List m26374a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cwi cwiVar = (cwi) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", cwiVar.mo3468a());
            bundle.putLong("event_timestamp", cwiVar.mo3469b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m26375b(int i, List list) {
        list.add(cwi.m8766c(i, System.currentTimeMillis()));
    }
}
