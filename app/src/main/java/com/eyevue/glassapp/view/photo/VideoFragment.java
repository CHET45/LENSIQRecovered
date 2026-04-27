package com.eyevue.glassapp.view.photo;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.utils.photo.PermissionUtils;
import com.eyevue.glassapp.view.photo.VideoFragment;
import com.watchfun.base.BaseFragment;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.ae3;
import p000.aga;
import p000.bth;
import p000.ca5;
import p000.dv3;
import p000.dwf;
import p000.e0g;
import p000.gfd;
import p000.gib;
import p000.h9g;
import p000.jt3;
import p000.lyc;
import p000.lzc;
import p000.m9g;
import p000.md8;
import p000.mtc;
import p000.ny6;
import p000.os5;
import p000.tu6;
import p000.yfb;
import p000.zy3;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nVideoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFragment.kt\ncom/eyevue/glassapp/view/photo/VideoFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,315:1\n254#2:316\n*S KotlinDebug\n*F\n+ 1 VideoFragment.kt\ncom/eyevue/glassapp/view/photo/VideoFragment\n*L\n295#1:316\n*E\n"})
@e0g(parameters = 0)
public final class VideoFragment extends BaseMediaFragment<tu6> {

    /* JADX INFO: renamed from: a2 */
    @yfb
    public static final C2858a f18979a2 = new C2858a(null);

    /* JADX INFO: renamed from: b2 */
    public static final int f18980b2 = 8;

    /* JADX INFO: renamed from: C */
    @yfb
    public final String f18981C = "VideoFragment";

    /* JADX INFO: renamed from: F */
    public boolean f18982F;

    /* JADX INFO: renamed from: H */
    public boolean f18983H;

    /* JADX INFO: renamed from: L */
    @gib
    public ImageView f18984L;

    /* JADX INFO: renamed from: M */
    public float f18985M;

    /* JADX INFO: renamed from: M1 */
    public boolean f18986M1;

    /* JADX INFO: renamed from: N */
    @gib
    public ImageView f18987N;

    /* JADX INFO: renamed from: Q */
    public boolean f18988Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f18989V1;

    /* JADX INFO: renamed from: X */
    @gib
    public ImageView f18990X;

    /* JADX INFO: renamed from: Y */
    @gib
    public ca5 f18991Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public gfd f18992Z;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public ae3 f18993Z1;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$a */
    public static final class C2858a {
        public /* synthetic */ C2858a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final VideoFragment newInstance(@gib String str, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putInt(C2865a.f19004r, i);
            VideoFragment videoFragment = new VideoFragment();
            videoFragment.setArguments(bundle);
            return videoFragment;
        }

        private C2858a() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$b */
    public static final class ViewOnClickListenerC2859b implements View.OnClickListener {
        public ViewOnClickListenerC2859b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoFragment.this.f18983H = !r7.f18983H;
            ca5 ca5Var = VideoFragment.this.f18991Y;
            md8.checkNotNull(ca5Var);
            ca5Var.setPlayWhenReady(VideoFragment.this.f18983H);
            ca5 ca5Var2 = VideoFragment.this.f18991Y;
            md8.checkNotNull(ca5Var2);
            ca5Var2.getPlaybackState();
            ImageView imageView = VideoFragment.this.f18984L;
            md8.checkNotNull(imageView);
            imageView.setImageResource(VideoFragment.this.f18983H ? C2531R.drawable.ic_control_pause : C2531R.drawable.ic_control_play);
            String str = VideoFragment.this.f18981C;
            StringBuilder sb = new StringBuilder();
            sb.append("当前进度:::");
            ca5 ca5Var3 = VideoFragment.this.f18991Y;
            md8.checkNotNull(ca5Var3);
            sb.append(ca5Var3.getCurrentPosition());
            sb.append(":::");
            sb.append(VideoFragment.this.f18986M1);
            sb.append("::::");
            sb.append(VideoFragment.this.f18989V1);
            C2473f.m4168e(str, sb.toString());
            ca5 ca5Var4 = VideoFragment.this.f18991Y;
            md8.checkNotNull(ca5Var4);
            if (ca5Var4.getCurrentPosition() == 1 || !VideoFragment.this.f18989V1) {
                ca5 ca5Var5 = VideoFragment.this.f18991Y;
                md8.checkNotNull(ca5Var5);
                ca5Var5.seekTo(200L);
            }
            if (VideoFragment.this.f18982F) {
                VideoFragment.this.f18982F = false;
                ca5 ca5Var6 = VideoFragment.this.f18991Y;
                md8.checkNotNull(ca5Var6);
                ca5Var6.seekTo(0L);
                ca5 ca5Var7 = VideoFragment.this.f18991Y;
                md8.checkNotNull(ca5Var7);
                ca5Var7.setPlayWhenReady(true);
                VideoFragment.this.f18983H = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$c */
    public static final class ViewOnClickListenerC2860c implements View.OnClickListener {
        public ViewOnClickListenerC2860c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!VideoFragment.this.f18988Q) {
                VideoFragment videoFragment = VideoFragment.this;
                ca5 ca5Var = videoFragment.f18991Y;
                md8.checkNotNull(ca5Var);
                videoFragment.f18985M = ca5Var.getVolume();
            }
            VideoFragment.this.f18988Q = !r2.f18988Q;
            ca5 ca5Var2 = VideoFragment.this.f18991Y;
            md8.checkNotNull(ca5Var2);
            ca5Var2.setVolume(VideoFragment.this.f18988Q ? 0.0f : VideoFragment.this.f18985M);
            ImageView imageView = VideoFragment.this.f18987N;
            md8.checkNotNull(imageView);
            imageView.setImageResource(VideoFragment.this.f18988Q ? C2531R.drawable.ic_control_mute : C2531R.drawable.ic_control_unmute);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$d */
    public static final class ViewOnClickListenerC2861d implements View.OnClickListener {
        public ViewOnClickListenerC2861d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bth onClick$lambda$0(VideoFragment videoFragment) {
            videoFragment.m4977e();
            return bth.f14751a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ae3 ae3Var = VideoFragment.this.f18993Z1;
            if (ae3Var != null) {
                ae3Var.dismiss();
            }
            VideoFragment videoFragment = VideoFragment.this;
            FragmentActivity fragmentActivityRequireActivity = VideoFragment.this.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
            String string = VideoFragment.this.getString(C2531R.string.tips);
            md8.checkNotNullExpressionValue(string, "getString(...)");
            ae3.C0191a title = c0191a.setTitle(string);
            String string2 = VideoFragment.this.getString(C2531R.string.confirm_delete);
            md8.checkNotNullExpressionValue(string2, "getString(...)");
            ae3.C0191a content = title.setContent(string2);
            String string3 = VideoFragment.this.getString(C2531R.string.cancel);
            md8.checkNotNullExpressionValue(string3, "getString(...)");
            ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
            String string4 = VideoFragment.this.getString(C2531R.string.string_delete);
            md8.checkNotNullExpressionValue(string4, "getString(...)");
            final VideoFragment videoFragment2 = VideoFragment.this;
            videoFragment.f18993Z1 = leftButton$default.setRightButton(string4, new ny6() { // from class: m6i
                @Override // p000.ny6
                public final Object invoke() {
                    return VideoFragment.ViewOnClickListenerC2861d.onClick$lambda$0(videoFragment2);
                }
            }).create();
            ae3 ae3Var2 = VideoFragment.this.f18993Z1;
            md8.checkNotNull(ae3Var2);
            ae3Var2.show();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$e */
    public static final class ViewOnClickListenerC2862e implements View.OnClickListener {
        public ViewOnClickListenerC2862e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PermissionUtils.checkStoragePermission(VideoFragment.this.getContext())) {
                VideoFragment.this.m4978g();
            } else {
                PermissionUtils.requestStoragePermission(VideoFragment.this.getActivity());
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$f */
    public static final class ViewOnClickListenerC2863f implements View.OnClickListener {
        public ViewOnClickListenerC2863f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoFragment.this.requireActivity().finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.VideoFragment$g */
    public static final class C2864g implements lzc.InterfaceC9049g {
        public C2864g() {
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onIsPlayingChanged(boolean z) {
            super.onIsPlayingChanged(z);
            if (!z) {
                VideoFragment.this.f18983H = false;
                if (((BaseFragment) VideoFragment.this).binding != null) {
                    ImageView imageView = VideoFragment.this.f18984L;
                    md8.checkNotNull(imageView);
                    imageView.setImageResource(C2531R.drawable.ic_control_play);
                    return;
                }
                return;
            }
            VideoFragment.this.f18982F = false;
            VideoFragment.this.f18983H = true;
            if (((BaseFragment) VideoFragment.this).binding != null) {
                ImageView imageView2 = VideoFragment.this.f18984L;
                md8.checkNotNull(imageView2);
                imageView2.setImageResource(C2531R.drawable.ic_control_pause);
            }
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackStateChanged(int i) {
            super.onPlaybackStateChanged(i);
            if (i == 3) {
                VideoFragment.this.f18989V1 = true;
                return;
            }
            if (i != 4) {
                return;
            }
            VideoFragment.this.f18982F = true;
            VideoFragment.this.f18983H = false;
            if (((BaseFragment) VideoFragment.this).binding != null) {
                ImageView imageView = VideoFragment.this.f18984L;
                md8.checkNotNull(imageView);
                imageView.setImageResource(C2531R.drawable.ic_control_play);
            }
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayerError(lyc lycVar) {
            md8.checkNotNullParameter(lycVar, "error");
            super.onPlayerError(lycVar);
            C2473f.m4168e(VideoFragment.this.f18981C, "错误！！！：" + lycVar.getErrorCodeName() + ":::" + lycVar.getMessage());
            VideoFragment.this.f18986M1 = true;
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlayerErrorChanged(lyc lycVar) {
            super.onPlayerErrorChanged(lycVar);
            if (lycVar != null) {
                C2473f.m4168e(VideoFragment.this.f18981C, "2222错误！！！：" + lycVar.getErrorCodeName() + ":::" + lycVar.getMessage());
            }
        }
    }

    private final void initMListener() {
        T t = this.binding;
        md8.checkNotNull(t);
        View viewFindViewById = ((tu6) t).f85959f.findViewById(C2558R.id.layout_player_control_view);
        this.f18984L = (ImageView) viewFindViewById.findViewById(C2558R.id.iv_video_play);
        this.f18987N = (ImageView) viewFindViewById.findViewById(C2558R.id.iv_mute);
        this.f18990X = (ImageView) viewFindViewById.findViewById(C2558R.id.iv_delete);
        ImageView imageView = this.f18984L;
        md8.checkNotNull(imageView);
        imageView.setOnClickListener(new ViewOnClickListenerC2859b());
        ImageView imageView2 = this.f18987N;
        md8.checkNotNull(imageView2);
        imageView2.setOnClickListener(new ViewOnClickListenerC2860c());
        ImageView imageView3 = this.f18990X;
        md8.checkNotNull(imageView3);
        imageView3.setOnClickListener(new ViewOnClickListenerC2861d());
        ((tu6) this.binding).f85957d.setOnClickListener(new ViewOnClickListenerC2862e());
        T t2 = this.binding;
        md8.checkNotNull(t2);
        ((tu6) t2).f85956c.setOnClickListener(new ViewOnClickListenerC2863f());
    }

    private final void previewVideo(String str) {
        Locale locale = Locale.getDefault();
        md8.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (m9g.contains$default((CharSequence) lowerCase, (CharSequence) "thumbnail", false, 2, (Object) null)) {
            T t = this.binding;
            md8.checkNotNull(t);
            ((tu6) t).f85955b.setVisibility(0);
            T t2 = this.binding;
            md8.checkNotNull(t2);
            ((tu6) t2).f85957d.setVisibility(8);
        } else {
            T t3 = this.binding;
            md8.checkNotNull(t3);
            ((tu6) t3).f85955b.setVisibility(8);
            T t4 = this.binding;
            md8.checkNotNull(t4);
            ((tu6) t4).f85957d.setVisibility(0);
        }
        T t5 = this.binding;
        md8.checkNotNull(t5);
        ((tu6) t5).f85959f.setVisibility(0);
        T t6 = this.binding;
        md8.checkNotNull(t6);
        ((tu6) t6).f85959f.setUseController(true);
        T t7 = this.binding;
        md8.checkNotNull(t7);
        ((tu6) t7).f85959f.showController();
        this.f18737c = Uri.parse(str);
        os5.C10629b c10629b = new os5.C10629b();
        dv3 mp4ExtractorFlags = new dv3().setMp4ExtractorFlags(1);
        md8.checkNotNullExpressionValue(mp4ExtractorFlags, "setMp4ExtractorFlags(...)");
        this.f18992Z = new gfd.C6285b(c10629b, mp4ExtractorFlags).createMediaSource(aga.fromUri(this.f18737c));
        this.f18991Y = new ca5.C2249c(requireContext()).setHandleAudioBecomingNoisy(true).setRenderersFactory(new zy3(requireContext()).setEnableDecoderFallback(true)).build();
        T t8 = this.binding;
        md8.checkNotNull(t8);
        ((tu6) t8).f85959f.setPlayer(this.f18991Y);
        T t9 = this.binding;
        md8.checkNotNull(t9);
        ((tu6) t9).f85959f.setUseArtwork(false);
        T t10 = this.binding;
        md8.checkNotNull(t10);
        ((tu6) t10).f85959f.setDefaultArtwork(null);
        ca5 ca5Var = this.f18991Y;
        md8.checkNotNull(ca5Var);
        gfd gfdVar = this.f18992Z;
        md8.checkNotNull(gfdVar);
        ca5Var.setMediaSource(gfdVar);
        ca5 ca5Var2 = this.f18991Y;
        md8.checkNotNull(ca5Var2);
        ca5Var2.prepare();
        ca5 ca5Var3 = this.f18991Y;
        md8.checkNotNull(ca5Var3);
        ca5Var3.addListener(new C2864g());
        T t11 = this.binding;
        md8.checkNotNull(t11);
        ((tu6) t11).f85959f.setPlayer(this.f18991Y);
        ((tu6) this.binding).f85953C.setText(this.f18737c.getLastPathSegment());
        resetOperationEnable();
    }

    private final void resetOperationEnable() {
        CopyOnWriteArrayList<Uri> filterPhotoListLiveData = mtc.f62107a.getFilterPhotoListLiveData();
        if (filterPhotoListLiveData != null) {
            Iterator<Uri> it = filterPhotoListLiveData.iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                String string = it.next().toString();
                String str = this.f18736b;
                md8.checkNotNullExpressionValue(str, "curFileUri");
                if (md8.areEqual(string, h9g.replace$default(str, "_filter", "", false, 4, (Object) null))) {
                    ((tu6) this.binding).f85957d.setVisibility(8);
                    ImageView imageView = this.f18990X;
                    md8.checkNotNull(imageView);
                    imageView.setVisibility(8);
                    return;
                }
            }
        }
        FrameLayout frameLayout = ((tu6) this.binding).f85955b;
        md8.checkNotNullExpressionValue(frameLayout, "flThumbnail");
        if (frameLayout.getVisibility() == 0) {
            ((tu6) this.binding).f85957d.setVisibility(8);
        } else {
            ((tu6) this.binding).f85957d.setVisibility(0);
        }
        ImageView imageView2 = this.f18990X;
        md8.checkNotNull(imageView2);
        imageView2.setVisibility(0);
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    /* JADX INFO: renamed from: f */
    public void mo4972f(int i) {
        super.mo4972f(i);
        if (i < 0 || i >= 100) {
            T t = this.binding;
            md8.checkNotNull(t);
            ((tu6) t).f85955b.setVisibility(8);
            T t2 = this.binding;
            md8.checkNotNull(t2);
            ((tu6) t2).f85957d.setVisibility(0);
        } else {
            T t3 = this.binding;
            md8.checkNotNull(t3);
            ((tu6) t3).f85955b.setVisibility(0);
            T t4 = this.binding;
            md8.checkNotNull(t4);
            ((tu6) t4).f85957d.setVisibility(8);
        }
        T t5 = this.binding;
        md8.checkNotNull(t5);
        ((tu6) t5).f85960m.setCurrent(i);
    }

    @Override // com.watchfun.base.BaseFragment
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public tu6 provideViewBinding(@gib ViewGroup viewGroup) {
        tu6 tu6VarInflate = tu6.inflate(getLayoutInflater(), viewGroup, false);
        md8.checkNotNullExpressionValue(tu6VarInflate, "inflate(...)");
        return tu6VarInflate;
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        initMListener();
        String str = this.f18736b;
        md8.checkNotNullExpressionValue(str, "curFileUri");
        previewVideo(str);
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ca5 ca5Var = this.f18991Y;
        if (ca5Var != null) {
            md8.checkNotNull(ca5Var);
            ca5Var.setPlayWhenReady(false);
            ca5 ca5Var2 = this.f18991Y;
            md8.checkNotNull(ca5Var2);
            ca5Var2.stop();
            ca5 ca5Var3 = this.f18991Y;
            md8.checkNotNull(ca5Var3);
            ca5Var3.release();
            this.f18991Y = null;
        }
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ca5 ca5Var = this.f18991Y;
        if (ca5Var != null) {
            md8.checkNotNull(ca5Var);
            ca5Var.setPlayWhenReady(false);
            this.f18983H = false;
            ImageView imageView = this.f18984L;
            md8.checkNotNull(imageView);
            imageView.setImageResource(C2531R.drawable.ic_control_play);
        }
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        ca5 ca5Var;
        super.onStart();
        C2473f.m4168e(this.f18981C, "onStart");
        if (this.f18992Z == null || (ca5Var = this.f18991Y) == null) {
            return;
        }
        md8.checkNotNull(ca5Var);
        gfd gfdVar = this.f18992Z;
        md8.checkNotNull(gfdVar);
        ca5Var.setMediaSource(gfdVar);
        ca5 ca5Var2 = this.f18991Y;
        md8.checkNotNull(ca5Var2);
        ca5Var2.prepare();
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    public void setCurrentPosition(int i) {
        this.f18738d = i;
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    public void updateMedia(@yfb String str) {
        md8.checkNotNullParameter(str, "filePath");
        super.updateMedia(str);
        this.f18736b = str;
        previewVideo(str);
    }
}
