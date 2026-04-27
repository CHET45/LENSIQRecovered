package p000;

import java.util.Map;
import p000.os9;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public interface us9 {
    Map<?, ?> forMapData(Object mapField);

    os9.C10633b<?, ?> forMapMetadata(Object mapDefaultEntry);

    Map<?, ?> forMutableMapData(Object mapField);

    int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry);

    boolean isImmutable(Object mapField);

    @pp1
    Object mergeFrom(Object destMapField, Object srcMapField);

    Object newMapField(Object mapDefaultEntry);

    Object toImmutable(Object mapField);
}
