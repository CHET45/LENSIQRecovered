package p000;

import android.graphics.Insets;
import android.graphics.Rect;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class r48 {

    /* JADX INFO: renamed from: e */
    @efb
    public static final r48 f77013e = new r48(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f77014a;

    /* JADX INFO: renamed from: b */
    public final int f77015b;

    /* JADX INFO: renamed from: c */
    public final int f77016c;

    /* JADX INFO: renamed from: d */
    public final int f77017d;

    /* JADX INFO: renamed from: r48$a */
    @c5e(29)
    public static class C11886a {
        private C11886a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Insets m21006a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private r48(int i, int i2, int i3, int i4) {
        this.f77014a = i;
        this.f77015b = i2;
        this.f77016c = i3;
        this.f77017d = i4;
    }

    @efb
    public static r48 add(@efb r48 r48Var, @efb r48 r48Var2) {
        return m21004of(r48Var.f77014a + r48Var2.f77014a, r48Var.f77015b + r48Var2.f77015b, r48Var.f77016c + r48Var2.f77016c, r48Var.f77017d + r48Var2.f77017d);
    }

    @efb
    public static r48 max(@efb r48 r48Var, @efb r48 r48Var2) {
        return m21004of(Math.max(r48Var.f77014a, r48Var2.f77014a), Math.max(r48Var.f77015b, r48Var2.f77015b), Math.max(r48Var.f77016c, r48Var2.f77016c), Math.max(r48Var.f77017d, r48Var2.f77017d));
    }

    @efb
    public static r48 min(@efb r48 r48Var, @efb r48 r48Var2) {
        return m21004of(Math.min(r48Var.f77014a, r48Var2.f77014a), Math.min(r48Var.f77015b, r48Var2.f77015b), Math.min(r48Var.f77016c, r48Var2.f77016c), Math.min(r48Var.f77017d, r48Var2.f77017d));
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static r48 m21004of(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f77013e : new r48(i, i2, i3, i4);
    }

    @efb
    public static r48 subtract(@efb r48 r48Var, @efb r48 r48Var2) {
        return m21004of(r48Var.f77014a - r48Var2.f77014a, r48Var.f77015b - r48Var2.f77015b, r48Var.f77016c - r48Var2.f77016c, r48Var.f77017d - r48Var2.f77017d);
    }

    @c5e(api = 29)
    @efb
    public static r48 toCompatInsets(@efb Insets insets) {
        return m21004of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @c5e(api = 29)
    @efb
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public static r48 wrap(@efb Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r48.class != obj.getClass()) {
            return false;
        }
        r48 r48Var = (r48) obj;
        return this.f77017d == r48Var.f77017d && this.f77014a == r48Var.f77014a && this.f77016c == r48Var.f77016c && this.f77015b == r48Var.f77015b;
    }

    public int hashCode() {
        return (((((this.f77014a * 31) + this.f77015b) * 31) + this.f77016c) * 31) + this.f77017d;
    }

    @c5e(29)
    @efb
    public Insets toPlatformInsets() {
        return C11886a.m21006a(this.f77014a, this.f77015b, this.f77016c, this.f77017d);
    }

    @efb
    public String toString() {
        return "Insets{left=" + this.f77014a + ", top=" + this.f77015b + ", right=" + this.f77016c + ", bottom=" + this.f77017d + '}';
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static r48 m21005of(@efb Rect rect) {
        return m21004of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
