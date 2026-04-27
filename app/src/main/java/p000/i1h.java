package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class i1h<T> {

    /* JADX INFO: renamed from: a */
    public final T f45487a;

    /* JADX INFO: renamed from: b */
    public final long f45488b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f45489c;

    public i1h(@bfb T t, long j, @bfb TimeUnit timeUnit) {
        this.f45487a = t;
        this.f45488b = j;
        this.f45489c = (TimeUnit) xjb.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i1h)) {
            return false;
        }
        i1h i1hVar = (i1h) obj;
        return xjb.equals(this.f45487a, i1hVar.f45487a) && this.f45488b == i1hVar.f45488b && xjb.equals(this.f45489c, i1hVar.f45489c);
    }

    public int hashCode() {
        T t = this.f45487a;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.f45488b;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f45489c.hashCode();
    }

    public long time() {
        return this.f45488b;
    }

    public String toString() {
        return "Timed[time=" + this.f45488b + ", unit=" + this.f45489c + ", value=" + this.f45487a + "]";
    }

    @bfb
    public TimeUnit unit() {
        return this.f45489c;
    }

    @bfb
    public T value() {
        return this.f45487a;
    }

    public long time(@bfb TimeUnit timeUnit) {
        return timeUnit.convert(this.f45488b, this.f45489c);
    }
}
