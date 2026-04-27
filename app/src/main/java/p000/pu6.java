package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class pu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f72081C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f72082F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f72083H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f72084L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f72085M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RecyclerView f72086N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f72087Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f72088X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f72089Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f72090Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f72091a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f72092b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f72093c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f72094d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f72095e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f72096f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f72097m;

    private pu6(@efb RelativeLayout rootView, @efb TextView btnImport, @efb TextView btnTypeAll, @efb TextView btnTypeAudio, @efb TextView btnTypeImg, @efb TextView btnTypeVideo, @efb ImageView cancelButton, @efb ImageView editButton, @efb RelativeLayout layoutImport, @efb LinearLayout layoutType, @efb LinearLayout llAlbumTop, @efb LinearLayout llEmpty, @efb RecyclerView recyclerView, @efb ImageView redpoint, @efb RelativeLayout rlTitle, @efb TextView tvNum, @efb TextView tvRetry) {
        this.f72091a = rootView;
        this.f72092b = btnImport;
        this.f72093c = btnTypeAll;
        this.f72094d = btnTypeAudio;
        this.f72095e = btnTypeImg;
        this.f72096f = btnTypeVideo;
        this.f72097m = cancelButton;
        this.f72081C = editButton;
        this.f72082F = layoutImport;
        this.f72083H = layoutType;
        this.f72084L = llAlbumTop;
        this.f72085M = llEmpty;
        this.f72086N = recyclerView;
        this.f72087Q = redpoint;
        this.f72088X = rlTitle;
        this.f72089Y = tvNum;
        this.f72090Z = tvRetry;
    }

    @efb
    public static pu6 bind(@efb View rootView) {
        int i = C2558R.id.btn_import;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_type_all;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.btn_type_audio;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2558R.id.btn_type_img;
                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        i = C2558R.id.btn_type_video;
                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView5 != null) {
                            i = C2558R.id.cancelButton;
                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = C2558R.id.editButton;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView2 != null) {
                                    i = C2558R.id.layout_import;
                                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                    if (relativeLayout != null) {
                                        i = C2558R.id.layout_type;
                                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = C2558R.id.ll_album_top;
                                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout2 != null) {
                                                i = C2558R.id.ll_empty;
                                                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout3 != null) {
                                                    i = C2558R.id.recyclerView;
                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                    if (recyclerView != null) {
                                                        i = C2558R.id.redpoint;
                                                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView3 != null) {
                                                            i = C2558R.id.rl_title;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout2 != null) {
                                                                i = C2558R.id.tv_num;
                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView6 != null) {
                                                                    i = C2558R.id.tv_retry;
                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView7 != null) {
                                                                        return new pu6((RelativeLayout) rootView, textView, textView2, textView3, textView4, textView5, imageView, imageView2, relativeLayout, linearLayout, linearLayout2, linearLayout3, recyclerView, imageView3, relativeLayout2, textView6, textView7);
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
    public static pu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_photo_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f72091a;
    }
}
