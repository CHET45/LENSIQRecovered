package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class tl9 extends gl9 {

    /* JADX INFO: renamed from: a */
    public final long f85229a;

    /* JADX INFO: renamed from: b */
    public final long f85230b;

    /* JADX INFO: renamed from: c */
    public boolean f85231c;

    /* JADX INFO: renamed from: d */
    public long f85232d;

    public tl9(long j, long j2, long j3) {
        this.f85229a = j3;
        this.f85230b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f85231c = z;
        this.f85232d = z ? j : j2;
    }

    public final long getStep() {
        return this.f85229a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85231c;
    }

    @Override // p000.gl9
    public long nextLong() {
        long j = this.f85232d;
        if (j != this.f85230b) {
            this.f85232d = this.f85229a + j;
        } else {
            if (!this.f85231c) {
                throw new NoSuchElementException();
            }
            this.f85231c = false;
        }
        return j;
    }
}
