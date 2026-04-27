package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class cb8 {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f16192d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final String f16193a;

    /* JADX INFO: renamed from: b */
    @eib
    public final String f16194b;

    /* JADX INFO: renamed from: c */
    public final long f16195c;

    public cb8(String str, String str2, long j) {
        v7d.checkNotNull(str, "typeName");
        v7d.checkArgument(!str.isEmpty(), "empty type");
        this.f16193a = str;
        this.f16194b = str2;
        this.f16195c = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m3888a() {
        return f16192d.incrementAndGet();
    }

    public static cb8 allocate(Class<?> cls, @eib String str) {
        return allocate(getClassName(cls), str);
    }

    private static String getClassName(Class<?> cls) {
        String simpleName = ((Class) v7d.checkNotNull(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    @eib
    public String getDetails() {
        return this.f16194b;
    }

    public long getId() {
        return this.f16195c;
    }

    public String getTypeName() {
        return this.f16193a;
    }

    public String shortName() {
        return this.f16193a + "<" + this.f16195c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(shortName());
        if (this.f16194b != null) {
            sb.append(": (");
            sb.append(this.f16194b);
            sb.append(')');
        }
        return sb.toString();
    }

    public static cb8 allocate(String str, @eib String str2) {
        return new cb8(str, str2, m3888a());
    }
}
