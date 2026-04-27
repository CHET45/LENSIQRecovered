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

/* JADX INFO: loaded from: classes4.dex */
public final class w98 {

    /* JADX INFO: renamed from: a */
    public static final Charset f93673a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f93674b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f93675c = Charset.forName(CharsetNames.ISO_8859_1);

    /* JADX INFO: renamed from: d */
    public static final int f93676d = 4096;

    /* JADX INFO: renamed from: e */
    public static final byte[] f93677e;

    /* JADX INFO: renamed from: f */
    public static final ByteBuffer f93678f;

    /* JADX INFO: renamed from: g */
    public static final f72 f93679g;

    /* JADX INFO: renamed from: w98$a */
    public static class C14494a<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, RealValue> f93680a;

        /* JADX INFO: renamed from: b */
        public final b<RealValue, V> f93681b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: w98$a$a */
        public class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC14498e f93682a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC14497d f93683b;

            public a(final InterfaceC14498e val$enumMap, final InterfaceC14497d val$unrecognizedValue) {
                this.f93682a = val$enumMap;
                this.f93683b = val$unrecognizedValue;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // p000.w98.C14494a.b
            public Integer doBackward(InterfaceC14497d value) {
                return Integer.valueOf(value.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // p000.w98.C14494a.b
            public InterfaceC14497d doForward(Integer value) {
                InterfaceC14497d interfaceC14497dFindValueByNumber = this.f93682a.findValueByNumber(value.intValue());
                return interfaceC14497dFindValueByNumber == null ? this.f93683b : interfaceC14497dFindValueByNumber;
            }
        }

        /* JADX INFO: renamed from: w98$a$b */
        public interface b<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        /* JADX INFO: renamed from: w98$a$c */
        public class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: a */
            public final Map.Entry<K, RealValue> f93684a;

            public c(Map.Entry<K, RealValue> realEntry) {
                this.f93684a = realEntry;
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
                return this.f93684a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) C14494a.this.f93681b.doForward(this.f93684a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f93684a.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
                RealValue value = this.f93684a.setValue((RealValue) C14494a.this.f93681b.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) C14494a.this.f93681b.doForward(value);
            }
        }

        /* JADX INFO: renamed from: w98$a$d */
        public class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<K, RealValue>> f93686a;

            public d(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.f93686a = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f93686a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f93686a.remove();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new c(this.f93686a.next());
            }
        }

        /* JADX INFO: renamed from: w98$a$e */
        public class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            public final Set<Map.Entry<K, RealValue>> f93688a;

            public e(Set<Map.Entry<K, RealValue>> realSet) {
                this.f93688a = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f93688a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f93688a.size();
            }
        }

        public C14494a(Map<K, RealValue> realMap, b<RealValue, V> valueConverter) {
            this.f93680a = realMap;
            this.f93681b = valueConverter;
        }

        public static <T extends InterfaceC14497d> b<Integer, T> newEnumConverter(final InterfaceC14498e<T> enumMap, final T unrecognizedValue) {
            return new a(enumMap, unrecognizedValue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f93680a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.f93680a.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.f93681b.doForward(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            RealValue realvaluePut = this.f93680a.put(k, this.f93681b.doBackward(v));
            if (realvaluePut == null) {
                return null;
            }
            return this.f93681b.doForward(realvaluePut);
        }
    }

    /* JADX INFO: renamed from: w98$b */
    public interface InterfaceC14495b extends InterfaceC14504k<Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        InterfaceC14504k<Boolean> mutableCopyWithCapacity2(int capacity);

        @pp1
        boolean setBoolean(int index, boolean element);
    }

    /* JADX INFO: renamed from: w98$c */
    public interface InterfaceC14496c extends InterfaceC14504k<Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC14504k<Double> mutableCopyWithCapacity2(int capacity);

        @pp1
        double setDouble(int index, double element);
    }

    /* JADX INFO: renamed from: w98$d */
    public interface InterfaceC14497d {
        int getNumber();
    }

    /* JADX INFO: renamed from: w98$e */
    public interface InterfaceC14498e<T extends InterfaceC14497d> {
        T findValueByNumber(int number);
    }

    /* JADX INFO: renamed from: w98$f */
    public interface InterfaceC14499f {
        boolean isInRange(int number);
    }

    /* JADX INFO: renamed from: w98$g */
    public interface InterfaceC14500g extends InterfaceC14504k<Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC14504k<Float> mutableCopyWithCapacity2(int capacity);

        @pp1
        float setFloat(int index, float element);
    }

    /* JADX INFO: renamed from: w98$h */
    public interface InterfaceC14501h extends InterfaceC14504k<Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC14504k<Integer> mutableCopyWithCapacity2(int capacity);

        @pp1
        int setInt(int index, int element);
    }

    /* JADX INFO: renamed from: w98$i */
    public static class C14502i<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final List<F> f93690a;

        /* JADX INFO: renamed from: b */
        public final a<F, T> f93691b;

        /* JADX INFO: renamed from: w98$i$a */
        public interface a<F, T> {
            T convert(F from);
        }

        public C14502i(List<F> fromList, a<F, T> converter) {
            this.f93690a = fromList;
            this.f93691b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.f93691b.convert(this.f93690a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f93690a.size();
        }
    }

    /* JADX INFO: renamed from: w98$j */
    public interface InterfaceC14503j extends InterfaceC14504k<Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC14504k<Long> mutableCopyWithCapacity2(int capacity);

        @pp1
        long setLong(int index, long element);
    }

    /* JADX INFO: renamed from: w98$k */
    public interface InterfaceC14504k<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* JADX INFO: renamed from: mutableCopyWithCapacity */
        InterfaceC14504k<E> mutableCopyWithCapacity2(int capacity);
    }

    static {
        byte[] bArr = new byte[0];
        f93677e = bArr;
        f93678f = ByteBuffer.wrap(bArr);
        f93679g = f72.newInstance(bArr);
    }

    private w98() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m24432a(T obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m24433b(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static byte[] byteArrayDefaultValue(String bytes) {
        return bytes.getBytes(f93675c);
    }

    public static ByteBuffer byteBufferDefaultValue(String bytes) {
        return ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static vj1 bytesDefaultValue(String bytes) {
        return vj1.copyFrom(bytes.getBytes(f93675c));
    }

    /* JADX INFO: renamed from: c */
    public static int m24434c(byte[] bytes, int offset, int length) {
        int iM24436e = m24436e(length, bytes, offset, length);
        if (iM24436e == 0) {
            return 1;
        }
        return iM24436e;
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
    public static Object m24435d(Object destination, Object source) {
        return ((qsa) destination).toBuilder().mergeFrom((qsa) source).buildPartial();
    }

    /* JADX INFO: renamed from: e */
    public static int m24436e(int h, byte[] bytes, int offset, int length) {
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
        li8.m16159a(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = b.duplicate();
        li8.m16159a(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static <T extends qsa> T getDefaultInstance(Class<T> clazz) {
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

    public static int hashEnum(InterfaceC14497d e) {
        return e.getNumber();
    }

    public static int hashEnumList(List<? extends InterfaceC14497d> list) {
        Iterator<? extends InterfaceC14497d> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashLong(long n) {
        return (int) (n ^ (n >>> 32));
    }

    public static boolean isValidUtf8(vj1 byteString) {
        return byteString.isValidUtf8();
    }

    public static String stringDefaultValue(String bytes) {
        return new String(bytes.getBytes(f93675c), f93674b);
    }

    public static byte[] toByteArray(String value) {
        return value.getBytes(f93674b);
    }

    public static String toStringUtf8(byte[] bytes) {
        return new String(bytes, f93674b);
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return pzh.m19873m(byteArray);
    }

    public static int hashCode(byte[] bytes) {
        return m24434c(bytes, 0, bytes.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int iM24436e = m24436e(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iM24436e == 0) {
                return 1;
            }
            return iM24436e;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = bytes.duplicate();
        li8.m16159a(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = m24436e(iCapacity2, bArr, 0, iRemaining);
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
