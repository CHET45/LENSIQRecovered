package com.eyevue.glassapp.view.photo;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.utils.photo.PermissionUtils;
import p000.aga;
import p000.ca5;
import p000.hu6;
import p000.kbe;
import p000.lzc;
import p000.vna;
import p000.zy3;

/* JADX INFO: loaded from: classes4.dex */
public class AudioFragment extends BaseMediaFragment<hu6> {

    /* JADX INFO: renamed from: F */
    public kbe f18723F;

    /* JADX INFO: renamed from: L */
    public boolean f18725L;

    /* JADX INFO: renamed from: M */
    public ca5 f18726M;

    /* JADX INFO: renamed from: N */
    public vna f18727N;

    /* JADX INFO: renamed from: Q */
    public ImageView f18728Q;

    /* JADX INFO: renamed from: X */
    public ImageView f18729X;

    /* JADX INFO: renamed from: C */
    public final String f18722C = "AudioFragment";

    /* JADX INFO: renamed from: H */
    public boolean f18724H = false;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AudioFragment$a */
    public class C2816a implements lzc.InterfaceC9049g {
        public C2816a() {
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onIsPlayingChanged(boolean playing) {
            super.onIsPlayingChanged(playing);
            C2473f.m4168e("AudioFragment", "isPlaying: " + playing);
            if (!playing) {
                AudioFragment.this.f18724H = false;
                AudioFragment.this.f18728Q.setImageResource(C2531R.drawable.ic_control_play);
                if (AudioFragment.this.f18723F != null) {
                    AudioFragment.this.f18723F.reset();
                    return;
                }
                return;
            }
            AudioFragment.this.f18725L = false;
            AudioFragment.this.f18724H = true;
            AudioFragment.this.f18728Q.setImageResource(C2531R.drawable.ic_control_pause);
            if (AudioFragment.this.f18723F != null) {
                AudioFragment.this.f18723F.start();
            }
        }

        @Override // p000.lzc.InterfaceC9049g
        public void onPlaybackStateChanged(int playbackState) {
            super.onPlaybackStateChanged(playbackState);
            C2473f.m4168e("AudioFragment", "playbackState: " + playbackState);
            if (playbackState != 4) {
                return;
            }
            AudioFragment.this.f18725L = true;
            AudioFragment.this.f18724H = false;
            AudioFragment.this.f18728Q.setImageResource(C2531R.drawable.ic_control_play);
            if (AudioFragment.this.f18723F != null) {
                AudioFragment.this.f18723F.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AudioFragment$b */
    public class ViewOnClickListenerC2817b implements View.OnClickListener {
        public ViewOnClickListenerC2817b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            AudioFragment.this.m4977e();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AudioFragment$c */
    public class ViewOnClickListenerC2818c implements View.OnClickListener {
        public ViewOnClickListenerC2818c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (PermissionUtils.checkStoragePermission(AudioFragment.this.getContext())) {
                AudioFragment.this.m4978g();
            } else {
                PermissionUtils.requestStoragePermission(AudioFragment.this.getActivity());
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AudioFragment$d */
    public class ViewOnClickListenerC2819d implements View.OnClickListener {
        public ViewOnClickListenerC2819d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            AudioFragment.this.f18724H = !r7.f18724H;
            AudioFragment.this.f18728Q.setImageResource(AudioFragment.this.f18724H ? C2531R.drawable.ic_control_pause : C2531R.drawable.ic_control_play);
            if (AudioFragment.this.f18724H) {
                if (AudioFragment.this.f18726M.getCurrentPosition() == 1) {
                    AudioFragment.this.f18726M.seekTo(100L);
                }
                AudioFragment.this.f18723F.start();
            } else {
                AudioFragment.this.f18723F.pause();
            }
            AudioFragment.this.f18726M.setPlayWhenReady(AudioFragment.this.f18724H);
            if (AudioFragment.this.f18725L) {
                AudioFragment.this.f18725L = false;
                AudioFragment.this.f18726M.seekTo(0L);
                AudioFragment.this.f18726M.setPlayWhenReady(true);
                AudioFragment.this.f18724H = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.AudioFragment$e */
    public class ViewOnClickListenerC2820e implements View.OnClickListener {
        public ViewOnClickListenerC2820e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AudioFragment.this.requireActivity().finish();
        }
    }

    private void initMListener() {
        View viewFindViewById = ((hu6) this.binding).f44890m.findViewById(C2558R.id.layout_audio_control_view);
        this.f18728Q = (ImageView) viewFindViewById.findViewById(C2558R.id.btn_play_or_pause);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(C2558R.id.btn_delete);
        this.f18729X = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC2817b());
        ((hu6) this.binding).f44887d.setOnClickListener(new ViewOnClickListenerC2818c());
        this.f18728Q.setOnClickListener(new ViewOnClickListenerC2819d());
        ((hu6) this.binding).f44886c.setOnClickListener(new ViewOnClickListenerC2820e());
    }

    public static AudioFragment newInstance(String fileName, int position) {
        Bundle bundle = new Bundle();
        bundle.putString("url", fileName);
        bundle.putInt(C2865a.f19004r, position);
        AudioFragment audioFragment = new AudioFragment();
        audioFragment.setArguments(bundle);
        return audioFragment;
    }

    private void preview(String previewUrl) {
        if (previewUrl.toLowerCase().contains("thumbnail")) {
            ((hu6) this.binding).f44885b.setVisibility(0);
            ((hu6) this.binding).f44887d.setVisibility(8);
        } else {
            ((hu6) this.binding).f44885b.setVisibility(8);
            ((hu6) this.binding).f44887d.setVisibility(0);
        }
        Uri uri = Uri.parse(previewUrl);
        this.f18737c = uri;
        ((hu6) this.binding).f44883F.setText(uri.getLastPathSegment());
        ca5 ca5VarBuild = new ca5.C2249c(getContext()).setRenderersFactory(new zy3(getContext()).setEnableDecoderFallback(true)).setSeekBackIncrementMs(10000L).setSeekForwardIncrementMs(10000L).build();
        this.f18726M = ca5VarBuild;
        ((hu6) this.binding).f44890m.setPlayer(ca5VarBuild);
        ((hu6) this.binding).f44890m.setControllerHideOnTouch(false);
        this.f18726M.setMediaItem(aga.fromUri(this.f18737c));
        this.f18726M.prepare();
        this.f18726M.addListener(new C2816a());
        C2473f.m4168e("AudioFragment", "previewUrl: " + this.f18737c.toString());
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    /* JADX INFO: renamed from: f */
    public void mo4972f(int progress) {
        super.mo4972f(progress);
        if (progress < 0 || progress >= 100) {
            ((hu6) this.binding).f44885b.setVisibility(8);
            ((hu6) this.binding).f44887d.setVisibility(0);
        } else {
            ((hu6) this.binding).f44885b.setVisibility(0);
            ((hu6) this.binding).f44887d.setVisibility(8);
        }
        ((hu6) this.binding).f44882C.setCurrent(progress);
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        this.f18723F = new kbe(((hu6) this.binding).f44888e, 3000L);
        initMListener();
        preview(this.f18736b);
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public hu6 provideViewBinding(ViewGroup viewGroup) {
        return hu6.inflate(getLayoutInflater(), viewGroup, false);
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        kbe kbeVar = this.f18723F;
        if (kbeVar != null) {
            kbeVar.release();
        }
        ca5 ca5Var = this.f18726M;
        if (ca5Var != null) {
            ca5Var.setPlayWhenReady(false);
            this.f18726M.stop();
            this.f18726M.release();
            this.f18726M = null;
        }
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ca5 ca5Var = this.f18726M;
        if (ca5Var != null) {
            ca5Var.setPlayWhenReady(false);
            this.f18724H = false;
            this.f18728Q.setImageResource(C2531R.drawable.ic_control_play);
        }
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    public void updateMedia(String filePath) {
        super.updateMedia(filePath);
        preview(filePath);
    }
}
