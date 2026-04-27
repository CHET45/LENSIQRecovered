package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class g23 implements Serializable {

    /* JADX INFO: renamed from: a */
    public int f38293a;

    public g23(int value) {
        this.f38293a = value;
    }

    public void add(int delta) {
        this.f38293a += delta;
    }

    public int addAndGet(int delta) {
        int i = this.f38293a + delta;
        this.f38293a = i;
        return i;
    }

    public boolean equals(@wx1 Object obj) {
        return (obj instanceof g23) && ((g23) obj).f38293a == this.f38293a;
    }

    public int get() {
        return this.f38293a;
    }

    public int getAndSet(int newValue) {
        int i = this.f38293a;
        this.f38293a = newValue;
        return i;
    }

    public int hashCode() {
        return this.f38293a;
    }

    public void set(int newValue) {
        this.f38293a = newValue;
    }

    public String toString() {
        return Integer.toString(this.f38293a);
    }
}
