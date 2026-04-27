package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class sx1 extends Dialog {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f83193d = false;

    /* JADX INFO: renamed from: a */
    public final Context f83194a;

    /* JADX INFO: renamed from: b */
    public String f83195b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12820a f83196c;

    /* JADX INFO: renamed from: sx1$a */
    public interface InterfaceC12820a {
        void onSettingChanged();

        void onSubmit();
    }

    public sx1(Context activity, String deviceName, final InterfaceC12820a listener) {
        super(activity, C2531R.style.custom_dialog);
        this.f83194a = activity;
        this.f83195b = deviceName;
        this.f83196c = listener;
        initView();
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    private void initView() {
        setContentView(C2531R.layout.check_device_name_dialog);
        ((TextView) findViewById(C2531R.id.dialog_tip_tv)).setText(String.format(this.f83194a.getString(C2531R.string.device_name_dialog_tip), this.f83195b));
        ((TextView) findViewById(C2531R.id.dialog_left_tv)).setOnClickListener(new View.OnClickListener() { // from class: qx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76226a.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(C2531R.id.dialog_right_tv)).setOnClickListener(new View.OnClickListener() { // from class: rx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80050a.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        this.f83196c.onSubmit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        this.f83196c.onSettingChanged();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
