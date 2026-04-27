package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: cc */
/* JADX INFO: loaded from: classes4.dex */
public final class C2263cc implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f16203C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f16204F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f16205H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f16206L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f16207M;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f16208a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f16209b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f16210c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f16211d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f16212e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ScrollView f16213f;

    /* JADX INFO: renamed from: m */
    @efb
    public final GifImageView f16214m;

    private C2263cc(@efb RelativeLayout rootView, @efb EditText editCurrentIndex, @efb EditText edtTitle, @efb ImageView ivPlay, @efb RelativeLayout rlTitle, @efb ScrollView scrollView, @efb GifImageView svWave, @efb TextView tvCancel, @efb TextView tvCurrentTime, @efb TextView tvCurrentTotal, @efb TextView tvDate, @efb TextView tvSave) {
        this.f16208a = rootView;
        this.f16209b = editCurrentIndex;
        this.f16210c = edtTitle;
        this.f16211d = ivPlay;
        this.f16212e = rlTitle;
        this.f16213f = scrollView;
        this.f16214m = svWave;
        this.f16203C = tvCancel;
        this.f16204F = tvCurrentTime;
        this.f16205H = tvCurrentTotal;
        this.f16206L = tvDate;
        this.f16207M = tvSave;
    }

    @efb
    public static C2263cc bind(@efb View rootView) {
        int i = C2558R.id.edit_current_index;
        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
        if (editText != null) {
            i = C2558R.id.edt_title;
            EditText editText2 = (EditText) l8i.findChildViewById(rootView, i);
            if (editText2 != null) {
                i = C2558R.id.iv_play;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.scroll_view;
                        ScrollView scrollView = (ScrollView) l8i.findChildViewById(rootView, i);
                        if (scrollView != null) {
                            i = C2558R.id.sv_wave;
                            GifImageView gifImageView = (GifImageView) l8i.findChildViewById(rootView, i);
                            if (gifImageView != null) {
                                i = C2558R.id.tv_cancel;
                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView != null) {
                                    i = C2558R.id.tv_current_time;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        i = C2558R.id.tv_current_total;
                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView3 != null) {
                                            i = C2558R.id.tv_date;
                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                i = C2558R.id.tv_save;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    return new C2263cc((RelativeLayout) rootView, editText, editText2, imageView, relativeLayout, scrollView, gifImageView, textView, textView2, textView3, textView4, textView5);
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
    public static C2263cc inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C2263cc inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_record_edit_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f16208a;
    }
}
