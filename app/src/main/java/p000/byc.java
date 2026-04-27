package p000;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class byc {

    /* JADX INFO: renamed from: c */
    public static final int f15211c = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final Uri f15212a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f15213b;

    public byc(@gib Uri uri, @yfb Bundle bundle) {
        this.f15212a = uri;
        this.f15213b = bundle;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byc)) {
            return false;
        }
        byc bycVar = (byc) obj;
        return md8.areEqual(this.f15212a, bycVar.f15212a) && md8.areEqual(this.f15213b, bycVar.f15213b);
    }

    @yfb
    public final Bundle getExtras() {
        return this.f15213b;
    }

    @gib
    public final Uri getLinkUri() {
        return this.f15212a;
    }

    public int hashCode() {
        Uri uri = this.f15212a;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.f15213b.hashCode();
    }

    @yfb
    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f15212a + ", extras=" + this.f15213b + ')';
    }
}
