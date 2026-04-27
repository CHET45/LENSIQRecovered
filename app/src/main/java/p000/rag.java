package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface rag extends ssa {
    boolean containsFields(String key);

    @Deprecated
    Map<String, a2i> getFields();

    int getFieldsCount();

    Map<String, a2i> getFieldsMap();

    a2i getFieldsOrDefault(String key, a2i defaultValue);

    a2i getFieldsOrThrow(String key);
}
