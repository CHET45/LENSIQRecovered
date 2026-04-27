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

/* JADX INFO: renamed from: lb */
/* JADX INFO: loaded from: classes4.dex */
public final class C8750lb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f57010C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f57011F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f57012H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f57013L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f57014M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f57015N;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f57016a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AppCompatButton f57017b;

    /* JADX INFO: renamed from: c */
    @efb
    public final CheckBox f57018c;

    /* JADX INFO: renamed from: d */
    @efb
    public final MyEditText f57019d;

    /* JADX INFO: renamed from: e */
    @efb
    public final EditText f57020e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f57021f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayoutCompat f57022m;

    private C8750lb(@efb FrameLayout rootView, @efb AppCompatButton btnLogin, @efb CheckBox checkbox, @efb MyEditText etPhoneNumber, @efb EditText etVerificationCode, @efb ImageView imgLogin, @efb LinearLayoutCompat llUserService, @efb TextView sendSmsTitle, @efb TextView skipLogin, @efb RelativeLayout smsLayout, @efb TextView textEmail, @efb TextView tvContent, @efb TextView tvSendSms) {
        this.f57016a = rootView;
        this.f57017b = btnLogin;
        this.f57018c = checkbox;
        this.f57019d = etPhoneNumber;
        this.f57020e = etVerificationCode;
        this.f57021f = imgLogin;
        this.f57022m = llUserService;
        this.f57010C = sendSmsTitle;
        this.f57011F = skipLogin;
        this.f57012H = smsLayout;
        this.f57013L = textEmail;
        this.f57014M = tvContent;
        this.f57015N = tvSendSms;
    }

    @efb
    public static C8750lb bind(@efb View rootView) {
        int i = C2531R.id.btn_login;
        AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
        if (appCompatButton != null) {
            i = C2531R.id.checkbox;
            CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = C2531R.id.et_phone_number;
                MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                if (myEditText != null) {
                    i = C2531R.id.et_verification_code;
                    EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                    if (editText != null) {
                        i = C2531R.id.img_login;
                        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView != null) {
                            i = C2531R.id.ll_user_service;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                            if (linearLayoutCompat != null) {
                                i = C2531R.id.send_sms_title;
                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView != null) {
                                    i = C2531R.id.skip_login;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        i = C2531R.id.sms_layout;
                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout != null) {
                                            i = C2531R.id.text_email;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                i = C2531R.id.tv_content;
                                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView4 != null) {
                                                    i = C2531R.id.tv_send_sms;
                                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView5 != null) {
                                                        return new C8750lb((FrameLayout) rootView, appCompatButton, checkBox, myEditText, editText, imageView, linearLayoutCompat, textView, textView2, relativeLayout, textView3, textView4, textView5);
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
    public static C8750lb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8750lb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_login_by_sms, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f57016a;
    }
}
