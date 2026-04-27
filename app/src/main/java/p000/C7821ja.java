package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;
import org.videolan.libvlc.util.VLCVideoLayout;

/* JADX INFO: renamed from: ja */
/* JADX INFO: loaded from: classes4.dex */
public final class C7821ja implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f50052C;

    /* JADX INFO: renamed from: F */
    @efb
    public final View f50053F;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f50054a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f50055b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f50056c;

    /* JADX INFO: renamed from: d */
    @efb
    public final CardView f50057d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f50058e;

    /* JADX INFO: renamed from: f */
    @efb
    public final VLCVideoLayout f50059f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ToolBar f50060m;

    private C7821ja(@efb ConstraintLayout rootView, @efb LinearLayout btnReconnect, @efb ImageView btnRotate, @efb CardView cardView, @efb RelativeLayout flVideo, @efb VLCVideoLayout playerView, @efb ToolBar toolbar, @efb TextView tvConnectTip, @efb View viewOverlay) {
        this.f50054a = rootView;
        this.f50055b = btnReconnect;
        this.f50056c = btnRotate;
        this.f50057d = cardView;
        this.f50058e = flVideo;
        this.f50059f = playerView;
        this.f50060m = toolbar;
        this.f50052C = tvConnectTip;
        this.f50053F = viewOverlay;
    }

    @efb
    public static C7821ja bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_reconnect;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.btn_rotate;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.card_view;
                CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
                if (cardView != null) {
                    i = C2558R.id.fl_video;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.player_view;
                        VLCVideoLayout vLCVideoLayout = (VLCVideoLayout) l8i.findChildViewById(rootView, i);
                        if (vLCVideoLayout != null) {
                            i = C2558R.id.toolbar;
                            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                            if (toolBar != null) {
                                i = C2558R.id.tv_connect_tip;
                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_overlay))) != null) {
                                    return new C7821ja((ConstraintLayout) rootView, linearLayout, imageView, cardView, relativeLayout, vLCVideoLayout, toolBar, textView, viewFindChildViewById);
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
    public static C7821ja inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7821ja inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_live, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f50054a;
    }
}
