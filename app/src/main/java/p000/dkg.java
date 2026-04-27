package p000;

import android.widget.TabHost;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class dkg {

    /* JADX INFO: renamed from: dkg$a */
    public class C4833a implements TabHost.OnTabChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TabHost.OnTabChangeListener f29893a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f29894b;

        public C4833a(TabHost.OnTabChangeListener onTabChangeListener, me8 me8Var) {
            this.f29893a = onTabChangeListener;
            this.f29894b = me8Var;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f29893a;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f29894b.onChange();
        }
    }

    @le8(attribute = "android:currentTab")
    public static int getCurrentTab(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @le8(attribute = "android:currentTab")
    public static String getCurrentTabTag(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @q21({"android:currentTab"})
    public static void setCurrentTab(TabHost tabHost, int i) {
        if (tabHost.getCurrentTab() != i) {
            tabHost.setCurrentTab(i);
        }
    }

    @q21({"android:currentTab"})
    public static void setCurrentTabTag(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    @q21(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void setListeners(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, me8 me8Var) {
        if (me8Var == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new C4833a(onTabChangeListener, me8Var));
        }
    }
}
