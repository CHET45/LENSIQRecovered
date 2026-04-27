package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.b2i;
import p000.mt9;

/* JADX INFO: loaded from: classes5.dex */
public final class nkb implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ boolean f64808e = false;

    /* JADX INFO: renamed from: a */
    public final Object f64809a;

    /* JADX INFO: renamed from: b */
    @hib
    public volatile b2i f64810b;

    /* JADX INFO: renamed from: c */
    @xc7("lock")
    public b2i f64811c;

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public final Map<String, Object> f64812d;

    public nkb(b2i b2iVar) {
        this.f64809a = new Object();
        this.f64812d = new HashMap();
        r80.hardAssert(b2iVar.getValueTypeCase() == b2i.EnumC1713c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        r80.hardAssert(!b4f.isServerTimestamp(b2iVar), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f64810b = b2iVar;
    }

    @hib
    private static mt9 applyOverlay(b2i b2iVar, wr5 wr5Var, Map<String, Object> map) {
        b2i b2iVarExtractNestedValue = extractNestedValue(b2iVar, wr5Var);
        mt9.C9519b builder = s2i.isMapValue(b2iVarExtractNestedValue) ? b2iVarExtractNestedValue.getMapValue().toBuilder() : mt9.newBuilder();
        boolean z = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                mt9 mt9VarApplyOverlay = applyOverlay(b2iVar, wr5Var.append(key), (Map) value);
                if (mt9VarApplyOverlay != null) {
                    builder.putFields(key, b2i.newBuilder().setMapValue(mt9VarApplyOverlay).build());
                    z = true;
                }
            } else {
                if (value instanceof b2i) {
                    builder.putFields(key, (b2i) value);
                } else if (builder.containsFields(key)) {
                    r80.hardAssert(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    builder.removeFields(key);
                }
                z = true;
            }
        }
        if (z) {
            return builder.build();
        }
        return null;
    }

    private b2i buildProto() {
        mt9 mt9VarApplyOverlay;
        b2i b2iVarBuild = this.f64810b;
        if (b2iVarBuild == null) {
            synchronized (this.f64809a) {
                try {
                    b2iVarBuild = this.f64810b;
                    if (b2iVarBuild == null) {
                        b2iVarBuild = (this.f64812d.isEmpty() || (mt9VarApplyOverlay = applyOverlay(this.f64811c, wr5.f95194c, this.f64812d)) == null) ? this.f64811c : b2i.newBuilder().setMapValue(mt9VarApplyOverlay).build();
                        this.f64810b = b2iVarBuild;
                        this.f64811c = null;
                        this.f64812d.clear();
                    }
                } finally {
                }
            }
        }
        return b2iVarBuild;
    }

    private or5 extractFieldMask(mt9 mt9Var) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, b2i> entry : mt9Var.getFieldsMap().entrySet()) {
            wr5 wr5VarFromSingleSegment = wr5.fromSingleSegment(entry.getKey());
            if (s2i.isMapValue(entry.getValue())) {
                Set<wr5> mask = extractFieldMask(entry.getValue().getMapValue()).getMask();
                if (mask.isEmpty()) {
                    hashSet.add(wr5VarFromSingleSegment);
                } else {
                    Iterator<wr5> it = mask.iterator();
                    while (it.hasNext()) {
                        hashSet.add(wr5VarFromSingleSegment.append(it.next()));
                    }
                }
            } else {
                hashSet.add(wr5VarFromSingleSegment);
            }
        }
        return or5.fromSet(hashSet);
    }

    @hib
    private static b2i extractNestedValue(b2i b2iVar, wr5 wr5Var) {
        if (wr5Var.isEmpty()) {
            return b2iVar;
        }
        for (int i = 0; i < wr5Var.length() - 1; i++) {
            b2iVar = b2iVar.getMapValue().getFieldsOrDefault(wr5Var.getSegment(i), null);
            if (!s2i.isMapValue(b2iVar)) {
                return null;
            }
        }
        return b2iVar.getMapValue().getFieldsOrDefault(wr5Var.getLastSegment(), null);
    }

    public static nkb fromMap(Map<String, b2i> map) {
        return new nkb(b2i.newBuilder().setMapValue(mt9.newBuilder().putAllFields(map)).build());
    }

    private void setOverlay(wr5 wr5Var, @hib b2i b2iVar) {
        synchronized (this.f64809a) {
            try {
                if (this.f64810b != null) {
                    this.f64811c = this.f64810b;
                    this.f64810b = null;
                }
                setOverlay(this.f64812d, wr5Var, b2iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void delete(wr5 wr5Var) {
        r80.hardAssert(!wr5Var.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        setOverlay(wr5Var, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nkb) {
            return s2i.equals(buildProto(), ((nkb) obj).buildProto());
        }
        return false;
    }

    @hib
    public b2i get(wr5 wr5Var) {
        return extractNestedValue(buildProto(), wr5Var);
    }

    public or5 getFieldMask() {
        return extractFieldMask(buildProto().getMapValue());
    }

    public Map<String, b2i> getFieldsMap() {
        return buildProto().getMapValue().getFieldsMap();
    }

    public int hashCode() {
        return buildProto().hashCode();
    }

    public void set(wr5 wr5Var, b2i b2iVar) {
        r80.hardAssert(!wr5Var.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        setOverlay(wr5Var, b2iVar);
    }

    public void setAll(Map<wr5, b2i> map) {
        for (Map.Entry<wr5, b2i> entry : map.entrySet()) {
            wr5 key = entry.getKey();
            if (entry.getValue() == null) {
                delete(key);
            } else {
                set(key, entry.getValue());
            }
        }
    }

    @efb
    public String toString() {
        return "ObjectValue{internalValue=" + s2i.canonicalId(buildProto()) + '}';
    }

    @efb
    public nkb clone() {
        return new nkb(buildProto());
    }

    private static void setOverlay(Map<String, Object> map, wr5 wr5Var, @hib b2i b2iVar) {
        Map<String, Object> map2;
        for (int i = 0; i < wr5Var.length() - 1; i++) {
            String segment = wr5Var.getSegment(i);
            Object obj = map.get(segment);
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                if (obj instanceof b2i) {
                    b2i b2iVar2 = (b2i) obj;
                    if (b2iVar2.getValueTypeCase() == b2i.EnumC1713c.MAP_VALUE) {
                        HashMap map3 = new HashMap(b2iVar2.getMapValue().getFieldsMap());
                        map.put(segment, map3);
                        map = map3;
                    }
                }
                map2 = new HashMap<>();
                map.put(segment, map2);
            }
            map = map2;
        }
        map.put(wr5Var.getLastSegment(), b2iVar);
    }

    public nkb() {
        this(b2i.newBuilder().setMapValue(mt9.getDefaultInstance()).build());
    }
}
