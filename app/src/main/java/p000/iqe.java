package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p000.v98;
import p000.zr5;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class iqe {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f47974a = getGeneratedMessageClass();

    /* JADX INFO: renamed from: b */
    public static final sth<?, ?> f47975b = getUnknownFieldSetSchema();

    /* JADX INFO: renamed from: c */
    public static final sth<?, ?> f47976c = new wth();

    /* JADX INFO: renamed from: d */
    public static final int f47977d = 40;

    private iqe() {
    }

    /* JADX INFO: renamed from: A */
    public static int m13305A(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sk9) {
            sk9 sk9Var = (sk9) list;
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += i72.computeUInt64SizeNoTag(sk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += i72.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    @qp1
    /* JADX INFO: renamed from: B */
    public static <UT, UB> UB m13306B(Object obj, int i, List<Integer> list, v98.InterfaceC13948d<?> interfaceC13948d, UB ub, sth<UT, UB> sthVar) {
        if (interfaceC13948d == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC13948d.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) m13313I(obj, i, iIntValue, ub, sthVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (interfaceC13948d.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) m13313I(obj, i, iIntValue2, ub, sthVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    @qp1
    /* JADX INFO: renamed from: C */
    public static <UT, UB> UB m13307C(Object obj, int i, List<Integer> list, v98.InterfaceC13949e interfaceC13949e, UB ub, sth<UT, UB> sthVar) {
        if (interfaceC13949e == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC13949e.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) m13313I(obj, i, iIntValue, ub, sthVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!interfaceC13949e.isInRange(iIntValue2)) {
                    ub = (UB) m13313I(obj, i, iIntValue2, ub, sthVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: D */
    public static Object m13308D(Class<?> clazz, String name) {
        try {
            Field[] declaredFields = Class.forName(clazz.getName() + "$" + m13314J(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return evh.m10254H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends zr5.InterfaceC16225c<FT>> void m13309E(cj5<FT> schema, T message, T other) {
        zr5<T> zr5VarMo3992c = schema.mo3992c(other);
        if (zr5VarMo3992c.m27048l()) {
            return;
        }
        schema.mo3993d(message).mergeFrom(zr5VarMo3992c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m13310F(vs9 mapFieldSchema, T message, T o, long offset) {
        evh.m10280d0(message, offset, mapFieldSchema.mergeFrom(evh.m10252F(message, offset), evh.m10252F(o, offset)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m13311G(sth<UT, UB> schema, T message, T other) {
        schema.mo22242o(message, schema.mo22238k(schema.mo22234g(message), schema.mo22234g(other)));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m13312H(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @qp1
    /* JADX INFO: renamed from: I */
    public static <UT, UB> UB m13313I(Object obj, int i, int i2, UB ub, sth<UT, UB> sthVar) {
        if (ub == null) {
            ub = sthVar.mo22233f(obj);
        }
        sthVar.mo22232e(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: J */
    public static String m13314J(String name, boolean capNext) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char cCharAt = name.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    capNext = true;
                } else if (i != 0 || capNext) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (capNext) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            capNext = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m13315a(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(size) : size * i72.computeBoolSize(fieldNumber, true);
    }

    /* JADX INFO: renamed from: b */
    public static int m13316b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m13317c(int fieldNumber, List<wj1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * i72.computeTagSize(fieldNumber);
        for (int i = 0; i < list.size(); i++) {
            iComputeTagSize += i72.computeBytesSizeNoTag(list.get(i));
        }
        return iComputeTagSize;
    }

    /* JADX INFO: renamed from: d */
    public static int m13318d(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13319e = m13319e(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13319e) : iM13319e + (size * i72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: e */
    public static int m13319e(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c68) {
            c68 c68Var = (c68) list;
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += i72.computeEnumSizeNoTag(c68Var.getInt(i));
                i++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += i72.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    /* JADX INFO: renamed from: f */
    public static int m13320f(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(size * 4) : size * i72.computeFixed32Size(fieldNumber, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m13321g(List<?> list) {
        return list.size() * 4;
    }

    private static Class<?> getGeneratedMessageClass() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static sth<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (sth) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m13322h(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(size * 8) : size * i72.computeFixed64Size(fieldNumber, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m13323i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m13324j(int fieldNumber, List<psa> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += i72.computeGroupSize(fieldNumber, list.get(i));
        }
        return iComputeGroupSize;
    }

    /* JADX INFO: renamed from: k */
    public static int m13325k(int fieldNumber, List<psa> list, upe schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12824b = 0;
        for (int i = 0; i < size; i++) {
            iM12824b += i72.m12824b(fieldNumber, list.get(i), schema);
        }
        return iM12824b;
    }

    /* JADX INFO: renamed from: l */
    public static int m13326l(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13327m = m13327m(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13327m) : iM13327m + (size * i72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: m */
    public static int m13327m(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c68) {
            c68 c68Var = (c68) list;
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += i72.computeInt32SizeNoTag(c68Var.getInt(i));
                i++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += i72.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: n */
    public static int m13328n(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iM13329o = m13329o(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13329o) : iM13329o + (list.size() * i72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: o */
    public static int m13329o(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sk9) {
            sk9 sk9Var = (sk9) list;
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += i72.computeInt64SizeNoTag(sk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += i72.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    /* JADX INFO: renamed from: p */
    public static int m13330p(int fieldNumber, Object value, upe schema) {
        return value instanceof qx8 ? i72.computeLazyFieldSize(fieldNumber, (qx8) value) : i72.m12827e(fieldNumber, (psa) value, schema);
    }

    /* JADX INFO: renamed from: q */
    public static int m13331q(int fieldNumber, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = i72.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            iComputeTagSize += obj instanceof qx8 ? i72.computeLazyFieldSizeNoTag((qx8) obj) : i72.computeMessageSizeNoTag((psa) obj);
        }
        return iComputeTagSize;
    }

    /* JADX INFO: renamed from: r */
    public static int m13332r(int fieldNumber, List<?> list, upe schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = i72.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            iComputeTagSize += obj instanceof qx8 ? i72.computeLazyFieldSizeNoTag((qx8) obj) : i72.m12828f((psa) obj, schema);
        }
        return iComputeTagSize;
    }

    public static void requireGeneratedMessage(Class<?> messageType) {
        Class<?> cls;
        if (!u27.class.isAssignableFrom(messageType) && !lhd.f57633d && (cls = f47974a) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m13333s(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13334t = m13334t(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13334t) : iM13334t + (size * i72.computeTagSize(fieldNumber));
    }

    public static boolean shouldUseTableSwitch(jr5[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    /* JADX INFO: renamed from: t */
    public static int m13334t(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c68) {
            c68 c68Var = (c68) list;
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += i72.computeSInt32SizeNoTag(c68Var.getInt(i));
                i++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += i72.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: u */
    public static int m13335u(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13336v = m13336v(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13336v) : iM13336v + (size * i72.computeTagSize(fieldNumber));
    }

    public static sth<?, ?> unknownFieldSetFullSchema() {
        return f47975b;
    }

    public static sth<?, ?> unknownFieldSetLiteSchema() {
        return f47976c;
    }

    /* JADX INFO: renamed from: v */
    public static int m13336v(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sk9) {
            sk9 sk9Var = (sk9) list;
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += i72.computeSInt64SizeNoTag(sk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += i72.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    /* JADX INFO: renamed from: w */
    public static int m13337w(int fieldNumber, List<?> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = i72.computeTagSize(fieldNumber) * size;
        if (list instanceof f39) {
            f39 f39Var = (f39) list;
            while (i < size) {
                Object raw = f39Var.getRaw(i);
                iComputeTagSize += raw instanceof wj1 ? i72.computeBytesSizeNoTag((wj1) raw) : i72.computeStringSizeNoTag((String) raw);
                i++;
            }
        } else {
            while (i < size) {
                Object obj = list.get(i);
                iComputeTagSize += obj instanceof wj1 ? i72.computeBytesSizeNoTag((wj1) obj) : i72.computeStringSizeNoTag((String) obj);
                i++;
            }
        }
        return iComputeTagSize;
    }

    public static void writeBool(int fieldNumber, boolean value, qsi writer) throws IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeBoolList(int fieldNumber, List<Boolean> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeBytes(int fieldNumber, wj1 value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, List<wj1> value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeDouble(int fieldNumber, double value, qsi writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, List<Double> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeEnum(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeEnumList(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeFixed32(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeFixed32List(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeFixed64(int fieldNumber, long value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeFixed64List(int fieldNumber, List<Long> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeFloat(int fieldNumber, float value, qsi writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeFloatList(int fieldNumber, List<Float> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeGroupList(int fieldNumber, List<?> value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeInt32(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeInt32List(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeInt64(int fieldNumber, long value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeInt64List(int fieldNumber, List<Long> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeLazyFieldList(int fieldNumber, List<?> value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((qx8) it.next()).m20705b(writer, fieldNumber);
        }
    }

    public static void writeMessage(int fieldNumber, Object value, qsi writer) throws IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeMessageList(int fieldNumber, List<?> value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeSFixed32(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32List(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed64(int fieldNumber, long value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64List(int fieldNumber, List<Long> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeSInt32(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32List(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt64(int fieldNumber, long value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64List(int fieldNumber, List<Long> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeString(int fieldNumber, Object value, qsi writer) throws IOException {
        if (value instanceof String) {
            writeStringInternal(fieldNumber, (String) value, writer);
        } else {
            writeBytes(fieldNumber, (wj1) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, String value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeStringList(int fieldNumber, List<String> value, qsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeUInt32(int fieldNumber, int value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32List(int fieldNumber, List<Integer> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt64(int fieldNumber, long value, qsi writer) throws IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64List(int fieldNumber, List<Long> value, qsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    /* JADX INFO: renamed from: x */
    public static int m13338x(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13339y = m13339y(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13339y) : iM13339y + (size * i72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: y */
    public static int m13339y(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c68) {
            c68 c68Var = (c68) list;
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += i72.computeUInt32SizeNoTag(c68Var.getInt(i));
                i++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += i72.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: z */
    public static int m13340z(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13305A = m13305A(list);
        return packed ? i72.computeTagSize(fieldNumber) + i72.m12826d(iM13305A) : iM13305A + (size * i72.computeTagSize(fieldNumber));
    }

    public static void writeGroupList(int fieldNumber, List<?> value, qsi writer, upe schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, qsi writer, upe schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static boolean shouldUseTableSwitch(int lo, int hi, int numFields) {
        if (hi < 40) {
            return true;
        }
        long j = ((long) hi) - ((long) lo);
        long j2 = numFields;
        return j + 10 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }
}
