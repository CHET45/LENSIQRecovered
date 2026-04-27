package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;

/* JADX INFO: loaded from: classes4.dex */
public class mcd extends Dialog {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f60548b = false;

    /* JADX INFO: renamed from: a */
    public Context f60549a;

    /* JADX INFO: renamed from: mcd$a */
    public class C9279a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f60550a;

        public C9279a(final Context val$context) {
            this.f60550a = val$context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            mcd.this.onUserService(this.f60550a);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(this.f60550a.getResources().getColor(C2531R.color.base_blue));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: mcd$b */
    public class C9280b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f60552a;

        public C9280b(final Context val$context) {
            this.f60552a = val$context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@efb View widget) {
            mcd.this.onPrivacyPolicy(this.f60552a);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@efb TextPaint ds) {
            ds.setColor(this.f60552a.getResources().getColor(C2531R.color.base_blue));
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: mcd$c */
    public class ViewOnClickListenerC9281c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9284f f60554a;

        public ViewOnClickListenerC9281c(final InterfaceC9284f val$listener) {
            this.f60554a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            mcd.this.dismiss();
            InterfaceC9284f interfaceC9284f = this.f60554a;
            if (interfaceC9284f != null) {
                interfaceC9284f.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: mcd$d */
    public class ViewOnClickListenerC9282d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9284f f60556a;

        public ViewOnClickListenerC9282d(final InterfaceC9284f val$listener) {
            this.f60556a = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            mcd.this.dismiss();
            InterfaceC9284f interfaceC9284f = this.f60556a;
            if (interfaceC9284f != null) {
                interfaceC9284f.onDisagree();
            }
        }
    }

    /* JADX INFO: renamed from: mcd$e */
    public class ViewOnClickListenerC9283e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CheckBox f60558a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9284f f60559b;

        public ViewOnClickListenerC9283e(final CheckBox val$checkBox, final InterfaceC9284f val$listener) {
            this.f60558a = val$checkBox;
            this.f60559b = val$listener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!this.f60558a.isChecked()) {
                m3h.showToastShort(mcd.this.getContext().getString(C2531R.string.eyevue_privacy_tip_content));
                this.f60558a.setChecked(true);
                return;
            }
            mcd.this.dismiss();
            InterfaceC9284f interfaceC9284f = this.f60559b;
            if (interfaceC9284f != null) {
                interfaceC9284f.onAgree();
            }
        }
    }

    /* JADX INFO: renamed from: mcd$f */
    public interface InterfaceC9284f {
        void onAgree();

        void onDisagree();
    }

    public mcd(@efb Context context, final InterfaceC9284f listener) {
        super(context, C2531R.style.custom_dialog);
        this.f60549a = context;
        initView(context, listener);
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(17);
        window.getAttributes().width = -1;
        setCancelable(false);
    }

    @igg({"StringFormatInvalid"})
    private void initView(final Context context, InterfaceC9284f listener) {
        setContentView(C2531R.layout.ppw_privacy);
        setCanceledOnTouchOutside(false);
        if (context == null) {
            return;
        }
        ((TextView) findViewById(C2531R.id.tv_privacy_tip)).setText(context.getString(C2531R.string.eyevue_privacy_tip_one, context.getResources().getString(C2531R.string.app_name)));
        TextView textView = (TextView) findViewById(C2531R.id.tv_privacy_content);
        String string = context.getString(C2531R.string.eyevue_privacy_tip_content);
        String string2 = context.getString(C2531R.string.eyevue_user_service_name);
        int iIndexOf = string.indexOf(string2);
        if (iIndexOf != -1) {
            int length = string2.length() + iIndexOf;
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new C9279a(context), iIndexOf, length, 33);
            String string3 = context.getString(C2531R.string.eyevue_privacy_policy_name);
            int iIndexOf2 = string.indexOf(string3);
            if (iIndexOf2 != -1) {
                spannableString.setSpan(new C9280b(context), iIndexOf2, string3.length() + iIndexOf2, 33);
                textView.append(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        Button button = (Button) findViewById(C2531R.id.btn_disagree);
        ((Button) findViewById(C2531R.id.btn_agree)).setOnClickListener(new ViewOnClickListenerC9281c(listener));
        button.setOnClickListener(new ViewOnClickListenerC9282d(listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrivacyPolicy(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", false);
        bundle.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserService(Context context) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(context, (Class<?>) EyevueStatementActivity.class);
        bundle.putBoolean("isUserAgreement", true);
        bundle.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void setBtnAgree(Button btnAgree, CheckBox checkBox, InterfaceC9284f listener) {
        btnAgree.setOnClickListener(new ViewOnClickListenerC9283e(checkBox, listener));
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
