package com.eyevue.glassapp.view.translate.textmodel;

import android.view.View;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import p000.C5678f9;
import p000.qt2;
import p000.ufh;
import p000.vfe;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueTextTransActivity extends BaseActivity<C5678f9> {

    /* JADX INFO: renamed from: a */
    public TransLanguageData f19315a;

    /* JADX INFO: renamed from: b */
    public TransLanguageData f19316b;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$a */
    public class ViewOnClickListenerC2965a implements View.OnClickListener {
        public ViewOnClickListenerC2965a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueTextTransActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$b */
    public class ViewOnClickListenerC2966b implements View.OnClickListener {
        public ViewOnClickListenerC2966b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$c */
    public class ViewOnClickListenerC2967c implements View.OnClickListener {
        public ViewOnClickListenerC2967c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$d */
    public class ViewOnClickListenerC2968d implements View.OnClickListener {
        public ViewOnClickListenerC2968d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$e */
    public class ViewOnClickListenerC2969e implements View.OnClickListener {
        public ViewOnClickListenerC2969e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$f */
    public class ViewOnClickListenerC2970f implements View.OnClickListener {
        public ViewOnClickListenerC2970f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.textmodel.EyevueTextTransActivity$g */
    public class ViewOnClickListenerC2971g implements View.OnClickListener {
        public ViewOnClickListenerC2971g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    private void initLanguage() {
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString(qt2.f75580d));
        this.f19315a = transLanguageData;
        if (transLanguageData != null) {
            ((C5678f9) this.binding).f35725d.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f19315a = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f19315a.setDefaultName("中文");
            this.f19315a.setSelect(true);
            this.f19315a.setVoiceName("xiaoyan");
            this.f19315a.setIatLanguage("zh-CN");
            this.f19315a.setLangKey("cn");
            this.f19315a.setKeyName("zh_name");
            this.f19315a.setUseMicTTS(true);
            vfe.getInstance().putString(qt2.f75580d, TransLanguageData.toJson(this.f19315a));
            ((C5678f9) this.binding).f35725d.setText(AiLangUtil.getValue(this, this.f19315a.getKeyName()));
        }
        TransLanguageData transLanguageData3 = AppUtils.getTransLanguageData(vfe.getInstance().getString(qt2.f75581e));
        this.f19316b = transLanguageData3;
        if (transLanguageData3 != null) {
            ((C5678f9) this.binding).f35728m.setText(AiLangUtil.getValue(this, transLanguageData3.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData4 = new TransLanguageData();
        this.f19316b = transLanguageData4;
        transLanguageData4.setTransId(2);
        this.f19316b.setDefaultName("English");
        this.f19316b.setSelect(true);
        this.f19316b.setVoiceName("catherine");
        this.f19316b.setIatLanguage("en-US");
        this.f19316b.setLangKey(ufh.f87916c);
        this.f19316b.setKeyName("en_name");
        this.f19316b.setUseMicTTS(true);
        vfe.getInstance().putString(qt2.f75581e, TransLanguageData.toJson(this.f19316b));
        ((C5678f9) this.binding).f35728m.setText(AiLangUtil.getValue(this, this.f19316b.getKeyName()));
    }

    private void setListener() {
        ((C5678f9) this.binding).f35715F.setOnClickListener(new ViewOnClickListenerC2965a());
        ((C5678f9) this.binding).f35725d.setOnClickListener(new ViewOnClickListenerC2966b());
        ((C5678f9) this.binding).f35728m.setOnClickListener(new ViewOnClickListenerC2967c());
        ((C5678f9) this.binding).f35727f.setOnClickListener(new ViewOnClickListenerC2968d());
        ((C5678f9) this.binding).f35723b.setOnClickListener(new ViewOnClickListenerC2969e());
        ((C5678f9) this.binding).f35724c.setOnClickListener(new ViewOnClickListenerC2970f());
        ((C5678f9) this.binding).f35726e.setOnClickListener(new ViewOnClickListenerC2971g());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5678f9 getViewBinding() {
        return C5678f9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        setListener();
        initLanguage();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initLanguage();
    }
}
