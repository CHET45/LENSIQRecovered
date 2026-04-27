package com.eyevue.glassapp.view.guidance;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.ProjectInfoBean;
import com.eyevue.common.bean.VoiceSettingItem;
import com.watchfun.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import p000.C12521sd;
import p000.u77;
import p000.xfi;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueVoiceAssistantActivity extends BaseActivity<C12521sd> {

    /* JADX INFO: renamed from: a */
    public List<VoiceSettingItem> f18607a = new ArrayList();

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C12521sd getViewBinding() {
        return C12521sd.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        yp0.setStatusBarLightMode((Activity) this, false);
        ((C12521sd) this.binding).f81245c.setTitle(getString(C2531R.string.string_setting_ai));
        ((C12521sd) this.binding).f81246d.setText(u77.f86953A);
        ((C12521sd) this.binding).f81244b.setLayoutManager(new LinearLayoutManager(this));
        List<ProjectInfoBean.OfflineCommand> list = u77.f86982z;
        if (list != null) {
            for (ProjectInfoBean.OfflineCommand offlineCommand : list) {
                this.f18607a.add(new VoiceSettingItem(offlineCommand.getItems().get(0), offlineCommand.getItems().get(1)));
            }
        }
        ((C12521sd) this.binding).f81244b.setAdapter(new xfi(this, this.f18607a));
    }
}
