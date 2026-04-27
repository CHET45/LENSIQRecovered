package p000;

import android.net.Uri;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15650c
public final class lwh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f59106a;

    public lwh(@yfb Uri uri) {
        md8.checkNotNullParameter(uri, "updateUri");
        this.f59106a = uri;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lwh) {
            return md8.areEqual(this.f59106a, ((lwh) obj).f59106a);
        }
        return false;
    }

    @yfb
    public final Uri getUpdateUri() {
        return this.f59106a;
    }

    public int hashCode() {
        return this.f59106a.hashCode();
    }

    @yfb
    public String toString() {
        return "UpdateSignalsRequest: updateUri=" + this.f59106a;
    }
}
