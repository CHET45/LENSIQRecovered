package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.d60;
import p000.hpi;
import p000.os9;
import p000.rsi;
import p000.vj1;
import p000.w98;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class wsa<T> implements tpe<T> {

    /* JADX INFO: renamed from: A */
    public static final int f95289A = 256;

    /* JADX INFO: renamed from: B */
    public static final int f95290B = 512;

    /* JADX INFO: renamed from: C */
    public static final int f95291C = 1024;

    /* JADX INFO: renamed from: D */
    public static final int f95292D = 2048;

    /* JADX INFO: renamed from: E */
    public static final int f95293E = 4096;

    /* JADX INFO: renamed from: F */
    public static final int f95294F = 51;

    /* JADX INFO: renamed from: r */
    public static final int f95296r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f95297s = 20;

    /* JADX INFO: renamed from: t */
    public static final int f95298t = 1048575;

    /* JADX INFO: renamed from: u */
    public static final int f95299u = 267386880;

    /* JADX INFO: renamed from: v */
    public static final int f95300v = 268435456;

    /* JADX INFO: renamed from: w */
    public static final int f95301w = 536870912;

    /* JADX INFO: renamed from: x */
    public static final int f95302x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public static final int f95303y = 1048575;

    /* JADX INFO: renamed from: a */
    public final int[] f95305a;

    /* JADX INFO: renamed from: b */
    public final Object[] f95306b;

    /* JADX INFO: renamed from: c */
    public final int f95307c;

    /* JADX INFO: renamed from: d */
    public final int f95308d;

    /* JADX INFO: renamed from: e */
    public final qsa f95309e;

    /* JADX INFO: renamed from: f */
    public final boolean f95310f;

    /* JADX INFO: renamed from: g */
    public final boolean f95311g;

    /* JADX INFO: renamed from: h */
    public final hhd f95312h;

    /* JADX INFO: renamed from: i */
    public final boolean f95313i;

    /* JADX INFO: renamed from: j */
    public final int[] f95314j;

    /* JADX INFO: renamed from: k */
    public final int f95315k;

    /* JADX INFO: renamed from: l */
    public final int f95316l;

    /* JADX INFO: renamed from: m */
    public final mcb f95317m;

    /* JADX INFO: renamed from: n */
    public final y89 f95318n;

    /* JADX INFO: renamed from: o */
    public final rth<?, ?> f95319o;

    /* JADX INFO: renamed from: p */
    public final bj5<?> f95320p;

    /* JADX INFO: renamed from: q */
    public final us9 f95321q;

    /* JADX INFO: renamed from: z */
    public static final int[] f95304z = new int[0];

    /* JADX INFO: renamed from: G */
    public static final Unsafe f95295G = dvh.m9446I();

    /* JADX INFO: renamed from: wsa$a */
    public static /* synthetic */ class C14771a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95322a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f95322a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44484H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44489Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44496c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44483F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44493Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44482C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44487M1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44497d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44492Y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44500m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44491X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44498e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44499f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44488N.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44490V1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44494Z1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f95322a[hpi.EnumC6968b.f44485L.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private wsa(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, qsa defaultInstance, hhd syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, mcb newInstanceSchema, y89 listFieldSchema, rth<?, ?> unknownFieldSchema, bj5<?> extensionSchema, us9 mapFieldSchema) {
        this.f95305a = buffer;
        this.f95306b = objects;
        this.f95307c = minFieldNumber;
        this.f95308d = maxFieldNumber;
        this.f95311g = defaultInstance instanceof v27;
        this.f95312h = syntax;
        this.f95310f = extensionSchema != null && extensionSchema.mo3203e(defaultInstance);
        this.f95313i = useCachedSizeField;
        this.f95314j = intArray;
        this.f95315k = checkInitialized;
        this.f95316l = mapFieldPositions;
        this.f95317m = newInstanceSchema;
        this.f95318n = listFieldSchema;
        this.f95319o = unknownFieldSchema;
        this.f95320p = extensionSchema;
        this.f95309e = defaultInstance;
        this.f95321q = mapFieldSchema;
    }

    /* JADX INFO: renamed from: a */
    public static tth m24802a(Object message) {
        v27 v27Var = (v27) message;
        tth tthVar = v27Var.unknownFields;
        if (tthVar != tth.getDefaultInstance()) {
            return tthVar;
        }
        tth tthVarM22836g = tth.m22836g();
        v27Var.unknownFields = tthVarM22836g;
        return tthVarM22836g;
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return dvh.m9485q(message, offset);
    }

    /* JADX INFO: renamed from: c */
    public static <T> wsa<T> m24803c(Class<T> messageClass, ksa messageInfo, mcb newInstanceSchema, y89 listFieldSchema, rth<?, ?> unknownFieldSchema, bj5<?> extensionSchema, us9 mapFieldSchema) {
        return messageInfo instanceof spd ? m24805e((spd) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : m24804d((wag) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static void checkMutable(Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    /* JADX INFO: renamed from: d */
    public static <T> wsa<T> m24804d(wag messageInfo, mcb newInstanceSchema, y89 listFieldSchema, rth<?, ?> unknownFieldSchema, bj5<?> extensionSchema, us9 mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        lr5[] fields = messageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (lr5 lr5Var : fields) {
            if (lr5Var.getType() == ds5.f30541J2) {
                i2++;
            } else if (lr5Var.getType().m9340id() >= 18 && lr5Var.getType().m9340id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = f95304z;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            lr5 lr5Var2 = fields[i4];
            int fieldNumber3 = lr5Var2.getFieldNumber();
            storeFieldData(lr5Var2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (lr5Var2.getType() == ds5.f30541J2) {
                iArr2[i7] = i5;
                i7++;
            } else {
                if (lr5Var2.getType().m9340id() >= 18 && lr5Var2.getType().m9340id() <= 49) {
                    i = i5;
                    iArr3[i8] = (int) dvh.m9451N(lr5Var2.getField());
                    i8++;
                }
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = f95304z;
        }
        if (iArr3 == null) {
            iArr3 = f95304z;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new wsa<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, os9.C10633b<K, V> metadata, Map<K, V> target, d60.C4625b registers) throws IOException {
        int iM8896H;
        int iM8897I = d60.m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0 || i > limit - iM8897I) {
            throw ce8.m3928l();
        }
        int i2 = iM8897I + i;
        Object obj = metadata.f68568b;
        Object obj2 = metadata.f68570d;
        while (iM8897I < i2) {
            int i3 = iM8897I + 1;
            int i4 = data[iM8897I];
            if (i4 < 0) {
                iM8896H = d60.m8896H(i4, data, i3, registers);
                i4 = registers.f28494a;
            } else {
                iM8896H = i3;
            }
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i5 != 1) {
                if (i5 == 2 && i6 == metadata.f68569c.getWireType()) {
                    iM8897I = decodeMapEntryValue(data, iM8896H, limit, metadata.f68569c, metadata.f68570d.getClass(), registers);
                    obj2 = registers.f28496c;
                } else {
                    iM8897I = d60.m8904P(i4, data, iM8896H, limit, registers);
                }
            } else if (i6 == metadata.f68567a.getWireType()) {
                iM8897I = decodeMapEntryValue(data, iM8896H, limit, metadata.f68567a, null, registers);
                obj = registers.f28496c;
            } else {
                iM8897I = d60.m8904P(i4, data, iM8896H, limit, registers);
            }
        }
        if (iM8897I != i2) {
            throw ce8.m3925h();
        }
        target.put(obj, obj2);
        return i2;
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, hpi.EnumC6968b fieldType, Class<?> messageType, d60.C4625b registers) throws IOException {
        switch (C14771a.f95322a[fieldType.ordinal()]) {
            case 1:
                int iM8900L = d60.m8900L(data, position, registers);
                registers.f28496c = Boolean.valueOf(registers.f28495b != 0);
                return iM8900L;
            case 2:
                return d60.m8906b(data, position, registers);
            case 3:
                registers.f28496c = Double.valueOf(d60.m8908d(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.f28496c = Integer.valueOf(d60.m8912h(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.f28496c = Long.valueOf(d60.m8914j(data, position));
                return position + 8;
            case 8:
                registers.f28496c = Float.valueOf(d60.m8916l(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iM8897I = d60.m8897I(data, position, registers);
                registers.f28496c = Integer.valueOf(registers.f28494a);
                return iM8897I;
            case 12:
            case 13:
                int iM8900L2 = d60.m8900L(data, position, registers);
                registers.f28496c = Long.valueOf(registers.f28495b);
                return iM8900L2;
            case 14:
                return d60.m8920p(khd.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int iM8897I2 = d60.m8897I(data, position, registers);
                registers.f28496c = Integer.valueOf(f72.decodeZigZag32(registers.f28494a));
                return iM8897I2;
            case 16:
                int iM8900L3 = d60.m8900L(data, position, registers);
                registers.f28496c = Long.valueOf(f72.decodeZigZag64(registers.f28495b));
                return iM8900L3;
            case 17:
                return d60.m8894F(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T message, long offset) {
        return dvh.m9490v(message, offset);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0267  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> p000.wsa<T> m24805e(p000.spd r31, p000.mcb r32, p000.y89 r33, p000.rth<?, ?> r34, p000.bj5<?> r35, p000.us9 r36) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.m24805e(spd, mcb, y89, rth, bj5, us9):wsa");
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, rth<UT, UB> rthVar, Object obj2) {
        w98.InterfaceC14499f enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object objM9443F = dvh.m9443F(obj, offset(typeAndOffsetAt(i)));
        return (objM9443F == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.f95321q.forMutableMapData(objM9443F), enumFieldVerifier, ub, rthVar, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, w98.InterfaceC14499f interfaceC14499f, UB ub, rth<UT, UB> rthVar, Object obj) {
        os9.C10633b<?, ?> c10633bForMapMetadata = this.f95321q.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC14499f.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = rthVar.mo21527f(obj);
                }
                vj1.C14110h c14110hM24016g = vj1.m24016g(os9.m18968a(c10633bForMapMetadata, next.getKey(), next.getValue()));
                try {
                    os9.m18971e(c14110hM24016g.getCodedOutput(), c10633bForMapMetadata, next.getKey(), next.getValue());
                    rthVar.mo21525d(ub, i2, c14110hM24016g.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T message, long offset) {
        return dvh.m9492x(message, offset);
    }

    private w98.InterfaceC14499f getEnumFieldVerifier(int pos) {
        return (w98.InterfaceC14499f) this.f95306b[((pos / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int pos) {
        return this.f95306b[(pos / 3) * 2];
    }

    private tpe getMessageFieldSchema(int pos) {
        int i = (pos / 3) * 2;
        tpe tpeVar = (tpe) this.f95306b[i];
        if (tpeVar != null) {
            return tpeVar;
        }
        tpe<T> tpeVarSchemaFor = khd.getInstance().schemaFor((Class) this.f95306b[i + 1]);
        this.f95306b[i] = tpeVarSchemaFor;
        return tpeVarSchemaFor;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(rth<UT, UB> schema, T message) {
        return schema.mo21529h(schema.mo21528g(message));
    }

    private static <T> int intAt(T message, long offset) {
        return dvh.m9438A(message, offset);
    }

    private static boolean isEnforceUtf8(int value) {
        return (value & 536870912) != 0;
    }

    private boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        return presenceFieldOffset == 1048575 ? isFieldPresent(message, pos) : (presenceField & presenceMask) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object message, int typeAndOffset, int pos) {
        List list = (List) dvh.m9443F(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        tpe messageFieldSchema = getMessageFieldSchema(pos);
        for (int i = 0; i < list.size(); i++) {
            if (!messageFieldSchema.isInitialized(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [tpe] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> mapForMapData = this.f95321q.forMapData(dvh.m9443F(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f95321q.forMapMetadata(getMapFieldDefaultEntry(i2)).f68569c.getJavaType() != hpi.EnumC6969c.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = khd.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof v27) {
            return ((v27) message).m23725E();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return dvh.m9438A(message, jPresenceMaskAndOffsetAt) == dvh.m9438A(other, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return dvh.m9438A(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    private static boolean isRequired(int value) {
        return (value & 268435456) != 0;
    }

    private static <T> long longAt(T message, long offset) {
        return dvh.m9441D(message, offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r0 = r18.f95315k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0 >= r18.f95316l) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.f95314j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r4 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r7.mo21535n(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #2 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b1 A[LOOP:4: B:196:0x06ad->B:198:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends p000.as5.InterfaceC1587c<ET>> void mergeFromHelper(p000.rth<UT, UB> r19, p000.bj5<ET> r20, T r21, p000.hrd r22, p000.zi5 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.mergeFromHelper(rth, bj5, java.lang.Object, hrd, zi5):void");
    }

    private final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, zi5 extensionRegistry, hrd reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(pos));
        Object objM9443F = dvh.m9443F(message, jOffset);
        if (objM9443F == null) {
            objM9443F = this.f95321q.newMapField(mapDefaultEntry);
            dvh.m9471d0(message, jOffset, objM9443F);
        } else if (this.f95321q.isImmutable(objM9443F)) {
            Object objNewMapField = this.f95321q.newMapField(mapDefaultEntry);
            this.f95321q.mergeFrom(objNewMapField, objM9443F);
            dvh.m9471d0(message, jOffset, objNewMapField);
            objM9443F = objNewMapField;
        }
        reader.readMap(this.f95321q.forMutableMapData(objM9443F), this.f95321q.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = f95295G;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            tpe messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int iNumberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, iNumberAt, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = f95295G;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            tpe messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, iNumberAt, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setOneofPresent(targetParent, iNumberAt, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(pos);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    dvh.m9457T(message, jOffset, dvh.m9490v(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    dvh.m9459V(message, jOffset, dvh.m9492x(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    dvh.m9467b0(message, jOffset, dvh.m9441D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    dvh.m9467b0(message, jOffset, dvh.m9441D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    dvh.m9467b0(message, jOffset, dvh.m9441D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    dvh.m9452O(message, jOffset, dvh.m9485q(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    dvh.m9471d0(message, jOffset, dvh.m9443F(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    dvh.m9471d0(message, jOffset, dvh.m9443F(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    dvh.m9467b0(message, jOffset, dvh.m9441D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    dvh.m9462Y(message, jOffset, dvh.m9438A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    dvh.m9467b0(message, jOffset, dvh.m9441D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f95318n.mo25701d(message, other, jOffset);
                break;
            case 50:
                hqe.m12545F(this.f95321q, message, other, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    dvh.m9471d0(message, jOffset, dvh.m9443F(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case 60:
                mergeOneofMessage(message, other, pos);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    dvh.m9471d0(message, jOffset, dvh.m9443F(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T message, int pos) {
        tpe messageFieldSchema = getMessageFieldSchema(pos);
        long jOffset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = f95295G.getObject(message, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        tpe messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = f95295G.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private int numberAt(int pos) {
        return this.f95305a[pos];
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) dvh.m9443F(message, offset)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) dvh.m9443F(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) dvh.m9443F(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) dvh.m9443F(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((Long) dvh.m9443F(message, offset)).longValue();
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, d60.C4625b registers) throws IOException {
        Unsafe unsafe = f95295G;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.f95321q.isImmutable(object)) {
            Object objNewMapField = this.f95321q.newMapField(mapFieldDefaultEntry);
            this.f95321q.mergeFrom(objNewMapField, object);
            unsafe.putObject(message, fieldOffset, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(data, position, limit, this.f95321q.forMapMetadata(mapFieldDefaultEntry), this.f95321q.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, d60.C4625b registers) throws IOException {
        Unsafe unsafe = f95295G;
        long j = this.f95305a[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(d60.m8908d(data, position)));
                int i = position + 8;
                unsafe.putInt(message, j, number);
                return i;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(d60.m8916l(data, position)));
                int i2 = position + 4;
                unsafe.putInt(message, j, number);
                return i2;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int iM8900L = d60.m8900L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.f28495b));
                unsafe.putInt(message, j, number);
                return iM8900L;
            case 55:
            case 62:
                if (wireType != 0) {
                    return position;
                }
                int iM8897I = d60.m8897I(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.f28494a));
                unsafe.putInt(message, j, number);
                return iM8897I;
            case 56:
            case 65:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(d60.m8914j(data, position)));
                int i3 = position + 8;
                unsafe.putInt(message, j, number);
                return i3;
            case 57:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(d60.m8912h(data, position)));
                int i4 = position + 4;
                unsafe.putInt(message, j, number);
                return i4;
            case 58:
                if (wireType != 0) {
                    return position;
                }
                int iM8900L2 = d60.m8900L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.f28495b != 0));
                unsafe.putInt(message, j, number);
                return iM8900L2;
            case 59:
                if (wireType != 2) {
                    return position;
                }
                int iM8897I2 = d60.m8897I(data, position, registers);
                int i5 = registers.f28494a;
                if (i5 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & 536870912) != 0 && !pzh.m19874n(data, iM8897I2, iM8897I2 + i5)) {
                        throw ce8.m3921d();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, iM8897I2, i5, w98.f93674b));
                    iM8897I2 += i5;
                }
                unsafe.putInt(message, j, number);
                return iM8897I2;
            case 60:
                if (wireType != 2) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iM8903O = d60.m8903O(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge);
                return iM8903O;
            case 61:
                if (wireType != 2) {
                    return position;
                }
                int iM8906b = d60.m8906b(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.f28496c);
                unsafe.putInt(message, j, number);
                return iM8906b;
            case 63:
                if (wireType != 0) {
                    return position;
                }
                int iM8897I3 = d60.m8897I(data, position, registers);
                int i6 = registers.f28494a;
                w98.InterfaceC14499f enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i6)) {
                    unsafe.putObject(message, fieldOffset, Integer.valueOf(i6));
                    unsafe.putInt(message, j, number);
                } else {
                    m24802a(message).m22843i(tag, Long.valueOf(i6));
                }
                return iM8897I3;
            case 66:
                if (wireType != 0) {
                    return position;
                }
                int iM8897I4 = d60.m8897I(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(f72.decodeZigZag32(registers.f28494a)));
                unsafe.putInt(message, j, number);
                return iM8897I4;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int iM8900L3 = d60.m8900L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(f72.decodeZigZag64(registers.f28495b)));
                unsafe.putInt(message, j, number);
                return iM8900L3;
            case 68:
                if (wireType != 3) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iM8902N = d60.m8902N(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge2);
                return iM8902N;
            default:
                return position;
        }
    }

    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, d60.C4625b registers) throws IOException {
        int iM8898J;
        Unsafe unsafe = f95295G;
        w98.InterfaceC14504k interfaceC14504kMutableCopyWithCapacity2 = (w98.InterfaceC14504k) unsafe.getObject(message, fieldOffset);
        if (!interfaceC14504kMutableCopyWithCapacity2.isModifiable()) {
            int size = interfaceC14504kMutableCopyWithCapacity2.size();
            interfaceC14504kMutableCopyWithCapacity2 = interfaceC14504kMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, interfaceC14504kMutableCopyWithCapacity2);
        }
        switch (fieldType) {
            case 18:
            case 35:
                return wireType == 2 ? d60.m8923s(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 1 ? d60.m8909e(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 19:
            case 36:
                return wireType == 2 ? d60.m8926v(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 5 ? d60.m8917m(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 20:
            case 21:
            case 37:
            case 38:
                return wireType == 2 ? d60.m8930z(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 0 ? d60.m8901M(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 22:
            case 29:
            case 39:
            case 43:
                return wireType == 2 ? d60.m8929y(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 0 ? d60.m8898J(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 23:
            case 32:
            case 40:
            case 46:
                return wireType == 2 ? d60.m8925u(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 1 ? d60.m8915k(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 24:
            case 31:
            case 41:
            case 45:
                return wireType == 2 ? d60.m8924t(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 5 ? d60.m8913i(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 25:
            case 42:
                return wireType == 2 ? d60.m8922r(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 0 ? d60.m8905a(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 26:
                return wireType == 2 ? (typeAndOffset & 536870912) == 0 ? d60.m8892D(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : d60.m8893E(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 27:
                return wireType == 2 ? d60.m8921q(getMessageFieldSchema(bufferPosition), tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 28:
                return wireType == 2 ? d60.m8907c(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 30:
            case 44:
                if (wireType == 2) {
                    iM8898J = d60.m8929y(data, position, interfaceC14504kMutableCopyWithCapacity2, registers);
                } else {
                    if (wireType != 0) {
                        return position;
                    }
                    iM8898J = d60.m8898J(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers);
                }
                hqe.m12542C(message, number, interfaceC14504kMutableCopyWithCapacity2, getEnumFieldVerifier(bufferPosition), null, this.f95319o);
                return iM8898J;
            case 33:
            case 47:
                return wireType == 2 ? d60.m8927w(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 0 ? d60.m8889A(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 34:
            case 48:
                return wireType == 2 ? d60.m8928x(data, position, interfaceC14504kMutableCopyWithCapacity2, registers) : wireType == 0 ? d60.m8890B(tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            case 49:
                return wireType == 3 ? d60.m8919o(getMessageFieldSchema(bufferPosition), tag, data, position, limit, interfaceC14504kMutableCopyWithCapacity2, registers) : position;
            default:
                return position;
        }
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.f95307c || number > this.f95308d) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.f95305a[pos + 2];
    }

    private <E> void readGroupList(Object message, long offset, hrd reader, tpe<E> schema, zi5 extensionRegistry) throws IOException {
        reader.readGroupList(this.f95318n.mo25702e(message, offset), schema, extensionRegistry);
    }

    private <E> void readMessageList(Object message, int typeAndOffset, hrd reader, tpe<E> schema, zi5 extensionRegistry) throws IOException {
        reader.readMessageList(this.f95318n.mo25702e(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private void readString(Object message, int typeAndOffset, hrd reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            dvh.m9471d0(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.f95311g) {
            dvh.m9471d0(message, offset(typeAndOffset), reader.readString());
        } else {
            dvh.m9471d0(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(Object message, int typeAndOffset, hrd reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.f95318n.mo25702e(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.f95318n.mo25702e(message, offset(typeAndOffset)));
        }
    }

    private static Field reflectField(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = messageClass.getDeclaredFields();
            for (Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        dvh.m9462Y(message, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | dvh.m9438A(message, j));
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        dvh.m9462Y(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.f95305a.length / 3) - 1;
        while (min <= length) {
            int i = (length + min) >>> 1;
            int i2 = i * 3;
            int iNumberAt = numberAt(i2);
            if (number == iNumberAt) {
                return i2;
            }
            if (number < iNumberAt) {
                length = i - 1;
            } else {
                min = i + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(p000.lr5 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.storeFieldData(lr5, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T message, int pos, Object field) {
        f95295G.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        f95295G.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    private static int type(int value) {
        return (value & 267386880) >>> 20;
    }

    private int typeAndOffsetAt(int pos) {
        return this.f95305a[pos + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrder(T r22, p000.rsi r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.writeFieldsInAscendingOrder(java.lang.Object, rsi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, p000.rsi r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.writeFieldsInDescendingOrder(java.lang.Object, rsi):void");
    }

    private <K, V> void writeMapHelper(rsi writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.f95321q.forMapMetadata(getMapFieldDefaultEntry(pos)), this.f95321q.forMapData(mapField));
        }
    }

    private void writeString(int fieldNumber, Object value, rsi writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (vj1) value);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(rth<UT, UB> schema, T message, rsi writer) throws IOException {
        schema.mo21540s(schema.mo21528g(message), writer);
    }

    /* JADX INFO: renamed from: b */
    public int m24806b() {
        return this.f95305a.length * 3;
    }

    @Override // p000.tpe
    public boolean equals(T message, T other) {
        int length = this.f95305a.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(message, other, i)) {
                return false;
            }
        }
        if (!this.f95319o.mo21528g(message).equals(this.f95319o.mo21528g(other))) {
            return false;
        }
        if (this.f95310f) {
            return this.f95320p.mo3201c(message).equals(this.f95320p.mo3201c(other));
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009a. Please report as an issue. */
    @pp1
    /* JADX INFO: renamed from: f */
    public int m24807f(T message, byte[] data, int position, int limit, int endDelimited, d60.C4625b registers) throws IOException {
        Unsafe unsafe;
        int i;
        wsa<T> wsaVar;
        int i2;
        int i3;
        int i4;
        int i5;
        T t;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        byte b;
        byte[] bArr2;
        int iM8900L;
        int i15;
        int i16;
        wsa<T> wsaVar2 = this;
        T t2 = message;
        byte[] bArr3 = data;
        int i17 = limit;
        int i18 = endDelimited;
        d60.C4625b c4625b = registers;
        checkMutable(message);
        Unsafe unsafe2 = f95295G;
        int iM8895G = position;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 1048575;
        while (true) {
            if (iM8895G < i17) {
                int i24 = iM8895G + 1;
                byte b2 = bArr3[iM8895G];
                if (b2 < 0) {
                    int iM8896H = d60.m8896H(b2, bArr3, i24, c4625b);
                    i6 = c4625b.f28494a;
                    i24 = iM8896H;
                } else {
                    i6 = b2;
                }
                int i25 = i6 >>> 3;
                int i26 = i6 & 7;
                int iPositionForFieldNumber = i25 > i22 ? wsaVar2.positionForFieldNumber(i25, i19 / 3) : wsaVar2.positionForFieldNumber(i25);
                if (iPositionForFieldNumber == -1) {
                    i7 = i25;
                    i8 = i24;
                    i3 = i6;
                    i9 = i21;
                    i10 = i23;
                    unsafe = unsafe2;
                    i = i18;
                    i11 = 0;
                } else {
                    int i27 = wsaVar2.f95305a[iPositionForFieldNumber + 1];
                    int iType = type(i27);
                    long jOffset = offset(i27);
                    int i28 = i6;
                    if (iType <= 17) {
                        int i29 = wsaVar2.f95305a[iPositionForFieldNumber + 2];
                        int i30 = 1 << (i29 >>> 20);
                        int i31 = 1048575;
                        int i32 = i29 & 1048575;
                        if (i32 != i23) {
                            if (i23 != 1048575) {
                                unsafe2.putInt(t2, i23, i21);
                                i31 = 1048575;
                            }
                            i10 = i32;
                            i12 = i32 == i31 ? 0 : unsafe2.getInt(t2, i32);
                        } else {
                            i12 = i21;
                            i10 = i23;
                        }
                        switch (iType) {
                            case 0:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 1) {
                                    dvh.m9457T(t2, jOffset, d60.m8908d(bArr, i24));
                                    iM8895G = i24 + 8;
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 1:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 5) {
                                    dvh.m9459V(t2, jOffset, d60.m8916l(bArr, i24));
                                    iM8895G = i24 + 4;
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 0) {
                                    iM8900L = d60.m8900L(bArr2, i24, c4625b);
                                    unsafe2.putLong(message, jOffset, c4625b.f28495b);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iM8895G = iM8900L;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 0) {
                                    iM8895G = d60.m8897I(bArr, i24, c4625b);
                                    unsafe2.putInt(t2, jOffset, c4625b.f28494a);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 1) {
                                    unsafe2.putLong(message, jOffset, d60.m8914j(bArr, i24));
                                    iM8895G = i24 + 8;
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 5) {
                                    unsafe2.putInt(t2, jOffset, d60.m8912h(bArr, i24));
                                    iM8895G = i24 + 4;
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 7:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 0) {
                                    iM8895G = d60.m8900L(bArr, i24, c4625b);
                                    dvh.m9452O(t2, jOffset, c4625b.f28495b != 0);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 8:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 2) {
                                    iM8895G = isEnforceUtf8(i27) ? d60.m8894F(bArr, i24, c4625b) : d60.m8891C(bArr, i24, c4625b);
                                    unsafe2.putObject(t2, jOffset, c4625b.f28496c);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 9:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 2) {
                                    Object objMutableMessageFieldForMerge = wsaVar2.mutableMessageFieldForMerge(t2, i13);
                                    iM8895G = d60.m8903O(objMutableMessageFieldForMerge, wsaVar2.getMessageFieldSchema(i13), data, i24, limit, registers);
                                    wsaVar2.storeMessageField(t2, i13, objMutableMessageFieldForMerge);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 10:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 2) {
                                    iM8895G = d60.m8906b(bArr, i24, c4625b);
                                    unsafe2.putObject(t2, jOffset, c4625b.f28496c);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 12:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 0) {
                                    iM8895G = d60.m8897I(bArr, i24, c4625b);
                                    int i33 = c4625b.f28494a;
                                    w98.InterfaceC14499f enumFieldVerifier = wsaVar2.getEnumFieldVerifier(i13);
                                    if (!isLegacyEnumIsClosed(i27) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i33)) {
                                        unsafe2.putInt(t2, jOffset, i33);
                                        i21 = i12 | i30;
                                        i18 = endDelimited;
                                        i19 = i13;
                                        bArr3 = bArr;
                                        i20 = i14;
                                        i23 = i10;
                                        i22 = i7;
                                        i17 = limit;
                                    } else {
                                        m24802a(message).m22843i(i14, Long.valueOf(i33));
                                        i18 = endDelimited;
                                        i19 = i13;
                                        i21 = i12;
                                        i20 = i14;
                                        i23 = i10;
                                        i22 = i7;
                                        i17 = limit;
                                        bArr3 = bArr;
                                    }
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 15:
                                bArr = data;
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                if (i26 == 0) {
                                    iM8895G = d60.m8897I(bArr, i24, c4625b);
                                    unsafe2.putInt(t2, jOffset, f72.decodeZigZag32(c4625b.f28494a));
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 16:
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                bArr2 = data;
                                if (i26 == 0) {
                                    iM8900L = d60.m8900L(bArr2, i24, c4625b);
                                    unsafe2.putLong(message, jOffset, f72.decodeZigZag64(c4625b.f28495b));
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iM8895G = iM8900L;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            case 17:
                                if (i26 == 3) {
                                    Object objMutableMessageFieldForMerge2 = wsaVar2.mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    i7 = i25;
                                    i14 = i28;
                                    iM8895G = d60.m8902N(objMutableMessageFieldForMerge2, wsaVar2.getMessageFieldSchema(iPositionForFieldNumber), data, i24, limit, (i25 << 3) | 4, registers);
                                    wsaVar2.storeMessageField(t2, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
                                    i21 = i12 | i30;
                                    bArr3 = data;
                                    i18 = endDelimited;
                                    i19 = iPositionForFieldNumber;
                                    i20 = i14;
                                    i23 = i10;
                                    i22 = i7;
                                    i17 = limit;
                                } else {
                                    i7 = i25;
                                    i14 = i28;
                                    b = -1;
                                    i13 = iPositionForFieldNumber;
                                    i = endDelimited;
                                    i8 = i24;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                }
                                break;
                            default:
                                i7 = i25;
                                i13 = iPositionForFieldNumber;
                                i14 = i28;
                                b = -1;
                                i = endDelimited;
                                i8 = i24;
                                i11 = i13;
                                unsafe = unsafe2;
                                i9 = i12;
                                i3 = i14;
                                break;
                        }
                    } else {
                        i7 = i25;
                        int i34 = i23;
                        i9 = i21;
                        if (iType != 27) {
                            i10 = i34;
                            if (iType <= 49) {
                                int i35 = i24;
                                unsafe = unsafe2;
                                i11 = iPositionForFieldNumber;
                                i16 = i28;
                                iM8895G = parseRepeatedField(message, data, i24, limit, i28, i7, i26, iPositionForFieldNumber, i27, iType, jOffset, registers);
                                if (iM8895G != i35) {
                                    wsaVar2 = this;
                                    t2 = message;
                                    bArr3 = data;
                                    i17 = limit;
                                    i18 = endDelimited;
                                    c4625b = registers;
                                    i20 = i16;
                                    i21 = i9;
                                    i19 = i11;
                                    i23 = i10;
                                    i22 = i7;
                                    unsafe2 = unsafe;
                                } else {
                                    i = endDelimited;
                                    i8 = iM8895G;
                                    i3 = i16;
                                }
                            } else {
                                i15 = i24;
                                unsafe = unsafe2;
                                i11 = iPositionForFieldNumber;
                                i16 = i28;
                                if (iType != 50) {
                                    iM8895G = parseOneofField(message, data, i15, limit, i16, i7, i26, i27, iType, jOffset, i11, registers);
                                    if (iM8895G != i15) {
                                        wsaVar2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        c4625b = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iM8895G;
                                        i3 = i16;
                                    }
                                } else if (i26 == 2) {
                                    iM8895G = parseMapField(message, data, i15, limit, i11, jOffset, registers);
                                    if (iM8895G != i15) {
                                        wsaVar2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        c4625b = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iM8895G;
                                        i3 = i16;
                                    }
                                }
                            }
                        } else if (i26 == 2) {
                            w98.InterfaceC14504k interfaceC14504kMutableCopyWithCapacity2 = (w98.InterfaceC14504k) unsafe2.getObject(t2, jOffset);
                            if (!interfaceC14504kMutableCopyWithCapacity2.isModifiable()) {
                                int size = interfaceC14504kMutableCopyWithCapacity2.size();
                                interfaceC14504kMutableCopyWithCapacity2 = interfaceC14504kMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t2, jOffset, interfaceC14504kMutableCopyWithCapacity2);
                            }
                            iM8895G = d60.m8921q(wsaVar2.getMessageFieldSchema(iPositionForFieldNumber), i28, data, i24, limit, interfaceC14504kMutableCopyWithCapacity2, registers);
                            i18 = endDelimited;
                            i19 = iPositionForFieldNumber;
                            i20 = i28;
                            i21 = i9;
                            i23 = i34;
                            i22 = i7;
                            bArr3 = data;
                            i17 = limit;
                        } else {
                            i10 = i34;
                            i15 = i24;
                            unsafe = unsafe2;
                            i11 = iPositionForFieldNumber;
                            i16 = i28;
                        }
                        i = endDelimited;
                        i8 = i15;
                        i3 = i16;
                    }
                }
                if (i3 != i || i == 0) {
                    iM8895G = (!this.f95310f || registers.f28497d == zi5.getEmptyRegistry()) ? d60.m8895G(i3, data, i8, limit, m24802a(message), registers) : d60.m8911g(i3, data, i8, limit, message, this.f95309e, this.f95319o, registers);
                    t2 = message;
                    bArr3 = data;
                    i17 = limit;
                    i20 = i3;
                    wsaVar2 = this;
                    c4625b = registers;
                    i21 = i9;
                    i19 = i11;
                    i23 = i10;
                    i22 = i7;
                    unsafe2 = unsafe;
                    i18 = i;
                } else {
                    i5 = 1048575;
                    wsaVar = this;
                    i2 = i8;
                    i21 = i9;
                    i4 = i10;
                }
            } else {
                int i36 = i23;
                unsafe = unsafe2;
                i = i18;
                wsaVar = wsaVar2;
                i2 = iM8895G;
                i3 = i20;
                i4 = i36;
                i5 = 1048575;
            }
        }
        if (i4 != i5) {
            t = message;
            unsafe.putInt(t, i4, i21);
        } else {
            t = message;
        }
        tth tthVar = null;
        for (int i37 = wsaVar.f95315k; i37 < wsaVar.f95316l; i37++) {
            tthVar = (tth) filterMapUnknownEnumValues(message, wsaVar.f95314j[i37], tthVar, wsaVar.f95319o, message);
        }
        if (tthVar != null) {
            wsaVar.f95319o.mo21535n(t, tthVar);
        }
        if (i == 0) {
            if (i2 != limit) {
                throw ce8.m3925h();
            }
        } else if (i2 > limit || i3 != i) {
            throw ce8.m3925h();
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.tpe
    public int getSerializedSize(T message) {
        int i;
        int i2;
        int i3;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z;
        int iM12555f;
        int iM12558i;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = f95295G;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.f95305a.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i7);
            int i9 = this.f95305a[i7 + 2];
            int i10 = i9 & i4;
            if (iType <= 17) {
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(message, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < ds5.f30577u2.m9340id() || iType > ds5.f30539H2.m9340id()) {
                i10 = 0;
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeUInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = j72.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(message, jOffset);
                        iComputeBoolSize = object instanceof vj1 ? j72.computeBytesSize(iNumberAt, (vj1) object) : j72.computeStringSize(iNumberAt, (String) object);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = hqe.m12565p(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeBytesSize(iNumberAt, (vj1) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeUInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeEnumSize(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeSFixed32Size = j72.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeSInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.computeSInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = j72.m13756b(iNumberAt, (qsa) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = hqe.m12557h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 19:
                    z = false;
                    iM12555f = hqe.m12555f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 20:
                    z = false;
                    iM12555f = hqe.m12563n(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 21:
                    z = false;
                    iM12555f = hqe.m12575z(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 22:
                    z = false;
                    iM12555f = hqe.m12561l(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 23:
                    z = false;
                    iM12555f = hqe.m12557h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 24:
                    z = false;
                    iM12555f = hqe.m12555f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 25:
                    z = false;
                    iM12555f = hqe.m12550a(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 26:
                    iComputeBoolSize = hqe.m12572w(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = hqe.m12567r(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = hqe.m12552c(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = hqe.m12573x(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 30:
                    z = false;
                    iM12555f = hqe.m12553d(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 31:
                    z = false;
                    iM12555f = hqe.m12555f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 32:
                    z = false;
                    iM12555f = hqe.m12557h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 33:
                    z = false;
                    iM12555f = hqe.m12568s(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 34:
                    z = false;
                    iM12555f = hqe.m12570u(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM12555f;
                    break;
                case 35:
                    iM12558i = hqe.m12558i((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iM12558i = hqe.m12556g((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iM12558i = hqe.m12564o((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iM12558i = hqe.m12540A((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iM12558i = hqe.m12562m((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iM12558i = hqe.m12558i((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iM12558i = hqe.m12556g((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iM12558i = hqe.m12551b((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iM12558i = hqe.m12574y((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iM12558i = hqe.m12554e((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iM12558i = hqe.m12556g((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iM12558i = hqe.m12558i((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iM12558i = hqe.m12569t((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iM12558i = hqe.m12571v((List) unsafe.getObject(message, jOffset));
                    if (iM12558i > 0) {
                        if (this.f95313i) {
                            unsafe.putInt(message, i10, iM12558i);
                        }
                        iComputeTagSize = j72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(iM12558i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM12558i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = hqe.m12560k(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.f95321q.getSerializedSize(iNumberAt, unsafe.getObject(message, jOffset), getMapFieldDefaultEntry(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeUInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = j72.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        Object object2 = unsafe.getObject(message, jOffset);
                        iComputeBoolSize = object2 instanceof vj1 ? j72.computeBytesSize(iNumberAt, (vj1) object2) : j72.computeStringSize(iNumberAt, (String) object2);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = hqe.m12565p(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeBytesSize(iNumberAt, (vj1) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeUInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeEnumSize(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = j72.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeSInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.computeSInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = j72.m13756b(iNumberAt, (qsa) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i8 + getUnknownFieldsSerializedSize(this.f95319o, message);
        return this.f95310f ? unknownFieldsSerializedSize + this.f95320p.mo3201c(message).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // p000.tpe
    public int hashCode(T message) {
        int i;
        int iHashLong;
        int length = this.f95305a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(Double.doubleToLongBits(dvh.m9490v(message, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(dvh.m9492x(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(dvh.m9441D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(dvh.m9441D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(dvh.m9441D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = w98.hashBoolean(dvh.m9485q(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) dvh.m9443F(message, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    Object objM9443F = dvh.m9443F(message, jOffset);
                    if (objM9443F != null) {
                        iHashCode = objM9443F.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = dvh.m9443F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(dvh.m9441D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = dvh.m9438A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = w98.hashLong(dvh.m9441D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    Object objM9443F2 = dvh.m9443F(message, jOffset);
                    if (objM9443F2 != null) {
                        iHashCode = objM9443F2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iHashLong = dvh.m9443F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = dvh.m9443F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, jOffset)));
                        i2 = i + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashBoolean(oneofBooleanAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) dvh.m9443F(message, jOffset)).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = dvh.m9443F(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = dvh.m9443F(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(message, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = w98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = dvh.m9443F(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f95319o.mo21528g(message).hashCode();
        return this.f95310f ? (iHashCode2 * 53) + this.f95320p.mo3201c(message).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // p000.tpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.f95315k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f95314j
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.f95305a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = p000.wsa.f95295G
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = isRequired(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = type(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.isMapInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.isOneofPresent(r7, r12, r11)
            if (r0 == 0) goto Laa
            tpe r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.isListInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            tpe r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f95310f
            if (r0 == 0) goto Lc2
            bj5<?> r0 = r6.f95320p
            as5 r0 = r0.mo3201c(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // p000.tpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsa.makeImmutable(java.lang.Object):void");
    }

    @Override // p000.tpe
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i = 0; i < this.f95305a.length; i += 3) {
            mergeSingleField(message, other, i);
        }
        hqe.m12546G(this.f95319o, message, other);
        if (this.f95310f) {
            hqe.m12544E(this.f95320p, message, other);
        }
    }

    @Override // p000.tpe
    public T newInstance() {
        return (T) this.f95317m.newInstance(this.f95309e);
    }

    @Override // p000.tpe
    public void writeTo(T message, rsi writer) throws IOException {
        if (writer.fieldOrder() == rsi.EnumC12268a.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    private boolean isFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (dvh.m9438A(message, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(dvh.m9490v(message, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(dvh.m9492x(message, jOffset)) != 0;
            case 2:
                return dvh.m9441D(message, jOffset) != 0;
            case 3:
                return dvh.m9441D(message, jOffset) != 0;
            case 4:
                return dvh.m9438A(message, jOffset) != 0;
            case 5:
                return dvh.m9441D(message, jOffset) != 0;
            case 6:
                return dvh.m9438A(message, jOffset) != 0;
            case 7:
                return dvh.m9485q(message, jOffset);
            case 8:
                Object objM9443F = dvh.m9443F(message, jOffset);
                if (objM9443F instanceof String) {
                    return !((String) objM9443F).isEmpty();
                }
                if (objM9443F instanceof vj1) {
                    return !vj1.f91344e.equals(objM9443F);
                }
                throw new IllegalArgumentException();
            case 9:
                return dvh.m9443F(message, jOffset) != null;
            case 10:
                return !vj1.f91344e.equals(dvh.m9443F(message, jOffset));
            case 11:
                return dvh.m9438A(message, jOffset) != 0;
            case 12:
                return dvh.m9438A(message, jOffset) != 0;
            case 13:
                return dvh.m9438A(message, jOffset) != 0;
            case 14:
                return dvh.m9441D(message, jOffset) != 0;
            case 15:
                return dvh.m9438A(message, jOffset) != 0;
            case 16:
                return dvh.m9441D(message, jOffset) != 0;
            case 17:
                return dvh.m9443F(message, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.f95307c || number > this.f95308d) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    @Override // p000.tpe
    public void mergeFrom(T message, hrd reader, zi5 extensionRegistry) throws Throwable {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.f95319o, this.f95320p, message, reader, extensionRegistry);
    }

    private boolean equals(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(message, other, pos) && Double.doubleToLongBits(dvh.m9490v(message, jOffset)) == Double.doubleToLongBits(dvh.m9490v(other, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(message, other, pos) && Float.floatToIntBits(dvh.m9492x(message, jOffset)) == Float.floatToIntBits(dvh.m9492x(other, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(message, other, pos) && dvh.m9441D(message, jOffset) == dvh.m9441D(other, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(message, other, pos) && dvh.m9441D(message, jOffset) == dvh.m9441D(other, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(message, other, pos) && dvh.m9441D(message, jOffset) == dvh.m9441D(other, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(message, other, pos) && dvh.m9485q(message, jOffset) == dvh.m9485q(other, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(message, other, pos) && hqe.m12547H(dvh.m9443F(message, jOffset), dvh.m9443F(other, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(message, other, pos) && hqe.m12547H(dvh.m9443F(message, jOffset), dvh.m9443F(other, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(message, other, pos) && hqe.m12547H(dvh.m9443F(message, jOffset), dvh.m9443F(other, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(message, other, pos) && dvh.m9441D(message, jOffset) == dvh.m9441D(other, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(message, other, pos) && dvh.m9438A(message, jOffset) == dvh.m9438A(other, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(message, other, pos) && dvh.m9441D(message, jOffset) == dvh.m9441D(other, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(message, other, pos) && hqe.m12547H(dvh.m9443F(message, jOffset), dvh.m9443F(other, jOffset))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(message, other, pos) && hqe.m12547H(dvh.m9443F(message, jOffset), dvh.m9443F(other, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p000.tpe
    public void mergeFrom(T message, byte[] data, int position, int limit, d60.C4625b registers) throws IOException {
        m24807f(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object message, int typeAndOffset, tpe schema) {
        return schema.isInitialized(dvh.m9443F(message, offset(typeAndOffset)));
    }
}
