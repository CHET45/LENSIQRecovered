package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yfi {

    /* JADX INFO: renamed from: b */
    public static final String f101411b = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: a */
    public final String f101412a;

    public yfi(String str) {
        this.f101412a = str;
    }

    public static yfi fromBundle(Bundle bundle) {
        return new yfi((String) v80.checkNotNull(bundle.getString(f101411b)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f101411b, this.f101412a);
        return bundle;
    }
}
