package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: loaded from: classes3.dex */
public class C9165m7 {

    /* JADX INFO: renamed from: b */
    public static final int f60040b = -1;

    /* JADX INFO: renamed from: a */
    @hib
    public final Object f60041a;

    /* JADX INFO: renamed from: m7$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C9165m7 f60042a;

        public a(C9165m7 c9165m7) {
            this.f60042a = c9165m7;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C6730h7 c6730h7CreateAccessibilityNodeInfo = this.f60042a.createAccessibilityNodeInfo(i);
            if (c6730h7CreateAccessibilityNodeInfo == null) {
                return null;
            }
            return c6730h7CreateAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C6730h7> listFindAccessibilityNodeInfosByText = this.f60042a.findAccessibilityNodeInfosByText(str, i);
            if (listFindAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listFindAccessibilityNodeInfosByText.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listFindAccessibilityNodeInfosByText.get(i2).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C6730h7 c6730h7FindFocus = this.f60042a.findFocus(i);
            if (c6730h7FindFocus == null) {
                return null;
            }
            return c6730h7FindFocus.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f60042a.performAction(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: m7$b */
    @c5e(26)
    public static class b extends a {
        public b(C9165m7 c9165m7) {
            super(c9165m7);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f60042a.addExtraDataToAccessibilityNodeInfo(i, C6730h7.wrap(accessibilityNodeInfo), str, bundle);
        }
    }

    public C9165m7() {
        this.f60041a = new b(this);
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, @efb C6730h7 c6730h7, @efb String str, @hib Bundle bundle) {
    }

    @hib
    public C6730h7 createAccessibilityNodeInfo(int i) {
        return null;
    }

    @hib
    public List<C6730h7> findAccessibilityNodeInfosByText(@efb String str, int i) {
        return null;
    }

    @hib
    public C6730h7 findFocus(int i) {
        return null;
    }

    @hib
    public Object getProvider() {
        return this.f60041a;
    }

    public boolean performAction(int i, int i2, @hib Bundle bundle) {
        return false;
    }

    public C9165m7(@hib Object obj) {
        this.f60041a = obj;
    }
}
