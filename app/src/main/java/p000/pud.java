package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class pud extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f72135b = false;

    /* JADX INFO: renamed from: a */
    public Context f72136a;

    /* JADX INFO: renamed from: pud$a */
    public class ViewOnClickListenerC11128a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11130c f72137a;

        public ViewOnClickListenerC11128a(final InterfaceC11130c val$listener) {
            this.f72137a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            pud.this.dismiss();
            InterfaceC11130c interfaceC11130c = this.f72137a;
            if (interfaceC11130c != null) {
                interfaceC11130c.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: pud$b */
    public class ViewOnClickListenerC11129b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11130c f72139a;

        public ViewOnClickListenerC11129b(final InterfaceC11130c val$listener) {
            this.f72139a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            pud.this.dismiss();
            InterfaceC11130c interfaceC11130c = this.f72139a;
            if (interfaceC11130c != null) {
                interfaceC11130c.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: pud$c */
    public interface InterfaceC11130c {
        void onAgree();

        void onDisagree();
    }

    public pud(@efb Context context, final InterfaceC11130c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f72136a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC11130c listener) {
        setContentView(C2531R.layout.dialog_recover);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC11128a(listener));
        button.setOnClickListener(new ViewOnClickListenerC11129b(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }
}
