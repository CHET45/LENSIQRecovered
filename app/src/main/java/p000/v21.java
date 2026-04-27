package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class v21 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f89716c = false;

    /* JADX INFO: renamed from: a */
    public final Context f89717a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13819a f89718b;

    /* JADX INFO: renamed from: v21$a */
    public interface InterfaceC13819a {
        void onOk();
    }

    public v21(Context activity, final InterfaceC13819a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f89717a = activity;
        this.f89718b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_binding_device);
        String str = t77.f83938q;
        ((TextView) findViewById(C2558R.id.dialog_input_text_tip_tv)).setText(this.f89717a.getString(C2531R.string.string_first_bind));
        ((TextView) findViewById(C2558R.id.dialog_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: t21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83445a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.dialog_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: u21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86576a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f89718b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
