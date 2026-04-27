package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class y4d {

    /* JADX INFO: renamed from: g */
    public static final int f100337g = 0;

    /* JADX INFO: renamed from: a */
    public final int f100338a;

    /* JADX INFO: renamed from: b */
    public final boolean f100339b;

    /* JADX INFO: renamed from: c */
    public final boolean f100340c;

    /* JADX INFO: renamed from: d */
    public final boolean f100341d;

    /* JADX INFO: renamed from: e */
    public final boolean f100342e;

    /* JADX INFO: renamed from: f */
    public final boolean f100343f;

    public y4d(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f100338a = i;
        this.f100339b = z;
        this.f100340c = z2;
        this.f100341d = z3;
        this.f100342e = z4;
        this.f100343f = z5;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4d)) {
            return false;
        }
        y4d y4dVar = (y4d) obj;
        return this.f100338a == y4dVar.f100338a && this.f100339b == y4dVar.f100339b && this.f100340c == y4dVar.f100340c && this.f100341d == y4dVar.f100341d && this.f100342e == y4dVar.f100342e && this.f100343f == y4dVar.f100343f;
    }

    public final boolean getClippingEnabled() {
        return (this.f100338a & 512) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.f100340c;
    }

    public final boolean getDismissOnClickOutside() {
        return this.f100341d;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.f100342e;
    }

    public final int getFlags$ui_release() {
        return this.f100338a;
    }

    public final boolean getFocusable() {
        return (this.f100338a & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui_release() {
        return this.f100339b;
    }

    @yfb
    public final yte getSecurePolicy() {
        return this.f100339b ? yte.Inherit : (this.f100338a & 8192) == 0 ? yte.SecureOff : yte.SecureOn;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f100343f;
    }

    public int hashCode() {
        return (((((((((this.f100338a * 31) + Boolean.hashCode(this.f100339b)) * 31) + Boolean.hashCode(this.f100340c)) * 31) + Boolean.hashCode(this.f100341d)) * 31) + Boolean.hashCode(this.f100342e)) * 31) + Boolean.hashCode(this.f100343f);
    }

    public /* synthetic */ y4d(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, jt3 jt3Var) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? z4 : true, (i2 & 32) != 0 ? false : z5);
    }

    public /* synthetic */ y4d(boolean z, boolean z2, boolean z3, boolean z4, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public y4d(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, yte.Inherit, true, z4);
    }

    public /* synthetic */ y4d(boolean z, boolean z2, boolean z3, yte yteVar, boolean z4, boolean z5, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? yte.Inherit : yteVar, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    public y4d(boolean z, boolean z2, boolean z3, @yfb yte yteVar, boolean z4, boolean z5) {
        this(z, z2, z3, yteVar, z4, z5, false);
    }

    public /* synthetic */ y4d(boolean z, boolean z2, boolean z3, yte yteVar, boolean z4, boolean z5, boolean z6, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? yte.Inherit : yteVar, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? false : z6);
    }

    public y4d(boolean z, boolean z2, boolean z3, @yfb yte yteVar, boolean z4, boolean z5, boolean z6) {
        this(C11123pu.createFlags(z, yteVar, z5), yteVar == yte.Inherit, z2, z3, z4, z6);
    }
}
