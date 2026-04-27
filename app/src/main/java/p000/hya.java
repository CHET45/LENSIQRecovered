package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface hya extends rsa {
    boolean containsUserLabels(String str);

    pag getSystemLabels();

    @Deprecated
    Map<String, String> getUserLabels();

    int getUserLabelsCount();

    Map<String, String> getUserLabelsMap();

    String getUserLabelsOrDefault(String str, String str2);

    String getUserLabelsOrThrow(String str);

    boolean hasSystemLabels();
}
