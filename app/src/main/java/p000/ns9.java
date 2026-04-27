package p000;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import p000.gpi;
import p000.psa;

/* JADX INFO: loaded from: classes3.dex */
public class ns9<K, V> {

    /* JADX INFO: renamed from: d */
    public static final int f65500d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f65501e = 2;

    /* JADX INFO: renamed from: a */
    public final C10042b<K, V> f65502a;

    /* JADX INFO: renamed from: b */
    public final K f65503b;

    /* JADX INFO: renamed from: c */
    public final V f65504c;

    /* JADX INFO: renamed from: ns9$a */
    public static /* synthetic */ class C10041a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65505a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f65505a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40754N.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65505a[gpi.EnumC6460b.f40758Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65505a[gpi.EnumC6460b.f40752M.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: ns9$b */
    public static class C10042b<K, V> {

        /* JADX INFO: renamed from: a */
        public final gpi.EnumC6460b f65506a;

        /* JADX INFO: renamed from: b */
        public final K f65507b;

        /* JADX INFO: renamed from: c */
        public final gpi.EnumC6460b f65508c;

        /* JADX INFO: renamed from: d */
        public final V f65509d;

        public C10042b(gpi.EnumC6460b keyType, K defaultKey, gpi.EnumC6460b valueType, V defaultValue) {
            this.f65506a = keyType;
            this.f65507b = defaultKey;
            this.f65508c = valueType;
            this.f65509d = defaultValue;
        }
    }

    private ns9(gpi.EnumC6460b keyType, K defaultKey, gpi.EnumC6460b valueType, V defaultValue) {
        this.f65502a = new C10042b<>(keyType, defaultKey, valueType, defaultValue);
        this.f65503b = defaultKey;
        this.f65504c = defaultValue;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m18107a(C10042b<K, V> metadata, K key, V value) {
        return zr5.m27042h(metadata.f65506a, 1, key) + zr5.m27042h(metadata.f65508c, 2, value);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> Map.Entry<K, V> m18108c(e72 input, C10042b<K, V> metadata, yi5 extensionRegistry) throws IOException {
        Object objM18109d = metadata.f65507b;
        Object objM18109d2 = metadata.f65509d;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == gpi.m11819a(1, metadata.f65506a.getWireType())) {
                objM18109d = m18109d(input, extensionRegistry, metadata.f65506a, objM18109d);
            } else if (tag == gpi.m11819a(2, metadata.f65508c.getWireType())) {
                objM18109d2 = m18109d(input, extensionRegistry, metadata.f65508c, objM18109d2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objM18109d, objM18109d2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m18109d(e72 e72Var, yi5 yi5Var, gpi.EnumC6460b enumC6460b, T t) throws IOException {
        int i = C10041a.f65505a[enumC6460b.ordinal()];
        if (i == 1) {
            psa.InterfaceC11106a builder = ((psa) t).toBuilder();
            e72Var.readMessage(builder, yi5Var);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(e72Var.readEnum());
        }
        if (i != 3) {
            return (T) zr5.readPrimitiveField(e72Var, enumC6460b, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> void m18110e(i72 output, C10042b<K, V> metadata, K key, V value) throws IOException {
        zr5.m27045m(output, metadata.f65506a, 1, key);
        zr5.m27045m(output, metadata.f65508c, 2, value);
    }

    public static <K, V> ns9<K, V> newDefaultInstance(gpi.EnumC6460b keyType, K defaultKey, gpi.EnumC6460b valueType, V defaultValue) {
        return new ns9<>(keyType, defaultKey, valueType, defaultValue);
    }

    /* JADX INFO: renamed from: b */
    public C10042b<K, V> m18111b() {
        return this.f65502a;
    }

    public int computeMessageSize(int fieldNumber, K key, V value) {
        return i72.computeTagSize(fieldNumber) + i72.m12826d(m18107a(this.f65502a, key, value));
    }

    public K getKey() {
        return this.f65503b;
    }

    public V getValue() {
        return this.f65504c;
    }

    public Map.Entry<K, V> parseEntry(wj1 bytes, yi5 extensionRegistry) throws IOException {
        return m18108c(bytes.newCodedInput(), this.f65502a, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(ts9<K, V> map, e72 input, yi5 extensionRegistry) throws IOException {
        int iPushLimit = input.pushLimit(input.readRawVarint32());
        C10042b<K, V> c10042b = this.f65502a;
        Object objM18109d = c10042b.f65507b;
        Object objM18109d2 = c10042b.f65509d;
        while (true) {
            int tag = input.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == gpi.m11819a(1, this.f65502a.f65506a.getWireType())) {
                objM18109d = m18109d(input, extensionRegistry, this.f65502a.f65506a, objM18109d);
            } else if (tag == gpi.m11819a(2, this.f65502a.f65508c.getWireType())) {
                objM18109d2 = m18109d(input, extensionRegistry, this.f65502a.f65508c, objM18109d2);
            } else if (!input.skipField(tag)) {
                break;
            }
        }
        input.checkLastTagWas(0);
        input.popLimit(iPushLimit);
        map.put(objM18109d, objM18109d2);
    }

    public void serializeTo(i72 output, int fieldNumber, K key, V value) throws IOException {
        output.writeTag(fieldNumber, 2);
        output.writeUInt32NoTag(m18107a(this.f65502a, key, value));
        m18110e(output, this.f65502a, key, value);
    }

    private ns9(C10042b<K, V> metadata, K key, V value) {
        this.f65502a = metadata;
        this.f65503b = key;
        this.f65504c = value;
    }
}
