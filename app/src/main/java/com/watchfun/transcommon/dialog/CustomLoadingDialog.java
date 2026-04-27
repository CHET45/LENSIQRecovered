package com.watchfun.transcommon.dialog;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.watchfun.transcommon.C4201R;

/* JADX INFO: loaded from: classes5.dex */
public class CustomLoadingDialog extends Dialog {
    public CustomLoadingDialog(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4201R.layout.custom_loading_dialog);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
            window.addFlags(2);
            setCancelable(false);
        }
    }
}
