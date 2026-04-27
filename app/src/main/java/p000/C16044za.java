package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.MyEditText;

/* JADX INFO: renamed from: za */
/* JADX INFO: loaded from: classes4.dex */
public final class C16044za implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f104518C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f104519F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f104520H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f104521L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f104522M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final RelativeLayout f104523M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f104524N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f104525Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f104526X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f104527Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f104528Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f104529a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f104530b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f104531c;

    /* JADX INFO: renamed from: d */
    @efb
    public final MyEditText f104532d;

    /* JADX INFO: renamed from: e */
    @efb
    public final EditText f104533e;

    /* JADX INFO: renamed from: f */
    @efb
    public final EditText f104534f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f104535m;

    private C16044za(@efb RelativeLayout rootView, @efb AppCompatButton btnModifyPassword, @efb EditText etConfirmPassword, @efb MyEditText etEmail, @efb EditText etPassword, @efb EditText etVerification, @efb ImageView ivBack, @efb ImageView ivConfirmHidePassword, @efb ImageView ivHidePassword, @efb RelativeLayout passwordLayout, @efb RelativeLayout passwordOneLayout, @efb TextView sendSmsTitle, @efb TextView textEmail, @efb TextView textPasswordLayout, @efb TextView textPasswordOne, @efb TextView textVerificationCode, @efb TextView tvSendCode, @efb RelativeLayout verificationLayout) {
        this.f104529a = rootView;
        this.f104530b = btnModifyPassword;
        this.f104531c = etConfirmPassword;
        this.f104532d = etEmail;
        this.f104533e = etPassword;
        this.f104534f = etVerification;
        this.f104535m = ivBack;
        this.f104518C = ivConfirmHidePassword;
        this.f104519F = ivHidePassword;
        this.f104520H = passwordLayout;
        this.f104521L = passwordOneLayout;
        this.f104522M = sendSmsTitle;
        this.f104524N = textEmail;
        this.f104525Q = textPasswordLayout;
        this.f104526X = textPasswordOne;
        this.f104527Y = textVerificationCode;
        this.f104528Z = tvSendCode;
        this.f104523M1 = verificationLayout;
    }

    @efb
    public static C16044za bind(@efb View rootView) {
        int i = C2531R.id.btn_modify_password;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
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
                            i = C2531R.id.iv_back;
                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = C2531R.id.iv_confirm_hide_password;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView2 != null) {
                                    i = C2531R.id.iv_hide_password;
                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView3 != null) {
                                        i = C2531R.id.password_layout;
                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout != null) {
                                            i = C2531R.id.password_one_layout;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                            if (relativeLayout2 != null) {
                                                i = C2531R.id.send_sms_title;
                                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView != null) {
                                                    i = C2531R.id.text_email;
                                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView2 != null) {
                                                        i = C2531R.id.text_password_layout;
                                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView3 != null) {
                                                            i = C2531R.id.text_password_one;
                                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView4 != null) {
                                                                i = C2531R.id.text_verification_code;
                                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView5 != null) {
                                                                    i = C2531R.id.tv_send_code;
                                                                    TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView6 != null) {
                                                                        i = C2531R.id.verification_layout;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                        if (relativeLayout3 != null) {
                                                                            return new C16044za((RelativeLayout) rootView, appCompatButton, editText, myEditText, editText2, editText3, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, relativeLayout3);
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
    public static C16044za inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C16044za inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_forgot_password, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f104529a;
    }
}
