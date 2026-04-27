package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class njh {

    /* JADX INFO: renamed from: a */
    @efb
    public final Intent f64779a;

    /* JADX INFO: renamed from: b */
    @efb
    public final List<Uri> f64780b;

    public njh(@efb Intent intent, @efb List<Uri> list) {
        this.f64779a = intent;
        this.f64780b = list;
    }

    private void grantUriPermissionToProvider(Context context) {
        Iterator<Uri> it = this.f64780b.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.f64779a.getPackage(), it.next(), 1);
        }
    }

    @efb
    public Intent getIntent() {
        return this.f64779a;
    }

    public void launchTrustedWebActivity(@efb Context context) {
        grantUriPermissionToProvider(context);
        lx2.startActivity(context, this.f64779a, null);
    }
}
