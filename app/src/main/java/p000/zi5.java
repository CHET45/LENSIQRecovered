package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public class zi5 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f105151b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f105152c = true;

    /* JADX INFO: renamed from: d */
    public static final String f105153d = "com.google.protobuf.Extension";

    /* JADX INFO: renamed from: e */
    public static volatile zi5 f105154e;

    /* JADX INFO: renamed from: f */
    public static final zi5 f105155f = new zi5(true);

    /* JADX INFO: renamed from: a */
    public final Map<C16152b, v27.C13829h<?, ?>> f105156a;

    /* JADX INFO: renamed from: zi5$a */
    public static class C16151a {

        /* JADX INFO: renamed from: a */
        public static final Class<?> f105157a = m26848a();

        private C16151a() {
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m26848a() {
            try {
                return Class.forName(zi5.f105153d);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: zi5$b */
    public static final class C16152b {

        /* JADX INFO: renamed from: a */
        public final Object f105158a;

        /* JADX INFO: renamed from: b */
        public final int f105159b;

        public C16152b(final Object object, final int number) {
            this.f105158a = object;
            this.f105159b = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof C16152b)) {
                return false;
            }
            C16152b c16152b = (C16152b) obj;
            return this.f105158a == c16152b.f105158a && this.f105159b == c16152b.f105159b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f105158a) * 65535) + this.f105159b;
        }
    }

    public zi5() {
        this.f105156a = new HashMap();
    }

    public static zi5 getEmptyRegistry() {
        if (!f105152c) {
            return f105155f;
        }
        zi5 zi5VarCreateEmpty = f105154e;
        if (zi5VarCreateEmpty == null) {
            synchronized (zi5.class) {
                try {
                    zi5VarCreateEmpty = f105154e;
                    if (zi5VarCreateEmpty == null) {
                        zi5VarCreateEmpty = wi5.createEmpty();
                        f105154e = zi5VarCreateEmpty;
                    }
                } finally {
                }
            }
        }
        return zi5VarCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f105151b;
    }

    public static zi5 newInstance() {
        return f105152c ? wi5.create() : new zi5();
    }

    public static void setEagerlyParseMessageSets(boolean isEagerlyParse) {
        f105151b = isEagerlyParse;
    }

    public final void add(final v27.C13829h<?, ?> extension) {
        this.f105156a.put(new C16152b(extension.getContainingTypeDefaultInstance(), extension.getNumber()), extension);
    }

    public <ContainingType extends qsa> v27.C13829h<ContainingType, ?> findLiteExtensionByNumber(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (v27.C13829h) this.f105156a.get(new C16152b(containingTypeDefaultInstance, fieldNumber));
    }

    public zi5 getUnmodifiable() {
        return new zi5(this);
    }

    public zi5(zi5 other) {
        if (other == f105155f) {
            this.f105156a = Collections.emptyMap();
        } else {
            this.f105156a = Collections.unmodifiableMap(other.f105156a);
        }
    }

    public final void add(ui5<?, ?> extension) {
        if (v27.C13829h.class.isAssignableFrom(extension.getClass())) {
            add((v27.C13829h<?, ?>) extension);
        }
        if (f105152c && wi5.m24569a(this)) {
            try {
                getClass().getMethod("add", C16151a.f105157a).invoke(this, extension);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e);
            }
        }
    }

    public zi5(boolean empty) {
        this.f105156a = Collections.emptyMap();
    }
}
