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
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.MyEditText;

/* JADX INFO: renamed from: ec */
/* JADX INFO: loaded from: classes4.dex */
public final class C5250ec implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final EditText f32564C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f32565F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f32566H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f32567L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f32568M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f32569M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final LinearLayoutCompat f32570N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f32571Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f32572V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f32573X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f32574Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f32575Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f32576Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f32577a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f32578a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f32579b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f32580b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final CheckBox f32581c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final RelativeLayout f32582c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f32583d;

    /* JADX INFO: renamed from: e */
    @efb
    public final EditText f32584e;

    /* JADX INFO: renamed from: f */
    @efb
    public final MyEditText f32585f;

    /* JADX INFO: renamed from: m */
    @efb
    public final EditText f32586m;

    private C5250ec(@efb RelativeLayout rootView, @efb AppCompatButton btnRegisterLogin, @efb CheckBox checkbox, @efb RelativeLayout contentLayout, @efb EditText etConfirmPassword, @efb MyEditText etEmail, @efb EditText etPassword, @efb EditText etVerification, @efb TextView goLogin, @efb TextView goLoginTip, @efb ImageView ivConfirmHidePassword, @efb ImageView ivHidePassword, @efb LinearLayoutCompat llUserService, @efb RelativeLayout passwordLayout, @efb RelativeLayout passwordOneLayout, @efb TextView sendSmsTitle, @efb TextView textEmail, @efb TextView textPassword, @efb TextView textPasswordConfirm, @efb TextView textVerification, @efb TextView tvContent, @efb TextView tvSendCode, @efb RelativeLayout verificationLayout) {
        this.f32577a = rootView;
        this.f32579b = btnRegisterLogin;
        this.f32581c = checkbox;
        this.f32583d = contentLayout;
        this.f32584e = etConfirmPassword;
        this.f32585f = etEmail;
        this.f32586m = etPassword;
        this.f32564C = etVerification;
        this.f32565F = goLogin;
        this.f32566H = goLoginTip;
        this.f32567L = ivConfirmHidePassword;
        this.f32568M = ivHidePassword;
        this.f32570N = llUserService;
        this.f32571Q = passwordLayout;
        this.f32573X = passwordOneLayout;
        this.f32574Y = sendSmsTitle;
        this.f32575Z = textEmail;
        this.f32569M1 = textPassword;
        this.f32572V1 = textPasswordConfirm;
        this.f32576Z1 = textVerification;
        this.f32578a2 = tvContent;
        this.f32580b2 = tvSendCode;
        this.f32582c2 = verificationLayout;
    }

    @efb
    public static C5250ec bind(@efb View rootView) {
        int i = C2531R.id.btn_register_login;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2531R.id.checkbox;
            CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = C2531R.id.content_layout;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2531R.id.et_confirm_password;
                    EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                    if (editText != null) {
                        i = C2531R.id.et_email;
                        MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                        if (myEditText != null) {
                            i = C2531R.id.et_password;
                            EditText editText2 = (EditText) l8i.findChildViewById(rootView, i);
                            if (editText2 != null) {
                                i = C2531R.id.et_verification;
                                EditText editText3 = (EditText) l8i.findChildViewById(rootView, i);
                                if (editText3 != null) {
                                    i = C2531R.id.go_login;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2531R.id.go_login_tip;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2531R.id.iv_confirm_hide_password;
                                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView != null) {
                                                i = C2531R.id.iv_hide_password;
                                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = C2531R.id.ll_user_service;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                                                    if (linearLayoutCompat != null) {
                                                        i = C2531R.id.password_layout;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout2 != null) {
                                                            i = C2531R.id.password_one_layout;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout3 != null) {
                                                                i = C2531R.id.send_sms_title;
                                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView3 != null) {
                                                                    i = C2531R.id.text_email;
                                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView4 != null) {
                                                                        i = C2531R.id.text_password;
                                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView5 != null) {
                                                                            i = C2531R.id.text_password_confirm;
                                                                            TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView6 != null) {
                                                                                i = C2531R.id.text_verification;
                                                                                TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView7 != null) {
                                                                                    i = C2531R.id.tv_content;
                                                                                    TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView8 != null) {
                                                                                        i = C2531R.id.tv_send_code;
                                                                                        TextView textView9 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                        if (textView9 != null) {
                                                                                            i = C2531R.id.verification_layout;
                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                            if (relativeLayout4 != null) {
                                                                                                return new C5250ec((RelativeLayout) rootView, appCompatButton, checkBox, relativeLayout, editText, myEditText, editText2, editText3, textView, textView2, imageView, imageView2, linearLayoutCompat, relativeLayout2, relativeLayout3, textView3, textView4, textView5, textView6, textView7, textView8, textView9, relativeLayout4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C5250ec inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5250ec inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_register, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f32577a;
    }
}
