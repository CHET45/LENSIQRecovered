package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kgb<T> {

    /* JADX INFO: renamed from: b */
    public static final kgb<Object> f54019b = new kgb<>(null);

    /* JADX INFO: renamed from: a */
    public final Object f54020a;

    private kgb(Object obj) {
        this.f54020a = obj;
    }

    @bfb
    public static <T> kgb<T> createOnComplete() {
        return (kgb<T>) f54019b;
    }

    @bfb
    public static <T> kgb<T> createOnError(@bfb Throwable th) {
        xjb.requireNonNull(th, "error is null");
        return new kgb<>(ehb.error(th));
    }

    @bfb
    public static <T> kgb<T> createOnNext(@bfb T t) {
        xjb.requireNonNull(t, "value is null");
        return new kgb<>(t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof kgb) {
            return xjb.equals(this.f54020a, ((kgb) obj).f54020a);
        }
        return false;
    }

    @cib
    public Throwable getError() {
        Object obj = this.f54020a;
        if (ehb.isError(obj)) {
            return ehb.getError(obj);
        }
        return null;
    }

    @cib
    public T getValue() {
        Object obj = this.f54020a;
        if (obj == null || ehb.isError(obj)) {
            return null;
        }
        return (T) this.f54020a;
    }

    public int hashCode() {
        Object obj = this.f54020a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.f54020a == null;
    }

    public boolean isOnError() {
        return ehb.isError(this.f54020a);
    }

    public boolean isOnNext() {
        Object obj = this.f54020a;
        return (obj == null || ehb.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.f54020a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (ehb.isError(obj)) {
            return "OnErrorNotification[" + ehb.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f54020a + "]";
    }
}
