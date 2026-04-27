package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class aw1 extends wv1 {

    /* JADX INFO: renamed from: a */
    public final int f11956a;

    /* JADX INFO: renamed from: b */
    public final int f11957b;

    /* JADX INFO: renamed from: c */
    public boolean f11958c;

    /* JADX INFO: renamed from: d */
    public int f11959d;

    public aw1(char c, char c2, int i) {
        this.f11956a = i;
        this.f11957b = c2;
        boolean z = false;
        if (i <= 0 ? md8.compare((int) c, (int) c2) >= 0 : md8.compare((int) c, (int) c2) <= 0) {
            z = true;
        }
        this.f11958c = z;
        this.f11959d = z ? c : c2;
    }

    public final int getStep() {
        return this.f11956a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11958c;
    }

    @Override // p000.wv1
    public char nextChar() {
        int i = this.f11959d;
        if (i != this.f11957b) {
            this.f11959d = this.f11956a + i;
        } else {
            if (!this.f11958c) {
                throw new NoSuchElementException();
            }
            this.f11958c = false;
        }
        return (char) i;
    }
}
