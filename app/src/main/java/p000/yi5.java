package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public class yi5 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f101689b = false;

    /* JADX INFO: renamed from: c */
    public static final String f101690c = "androidx.datastore.preferences.protobuf.Extension";

    /* JADX INFO: renamed from: d */
    public static volatile yi5 f101691d;

    /* JADX INFO: renamed from: e */
    public static final yi5 f101692e = new yi5(true);

    /* JADX INFO: renamed from: a */
    public final Map<C15680b, u27.C13330h<?, ?>> f101693a;

    /* JADX INFO: renamed from: yi5$a */
    public static class C15679a {

        /* JADX INFO: renamed from: a */
        public static final Class<?> f101694a = m26087a();

        private C15679a() {
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m26087a() {
            try {
                return Class.forName(yi5.f101690c);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: yi5$b */
    public static final class C15680b {

        /* JADX INFO: renamed from: a */
        public final Object f101695a;

        /* JADX INFO: renamed from: b */
        public final int f101696b;

        public C15680b(final Object object, final int number) {
            this.f101695a = object;
            this.f101696b = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof C15680b)) {
                return false;
            }
            C15680b c15680b = (C15680b) obj;
            return this.f101695a == c15680b.f101695a && this.f101696b == c15680b.f101696b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f101695a) * 65535) + this.f101696b;
        }
    }

    public yi5() {
        this.f101693a = new HashMap();
    }

    public static yi5 getEmptyRegistry() {
        if (lhd.f57633d) {
            return f101692e;
        }
        yi5 yi5VarCreateEmpty = f101691d;
        if (yi5VarCreateEmpty == null) {
            synchronized (yi5.class) {
                try {
                    yi5VarCreateEmpty = f101691d;
                    if (yi5VarCreateEmpty == null) {
                        yi5VarCreateEmpty = xi5.createEmpty();
                        f101691d = yi5VarCreateEmpty;
                    }
                } finally {
                }
            }
        }
        return yi5VarCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f101689b;
    }

    public static yi5 newInstance() {
        return lhd.f57633d ? new yi5() : xi5.create();
    }

    public static void setEagerlyParseMessageSets(boolean isEagerlyParse) {
        f101689b = isEagerlyParse;
    }

    public final void add(final u27.C13330h<?, ?> extension) {
        this.f101693a.put(new C15680b(extension.getContainingTypeDefaultInstance(), extension.getNumber()), extension);
    }

    public <ContainingType extends psa> u27.C13330h<ContainingType, ?> findLiteExtensionByNumber(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (u27.C13330h) this.f101693a.get(new C15680b(containingTypeDefaultInstance, fieldNumber));
    }

    public yi5 getUnmodifiable() {
        return new yi5(this);
    }

    public yi5(yi5 other) {
        if (other == f101692e) {
            this.f101693a = Collections.emptyMap();
        } else {
            this.f101693a = Collections.unmodifiableMap(other.f101693a);
        }
    }

    public final void add(vi5<?, ?> extension) {
        if (u27.C13330h.class.isAssignableFrom(extension.getClass())) {
            add((u27.C13330h<?, ?>) extension);
        }
        if (lhd.f57633d || !xi5.m25203a(this)) {
            return;
        }
        try {
            getClass().getMethod("add", C15679a.f101694a).invoke(this, extension);
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e);
        }
    }

    public yi5(boolean empty) {
        this.f101693a = Collections.emptyMap();
    }
}
