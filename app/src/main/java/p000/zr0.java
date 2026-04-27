package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class zr0 implements ada {

    /* JADX INFO: renamed from: b */
    public final long f105781b;

    /* JADX INFO: renamed from: c */
    public final long f105782c;

    /* JADX INFO: renamed from: d */
    public long f105783d;

    public zr0(long j, long j2) {
        this.f105781b = j;
        this.f105782c = j2;
        reset();
    }

    /* JADX INFO: renamed from: a */
    public final void m26957a() {
        long j = this.f105783d;
        if (j < this.f105781b || j > this.f105782c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m26958b() {
        return this.f105783d;
    }

    @Override // p000.ada
    public boolean isEnded() {
        return this.f105783d > this.f105782c;
    }

    @Override // p000.ada
    public boolean next() {
        this.f105783d++;
        return !isEnded();
    }

    @Override // p000.ada
    public void reset() {
        this.f105783d = this.f105781b - 1;
    }
}
