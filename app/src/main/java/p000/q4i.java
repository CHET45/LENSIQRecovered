package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class q4i extends skh {

    /* JADX INFO: renamed from: c */
    public static final int f73207c = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f73208b;

    public q4i(@yfb String str) {
        super(null);
        this.f73208b = str;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4i) && md8.areEqual(this.f73208b, ((q4i) obj).f73208b);
    }

    @yfb
    public final String getVerbatim() {
        return this.f73208b;
    }

    public int hashCode() {
        return this.f73208b.hashCode();
    }

    @yfb
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f73208b + ')';
    }
}
