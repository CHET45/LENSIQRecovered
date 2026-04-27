package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p000.jhd;

/* JADX INFO: loaded from: classes5.dex */
public final class phd implements ujb {

    /* JADX INFO: renamed from: f */
    public static final Charset f70823f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final ar5 f70824g = ar5.builder("key").withProperty(hb0.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: h */
    public static final ar5 f70825h = ar5.builder("value").withProperty(hb0.builder().tag(2).build()).build();

    /* JADX INFO: renamed from: i */
    public static final tjb<Map.Entry<Object, Object>> f70826i = new tjb() { // from class: ohd
        @Override // p000.l15
        public final void encode(Object obj, ujb ujbVar) throws IOException {
            phd.lambda$static$0((Map.Entry) obj, ujbVar);
        }
    };

    /* JADX INFO: renamed from: a */
    public OutputStream f70827a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, tjb<?>> f70828b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, g2i<?>> f70829c;

    /* JADX INFO: renamed from: d */
    public final tjb<Object> f70830d;

    /* JADX INFO: renamed from: e */
    public final shd f70831e = new shd(this);

    /* JADX INFO: renamed from: phd$a */
    public static /* synthetic */ class C10960a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70832a;

        static {
            int[] iArr = new int[jhd.EnumC7903a.values().length];
            f70832a = iArr;
            try {
                iArr[jhd.EnumC7903a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70832a[jhd.EnumC7903a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70832a[jhd.EnumC7903a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public phd(OutputStream outputStream, Map<Class<?>, tjb<?>> map, Map<Class<?>, g2i<?>> map2, tjb<Object> tjbVar) {
        this.f70827a = outputStream;
        this.f70828b = map;
        this.f70829c = map2;
        this.f70830d = tjbVar;
    }

    private static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long determineSize(tjb<T> tjbVar, T t) throws IOException {
        d49 d49Var = new d49();
        try {
            OutputStream outputStream = this.f70827a;
            this.f70827a = d49Var;
            try {
                tjbVar.encode(t, this);
                this.f70827a = outputStream;
                long jM8879a = d49Var.m8879a();
                d49Var.close();
                return jM8879a;
            } catch (Throwable th) {
                this.f70827a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                d49Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> phd doEncode(tjb<T> tjbVar, ar5 ar5Var, T t, boolean z) throws IOException {
        long jDetermineSize = determineSize(tjbVar, t);
        if (z && jDetermineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(ar5Var) << 3) | 2);
        writeVarInt64(jDetermineSize);
        tjbVar.encode(t, this);
        return this;
    }

    private static jhd getProtobuf(ar5 ar5Var) {
        jhd jhdVar = (jhd) ar5Var.getProperty(jhd.class);
        if (jhdVar != null) {
            return jhdVar;
        }
        throw new t15("Field has no @Protobuf config");
    }

    private static int getTag(ar5 ar5Var) {
        jhd jhdVar = (jhd) ar5Var.getProperty(jhd.class);
        if (jhdVar != null) {
            return jhdVar.tag();
        }
        throw new t15("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Map.Entry entry, ujb ujbVar) throws IOException {
        ujbVar.add(f70824g, entry.getKey());
        ujbVar.add(f70825h, entry.getValue());
    }

    private void writeVarInt32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f70827a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f70827a.write(i & 127);
    }

    private void writeVarInt64(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f70827a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f70827a.write(((int) j) & 127);
    }

    /* JADX INFO: renamed from: b */
    public ujb m19496b(@efb ar5 ar5Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        writeVarInt32((getTag(ar5Var) << 3) | 1);
        this.f70827a.write(allocateBuffer(8).putDouble(d).array());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ujb m19497c(@efb ar5 ar5Var, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(ar5Var) << 3) | 5);
        this.f70827a.write(allocateBuffer(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ujb m19498d(@efb ar5 ar5Var, @hib Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            writeVarInt32((getTag(ar5Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f70823f);
            writeVarInt32(bytes.length);
            this.f70827a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m19498d(ar5Var, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                doEncode((tjb<Map.Entry>) f70826i, ar5Var, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m19496b(ar5Var, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return m19497c(ar5Var, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return m19500f(ar5Var, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return m19501g(ar5Var, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            tjb<?> tjbVar = this.f70828b.get(obj.getClass());
            if (tjbVar != null) {
                return doEncode(tjbVar, ar5Var, obj, z);
            }
            g2i<?> g2iVar = this.f70829c.get(obj.getClass());
            return g2iVar != null ? doEncode(g2iVar, ar5Var, obj, z) : obj instanceof ehd ? add(ar5Var, ((ehd) obj).getNumber()) : obj instanceof Enum ? add(ar5Var, ((Enum) obj).ordinal()) : doEncode(this.f70830d, ar5Var, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        writeVarInt32((getTag(ar5Var) << 3) | 2);
        writeVarInt32(bArr.length);
        this.f70827a.write(bArr);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public phd m19499e(@efb ar5 ar5Var, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        jhd protobuf = getProtobuf(ar5Var);
        int i2 = C10960a.f70832a[protobuf.intEncoding().ordinal()];
        if (i2 == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32(i);
        } else if (i2 == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt32((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            writeVarInt32((protobuf.tag() << 3) | 5);
            this.f70827a.write(allocateBuffer(4).putInt(i).array());
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public phd m19500f(@efb ar5 ar5Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        jhd protobuf = getProtobuf(ar5Var);
        int i = C10960a.f70832a[protobuf.intEncoding().ordinal()];
        if (i == 1) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64(j);
        } else if (i == 2) {
            writeVarInt32(protobuf.tag() << 3);
            writeVarInt64((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            writeVarInt32((protobuf.tag() << 3) | 1);
            this.f70827a.write(allocateBuffer(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public phd m19501g(@efb ar5 ar5Var, boolean z, boolean z2) throws IOException {
        return m19499e(ar5Var, z ? 1 : 0, z2);
    }

    /* JADX INFO: renamed from: h */
    public phd m19502h(@hib Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        tjb<?> tjbVar = this.f70828b.get(obj.getClass());
        if (tjbVar != null) {
            tjbVar.encode(obj, this);
            return this;
        }
        throw new t15("No encoder for " + obj.getClass());
    }

    @Override // p000.ujb
    @efb
    public ujb inline(@hib Object obj) throws IOException {
        return m19502h(obj);
    }

    @Override // p000.ujb
    @efb
    public ujb nested(@efb String str) throws IOException {
        return nested(ar5.m2545of(str));
    }

    @Override // p000.ujb
    @efb
    public ujb nested(@efb ar5 ar5Var) throws IOException {
        throw new t15("nested() is not implemented for protobuf encoding.");
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb String str, @hib Object obj) throws IOException {
        return add(ar5.m2545of(str), obj);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb String str, double d) throws IOException {
        return add(ar5.m2545of(str), d);
    }

    private <T> phd doEncode(g2i<T> g2iVar, ar5 ar5Var, T t, boolean z) throws IOException {
        this.f70831e.m22004a(ar5Var, z);
        g2iVar.encode(t, this.f70831e);
        return this;
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb String str, int i) throws IOException {
        return add(ar5.m2545of(str), i);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb String str, long j) throws IOException {
        return add(ar5.m2545of(str), j);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb String str, boolean z) throws IOException {
        return add(ar5.m2545of(str), z);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, @hib Object obj) throws IOException {
        return m19498d(ar5Var, obj, true);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, double d) throws IOException {
        return m19496b(ar5Var, d, true);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, float f) throws IOException {
        return m19497c(ar5Var, f, true);
    }

    @Override // p000.ujb
    @efb
    public phd add(@efb ar5 ar5Var, int i) throws IOException {
        return m19499e(ar5Var, i, true);
    }

    @Override // p000.ujb
    @efb
    public phd add(@efb ar5 ar5Var, long j) throws IOException {
        return m19500f(ar5Var, j, true);
    }

    @Override // p000.ujb
    @efb
    public phd add(@efb ar5 ar5Var, boolean z) throws IOException {
        return m19501g(ar5Var, z, true);
    }
}
