package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface fva extends rsa {
    boolean containsLabels(String str);

    @Deprecated
    Map<String, String> getLabels();

    int getLabelsCount();

    Map<String, String> getLabelsMap();

    String getLabelsOrDefault(String str, String str2);

    String getLabelsOrThrow(String str);

    String getType();

    vj1 getTypeBytes();
}
