package p000;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class v98 {

    /* JADX INFO: renamed from: a */
    public static final Charset f90379a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f90380b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f90381c = Charset.forName(CharsetNames.ISO_8859_1);

    /* JADX INFO: renamed from: d */
    public static final int f90382d = 4096;

    /* JADX INFO: renamed from: e */
    public static final byte[] f90383e;

    /* JADX INFO: renamed from: f */
    public static final ByteBuffer f90384f;

    /* JADX INFO: renamed from: g */
    public static final e72 f90385g;

    /* JADX INFO: renamed from: v98$a */
    public interface InterfaceC13945a extends InterfaceC13956l<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        InterfaceC13956l<Boolean> mutableCopyWithCapacity2(int capacity);

        @qp1
        boolean setBoolean(int index, boolean element);
    }

    /* JADX INFO: renamed from: v98$b */
    public interface InterfaceC13946b extends InterfaceC13956l<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC13956l<Double> mutableCopyWithCapacity2(int capacity);

        @qp1
        double setDouble(int index, double element);
    }

    /* JADX INFO: renamed from: v98$c */
    public interface InterfaceC13947c {
        int getNumber();
    }

    /* JADX INFO: renamed from: v98$d */
    public interface InterfaceC13948d<T extends InterfaceC13947c> {
        T findValueByNumber(int number);
    }

    /* JADX INFO: renamed from: v98$e */
    public interface InterfaceC13949e {
        boolean isInRange(int number);
    }

    /* JADX INFO: renamed from: v98$f */
    public interface InterfaceC13950f extends InterfaceC13956l<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC13956l<Float> mutableCopyWithCapacity2(int capacity);

        @qp1
        float setFloat(int index, float element);
    }

    /* JADX INFO: renamed from: v98$g */
    public interface InterfaceC13951g extends InterfaceC13956l<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC13956l<Integer> mutableCopyWithCapacity2(int capacity);

        @qp1
        int setInt(int index, int element);
    }

    /* JADX INFO: renamed from: v98$h */
    public static class C13952h<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13951g f90386a;

        /* JADX INFO: renamed from: b */
        public final a<T> f90387b;

        /* JADX INFO: renamed from: v98$h$a */
        public interface a<T> {
            T convert(int from);
        }

        public C13952h(InterfaceC13951g fromList, a<T> converter) {
            this.f90386a = fromList;
            this.f90387b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.f90387b.convert(this.f90386a.getInt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f90386a.size();
        }
    }

    /* JADX INFO: renamed from: v98$i */
    public static class C13953i<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final List<F> f90388a;

        /* JADX INFO: renamed from: b */
        public final a<F, T> f90389b;

        /* JADX INFO: renamed from: v98$i$a */
        public interface a<F, T> {
            T convert(F from);
        }

        public C13953i(List<F> fromList, a<F, T> converter) {
            this.f90388a = fromList;
            this.f90389b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.f90389b.convert(this.f90388a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f90388a.size();
        }
    }

    /* JADX INFO: renamed from: v98$j */
    public interface InterfaceC13954j extends InterfaceC13956l<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC13956l<Long> mutableCopyWithCapacity2(int capacity);

        @qp1
        long setLong(int index, long element);
    }

    /* JADX INFO: renamed from: v98$k */
    public static class C13955k<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, RealValue> f90390a;

        /* JADX INFO: renamed from: b */
        public final b<RealValue, V> f90391b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: v98$k$a */
        public class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC13948d f90392a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC13947c f90393b;

            public a(final InterfaceC13948d val$enumMap, final InterfaceC13947c val$unrecognizedValue) {
                this.f90392a = val$enumMap;
                this.f90393b = val$unrecognizedValue;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // p000.v98.C13955k.b
            public Integer doBackward(InterfaceC13947c value) {
                return Integer.valueOf(value.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // p000.v98.C13955k.b
            public InterfaceC13947c doForward(Integer value) {
                InterfaceC13947c interfaceC13947cFindValueByNumber = this.f90392a.findValueByNumber(value.intValue());
                return interfaceC13947cFindValueByNumber == null ? this.f90393b : interfaceC13947cFindValueByNumber;
            }
        }

        /* JADX INFO: renamed from: v98$k$b */
        public interface b<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        /* JADX INFO: renamed from: v98$k$c */
        public class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: a */
            public final Map.Entry<K, RealValue> f90394a;

            public c(Map.Entry<K, RealValue> realEntry) {
                this.f90394a = realEntry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (o instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) o).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f90394a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) C13955k.this.f90391b.doForward(this.f90394a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f90394a.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
                RealValue value = this.f90394a.setValue((RealValue) C13955k.this.f90391b.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) C13955k.this.f90391b.doForward(value);
            }
        }

        /* JADX INFO: renamed from: v98$k$d */
        public class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<K, RealValue>> f90396a;

            public d(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.f90396a = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f90396a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f90396a.remove();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new c(this.f90396a.next());
            }
        }

        /* JADX INFO: renamed from: v98$k$e */
        public class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            public final Set<Map.Entry<K, RealValue>> f90398a;

            public e(Set<Map.Entry<K, RealValue>> realSet) {
                this.f90398a = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f90398a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f90398a.size();
            }
        }

        public C13955k(Map<K, RealValue> realMap, b<RealValue, V> valueConverter) {
            this.f90390a = realMap;
            this.f90391b = valueConverter;
        }

        public static <T extends InterfaceC13947c> b<Integer, T> newEnumConverter(final InterfaceC13948d<T> enumMap, final T unrecognizedValue) {
            return new a(enumMap, unrecognizedValue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f90390a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.f90390a.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.f90391b.doForward(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            RealValue realvaluePut = this.f90390a.put(k, this.f90391b.doBackward(v));
            if (realvaluePut == null) {
                return null;
            }
            return this.f90391b.doForward(realvaluePut);
        }
    }

    /* JADX INFO: renamed from: v98$l */
    public interface InterfaceC13956l<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC13956l<E> mutableCopyWithCapacity2(int capacity);
    }

    static {
        byte[] bArr = new byte[0];
        f90383e = bArr;
        f90384f = ByteBuffer.wrap(bArr);
        f90385g = e72.newInstance(bArr);
    }

    private v98() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m23881a(T obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m23882b(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static byte[] byteArrayDefaultValue(String bytes) {
        return bytes.getBytes(f90381c);
    }

    public static ByteBuffer byteBufferDefaultValue(String bytes) {
        return ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static wj1 bytesDefaultValue(String bytes) {
        return wj1.copyFrom(bytes.getBytes(f90381c));
    }

    /* JADX INFO: renamed from: c */
    public static int m23883c(byte[] bytes, int offset, int length) {
        int iM23885e = m23885e(length, bytes, offset, length);
        if (iM23885e == 0) {
            return 1;
        }
        return iM23885e;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer source) {
        ByteBuffer byteBufferDuplicate = source.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: d */
    public static Object m23884d(Object destination, Object source) {
        return ((psa) destination).toBuilder().mergeFrom((psa) source).buildPartial();
    }

    /* JADX INFO: renamed from: e */
    public static int m23885e(int h, byte[] bytes, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + bytes[i];
        }
        return h;
    }

    public static boolean equals(List<byte[]> a, List<byte[]> b) {
        if (a.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            if (!Arrays.equals(a.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer a, ByteBuffer b) {
        if (a.capacity() != b.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = a.duplicate();
        mi8.m17323a(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = b.duplicate();
        mi8.m17323a(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static <T extends psa> T getDefaultInstance(Class<T> clazz) {
        try {
            Method method = clazz.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e);
        }
    }

    public static int hashBoolean(boolean b) {
        return b ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashEnum(InterfaceC13947c e) {
        return e.getNumber();
    }

    public static int hashEnumList(List<? extends InterfaceC13947c> list) {
        Iterator<? extends InterfaceC13947c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashLong(long n) {
        return (int) (n ^ (n >>> 32));
    }

    public static boolean isValidUtf8(wj1 byteString) {
        return byteString.isValidUtf8();
    }

    public static String stringDefaultValue(String bytes) {
        return new String(bytes.getBytes(f90381c), f90380b);
    }

    public static byte[] toByteArray(String value) {
        return value.getBytes(f90380b);
    }

    public static String toStringUtf8(byte[] bytes) {
        return new String(bytes, f90380b);
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return lzh.m16495m(byteArray);
    }

    public static int hashCode(byte[] bytes) {
        return m23883c(bytes, 0, bytes.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int iM23885e = m23885e(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iM23885e == 0) {
                return 1;
            }
            return iM23885e;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = bytes.duplicate();
        mi8.m17323a(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = m23885e(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> a, List<ByteBuffer> b) {
        if (a.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            if (!equalsByteBuffer(a.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }
}
