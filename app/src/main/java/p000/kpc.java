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
public class kpc extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f54898c = false;

    /* JADX INFO: renamed from: a */
    public final Context f54899a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8483a f54900b;

    /* JADX INFO: renamed from: kpc$a */
    public interface InterfaceC8483a {
        void onDismiss();

        void onOk();
    }

    public kpc(Context activity, final InterfaceC8483a listener) {
        super(activity, C2531R.style.permission_dialog);
        this.f54899a = activity;
        this.f54900b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_permission_tip);
        ((TextView) findViewById(C2558R.id.dialog_clear_text_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: ipc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47847a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2558R.id.dialog_clear_text_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: jpc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51420a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f54900b.onDismiss();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f54900b.onOk();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
