package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public enum ehb {
    COMPLETE;

    /* JADX INFO: renamed from: ehb$a */
    public static final class C5311a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: a */
        public final mf4 f33038a;

        public C5311a(mf4 mf4Var) {
            this.f33038a = mf4Var;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f33038a + "]";
        }
    }

    /* JADX INFO: renamed from: ehb$b */
    public static final class C5312b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: a */
        public final Throwable f33039a;

        public C5312b(Throwable th) {
            this.f33039a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5312b) {
                return xjb.equals(this.f33039a, ((C5312b) obj).f33039a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33039a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f33039a + "]";
        }
    }

    /* JADX INFO: renamed from: ehb$c */
    public static final class C5313c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: a */
        public final fdg f33040a;

        public C5313c(fdg fdgVar) {
            this.f33040a = fdgVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f33040a + "]";
        }
    }

    public static <T> boolean accept(Object obj, ycg<? super T> ycgVar) {
        if (obj == COMPLETE) {
            ycgVar.onComplete();
            return true;
        }
        if (obj instanceof C5312b) {
            ycgVar.onError(((C5312b) obj).f33039a);
            return true;
        }
        ycgVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, ycg<? super T> ycgVar) {
        if (obj == COMPLETE) {
            ycgVar.onComplete();
            return true;
        }
        if (obj instanceof C5312b) {
            ycgVar.onError(((C5312b) obj).f33039a);
            return true;
        }
        if (obj instanceof C5313c) {
            ycgVar.onSubscribe(((C5313c) obj).f33040a);
            return false;
        }
        ycgVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(mf4 mf4Var) {
        return new C5311a(mf4Var);
    }

    public static Object error(Throwable th) {
        return new C5312b(th);
    }

    public static mf4 getDisposable(Object obj) {
        return ((C5311a) obj).f33038a;
    }

    public static Throwable getError(Object obj) {
        return ((C5312b) obj).f33039a;
    }

    public static fdg getSubscription(Object obj) {
        return ((C5313c) obj).f33040a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C5311a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C5312b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C5313c;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(fdg fdgVar) {
        return new C5313c(fdgVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, oxb<? super T> oxbVar) {
        if (obj == COMPLETE) {
            oxbVar.onComplete();
            return true;
        }
        if (obj instanceof C5312b) {
            oxbVar.onError(((C5312b) obj).f33039a);
            return true;
        }
        oxbVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, oxb<? super T> oxbVar) {
        if (obj == COMPLETE) {
            oxbVar.onComplete();
            return true;
        }
        if (obj instanceof C5312b) {
            oxbVar.onError(((C5312b) obj).f33039a);
            return true;
        }
        if (obj instanceof C5311a) {
            oxbVar.onSubscribe(((C5311a) obj).f33038a);
            return false;
        }
        oxbVar.onNext(obj);
        return false;
    }
}
