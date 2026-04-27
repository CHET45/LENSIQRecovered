package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class fzd extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f38080b = false;

    /* JADX INFO: renamed from: a */
    public Context f38081a;

    /* JADX INFO: renamed from: fzd$a */
    public class ViewOnClickListenerC6042a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC6044c f38082a;

        public ViewOnClickListenerC6042a(final InterfaceC6044c val$listener) {
            this.f38082a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            fzd.this.dismiss();
            InterfaceC6044c interfaceC6044c = this.f38082a;
            if (interfaceC6044c != null) {
                interfaceC6044c.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: fzd$b */
    public class ViewOnClickListenerC6043b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC6044c f38084a;

        public ViewOnClickListenerC6043b(final InterfaceC6044c val$listener) {
            this.f38084a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            fzd.this.dismiss();
            InterfaceC6044c interfaceC6044c = this.f38084a;
            if (interfaceC6044c != null) {
                interfaceC6044c.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: fzd$c */
    public interface InterfaceC6044c {
        void onAgree();

        void onDisagree();
    }

    public fzd(@efb Context context, final InterfaceC6044c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f38081a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC6044c listener) {
        setContentView(C2531R.layout.dialog_removebond);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC6042a(listener));
        button.setOnClickListener(new ViewOnClickListenerC6043b(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }
}
