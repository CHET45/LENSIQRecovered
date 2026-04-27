package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: ac */
/* JADX INFO: loaded from: classes4.dex */
public final class C0172ac implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final RelativeLayout f1053C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ScrollView f1054F;

    /* JADX INFO: renamed from: H */
    @efb
    public final GifImageView f1055H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f1056L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f1057M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f1058N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f1059Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f1060a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f1061b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f1062c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f1063d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f1064e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f1065f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f1066m;

    private C0172ac(@efb RelativeLayout rootView, @efb TextView btnPhoneVoice, @efb TextView edtLang, @efb TextView edtTitle, @efb ImageView frBack, @efb ImageView ivPlay, @efb RelativeLayout rlEdit, @efb RelativeLayout rlTitle, @efb ScrollView scrollView, @efb GifImageView svWave, @efb TextView tvCurrentIndex, @efb TextView tvCurrentTime, @efb TextView tvCurrentTotal, @efb TextView tvDate) {
        this.f1060a = rootView;
        this.f1061b = btnPhoneVoice;
        this.f1062c = edtLang;
        this.f1063d = edtTitle;
        this.f1064e = frBack;
        this.f1065f = ivPlay;
        this.f1066m = rlEdit;
        this.f1053C = rlTitle;
        this.f1054F = scrollView;
        this.f1055H = svWave;
        this.f1056L = tvCurrentIndex;
        this.f1057M = tvCurrentTime;
        this.f1058N = tvCurrentTotal;
        this.f1059Q = tvDate;
    }

    @efb
    public static C0172ac bind(@efb View rootView) {
        int i = C2558R.id.btn_phone_voice;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.edt_lang;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.edt_title;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2558R.id.fr_back;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.iv_play;
                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            i = C2558R.id.rl_edit;
                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout != null) {
                                i = C2558R.id.rl_title;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                if (relativeLayout2 != null) {
                                    i = C2558R.id.scroll_view;
                                    ScrollView scrollView = (ScrollView) l8i.findChildViewById(rootView, i);
                                    if (scrollView != null) {
                                        i = C2558R.id.sv_wave;
                                        GifImageView gifImageView = (GifImageView) l8i.findChildViewById(rootView, i);
                                        if (gifImageView != null) {
                                            i = C2558R.id.tv_current_index;
                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                i = C2558R.id.tv_current_time;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    i = C2558R.id.tv_current_total;
                                                    TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView6 != null) {
                                                        i = C2558R.id.tv_date;
                                                        TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView7 != null) {
                                                            return new C0172ac((RelativeLayout) rootView, textView, textView2, textView3, imageView, imageView2, relativeLayout, relativeLayout2, scrollView, gifImageView, textView4, textView5, textView6, textView7);
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
    public static C0172ac inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C0172ac inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_record_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f1060a;
    }
}
