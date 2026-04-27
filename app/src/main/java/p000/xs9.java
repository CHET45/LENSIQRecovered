package p000;

import java.util.Map;
import p000.ns9;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class xs9 implements vs9 {
    private static <K, V> int getSerializedSizeLite(int fieldNumber, Object mapField, Object defaultEntry) {
        ts9 ts9Var = (ts9) mapField;
        ns9 ns9Var = (ns9) defaultEntry;
        int iComputeMessageSize = 0;
        if (ts9Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ts9Var.entrySet()) {
            iComputeMessageSize += ns9Var.computeMessageSize(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> ts9<K, V> mergeFromLite(Object destMapField, Object srcMapField) {
        ts9<K, V> ts9VarMutableCopy = (ts9) destMapField;
        ts9<K, V> ts9Var = (ts9) srcMapField;
        if (!ts9Var.isEmpty()) {
            if (!ts9VarMutableCopy.isMutable()) {
                ts9VarMutableCopy = ts9VarMutableCopy.mutableCopy();
            }
            ts9VarMutableCopy.mergeFrom(ts9Var);
        }
        return ts9VarMutableCopy;
    }

    @Override // p000.vs9
    public Map<?, ?> forMapData(Object mapField) {
        return (ts9) mapField;
    }

    @Override // p000.vs9
    public ns9.C10042b<?, ?> forMapMetadata(Object mapDefaultEntry) {
        return ((ns9) mapDefaultEntry).m18111b();
    }

    @Override // p000.vs9
    public Map<?, ?> forMutableMapData(Object mapField) {
        return (ts9) mapField;
    }

    @Override // p000.vs9
    public int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return getSerializedSizeLite(fieldNumber, mapField, mapDefaultEntry);
    }

    @Override // p000.vs9
    public boolean isImmutable(Object mapField) {
        return !((ts9) mapField).isMutable();
    }

    @Override // p000.vs9
    public Object mergeFrom(Object destMapField, Object srcMapField) {
        return mergeFromLite(destMapField, srcMapField);
    }

    @Override // p000.vs9
    public Object newMapField(Object unused) {
        return ts9.emptyMapField().mutableCopy();
    }

    @Override // p000.vs9
    public Object toImmutable(Object mapField) {
        ((ts9) mapField).makeImmutable();
        return mapField;
    }
}
