package p000;

import p000.uy6;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C4623d6<T extends uy6<? extends Boolean>> {

    /* JADX INFO: renamed from: c */
    public static final int f28488c = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final String f28489a;

    /* JADX INFO: renamed from: b */
    @gib
    public final T f28490b;

    public C4623d6(@gib String str, @gib T t) {
        this.f28489a = str;
        this.f28490b = t;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4623d6)) {
            return false;
        }
        C4623d6 c4623d6 = (C4623d6) obj;
        return md8.areEqual(this.f28489a, c4623d6.f28489a) && md8.areEqual(this.f28490b, c4623d6.f28490b);
    }

    @gib
    public final T getAction() {
        return this.f28490b;
    }

    @gib
    public final String getLabel() {
        return this.f28489a;
    }

    public int hashCode() {
        String str = this.f28489a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f28490b;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "AccessibilityAction(label=" + this.f28489a + ", action=" + this.f28490b + ')';
    }
}
