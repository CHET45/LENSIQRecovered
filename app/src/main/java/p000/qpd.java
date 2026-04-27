package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qpd extends Dialog {
    public qpd(@efb Context context) {
        super(context);
    }

    @hib
    public abstract View getNegativeButton();

    @efb
    public abstract List<String> getPermissionsToRequest();

    @efb
    public abstract View getPositiveButton();

    public qpd(@efb Context context, int i) {
        super(context, i);
    }

    public qpd(@efb Context context, boolean z, @hib DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
