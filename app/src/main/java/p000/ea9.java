package p000;

import java.util.Map;
import p000.da9;

/* JADX INFO: loaded from: classes5.dex */
public interface ea9 extends rsa {
    boolean containsLabels(String str);

    mmg getAddTarget();

    String getDatabase();

    vj1 getDatabaseBytes();

    @Deprecated
    Map<String, String> getLabels();

    int getLabelsCount();

    Map<String, String> getLabelsMap();

    String getLabelsOrDefault(String str, String str2);

    String getLabelsOrThrow(String str);

    int getRemoveTarget();

    da9.EnumC4702d getTargetChangeCase();

    boolean hasAddTarget();

    boolean hasRemoveTarget();
}
