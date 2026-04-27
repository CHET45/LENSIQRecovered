package p000;

import com.watchfun.transcommon.bean.photo.PhotoTransBean;

/* JADX INFO: loaded from: classes7.dex */
public interface avc {

    /* JADX INFO: renamed from: avc$a */
    public interface InterfaceC1619a extends jt0<InterfaceC1620b> {
        void refreshData();
    }

    /* JADX INFO: renamed from: avc$b */
    public interface InterfaceC1620b extends wu0 {
        void loadFail();

        void onDisposable(mf4 mf4Var);

        void setDataSuccess(PhotoTransBean photoTransBean, boolean z);
    }
}
