package com.eyevue.glassapp.view.guidance;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;
import com.google.android.material.tabs.C3414b;
import com.google.android.material.tabs.TabLayout;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.C10877pb;
import p000.ekg;
import p000.hu8;
import p000.t77;
import p000.u77;
import p000.vfe;
import p000.yp0;
import p000.zai;

/* JADX INFO: loaded from: classes4.dex */
public class NewStudentGuideActivity extends BaseActivity<C10877pb> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(List list, TabLayout.C3407i c3407i, int i) {
        View viewInflate = LayoutInflater.from(this).inflate(C2558R.layout.custom_tab, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(C2558R.id.tab_text)).setText(getString(((ekg) list.get(i)).getDescription()));
        c3407i.setCustomView(viewInflate);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C10877pb getViewBinding() {
        return C10877pb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        boolean z = false;
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        vfe.getInstance().putBoolean("SP_KEY_SHOW_GUIDE_DIALOG", false);
        hu8.setLanguage(this);
        ((C10877pb) this.binding).f70199c.hideBottomLine();
        ((C10877pb) this.binding).f70199c.setTitle(C2531R.string.new_student_guide, this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = t77.f83926e;
        boolean z3 = t77.f83928g;
        boolean z4 = t77.f83927f;
        boolean z5 = t77.f83925d;
        boolean z6 = t77.f83930i;
        boolean z7 = t77.f83931j;
        boolean z8 = t77.f83932k;
        boolean z9 = t77.f83933l;
        boolean z10 = t77.f83929h;
        boolean z11 = u77.f86962f;
        String str = t77.f83939r;
        StringBuilder sb = new StringBuilder();
        sb.append("isQrCode ==========");
        sb.append(str);
        if (TextUtils.isEmpty(str)) {
            z7 = false;
            z10 = false;
            z2 = true;
            z5 = true;
        } else {
            z = z4;
        }
        ekg ekgVar = ekg.GLASSES_PAIR;
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put(ekgVar, bool);
        linkedHashMap.put(ekg.AI_DIALOG, Boolean.valueOf(z2));
        linkedHashMap.put(ekg.TRANSLATOR, Boolean.valueOf(z5));
        if (z) {
            linkedHashMap.put(ekg.PHONE_HEADSET, Boolean.FALSE);
            linkedHashMap.put(ekg.GLASSES_HEADSET, bool);
        } else {
            ekg ekgVar2 = ekg.PHONE_HEADSET;
            Boolean bool2 = Boolean.FALSE;
            linkedHashMap.put(ekgVar2, bool2);
            linkedHashMap.put(ekg.GLASSES_HEADSET, bool2);
        }
        linkedHashMap.put(ekg.SIMULTANEOUS, Boolean.valueOf(z10));
        ekg ekgVar3 = ekg.TEXT_TRANS;
        Boolean bool3 = Boolean.FALSE;
        linkedHashMap.put(ekgVar3, bool3);
        linkedHashMap.put(ekg.DUAL_EAR, bool3);
        linkedHashMap.put(ekg.VOICE_NOTE, Boolean.valueOf(z7));
        linkedHashMap.put(ekg.PHOTO_TRANSLATE, Boolean.valueOf(z8));
        linkedHashMap.put(ekg.AUDIO_VIDEO, Boolean.valueOf(z9));
        final ArrayList<ekg> arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                arrayList.add((ekg) entry.getKey());
            }
        }
        ekg.getTabNameModes(linkedHashMap);
        for (ekg ekgVar4 : arrayList) {
            TabLayout.C3407i c3407iNewTab = ((C10877pb) this.binding).f70198b.newTab();
            View viewInflate = LayoutInflater.from(this).inflate(C2558R.layout.custom_tab, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(C2558R.id.tab_text)).setText(getString(ekgVar4.getDescription()));
            c3407iNewTab.setCustomView(viewInflate);
            ((C10877pb) this.binding).f70198b.addTab(c3407iNewTab);
        }
        ((C10877pb) this.binding).f70200d.setAdapter(new zai(this, arrayList));
        ((C10877pb) this.binding).f70200d.setOffscreenPageLimit(1);
        T t = this.binding;
        new C3414b(((C10877pb) t).f70198b, ((C10877pb) t).f70200d, new C3414b.b() { // from class: tcb
            @Override // com.google.android.material.tabs.C3414b.b
            public final void onConfigureTab(TabLayout.C3407i c3407i, int i) {
                this.f84269a.lambda$initView$0(arrayList, c3407i, i);
            }
        }).attach();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
