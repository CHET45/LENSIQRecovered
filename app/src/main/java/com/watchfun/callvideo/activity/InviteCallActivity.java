package com.watchfun.callvideo.activity;

import android.content.Intent;
import android.view.View;
import com.blankj.utilcode.util.NetworkUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.callvideo.base.BaseCallActivity;
import com.watchfun.callvideo.bean.CallAnswerBean;
import com.watchfun.callvideo.bean.CallInviteBean;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import p000.C6187gb;
import p000.a43;
import p000.l3h;
import p000.o5i;
import p000.qc7;
import p000.ufh;
import p000.vfe;

/* JADX INFO: loaded from: classes6.dex */
public class InviteCallActivity extends BaseActivity<C6187gb> {

    /* JADX INFO: renamed from: e */
    public static String f25119e = "call_info";

    /* JADX INFO: renamed from: a */
    public String f25120a;

    /* JADX INFO: renamed from: b */
    public TransLanguageData f25121b;

    /* JADX INFO: renamed from: c */
    public TransLanguageData f25122c;

    /* JADX INFO: renamed from: d */
    public CallInviteBean f25123d;

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.InviteCallActivity$a */
    public class C4009a implements o5i.InterfaceC10201g {
        public C4009a() {
        }

        @Override // p000.o5i.InterfaceC10201g
        public void onCancelCall() {
            InviteCallActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.InviteCallActivity$b */
    public class ViewOnClickListenerC4010b implements View.OnClickListener {
        public ViewOnClickListenerC4010b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InviteCallActivity.this.callAccept();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.activity.InviteCallActivity$c */
    public class ViewOnClickListenerC4011c implements View.OnClickListener {
        public ViewOnClickListenerC4011c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InviteCallActivity.this.callReject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callAccept() {
        if (!NetworkUtils.isConnected()) {
            l3h.showToastShort(getString(C4201R.string.loading_no_net_view_text_hint));
            return;
        }
        o5i.getInstance().sendMessageToOtherUser(qc7.toJson(new CallAnswerBean("1", o5i.f66508s)));
        Intent intent = new Intent(getApplicationContext(), (Class<?>) VideoChatActivity.class);
        intent.putExtra(BaseCallActivity.f25142j2, this.f25123d.getLanguage());
        intent.putExtra(BaseCallActivity.f25146n2, this.f25123d.getType());
        intent.putExtra(BaseCallActivity.f25143k2, this.f25123d.getTargetLanguage());
        intent.putExtra(BaseCallActivity.f25144l2, this.f25123d.getStreamID());
        intent.putExtra(BaseCallActivity.f25145m2, true);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callReject() {
        o5i.getInstance().sendMessageToOtherUser(qc7.toJson(new CallAnswerBean(a43.f347l, o5i.f66508s)));
        finish();
    }

    private void initLanguage() {
        TransLanguageData languageDataByCode = AiLangUtil.getLanguageDataByCode(this, this.f25123d.getLanguage());
        this.f25121b = languageDataByCode;
        if (languageDataByCode == null) {
            this.f25121b = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90973k1));
        }
        TransLanguageData transLanguageData = this.f25121b;
        if (transLanguageData != null) {
            ((C6187gb) this.binding).f39174c.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f25121b = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f25121b.setDefaultName("中文");
            this.f25121b.setSelect(true);
            this.f25121b.setVoiceName("xiaoyan");
            this.f25121b.setIatLanguage("zh-CN");
            this.f25121b.setLangKey("cn");
            this.f25121b.setUseMicTTS(true);
            this.f25121b.setKeyName("zh_name");
            ((C6187gb) this.binding).f39174c.setText(C4201R.string.ai_trans_zh);
            vfe.getInstance().putString(vfe.C14037b.f90973k1, TransLanguageData.toJson(this.f25121b));
        }
        TransLanguageData languageDataByCode2 = AiLangUtil.getLanguageDataByCode(this, this.f25123d.getTargetLanguage());
        this.f25122c = languageDataByCode2;
        if (languageDataByCode2 == null) {
            this.f25122c = AppUtils.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90976l1));
        }
        TransLanguageData transLanguageData3 = this.f25122c;
        if (transLanguageData3 != null) {
            ((C6187gb) this.binding).f39176e.setText(AiLangUtil.getValue(this, transLanguageData3.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData4 = new TransLanguageData();
        this.f25122c = transLanguageData4;
        transLanguageData4.setTransId(2);
        this.f25122c.setDefaultName("English");
        this.f25122c.setSelect(true);
        this.f25122c.setVoiceName("catherine");
        this.f25122c.setIatLanguage("en-US");
        this.f25122c.setLangKey(ufh.f87916c);
        this.f25122c.setKeyName("en_name");
        this.f25122c.setUseMicTTS(true);
        vfe.getInstance().putString(vfe.C14037b.f90976l1, TransLanguageData.toJson(this.f25122c));
        ((C6187gb) this.binding).f39176e.setText(C4201R.string.ai_trans_en);
    }

    private void setStartBarUtil() {
        C4032a.setStatusBarDark(this, vfe.getInstance().getBoolean("THEME_DARK", false), true, false);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6187gb getViewBinding() {
        return C6187gb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        String stringExtra = getIntent().getStringExtra(f25119e);
        this.f25120a = stringExtra;
        CallInviteBean callInviteBean = (CallInviteBean) qc7.fromJson(stringExtra, CallInviteBean.class);
        this.f25123d = callInviteBean;
        if (callInviteBean != null && callInviteBean.getType().equals("video")) {
            ((C6187gb) this.binding).f39169C.setVisibility(0);
            ((C6187gb) this.binding).f39171H.setText(getString(C4201R.string.string_invite_video_tip));
        }
        initLanguage();
        o5i.getInstance().setOnInviteCallCallBack(new C4009a());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        setStartBarUtil();
        ((C6187gb) this.binding).f39173b.setOnClickListener(new ViewOnClickListenerC4010b());
        ((C6187gb) this.binding).f39175d.setOnClickListener(new ViewOnClickListenerC4011c());
    }
}
