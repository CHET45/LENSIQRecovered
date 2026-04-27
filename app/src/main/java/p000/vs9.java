package p000;

import java.util.Map;
import p000.ns9;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public interface vs9 {
    Map<?, ?> forMapData(Object mapField);

    ns9.C10042b<?, ?> forMapMetadata(Object mapDefaultEntry);

    Map<?, ?> forMutableMapData(Object mapField);

    int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry);

    boolean isImmutable(Object mapField);

    @qp1
    Object mergeFrom(Object destMapField, Object srcMapField);

    Object newMapField(Object mapDefaultEntry);

    Object toImmutable(Object mapField);
}
