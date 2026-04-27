package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class jgb<T> {

    /* JADX INFO: renamed from: b */
    public static final jgb<Object> f50497b = new jgb<>(null);

    /* JADX INFO: renamed from: a */
    public final Object f50498a;

    private jgb(@dib Object value) {
        this.f50498a = value;
    }

    @cfb
    public static <T> jgb<T> createOnComplete() {
        return (jgb<T>) f50497b;
    }

    @cfb
    public static <T> jgb<T> createOnError(@cfb Throwable error) {
        Objects.requireNonNull(error, "error is null");
        return new jgb<>(fhb.error(error));
    }

    @cfb
    public static <T> jgb<T> createOnNext(T value) {
        Objects.requireNonNull(value, "value is null");
        return new jgb<>(value);
    }

    public boolean equals(Object obj) {
        if (obj instanceof jgb) {
            return Objects.equals(this.f50498a, ((jgb) obj).f50498a);
        }
        return false;
    }

    @dib
    public Throwable getError() {
        Object obj = this.f50498a;
        if (fhb.isError(obj)) {
            return fhb.getError(obj);
        }
        return null;
    }

    @dib
    public T getValue() {
        Object obj = this.f50498a;
        if (obj == null || fhb.isError(obj)) {
            return null;
        }
        return (T) this.f50498a;
    }

    public int hashCode() {
        Object obj = this.f50498a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.f50498a == null;
    }

    public boolean isOnError() {
        return fhb.isError(this.f50498a);
    }

    public boolean isOnNext() {
        Object obj = this.f50498a;
        return (obj == null || fhb.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.f50498a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (fhb.isError(obj)) {
            return "OnErrorNotification[" + fhb.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f50498a + "]";
    }
}
