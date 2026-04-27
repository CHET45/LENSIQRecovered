package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: fa */
/* JADX INFO: loaded from: classes4.dex */
public final class C5690fa implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f35795C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f35796F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f35797H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f35798L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f35799M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f35800N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f35801Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f35802X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f35803Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final RelativeLayout f35804Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f35805a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f35806b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f35807c;

    /* JADX INFO: renamed from: d */
    @efb
    public final EditText f35808d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f35809e;

    /* JADX INFO: renamed from: f */
    @efb
    public final EditText f35810f;

    /* JADX INFO: renamed from: m */
    @efb
    public final EditText f35811m;

    private C5690fa(@efb RelativeLayout rootView, @efb AppCompatButton btnModifyPassword, @efb RelativeLayout emailLayout, @efb EditText etConfirmPassword, @efb MyEditText etEmail, @efb EditText etPassword, @efb EditText etVerification, @efb ImageView ivBack, @efb ImageView ivClearEmail, @efb ImageView ivConfirmHidePassword, @efb ImageView ivHidePassword, @efb RelativeLayout passwordLayout, @efb RelativeLayout passwordOneLayout, @efb RelativeLayout rlTitle, @efb TextView tvSendCode, @efb TextView tvTitle, @efb RelativeLayout verificationLayout) {
        this.f35805a = rootView;
        this.f35806b = btnModifyPassword;
        this.f35807c = emailLayout;
        this.f35808d = etConfirmPassword;
        this.f35809e = etEmail;
        this.f35810f = etPassword;
        this.f35811m = etVerification;
        this.f35795C = ivBack;
        this.f35796F = ivClearEmail;
        this.f35797H = ivConfirmHidePassword;
        this.f35798L = ivHidePassword;
        this.f35799M = passwordLayout;
        this.f35800N = passwordOneLayout;
        this.f35801Q = rlTitle;
        this.f35802X = tvSendCode;
        this.f35803Y = tvTitle;
        this.f35804Z = verificationLayout;
    }

    @efb
    public static C5690fa bind(@efb View rootView) {
        int i = C2558R.id.btn_modify_password;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2558R.id.email_layout;
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
                                i = C2558R.id.iv_back;
                                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView != null) {
                                    i = C2558R.id.iv_clear_email;
                                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView2 != null) {
                                        i = C2558R.id.iv_confirm_hide_password;
                                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView3 != null) {
                                            i = C2558R.id.iv_hide_password;
                                            ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView4 != null) {
                                                i = C2558R.id.password_layout;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                if (relativeLayout2 != null) {
                                                    i = C2558R.id.password_one_layout;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout3 != null) {
                                                        i = C2558R.id.rl_title;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout4 != null) {
                                                            i = C2558R.id.tv_send_code;
                                                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView != null) {
                                                                i = C2558R.id.tv_title;
                                                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView2 != null) {
                                                                    i = C2558R.id.verification_layout;
                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                    if (relativeLayout5 != null) {
                                                                        return new C5690fa((RelativeLayout) rootView, appCompatButton, relativeLayout, editText, myEditText, editText2, editText3, imageView, imageView2, imageView3, imageView4, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, relativeLayout5);
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
    public static C5690fa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5690fa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_forgot_password, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f35805a;
    }
}
