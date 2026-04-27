package p000;

import java.util.Map;
import p000.os9;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public class ws9 implements us9 {
    private static <K, V> int getSerializedSizeLite(int fieldNumber, Object mapField, Object defaultEntry) {
        ss9 ss9Var = (ss9) mapField;
        os9 os9Var = (os9) defaultEntry;
        int iComputeMessageSize = 0;
        if (ss9Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ss9Var.entrySet()) {
            iComputeMessageSize += os9Var.computeMessageSize(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> ss9<K, V> mergeFromLite(Object destMapField, Object srcMapField) {
        ss9<K, V> ss9VarMutableCopy = (ss9) destMapField;
        ss9<K, V> ss9Var = (ss9) srcMapField;
        if (!ss9Var.isEmpty()) {
            if (!ss9VarMutableCopy.isMutable()) {
                ss9VarMutableCopy = ss9VarMutableCopy.mutableCopy();
            }
            ss9VarMutableCopy.mergeFrom(ss9Var);
        }
        return ss9VarMutableCopy;
    }

    @Override // p000.us9
    public Map<?, ?> forMapData(Object mapField) {
        return (ss9) mapField;
    }

    @Override // p000.us9
    public os9.C10633b<?, ?> forMapMetadata(Object mapDefaultEntry) {
        return ((os9) mapDefaultEntry).m18972b();
    }

    @Override // p000.us9
    public Map<?, ?> forMutableMapData(Object mapField) {
        return (ss9) mapField;
    }

    @Override // p000.us9
    public int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return getSerializedSizeLite(fieldNumber, mapField, mapDefaultEntry);
    }

    @Override // p000.us9
    public boolean isImmutable(Object mapField) {
        return !((ss9) mapField).isMutable();
    }

    @Override // p000.us9
    public Object mergeFrom(Object destMapField, Object srcMapField) {
        return mergeFromLite(destMapField, srcMapField);
    }

    @Override // p000.us9
    public Object newMapField(Object unused) {
        return ss9.emptyMapField().mutableCopy();
    }

    @Override // p000.us9
    public Object toImmutable(Object mapField) {
        ((ss9) mapField).makeImmutable();
        return mapField;
    }
}
