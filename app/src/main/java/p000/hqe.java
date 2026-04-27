package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p000.as5;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class hqe {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f44598a = getGeneratedMessageClass();

    /* JADX INFO: renamed from: b */
    public static final rth<?, ?> f44599b = getUnknownFieldSetSchema();

    /* JADX INFO: renamed from: c */
    public static final rth<?, ?> f44600c = new vth();

    /* JADX INFO: renamed from: d */
    public static final int f44601d = 40;

    private hqe() {
    }

    /* JADX INFO: renamed from: A */
    public static int m12540A(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rk9) {
            rk9 rk9Var = (rk9) list;
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += j72.computeUInt64SizeNoTag(rk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += j72.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    @pp1
    /* JADX INFO: renamed from: B */
    public static <UT, UB> UB m12541B(Object obj, int i, List<Integer> list, w98.InterfaceC14498e<?> interfaceC14498e, UB ub, rth<UT, UB> rthVar) {
        if (interfaceC14498e == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC14498e.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) m12548I(obj, i, iIntValue, ub, rthVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (interfaceC14498e.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) m12548I(obj, i, iIntValue2, ub, rthVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    @pp1
    /* JADX INFO: renamed from: C */
    public static <UT, UB> UB m12542C(Object obj, int i, List<Integer> list, w98.InterfaceC14499f interfaceC14499f, UB ub, rth<UT, UB> rthVar) {
        if (interfaceC14499f == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC14499f.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) m12548I(obj, i, iIntValue, ub, rthVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!interfaceC14499f.isInRange(iIntValue2)) {
                    ub = (UB) m12548I(obj, i, iIntValue2, ub, rthVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: D */
    public static Object m12543D(Class<?> clazz, String name) {
        try {
            Field[] declaredFields = Class.forName(clazz.getName() + "$" + m12549J(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return dvh.m9445H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends as5.InterfaceC1587c<FT>> void m12544E(bj5<FT> schema, T message, T other) {
        as5<T> as5VarMo3201c = schema.mo3201c(other);
        if (as5VarMo3201c.m2645l()) {
            return;
        }
        schema.mo3202d(message).mergeFrom(as5VarMo3201c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m12545F(us9 mapFieldSchema, T message, T o, long offset) {
        dvh.m9471d0(message, offset, mapFieldSchema.mergeFrom(dvh.m9443F(message, offset), dvh.m9443F(o, offset)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m12546G(rth<UT, UB> schema, T message, T other) {
        schema.mo21536o(message, schema.mo21532k(schema.mo21528g(message), schema.mo21528g(other)));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m12547H(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @pp1
    /* JADX INFO: renamed from: I */
    public static <UT, UB> UB m12548I(Object obj, int i, int i2, UB ub, rth<UT, UB> rthVar) {
        if (ub == null) {
            ub = rthVar.mo21527f(obj);
        }
        rthVar.mo21526e(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: J */
    public static String m12549J(String name, boolean capNext) {
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
    public static int m12550a(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(size) : size * j72.computeBoolSize(fieldNumber, true);
    }

    /* JADX INFO: renamed from: b */
    public static int m12551b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m12552c(int fieldNumber, List<vj1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * j72.computeTagSize(fieldNumber);
        for (int i = 0; i < list.size(); i++) {
            iComputeTagSize += j72.computeBytesSizeNoTag(list.get(i));
        }
        return iComputeTagSize;
    }

    /* JADX INFO: renamed from: d */
    public static int m12553d(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12554e = m12554e(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12554e) : iM12554e + (size * j72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: e */
    public static int m12554e(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b68) {
            b68 b68Var = (b68) list;
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += j72.computeEnumSizeNoTag(b68Var.getInt(i));
                i++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += j72.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    /* JADX INFO: renamed from: f */
    public static int m12555f(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(size * 4) : size * j72.computeFixed32Size(fieldNumber, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m12556g(List<?> list) {
        return list.size() * 4;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static rth<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (rth) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m12557h(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(size * 8) : size * j72.computeFixed64Size(fieldNumber, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m12558i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m12559j(int fieldNumber, List<qsa> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i = 0; i < size; i++) {
            iComputeGroupSize += j72.computeGroupSize(fieldNumber, list.get(i));
        }
        return iComputeGroupSize;
    }

    /* JADX INFO: renamed from: k */
    public static int m12560k(int fieldNumber, List<qsa> list, tpe schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13756b = 0;
        for (int i = 0; i < size; i++) {
            iM13756b += j72.m13756b(fieldNumber, list.get(i), schema);
        }
        return iM13756b;
    }

    /* JADX INFO: renamed from: l */
    public static int m12561l(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12562m = m12562m(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12562m) : iM12562m + (size * j72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: m */
    public static int m12562m(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b68) {
            b68 b68Var = (b68) list;
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += j72.computeInt32SizeNoTag(b68Var.getInt(i));
                i++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += j72.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: n */
    public static int m12563n(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iM12564o = m12564o(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12564o) : iM12564o + (list.size() * j72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: o */
    public static int m12564o(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rk9) {
            rk9 rk9Var = (rk9) list;
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += j72.computeInt64SizeNoTag(rk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += j72.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    /* JADX INFO: renamed from: p */
    public static int m12565p(int fieldNumber, Object value, tpe schema) {
        return value instanceof px8 ? j72.computeLazyFieldSize(fieldNumber, (px8) value) : j72.m13759e(fieldNumber, (qsa) value, schema);
    }

    /* JADX INFO: renamed from: q */
    public static int m12566q(int fieldNumber, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = j72.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            iComputeTagSize += obj instanceof px8 ? j72.computeLazyFieldSizeNoTag((px8) obj) : j72.computeMessageSizeNoTag((qsa) obj);
        }
        return iComputeTagSize;
    }

    /* JADX INFO: renamed from: r */
    public static int m12567r(int fieldNumber, List<?> list, tpe schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = j72.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            iComputeTagSize += obj instanceof px8 ? j72.computeLazyFieldSizeNoTag((px8) obj) : j72.m13760f((qsa) obj, schema);
        }
        return iComputeTagSize;
    }

    public static void requireGeneratedMessage(Class<?> messageType) {
        Class<?> cls;
        if (!v27.class.isAssignableFrom(messageType) && (cls = f44598a) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m12568s(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12569t = m12569t(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12569t) : iM12569t + (size * j72.computeTagSize(fieldNumber));
    }

    public static boolean shouldUseTableSwitch(lr5[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    /* JADX INFO: renamed from: t */
    public static int m12569t(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b68) {
            b68 b68Var = (b68) list;
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += j72.computeSInt32SizeNoTag(b68Var.getInt(i));
                i++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += j72.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: u */
    public static int m12570u(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12571v = m12571v(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12571v) : iM12571v + (size * j72.computeTagSize(fieldNumber));
    }

    public static rth<?, ?> unknownFieldSetFullSchema() {
        return f44599b;
    }

    public static rth<?, ?> unknownFieldSetLiteSchema() {
        return f44600c;
    }

    /* JADX INFO: renamed from: v */
    public static int m12571v(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rk9) {
            rk9 rk9Var = (rk9) list;
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += j72.computeSInt64SizeNoTag(rk9Var.getLong(i));
                i++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += j72.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    /* JADX INFO: renamed from: w */
    public static int m12572w(int fieldNumber, List<?> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = j72.computeTagSize(fieldNumber) * size;
        if (list instanceof e39) {
            e39 e39Var = (e39) list;
            while (i < size) {
                Object raw = e39Var.getRaw(i);
                iComputeTagSize += raw instanceof vj1 ? j72.computeBytesSizeNoTag((vj1) raw) : j72.computeStringSizeNoTag((String) raw);
                i++;
            }
        } else {
            while (i < size) {
                Object obj = list.get(i);
                iComputeTagSize += obj instanceof vj1 ? j72.computeBytesSizeNoTag((vj1) obj) : j72.computeStringSizeNoTag((String) obj);
                i++;
            }
        }
        return iComputeTagSize;
    }

    public static void writeBool(int fieldNumber, boolean value, rsi writer) throws IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeBoolList(int fieldNumber, List<Boolean> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeBytes(int fieldNumber, vj1 value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, List<vj1> value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeDouble(int fieldNumber, double value, rsi writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, List<Double> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeEnum(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeEnumList(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeFixed32(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeFixed32List(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeFixed64(int fieldNumber, long value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeFixed64List(int fieldNumber, List<Long> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeFloat(int fieldNumber, float value, rsi writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeFloatList(int fieldNumber, List<Float> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeGroupList(int fieldNumber, List<?> value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeInt32(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeInt32List(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeInt64(int fieldNumber, long value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeInt64List(int fieldNumber, List<Long> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeLazyFieldList(int fieldNumber, List<?> value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((px8) it.next()).m19836b(writer, fieldNumber);
        }
    }

    public static void writeMessage(int fieldNumber, Object value, rsi writer) throws IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeMessageList(int fieldNumber, List<?> value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeSFixed32(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32List(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed64(int fieldNumber, long value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64List(int fieldNumber, List<Long> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeSInt32(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32List(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt64(int fieldNumber, long value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64List(int fieldNumber, List<Long> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeString(int fieldNumber, Object value, rsi writer) throws IOException {
        if (value instanceof String) {
            writeStringInternal(fieldNumber, (String) value, writer);
        } else {
            writeBytes(fieldNumber, (vj1) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, String value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeStringList(int fieldNumber, List<String> value, rsi writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeUInt32(int fieldNumber, int value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32List(int fieldNumber, List<Integer> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt64(int fieldNumber, long value, rsi writer) throws IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64List(int fieldNumber, List<Long> value, rsi writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    /* JADX INFO: renamed from: x */
    public static int m12573x(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12574y = m12574y(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12574y) : iM12574y + (size * j72.computeTagSize(fieldNumber));
    }

    /* JADX INFO: renamed from: y */
    public static int m12574y(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b68) {
            b68 b68Var = (b68) list;
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += j72.computeUInt32SizeNoTag(b68Var.getInt(i));
                i++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += j72.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    /* JADX INFO: renamed from: z */
    public static int m12575z(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12540A = m12540A(list);
        return packed ? j72.computeTagSize(fieldNumber) + j72.m13758d(iM12540A) : iM12540A + (size * j72.computeTagSize(fieldNumber));
    }

    public static void writeGroupList(int fieldNumber, List<?> value, rsi writer, tpe schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, rsi writer, tpe schema) throws IOException {
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
