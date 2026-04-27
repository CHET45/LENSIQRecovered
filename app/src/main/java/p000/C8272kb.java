package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.MyEditText;

/* JADX INFO: renamed from: kb */
/* JADX INFO: loaded from: classes4.dex */
public final class C8272kb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f53485C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayoutCompat f53486F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f53487H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f53488L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f53489M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f53490N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f53491Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f53492X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f53493Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f53494Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f53495a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f53496b;

    /* JADX INFO: renamed from: c */
    @efb
    public final CheckBox f53497c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f53498d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f53499e;

    /* JADX INFO: renamed from: f */
    @efb
    public final EditText f53500f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f53501m;

    private C8272kb(@efb FrameLayout rootView, @efb AppCompatButton btnLogin, @efb CheckBox checkbox, @efb RelativeLayout contentLayout, @efb MyEditText etEmail, @efb EditText etPassword, @efb TextView forgetPassword, @efb ImageView imgLogin, @efb LinearLayoutCompat llUserService, @efb TextView register, @efb TextView sendSmsTitle, @efb ImageView showPassword, @efb TextView skipLogin, @efb RelativeLayout smsLayout, @efb TextView textEmail, @efb TextView textPassword, @efb TextView tvContent) {
        this.f53495a = rootView;
        this.f53496b = btnLogin;
        this.f53497c = checkbox;
        this.f53498d = contentLayout;
        this.f53499e = etEmail;
        this.f53500f = etPassword;
        this.f53501m = forgetPassword;
        this.f53485C = imgLogin;
        this.f53486F = llUserService;
        this.f53487H = register;
        this.f53488L = sendSmsTitle;
        this.f53489M = showPassword;
        this.f53490N = skipLogin;
        this.f53491Q = smsLayout;
        this.f53492X = textEmail;
        this.f53493Y = textPassword;
        this.f53494Z = tvContent;
    }

    @efb
    public static C8272kb bind(@efb View rootView) {
        int i = C2531R.id.btn_login;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2531R.id.checkbox;
            CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = C2531R.id.content_layout;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2531R.id.et_email;
                    MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                    if (myEditText != null) {
                        i = C2531R.id.et_password;
                        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                        if (editText != null) {
                            i = C2531R.id.forget_password;
                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = C2531R.id.img_login;
                                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView != null) {
                                    i = C2531R.id.ll_user_service;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                                    if (linearLayoutCompat != null) {
                                        i = C2531R.id.register;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2531R.id.send_sms_title;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                i = C2531R.id.show_password;
                                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = C2531R.id.skip_login;
                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView4 != null) {
                                                        i = C2531R.id.sms_layout;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout2 != null) {
                                                            i = C2531R.id.text_email;
                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView5 != null) {
                                                                i = C2531R.id.text_password;
                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView6 != null) {
                                                                    i = C2531R.id.tv_content;
                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView7 != null) {
                                                                        return new C8272kb((FrameLayout) rootView, appCompatButton, checkBox, relativeLayout, myEditText, editText, textView, imageView, linearLayoutCompat, textView2, textView3, imageView2, textView4, relativeLayout2, textView5, textView6, textView7);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C8272kb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8272kb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_login, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f53495a;
    }
}
