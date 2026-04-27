package p000;

import com.eyevue.common.bean.guid.NewGuidBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ad7 {

    /* JADX INFO: renamed from: ad7$a */
    public interface InterfaceC0178a extends wu0 {
        void onGetRecListSuccess(List<NewGuidBean> list, boolean hasMore, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: ad7$b */
    public interface InterfaceC0179b extends jt0<InterfaceC0178a> {
        void requestData();
    }
}
