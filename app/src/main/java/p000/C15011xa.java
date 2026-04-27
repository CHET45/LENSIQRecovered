package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.widget.verification.VerificationCodeView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: xa */
/* JADX INFO: loaded from: classes4.dex */
public final class C15011xa implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f97334a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f97335b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f97336c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f97337d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f97338e;

    /* JADX INFO: renamed from: f */
    @efb
    public final VerificationCodeView f97339f;

    private C15011xa(@efb FrameLayout rootView, @efb ImageView ivBack, @efb RelativeLayout rlTitle, @efb TextView tvSendSms, @efb TextView tvVerificationsPhone, @efb VerificationCodeView verificationcodeview) {
        this.f97334a = rootView;
        this.f97335b = ivBack;
        this.f97336c = rlTitle;
        this.f97337d = tvSendSms;
        this.f97338e = tvVerificationsPhone;
        this.f97339f = verificationcodeview;
    }

    @efb
    public static C15011xa bind(@efb View rootView) {
        int i = C2558R.id.iv_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.rl_title;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2558R.id.tv_send_sms;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_verifications_phone;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2558R.id.verificationcodeview;
                        VerificationCodeView verificationCodeView = (VerificationCodeView) l8i.findChildViewById(rootView, i);
                        if (verificationCodeView != null) {
                            return new C15011xa((FrameLayout) rootView, imageView, relativeLayout, textView, textView2, verificationCodeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C15011xa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C15011xa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_verification_sms, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f97334a;
    }
}
