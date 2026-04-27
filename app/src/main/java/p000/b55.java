package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface b55 extends rsa {
    boolean containsMetadata(String str);

    String getDomain();

    vj1 getDomainBytes();

    @Deprecated
    Map<String, String> getMetadata();

    int getMetadataCount();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String str, String str2);

    String getMetadataOrThrow(String str);

    String getReason();

    vj1 getReasonBytes();
}
