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
public class e87 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f32109c = false;

    /* JADX INFO: renamed from: a */
    public final Context f32110a;

    /* JADX INFO: renamed from: b */
    public InterfaceC5190a f32111b;

    /* JADX INFO: renamed from: e87$a */
    public interface InterfaceC5190a {
        void onOk();
    }

    public e87(Context activity, final InterfaceC5190a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f32110a = activity;
        this.f32111b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_open_wifi_tip);
        ((TextView) findViewById(C2558R.id.dialog_clear_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: c87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15964a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.dialog_clear_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: d87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28737a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f32111b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
