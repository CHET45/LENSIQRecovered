package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.as5.InterfaceC1587c;
import p000.hpi;
import p000.ox8;
import p000.qsa;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class as5<T extends InterfaceC1587c<T>> {

    /* JADX INFO: renamed from: d */
    public static final int f11733d = 16;

    /* JADX INFO: renamed from: e */
    public static final as5 f11734e = new as5(true);

    /* JADX INFO: renamed from: a */
    public final vrf<T, Object> f11735a;

    /* JADX INFO: renamed from: b */
    public boolean f11736b;

    /* JADX INFO: renamed from: c */
    public boolean f11737c;

    /* JADX INFO: renamed from: as5$a */
    public static /* synthetic */ class C1585a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11738a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11739b;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f11739b = iArr;
            try {
                iArr[hpi.EnumC6968b.f44496c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44497d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44498e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44499f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44500m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44482C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44483F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44484H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44486M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44488N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44485L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44489Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44491X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44493Z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44487M1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44490V1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44494Z1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11739b[hpi.EnumC6968b.f44492Y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[hpi.EnumC6969c.values().length];
            f11738a = iArr2;
            try {
                iArr2[hpi.EnumC6969c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11738a[hpi.EnumC6969c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11738a[hpi.EnumC6969c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11738a[hpi.EnumC6969c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11738a[hpi.EnumC6969c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11738a[hpi.EnumC6969c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11738a[hpi.EnumC6969c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11738a[hpi.EnumC6969c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11738a[hpi.EnumC6969c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: as5$b */
    public static final class C1586b<T extends InterfaceC1587c<T>> {

        /* JADX INFO: renamed from: a */
        public vrf<T, Object> f11740a;

        /* JADX INFO: renamed from: b */
        public boolean f11741b;

        /* JADX INFO: renamed from: c */
        public boolean f11742c;

        /* JADX INFO: renamed from: d */
        public boolean f11743d;

        public /* synthetic */ C1586b(C1585a c1585a) {
            this();
        }

        private as5<T> buildImpl(boolean partial) {
            if (this.f11740a.isEmpty()) {
                return as5.emptySet();
            }
            this.f11742c = false;
            vrf<T, Object> vrfVarCloneAllFieldsMap = this.f11740a;
            if (this.f11743d) {
                vrfVarCloneAllFieldsMap = as5.cloneAllFieldsMap(vrfVarCloneAllFieldsMap, false);
                replaceBuilders(vrfVarCloneAllFieldsMap, partial);
            }
            as5<T> as5Var = new as5<>(vrfVarCloneAllFieldsMap, null);
            as5Var.f11737c = this.f11741b;
            return as5Var;
        }

        private void ensureIsMutable() {
            if (this.f11742c) {
                return;
            }
            this.f11740a = as5.cloneAllFieldsMap(this.f11740a, true);
            this.f11742c = true;
        }

        public static <T extends InterfaceC1587c<T>> C1586b<T> fromFieldSet(as5<T> fieldSet) {
            C1586b<T> c1586b = new C1586b<>(as5.cloneAllFieldsMap(fieldSet.f11735a, true));
            c1586b.f11741b = fieldSet.f11737c;
            return c1586b;
        }

        private void mergeFromField(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof ox8) {
                value = ((ox8) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) m2646a(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f11740a.put(key, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(as5.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != hpi.EnumC6969c.MESSAGE) {
                this.f11740a.put(key, as5.cloneIfMutable(value));
                return;
            }
            Object objM2646a = m2646a(key);
            if (objM2646a == null) {
                this.f11740a.put(key, as5.cloneIfMutable(value));
            } else if (objM2646a instanceof qsa.InterfaceC11668a) {
                key.internalMergeFrom((qsa.InterfaceC11668a) objM2646a, (qsa) value);
            } else {
                this.f11740a.put(key, key.internalMergeFrom(((qsa) objM2646a).toBuilder(), (qsa) value).build());
            }
        }

        private static Object replaceBuilder(Object value, boolean partial) {
            if (!(value instanceof qsa.InterfaceC11668a)) {
                return value;
            }
            qsa.InterfaceC11668a interfaceC11668a = (qsa.InterfaceC11668a) value;
            return partial ? interfaceC11668a.buildPartial() : interfaceC11668a.build();
        }

        private static <T extends InterfaceC1587c<T>> void replaceBuilders(vrf<T, Object> fieldMap, boolean partial) {
            for (int i = 0; i < fieldMap.getNumArrayEntries(); i++) {
                replaceBuilders(fieldMap.getArrayEntryAt(i), partial);
            }
            Iterator it = fieldMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next(), partial);
            }
        }

        private void verifyType(final T descriptor, final Object value) {
            if (as5.isValidType(descriptor.getLiteType(), value)) {
                return;
            }
            if (descriptor.getLiteType().getJavaType() != hpi.EnumC6969c.MESSAGE || !(value instanceof qsa.InterfaceC11668a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m2646a(final T descriptor) {
            Object obj = this.f11740a.get(descriptor);
            return obj instanceof ox8 ? ((ox8) obj).getValue() : obj;
        }

        public void addRepeatedField(final T descriptor, final Object value) {
            List arrayList;
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f11743d = this.f11743d || (value instanceof qsa.InterfaceC11668a);
            verifyType(descriptor, value);
            Object objM2646a = m2646a(descriptor);
            if (objM2646a == null) {
                arrayList = new ArrayList();
                this.f11740a.put(descriptor, arrayList);
            } else {
                arrayList = (List) objM2646a;
            }
            arrayList.add(value);
        }

        /* JADX INFO: renamed from: b */
        public Object m2647b(final T descriptor, final int index) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM2646a = m2646a(descriptor);
            if (objM2646a != null) {
                return ((List) objM2646a).get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public as5<T> build() {
            return buildImpl(false);
        }

        public as5<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(final T descriptor) {
            ensureIsMutable();
            this.f11740a.remove(descriptor);
            if (this.f11740a.isEmpty()) {
                this.f11741b = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.f11741b) {
                return this.f11740a.isImmutable() ? this.f11740a : Collections.unmodifiableMap(this.f11740a);
            }
            vrf vrfVarCloneAllFieldsMap = as5.cloneAllFieldsMap(this.f11740a, false);
            if (this.f11740a.isImmutable()) {
                vrfVarCloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(vrfVarCloneAllFieldsMap, true);
            }
            return vrfVarCloneAllFieldsMap;
        }

        public Object getField(final T descriptor) {
            return replaceBuilders(descriptor, m2646a(descriptor), true);
        }

        public Object getRepeatedField(final T descriptor, final int index) {
            if (this.f11743d) {
                ensureIsMutable();
            }
            return replaceBuilder(m2647b(descriptor, index), true);
        }

        public int getRepeatedFieldCount(final T descriptor) {
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM2646a = m2646a(descriptor);
            if (objM2646a == null) {
                return 0;
            }
            return ((List) objM2646a).size();
        }

        public boolean hasField(final T descriptor) {
            if (descriptor.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f11740a.get(descriptor) != null;
        }

        public boolean isInitialized() {
            for (int i = 0; i < this.f11740a.getNumArrayEntries(); i++) {
                if (!as5.isInitialized(this.f11740a.getArrayEntryAt(i))) {
                    return false;
                }
            }
            Iterator it = this.f11740a.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!as5.isInitialized((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(final as5<T> other) {
            ensureIsMutable();
            for (int i = 0; i < other.f11735a.getNumArrayEntries(); i++) {
                mergeFromField(other.f11735a.getArrayEntryAt(i));
            }
            Iterator it = other.f11735a.getOverflowEntries().iterator();
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
                for (Object obj2 : arrayList) {
                    verifyType(t, obj2);
                    this.f11743d = this.f11743d || (obj2 instanceof qsa.InterfaceC11668a);
                }
                obj = arrayList;
            }
            if (obj instanceof ox8) {
                this.f11741b = true;
            }
            this.f11743d = this.f11743d || (obj instanceof qsa.InterfaceC11668a);
            this.f11740a.put(t, obj);
        }

        public void setRepeatedField(final T descriptor, final int index, final Object value) {
            ensureIsMutable();
            if (!descriptor.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f11743d = this.f11743d || (value instanceof qsa.InterfaceC11668a);
            Object objM2646a = m2646a(descriptor);
            if (objM2646a == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(descriptor, value);
            ((List) objM2646a).set(index, value);
        }

        private C1586b() {
            this(vrf.m24158h(16));
        }

        private C1586b(vrf<T, Object> fields) {
            this.f11740a = fields;
            this.f11742c = true;
        }

        private static <T extends InterfaceC1587c<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean partial) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), partial));
        }

        private static <T extends InterfaceC1587c<T>> Object replaceBuilders(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.getLiteJavaType() != hpi.EnumC6969c.MESSAGE) {
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

    /* JADX INFO: renamed from: as5$c */
    public interface InterfaceC1587c<T extends InterfaceC1587c<T>> extends Comparable<T> {
        w98.InterfaceC14498e<?> getEnumType();

        hpi.EnumC6969c getLiteJavaType();

        hpi.EnumC6968b getLiteType();

        int getNumber();

        qsa.InterfaceC11668a internalMergeFrom(qsa.InterfaceC11668a to, qsa from);

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ as5(vrf vrfVar, C1585a c1585a) {
        this(vrfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC1587c<T>> vrf<T, Object> cloneAllFieldsMap(vrf<T, Object> fields, boolean copyList) {
        vrf<T, Object> vrfVarM24158h = vrf.m24158h(16);
        for (int i = 0; i < fields.getNumArrayEntries(); i++) {
            cloneFieldEntry(vrfVarM24158h, fields.getArrayEntryAt(i), copyList);
        }
        Iterator it = fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(vrfVarM24158h, (Map.Entry) it.next(), copyList);
        }
        return vrfVarM24158h;
    }

    private static <T extends InterfaceC1587c<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ox8) {
            map.put(key, ((ox8) value).getValue());
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

    public static int computeFieldSize(final InterfaceC1587c<?> descriptor, final Object value) {
        hpi.EnumC6968b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            return m2639h(liteType, number, value);
        }
        List list = (List) value;
        int iM2639h = 0;
        if (!descriptor.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM2639h += m2639h(liteType, number, it.next());
            }
            return iM2639h;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iM2639h += m2640i(liteType, it2.next());
        }
        return j72.computeTagSize(number) + iM2639h + j72.computeUInt32SizeNoTag(iM2639h);
    }

    public static <T extends InterfaceC1587c<T>> as5<T> emptySet() {
        return f11734e;
    }

    /* JADX INFO: renamed from: h */
    public static int m2639h(final hpi.EnumC6968b type, final int number, final Object value) {
        int iComputeTagSize = j72.computeTagSize(number);
        if (type == hpi.EnumC6968b.f44486M) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + m2640i(type, value);
    }

    /* JADX INFO: renamed from: i */
    public static int m2640i(final hpi.EnumC6968b type, final Object value) {
        switch (C1585a.f11739b[type.ordinal()]) {
            case 1:
                return j72.computeDoubleSizeNoTag(((Double) value).doubleValue());
            case 2:
                return j72.computeFloatSizeNoTag(((Float) value).floatValue());
            case 3:
                return j72.computeInt64SizeNoTag(((Long) value).longValue());
            case 4:
                return j72.computeUInt64SizeNoTag(((Long) value).longValue());
            case 5:
                return j72.computeInt32SizeNoTag(((Integer) value).intValue());
            case 6:
                return j72.computeFixed64SizeNoTag(((Long) value).longValue());
            case 7:
                return j72.computeFixed32SizeNoTag(((Integer) value).intValue());
            case 8:
                return j72.computeBoolSizeNoTag(((Boolean) value).booleanValue());
            case 9:
                return j72.computeGroupSizeNoTag((qsa) value);
            case 10:
                return value instanceof ox8 ? j72.computeLazyFieldSizeNoTag((ox8) value) : j72.computeMessageSizeNoTag((qsa) value);
            case 11:
                return value instanceof vj1 ? j72.computeBytesSizeNoTag((vj1) value) : j72.computeStringSizeNoTag((String) value);
            case 12:
                return value instanceof vj1 ? j72.computeBytesSizeNoTag((vj1) value) : j72.computeByteArraySizeNoTag((byte[]) value);
            case 13:
                return j72.computeUInt32SizeNoTag(((Integer) value).intValue());
            case 14:
                return j72.computeSFixed32SizeNoTag(((Integer) value).intValue());
            case 15:
                return j72.computeSFixed64SizeNoTag(((Long) value).longValue());
            case 16:
                return j72.computeSInt32SizeNoTag(((Integer) value).intValue());
            case 17:
                return j72.computeSInt64SizeNoTag(((Long) value).longValue());
            case 18:
                return value instanceof w98.InterfaceC14497d ? j72.computeEnumSizeNoTag(((w98.InterfaceC14497d) value).getNumber()) : j72.computeEnumSizeNoTag(((Integer) value).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean isMessageFieldValueInitialized(Object value) {
        if (value instanceof rsa) {
            return ((rsa) value).isInitialized();
        }
        if (value instanceof ox8) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(final hpi.EnumC6968b type, final Object value) {
        w98.m24432a(value);
        switch (C1585a.f11738a[type.getJavaType().ordinal()]) {
            case 7:
                if (!(value instanceof vj1) && !(value instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(value instanceof Integer) && !(value instanceof w98.InterfaceC14497d)) {
                    break;
                }
                break;
            case 9:
                if (!(value instanceof qsa) && !(value instanceof ox8)) {
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m2641k(final hpi.EnumC6968b type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.getWireType();
    }

    /* JADX INFO: renamed from: m */
    public static void m2642m(final j72 output, final hpi.EnumC6968b type, final int number, final Object value) throws IOException {
        if (type == hpi.EnumC6968b.f44486M) {
            output.writeGroup(number, (qsa) value);
        } else {
            output.writeTag(number, m2641k(type, false));
            m2643n(output, type, value);
        }
    }

    private void mergeFromField(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ox8) {
            value = ((ox8) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.f11735a.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != hpi.EnumC6969c.MESSAGE) {
            this.f11735a.put(key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.f11735a.put(key, cloneIfMutable(value));
        } else {
            this.f11735a.put(key, key.internalMergeFrom(((qsa) field2).toBuilder(), (qsa) value).build());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m2643n(final j72 output, final hpi.EnumC6968b type, final Object value) throws IOException {
        switch (C1585a.f11739b[type.ordinal()]) {
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
                output.writeGroupNoTag((qsa) value);
                break;
            case 10:
                output.writeMessageNoTag((qsa) value);
                break;
            case 11:
                if (!(value instanceof vj1)) {
                    output.writeStringNoTag((String) value);
                } else {
                    output.writeBytesNoTag((vj1) value);
                }
                break;
            case 12:
                if (!(value instanceof vj1)) {
                    output.writeByteArrayNoTag((byte[]) value);
                } else {
                    output.writeBytesNoTag((vj1) value);
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
                if (!(value instanceof w98.InterfaceC14497d)) {
                    output.writeEnumNoTag(((Integer) value).intValue());
                } else {
                    output.writeEnumNoTag(((w98.InterfaceC14497d) value).getNumber());
                }
                break;
        }
    }

    public static <T extends InterfaceC1587c<T>> C1586b<T> newBuilder() {
        return new C1586b<>((C1585a) null);
    }

    public static <T extends InterfaceC1587c<T>> as5<T> newFieldSet() {
        return new as5<>();
    }

    public static Object readPrimitiveField(f72 input, final hpi.EnumC6968b type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? hpi.m12537b(input, type, hpi.EnumC6970d.f44515b) : hpi.m12537b(input, type, hpi.EnumC6970d.f44514a);
    }

    private void verifyType(final T descriptor, final Object value) {
        if (!isValidType(descriptor.getLiteType(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.getNumber()), descriptor.getLiteType().getJavaType(), value.getClass().getName()));
        }
    }

    public static void writeField(final InterfaceC1587c<?> descriptor, final Object value, final j72 output) throws IOException {
        hpi.EnumC6968b liteType = descriptor.getLiteType();
        int number = descriptor.getNumber();
        if (!descriptor.isRepeated()) {
            if (value instanceof ox8) {
                m2642m(output, liteType, number, ((ox8) value).getValue());
                return;
            } else {
                m2642m(output, liteType, number, value);
                return;
            }
        }
        List list = (List) value;
        if (!descriptor.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m2642m(output, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            output.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int iM2640i = 0;
            while (it2.hasNext()) {
                iM2640i += m2640i(liteType, it2.next());
            }
            output.writeUInt32NoTag(iM2640i);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m2643n(output, liteType, it3.next());
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
            this.f11735a.put(descriptor, arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(value);
    }

    public void clear() {
        this.f11735a.clear();
        this.f11737c = false;
    }

    public void clearField(final T descriptor) {
        this.f11735a.remove(descriptor);
        if (this.f11735a.isEmpty()) {
            this.f11737c = false;
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof as5) {
            return this.f11735a.equals(((as5) o).f11735a);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        if (!this.f11737c) {
            return this.f11735a.isImmutable() ? this.f11735a : Collections.unmodifiableMap(this.f11735a);
        }
        vrf vrfVarCloneAllFieldsMap = cloneAllFieldsMap(this.f11735a, false);
        if (this.f11735a.isImmutable()) {
            vrfVarCloneAllFieldsMap.makeImmutable();
        }
        return vrfVarCloneAllFieldsMap;
    }

    public Object getField(final T descriptor) {
        Object obj = this.f11735a.get(descriptor);
        return obj instanceof ox8 ? ((ox8) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.f11735a.getArrayEntryAt(i));
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
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
        int iComputeFieldSize = 0;
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f11735a.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((InterfaceC1587c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((InterfaceC1587c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(final T descriptor) {
        if (descriptor.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f11735a.get(descriptor) != null;
    }

    public int hashCode() {
        return this.f11735a.hashCode();
    }

    public boolean isImmutable() {
        return this.f11736b;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            if (!isInitialized(this.f11735a.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return this.f11737c ? new ox8.C10709c(this.f11735a.entrySet().iterator()) : this.f11735a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: j */
    public Iterator<Map.Entry<T, Object>> m2644j() {
        return this.f11737c ? new ox8.C10709c(this.f11735a.m24160f().iterator()) : this.f11735a.m24160f().iterator();
    }

    /* JADX INFO: renamed from: l */
    public boolean m2645l() {
        return this.f11735a.isEmpty();
    }

    public void makeImmutable() {
        if (this.f11736b) {
            return;
        }
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f11735a.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof v27) {
                ((v27) arrayEntryAt.getValue()).m23726F();
            }
        }
        this.f11735a.makeImmutable();
        this.f11736b = true;
    }

    public void mergeFrom(final as5<T> other) {
        for (int i = 0; i < other.f11735a.getNumArrayEntries(); i++) {
            mergeFromField(other.f11735a.getArrayEntryAt(i));
        }
        Iterator it = other.f11735a.getOverflowEntries().iterator();
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
        if (obj instanceof ox8) {
            this.f11737c = true;
        }
        this.f11735a.put(t, obj);
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

    public void writeMessageSetTo(final j72 output) throws IOException {
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.f11735a.getArrayEntryAt(i), output);
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), output);
        }
    }

    public void writeTo(final j72 output) throws IOException {
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f11735a.getArrayEntryAt(i);
            writeField((InterfaceC1587c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), output);
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            writeField((InterfaceC1587c) entry.getKey(), entry.getValue(), output);
        }
    }

    private as5() {
        this.f11735a = vrf.m24158h(16);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public as5<T> m27878clone() {
        as5<T> as5VarNewFieldSet = newFieldSet();
        for (int i = 0; i < this.f11735a.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.f11735a.getArrayEntryAt(i);
            as5VarNewFieldSet.setField((InterfaceC1587c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.f11735a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            as5VarNewFieldSet.setField((InterfaceC1587c) entry.getKey(), entry.getValue());
        }
        as5VarNewFieldSet.f11737c = this.f11737c;
        return as5VarNewFieldSet;
    }

    private as5(final boolean dummy) {
        this(vrf.m24158h(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == hpi.EnumC6969c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof ox8) {
                return j72.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (ox8) value);
            }
            return j72.computeMessageSetExtensionSize(entry.getKey().getNumber(), (qsa) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends InterfaceC1587c<T>> boolean isInitialized(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != hpi.EnumC6969c.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(final Map.Entry<T, Object> entry, final j72 output) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == hpi.EnumC6969c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof ox8) {
                output.writeRawMessageSetExtension(entry.getKey().getNumber(), ((ox8) value).toByteString());
                return;
            } else {
                output.writeMessageSetExtension(entry.getKey().getNumber(), (qsa) value);
                return;
            }
        }
        writeField(key, entry.getValue(), output);
    }

    private as5(vrf<T, Object> fields) {
        this.f11735a = fields;
        makeImmutable();
    }
}
