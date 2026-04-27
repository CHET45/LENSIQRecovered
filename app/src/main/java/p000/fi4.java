package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface fi4 extends rsa {
    boolean containsFields(String str);

    f2h getCreateTime();

    @Deprecated
    Map<String, b2i> getFields();

    int getFieldsCount();

    Map<String, b2i> getFieldsMap();

    b2i getFieldsOrDefault(String str, b2i b2iVar);

    b2i getFieldsOrThrow(String str);

    String getName();

    vj1 getNameBytes();

    f2h getUpdateTime();

    boolean hasCreateTime();

    boolean hasUpdateTime();
}
