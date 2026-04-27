package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ar5 {

    /* JADX INFO: renamed from: a */
    public final String f11652a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Object> f11653b;

    /* JADX INFO: renamed from: ar5$b */
    public static final class C1574b {

        /* JADX INFO: renamed from: a */
        public final String f11654a;

        /* JADX INFO: renamed from: b */
        public Map<Class<?>, Object> f11655b = null;

        public C1574b(String str) {
            this.f11654a = str;
        }

        @efb
        public ar5 build() {
            return new ar5(this.f11654a, this.f11655b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f11655b)));
        }

        @efb
        public <T extends Annotation> C1574b withProperty(@efb T t) {
            if (this.f11655b == null) {
                this.f11655b = new HashMap();
            }
            this.f11655b.put(t.annotationType(), t);
            return this;
        }
    }

    @efb
    public static C1574b builder(@efb String str) {
        return new C1574b(str);
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static ar5 m2545of(@efb String str) {
        return new ar5(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar5)) {
            return false;
        }
        ar5 ar5Var = (ar5) obj;
        return this.f11652a.equals(ar5Var.f11652a) && this.f11653b.equals(ar5Var.f11653b);
    }

    @efb
    public String getName() {
        return this.f11652a;
    }

    @hib
    public <T extends Annotation> T getProperty(@efb Class<T> cls) {
        return (T) this.f11653b.get(cls);
    }

    public int hashCode() {
        return (this.f11652a.hashCode() * 31) + this.f11653b.hashCode();
    }

    @efb
    public String toString() {
        return "FieldDescriptor{name=" + this.f11652a + ", properties=" + this.f11653b.values() + "}";
    }

    private ar5(String str, Map<Class<?>, Object> map) {
        this.f11652a = str;
        this.f11653b = map;
    }
}
