package com.watchfun.callvideo.activity;

import android.os.SystemClock;
import android.view.View;
import com.watchfun.callvideo.C4008R;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import im.zego.zegoexpress.ZegoExpressEngine;
import p000.C10914pd;
import p000.l3h;
import p000.o5i;
import p000.s99;

/* JADX INFO: loaded from: classes6.dex */
public class VideoChatActivity extends BaseCallActivity<C10914pd> {

    /* JADX INFO: renamed from: p2 */
    public boolean f25138p2 = true;

    /* JADX INFO: renamed from: q2 */
    public boolean f25139q2 = true;

    private void initCallView() {
        if (this.f25149F.equals("video")) {
            ((C10914pd) this.binding).f70410Q.setVisibility(0);
            ((C10914pd) this.binding).f70415Z1.setVisibility(0);
            ((C10914pd) this.binding).f70406L.setVisibility(0);
        } else {
            ((C10914pd) this.binding).f70410Q.setVisibility(8);
            ((C10914pd) this.binding).f70407M.setVisibility(8);
            ((C10914pd) this.binding).f70415Z1.setVisibility(8);
            ((C10914pd) this.binding).f70406L.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$2(View view) {
        ZegoExpressEngine zegoExpressEngine = this.f25152M;
        if (zegoExpressEngine != null) {
            boolean z = !this.f25138p2;
            this.f25138p2 = z;
            zegoExpressEngine.useFrontCamera(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$3(View view) {
        ZegoExpressEngine zegoExpressEngine = this.f25152M;
        if (zegoExpressEngine != null) {
            boolean z = !this.f25151L;
            this.f25151L = z;
            zegoExpressEngine.muteMicrophone(z);
        }
        if (this.f25151L) {
            ((C10914pd) this.binding).f70419d.setBackgroundResource(C4201R.drawable.ic_video_mic_un);
        } else {
            ((C10914pd) this.binding).f70419d.setBackgroundResource(C4201R.drawable.ic_video_mic);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$4(View view) {
        ZegoExpressEngine zegoExpressEngine = this.f25152M;
        if (zegoExpressEngine != null) {
            boolean z = !this.f25150H;
            this.f25150H = z;
            zegoExpressEngine.muteSpeaker(z);
        }
        if (this.f25150H) {
            ((C10914pd) this.binding).f70420e.setBackgroundResource(C4201R.drawable.ic_video_sound_un);
        } else {
            ((C10914pd) this.binding).f70420e.setBackgroundResource(C4201R.drawable.ic_video_sound);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setButtonEvent$5(View view) {
        this.f25139q2 = !this.f25139q2;
        o5i.getInstance().enableCamera(this.f25139q2);
        if (this.f25139q2) {
            ((C10914pd) this.binding).f70407M.setBackgroundResource(C4201R.drawable.ic_camera_open);
            ((C10914pd) this.binding).f70404F.setVisibility(8);
        } else {
            ((C10914pd) this.binding).f70407M.setBackgroundResource(C4201R.drawable.ic_camera_close);
            ((C10914pd) this.binding).f70404F.setVisibility(0);
        }
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C10914pd) this.binding).f70412X.setAdapter(this.f25156V1);
        ((C10914pd) this.binding).f70412X.setItemAnimator(null);
        ((C10914pd) this.binding).f70412X.setLayoutManager(this.f25160Z1);
        T t = this.binding;
        s99.bindingRecyclerView(((C10914pd) t).f70412X, ((C10914pd) t).f70413Y);
        setButtonEvent();
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: j */
    public void mo7511j() {
        super.mo7511j();
        TransLanguageData transLanguageData = this.f25154N;
        if (transLanguageData != null) {
            ((C10914pd) this.binding).f70417b.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        }
        TransLanguageData transLanguageData2 = this.f25155Q;
        if (transLanguageData2 != null) {
            ((C10914pd) this.binding).f70421f.setText(AiLangUtil.getValue(this, transLanguageData2.getKeyName()));
        }
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: l */
    public void mo7512l(boolean z) {
        super.mo7512l(z);
        if (z) {
            ((C10914pd) this.binding).f70408M1.setVisibility(8);
        } else {
            ((C10914pd) this.binding).f70408M1.setVisibility(0);
            ((C10914pd) this.binding).f70408M1.setText(getString(C4008R.string.string_poor_network));
        }
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: n */
    public void mo7513n(boolean z) {
        super.mo7513n(z);
        if (this.f25149F.equals("video")) {
            if (z) {
                ((C10914pd) this.binding).f70414Z.setVisibility(8);
            } else {
                ((C10914pd) this.binding).f70414Z.setVisibility(0);
                l3h.showToastShort(getString(C4201R.string.string_call_other_close_camera_tip));
            }
        }
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: o */
    public void mo7514o() {
        super.mo7514o();
        o5i.getInstance().enableAudioCaptureDevice(true);
        if (this.f25149F.equals("video")) {
            o5i.getInstance().enableCamera(true);
            o5i.getInstance().startOtherLive(((C10914pd) this.binding).f70415Z1);
            o5i o5iVar = o5i.getInstance();
            T t = this.binding;
            o5iVar.startLive(true, ((C10914pd) t).f70415Z1, ((C10914pd) t).f70410Q);
            ((C10914pd) this.binding).f70407M.setVisibility(0);
        } else {
            o5i.getInstance().enableCamera(false);
            o5i.getInstance().startOtherLive(null);
        }
        ((C10914pd) this.binding).f70411V1.setVisibility(8);
        ((C10914pd) this.binding).f70422m.setVisibility(0);
        ((C10914pd) this.binding).f70422m.setBase(SystemClock.elapsedRealtime());
        ((C10914pd) this.binding).f70422m.start();
        startAsr();
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            ((C10914pd) this.binding).f70422m.stop();
        }
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: p */
    public void mo7515p() {
        super.mo7515p();
        o5i.getInstance().enableAudioCaptureDevice(true);
        if (this.f25149F.equals("video")) {
            o5i.getInstance().enableCamera(true);
            o5i o5iVar = o5i.getInstance();
            T t = this.binding;
            o5iVar.startLive(false, ((C10914pd) t).f70415Z1, ((C10914pd) t).f70410Q);
        } else {
            o5i.getInstance().enableCamera(false);
            o5i.getInstance().startLive(false, null, null);
        }
        initCallView();
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity
    /* JADX INFO: renamed from: q */
    public void mo7516q() {
        super.mo7516q();
        this.f25160Z1.smoothScrollToPosition(((C10914pd) this.binding).f70412X, null, this.f25156V1.getItemCount());
    }

    public void setButtonEvent() {
        ((C10914pd) this.binding).f70418c.setOnClickListener(new View.OnClickListener() { // from class: x5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96836a.lambda$setButtonEvent$0(view);
            }
        });
        ((C10914pd) this.binding).f70405H.setOnClickListener(new View.OnClickListener() { // from class: y5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100454a.lambda$setButtonEvent$1(view);
            }
        });
        ((C10914pd) this.binding).f70406L.setOnClickListener(new View.OnClickListener() { // from class: z5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104274a.lambda$setButtonEvent$2(view);
            }
        });
        ((C10914pd) this.binding).f70419d.setOnClickListener(new View.OnClickListener() { // from class: a6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f519a.lambda$setButtonEvent$3(view);
            }
        });
        ((C10914pd) this.binding).f70420e.setOnClickListener(new View.OnClickListener() { // from class: b6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12823a.lambda$setButtonEvent$4(view);
            }
        });
        ((C10914pd) this.binding).f70407M.setOnClickListener(new View.OnClickListener() { // from class: c6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15884a.lambda$setButtonEvent$5(view);
            }
        });
    }

    @Override // com.watchfun.callvideo.base.BaseCallActivity, com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C10914pd getViewBinding() {
        return C10914pd.inflate(getLayoutInflater());
    }
}
