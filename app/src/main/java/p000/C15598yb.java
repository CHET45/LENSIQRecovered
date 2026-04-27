package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: yb */
/* JADX INFO: loaded from: classes4.dex */
public final class C15598yb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f101012C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f101013F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ScrollView f101014H;

    /* JADX INFO: renamed from: L */
    @efb
    public final GifImageView f101015L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f101016M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f101017N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f101018Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f101019X;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f101020a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f101021b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f101022c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f101023d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f101024e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f101025f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f101026m;

    private C15598yb(@efb RelativeLayout rootView, @efb TextView edtLang, @efb TextView edtTitle, @efb ImageView frBack, @efb LinearLayout frControl, @efb TextView ivFinish, @efb TextView ivRecord, @efb ImageView ivRecordStatus, @efb RelativeLayout rlTitle, @efb ScrollView scrollView, @efb GifImageView svWave, @efb TextView tvCurrentIndex, @efb TextView tvDate, @efb TextView tvRecordTime, @efb TextView tvTipNetwork) {
        this.f101020a = rootView;
        this.f101021b = edtLang;
        this.f101022c = edtTitle;
        this.f101023d = frBack;
        this.f101024e = frControl;
        this.f101025f = ivFinish;
        this.f101026m = ivRecord;
        this.f101012C = ivRecordStatus;
        this.f101013F = rlTitle;
        this.f101014H = scrollView;
        this.f101015L = svWave;
        this.f101016M = tvCurrentIndex;
        this.f101017N = tvDate;
        this.f101018Q = tvRecordTime;
        this.f101019X = tvTipNetwork;
    }

    @efb
    public static C15598yb bind(@efb View rootView) {
        int i = C2558R.id.edt_lang;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.edt_title;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.fr_back;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.fr_control;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C2558R.id.iv_finish;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = C2558R.id.iv_record;
                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = C2558R.id.iv_record_status;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView2 != null) {
                                    i = C2558R.id.rl_title;
                                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                    if (relativeLayout != null) {
                                        i = C2558R.id.scroll_view;
                                        ScrollView scrollView = (ScrollView) l8i.findChildViewById(rootView, i);
                                        if (scrollView != null) {
                                            i = C2558R.id.sv_wave;
                                            GifImageView gifImageView = (GifImageView) l8i.findChildViewById(rootView, i);
                                            if (gifImageView != null) {
                                                i = C2558R.id.tv_current_index;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    i = C2558R.id.tv_date;
                                                    TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView6 != null) {
                                                        i = C2558R.id.tv_record_time;
                                                        TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView7 != null) {
                                                            i = C2558R.id.tv_tip_network;
                                                            TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView8 != null) {
                                                                return new C15598yb((RelativeLayout) rootView, textView, textView2, imageView, linearLayout, textView3, textView4, imageView2, relativeLayout, scrollView, gifImageView, textView5, textView6, textView7, textView8);
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
    public static C15598yb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C15598yb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f101020a;
    }
}
