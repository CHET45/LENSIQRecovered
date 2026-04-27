package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.c60;
import p000.gpi;
import p000.ns9;
import p000.qsi;
import p000.v98;
import p000.wj1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class vsa<T> implements upe<T> {

    /* JADX INFO: renamed from: A */
    public static final int f92144A = 256;

    /* JADX INFO: renamed from: B */
    public static final int f92145B = 512;

    /* JADX INFO: renamed from: C */
    public static final int f92146C = 1024;

    /* JADX INFO: renamed from: D */
    public static final int f92147D = 2048;

    /* JADX INFO: renamed from: E */
    public static final int f92148E = 4096;

    /* JADX INFO: renamed from: F */
    public static final int f92149F = 51;

    /* JADX INFO: renamed from: r */
    public static final int f92151r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f92152s = 20;

    /* JADX INFO: renamed from: t */
    public static final int f92153t = 1048575;

    /* JADX INFO: renamed from: u */
    public static final int f92154u = 267386880;

    /* JADX INFO: renamed from: v */
    public static final int f92155v = 268435456;

    /* JADX INFO: renamed from: w */
    public static final int f92156w = 536870912;

    /* JADX INFO: renamed from: x */
    public static final int f92157x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public static final int f92158y = 1048575;

    /* JADX INFO: renamed from: a */
    public final int[] f92160a;

    /* JADX INFO: renamed from: b */
    public final Object[] f92161b;

    /* JADX INFO: renamed from: c */
    public final int f92162c;

    /* JADX INFO: renamed from: d */
    public final int f92163d;

    /* JADX INFO: renamed from: e */
    public final psa f92164e;

    /* JADX INFO: renamed from: f */
    public final boolean f92165f;

    /* JADX INFO: renamed from: g */
    public final boolean f92166g;

    /* JADX INFO: renamed from: h */
    public final ihd f92167h;

    /* JADX INFO: renamed from: i */
    public final boolean f92168i;

    /* JADX INFO: renamed from: j */
    public final int[] f92169j;

    /* JADX INFO: renamed from: k */
    public final int f92170k;

    /* JADX INFO: renamed from: l */
    public final int f92171l;

    /* JADX INFO: renamed from: m */
    public final ncb f92172m;

    /* JADX INFO: renamed from: n */
    public final z89 f92173n;

    /* JADX INFO: renamed from: o */
    public final sth<?, ?> f92174o;

    /* JADX INFO: renamed from: p */
    public final cj5<?> f92175p;

    /* JADX INFO: renamed from: q */
    public final vs9 f92176q;

    /* JADX INFO: renamed from: z */
    public static final int[] f92159z = new int[0];

    /* JADX INFO: renamed from: G */
    public static final Unsafe f92150G = evh.m10255I();

    /* JADX INFO: renamed from: vsa$a */
    public static /* synthetic */ class C14248a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92177a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f92177a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40750H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40755Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40749F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40759Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40748C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40753M1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40763d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40758Y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40766m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40757X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40764e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40765f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40754N.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40756V1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40760Z1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f92177a[gpi.EnumC6460b.f40751L.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private vsa(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, psa defaultInstance, ihd syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, ncb newInstanceSchema, z89 listFieldSchema, sth<?, ?> unknownFieldSchema, cj5<?> extensionSchema, vs9 mapFieldSchema) {
        this.f92160a = buffer;
        this.f92161b = objects;
        this.f92162c = minFieldNumber;
        this.f92163d = maxFieldNumber;
        this.f92166g = defaultInstance instanceof u27;
        this.f92167h = syntax;
        this.f92165f = extensionSchema != null && extensionSchema.mo3994e(defaultInstance);
        this.f92168i = useCachedSizeField;
        this.f92169j = intArray;
        this.f92170k = checkInitialized;
        this.f92171l = mapFieldPositions;
        this.f92172m = newInstanceSchema;
        this.f92173n = listFieldSchema;
        this.f92174o = unknownFieldSchema;
        this.f92175p = extensionSchema;
        this.f92164e = defaultInstance;
        this.f92176q = mapFieldSchema;
    }

    /* JADX INFO: renamed from: a */
    public static uth m24176a(Object message) {
        u27 u27Var = (u27) message;
        uth uthVar = u27Var.unknownFields;
        if (uthVar != uth.getDefaultInstance()) {
            return uthVar;
        }
        uth uthVarM23570g = uth.m23570g();
        u27Var.unknownFields = uthVarM23570g;
        return uthVarM23570g;
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return evh.m10294q(message, offset);
    }

    /* JADX INFO: renamed from: c */
    public static <T> vsa<T> m24177c(Class<T> messageClass, lsa messageInfo, ncb newInstanceSchema, z89 listFieldSchema, sth<?, ?> unknownFieldSchema, cj5<?> extensionSchema, vs9 mapFieldSchema) {
        return messageInfo instanceof tpd ? m24179e((tpd) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : m24178d((vag) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static void checkMutable(Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    /* JADX INFO: renamed from: d */
    public static <T> vsa<T> m24178d(vag messageInfo, ncb newInstanceSchema, z89 listFieldSchema, sth<?, ?> unknownFieldSchema, cj5<?> extensionSchema, vs9 mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        jr5[] fields = messageInfo.getFields();
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
        for (jr5 jr5Var : fields) {
            if (jr5Var.getType() == cs5.f27214J2) {
                i2++;
            } else if (jr5Var.getType().m8671id() >= 18 && jr5Var.getType().m8671id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = f92159z;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            jr5 jr5Var2 = fields[i4];
            int fieldNumber3 = jr5Var2.getFieldNumber();
            storeFieldData(jr5Var2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (jr5Var2.getType() == cs5.f27214J2) {
                iArr2[i7] = i5;
                i7++;
            } else {
                if (jr5Var2.getType().m8671id() >= 18 && jr5Var2.getType().m8671id() <= 49) {
                    i = i5;
                    iArr3[i8] = (int) evh.m10260N(jr5Var2.getField());
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
            iArr2 = f92159z;
        }
        if (iArr3 == null) {
            iArr3 = f92159z;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new vsa<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, ns9.C10042b<K, V> metadata, Map<K, V> target, c60.C2209b registers) throws IOException {
        int iM3785H;
        int iM3786I = c60.m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0 || i > limit - iM3786I) {
            throw be8.m3084l();
        }
        int i2 = iM3786I + i;
        Object obj = metadata.f65507b;
        Object obj2 = metadata.f65509d;
        while (iM3786I < i2) {
            int i3 = iM3786I + 1;
            int i4 = data[iM3786I];
            if (i4 < 0) {
                iM3785H = c60.m3785H(i4, data, i3, registers);
                i4 = registers.f15819a;
            } else {
                iM3785H = i3;
            }
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i5 != 1) {
                if (i5 == 2 && i6 == metadata.f65508c.getWireType()) {
                    iM3786I = decodeMapEntryValue(data, iM3785H, limit, metadata.f65508c, metadata.f65509d.getClass(), registers);
                    obj2 = registers.f15821c;
                } else {
                    iM3786I = c60.m3793P(i4, data, iM3785H, limit, registers);
                }
            } else if (i6 == metadata.f65506a.getWireType()) {
                iM3786I = decodeMapEntryValue(data, iM3785H, limit, metadata.f65506a, null, registers);
                obj = registers.f15821c;
            } else {
                iM3786I = c60.m3793P(i4, data, iM3785H, limit, registers);
            }
        }
        if (iM3786I != i2) {
            throw be8.m3081h();
        }
        target.put(obj, obj2);
        return i2;
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, gpi.EnumC6460b fieldType, Class<?> messageType, c60.C2209b registers) throws IOException {
        switch (C14248a.f92177a[fieldType.ordinal()]) {
            case 1:
                int iM3789L = c60.m3789L(data, position, registers);
                registers.f15821c = Boolean.valueOf(registers.f15820b != 0);
                return iM3789L;
            case 2:
                return c60.m3795b(data, position, registers);
            case 3:
                registers.f15821c = Double.valueOf(c60.m3797d(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.f15821c = Integer.valueOf(c60.m3801h(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.f15821c = Long.valueOf(c60.m3803j(data, position));
                return position + 8;
            case 8:
                registers.f15821c = Float.valueOf(c60.m3805l(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iM3786I = c60.m3786I(data, position, registers);
                registers.f15821c = Integer.valueOf(registers.f15819a);
                return iM3786I;
            case 12:
            case 13:
                int iM3789L2 = c60.m3789L(data, position, registers);
                registers.f15821c = Long.valueOf(registers.f15820b);
                return iM3789L2;
            case 14:
                return c60.m3809p(lhd.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int iM3786I2 = c60.m3786I(data, position, registers);
                registers.f15821c = Integer.valueOf(e72.decodeZigZag32(registers.f15819a));
                return iM3786I2;
            case 16:
                int iM3789L3 = c60.m3789L(data, position, registers);
                registers.f15821c = Long.valueOf(e72.decodeZigZag64(registers.f15820b));
                return iM3789L3;
            case 17:
                return c60.m3783F(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T message, long offset) {
        return evh.m10299v(message, offset);
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
    public static <T> p000.vsa<T> m24179e(p000.tpd r31, p000.ncb r32, p000.z89 r33, p000.sth<?, ?> r34, p000.cj5<?> r35, p000.vs9 r36) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.m24179e(tpd, ncb, z89, sth, cj5, vs9):vsa");
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, sth<UT, UB> sthVar, Object obj2) {
        v98.InterfaceC13949e enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object objM10252F = evh.m10252F(obj, offset(typeAndOffsetAt(i)));
        return (objM10252F == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.f92176q.forMutableMapData(objM10252F), enumFieldVerifier, ub, sthVar, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, v98.InterfaceC13949e interfaceC13949e, UB ub, sth<UT, UB> sthVar, Object obj) {
        ns9.C10042b<?, ?> c10042bForMapMetadata = this.f92176q.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC13949e.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = sthVar.mo22233f(obj);
                }
                wj1.C14640h c14640hM24592g = wj1.m24592g(ns9.m18107a(c10042bForMapMetadata, next.getKey(), next.getValue()));
                try {
                    ns9.m18110e(c14640hM24592g.getCodedOutput(), c10042bForMapMetadata, next.getKey(), next.getValue());
                    sthVar.mo22231d(ub, i2, c14640hM24592g.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T message, long offset) {
        return evh.m10301x(message, offset);
    }

    private v98.InterfaceC13949e getEnumFieldVerifier(int pos) {
        return (v98.InterfaceC13949e) this.f92161b[((pos / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int pos) {
        return this.f92161b[(pos / 3) * 2];
    }

    private upe getMessageFieldSchema(int pos) {
        int i = (pos / 3) * 2;
        upe upeVar = (upe) this.f92161b[i];
        if (upeVar != null) {
            return upeVar;
        }
        upe<T> upeVarSchemaFor = lhd.getInstance().schemaFor((Class) this.f92161b[i + 1]);
        this.f92161b[i] = upeVarSchemaFor;
        return upeVarSchemaFor;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(sth<UT, UB> schema, T message) {
        return schema.mo22235h(schema.mo22234g(message));
    }

    private static <T> int intAt(T message, long offset) {
        return evh.m10247A(message, offset);
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
        List list = (List) evh.m10252F(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        upe messageFieldSchema = getMessageFieldSchema(pos);
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
    /* JADX WARN: Type inference failed for: r5v8, types: [upe] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> mapForMapData = this.f92176q.forMapData(evh.m10252F(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f92176q.forMapMetadata(getMapFieldDefaultEntry(i2)).f65508c.getJavaType() != gpi.EnumC6461c.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = lhd.getInstance().schemaFor((Class) obj.getClass());
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
        if (message instanceof u27) {
            return ((u27) message).m23040D();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return evh.m10247A(message, jPresenceMaskAndOffsetAt) == evh.m10247A(other, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return evh.m10247A(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    private static boolean isRequired(int value) {
        return (value & 268435456) != 0;
    }

    private static <T> long longAt(T message, long offset) {
        return evh.m10250D(message, offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r0 = r18.f92170k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0 >= r18.f92171l) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.f92169j[r0], r4, r19, r21);
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
    
        r7.mo22241n(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b1 A[LOOP:4: B:196:0x06ad->B:198:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends p000.zr5.InterfaceC16225c<ET>> void mergeFromHelper(p000.sth<UT, UB> r19, p000.cj5<ET> r20, T r21, p000.ird r22, p000.yi5 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.mergeFromHelper(sth, cj5, java.lang.Object, ird, yi5):void");
    }

    private final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, yi5 extensionRegistry, ird reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(pos));
        Object objM10252F = evh.m10252F(message, jOffset);
        if (objM10252F == null) {
            objM10252F = this.f92176q.newMapField(mapDefaultEntry);
            evh.m10280d0(message, jOffset, objM10252F);
        } else if (this.f92176q.isImmutable(objM10252F)) {
            Object objNewMapField = this.f92176q.newMapField(mapDefaultEntry);
            this.f92176q.mergeFrom(objNewMapField, objM10252F);
            evh.m10280d0(message, jOffset, objNewMapField);
            objM10252F = objNewMapField;
        }
        reader.readMap(this.f92176q.forMutableMapData(objM10252F), this.f92176q.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = f92150G;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            upe messageFieldSchema = getMessageFieldSchema(pos);
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
            Unsafe unsafe = f92150G;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            upe messageFieldSchema = getMessageFieldSchema(pos);
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
                    evh.m10266T(message, jOffset, evh.m10299v(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    evh.m10268V(message, jOffset, evh.m10301x(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    evh.m10276b0(message, jOffset, evh.m10250D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    evh.m10276b0(message, jOffset, evh.m10250D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    evh.m10276b0(message, jOffset, evh.m10250D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    evh.m10261O(message, jOffset, evh.m10294q(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    evh.m10280d0(message, jOffset, evh.m10252F(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    evh.m10280d0(message, jOffset, evh.m10252F(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    evh.m10276b0(message, jOffset, evh.m10250D(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    evh.m10271Y(message, jOffset, evh.m10247A(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    evh.m10276b0(message, jOffset, evh.m10250D(other, jOffset));
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
                this.f92173n.mergeListsAt(message, other, jOffset);
                break;
            case 50:
                iqe.m13310F(this.f92176q, message, other, jOffset);
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
                    evh.m10280d0(message, jOffset, evh.m10252F(other, jOffset));
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
                    evh.m10280d0(message, jOffset, evh.m10252F(other, jOffset));
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
        upe messageFieldSchema = getMessageFieldSchema(pos);
        long jOffset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = f92150G.getObject(message, jOffset);
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
        upe messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = f92150G.getObject(message, offset(typeAndOffsetAt(pos)));
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
        return this.f92160a[pos];
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) evh.m10252F(message, offset)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) evh.m10252F(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) evh.m10252F(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) evh.m10252F(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((Long) evh.m10252F(message, offset)).longValue();
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, c60.C2209b registers) throws IOException {
        Unsafe unsafe = f92150G;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.f92176q.isImmutable(object)) {
            Object objNewMapField = this.f92176q.newMapField(mapFieldDefaultEntry);
            this.f92176q.mergeFrom(objNewMapField, object);
            unsafe.putObject(message, fieldOffset, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(data, position, limit, this.f92176q.forMapMetadata(mapFieldDefaultEntry), this.f92176q.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, c60.C2209b registers) throws IOException {
        Unsafe unsafe = f92150G;
        long j = this.f92160a[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(c60.m3797d(data, position)));
                int i = position + 8;
                unsafe.putInt(message, j, number);
                return i;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(c60.m3805l(data, position)));
                int i2 = position + 4;
                unsafe.putInt(message, j, number);
                return i2;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int iM3789L = c60.m3789L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.f15820b));
                unsafe.putInt(message, j, number);
                return iM3789L;
            case 55:
            case 62:
                if (wireType != 0) {
                    return position;
                }
                int iM3786I = c60.m3786I(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.f15819a));
                unsafe.putInt(message, j, number);
                return iM3786I;
            case 56:
            case 65:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(c60.m3803j(data, position)));
                int i3 = position + 8;
                unsafe.putInt(message, j, number);
                return i3;
            case 57:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(c60.m3801h(data, position)));
                int i4 = position + 4;
                unsafe.putInt(message, j, number);
                return i4;
            case 58:
                if (wireType != 0) {
                    return position;
                }
                int iM3789L2 = c60.m3789L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.f15820b != 0));
                unsafe.putInt(message, j, number);
                return iM3789L2;
            case 59:
                if (wireType != 2) {
                    return position;
                }
                int iM3786I2 = c60.m3786I(data, position, registers);
                int i5 = registers.f15819a;
                if (i5 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & 536870912) != 0 && !lzh.m16496n(data, iM3786I2, iM3786I2 + i5)) {
                        throw be8.m3077d();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, iM3786I2, i5, v98.f90380b));
                    iM3786I2 += i5;
                }
                unsafe.putInt(message, j, number);
                return iM3786I2;
            case 60:
                if (wireType != 2) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iM3792O = c60.m3792O(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge);
                return iM3792O;
            case 61:
                if (wireType != 2) {
                    return position;
                }
                int iM3795b = c60.m3795b(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.f15821c);
                unsafe.putInt(message, j, number);
                return iM3795b;
            case 63:
                if (wireType != 0) {
                    return position;
                }
                int iM3786I3 = c60.m3786I(data, position, registers);
                int i6 = registers.f15819a;
                v98.InterfaceC13949e enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i6)) {
                    unsafe.putObject(message, fieldOffset, Integer.valueOf(i6));
                    unsafe.putInt(message, j, number);
                } else {
                    m24176a(message).m23577i(tag, Long.valueOf(i6));
                }
                return iM3786I3;
            case 66:
                if (wireType != 0) {
                    return position;
                }
                int iM3786I4 = c60.m3786I(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(e72.decodeZigZag32(registers.f15819a)));
                unsafe.putInt(message, j, number);
                return iM3786I4;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int iM3789L3 = c60.m3789L(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(e72.decodeZigZag64(registers.f15820b)));
                unsafe.putInt(message, j, number);
                return iM3789L3;
            case 68:
                if (wireType != 3) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iM3791N = c60.m3791N(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge2);
                return iM3791N;
            default:
                return position;
        }
    }

    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, c60.C2209b registers) throws IOException {
        int iM3787J;
        Unsafe unsafe = f92150G;
        v98.InterfaceC13956l interfaceC13956lMutableCopyWithCapacity2 = (v98.InterfaceC13956l) unsafe.getObject(message, fieldOffset);
        if (!interfaceC13956lMutableCopyWithCapacity2.isModifiable()) {
            int size = interfaceC13956lMutableCopyWithCapacity2.size();
            interfaceC13956lMutableCopyWithCapacity2 = interfaceC13956lMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, interfaceC13956lMutableCopyWithCapacity2);
        }
        switch (fieldType) {
            case 18:
            case 35:
                return wireType == 2 ? c60.m3812s(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 1 ? c60.m3798e(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 19:
            case 36:
                return wireType == 2 ? c60.m3815v(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 5 ? c60.m3806m(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 20:
            case 21:
            case 37:
            case 38:
                return wireType == 2 ? c60.m3819z(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 0 ? c60.m3790M(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 22:
            case 29:
            case 39:
            case 43:
                return wireType == 2 ? c60.m3818y(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 0 ? c60.m3787J(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 23:
            case 32:
            case 40:
            case 46:
                return wireType == 2 ? c60.m3814u(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 1 ? c60.m3804k(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 24:
            case 31:
            case 41:
            case 45:
                return wireType == 2 ? c60.m3813t(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 5 ? c60.m3802i(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 25:
            case 42:
                return wireType == 2 ? c60.m3811r(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 0 ? c60.m3794a(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 26:
                return wireType == 2 ? (typeAndOffset & 536870912) == 0 ? c60.m3781D(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : c60.m3782E(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 27:
                return wireType == 2 ? c60.m3810q(getMessageFieldSchema(bufferPosition), tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 28:
                return wireType == 2 ? c60.m3796c(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 30:
            case 44:
                if (wireType == 2) {
                    iM3787J = c60.m3818y(data, position, interfaceC13956lMutableCopyWithCapacity2, registers);
                } else {
                    if (wireType != 0) {
                        return position;
                    }
                    iM3787J = c60.m3787J(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers);
                }
                iqe.m13307C(message, number, interfaceC13956lMutableCopyWithCapacity2, getEnumFieldVerifier(bufferPosition), null, this.f92174o);
                return iM3787J;
            case 33:
            case 47:
                return wireType == 2 ? c60.m3816w(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 0 ? c60.m3778A(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 34:
            case 48:
                return wireType == 2 ? c60.m3817x(data, position, interfaceC13956lMutableCopyWithCapacity2, registers) : wireType == 0 ? c60.m3779B(tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            case 49:
                return wireType == 3 ? c60.m3808o(getMessageFieldSchema(bufferPosition), tag, data, position, limit, interfaceC13956lMutableCopyWithCapacity2, registers) : position;
            default:
                return position;
        }
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.f92162c || number > this.f92163d) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.f92160a[pos + 2];
    }

    private <E> void readGroupList(Object message, long offset, ird reader, upe<E> schema, yi5 extensionRegistry) throws IOException {
        reader.readGroupList(this.f92173n.mutableListAt(message, offset), schema, extensionRegistry);
    }

    private <E> void readMessageList(Object message, int typeAndOffset, ird reader, upe<E> schema, yi5 extensionRegistry) throws IOException {
        reader.readMessageList(this.f92173n.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private void readString(Object message, int typeAndOffset, ird reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            evh.m10280d0(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.f92166g) {
            evh.m10280d0(message, offset(typeAndOffset), reader.readString());
        } else {
            evh.m10280d0(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(Object message, int typeAndOffset, ird reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.f92173n.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.f92173n.mutableListAt(message, offset(typeAndOffset)));
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
        evh.m10271Y(message, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | evh.m10247A(message, j));
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        evh.m10271Y(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.f92160a.length / 3) - 1;
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
    private static void storeFieldData(p000.jr5 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.storeFieldData(jr5, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T message, int pos, Object field) {
        f92150G.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        f92150G.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    private static int type(int value) {
        return (value & 267386880) >>> 20;
    }

    private int typeAndOffsetAt(int pos) {
        return this.f92160a[pos + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrder(T r22, p000.qsi r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.writeFieldsInAscendingOrder(java.lang.Object, qsi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, p000.qsi r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.writeFieldsInDescendingOrder(java.lang.Object, qsi):void");
    }

    private <K, V> void writeMapHelper(qsi writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.f92176q.forMapMetadata(getMapFieldDefaultEntry(pos)), this.f92176q.forMapData(mapField));
        }
    }

    private void writeString(int fieldNumber, Object value, qsi writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (wj1) value);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(sth<UT, UB> schema, T message, qsi writer) throws IOException {
        schema.mo22246s(schema.mo22234g(message), writer);
    }

    /* JADX INFO: renamed from: b */
    public int m24180b() {
        return this.f92160a.length * 3;
    }

    @Override // p000.upe
    public boolean equals(T message, T other) {
        int length = this.f92160a.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(message, other, i)) {
                return false;
            }
        }
        if (!this.f92174o.mo22234g(message).equals(this.f92174o.mo22234g(other))) {
            return false;
        }
        if (this.f92165f) {
            return this.f92175p.mo3992c(message).equals(this.f92175p.mo3992c(other));
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009a. Please report as an issue. */
    @qp1
    /* JADX INFO: renamed from: f */
    public int m24181f(T message, byte[] data, int position, int limit, int endDelimited, c60.C2209b registers) throws IOException {
        Unsafe unsafe;
        int i;
        vsa<T> vsaVar;
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
        int iM3789L;
        int i15;
        int i16;
        vsa<T> vsaVar2 = this;
        T t2 = message;
        byte[] bArr3 = data;
        int i17 = limit;
        int i18 = endDelimited;
        c60.C2209b c2209b = registers;
        checkMutable(message);
        Unsafe unsafe2 = f92150G;
        int iM3784G = position;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 1048575;
        while (true) {
            if (iM3784G < i17) {
                int i24 = iM3784G + 1;
                byte b2 = bArr3[iM3784G];
                if (b2 < 0) {
                    int iM3785H = c60.m3785H(b2, bArr3, i24, c2209b);
                    i6 = c2209b.f15819a;
                    i24 = iM3785H;
                } else {
                    i6 = b2;
                }
                int i25 = i6 >>> 3;
                int i26 = i6 & 7;
                int iPositionForFieldNumber = i25 > i22 ? vsaVar2.positionForFieldNumber(i25, i19 / 3) : vsaVar2.positionForFieldNumber(i25);
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
                    int i27 = vsaVar2.f92160a[iPositionForFieldNumber + 1];
                    int iType = type(i27);
                    long jOffset = offset(i27);
                    int i28 = i6;
                    if (iType <= 17) {
                        int i29 = vsaVar2.f92160a[iPositionForFieldNumber + 2];
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
                                    evh.m10266T(t2, jOffset, c60.m3797d(bArr, i24));
                                    iM3784G = i24 + 8;
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
                                    evh.m10268V(t2, jOffset, c60.m3805l(bArr, i24));
                                    iM3784G = i24 + 4;
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
                                    iM3789L = c60.m3789L(bArr2, i24, c2209b);
                                    unsafe2.putLong(message, jOffset, c2209b.f15820b);
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iM3784G = iM3789L;
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
                                    iM3784G = c60.m3786I(bArr, i24, c2209b);
                                    unsafe2.putInt(t2, jOffset, c2209b.f15819a);
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
                                    unsafe2.putLong(message, jOffset, c60.m3803j(bArr, i24));
                                    iM3784G = i24 + 8;
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
                                    unsafe2.putInt(t2, jOffset, c60.m3801h(bArr, i24));
                                    iM3784G = i24 + 4;
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
                                    iM3784G = c60.m3789L(bArr, i24, c2209b);
                                    evh.m10261O(t2, jOffset, c2209b.f15820b != 0);
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
                                    iM3784G = isEnforceUtf8(i27) ? c60.m3783F(bArr, i24, c2209b) : c60.m3780C(bArr, i24, c2209b);
                                    unsafe2.putObject(t2, jOffset, c2209b.f15821c);
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
                                    Object objMutableMessageFieldForMerge = vsaVar2.mutableMessageFieldForMerge(t2, i13);
                                    iM3784G = c60.m3792O(objMutableMessageFieldForMerge, vsaVar2.getMessageFieldSchema(i13), data, i24, limit, registers);
                                    vsaVar2.storeMessageField(t2, i13, objMutableMessageFieldForMerge);
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
                                    iM3784G = c60.m3795b(bArr, i24, c2209b);
                                    unsafe2.putObject(t2, jOffset, c2209b.f15821c);
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
                                    iM3784G = c60.m3786I(bArr, i24, c2209b);
                                    int i33 = c2209b.f15819a;
                                    v98.InterfaceC13949e enumFieldVerifier = vsaVar2.getEnumFieldVerifier(i13);
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
                                        m24176a(message).m23577i(i14, Long.valueOf(i33));
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
                                    iM3784G = c60.m3786I(bArr, i24, c2209b);
                                    unsafe2.putInt(t2, jOffset, e72.decodeZigZag32(c2209b.f15819a));
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
                                    iM3789L = c60.m3789L(bArr2, i24, c2209b);
                                    unsafe2.putLong(message, jOffset, e72.decodeZigZag64(c2209b.f15820b));
                                    i21 = i12 | i30;
                                    i18 = endDelimited;
                                    i19 = i13;
                                    bArr3 = bArr2;
                                    iM3784G = iM3789L;
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
                                    Object objMutableMessageFieldForMerge2 = vsaVar2.mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    i7 = i25;
                                    i14 = i28;
                                    iM3784G = c60.m3791N(objMutableMessageFieldForMerge2, vsaVar2.getMessageFieldSchema(iPositionForFieldNumber), data, i24, limit, (i25 << 3) | 4, registers);
                                    vsaVar2.storeMessageField(t2, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
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
                                iM3784G = parseRepeatedField(message, data, i24, limit, i28, i7, i26, iPositionForFieldNumber, i27, iType, jOffset, registers);
                                if (iM3784G != i35) {
                                    vsaVar2 = this;
                                    t2 = message;
                                    bArr3 = data;
                                    i17 = limit;
                                    i18 = endDelimited;
                                    c2209b = registers;
                                    i20 = i16;
                                    i21 = i9;
                                    i19 = i11;
                                    i23 = i10;
                                    i22 = i7;
                                    unsafe2 = unsafe;
                                } else {
                                    i = endDelimited;
                                    i8 = iM3784G;
                                    i3 = i16;
                                }
                            } else {
                                i15 = i24;
                                unsafe = unsafe2;
                                i11 = iPositionForFieldNumber;
                                i16 = i28;
                                if (iType != 50) {
                                    iM3784G = parseOneofField(message, data, i15, limit, i16, i7, i26, i27, iType, jOffset, i11, registers);
                                    if (iM3784G != i15) {
                                        vsaVar2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        c2209b = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iM3784G;
                                        i3 = i16;
                                    }
                                } else if (i26 == 2) {
                                    iM3784G = parseMapField(message, data, i15, limit, i11, jOffset, registers);
                                    if (iM3784G != i15) {
                                        vsaVar2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        c2209b = registers;
                                        i20 = i16;
                                        i21 = i9;
                                        i19 = i11;
                                        i23 = i10;
                                        i22 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = iM3784G;
                                        i3 = i16;
                                    }
                                }
                            }
                        } else if (i26 == 2) {
                            v98.InterfaceC13956l interfaceC13956lMutableCopyWithCapacity2 = (v98.InterfaceC13956l) unsafe2.getObject(t2, jOffset);
                            if (!interfaceC13956lMutableCopyWithCapacity2.isModifiable()) {
                                int size = interfaceC13956lMutableCopyWithCapacity2.size();
                                interfaceC13956lMutableCopyWithCapacity2 = interfaceC13956lMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t2, jOffset, interfaceC13956lMutableCopyWithCapacity2);
                            }
                            iM3784G = c60.m3810q(vsaVar2.getMessageFieldSchema(iPositionForFieldNumber), i28, data, i24, limit, interfaceC13956lMutableCopyWithCapacity2, registers);
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
                    iM3784G = (!this.f92165f || registers.f15822d == yi5.getEmptyRegistry()) ? c60.m3784G(i3, data, i8, limit, m24176a(message), registers) : c60.m3800g(i3, data, i8, limit, message, this.f92164e, this.f92174o, registers);
                    t2 = message;
                    bArr3 = data;
                    i17 = limit;
                    i20 = i3;
                    vsaVar2 = this;
                    c2209b = registers;
                    i21 = i9;
                    i19 = i11;
                    i23 = i10;
                    i22 = i7;
                    unsafe2 = unsafe;
                    i18 = i;
                } else {
                    i5 = 1048575;
                    vsaVar = this;
                    i2 = i8;
                    i21 = i9;
                    i4 = i10;
                }
            } else {
                int i36 = i23;
                unsafe = unsafe2;
                i = i18;
                vsaVar = vsaVar2;
                i2 = iM3784G;
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
        uth uthVar = null;
        for (int i37 = vsaVar.f92170k; i37 < vsaVar.f92171l; i37++) {
            uthVar = (uth) filterMapUnknownEnumValues(message, vsaVar.f92169j[i37], uthVar, vsaVar.f92174o, message);
        }
        if (uthVar != null) {
            vsaVar.f92174o.mo22241n(t, uthVar);
        }
        if (i == 0) {
            if (i2 != limit) {
                throw be8.m3081h();
            }
        } else if (i2 > limit || i3 != i) {
            throw be8.m3081h();
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.upe
    public int getSerializedSize(T message) {
        int i;
        int i2;
        int i3;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z;
        int iM13320f;
        int iM13323i;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = f92150G;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.f92160a.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i7);
            int i9 = this.f92160a[i7 + 2];
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
            if (iType < cs5.f27250u2.m8671id() || iType > cs5.f27212H2.m8671id()) {
                i10 = 0;
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeUInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeDoubleSize = i72.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(message, jOffset);
                        iComputeBoolSize = object instanceof wj1 ? i72.computeBytesSize(iNumberAt, (wj1) object) : i72.computeStringSize(iNumberAt, (String) object);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = iqe.m13330p(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeBytesSize(iNumberAt, (wj1) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeUInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeEnumSize(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeSFixed32Size = i72.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeSInt32Size(iNumberAt, unsafe.getInt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.computeSInt64Size(iNumberAt, unsafe.getLong(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        iComputeBoolSize = i72.m12824b(iNumberAt, (psa) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = iqe.m13322h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 19:
                    z = false;
                    iM13320f = iqe.m13320f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 20:
                    z = false;
                    iM13320f = iqe.m13328n(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 21:
                    z = false;
                    iM13320f = iqe.m13340z(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 22:
                    z = false;
                    iM13320f = iqe.m13326l(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 23:
                    z = false;
                    iM13320f = iqe.m13322h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 24:
                    z = false;
                    iM13320f = iqe.m13320f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 25:
                    z = false;
                    iM13320f = iqe.m13315a(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 26:
                    iComputeBoolSize = iqe.m13337w(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = iqe.m13332r(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = iqe.m13317c(iNumberAt, (List) unsafe.getObject(message, jOffset));
                    i8 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = iqe.m13338x(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iComputeBoolSize;
                    break;
                case 30:
                    z = false;
                    iM13320f = iqe.m13318d(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 31:
                    z = false;
                    iM13320f = iqe.m13320f(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 32:
                    z = false;
                    iM13320f = iqe.m13322h(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 33:
                    z = false;
                    iM13320f = iqe.m13333s(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 34:
                    z = false;
                    iM13320f = iqe.m13335u(iNumberAt, (List) unsafe.getObject(message, jOffset), false);
                    i8 += iM13320f;
                    break;
                case 35:
                    iM13323i = iqe.m13323i((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iM13323i = iqe.m13321g((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iM13323i = iqe.m13329o((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iM13323i = iqe.m13305A((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iM13323i = iqe.m13327m((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iM13323i = iqe.m13323i((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iM13323i = iqe.m13321g((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iM13323i = iqe.m13316b((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iM13323i = iqe.m13339y((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iM13323i = iqe.m13319e((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iM13323i = iqe.m13321g((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iM13323i = iqe.m13323i((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iM13323i = iqe.m13334t((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iM13323i = iqe.m13336v((List) unsafe.getObject(message, jOffset));
                    if (iM13323i > 0) {
                        if (this.f92168i) {
                            unsafe.putInt(message, i10, iM13323i);
                        }
                        iComputeTagSize = i72.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(iM13323i);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iM13323i;
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = iqe.m13325k(iNumberAt, (List) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.f92176q.getSerializedSize(iNumberAt, unsafe.getObject(message, jOffset), getMapFieldDefaultEntry(i7));
                    i8 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeDoubleSize(iNumberAt, 0.0d);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeFloatSize(iNumberAt, 0.0f);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeUInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = i72.computeFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeBoolSize(iNumberAt, true);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        Object object2 = unsafe.getObject(message, jOffset);
                        iComputeBoolSize = object2 instanceof wj1 ? i72.computeBytesSize(iNumberAt, (wj1) object2) : i72.computeStringSize(iNumberAt, (String) object2);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = iqe.m13330p(iNumberAt, unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeBytesSize(iNumberAt, (wj1) unsafe.getObject(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeUInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeEnumSize(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeSFixed32Size = i72.computeSFixed32Size(iNumberAt, 0);
                        i8 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeSFixed64Size(iNumberAt, 0L);
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeSInt32Size(iNumberAt, oneofIntAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.computeSInt64Size(iNumberAt, oneofLongAt(message, jOffset));
                        i8 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i7)) {
                        iComputeBoolSize = i72.m12824b(iNumberAt, (psa) unsafe.getObject(message, jOffset), getMessageFieldSchema(i7));
                        i8 += iComputeBoolSize;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i8 + getUnknownFieldsSerializedSize(this.f92174o, message);
        return this.f92165f ? unknownFieldsSerializedSize + this.f92175p.mo3992c(message).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // p000.upe
    public int hashCode(T message) {
        int i;
        int iHashLong;
        int length = this.f92160a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(Double.doubleToLongBits(evh.m10299v(message, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(evh.m10301x(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(evh.m10250D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(evh.m10250D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(evh.m10250D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = v98.hashBoolean(evh.m10294q(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) evh.m10252F(message, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    Object objM10252F = evh.m10252F(message, jOffset);
                    if (objM10252F != null) {
                        iHashCode = objM10252F.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = evh.m10252F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(evh.m10250D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = evh.m10247A(message, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = v98.hashLong(evh.m10250D(message, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    Object objM10252F2 = evh.m10252F(message, jOffset);
                    if (objM10252F2 != null) {
                        iHashCode = objM10252F2.hashCode();
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
                    iHashLong = evh.m10252F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = evh.m10252F(message, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = v98.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, jOffset)));
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
                        iHashLong = v98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = v98.hashLong(oneofLongAt(message, jOffset));
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
                        iHashLong = v98.hashLong(oneofLongAt(message, jOffset));
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
                        iHashLong = v98.hashBoolean(oneofBooleanAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) evh.m10252F(message, jOffset)).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = evh.m10252F(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = evh.m10252F(message, jOffset).hashCode();
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
                        iHashLong = v98.hashLong(oneofLongAt(message, jOffset));
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
                        iHashLong = v98.hashLong(oneofLongAt(message, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = evh.m10252F(message, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f92174o.mo22234g(message).hashCode();
        return this.f92165f ? (iHashCode2 * 53) + this.f92175p.mo3992c(message).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // p000.upe
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
            int r2 = r6.f92170k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f92169j
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.f92160a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = p000.vsa.f92150G
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
            upe r0 = r6.getMessageFieldSchema(r11)
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
            upe r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f92165f
            if (r0 == 0) goto Lc2
            cj5<?> r0 = r6.f92175p
            zr5 r0 = r0.mo3992c(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // p000.upe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vsa.makeImmutable(java.lang.Object):void");
    }

    @Override // p000.upe
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i = 0; i < this.f92160a.length; i += 3) {
            mergeSingleField(message, other, i);
        }
        iqe.m13311G(this.f92174o, message, other);
        if (this.f92165f) {
            iqe.m13309E(this.f92175p, message, other);
        }
    }

    @Override // p000.upe
    public T newInstance() {
        return (T) this.f92172m.newInstance(this.f92164e);
    }

    @Override // p000.upe
    public void writeTo(T message, qsi writer) throws IOException {
        if (writer.fieldOrder() == qsi.EnumC11672a.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    private boolean isFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (evh.m10247A(message, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(evh.m10299v(message, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(evh.m10301x(message, jOffset)) != 0;
            case 2:
                return evh.m10250D(message, jOffset) != 0;
            case 3:
                return evh.m10250D(message, jOffset) != 0;
            case 4:
                return evh.m10247A(message, jOffset) != 0;
            case 5:
                return evh.m10250D(message, jOffset) != 0;
            case 6:
                return evh.m10247A(message, jOffset) != 0;
            case 7:
                return evh.m10294q(message, jOffset);
            case 8:
                Object objM10252F = evh.m10252F(message, jOffset);
                if (objM10252F instanceof String) {
                    return !((String) objM10252F).isEmpty();
                }
                if (objM10252F instanceof wj1) {
                    return !wj1.f94379e.equals(objM10252F);
                }
                throw new IllegalArgumentException();
            case 9:
                return evh.m10252F(message, jOffset) != null;
            case 10:
                return !wj1.f94379e.equals(evh.m10252F(message, jOffset));
            case 11:
                return evh.m10247A(message, jOffset) != 0;
            case 12:
                return evh.m10247A(message, jOffset) != 0;
            case 13:
                return evh.m10247A(message, jOffset) != 0;
            case 14:
                return evh.m10250D(message, jOffset) != 0;
            case 15:
                return evh.m10247A(message, jOffset) != 0;
            case 16:
                return evh.m10250D(message, jOffset) != 0;
            case 17:
                return evh.m10252F(message, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.f92162c || number > this.f92163d) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    @Override // p000.upe
    public void mergeFrom(T message, ird reader, yi5 extensionRegistry) throws Throwable {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.f92174o, this.f92175p, message, reader, extensionRegistry);
    }

    private boolean equals(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(message, other, pos) && Double.doubleToLongBits(evh.m10299v(message, jOffset)) == Double.doubleToLongBits(evh.m10299v(other, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(message, other, pos) && Float.floatToIntBits(evh.m10301x(message, jOffset)) == Float.floatToIntBits(evh.m10301x(other, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(message, other, pos) && evh.m10250D(message, jOffset) == evh.m10250D(other, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(message, other, pos) && evh.m10250D(message, jOffset) == evh.m10250D(other, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(message, other, pos) && evh.m10250D(message, jOffset) == evh.m10250D(other, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(message, other, pos) && evh.m10294q(message, jOffset) == evh.m10294q(other, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(message, other, pos) && iqe.m13312H(evh.m10252F(message, jOffset), evh.m10252F(other, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(message, other, pos) && iqe.m13312H(evh.m10252F(message, jOffset), evh.m10252F(other, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(message, other, pos) && iqe.m13312H(evh.m10252F(message, jOffset), evh.m10252F(other, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(message, other, pos) && evh.m10250D(message, jOffset) == evh.m10250D(other, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(message, other, pos) && evh.m10247A(message, jOffset) == evh.m10247A(other, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(message, other, pos) && evh.m10250D(message, jOffset) == evh.m10250D(other, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(message, other, pos) && iqe.m13312H(evh.m10252F(message, jOffset), evh.m10252F(other, jOffset))) {
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
                if (isOneofCaseEqual(message, other, pos) && iqe.m13312H(evh.m10252F(message, jOffset), evh.m10252F(other, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p000.upe
    public void mergeFrom(T message, byte[] data, int position, int limit, c60.C2209b registers) throws IOException {
        m24181f(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object message, int typeAndOffset, upe schema) {
        return schema.isInitialized(evh.m10252F(message, offset(typeAndOffset)));
    }
}
