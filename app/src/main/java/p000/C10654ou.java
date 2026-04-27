package p000;

/* JADX INFO: renamed from: ou */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C10654ou implements a2d {

    /* JADX INFO: renamed from: c */
    public static final int f68739c = 0;

    /* JADX INFO: renamed from: b */
    public final int f68740b;

    public C10654ou(int i) {
        this.f68740b = i;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!md8.areEqual(C10654ou.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f68740b == ((C10654ou) obj).f68740b;
    }

    public final int getType() {
        return this.f68740b;
    }

    public int hashCode() {
        return this.f68740b;
    }

    @yfb
    public String toString() {
        return "AndroidPointerIcon(type=" + this.f68740b + ')';
    }
}
