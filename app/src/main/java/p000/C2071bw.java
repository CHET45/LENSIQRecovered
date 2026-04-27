package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: bw */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C2071bw implements wxh {

    /* JADX INFO: renamed from: b */
    public static final int f14981b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f14982a;

    public C2071bw(@yfb Context context) {
        this.f14982a = context;
    }

    @Override // p000.wxh
    public void openUri(@yfb String str) {
        try {
            this.f14982a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException("Can't open " + str + a18.f100c, e);
        }
    }
}
