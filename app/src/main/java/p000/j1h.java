package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class j1h<T> {

    /* JADX INFO: renamed from: a */
    public final T f49368a;

    /* JADX INFO: renamed from: b */
    public final long f49369b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f49370c;

    public j1h(@cfb T value, long time, @cfb TimeUnit unit) {
        Objects.requireNonNull(value, "value is null");
        this.f49368a = value;
        this.f49369b = time;
        Objects.requireNonNull(unit, "unit is null");
        this.f49370c = unit;
    }

    public boolean equals(Object other) {
        if (!(other instanceof j1h)) {
            return false;
        }
        j1h j1hVar = (j1h) other;
        return Objects.equals(this.f49368a, j1hVar.f49368a) && this.f49369b == j1hVar.f49369b && Objects.equals(this.f49370c, j1hVar.f49370c);
    }

    public int hashCode() {
        int iHashCode = this.f49368a.hashCode() * 31;
        long j = this.f49369b;
        return ((iHashCode + ((int) (j ^ (j >>> 31)))) * 31) + this.f49370c.hashCode();
    }

    public long time() {
        return this.f49369b;
    }

    public String toString() {
        return "Timed[time=" + this.f49369b + ", unit=" + this.f49370c + ", value=" + this.f49368a + "]";
    }

    @cfb
    public TimeUnit unit() {
        return this.f49370c;
    }

    @cfb
    public T value() {
        return this.f49368a;
    }

    public long time(@cfb TimeUnit unit) {
        return unit.convert(this.f49369b, this.f49370c);
    }
}
