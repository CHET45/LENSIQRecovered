package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class td9 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f84349c = false;

    /* JADX INFO: renamed from: a */
    public final Context f84350a;

    /* JADX INFO: renamed from: b */
    public InterfaceC12994a f84351b;

    /* JADX INFO: renamed from: td9$a */
    public interface InterfaceC12994a {
        void onOk();
    }

    public td9(Context activity, final InterfaceC12994a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f84350a = activity;
        this.f84351b = listener;
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
        setContentView(C2531R.layout.dialog_local_permission);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
