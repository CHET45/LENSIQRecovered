package p000;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ct7 extends bt7 {

    /* JADX INFO: renamed from: c */
    public static final String f27515c = "https://android.asset/";

    /* JADX INFO: renamed from: d */
    public static final String f27516d = "file:///android_asset/";

    /* JADX INFO: renamed from: a */
    public final dt7 f27517a;

    /* JADX INFO: renamed from: b */
    public final bt7 f27518b;

    public ct7() {
        this(null);
    }

    @efb
    public static ct7 create(@hib bt7 bt7Var) {
        return new ct7(bt7Var);
    }

    @Override // p000.bt7
    @efb
    public String process(@efb String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return this.f27517a.process(str).replace(f27515c, "file:///android_asset/");
        }
        bt7 bt7Var = this.f27518b;
        return bt7Var != null ? bt7Var.process(str) : str;
    }

    public ct7(@hib bt7 bt7Var) {
        this.f27517a = new dt7(f27515c);
        this.f27518b = bt7Var;
    }
}
