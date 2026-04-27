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
public class lp1 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f58378c = false;

    /* JADX INFO: renamed from: a */
    public final Context f58379a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8924a f58380b;

    /* JADX INFO: renamed from: lp1$a */
    public interface InterfaceC8924a {
        void onOk();
    }

    public lp1(Context activity, final InterfaceC8924a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f58379a = activity;
        this.f58380b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_camera_permission);
        ((TextView) findViewById(C2558R.id.dialog_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: jp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51383a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.dialog_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: kp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54881a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f58380b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
