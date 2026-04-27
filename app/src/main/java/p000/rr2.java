package p000;

import java.util.Set;
import p000.kcg;

/* JADX INFO: loaded from: classes6.dex */
@kcg(modules = {ur2.class})
@is2
public interface rr2 {

    /* JADX INFO: renamed from: rr2$a */
    @kcg.InterfaceC8286a
    public interface InterfaceC12211a {
        @d31
        InterfaceC12211a autoConnect(@w8b(C12212b.f79062a) boolean z);

        rr2 build();

        @d31
        InterfaceC12211a operationTimeout(w1h w1hVar);

        @d31
        InterfaceC12211a suppressOperationChecks(@w8b(C12212b.f79063b) boolean z);
    }

    /* JADX INFO: renamed from: rr2$b */
    public static class C12212b {

        /* JADX INFO: renamed from: a */
        public static final String f79062a = "autoConnect";

        /* JADX INFO: renamed from: b */
        public static final String f79063b = "suppressOperationChecks";

        private C12212b() {
        }
    }

    /* JADX INFO: renamed from: rr2$c */
    public static class C12213c {

        /* JADX INFO: renamed from: a */
        public static final String f79064a = "GATT_WRITE_MTU_OVERHEAD";

        /* JADX INFO: renamed from: b */
        public static final String f79065b = "GATT_MTU_MINIMUM";

        private C12213c() {
        }
    }

    @is2
    jr2 connectOperation();

    @is2
    Set<qs2> connectionSubscriptionWatchers();

    @is2
    gfe gattCallback();

    @is2
    uee rxBleConnection();
}
