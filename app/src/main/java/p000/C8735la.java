package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: la */
/* JADX INFO: loaded from: classes4.dex */
public final class C8735la implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f56930C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f56931F;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f56932a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f56933b;

    /* JADX INFO: renamed from: c */
    @efb
    public final CheckBox f56934c;

    /* JADX INFO: renamed from: d */
    @efb
    public final MyEditText f56935d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f56936e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayoutCompat f56937f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f56938m;

    private C8735la(@efb FrameLayout rootView, @efb TextView addName, @efb CheckBox checkbox, @efb MyEditText etPhoneNumber, @efb ImageView ivPhoneClean, @efb LinearLayoutCompat llUserService, @efb TextView skipLogin, @efb TextView tvContent, @efb TextView tvSendSms) {
        this.f56932a = rootView;
        this.f56933b = addName;
        this.f56934c = checkbox;
        this.f56935d = etPhoneNumber;
        this.f56936e = ivPhoneClean;
        this.f56937f = llUserService;
        this.f56938m = skipLogin;
        this.f56930C = tvContent;
        this.f56931F = tvSendSms;
    }

    @efb
    public static C8735la bind(@efb View rootView) {
        int i = C2558R.id.add_name;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.checkbox;
            CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
            if (checkBox != null) {
                i = C2558R.id.et_phone_number;
                MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                if (myEditText != null) {
                    i = C2558R.id.iv_phone_clean;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.ll_user_service;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) l8i.findChildViewById(rootView, i);
                        if (linearLayoutCompat != null) {
                            i = C2558R.id.skip_login;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C2558R.id.tv_content;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C2558R.id.tv_send_sms;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        return new C8735la((FrameLayout) rootView, textView, checkBox, myEditText, imageView, linearLayoutCompat, textView2, textView3, textView4);
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
    public static C8735la inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8735la inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_login_by_sms, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f56932a;
    }
}
