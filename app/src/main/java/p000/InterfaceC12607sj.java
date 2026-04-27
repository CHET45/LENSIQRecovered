package p000;

import java.util.Map;

/* JADX INFO: renamed from: sj */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC12607sj extends rsa {
    boolean containsAggregateFields(String str);

    @Deprecated
    Map<String, b2i> getAggregateFields();

    int getAggregateFieldsCount();

    Map<String, b2i> getAggregateFieldsMap();

    b2i getAggregateFieldsOrDefault(String str, b2i b2iVar);

    b2i getAggregateFieldsOrThrow(String str);
}
