package p000;

import com.eyevue.common.bean.SupportDeviceBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface t84 {

    /* JADX INFO: renamed from: t84$a */
    public interface InterfaceC12945a extends jt0<InterfaceC12946b> {
        void refreshData();
    }

    /* JADX INFO: renamed from: t84$b */
    public interface InterfaceC12946b extends wu0 {
        void loadDeviceListSuccess(List<SupportDeviceBean> deviceList, boolean isCache);
    }
}
