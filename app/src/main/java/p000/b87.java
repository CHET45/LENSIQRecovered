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
public class b87 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f12960c = false;

    /* JADX INFO: renamed from: a */
    public final Context f12961a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1776a f12962b;

    /* JADX INFO: renamed from: b87$a */
    public interface InterfaceC1776a {
        void onOk();
    }

    public b87(Context activity, final InterfaceC1776a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f12961a = activity;
        this.f12962b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_add_device_tip);
        ((TextView) findViewById(C2558R.id.dialog_clear_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: z77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104325a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.dialog_clear_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: a87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f612a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f12962b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
