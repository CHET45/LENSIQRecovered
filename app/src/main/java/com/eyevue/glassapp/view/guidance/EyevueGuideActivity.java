package com.eyevue.glassapp.view.guidance;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C4719db;
import p000.InterfaceC14278vw;
import p000.a77;
import p000.cn8;
import p000.e4e;
import p000.hh3;
import p000.hib;
import p000.jmg;
import p000.ne4;
import p000.pj4;
import p000.t77;
import p000.t94;
import p000.yp0;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueGuideActivity extends BaseActivity<C4719db> {

    /* JADX INFO: renamed from: L */
    public boolean f18576L;

    /* JADX INFO: renamed from: M */
    public boolean f18577M;

    /* JADX INFO: renamed from: M1 */
    public boolean f18578M1;

    /* JADX INFO: renamed from: N */
    public boolean f18579N;

    /* JADX INFO: renamed from: Q */
    public cn8 f18580Q;

    /* JADX INFO: renamed from: X */
    public boolean f18581X;

    /* JADX INFO: renamed from: a */
    public final String f18584a = "EyevueGuideActivity";

    /* JADX INFO: renamed from: b */
    public final int f18585b = 0;

    /* JADX INFO: renamed from: c */
    public final int f18586c = 1;

    /* JADX INFO: renamed from: d */
    public final int f18587d = 2;

    /* JADX INFO: renamed from: e */
    public final int f18588e = 3;

    /* JADX INFO: renamed from: f */
    public final int f18589f = 7;

    /* JADX INFO: renamed from: m */
    public final int f18590m = 4;

    /* JADX INFO: renamed from: C */
    public final int f18573C = 5;

    /* JADX INFO: renamed from: F */
    public final int f18574F = 6;

    /* JADX INFO: renamed from: H */
    public int f18575H = 0;

    /* JADX INFO: renamed from: Y */
    public boolean f18582Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f18583Z = false;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$a */
    public class C2772a implements ModBleResponse.OnVolumeStatusListener {
        public C2772a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVolumeDown$1() {
            EyevueGuideActivity.this.stepSuccessView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVolumeUp$0() {
            EyevueGuideActivity.this.stepSuccessView();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnVolumeStatusListener
        public void onVolumeDown() {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 5) {
                eyevueGuideActivity.f18579N = true;
                if (EyevueGuideActivity.this.f18577M) {
                    EyevueGuideActivity.this.playFinishAnim(new InterfaceC2786o() { // from class: an5
                        @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                        public final void onAninFinish() {
                            this.f2144a.lambda$onVolumeDown$1();
                        }
                    });
                }
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnVolumeStatusListener
        public void onVolumeUp() {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 5) {
                eyevueGuideActivity.f18577M = true;
                if (EyevueGuideActivity.this.f18579N) {
                    EyevueGuideActivity.this.playFinishAnim(new InterfaceC2786o() { // from class: bn5
                        @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                        public final void onAninFinish() {
                            this.f14189a.lambda$onVolumeUp$0();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$b */
    public class C2773b implements ModBleResponse.OnCustomerListener {
        public C2773b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCustomer$0(String str, String str2) {
            zi9.m26855i("EyevueGuideActivity", str + ":::" + str2);
            if (str.contains(t94.f84017b) || str.contains(t94.f84018c)) {
                EyevueGuideActivity.this.f18582Y = true;
                ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses_sun);
            } else if (!str.contains(t94.f84019d) && !str.contains(t94.f84020e)) {
                ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses);
            } else {
                EyevueGuideActivity.this.f18583Z = true;
                ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnCustomerListener
        public void onCustomer(final String customer, final String project) {
            if (TextUtils.isEmpty(customer)) {
                return;
            }
            C2478k.runOnUiThread(new Runnable() { // from class: cn5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17067a.lambda$onCustomer$0(customer, project);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$c */
    public class ViewOnClickListenerC2774c implements View.OnClickListener {
        public ViewOnClickListenerC2774c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29161Y.setVisibility(8);
            ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29162Z.seekTo(0);
            ((C4719db) ((BaseActivity) EyevueGuideActivity.this).binding).f29162Z.start();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$d */
    public class C2775d implements e4e<GifDrawable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2786o f18594a;

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$d$a */
        public class a extends InterfaceC14278vw.a {
            public a() {
            }

            @Override // p000.InterfaceC14278vw.a
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                EyevueGuideActivity.this.f18581X = false;
                InterfaceC2786o interfaceC2786o = C2775d.this.f18594a;
                if (interfaceC2786o != null) {
                    interfaceC2786o.onAninFinish();
                }
            }
        }

        public C2775d(final InterfaceC2786o val$onAnimFinishListener) {
            this.f18594a = val$onAnimFinishListener;
        }

        @Override // p000.e4e
        public boolean onLoadFailed(@hib a77 e, Object model, jmg<GifDrawable> target, boolean isFirstResource) {
            return false;
        }

        @Override // p000.e4e
        public boolean onResourceReady(GifDrawable resource, Object model, jmg<GifDrawable> target, hh3 dataSource, boolean isFirstResource) {
            resource.setLoopCount(1);
            resource.start();
            resource.registerAnimationCallback(new a());
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$e */
    public class C2776e implements cn8.InterfaceC2406c {
        public C2776e() {
        }

        @Override // p000.cn8.InterfaceC2406c
        public void onAgree() {
            EyevueGuideActivity.this.finish();
        }

        @Override // p000.cn8.InterfaceC2406c
        public void onDisagree() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$f */
    public class ViewOnClickListenerC2777f implements View.OnClickListener {
        public ViewOnClickListenerC2777f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueGuideActivity.this.showJumpDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$g */
    public class ViewOnClickListenerC2778g implements View.OnClickListener {
        public ViewOnClickListenerC2778g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            int i = eyevueGuideActivity.f18575H;
            if (i == 1) {
                eyevueGuideActivity.stepTakePhotoView();
                return;
            }
            if (i == 2) {
                eyevueGuideActivity.stepTakeVideoView();
                return;
            }
            if (i == 3) {
                eyevueGuideActivity.stepTakeAudioView();
                return;
            }
            if (i == 7) {
                eyevueGuideActivity.stepPlayOrStopView();
            } else if (i == 4) {
                eyevueGuideActivity.stepVolumeView();
            } else if (i == 5) {
                eyevueGuideActivity.stepSuccessView();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$h */
    public class ViewOnClickListenerC2779h implements View.OnClickListener {
        public ViewOnClickListenerC2779h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueGuideActivity.this.stepTakePhotoView();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$i */
    public class ViewOnClickListenerC2780i implements View.OnClickListener {
        public ViewOnClickListenerC2780i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueGuideActivity.this.stepStartView();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$j */
    public class ViewOnClickListenerC2781j implements View.OnClickListener {
        public ViewOnClickListenerC2781j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueGuideActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$k */
    public class C2782k implements ModBleResponse.OnTakePhotoStatusListener {
        public C2782k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTakePhotoState$0() {
            EyevueGuideActivity.this.stepTakeVideoView();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakePhotoStatusListener
        public void onTakePhotoState(boolean isTakePhoto) {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 2 && isTakePhoto) {
                eyevueGuideActivity.playFinishAnim(new InterfaceC2786o() { // from class: dn5
                    @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                    public final void onAninFinish() {
                        this.f30186a.lambda$onTakePhotoState$0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$l */
    public class C2783l implements ModBleResponse.OnTakeVideoStatusListener {
        public C2783l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTakeVideoState$0() {
            EyevueGuideActivity.this.stepTakeAudioView();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakeVideoStatusListener
        public void onTakeVideoState(boolean isTakeVideo) {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 3) {
                if (isTakeVideo) {
                    eyevueGuideActivity.f18576L = true;
                }
                if (!EyevueGuideActivity.this.f18576L || isTakeVideo) {
                    return;
                }
                EyevueGuideActivity.this.playFinishAnim(new InterfaceC2786o() { // from class: en5
                    @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                    public final void onAninFinish() {
                        this.f33584a.lambda$onTakeVideoState$0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$m */
    public class C2784m implements ModBleResponse.OnTakeAudioStatusListener {
        public C2784m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTakeAudioState$0() {
            EyevueGuideActivity.this.stepPlayOrStopView();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnTakeAudioStatusListener
        public void onTakeAudioState(boolean isTakeAudio) {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 7) {
                if (isTakeAudio) {
                    eyevueGuideActivity.f18578M1 = true;
                }
                if (!EyevueGuideActivity.this.f18578M1 || isTakeAudio) {
                    return;
                }
                EyevueGuideActivity.this.playFinishAnim(new InterfaceC2786o() { // from class: fn5
                    @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                    public final void onAninFinish() {
                        this.f37147a.lambda$onTakeAudioState$0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$n */
    public class C2785n implements ModBleResponse.OnPlayOrStopStatusListener {
        public C2785n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPlayOrStopState$0() {
            EyevueGuideActivity.this.stepVolumeView();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnPlayOrStopStatusListener
        public void onPlayOrStopState(boolean isPlayOrStop) {
            EyevueGuideActivity eyevueGuideActivity = EyevueGuideActivity.this;
            if (eyevueGuideActivity.f18575H == 4) {
                eyevueGuideActivity.playFinishAnim(new InterfaceC2786o() { // from class: gn5
                    @Override // com.eyevue.glassapp.view.guidance.EyevueGuideActivity.InterfaceC2786o
                    public final void onAninFinish() {
                        this.f40334a.lambda$onPlayOrStopState$0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.EyevueGuideActivity$o */
    public interface InterfaceC2786o {
        void onAninFinish();
    }

    private void init() {
        stepStartView();
    }

    private void initListener() {
        ((C4719db) this.binding).f29164b.setOnClickListener(new ViewOnClickListenerC2777f());
        ((C4719db) this.binding).f29166d.setOnClickListener(new ViewOnClickListenerC2778g());
        ((C4719db) this.binding).f29168f.setOnClickListener(new ViewOnClickListenerC2779h());
        ((C4719db) this.binding).f29167e.setOnClickListener(new ViewOnClickListenerC2780i());
        ((C4719db) this.binding).f29165c.setOnClickListener(new ViewOnClickListenerC2781j());
        ModUtils.modBleResponse().setOnTakePhotoStatusListener(new C2782k());
        ModUtils.modBleResponse().setOnTakeVideoStatusListener(new C2783l());
        ModUtils.modBleResponse().setOnTakeAudioStatusListener(new C2784m());
        ModUtils.modBleResponse().setOnPlayOrStopStatusListener(new C2785n());
        ModUtils.modBleResponse().setOnVolumeStatusListener(new C2772a());
        ModUtils.modBleResponse().setOnCustomerListener(new C2773b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playFinishAnim$10(InterfaceC2786o interfaceC2786o) {
        if (isDestroyed() || this.f18581X) {
            return;
        }
        this.f18581X = true;
        ((C4719db) this.binding).f29152C.setVisibility(0);
        ComponentCallbacks2C2485a.with(((C4719db) this.binding).f29152C.getContext()).clear(((C4719db) this.binding).f29152C);
        ((C4719db) this.binding).f29152C.setImageDrawable(null);
        ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C2531R.drawable.step_finish)).diskCacheStrategy(ne4.f64118b).skipMemoryCache(true).listener(new C2775d(interfaceC2786o)).into(((C4719db) this.binding).f29152C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideo$8(MediaPlayer mediaPlayer) {
        mediaPlayer.setVideoScalingMode(2);
        ((C4719db) this.binding).f29162Z.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideo$9(MediaPlayer mediaPlayer) {
        C2473f.m4167d("CommonFragment", "Video completed");
        ((C4719db) this.binding).f29161Y.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepPlayOrStopView$5() {
        this.f18575H = 4;
        ((C4719db) this.binding).f29160X.setText(getString(C2531R.string.string_single_touch));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_single_touch_music_tip));
        ((C4719db) this.binding).f29159Q.setVisibility(8);
        ((C4719db) this.binding).f29169m.setVisibility(8);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
        if (this.f18582Y) {
            playVideo("glasses_play_or_stop_sun");
        } else if (this.f18583Z) {
            playVideo("glasses_play_or_stop_s100");
        } else {
            playVideo("glasses_play_or_stop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepReadyView$0() {
        ((C4719db) this.binding).f29160X.setText(getString(C2531R.string.string_pleas_wear_glasses));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_smart_glasses_start_title));
        ((C4719db) this.binding).f29159Q.setVisibility(8);
        ((C4719db) this.binding).f29162Z.setVisibility(8);
        ((C4719db) this.binding).f29161Y.setVisibility(8);
        ((C4719db) this.binding).f29169m.setVisibility(0);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29154H.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepStartView$1() {
        this.f18575H = 1;
        ((C4719db) this.binding).f29160X.setText(getString(C2531R.string.string_pleas_wear_glasses));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_smart_glasses_start_title));
        ((C4719db) this.binding).f29162Z.setVisibility(8);
        ((C4719db) this.binding).f29169m.setVisibility(0);
        ((C4719db) this.binding).f29168f.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29155L.setVisibility(8);
        ((C4719db) this.binding).f29166d.setVisibility(0);
        ((C4719db) this.binding).f29164b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepSuccessView$7() {
        this.f18575H = 6;
        ((C4719db) this.binding).f29155L.setVisibility(0);
        ((C4719db) this.binding).f29166d.setVisibility(8);
        ((C4719db) this.binding).f29164b.setVisibility(8);
        ((C4719db) this.binding).f29159Q.setText("");
        ((C4719db) this.binding).f29158N.setText("");
        ((C4719db) this.binding).f29160X.setText("");
        ((C4719db) this.binding).f29161Y.setVisibility(8);
        ((C4719db) this.binding).f29169m.setVisibility(0);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(8);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepTakeAudioView$4() {
        this.f18575H = 7;
        ((C4719db) this.binding).f29160X.setText(getString((this.f18582Y || this.f18583Z) ? C2531R.string.string_click_to_take_audio_sun : C2531R.string.string_click_to_take_audio));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_record));
        ((C4719db) this.binding).f29159Q.setText(getString(C2531R.string.string_take_video_tip));
        ((C4719db) this.binding).f29159Q.setVisibility(0);
        ((C4719db) this.binding).f29169m.setVisibility(8);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
        if (this.f18582Y) {
            playVideo("glasses_take_audio_sun");
        } else if (this.f18583Z) {
            playVideo("glasses_take_audio_s100");
        } else {
            playVideo("glasses_take_audio");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepTakePhotoView$2() {
        this.f18575H = 2;
        ((C4719db) this.binding).f29160X.setText(getString(C2531R.string.string_click_to_take_photo));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_take_photo));
        ((C4719db) this.binding).f29159Q.setText(getString(C2531R.string.string_take_photo_tip));
        ((C4719db) this.binding).f29159Q.setVisibility(0);
        ((C4719db) this.binding).f29169m.setVisibility(8);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
        if (this.f18582Y) {
            playVideo("glasses_take_photo_sun");
        } else if (this.f18583Z) {
            playVideo("glasses_take_photo_s100");
        } else {
            playVideo("glasses_take_photo");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepTakeVideoView$3() {
        this.f18575H = 3;
        ((C4719db) this.binding).f29160X.setText(getString((this.f18582Y || this.f18583Z) ? C2531R.string.string_click_to_take_video_sun : C2531R.string.string_click_to_take_video));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_take_video));
        ((C4719db) this.binding).f29159Q.setText(getString(C2531R.string.string_take_video_tip));
        ((C4719db) this.binding).f29159Q.setVisibility(0);
        ((C4719db) this.binding).f29169m.setVisibility(8);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
        if (this.f18582Y) {
            playVideo("glasses_take_video_sun");
        } else if (this.f18583Z) {
            playVideo("glasses_take_video_s100");
        } else {
            playVideo("glasses_take_video");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stepVolumeView$6() {
        this.f18575H = 5;
        ((C4719db) this.binding).f29160X.setText(getString(C2531R.string.string_swipe_touch));
        ((C4719db) this.binding).f29158N.setText(getString(C2531R.string.string_swipe_touch_sound_tip));
        ((C4719db) this.binding).f29159Q.setVisibility(8);
        ((C4719db) this.binding).f29169m.setVisibility(8);
        ((C4719db) this.binding).f29168f.setVisibility(4);
        ((C4719db) this.binding).f29162Z.setVisibility(0);
        ((C4719db) this.binding).f29154H.setVisibility(8);
        ((C4719db) this.binding).f29152C.setVisibility(4);
        if (this.f18582Y) {
            playVideo("glasses_sound_sun");
        } else if (this.f18583Z) {
            playVideo("glasses_sound_s100");
        } else {
            playVideo("glasses_sound");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFinishAnim(final InterfaceC2786o onAnimFinishListener) {
        runOnUiThread(new Runnable() { // from class: qm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f74914a.lambda$playFinishAnim$10(onAnimFinishListener);
            }
        });
    }

    private void playVideo(String mp4Name) {
        ((C4719db) this.binding).f29161Y.setVisibility(8);
        int identifier = getResources().getIdentifier(mp4Name, "raw", getPackageName());
        if (identifier == 0) {
            C2473f.m4168e("CommonFragment", "Resource not found for video: connect_guide");
            return;
        }
        ((C4719db) this.binding).f29162Z.setVideoURI(Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + identifier));
        ((C4719db) this.binding).f29162Z.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: tm5
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.f85309a.lambda$playVideo$8(mediaPlayer);
            }
        });
        ((C4719db) this.binding).f29162Z.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: um5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f88480a.lambda$playVideo$9(mediaPlayer);
            }
        });
        ((C4719db) this.binding).f29161Y.setOnClickListener(new ViewOnClickListenerC2774c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showJumpDialog() {
        if (this.f18580Q == null) {
            this.f18580Q = new cn8(this, new C2776e());
        }
        cn8 cn8Var = this.f18580Q;
        if (cn8Var == null || cn8Var.isShowing()) {
            return;
        }
        this.f18580Q.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepPlayOrStopView() {
        runOnUiThread(new Runnable() { // from class: xm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f98497a.lambda$stepPlayOrStopView$5();
            }
        });
    }

    private void stepReadyView() {
        runOnUiThread(new Runnable() { // from class: pm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f71382a.lambda$stepReadyView$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepStartView() {
        runOnUiThread(new Runnable() { // from class: ym5
            @Override // java.lang.Runnable
            public final void run() {
                this.f102059a.lambda$stepStartView$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepSuccessView() {
        runOnUiThread(new Runnable() { // from class: zm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f105474a.lambda$stepSuccessView$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepTakeAudioView() {
        runOnUiThread(new Runnable() { // from class: rm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f78719a.lambda$stepTakeAudioView$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepTakePhotoView() {
        runOnUiThread(new Runnable() { // from class: vm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f91726a.lambda$stepTakePhotoView$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepTakeVideoView() {
        runOnUiThread(new Runnable() { // from class: wm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f94734a.lambda$stepTakeVideoView$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepVolumeView() {
        runOnUiThread(new Runnable() { // from class: sm5
            @Override // java.lang.Runnable
            public final void run() {
                this.f82225a.lambda$stepVolumeView$6();
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public C4719db getViewBinding() {
        return C4719db.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initListener();
        init();
        if (t77.f83922a.contains(t94.f84017b) || t77.f83922a.contains(t94.f84018c)) {
            this.f18582Y = true;
            ((C4719db) this.binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses_sun);
        } else if (t77.f83922a.contains(t94.f84019d) || t77.f83922a.contains(t94.f84020e)) {
            this.f18583Z = true;
            ((C4719db) this.binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses_s100);
        } else {
            ((C4719db) this.binding).f29153F.setImageResource(C2531R.drawable.ic_guide_glasses);
        }
        ModUtils.sendViaBle().getCustomer();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }
}
