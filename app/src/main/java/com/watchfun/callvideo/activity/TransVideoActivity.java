package com.watchfun.callvideo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.NetworkUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.callvideo.VideoTalkAppParamVO;
import com.watchfun.transcommon.bean.callvideo.VideoTalkBean;
import com.watchfun.transcommon.dialog.CustomLoadingDialog;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import p000.C8288kd;
import p000.l3h;
import p000.o5i;
import p000.u5i;
import p000.ufh;
import p000.vfe;
import p000.w5i;

/* JADX INFO: loaded from: classes6.dex */
public class TransVideoActivity extends BaseActivity<C8288kd> implements u5i.InterfaceC13373b {

    /* JADX INFO: renamed from: C */
    public CustomLoadingDialog f25127C;

    /* JADX INFO: renamed from: a */
    public TransLanguageData f25128a;

    /* JADX INFO: renamed from: b */
    public TransLanguageData f25129b;

    /* JADX INFO: renamed from: c */
    public final int f25130c = 0;

    /* JADX INFO: renamed from: d */
    public final int f25131d = 1;

    /* JADX INFO: renamed from: e */
    public int f25132e = 0;

    /* JADX INFO: renamed from: f */
    public w5i f25133f;

    /* JADX INFO: renamed from: m */
    public String f25134m;

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.TransVideoActivity$a */
    public class ViewOnClickListenerC4012a implements View.OnClickListener {
        public ViewOnClickListenerC4012a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TransVideoActivity.this.startToSelectTransActivity(((C8288kd) ((BaseActivity) TransVideoActivity.this).binding).f53629e.getText().toString(), ((C8288kd) ((BaseActivity) TransVideoActivity.this).binding).f53631m.getText().toString(), 1);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.TransVideoActivity$b */
    public class ViewOnClickListenerC4013b implements View.OnClickListener {
        public ViewOnClickListenerC4013b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TransVideoActivity.this.startToSelectTransActivity(((C8288kd) ((BaseActivity) TransVideoActivity.this).binding).f53631m.getText().toString(), ((C8288kd) ((BaseActivity) TransVideoActivity.this).binding).f53629e.getText().toString(), 2);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.TransVideoActivity$c */
    public class ViewOnClickListenerC4014c implements View.OnClickListener {
        public ViewOnClickListenerC4014c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TransVideoActivity.this.finish();
        }
    }

    private void initLanguage() {
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90973k1));
        this.f25128a = transLanguageData;
        if (transLanguageData != null) {
            ((C8288kd) this.binding).f53629e.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f25128a = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f25128a.setDefaultName("中文");
            this.f25128a.setSelect(true);
            this.f25128a.setVoiceName("xiaoyan");
            this.f25128a.setIatLanguage("zh-CN");
            this.f25128a.setLangKey("cn");
            this.f25128a.setKeyName("zh_name");
            this.f25128a.setUseMicTTS(true);
            ((C8288kd) this.binding).f53629e.setText(C4201R.string.ai_trans_zh);
            vfe.getInstance().putString(vfe.C14037b.f90973k1, TransLanguageData.toJson(this.f25128a));
        }
        TransLanguageData transLanguageData3 = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90976l1));
        this.f25129b = transLanguageData3;
        if (transLanguageData3 != null) {
            ((C8288kd) this.binding).f53631m.setText(AiLangUtil.getValue(this, transLanguageData3.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData4 = new TransLanguageData();
        this.f25129b = transLanguageData4;
        transLanguageData4.setTransId(2);
        this.f25129b.setDefaultName("English");
        this.f25129b.setSelect(true);
        this.f25129b.setVoiceName("catherine");
        this.f25129b.setIatLanguage("en-US");
        this.f25129b.setLangKey(ufh.f87916c);
        this.f25129b.setKeyName("en_name");
        this.f25129b.setUseMicTTS(true);
        vfe.getInstance().putString(vfe.C14037b.f90976l1, TransLanguageData.toJson(this.f25129b));
        ((C8288kd) this.binding).f53631m.setText(C4201R.string.ai_trans_en);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        if (!NetworkUtils.isConnected()) {
            l3h.showToastShort(getString(C4201R.string.loading_no_net_view_text_hint));
            return;
        }
        if (this.f25132e == 0) {
            this.f25134m = "video";
        } else {
            this.f25134m = "audio";
        }
        this.f25133f.loadData(new VideoTalkBean(o5i.getInstance().getUserID(), o5i.getInstance().getRoomID(), o5i.getInstance().getPublishStreamID(), this.f25134m, "1.0.0", this.f25128a.getIatLanguage(), this.f25129b.getIatLanguage()));
        showLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        ((C8288kd) this.binding).f53627c.setBackgroundResource(C4201R.drawable.bg_selected_purple_10_shape);
        ((C8288kd) this.binding).f53626b.setBackgroundColor(0);
        this.f25132e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        ((C8288kd) this.binding).f53627c.setBackgroundColor(0);
        ((C8288kd) this.binding).f53626b.setBackgroundResource(C4201R.drawable.bg_selected_purple_10_shape);
        this.f25132e = 1;
    }

    private void setStartBarUtil() {
        C4032a.setStatusBarDark(this, vfe.getInstance().getBoolean("THEME_DARK", false), true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startToSelectTransActivity(String str, String str2, int i) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, str);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, str2);
        bundle.putInt(SelectTransActivity.KEY_TYPE, i);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, TransActionEnumMode.VIDEO_AUDIO_TYPE.getCode());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void dismissLoadingDialog() {
        CustomLoadingDialog customLoadingDialog = this.f25127C;
        if (customLoadingDialog != null) {
            customLoadingDialog.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        o5i.getInstance().initEngine();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        setStartBarUtil();
        this.f25133f = new w5i(this);
        ((C8288kd) this.binding).f53624L.setText(getString(C4201R.string.trans_video_or_audio_tip));
        ((C8288kd) this.binding).f53630f.setOnClickListener(new View.OnClickListener() { // from class: wch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93954a.lambda$initView$0(view);
            }
        });
        ((C8288kd) this.binding).f53621C.setOnClickListener(new View.OnClickListener() { // from class: xch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97530a.lambda$initView$1(view);
            }
        });
        ((C8288kd) this.binding).f53628d.setOnClickListener(new View.OnClickListener() { // from class: ych
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101130a.lambda$initView$2(view);
            }
        });
        ((C8288kd) this.binding).f53629e.setOnClickListener(new ViewOnClickListenerC4012a());
        ((C8288kd) this.binding).f53631m.setOnClickListener(new ViewOnClickListenerC4013b());
        ((C8288kd) this.binding).f53622F.setOnClickListener(new ViewOnClickListenerC4014c());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C8288kd getViewBinding() {
        return C8288kd.inflate(getLayoutInflater());
    }

    @Override // p000.u5i.InterfaceC13373b
    public void loadFail(int i, String str) {
        dismissLoadingDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            o5i.getInstance().destroyEngine();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initLanguage();
    }

    @Override // p000.u5i.InterfaceC13373b
    public void setDataSuccess(VideoTalkAppParamVO videoTalkAppParamVO, boolean z) {
        dismissLoadingDialog();
        if (TextUtils.isEmpty(videoTalkAppParamVO.getHostUrl())) {
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) VideoChatActivity.class);
        if (this.f25132e == 0) {
            intent.putExtra(BaseCallActivity.f25146n2, "video");
        } else {
            intent.putExtra(BaseCallActivity.f25146n2, "audio");
        }
        intent.putExtra(BaseCallActivity.f25147o2, videoTalkAppParamVO.getHostUrl());
        l3h.showToastShort(getString(C4201R.string.string_copy));
        startActivity(intent);
    }

    public void showLoadingDialog() {
        if (this.f25127C == null) {
            this.f25127C = new CustomLoadingDialog(this);
        }
        this.f25127C.show();
    }
}
