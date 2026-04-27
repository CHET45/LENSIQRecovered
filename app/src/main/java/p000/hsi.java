package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface hsi extends rsa {
    boolean containsLabels(String str);

    String getDatabase();

    vj1 getDatabaseBytes();

    @Deprecated
    Map<String, String> getLabels();

    int getLabelsCount();

    Map<String, String> getLabelsMap();

    String getLabelsOrDefault(String str, String str2);

    String getLabelsOrThrow(String str);

    String getStreamId();

    vj1 getStreamIdBytes();

    vj1 getStreamToken();

    yri getWrites(int i);

    int getWritesCount();

    List<yri> getWritesList();
}
