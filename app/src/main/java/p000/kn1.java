package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class kn1 extends Dialog {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f54767c = false;

    /* JADX INFO: renamed from: a */
    public final Context f54768a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8459a f54769b;

    /* JADX INFO: renamed from: kn1$a */
    public interface InterfaceC8459a {
        void onOk();
    }

    public kn1(Context activity, final InterfaceC8459a listener) {
        super(activity, C2531R.style.custom_new_dialog);
        this.f54768a = activity;
        this.f54769b = listener;
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
        setContentView(C2558R.layout.dialog_calendar_permission);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCanceledOnTouchOutside(true);
    }
}
