package p000;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: renamed from: fl */
/* JADX INFO: loaded from: classes7.dex */
public class DialogC5869fl extends Dialog {

    /* JADX INFO: renamed from: a */
    public String f36984a;

    public DialogC5869fl(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f36984a = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4297R.layout.dialog_ai_voice_note_custom_loading);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
            setCancelable(false);
        }
        ((TextView) findViewById(C4297R.id.tv_tips)).setText(this.f36984a);
    }

    public DialogC5869fl(Context context, String str) {
        super(context);
        this.f36984a = str;
    }
}
