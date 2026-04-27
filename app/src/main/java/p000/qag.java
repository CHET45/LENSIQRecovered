package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface qag extends rsa {
    boolean containsFields(String key);

    @Deprecated
    Map<String, c2i> getFields();

    int getFieldsCount();

    Map<String, c2i> getFieldsMap();

    c2i getFieldsOrDefault(String key, c2i defaultValue);

    c2i getFieldsOrThrow(String key);
}
