package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
@q64(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @i2e(expression = "LinkAnnotation.Url(url)", imports = {}))
@th5
public final class eyh {

    /* JADX INFO: renamed from: b */
    public static final int f34515b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f34516a;

    public eyh(@yfb String str) {
        this.f34516a = str;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyh) && md8.areEqual(this.f34516a, ((eyh) obj).f34516a);
    }

    @yfb
    public final String getUrl() {
        return this.f34516a;
    }

    public int hashCode() {
        return this.f34516a.hashCode();
    }

    @yfb
    public String toString() {
        return "UrlAnnotation(url=" + this.f34516a + ')';
    }
}
