package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class ufc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Bundle f87897a = new Bundle();

    @yfb
    public final Bundle getBundle() {
        return this.f87897a;
    }

    public final void param(@efb String str, double d) {
        md8.checkNotNullParameter(str, "key");
        this.f87897a.putDouble(str, d);
    }

    public final void param(@efb String str, long j) {
        md8.checkNotNullParameter(str, "key");
        this.f87897a.putLong(str, j);
    }

    public final void param(@efb String str, @efb Bundle bundle) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(bundle, "value");
        this.f87897a.putBundle(str, bundle);
    }

    public final void param(@efb String str, @efb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "value");
        this.f87897a.putString(str, str2);
    }

    public final void param(@efb String str, @efb Bundle[] bundleArr) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(bundleArr, "value");
        this.f87897a.putParcelableArray(str, bundleArr);
    }
}
