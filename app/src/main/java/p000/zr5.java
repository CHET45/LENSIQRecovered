package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.gpi;
import p000.nx8;
import p000.psa;
import p000.v98;
import p000.zr5.InterfaceC16225c;

/* JADX INFO: loaded from: classes3.dex */
public final class zr5<T extends InterfaceC16225c<T>> {

    /* JADX INFO: renamed from: d */
    public static final zr5<?> f105815d = new zr5<>(true);

    /* JADX INFO: renamed from: a */
    public final wrf<T, Object> f105816a;

    /* JADX INFO: renamed from: b */
    public boolean f105817b;

    /* JADX INFO: renamed from: c */
    public boolean f105818c;

    /* JADX INFO: renamed from: zr5$a */
    public static /* synthetic */ class C16223a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105819a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f105820b;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f105820b = iArr;
            try {
                iArr[gpi.EnumC6460b.f40762c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40763d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40764e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40765f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40766m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40748C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40749F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40750H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40752M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40754N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40751L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40755Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40757X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40759Z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40753M1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40756V1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40760Z1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f105820b[gpi.EnumC6460b.f40758Y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[gpi.EnumC6461c.values().length];
            f105819a = iArr2;
            try {
                iArr2[gpi.EnumC6461c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f105819a[gpi.EnumC6461c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f105819a[gpi.EnumC6461c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f105819a[gpi.EnumC6461c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f105819a[gpi.EnumC6461c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f105819a[gpi.EnumC6461c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f105819a[gpi.EnumC6461c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f105819a[gpi.EnumC6461c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f105819a[gpi.EnumC6461c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: zr5$b */
    public static final class C16224b<T extends InterfaceC16225c<T>> {

        /* JADX INFO: renamed from: a */
        public wrf<T, Object> f105821a;

        /* JADX INFO: renamed from: b */
        public boolean f105822b;

        /* JADX INFO: renamed from: c */
        public boolean f105823c;

        /* JADX INFO: renamed from: d */
        public boolean f105824d;

        public /* synthetic */ C16224b(C16223a c16223a) {
            this();
        }

        private zr5<T> buildImpl(boolean partial) {
            if (this.f105821a.isEmpty()) {
                return zr5.emptySet();
            }
            this.f105823c = false;
            wrf<T, Object> wrfVarCloneAllFieldsMap = this.f105821a;
            if (this.f105824d) {
                wrfVarCloneAllFieldsMap = zr5.cloneAllFieldsMap(wrfVarCloneAllFieldsMap, false, false);
                replaceBuilders(wrfVarCloneAllFieldsMap, partial);
            }
            zr5<T> zr5Var = new zr5<>(wrfVarCloneAllFieldsMap, null);
            zr5Var.f105818c = this.f105822b;
            return zr5Var;
        }

        private void ensureIsMutable() {
            if (this.f105823c) {
                return;
            }
            this.f105821a = zr5.cloneAllFieldsMap(this.f105821a, true, false);
            this.f105823c = true;
        }

        public static <T extends InterfaceC16225c<T>> C16224b<T> fromFieldSet(zr5<T> fieldSet) {
            C16224b<T> c16224b = new C16224b<>(zr5.cloneAllFieldsMap(fieldSet.f105816a, true, false));
            c16224b.f105822b = fieldSet.f105818c;
            return c16224b;
        }

        private void mergeFromField(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            boolean z = value instanceof nx8;
            if (key.isRepeated()) {
                if (z) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                List arrayList = (List) m27049a(key);
                List list = (List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(size);
                    this.f105821a.put(key, arrayList);
                }
                for (int i = 0; i < size; i++) {
                    arrayList.add(zr5.cloneIfMutable(list.get(i)));
                }
                return;
            }
            if (key.getLiteJavaType() != gpi.EnumC6461c.MESSAGE) {
                if (z) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                this.f105821a.put(key, zr5.cloneIfMutable(value));
                return;
            }
            Object objM27049a = m27049a(key);
            if (objM27049a == null) {
                this.f105821a.put(key, zr5.cloneIfMutable(value));
                if (z) {
                    this.f105822b = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((nx8) value).getValue();
            }
            if (objM27049a instanceof psa.InterfaceC11106a) {
                key.internalMergeFrom((psa.InterfaceC11106a) objM27049a, (psa) value);
            } else {
                this.f105821a.put(key, key.internalMergeFrom(((psa) objM27049a).toBuilder(), (psa) value).build());
            }
        }

        private static Object replaceBuilder(Object value, boolean partial) {
            if (!(value instanceof psa.InterfaceC11106a)) {
                return value;
            }
            psa.InterfaceC11106a interfaceC11106a = (psa.InterfaceC11106a) value;
            return partial ? interfaceC11106a.buildPartial() : interfaceC11106a.build();
        }

        private static <T extends InterfaceC16225c<T>> void replaceBuilders(wrf<T, Object> fieldMap, boolean partial) {
            int numArrayEntries = fieldMap.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                replaceBuilders(fieldMap.getArrayEntryAt(i), partial);
            }
            Iterator it = fieldMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next(), partial);
            }
        }

        private void verifyType(final T descriptor, final Object value) {
            if (zr5.isValidType(descriptor.getLiteType(), value)) {
                return;
            }
            if (descriptor.getLiteType().getJavaType() != gpi.EnumC6461c.MESSAGE || !(value instanceof psa.InterfaceC11106a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m27049a(final T descriptor) {
            Object obj = this.f105821a.get(descriptor);
            return obj instanceof nx8 ? ((nx8) obj).getValue() : obj;
        }

        public void addRepeatedField(final T descriptor, final Object value) {
            List arrayList;
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f105824d = this.f105824d || (value instanceof psa.InterfaceC11106a);
            verifyType(descriptor, value);
            Object objM27049a = m27049a(descriptor);
            if (objM27049a == null) {
                arrayList = new ArrayList();
                this.f105821a.put(descriptor, arrayList);
            } else {
                arrayList = (List) objM27049a;
            }
            arrayList.add(value);
        }

        /* JADX INFO: renamed from: b */
        public Object m27050b(final T descriptor, final int index) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM27049a = m27049a(descriptor);
            if (objM27049a != null) {
                return ((List) objM27049a).get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public zr5<T> build() {
            return buildImpl(false);
        }

        public zr5<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(final T descriptor) {
            ensureIsMutable();
            this.f105821a.remove(descriptor);
            if (this.f105821a.isEmpty()) {
                this.f105822b = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.f105822b) {
                return this.f105821a.isImmutable() ? this.f105821a : Collections.unmodifiableMap(this.f105821a);
            }
            wrf wrfVarCloneAllFieldsMap = zr5.cloneAllFieldsMap(this.f105821a, false, true);
            if (this.f105821a.isImmutable()) {
                wrfVarCloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(wrfVarCloneAllFieldsMap, true);
            }
            return wrfVarCloneAllFieldsMap;
        }

        public Object getField(final T descriptor) {
            return replaceBuilders(descriptor, m27049a(descriptor), true);
        }

        public Object getRepeatedField(final T descriptor, final int index) {
            if (this.f105824d) {
                ensureIsMutable();
            }
            return replaceBuilder(m27050b(descriptor, index), true);
        }

        public int getRepeatedFieldCount(final T descriptor) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM27049a = m27049a(descriptor);
            if (objM27049a == null) {
                return 0;
            }
            return ((List) objM27049a).size();
        }

        public boolean hasField(final T descriptor) {
            if (descriptor.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f105821a.get(descriptor) != null;
        }

        public boolean isInitialized() {
            int numArrayEntries = this.f105821a.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                if (!zr5.isInitialized(this.f105821a.getArrayEntryAt(i))) {
                    return false;
                }
            }
            Iterator it = this.f105821a.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!zr5.isInitialized((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(final zr5<T> other) {
            ensureIsMutable();
            int numArrayEntries = other.f105816a.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                mergeFromField(other.f105816a.getArrayEntryAt(i));
            }
            Iterator it = other.f105816a.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t, Object obj) {
            ensureIsMutable();
            if (!t.isRepeated()) {
                verifyType(t, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = arrayList.get(i);
                    verifyType(t, obj2);
                    this.f105824d = this.f105824d || (obj2 instanceof psa.InterfaceC11106a);
                }
                obj = arrayList;
            }
            if (obj instanceof nx8) {
                this.f105822b = true;
            }
            this.f105824d = this.f105824d || (obj instanceof psa.InterfaceC11106a);
            this.f105821a.put(t, obj);
        }

        public void setRepeatedField(final T descriptor, final int index, final Object value) {
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f105824d = this.f105824d || (value instanceof psa.InterfaceC11106a);
            Object objM27049a = m27049a(descriptor);
            if (objM27049a == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(descriptor, value);
            ((List) objM27049a).set(index, value);
        }

        private C16224b() {
            this(wrf.m24766g());
        }

        private C16224b(wrf<T, Object> fields) {
            this.f105821a = fields;
            this.f105823c = true;
        }

        private static <T extends InterfaceC16225c<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean partial) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), partial));
        }

        private static <T extends InterfaceC16225c<T>> Object replaceBuilders(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.getLiteJavaType() != gpi.EnumC6461c.MESSAGE) {
                return value;
            }
            if (descriptor.isRepeated()) {
                if (value instanceof List) {
                    List arrayList = (List) value;
                    for (int i = 0; i < arrayList.size(); i++) {
                        Object obj = arrayList.get(i);
                        Object objReplaceBuilder = replaceBuilder(obj, partial);
                        if (objReplaceBuilder != obj) {
                            if (arrayList == value) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + value.getClass());
            }
            return replaceBuilder(value, partial);
        }
    }

    /* JADX INFO: renamed from: zr5$c */
    public interface InterfaceC16225c<T extends InterfaceC16225c<T>> extends Comparable<T> {
        v98.InterfaceC13948d<?> getEnumType();

        gpi.EnumC6461c getLiteJavaType();

        gpi.EnumC6460b getLiteType();

        int getNumber();

        psa.InterfaceC11106a internalMergeFrom(psa.InterfaceC11106a to, psa from);

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ zr5(wrf wrfVar, C16223a c16223a) {
        this(wrfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC16225c<T>> wrf<T, Object> cloneAllFieldsMap(wrf<T, Object> fields, boolean copyList, boolean resolveLazyFields) {
        wrf<T, Object> wrfVarM24766g = wrf.m24766g();
        int numArrayEntries = fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            cloneFieldEntry(wrfVarM24766g, fields.getArrayEntryAt(i), copyList, resolveLazyFields);
        }
        Iterator it = fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(wrfVarM24766g, (Map.Entry) it.next(), copyList, resolveLazyFields);
        }
        return wrfVarM24766g;
    }

    private static <T extends InterfaceC16225c<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList, boolean resolveLazyFields) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (resolveLazyFields && (value instanceof nx8)) {
            map.put(key, ((nx8) value).getValue());
        } else if (copyList && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object value) {
        if (!(value instanceof byte[])) {
            return value;
        }
        byte[] bArr = (byte[]) value;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeFieldSize(final InterfaceC16225c<?> descriptor, final Object value) {
        gpi.EnumC6460b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            return m27042h(liteType, number, value);
        }
        List list = (List) value;
        int size = list.size();
        int i = 0;
        if (!descriptor.isPacked()) {
            int iM27042h = 0;
            while (i < size) {
                iM27042h += m27042h(liteType, number, list.get(i));
                i++;
            }
            return iM27042h;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM27043i = 0;
        while (i < size) {
            iM27043i += m27043i(liteType, list.get(i));
            i++;
        }
        return i72.computeTagSize(number) + iM27043i + i72.computeUInt32SizeNoTag(iM27043i);
    }

    public static <T extends InterfaceC16225c<T>> zr5<T> emptySet() {
        return (zr5<T>) f105815d;
    }

    /* JADX INFO: renamed from: h */
    public static int m27042h(final gpi.EnumC6460b type, final int number, final Object value) {
        int iComputeTagSize = i72.computeTagSize(number);
        if (type == gpi.EnumC6460b.f40752M) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + m27043i(type, value);
    }

    /* JADX INFO: renamed from: i */
    public static int m27043i(final gpi.EnumC6460b type, final Object value) {
        switch (C16223a.f105820b[type.ordinal()]) {
            case 1:
                return i72.computeDoubleSizeNoTag(((Double) value).doubleValue());
            case 2:
                return i72.computeFloatSizeNoTag(((Float) value).floatValue());
            case 3:
                return i72.computeInt64SizeNoTag(((Long) value).longValue());
            case 4:
                return i72.computeUInt64SizeNoTag(((Long) value).longValue());
            case 5:
                return i72.computeInt32SizeNoTag(((Integer) value).intValue());
            case 6:
                return i72.computeFixed64SizeNoTag(((Long) value).longValue());
            case 7:
                return i72.computeFixed32SizeNoTag(((Integer) value).intValue());
            case 8:
                return i72.computeBoolSizeNoTag(((Boolean) value).booleanValue());
            case 9:
                return i72.computeGroupSizeNoTag((psa) value);
            case 10:
                return value instanceof nx8 ? i72.computeLazyFieldSizeNoTag((nx8) value) : i72.computeMessageSizeNoTag((psa) value);
            case 11:
                return value instanceof wj1 ? i72.computeBytesSizeNoTag((wj1) value) : i72.computeStringSizeNoTag((String) value);
            case 12:
                return value instanceof wj1 ? i72.computeBytesSizeNoTag((wj1) value) : i72.computeByteArraySizeNoTag((byte[]) value);
            case 13:
                return i72.computeUInt32SizeNoTag(((Integer) value).intValue());
            case 14:
                return i72.computeSFixed32SizeNoTag(((Integer) value).intValue());
            case 15:
                return i72.computeSFixed64SizeNoTag(((Long) value).longValue());
            case 16:
                return i72.computeSInt32SizeNoTag(((Integer) value).intValue());
            case 17:
                return i72.computeSInt64SizeNoTag(((Long) value).longValue());
            case 18:
                return value instanceof v98.InterfaceC13947c ? i72.computeEnumSizeNoTag(((v98.InterfaceC13947c) value).getNumber()) : i72.computeEnumSizeNoTag(((Integer) value).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean isMessageFieldValueInitialized(Object value) {
        if (value instanceof ssa) {
            return ((ssa) value).isInitialized();
        }
        if (value instanceof nx8) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(final gpi.EnumC6460b type, final Object value) {
        v98.m23881a(value);
        switch (C16223a.f105819a[type.getJavaType().ordinal()]) {
            case 7:
                if (!(value instanceof wj1) && !(value instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(value instanceof Integer) && !(value instanceof v98.InterfaceC13947c)) {
                    break;
                }
                break;
            case 9:
                if (!(value instanceof psa) && !(value instanceof nx8)) {
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m27044k(final gpi.EnumC6460b type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.getWireType();
    }

    /* JADX INFO: renamed from: m */
    public static void m27045m(final i72 output, final gpi.EnumC6460b type, final int number, final Object value) throws IOException {
        if (type == gpi.EnumC6460b.f40752M) {
            output.writeGroup(number, (psa) value);
        } else {
            output.writeTag(number, m27044k(type, false));
            m27046n(output, type, value);
        }
    }

    private void mergeFromField(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof nx8;
        if (key.isRepeated()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.f105816a.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != gpi.EnumC6461c.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f105816a.put(key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.f105816a.put(key, cloneIfMutable(value));
            if (z) {
                this.f105818c = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((nx8) value).getValue();
        }
        this.f105816a.put(key, key.internalMergeFrom(((psa) field2).toBuilder(), (psa) value).build());
    }

    /* JADX INFO: renamed from: n */
    public static void m27046n(final i72 output, final gpi.EnumC6460b type, final Object value) throws IOException {
        switch (C16223a.f105820b[type.ordinal()]) {
            case 1:
                output.writeDoubleNoTag(((Double) value).doubleValue());
                break;
            case 2:
                output.writeFloatNoTag(((Float) value).floatValue());
                break;
            case 3:
                output.writeInt64NoTag(((Long) value).longValue());
                break;
            case 4:
                output.writeUInt64NoTag(((Long) value).longValue());
                break;
            case 5:
                output.writeInt32NoTag(((Integer) value).intValue());
                break;
            case 6:
                output.writeFixed64NoTag(((Long) value).longValue());
                break;
            case 7:
                output.writeFixed32NoTag(((Integer) value).intValue());
                break;
            case 8:
                output.writeBoolNoTag(((Boolean) value).booleanValue());
                break;
            case 9:
                output.writeGroupNoTag((psa) value);
                break;
            case 10:
                output.writeMessageNoTag((psa) value);
                break;
            case 11:
                if (!(value instanceof wj1)) {
                    output.writeStringNoTag((String) value);
                } else {
                    output.writeBytesNoTag((wj1) value);
                }
                break;
            case 12:
                if (!(value instanceof wj1)) {
                    output.writeByteArrayNoTag((byte[]) value);
                } else {
                    output.writeBytesNoTag((wj1) value);
                }
                break;
            case 13:
                output.writeUInt32NoTag(((Integer) value).intValue());
                break;
            case 14:
                output.writeSFixed32NoTag(((Integer) value).intValue());
                break;
            case 15:
                output.writeSFixed64NoTag(((Long) value).longValue());
                break;
            case 16:
                output.writeSInt32NoTag(((Integer) value).intValue());
                break;
            case 17:
                output.writeSInt64NoTag(((Long) value).longValue());
                break;
            case 18:
                if (!(value instanceof v98.InterfaceC13947c)) {
                    output.writeEnumNoTag(((Integer) value).intValue());
                } else {
                    output.writeEnumNoTag(((v98.InterfaceC13947c) value).getNumber());
                }
                break;
        }
    }

    public static <T extends InterfaceC16225c<T>> C16224b<T> newBuilder() {
        return new C16224b<>((C16223a) null);
    }

    public static <T extends InterfaceC16225c<T>> zr5<T> newFieldSet() {
        return new zr5<>();
    }

    public static Object readPrimitiveField(e72 input, final gpi.EnumC6460b type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? gpi.m11820b(input, type, gpi.EnumC6462d.f40781b) : gpi.m11820b(input, type, gpi.EnumC6462d.f40780a);
    }

    private void verifyType(final T descriptor, final Object value) {
        if (!isValidType(descriptor.getLiteType(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
        }
    }

    public static void writeField(final InterfaceC16225c<?> descriptor, final Object value, final i72 output) throws IOException {
        gpi.EnumC6460b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            if (value instanceof nx8) {
                m27045m(output, liteType, number, ((nx8) value).getValue());
                return;
            } else {
                m27045m(output, liteType, number, value);
                return;
            }
        }
        List list = (List) value;
        int size = list.size();
        int i = 0;
        if (!descriptor.isPacked()) {
            while (i < size) {
                m27045m(output, liteType, number, list.get(i));
                i++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            output.writeTag(number, 2);
            int iM27043i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                iM27043i += m27043i(liteType, list.get(i2));
            }
            output.writeUInt32NoTag(iM27043i);
            while (i < size) {
                m27046n(output, liteType, list.get(i));
                i++;
            }
        }
    }

    public void addRepeatedField(final T descriptor, final Object value) {
        List arrayList;
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(descriptor, value);
        Object field = getField(descriptor);
        if (field == null) {
            arrayList = new ArrayList();
            this.f105816a.put(descriptor, arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(value);
    }

    public void clear() {
        this.f105816a.clear();
        this.f105818c = false;
    }

    public void clearField(final T descriptor) {
        this.f105816a.remove(descriptor);
        if (this.f105816a.isEmpty()) {
            this.f105818c = false;
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof zr5) {
            return this.f105816a.equals(((zr5) o).f105816a);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        if (!this.f105818c) {
            return this.f105816a.isImmutable() ? this.f105816a : Collections.unmodifiableMap(this.f105816a);
        }
        wrf wrfVarCloneAllFieldsMap = cloneAllFieldsMap(this.f105816a, false, true);
        if (this.f105816a.isImmutable()) {
            wrfVarCloneAllFieldsMap.makeImmutable();
        }
        return wrfVarCloneAllFieldsMap;
    }

    public Object getField(final T descriptor) {
        Object obj = this.f105816a.get(descriptor);
        return obj instanceof nx8 ? ((nx8) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        int messageSetSerializedSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.f105816a.getArrayEntryAt(i));
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(final T descriptor, final int index) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field != null) {
            return ((List) field).get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(final T descriptor) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        int iComputeFieldSize = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f105816a.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((InterfaceC16225c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((InterfaceC16225c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(final T descriptor) {
        if (descriptor.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f105816a.get(descriptor) != null;
    }

    public int hashCode() {
        return this.f105816a.hashCode();
    }

    public boolean isImmutable() {
        return this.f105817b;
    }

    public boolean isInitialized() {
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            if (!isInitialized(this.f105816a.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return m27048l() ? Collections.emptyIterator() : this.f105818c ? new nx8.C10106c(this.f105816a.entrySet().iterator()) : this.f105816a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: j */
    public Iterator<Map.Entry<T, Object>> m27047j() {
        return m27048l() ? Collections.emptyIterator() : this.f105818c ? new nx8.C10106c(this.f105816a.m24768f().iterator()) : this.f105816a.m24768f().iterator();
    }

    /* JADX INFO: renamed from: l */
    public boolean m27048l() {
        return this.f105816a.isEmpty();
    }

    public void makeImmutable() {
        if (this.f105817b) {
            return;
        }
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f105816a.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof u27) {
                ((u27) arrayEntryAt.getValue()).m23041E();
            }
        }
        this.f105816a.makeImmutable();
        this.f105817b = true;
    }

    public void mergeFrom(final zr5<T> other) {
        int numArrayEntries = other.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            mergeFromField(other.f105816a.getArrayEntryAt(i));
        }
        Iterator it = other.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    public void setField(T t, Object obj) {
        if (!t.isRepeated()) {
            verifyType(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof nx8) {
            this.f105818c = true;
        }
        this.f105816a.put(t, obj);
    }

    public void setRepeatedField(final T descriptor, final int index, final Object value) {
        if (!descriptor.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(descriptor);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(descriptor, value);
        ((List) field).set(index, value);
    }

    public void writeMessageSetTo(final i72 output) throws IOException {
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            writeMessageSetTo(this.f105816a.getArrayEntryAt(i), output);
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), output);
        }
    }

    public void writeTo(final i72 output) throws IOException {
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f105816a.getArrayEntryAt(i);
            writeField((InterfaceC16225c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), output);
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            writeField((InterfaceC16225c) entry.getKey(), entry.getValue(), output);
        }
    }

    private zr5() {
        this.f105816a = wrf.m24766g();
    }

    public zr5<T> clone() {
        zr5<T> zr5VarNewFieldSet = newFieldSet();
        int numArrayEntries = this.f105816a.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f105816a.getArrayEntryAt(i);
            zr5VarNewFieldSet.setField((InterfaceC16225c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.f105816a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zr5VarNewFieldSet.setField((InterfaceC16225c) entry.getKey(), entry.getValue());
        }
        zr5VarNewFieldSet.f105818c = this.f105818c;
        return zr5VarNewFieldSet;
    }

    private zr5(final boolean dummy) {
        this(wrf.m24766g());
        makeImmutable();
    }

    private int getMessageSetSerializedSize(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == gpi.EnumC6461c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof nx8) {
                return i72.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (nx8) value);
            }
            return i72.computeMessageSetExtensionSize(entry.getKey().getNumber(), (psa) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC16225c<T>> boolean isInitialized(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != gpi.EnumC6461c.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!isMessageFieldValueInitialized(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(final Map.Entry<T, Object> entry, final i72 output) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == gpi.EnumC6461c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof nx8) {
                output.writeRawMessageSetExtension(entry.getKey().getNumber(), ((nx8) value).toByteString());
                return;
            } else {
                output.writeMessageSetExtension(entry.getKey().getNumber(), (psa) value);
                return;
            }
        }
        writeField(key, entry.getValue(), output);
    }

    private zr5(wrf<T, Object> fields) {
        this.f105816a = fields;
        makeImmutable();
    }
}
