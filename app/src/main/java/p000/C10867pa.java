package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes4.dex */
public final class C10867pa implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ToolBar f70135C;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f70136a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f70137b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70138c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f70139d;

    /* JADX INFO: renamed from: e */
    @efb
    public final SeekBar f70140e;

    /* JADX INFO: renamed from: f */
    @efb
    public final SeekBar f70141f;

    /* JADX INFO: renamed from: m */
    @efb
    public final SeekBar f70142m;

    private C10867pa(@efb LinearLayout rootView, @efb ImageView ivCall, @efb ImageView ivMedia, @efb ImageView ivSystem, @efb SeekBar pbCall, @efb SeekBar pbMedia, @efb SeekBar pbSystem, @efb ToolBar toolbar) {
        this.f70136a = rootView;
        this.f70137b = ivCall;
        this.f70138c = ivMedia;
        this.f70139d = ivSystem;
        this.f70140e = pbCall;
        this.f70141f = pbMedia;
        this.f70142m = pbSystem;
        this.f70135C = toolbar;
    }

    @efb
    public static C10867pa bind(@efb View rootView) {
        int i = C2558R.id.iv_call;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.iv_media;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.iv_system;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C2558R.id.pb_call;
                    SeekBar seekBar = (SeekBar) l8i.findChildViewById(rootView, i);
                    if (seekBar != null) {
                        i = C2558R.id.pb_media;
                        SeekBar seekBar2 = (SeekBar) l8i.findChildViewById(rootView, i);
                        if (seekBar2 != null) {
                            i = C2558R.id.pb_system;
                            SeekBar seekBar3 = (SeekBar) l8i.findChildViewById(rootView, i);
                            if (seekBar3 != null) {
                                i = C2558R.id.toolbar;
                                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                                if (toolBar != null) {
                                    return new C10867pa((LinearLayout) rootView, imageView, imageView2, imageView3, seekBar, seekBar2, seekBar3, toolBar);
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
    public static C10867pa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10867pa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_quick_volume, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f70136a;
    }
}
