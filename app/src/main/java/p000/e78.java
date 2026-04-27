package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class e78 extends o68 {

    /* JADX INFO: renamed from: a */
    public final int f32041a;

    /* JADX INFO: renamed from: b */
    public final int f32042b;

    /* JADX INFO: renamed from: c */
    public boolean f32043c;

    /* JADX INFO: renamed from: d */
    public int f32044d;

    public e78(int i, int i2, int i3) {
        this.f32041a = i3;
        this.f32042b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f32043c = z;
        this.f32044d = z ? i : i2;
    }

    public final int getStep() {
        return this.f32041a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32043c;
    }

    @Override // p000.o68
    public int nextInt() {
        int i = this.f32044d;
        if (i != this.f32042b) {
            this.f32044d = this.f32041a + i;
        } else {
            if (!this.f32043c) {
                throw new NoSuchElementException();
            }
            this.f32043c = false;
        }
        return i;
    }
}
