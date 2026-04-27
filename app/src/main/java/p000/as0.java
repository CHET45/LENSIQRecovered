package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class as0 implements zca {

    /* JADX INFO: renamed from: b */
    public final long f11709b;

    /* JADX INFO: renamed from: c */
    public final long f11710c;

    /* JADX INFO: renamed from: d */
    public long f11711d;

    public as0(long j, long j2) {
        this.f11709b = j;
        this.f11710c = j2;
        reset();
    }

    /* JADX INFO: renamed from: a */
    public final void m2557a() {
        long j = this.f11711d;
        if (j < this.f11709b || j > this.f11710c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m2558b() {
        return this.f11711d;
    }

    @Override // p000.zca
    public boolean isEnded() {
        return this.f11711d > this.f11710c;
    }

    @Override // p000.zca
    public boolean next() {
        this.f11711d++;
        return !isEnded();
    }

    @Override // p000.zca
    public void reset() {
        this.f11711d = this.f11709b - 1;
    }
}
