package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: hb */
/* JADX INFO: loaded from: classes4.dex */
public final class C6779hb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f43038C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f43039F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f43040H;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f43041a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f43042b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f43043c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f43044d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f43045e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ConstraintLayout f43046f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f43047m;

    private C6779hb(@efb ConstraintLayout rootView, @efb ImageView btnAnswer, @efb TextView btnFromTrans, @efb ImageView btnHangup, @efb TextView btnToTrans, @efb ConstraintLayout clTop, @efb ImageView ivBack, @efb ImageView ivCamera, @efb ImageView ivExchange, @efb TextView tvWaitingTip) {
        this.f43041a = rootView;
        this.f43042b = btnAnswer;
        this.f43043c = btnFromTrans;
        this.f43044d = btnHangup;
        this.f43045e = btnToTrans;
        this.f43046f = clTop;
        this.f43047m = ivBack;
        this.f43038C = ivCamera;
        this.f43039F = ivExchange;
        this.f43040H = tvWaitingTip;
    }

    @efb
    public static C6779hb bind(@efb View rootView) {
        int i = C2558R.id.btn_answer;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_from_trans;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.btn_hangup;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C2558R.id.btn_to_trans;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2558R.id.cl_top;
                        ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                        if (constraintLayout != null) {
                            i = C2558R.id.iv_back;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = C2558R.id.iv_camera;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C2558R.id.iv_exchange;
                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        i = C2558R.id.tv_waiting_tip;
                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView3 != null) {
                                            return new C6779hb((ConstraintLayout) rootView, imageView, textView, imageView2, textView2, constraintLayout, imageView3, imageView4, imageView5, textView3);
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
    public static C6779hb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C6779hb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_invite_chat, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f43041a;
    }
}
