package p000;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.C3597c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.b2i;
import p000.fs5;
import p000.m70;
import p000.mt9;
import p000.o70;
import p000.p7e;
import p000.uyh;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class xyh {

    /* JADX INFO: renamed from: a */
    public final qi3 f99766a;

    public xyh(qi3 qi3Var) {
        this.f99766a = qi3Var;
    }

    private nkb convertAndParseDocumentData(Object obj, uyh.C13797c c13797c) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        b2i data = parseData(pc3.convertToPlainJavaTypes(obj), c13797c);
        if (data.getValueTypeCase() == b2i.EnumC1713c.MAP_VALUE) {
            return new nkb(data);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + r0i.typeName(obj));
    }

    private List<b2i> parseArrayTransformElements(List<Object> list) {
        uyh.C13796b c13796b = new uyh.C13796b(uyh.EnumC13800f.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(convertAndParseFieldData(list.get(i), c13796b.rootContext().childContext(i)));
        }
        return arrayList;
    }

    @hib
    private b2i parseData(Object obj, uyh.C13797c c13797c) {
        if (obj instanceof Map) {
            return parseMap((Map) obj, c13797c);
        }
        if (obj instanceof fs5) {
            parseSentinelFieldValue((fs5) obj, c13797c);
            return null;
        }
        if (c13797c.getPath() != null) {
            c13797c.addToFieldMask(c13797c.getPath());
        }
        if (!(obj instanceof List)) {
            return parseScalarValue(obj, c13797c);
        }
        if (!c13797c.isArrayElement() || c13797c.getDataSource() == uyh.EnumC13800f.ArrayArgument) {
            return parseList((List) obj, c13797c);
        }
        throw c13797c.createError("Nested arrays are not supported");
    }

    private <T> b2i parseList(List<T> list, uyh.C13797c c13797c) {
        o70.C10211b c10211bNewBuilder = o70.newBuilder();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            b2i data = parseData(it.next(), c13797c.childContext(i));
            if (data == null) {
                data = b2i.newBuilder().setNullValue(bib.NULL_VALUE).build();
            }
            c10211bNewBuilder.addValues(data);
            i++;
        }
        return b2i.newBuilder().setArrayValue(c10211bNewBuilder).build();
    }

    private <K, V> b2i parseMap(Map<K, V> map, uyh.C13797c c13797c) {
        if (map.isEmpty()) {
            if (c13797c.getPath() != null && !c13797c.getPath().isEmpty()) {
                c13797c.addToFieldMask(c13797c.getPath());
            }
            return b2i.newBuilder().setMapValue(mt9.getDefaultInstance()).build();
        }
        mt9.C9519b c9519bNewBuilder = mt9.newBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw c13797c.createError(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
            }
            String str = (String) entry.getKey();
            b2i data = parseData(entry.getValue(), c13797c.childContext(str));
            if (data != null) {
                c9519bNewBuilder.putFields(str, data);
            }
        }
        return b2i.newBuilder().setMapValue(c9519bNewBuilder).build();
    }

    private b2i parseScalarValue(Object obj, uyh.C13797c c13797c) {
        if (obj == null) {
            return b2i.newBuilder().setNullValue(bib.NULL_VALUE).build();
        }
        if (obj instanceof Integer) {
            return b2i.newBuilder().setIntegerValue(((Integer) obj).intValue()).build();
        }
        if (obj instanceof Long) {
            return b2i.newBuilder().setIntegerValue(((Long) obj).longValue()).build();
        }
        if (obj instanceof Float) {
            return b2i.newBuilder().setDoubleValue(((Float) obj).doubleValue()).build();
        }
        if (obj instanceof Double) {
            return b2i.newBuilder().setDoubleValue(((Double) obj).doubleValue()).build();
        }
        if (obj instanceof Boolean) {
            return b2i.newBuilder().setBooleanValue(((Boolean) obj).booleanValue()).build();
        }
        if (obj instanceof String) {
            return b2i.newBuilder().setStringValue((String) obj).build();
        }
        if (obj instanceof Date) {
            return parseTimestamp(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return parseTimestamp((Timestamp) obj);
        }
        if (obj instanceof d37) {
            d37 d37Var = (d37) obj;
            return b2i.newBuilder().setGeoPointValue(ju8.newBuilder().setLatitude(d37Var.getLatitude()).setLongitude(d37Var.getLongitude())).build();
        }
        if (obj instanceof a61) {
            return b2i.newBuilder().setBytesValue(((a61) obj).toByteString()).build();
        }
        if (obj instanceof C3597c) {
            C3597c c3597c = (C3597c) obj;
            if (c3597c.getFirestore() != null) {
                qi3 qi3VarM6748p = c3597c.getFirestore().m6748p();
                if (!qi3VarM6748p.equals(this.f99766a)) {
                    throw c13797c.createError(String.format("Document reference is for database %s/%s but should be for database %s/%s", qi3VarM6748p.getProjectId(), qi3VarM6748p.getDatabaseId(), this.f99766a.getProjectId(), this.f99766a.getDatabaseId()));
                }
            }
            return b2i.newBuilder().setReferenceValue(String.format("projects/%s/databases/%s/documents/%s", this.f99766a.getProjectId(), this.f99766a.getDatabaseId(), c3597c.getPath())).build();
        }
        if (obj instanceof s3i) {
            return parseVectorValue((s3i) obj, c13797c);
        }
        if (obj.getClass().isArray()) {
            throw c13797c.createError("Arrays are not supported; use a List instead");
        }
        throw c13797c.createError("Unsupported type: " + r0i.typeName(obj));
    }

    private void parseSentinelFieldValue(fs5 fs5Var, uyh.C13797c c13797c) {
        if (!c13797c.isWrite()) {
            throw c13797c.createError(String.format("%s() can only be used with set() and update()", fs5Var.mo11126a()));
        }
        if (c13797c.getPath() == null) {
            throw c13797c.createError(String.format("%s() is not currently supported inside arrays", fs5Var.mo11126a()));
        }
        if (fs5Var instanceof fs5.C5947c) {
            if (c13797c.getDataSource() == uyh.EnumC13800f.MergeSet) {
                c13797c.addToFieldMask(c13797c.getPath());
                return;
            } else {
                if (c13797c.getDataSource() != uyh.EnumC13800f.Update) {
                    throw c13797c.createError("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                r80.hardAssert(c13797c.getPath().length() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw c13797c.createError("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (fs5Var instanceof fs5.C5949e) {
            c13797c.addToFieldTransforms(c13797c.getPath(), a4f.getInstance());
            return;
        }
        if (fs5Var instanceof fs5.C5946b) {
            c13797c.addToFieldTransforms(c13797c.getPath(), new m70.C9167b(parseArrayTransformElements(((fs5.C5946b) fs5Var).m11128b())));
        } else if (fs5Var instanceof fs5.C5945a) {
            c13797c.addToFieldTransforms(c13797c.getPath(), new m70.C9166a(parseArrayTransformElements(((fs5.C5945a) fs5Var).m11127b())));
        } else {
            if (!(fs5Var instanceof fs5.C5948d)) {
                throw r80.fail("Unknown FieldValue type: %s", r0i.typeName(fs5Var));
            }
            c13797c.addToFieldTransforms(c13797c.getPath(), new jjb(parseQueryValue(((fs5.C5948d) fs5Var).m11129b())));
        }
    }

    private b2i parseTimestamp(Timestamp timestamp) {
        return b2i.newBuilder().setTimestampValue(f2h.newBuilder().setSeconds(timestamp.getSeconds()).setNanos((timestamp.getNanoseconds() / 1000) * 1000)).build();
    }

    private b2i parseVectorValue(s3i s3iVar, uyh.C13797c c13797c) {
        mt9.C9519b c9519bNewBuilder = mt9.newBuilder();
        c9519bNewBuilder.putFields("__type__", s2i.f80463g);
        c9519bNewBuilder.putFields("value", parseData(s3iVar.m21697a(), c13797c));
        return b2i.newBuilder().setMapValue(c9519bNewBuilder).build();
    }

    public b2i convertAndParseFieldData(Object obj, uyh.C13797c c13797c) {
        return parseData(pc3.convertToPlainJavaTypes(obj), c13797c);
    }

    public uyh.C13798d parseMergeData(Object obj, @hib or5 or5Var) {
        uyh.C13796b c13796b = new uyh.C13796b(uyh.EnumC13800f.MergeSet);
        nkb nkbVarConvertAndParseDocumentData = convertAndParseDocumentData(obj, c13796b.rootContext());
        if (or5Var == null) {
            return c13796b.toMergeData(nkbVarConvertAndParseDocumentData);
        }
        for (wr5 wr5Var : or5Var.getMask()) {
            if (!c13796b.contains(wr5Var)) {
                throw new IllegalArgumentException("Field '" + wr5Var.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return c13796b.toMergeData(nkbVarConvertAndParseDocumentData, or5Var);
    }

    public b2i parseQueryValue(Object obj) {
        return parseQueryValue(obj, false);
    }

    public uyh.C13798d parseSetData(Object obj) {
        uyh.C13796b c13796b = new uyh.C13796b(uyh.EnumC13800f.Set);
        return c13796b.toSetData(convertAndParseDocumentData(obj, c13796b.rootContext()));
    }

    public uyh.C13799e parseUpdateData(Map<String, Object> map) {
        x7d.checkNotNull(map, "Provided update data must not be null.");
        uyh.C13796b c13796b = new uyh.C13796b(uyh.EnumC13800f.Update);
        uyh.C13797c c13797cRootContext = c13796b.rootContext();
        nkb nkbVar = new nkb();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            wr5 wr5VarM25424b = xr5.m25422a(entry.getKey()).m25424b();
            Object value = entry.getValue();
            if (value instanceof fs5.C5947c) {
                c13797cRootContext.addToFieldMask(wr5VarM25424b);
            } else {
                b2i b2iVarConvertAndParseFieldData = convertAndParseFieldData(value, c13797cRootContext.childContext(wr5VarM25424b));
                if (b2iVarConvertAndParseFieldData != null) {
                    c13797cRootContext.addToFieldMask(wr5VarM25424b);
                    nkbVar.set(wr5VarM25424b, b2iVarConvertAndParseFieldData);
                }
            }
        }
        return c13796b.toUpdateData(nkbVar);
    }

    public b2i parseQueryValue(Object obj, boolean z) {
        uyh.C13796b c13796b = new uyh.C13796b(z ? uyh.EnumC13800f.ArrayArgument : uyh.EnumC13800f.Argument);
        b2i b2iVarConvertAndParseFieldData = convertAndParseFieldData(obj, c13796b.rootContext());
        r80.hardAssert(b2iVarConvertAndParseFieldData != null, "Parsed data should not be null.", new Object[0]);
        r80.hardAssert(c13796b.getFieldTransforms().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return b2iVarConvertAndParseFieldData;
    }

    public uyh.C13799e parseUpdateData(List<Object> list) {
        wr5 wr5VarM25424b;
        r80.hardAssert(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        uyh.C13796b c13796b = new uyh.C13796b(uyh.EnumC13800f.Update);
        uyh.C13797c c13797cRootContext = c13796b.rootContext();
        nkb nkbVar = new nkb();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z = next instanceof String;
            r80.hardAssert(z || (next instanceof xr5), "Expected argument to be String or FieldPath.", new Object[0]);
            if (z) {
                wr5VarM25424b = xr5.m25422a((String) next).m25424b();
            } else {
                wr5VarM25424b = ((xr5) next).m25424b();
            }
            if (next2 instanceof fs5.C5947c) {
                c13797cRootContext.addToFieldMask(wr5VarM25424b);
            } else {
                b2i b2iVarConvertAndParseFieldData = convertAndParseFieldData(next2, c13797cRootContext.childContext(wr5VarM25424b));
                if (b2iVarConvertAndParseFieldData != null) {
                    c13797cRootContext.addToFieldMask(wr5VarM25424b);
                    nkbVar.set(wr5VarM25424b, b2iVarConvertAndParseFieldData);
                }
            }
        }
        return c13796b.toUpdateData(nkbVar);
    }
}
