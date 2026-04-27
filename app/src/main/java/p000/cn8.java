package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class cn8 extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f17071b = false;

    /* JADX INFO: renamed from: a */
    public Context f17072a;

    /* JADX INFO: renamed from: cn8$a */
    public class ViewOnClickListenerC2404a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2406c f17073a;

        public ViewOnClickListenerC2404a(final InterfaceC2406c val$listener) {
            this.f17073a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            cn8.this.dismiss();
            InterfaceC2406c interfaceC2406c = this.f17073a;
            if (interfaceC2406c != null) {
                interfaceC2406c.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: cn8$b */
    public class ViewOnClickListenerC2405b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2406c f17075a;

        public ViewOnClickListenerC2405b(final InterfaceC2406c val$listener) {
            this.f17075a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            cn8.this.dismiss();
            InterfaceC2406c interfaceC2406c = this.f17075a;
            if (interfaceC2406c != null) {
                interfaceC2406c.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: cn8$c */
    public interface InterfaceC2406c {
        void onAgree();

        void onDisagree();
    }

    public cn8(@efb Context context, final InterfaceC2406c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f17072a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC2406c listener) {
        setContentView(C2531R.layout.dialog_jump);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC2404a(listener));
        button.setOnClickListener(new ViewOnClickListenerC2405b(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }
}
