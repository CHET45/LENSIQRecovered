package p000;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lt3 implements pw2 {

    /* JADX INFO: renamed from: f */
    public static final lt3 f58675f = new lt3(Collections.emptyMap());

    /* JADX INFO: renamed from: d */
    public int f58676d;

    /* JADX INFO: renamed from: e */
    public final Map<String, byte[]> f58677e;

    public lt3() {
        this(Collections.emptyMap());
    }

    private static void addValues(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), getBytes(entry.getValue()));
        }
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, rw2 rw2Var) {
        HashMap map2 = new HashMap(map);
        removeValues(map2, rw2Var.getRemovedValues());
        addValues(map2, rw2Var.getEditedValues());
        return map2;
    }

    private static byte[] getBytes(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean isMetadataEqual(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void removeValues(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    @Override // p000.pw2
    public final boolean contains(String str) {
        return this.f58677e.containsKey(str);
    }

    public lt3 copyWithMutationsApplied(rw2 rw2Var) {
        Map<String, byte[]> mapApplyMutations = applyMutations(this.f58677e, rw2Var);
        return isMetadataEqual(this.f58677e, mapApplyMutations) ? this : new lt3(mapApplyMutations);
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
        return this.f58677e.entrySet();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lt3.class != obj.getClass()) {
            return false;
        }
        return isMetadataEqual(this.f58677e, ((lt3) obj).f58677e);
    }

    @Override // p000.pw2
    @hib
    public final byte[] get(String str, @hib byte[] bArr) {
        byte[] bArr2 = this.f58677e.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    public int hashCode() {
        if (this.f58676d == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f58677e.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f58676d = iHashCode;
        }
        return this.f58676d;
    }

    public lt3(Map<String, byte[]> map) {
        this.f58677e = Collections.unmodifiableMap(map);
    }

    @Override // p000.pw2
    @hib
    public final String get(String str, @hib String str2) {
        byte[] bArr = this.f58677e.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    @Override // p000.pw2
    public final long get(String str, long j) {
        byte[] bArr = this.f58677e.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }
}
