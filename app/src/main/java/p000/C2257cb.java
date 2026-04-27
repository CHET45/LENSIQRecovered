package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: cb */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257cb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f16144a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f16145b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f16146c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f16147d;

    /* JADX INFO: renamed from: e */
    @efb
    public final VideoView f16148e;

    private C2257cb(@efb RelativeLayout rootView, @efb ImageView backButton, @efb TextView titleTextView, @efb RelativeLayout tvTitle, @efb VideoView videoView) {
        this.f16144a = rootView;
        this.f16145b = backButton;
        this.f16146c = titleTextView;
        this.f16147d = tvTitle;
        this.f16148e = videoView;
    }

    @efb
    public static C2257cb bind(@efb View rootView) {
        int i = C2558R.id.backButton;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.titleTextView;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_title;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2558R.id.videoView;
                    VideoView videoView = (VideoView) l8i.findChildViewById(rootView, i);
                    if (videoView != null) {
                        return new C2257cb((RelativeLayout) rootView, imageView, textView, relativeLayout, videoView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C2257cb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C2257cb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_full_screen_video, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f16144a;
    }
}
