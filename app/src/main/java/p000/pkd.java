package p000;

import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes5.dex */
public final class pkd<T> {

    /* JADX INFO: renamed from: a */
    public final Class<? extends Annotation> f71179a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f71180b;

    /* JADX INFO: renamed from: pkd$a */
    public @interface InterfaceC10992a {
    }

    public pkd(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f71179a = cls;
        this.f71180b = cls2;
    }

    @efb
    public static <T> pkd<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new pkd<>(cls, cls2);
    }

    @efb
    public static <T> pkd<T> unqualified(Class<T> cls) {
        return new pkd<>(InterfaceC10992a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pkd.class != obj.getClass()) {
            return false;
        }
        pkd pkdVar = (pkd) obj;
        if (this.f71180b.equals(pkdVar.f71180b)) {
            return this.f71179a.equals(pkdVar.f71179a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f71180b.hashCode() * 31) + this.f71179a.hashCode();
    }

    public String toString() {
        if (this.f71179a == InterfaceC10992a.class) {
            return this.f71180b.getName();
        }
        return "@" + this.f71179a.getName() + C2473f.f17566z + this.f71180b.getName();
    }
}
