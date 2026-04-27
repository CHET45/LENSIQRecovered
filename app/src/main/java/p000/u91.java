package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class u91 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f87117c = false;

    /* JADX INFO: renamed from: a */
    public final Context f87118a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13412a f87119b;

    /* JADX INFO: renamed from: u91$a */
    public interface InterfaceC13412a {
        void onOk();
    }

    public u91(Context activity, final InterfaceC13412a listener) {
        super(activity, C2531R.style.custom_new_dialog);
        this.f87118a = activity;
        this.f87119b = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(48);
        window.getDecorView().setSystemUiVisibility(260);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    private void initView() {
        setContentView(C2558R.layout.dialog_bluetooth_permission);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
