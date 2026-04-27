package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;

/* JADX INFO: loaded from: classes4.dex */
public class li9 extends Dialog {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f57700d = false;

    /* JADX INFO: renamed from: a */
    public Context f57701a;

    /* JADX INFO: renamed from: b */
    public String f57702b;

    /* JADX INFO: renamed from: c */
    public String f57703c;

    /* JADX INFO: renamed from: li9$a */
    public class ViewOnClickListenerC8827a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8829c f57704a;

        public ViewOnClickListenerC8827a(final InterfaceC8829c val$listener) {
            this.f57704a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            li9.this.dismiss();
            InterfaceC8829c interfaceC8829c = this.f57704a;
            if (interfaceC8829c != null) {
                interfaceC8829c.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: li9$b */
    public class ViewOnClickListenerC8828b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8829c f57706a;

        public ViewOnClickListenerC8828b(final InterfaceC8829c val$listener) {
            this.f57706a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            li9.this.dismiss();
            InterfaceC8829c interfaceC8829c = this.f57706a;
            if (interfaceC8829c != null) {
                interfaceC8829c.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: li9$c */
    public interface InterfaceC8829c {
        void onAgree();

        void onDisagree();
    }

    public li9(@efb Context context, String title, String content, final InterfaceC8829c listener) {
        super(context, C2531R.style.custom_dialog);
        this.f57701a = context;
        this.f57702b = title;
        this.f57703c = content;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC8829c listener) {
        setContentView(C2531R.layout.dialog_logout);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        ((TextView) findViewById(C2531R.id.tv_title_tip)).setText(this.f57702b);
        ((TextView) findViewById(C2531R.id.tv_content)).setText(this.f57703c);
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC8827a(listener));
        button.setOnClickListener(new ViewOnClickListenerC8828b(listener));
    }

    private void onPrivacyPolicy(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", false);
        bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void onUserService(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", true);
        bundle.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @efb KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 4) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
