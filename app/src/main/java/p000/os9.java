package p000;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import p000.hpi;
import p000.qsa;

/* JADX INFO: loaded from: classes4.dex */
public class os9<K, V> {

    /* JADX INFO: renamed from: d */
    public static final int f68561d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f68562e = 2;

    /* JADX INFO: renamed from: a */
    public final C10633b<K, V> f68563a;

    /* JADX INFO: renamed from: b */
    public final K f68564b;

    /* JADX INFO: renamed from: c */
    public final V f68565c;

    /* JADX INFO: renamed from: os9$a */
    public static /* synthetic */ class C10632a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68566a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f68566a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44488N.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68566a[hpi.EnumC6968b.f44492Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68566a[hpi.EnumC6968b.f44486M.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: os9$b */
    public static class C10633b<K, V> {

        /* JADX INFO: renamed from: a */
        public final hpi.EnumC6968b f68567a;

        /* JADX INFO: renamed from: b */
        public final K f68568b;

        /* JADX INFO: renamed from: c */
        public final hpi.EnumC6968b f68569c;

        /* JADX INFO: renamed from: d */
        public final V f68570d;

        public C10633b(hpi.EnumC6968b keyType, K defaultKey, hpi.EnumC6968b valueType, V defaultValue) {
            this.f68567a = keyType;
            this.f68568b = defaultKey;
            this.f68569c = valueType;
            this.f68570d = defaultValue;
        }
    }

    private os9(hpi.EnumC6968b keyType, K defaultKey, hpi.EnumC6968b valueType, V defaultValue) {
        this.f68563a = new C10633b<>(keyType, defaultKey, valueType, defaultValue);
        this.f68564b = defaultKey;
        this.f68565c = defaultValue;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m18968a(C10633b<K, V> metadata, K key, V value) {
        return as5.m2639h(metadata.f68567a, 1, key) + as5.m2639h(metadata.f68569c, 2, value);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> Map.Entry<K, V> m18969c(f72 input, C10633b<K, V> metadata, zi5 extensionRegistry) throws IOException {
        Object objM18970d = metadata.f68568b;
        Object objM18970d2 = metadata.f68570d;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == hpi.m12536a(1, metadata.f68567a.getWireType())) {
                objM18970d = m18970d(input, extensionRegistry, metadata.f68567a, objM18970d);
            } else if (tag == hpi.m12536a(2, metadata.f68569c.getWireType())) {
                objM18970d2 = m18970d(input, extensionRegistry, metadata.f68569c, objM18970d2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objM18970d, objM18970d2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m18970d(f72 f72Var, zi5 zi5Var, hpi.EnumC6968b enumC6968b, T t) throws IOException {
        int i = C10632a.f68566a[enumC6968b.ordinal()];
        if (i == 1) {
            qsa.InterfaceC11668a builder = ((qsa) t).toBuilder();
            f72Var.readMessage(builder, zi5Var);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(f72Var.readEnum());
        }
        if (i != 3) {
            return (T) as5.readPrimitiveField(f72Var, enumC6968b, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> void m18971e(j72 output, C10633b<K, V> metadata, K key, V value) throws IOException {
        as5.m2642m(output, metadata.f68567a, 1, key);
        as5.m2642m(output, metadata.f68569c, 2, value);
    }

    public static <K, V> os9<K, V> newDefaultInstance(hpi.EnumC6968b keyType, K defaultKey, hpi.EnumC6968b valueType, V defaultValue) {
        return new os9<>(keyType, defaultKey, valueType, defaultValue);
    }

    /* JADX INFO: renamed from: b */
    public C10633b<K, V> m18972b() {
        return this.f68563a;
    }

    public int computeMessageSize(int fieldNumber, K key, V value) {
        return j72.computeTagSize(fieldNumber) + j72.m13758d(m18968a(this.f68563a, key, value));
    }

    public K getKey() {
        return this.f68564b;
    }

    public V getValue() {
        return this.f68565c;
    }

    public Map.Entry<K, V> parseEntry(vj1 bytes, zi5 extensionRegistry) throws IOException {
        return m18969c(bytes.newCodedInput(), this.f68563a, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(ss9<K, V> map, f72 input, zi5 extensionRegistry) throws IOException {
        int iPushLimit = input.pushLimit(input.readRawVarint32());
        C10633b<K, V> c10633b = this.f68563a;
        Object objM18970d = c10633b.f68568b;
        Object objM18970d2 = c10633b.f68570d;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == hpi.m12536a(1, this.f68563a.f68567a.getWireType())) {
                objM18970d = m18970d(input, extensionRegistry, this.f68563a.f68567a, objM18970d);
            } else if (tag == hpi.m12536a(2, this.f68563a.f68569c.getWireType())) {
                objM18970d2 = m18970d(input, extensionRegistry, this.f68563a.f68569c, objM18970d2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        input.checkLastTagWas(0);
        input.popLimit(iPushLimit);
        map.put(objM18970d, objM18970d2);
    }

    public void serializeTo(j72 output, int fieldNumber, K key, V value) throws IOException {
        output.writeTag(fieldNumber, 2);
        output.writeUInt32NoTag(m18968a(this.f68563a, key, value));
        m18971e(output, this.f68563a, key, value);
    }

    private os9(C10633b<K, V> metadata, K key, V value) {
        this.f68563a = metadata;
        this.f68564b = key;
        this.f68565c = value;
    }
}
