package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class b8c extends Dialog {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f12972d = false;

    /* JADX INFO: renamed from: a */
    public Context f12973a;

    /* JADX INFO: renamed from: b */
    public TextView f12974b;

    /* JADX INFO: renamed from: c */
    public TextView f12975c;

    /* JADX INFO: renamed from: b8c$a */
    public class ViewOnClickListenerC1779a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1780b f12976a;

        public ViewOnClickListenerC1779a(final InterfaceC1780b val$listener) {
            this.f12976a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            b8c.this.dismiss();
            InterfaceC1780b interfaceC1780b = this.f12976a;
            if (interfaceC1780b != null) {
                interfaceC1780b.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: b8c$b */
    public interface InterfaceC1780b {
        void onAgree();
    }

    public b8c(@efb Context context, final InterfaceC1780b listener) {
        super(context, C2531R.style.custom_dialog);
        this.f12973a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC1780b listener) {
        setContentView(C2531R.layout.dialog_ota_tip);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_agree);
        this.f12974b = (TextView) findViewById(C2531R.id.tv_tip);
        this.f12975c = (TextView) findViewById(C2531R.id.tv_tip_content);
        button.setOnClickListener(new ViewOnClickListenerC1779a(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }

    public void setText(String tip, String tipContent) {
        TextView textView = this.f12974b;
        if (textView != null) {
            textView.setText(tip);
        }
        TextView textView2 = this.f12975c;
        if (textView2 != null) {
            textView2.setText(tipContent);
        }
    }
}
