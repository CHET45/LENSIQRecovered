package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vn8
public final class v7e<T> implements Serializable {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13927a f90266b = new C13927a(null);

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f90267a;

    /* JADX INFO: renamed from: v7e$a */
    public static final class C13927a {
        public /* synthetic */ C13927a(jt3 jt3Var) {
            this();
        }

        @t28
        @xn8(name = "failure")
        private final <T> Object failure(Throwable th) {
            md8.checkNotNullParameter(th, "exception");
            return v7e.m32723constructorimpl(y7e.createFailure(th));
        }

        @t28
        @xn8(name = FirebaseAnalytics.C3552d.f23173H)
        private final <T> Object success(T t) {
            return v7e.m32723constructorimpl(t);
        }

        private C13927a() {
        }
    }

    /* JADX INFO: renamed from: v7e$b */
    public static final class C13928b implements Serializable {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final Throwable f90268a;

        public C13928b(@yfb Throwable th) {
            md8.checkNotNullParameter(th, "exception");
            this.f90268a = th;
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C13928b) && md8.areEqual(this.f90268a, ((C13928b) obj).f90268a);
        }

        public int hashCode() {
            return this.f90268a.hashCode();
        }

        @yfb
        public String toString() {
            return "Failure(" + this.f90268a + ')';
        }
    }

    @yjd
    private /* synthetic */ v7e(Object obj) {
        this.f90267a = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v7e m32722boximpl(Object obj) {
        return new v7e(obj);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m32723constructorimpl(@gib Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32724equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof v7e) && md8.areEqual(obj, ((v7e) obj2).m32732unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32725equalsimpl0(Object obj, Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    @gib
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m32726exceptionOrNullimpl(Object obj) {
        if (obj instanceof C13928b) {
            return ((C13928b) obj).f90268a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    private static final T m32727getOrNullimpl(Object obj) {
        if (m32729isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @yjd
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32728hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m32729isFailureimpl(Object obj) {
        return obj instanceof C13928b;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m32730isSuccessimpl(Object obj) {
        return !(obj instanceof C13928b);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32731toStringimpl(Object obj) {
        if (obj instanceof C13928b) {
            return ((C13928b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m32724equalsimpl(this.f90267a, obj);
    }

    public int hashCode() {
        return m32728hashCodeimpl(this.f90267a);
    }

    @yfb
    public String toString() {
        return m32731toStringimpl(this.f90267a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m32732unboximpl() {
        return this.f90267a;
    }
}
