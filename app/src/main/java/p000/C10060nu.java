package p000;

import android.view.PointerIcon;

/* JADX INFO: renamed from: nu */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C10060nu implements a2d {

    /* JADX INFO: renamed from: c */
    public static final int f65672c = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final PointerIcon f65673b;

    public C10060nu(@yfb PointerIcon pointerIcon) {
        this.f65673b = pointerIcon;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!md8.areEqual(C10060nu.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return md8.areEqual(this.f65673b, ((C10060nu) obj).f65673b);
    }

    @yfb
    public final PointerIcon getPointerIcon() {
        return this.f65673b;
    }

    public int hashCode() {
        return this.f65673b.hashCode();
    }

    @yfb
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f65673b + ')';
    }
}
