package p000;

import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public interface gi4 {
    @hib
    n9c getOverlay(ci4 ci4Var);

    Map<ci4, n9c> getOverlays(String str, int i, int i2);

    Map<ci4, n9c> getOverlays(SortedSet<ci4> sortedSet);

    Map<ci4, n9c> getOverlays(s6e s6eVar, int i);

    void removeOverlaysForBatchId(int i);

    void saveOverlays(int i, Map<ci4, m7b> map);
}
