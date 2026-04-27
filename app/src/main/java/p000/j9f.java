package p000;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j9f {

    /* JADX INFO: renamed from: d */
    public static final String f50042d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* JADX INFO: renamed from: e */
    public static final String f50043e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* JADX INFO: renamed from: f */
    public static final String f50044f = "androidx.browser.trusted.sharing.KEY_URIS";

    /* JADX INFO: renamed from: a */
    @hib
    public final String f50045a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f50046b;

    /* JADX INFO: renamed from: c */
    @hib
    public final List<Uri> f50047c;

    public j9f(@hib String str, @hib String str2, @hib List<Uri> list) {
        this.f50045a = str;
        this.f50046b = str2;
        this.f50047c = list;
    }

    @efb
    public static j9f fromBundle(@efb Bundle bundle) {
        return new j9f(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f50044f));
    }

    @efb
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f50045a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f50046b);
        if (this.f50047c != null) {
            bundle.putParcelableArrayList(f50044f, new ArrayList<>(this.f50047c));
        }
        return bundle;
    }
}
