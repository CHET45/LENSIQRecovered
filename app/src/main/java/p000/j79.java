package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class j79 implements i79 {

    /* JADX INFO: renamed from: a */
    public static final String f49700a = "https";

    @efb
    private static Uri parseLink(@efb String str) {
        Uri uri = Uri.parse(str);
        return TextUtils.isEmpty(uri.getScheme()) ? uri.buildUpon().scheme("https").build() : uri;
    }

    @Override // p000.i79
    public void resolve(@efb View view, @efb String str) {
        Uri link = parseLink(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", link);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
