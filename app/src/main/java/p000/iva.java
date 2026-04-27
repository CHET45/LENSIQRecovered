package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface iva extends rsa {
    boolean containsMetricCosts(String str);

    @Deprecated
    Map<String, Long> getMetricCosts();

    int getMetricCostsCount();

    Map<String, Long> getMetricCostsMap();

    long getMetricCostsOrDefault(String str, long j);

    long getMetricCostsOrThrow(String str);

    String getSelector();

    vj1 getSelectorBytes();
}
