package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public final class vph implements Iterator<oph>, uo8 {

    /* JADX INFO: renamed from: a */
    public final long f91955a;

    /* JADX INFO: renamed from: b */
    public boolean f91956b;

    /* JADX INFO: renamed from: c */
    public final long f91957c;

    /* JADX INFO: renamed from: d */
    public long f91958d;

    public /* synthetic */ vph(long j, long j2, long j3, jt3 jt3Var) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f91956b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ oph next() {
        return oph.m31527boximpl(m32777nextsVKNKU());
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m32777nextsVKNKU() {
        long j = this.f91958d;
        if (j != this.f91955a) {
            this.f91958d = oph.m31533constructorimpl(this.f91957c + j);
        } else {
            if (!this.f91956b) {
                throw new NoSuchElementException();
            }
            this.f91956b = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private vph(long j, long j2, long j3) {
        this.f91955a = j2;
        boolean z = false;
        if (j3 <= 0 ? Long.compareUnsigned(j, j2) >= 0 : Long.compareUnsigned(j, j2) <= 0) {
            z = true;
        }
        this.f91956b = z;
        this.f91957c = oph.m31533constructorimpl(j3);
        this.f91958d = this.f91956b ? j : j2;
    }
}
