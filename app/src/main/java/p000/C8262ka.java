package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.eyevue.common.widget.BvImageView;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ka */
/* JADX INFO: loaded from: classes4.dex */
public final class C8262ka implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final BvImageView f53401C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayoutCompat f53402F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f53403H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f53404L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f53405M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f53406N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f53407Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f53408a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f53409b;

    /* JADX INFO: renamed from: c */
    @efb
    public final AppCompatButton f53410c;

    /* JADX INFO: renamed from: d */
    @efb
    public final CheckBox f53411d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f53412e;

    /* JADX INFO: renamed from: f */
    @efb
    public final EditText f53413f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f53414m;

    private C8262ka(@efb FrameLayout rootView, @efb TextView addName, @efb AppCompatButton btnLogin, @efb CheckBox checkbox, @efb MyEditText etEmail, @efb EditText etPassword, @efb TextView forgetPassword, @efb BvImageView image, @efb LinearLayoutCompat llUserService, @efb LinearLayout register, @efb ImageView showPassword, @efb TextView skipLogin, @efb RelativeLayout smsLayout, @efb TextView tvContent) {
        this.f53408a = rootView;
        this.f53409b = addName;
        this.f53410c = btnLogin;
        this.f53411d = checkbox;
        this.f53412e = etEmail;
        this.f53413f = etPassword;
        this.f53414m = forgetPassword;
        this.f53401C = image;
        this.f53402F = llUserService;
        this.f53403H = register;
        this.f53404L = showPassword;
        this.f53405M = skipLogin;
        this.f53406N = smsLayout;
        this.f53407Q = tvContent;
    }

    @efb
    public static C8262ka bind(@efb View rootView) {
        int i = C2558R.id.add_name;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_login;
            AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
            if (appCompatButton != null) {
                i = C2558R.id.checkbox;
                CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
                if (checkBox != null) {
                    i = C2558R.id.et_email;
                    MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                    if (myEditText != null) {
                        i = C2558R.id.et_password;
                        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                        if (editText != null) {
                            i = C2558R.id.forget_password;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C2558R.id.image;
                                BvImageView bvImageView = (BvImageView) l8i.findChildViewById(rootView, i);
                                if (bvImageView != null) {
                                    i = C2558R.id.ll_user_service;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                                    if (linearLayoutCompat != null) {
                                        i = C2558R.id.register;
                                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = C2558R.id.show_password;
                                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView != null) {
                                                i = C2558R.id.skip_login;
                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView3 != null) {
                                                    i = C2558R.id.sms_layout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout != null) {
                                                        i = C2558R.id.tv_content;
                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView4 != null) {
                                                            return new C8262ka((FrameLayout) rootView, textView, appCompatButton, checkBox, myEditText, editText, textView2, bvImageView, linearLayoutCompat, linearLayout, imageView, textView3, relativeLayout, textView4);
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
    public static C8262ka inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8262ka inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_login, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f53408a;
    }
}
