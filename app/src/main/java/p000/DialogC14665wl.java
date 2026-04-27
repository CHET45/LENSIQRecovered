package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: wl */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC14665wl extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f94578c = false;

    /* JADX INFO: renamed from: a */
    public final Context f94579a;

    /* JADX INFO: renamed from: b */
    public a f94580b;

    /* JADX INFO: renamed from: wl$a */
    public interface a {
        void onOk();
    }

    public DialogC14665wl(Context activity, final a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f94579a = activity;
        this.f94580b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_alarm_delete);
        ((TextView) findViewById(C2558R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: ul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88268a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.btn_delete)).setOnClickListener(new View.OnClickListener() { // from class: vl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91551a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f94580b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
