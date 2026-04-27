package p000;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public enum fhb {
    COMPLETE;

    /* JADX INFO: renamed from: fhb$a */
    public static final class C5805a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: a */
        public final lf4 f36595a;

        public C5805a(lf4 d) {
            this.f36595a = d;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f36595a + "]";
        }
    }

    /* JADX INFO: renamed from: fhb$b */
    public static final class C5806b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: a */
        public final Throwable f36596a;

        public C5806b(Throwable e) {
            this.f36596a = e;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5806b) {
                return Objects.equals(this.f36596a, ((C5806b) obj).f36596a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36596a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f36596a + "]";
        }
    }

    /* JADX INFO: renamed from: fhb$c */
    public static final class C5807c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: a */
        public final fdg f36597a;

        public C5807c(fdg s) {
            this.f36597a = s;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f36597a + "]";
        }
    }

    public static <T> boolean accept(Object o, ycg<? super T> s) {
        if (o == COMPLETE) {
            s.onComplete();
            return true;
        }
        if (o instanceof C5806b) {
            s.onError(((C5806b) o).f36596a);
            return true;
        }
        s.onNext(o);
        return false;
    }

    public static <T> boolean acceptFull(Object o, ycg<? super T> s) {
        if (o == COMPLETE) {
            s.onComplete();
            return true;
        }
        if (o instanceof C5806b) {
            s.onError(((C5806b) o).f36596a);
            return true;
        }
        if (o instanceof C5807c) {
            s.onSubscribe(((C5807c) o).f36597a);
            return false;
        }
        s.onNext(o);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(lf4 d) {
        return new C5805a(d);
    }

    public static Object error(Throwable e) {
        return new C5806b(e);
    }

    public static lf4 getDisposable(Object o) {
        return ((C5805a) o).f36595a;
    }

    public static Throwable getError(Object o) {
        return ((C5806b) o).f36596a;
    }

    public static fdg getSubscription(Object o) {
        return ((C5807c) o).f36597a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object o) {
        return o;
    }

    public static boolean isComplete(Object o) {
        return o == COMPLETE;
    }

    public static boolean isDisposable(Object o) {
        return o instanceof C5805a;
    }

    public static boolean isError(Object o) {
        return o instanceof C5806b;
    }

    public static boolean isSubscription(Object o) {
        return o instanceof C5807c;
    }

    public static <T> Object next(T value) {
        return value;
    }

    public static Object subscription(fdg s) {
        return new C5807c(s);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object o, pxb<? super T> observer) {
        if (o == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (o instanceof C5806b) {
            observer.onError(((C5806b) o).f36596a);
            return true;
        }
        observer.onNext(o);
        return false;
    }

    public static <T> boolean acceptFull(Object o, pxb<? super T> observer) {
        if (o == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (o instanceof C5806b) {
            observer.onError(((C5806b) o).f36596a);
            return true;
        }
        if (o instanceof C5805a) {
            observer.onSubscribe(((C5805a) o).f36595a);
            return false;
        }
        observer.onNext(o);
        return false;
    }
}
