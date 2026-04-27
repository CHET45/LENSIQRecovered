package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface mod extends rsa {
    boolean containsValues(String str);

    long getDefaultLimit();

    String getDescription();

    vj1 getDescriptionBytes();

    String getDisplayName();

    vj1 getDisplayNameBytes();

    String getDuration();

    vj1 getDurationBytes();

    long getFreeTier();

    long getMaxLimit();

    String getMetric();

    vj1 getMetricBytes();

    String getName();

    vj1 getNameBytes();

    String getUnit();

    vj1 getUnitBytes();

    @Deprecated
    Map<String, Long> getValues();

    int getValuesCount();

    Map<String, Long> getValuesMap();

    long getValuesOrDefault(String str, long j);

    long getValuesOrThrow(String str);
}
