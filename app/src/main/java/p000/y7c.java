package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class y7c extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f100695b = false;

    /* JADX INFO: renamed from: a */
    public Context f100696a;

    /* JADX INFO: renamed from: y7c$a */
    public class ViewOnClickListenerC15539a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC15541c f100697a;

        public ViewOnClickListenerC15539a(final InterfaceC15541c val$listener) {
            this.f100697a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            y7c.this.dismiss();
            InterfaceC15541c interfaceC15541c = this.f100697a;
            if (interfaceC15541c != null) {
                interfaceC15541c.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: y7c$b */
    public class ViewOnClickListenerC15540b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC15541c f100699a;

        public ViewOnClickListenerC15540b(final InterfaceC15541c val$listener) {
            this.f100699a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            y7c.this.dismiss();
            InterfaceC15541c interfaceC15541c = this.f100699a;
            if (interfaceC15541c != null) {
                interfaceC15541c.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: y7c$c */
    public interface InterfaceC15541c {
        void onAgree();

        void onDisagree();
    }

    public y7c(@efb Context context, final InterfaceC15541c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f100696a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC15541c listener) {
        setContentView(C2531R.layout.dialog_ota);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC15539a(listener));
        button.setOnClickListener(new ViewOnClickListenerC15540b(listener));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }
}
