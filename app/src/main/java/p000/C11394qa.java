package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes4.dex */
public final class C11394qa implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final EditText f73705C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f73706F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f73707H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f73708L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f73709M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f73710M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f73711N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final LinearLayoutCompat f73712Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f73713V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f73714X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f73715Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final RelativeLayout f73716Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f73717Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f73718a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f73719a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f73720b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RelativeLayout f73721b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final CheckBox f73722c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f73723d;

    /* JADX INFO: renamed from: e */
    @efb
    public final EditText f73724e;

    /* JADX INFO: renamed from: f */
    @efb
    public final MyEditText f73725f;

    /* JADX INFO: renamed from: m */
    @efb
    public final EditText f73726m;

    private C11394qa(@efb RelativeLayout rootView, @efb AppCompatButton btnRegisterLogin, @efb CheckBox checkbox, @efb RelativeLayout contentLayout, @efb EditText etConfirmPassword, @efb MyEditText etEmail, @efb EditText etPassword, @efb EditText etVerification, @efb TextView goLogin, @efb TextView goLoginTip, @efb ImageView ivBack, @efb ImageView ivConfirmHidePassword, @efb ImageView ivHidePassword, @efb LinearLayoutCompat llUserService, @efb RelativeLayout passwordLayout, @efb RelativeLayout passwordOneLayout, @efb RelativeLayout rlTitle, @efb TextView textVerification, @efb TextView tvContent, @efb TextView tvSendCode, @efb TextView tvTitle, @efb RelativeLayout verificationLayout) {
        this.f73718a = rootView;
        this.f73720b = btnRegisterLogin;
        this.f73722c = checkbox;
        this.f73723d = contentLayout;
        this.f73724e = etConfirmPassword;
        this.f73725f = etEmail;
        this.f73726m = etPassword;
        this.f73705C = etVerification;
        this.f73706F = goLogin;
        this.f73707H = goLoginTip;
        this.f73708L = ivBack;
        this.f73709M = ivConfirmHidePassword;
        this.f73711N = ivHidePassword;
        this.f73712Q = llUserService;
        this.f73714X = passwordLayout;
        this.f73715Y = passwordOneLayout;
        this.f73716Z = rlTitle;
        this.f73710M1 = textVerification;
        this.f73713V1 = tvContent;
        this.f73717Z1 = tvSendCode;
        this.f73719a2 = tvTitle;
        this.f73721b2 = verificationLayout;
    }

    @efb
    public static C11394qa bind(@efb View rootView) {
        int i = C2558R.id.btn_register_login;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2558R.id.checkbox;
            CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = C2558R.id.content_layout;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2558R.id.et_confirm_password;
                    EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                    if (editText != null) {
                        i = C2558R.id.et_email;
                        MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                        if (myEditText != null) {
                            i = C2558R.id.et_password;
                            EditText editText2 = (EditText) l8i.findChildViewById(rootView, i);
                            if (editText2 != null) {
                                i = C2558R.id.et_verification;
                                EditText editText3 = (EditText) l8i.findChildViewById(rootView, i);
                                if (editText3 != null) {
                                    i = C2558R.id.go_login;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2558R.id.go_login_tip;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2558R.id.iv_back;
                                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView != null) {
                                                i = C2558R.id.iv_confirm_hide_password;
                                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = C2558R.id.iv_hide_password;
                                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView3 != null) {
                                                        i = C2558R.id.ll_user_service;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                                                        if (linearLayoutCompat != null) {
                                                            i = C2558R.id.password_layout;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout2 != null) {
                                                                i = C2558R.id.password_one_layout;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                if (relativeLayout3 != null) {
                                                                    i = C2558R.id.rl_title;
                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                    if (relativeLayout4 != null) {
                                                                        i = C2558R.id.text_verification;
                                                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView3 != null) {
                                                                            i = C2558R.id.tv_content;
                                                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView4 != null) {
                                                                                i = C2558R.id.tv_send_code;
                                                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView5 != null) {
                                                                                    i = C2558R.id.tv_title;
                                                                                    TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView6 != null) {
                                                                                        i = C2558R.id.verification_layout;
                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                        if (relativeLayout5 != null) {
                                                                                            return new C11394qa((RelativeLayout) rootView, appCompatButton, checkBox, relativeLayout, editText, myEditText, editText2, editText3, textView, textView2, imageView, imageView2, imageView3, linearLayoutCompat, relativeLayout2, relativeLayout3, relativeLayout4, textView3, textView4, textView5, textView6, relativeLayout5);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C11394qa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C11394qa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_register, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f73718a;
    }
}
