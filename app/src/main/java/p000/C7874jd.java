package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;

/* JADX INFO: renamed from: jd */
/* JADX INFO: loaded from: classes6.dex */
public final class C7874jd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final RecyclerView f50331C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f50332F;

    /* JADX INFO: renamed from: H */
    @efb
    public final SeekBar f50333H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f50334L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f50335M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f50336N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f50337Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f50338X;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f50339a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ConstraintLayout f50340b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f50341c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f50342d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f50343e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f50344f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f50345m;

    private C7874jd(@efb RelativeLayout rootView, @efb ConstraintLayout clRecordInfo, @efb ImageView frBack, @efb ImageView ivPlaying, @efb ImageView ivRecordShare, @efb View line, @efb RelativeLayout musicPlayerLayout, @efb RecyclerView rcRecordDetail, @efb RelativeLayout rlTitle, @efb SeekBar seekbar, @efb TextView tvPlayEndTime, @efb TextView tvPlayStartTime, @efb TextView tvRecordingDate, @efb TextView tvRecordingName, @efb TextView tvRecordingTime) {
        this.f50339a = rootView;
        this.f50340b = clRecordInfo;
        this.f50341c = frBack;
        this.f50342d = ivPlaying;
        this.f50343e = ivRecordShare;
        this.f50344f = line;
        this.f50345m = musicPlayerLayout;
        this.f50331C = rcRecordDetail;
        this.f50332F = rlTitle;
        this.f50333H = seekbar;
        this.f50334L = tvPlayEndTime;
        this.f50335M = tvPlayStartTime;
        this.f50336N = tvRecordingDate;
        this.f50337Q = tvRecordingName;
        this.f50338X = tvRecordingTime;
    }

    @efb
    public static C7874jd bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.cl_record_info;
        ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = C4035R.id.fr_back;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C4035R.id.iv_playing;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C4035R.id.iv_record_share;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.line))) != null) {
                        i = C4035R.id.music_player_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout != null) {
                            i = C4035R.id.rc_record_detail;
                            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                            if (recyclerView != null) {
                                i = C4035R.id.rl_title;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                if (relativeLayout2 != null) {
                                    i = C4035R.id.seekbar;
                                    SeekBar seekBar = (SeekBar) l8i.findChildViewById(rootView, i);
                                    if (seekBar != null) {
                                        i = C4035R.id.tv_play_end_time;
                                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView != null) {
                                            i = C4035R.id.tv_play_start_time;
                                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView2 != null) {
                                                i = C4035R.id.tvRecordingDate;
                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView3 != null) {
                                                    i = C4035R.id.tvRecordingName;
                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView4 != null) {
                                                        i = C4035R.id.tvRecordingTime;
                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView5 != null) {
                                                            return new C7874jd((RelativeLayout) rootView, constraintLayout, imageView, imageView2, imageView3, viewFindChildViewById, relativeLayout, recyclerView, relativeLayout2, seekBar, textView, textView2, textView3, textView4, textView5);
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
    public static C7874jd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7874jd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_trans_machine_record_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f50339a;
    }
}
