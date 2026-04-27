package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000.gd9;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public final class hl1 {

    /* JADX INFO: renamed from: o */
    public static final azf f44044o = azf.m2775on(C4584d2.f28238g).trimResults();

    /* JADX INFO: renamed from: p */
    public static final azf f44045p = azf.m2775on('=').trimResults();

    /* JADX INFO: renamed from: q */
    public static final ox7<String, InterfaceC6901m> f44046q;

    /* JADX INFO: renamed from: a */
    @gdi
    @wx1
    public Integer f44047a;

    /* JADX INFO: renamed from: b */
    @gdi
    @wx1
    public Long f44048b;

    /* JADX INFO: renamed from: c */
    @gdi
    @wx1
    public Long f44049c;

    /* JADX INFO: renamed from: d */
    @gdi
    @wx1
    public Integer f44050d;

    /* JADX INFO: renamed from: e */
    @gdi
    @wx1
    public gd9.EnumC6250t f44051e;

    /* JADX INFO: renamed from: f */
    @gdi
    @wx1
    public gd9.EnumC6250t f44052f;

    /* JADX INFO: renamed from: g */
    @gdi
    @wx1
    public Boolean f44053g;

    /* JADX INFO: renamed from: h */
    @gdi
    public long f44054h;

    /* JADX INFO: renamed from: i */
    @gdi
    @wx1
    public TimeUnit f44055i;

    /* JADX INFO: renamed from: j */
    @gdi
    public long f44056j;

    /* JADX INFO: renamed from: k */
    @gdi
    @wx1
    public TimeUnit f44057k;

    /* JADX INFO: renamed from: l */
    @gdi
    public long f44058l;

    /* JADX INFO: renamed from: m */
    @gdi
    @wx1
    public TimeUnit f44059m;

    /* JADX INFO: renamed from: n */
    public final String f44060n;

    /* JADX INFO: renamed from: hl1$a */
    public static /* synthetic */ class C6889a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44061a;

        static {
            int[] iArr = new int[gd9.EnumC6250t.values().length];
            f44061a = iArr;
            try {
                iArr[gd9.EnumC6250t.f39510c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44061a[gd9.EnumC6250t.f39509b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: hl1$b */
    public static class C6890b extends AbstractC6892d {
        @Override // p000.hl1.AbstractC6892d
        /* JADX INFO: renamed from: a */
        public void mo12456a(hl1 spec, long duration, TimeUnit unit) {
            v7d.checkArgument(spec.f44057k == null, "expireAfterAccess already set");
            spec.f44056j = duration;
            spec.f44057k = unit;
        }
    }

    /* JADX INFO: renamed from: hl1$c */
    public static class C6891c extends AbstractC6894f {
        @Override // p000.hl1.AbstractC6894f
        /* JADX INFO: renamed from: a */
        public void mo12457a(hl1 spec, int value) {
            Integer num = spec.f44050d;
            v7d.checkArgument(num == null, "concurrency level was already set to %s", num);
            spec.f44050d = Integer.valueOf(value);
        }
    }

    /* JADX INFO: renamed from: hl1$d */
    public static abstract class AbstractC6892d implements InterfaceC6901m {
        /* JADX INFO: renamed from: a */
        public abstract void mo12456a(hl1 spec, long duration, TimeUnit unit);

        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, @wx1 String value) {
            TimeUnit timeUnit;
            if (u8g.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char cCharAt = value.charAt(value.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(hl1.format("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                mo12456a(spec, Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(hl1.format("key %s value set to %s, must be integer", key, value));
            }
        }
    }

    /* JADX INFO: renamed from: hl1$e */
    public static class C6893e extends AbstractC6894f {
        @Override // p000.hl1.AbstractC6894f
        /* JADX INFO: renamed from: a */
        public void mo12457a(hl1 spec, int value) {
            Integer num = spec.f44047a;
            v7d.checkArgument(num == null, "initial capacity was already set to %s", num);
            spec.f44047a = Integer.valueOf(value);
        }
    }

    /* JADX INFO: renamed from: hl1$f */
    public static abstract class AbstractC6894f implements InterfaceC6901m {
        /* JADX INFO: renamed from: a */
        public abstract void mo12457a(hl1 spec, int value);

        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, String value) {
            if (!u8g.isNullOrEmpty(value)) {
                try {
                    mo12457a(spec, Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(hl1.format("key %s value set to %s, must be integer", key, value), e);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }
    }

    /* JADX INFO: renamed from: hl1$g */
    public static class C6895g implements InterfaceC6901m {

        /* JADX INFO: renamed from: a */
        public final gd9.EnumC6250t f44062a;

        public C6895g(gd9.EnumC6250t strength) {
            this.f44062a = strength;
        }

        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, @wx1 String value) {
            v7d.checkArgument(value == null, "key %s does not take values", key);
            gd9.EnumC6250t enumC6250t = spec.f44051e;
            v7d.checkArgument(enumC6250t == null, "%s was already set to %s", key, enumC6250t);
            spec.f44051e = this.f44062a;
        }
    }

    /* JADX INFO: renamed from: hl1$h */
    public static abstract class AbstractC6896h implements InterfaceC6901m {
        /* JADX INFO: renamed from: a */
        public abstract void mo12458a(hl1 spec, long value);

        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, String value) {
            if (!u8g.isNullOrEmpty(value)) {
                try {
                    mo12458a(spec, Long.parseLong(value));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(hl1.format("key %s value set to %s, must be integer", key, value), e);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }
    }

    /* JADX INFO: renamed from: hl1$i */
    public static class C6897i extends AbstractC6896h {
        @Override // p000.hl1.AbstractC6896h
        /* JADX INFO: renamed from: a */
        public void mo12458a(hl1 spec, long value) {
            Long l = spec.f44048b;
            v7d.checkArgument(l == null, "maximum size was already set to %s", l);
            Long l2 = spec.f44049c;
            v7d.checkArgument(l2 == null, "maximum weight was already set to %s", l2);
            spec.f44048b = Long.valueOf(value);
        }
    }

    /* JADX INFO: renamed from: hl1$j */
    public static class C6898j extends AbstractC6896h {
        @Override // p000.hl1.AbstractC6896h
        /* JADX INFO: renamed from: a */
        public void mo12458a(hl1 spec, long value) {
            Long l = spec.f44049c;
            v7d.checkArgument(l == null, "maximum weight was already set to %s", l);
            Long l2 = spec.f44048b;
            v7d.checkArgument(l2 == null, "maximum size was already set to %s", l2);
            spec.f44049c = Long.valueOf(value);
        }
    }

    /* JADX INFO: renamed from: hl1$k */
    public static class C6899k implements InterfaceC6901m {
        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, @wx1 String value) {
            v7d.checkArgument(value == null, "recordStats does not take values");
            v7d.checkArgument(spec.f44053g == null, "recordStats already set");
            spec.f44053g = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: hl1$l */
    public static class C6900l extends AbstractC6892d {
        @Override // p000.hl1.AbstractC6892d
        /* JADX INFO: renamed from: a */
        public void mo12456a(hl1 spec, long duration, TimeUnit unit) {
            v7d.checkArgument(spec.f44059m == null, "refreshAfterWrite already set");
            spec.f44058l = duration;
            spec.f44059m = unit;
        }
    }

    /* JADX INFO: renamed from: hl1$m */
    public interface InterfaceC6901m {
        void parse(hl1 spec, String key, @wx1 String value);
    }

    /* JADX INFO: renamed from: hl1$n */
    public static class C6902n implements InterfaceC6901m {

        /* JADX INFO: renamed from: a */
        public final gd9.EnumC6250t f44063a;

        public C6902n(gd9.EnumC6250t strength) {
            this.f44063a = strength;
        }

        @Override // p000.hl1.InterfaceC6901m
        public void parse(hl1 spec, String key, @wx1 String value) {
            v7d.checkArgument(value == null, "key %s does not take values", key);
            gd9.EnumC6250t enumC6250t = spec.f44052f;
            v7d.checkArgument(enumC6250t == null, "%s was already set to %s", key, enumC6250t);
            spec.f44052f = this.f44063a;
        }
    }

    /* JADX INFO: renamed from: hl1$o */
    public static class C6903o extends AbstractC6892d {
        @Override // p000.hl1.AbstractC6892d
        /* JADX INFO: renamed from: a */
        public void mo12456a(hl1 spec, long duration, TimeUnit unit) {
            v7d.checkArgument(spec.f44055i == null, "expireAfterWrite already set");
            spec.f44054h = duration;
            spec.f44055i = unit;
        }
    }

    static {
        ox7.C10705d c10705dPut = ox7.builder().put("initialCapacity", new C6893e()).put("maximumSize", new C6897i()).put("maximumWeight", new C6898j()).put("concurrencyLevel", new C6891c());
        gd9.EnumC6250t enumC6250t = gd9.EnumC6250t.f39510c;
        f44046q = c10705dPut.put("weakKeys", new C6895g(enumC6250t)).put("softValues", new C6902n(gd9.EnumC6250t.f39509b)).put("weakValues", new C6902n(enumC6250t)).put("recordStats", new C6899k()).put("expireAfterAccess", new C6890b()).put("expireAfterWrite", new C6903o()).put("refreshAfterWrite", new C6900l()).put("refreshInterval", new C6900l()).buildOrThrow();
    }

    private hl1(String specification) {
        this.f44060n = specification;
    }

    public static hl1 disableCaching() {
        return parse("maximumSize=0");
    }

    @wx1
    private static Long durationInNanos(long duration, @wx1 TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return Long.valueOf(unit.toNanos(duration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String format(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hl1 parse(String cacheBuilderSpecification) {
        hl1 hl1Var = new hl1(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (String str : f44044o.split(cacheBuilderSpecification)) {
                kx7 kx7VarCopyOf = kx7.copyOf(f44045p.split(str));
                v7d.checkArgument(!kx7VarCopyOf.isEmpty(), "blank key-value pair");
                v7d.checkArgument(kx7VarCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str);
                String str2 = (String) kx7VarCopyOf.get(0);
                InterfaceC6901m interfaceC6901m = f44046q.get(str2);
                v7d.checkArgument(interfaceC6901m != null, "unknown key %s", str2);
                interfaceC6901m.parse(hl1Var, str2, kx7VarCopyOf.size() == 1 ? null : (String) kx7VarCopyOf.get(1));
            }
        }
        return hl1Var;
    }

    /* JADX INFO: renamed from: b */
    public gl1<Object, Object> m12455b() {
        gl1<Object, Object> gl1VarNewBuilder = gl1.newBuilder();
        Integer num = this.f44047a;
        if (num != null) {
            gl1VarNewBuilder.initialCapacity(num.intValue());
        }
        Long l = this.f44048b;
        if (l != null) {
            gl1VarNewBuilder.maximumSize(l.longValue());
        }
        Long l2 = this.f44049c;
        if (l2 != null) {
            gl1VarNewBuilder.maximumWeight(l2.longValue());
        }
        Integer num2 = this.f44050d;
        if (num2 != null) {
            gl1VarNewBuilder.concurrencyLevel(num2.intValue());
        }
        gd9.EnumC6250t enumC6250t = this.f44051e;
        if (enumC6250t != null) {
            if (C6889a.f44061a[enumC6250t.ordinal()] != 1) {
                throw new AssertionError();
            }
            gl1VarNewBuilder.weakKeys();
        }
        gd9.EnumC6250t enumC6250t2 = this.f44052f;
        if (enumC6250t2 != null) {
            int i = C6889a.f44061a[enumC6250t2.ordinal()];
            if (i == 1) {
                gl1VarNewBuilder.weakValues();
            } else {
                if (i != 2) {
                    throw new AssertionError();
                }
                gl1VarNewBuilder.softValues();
            }
        }
        Boolean bool = this.f44053g;
        if (bool != null && bool.booleanValue()) {
            gl1VarNewBuilder.recordStats();
        }
        TimeUnit timeUnit = this.f44055i;
        if (timeUnit != null) {
            gl1VarNewBuilder.expireAfterWrite(this.f44054h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f44057k;
        if (timeUnit2 != null) {
            gl1VarNewBuilder.expireAfterAccess(this.f44056j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f44059m;
        if (timeUnit3 != null) {
            gl1VarNewBuilder.refreshAfterWrite(this.f44058l, timeUnit3);
        }
        return gl1VarNewBuilder;
    }

    public boolean equals(@wx1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl1)) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        return okb.equal(this.f44047a, hl1Var.f44047a) && okb.equal(this.f44048b, hl1Var.f44048b) && okb.equal(this.f44049c, hl1Var.f44049c) && okb.equal(this.f44050d, hl1Var.f44050d) && okb.equal(this.f44051e, hl1Var.f44051e) && okb.equal(this.f44052f, hl1Var.f44052f) && okb.equal(this.f44053g, hl1Var.f44053g) && okb.equal(durationInNanos(this.f44054h, this.f44055i), durationInNanos(hl1Var.f44054h, hl1Var.f44055i)) && okb.equal(durationInNanos(this.f44056j, this.f44057k), durationInNanos(hl1Var.f44056j, hl1Var.f44057k)) && okb.equal(durationInNanos(this.f44058l, this.f44059m), durationInNanos(hl1Var.f44058l, hl1Var.f44059m));
    }

    public int hashCode() {
        return okb.hashCode(this.f44047a, this.f44048b, this.f44049c, this.f44050d, this.f44051e, this.f44052f, this.f44053g, durationInNanos(this.f44054h, this.f44055i), durationInNanos(this.f44056j, this.f44057k), durationInNanos(this.f44058l, this.f44059m));
    }

    public String toParsableString() {
        return this.f44060n;
    }

    public String toString() {
        return yya.toStringHelper(this).addValue(toParsableString()).toString();
    }
}
