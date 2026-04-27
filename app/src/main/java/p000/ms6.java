package p000;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public abstract class ms6 extends zb9.AbstractC16069f {
    /* JADX INFO: renamed from: a */
    public abstract zb9.AbstractC16069f mo8856a();

    @Override // p000.zb9.AbstractC16069f
    public or9 createOobChannel(s45 s45Var, String str) {
        return mo8856a().createOobChannel(s45Var, str);
    }

    @Override // p000.zb9.AbstractC16069f
    public or9 createResolvingOobChannel(String str) {
        return mo8856a().createResolvingOobChannel(str);
    }

    @Override // p000.zb9.AbstractC16069f
    @Deprecated
    public pr9<?> createResolvingOobChannelBuilder(String str) {
        return mo8856a().createResolvingOobChannelBuilder(str);
    }

    @Override // p000.zb9.AbstractC16069f
    public zb9.AbstractC16073j createSubchannel(zb9.C16065b c16065b) {
        return mo8856a().createSubchannel(c16065b);
    }

    @Override // p000.zb9.AbstractC16069f
    public String getAuthority() {
        return mo8856a().getAuthority();
    }

    @Override // p000.zb9.AbstractC16069f
    public eu1 getChannelCredentials() {
        return mo8856a().getChannelCredentials();
    }

    @Override // p000.zb9.AbstractC16069f
    public pu1 getChannelLogger() {
        return mo8856a().getChannelLogger();
    }

    @Override // p000.zb9.AbstractC16069f
    public q8b.C11372b getNameResolverArgs() {
        return mo8856a().getNameResolverArgs();
    }

    @Override // p000.zb9.AbstractC16069f
    public t8b getNameResolverRegistry() {
        return mo8856a().getNameResolverRegistry();
    }

    @Override // p000.zb9.AbstractC16069f
    public ScheduledExecutorService getScheduledExecutorService() {
        return mo8856a().getScheduledExecutorService();
    }

    @Override // p000.zb9.AbstractC16069f
    public thg getSynchronizationContext() {
        return mo8856a().getSynchronizationContext();
    }

    @Override // p000.zb9.AbstractC16069f
    public eu1 getUnsafeChannelCredentials() {
        return mo8856a().getUnsafeChannelCredentials();
    }

    @Override // p000.zb9.AbstractC16069f
    @Deprecated
    public void ignoreRefreshNameResolutionCheck() {
        mo8856a().ignoreRefreshNameResolutionCheck();
    }

    @Override // p000.zb9.AbstractC16069f
    public void refreshNameResolution() {
        mo8856a().refreshNameResolution();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo8856a()).toString();
    }

    @Override // p000.zb9.AbstractC16069f
    public void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
        mo8856a().updateBalancingState(ws2Var, abstractC16074k);
    }

    @Override // p000.zb9.AbstractC16069f
    public void updateOobChannelAddresses(or9 or9Var, s45 s45Var) {
        mo8856a().updateOobChannelAddresses(or9Var, s45Var);
    }

    @Override // p000.zb9.AbstractC16069f
    public or9 createOobChannel(List<s45> list, String str) {
        return mo8856a().createOobChannel(list, str);
    }

    @Override // p000.zb9.AbstractC16069f
    public pr9<?> createResolvingOobChannelBuilder(String str, eu1 eu1Var) {
        return mo8856a().createResolvingOobChannelBuilder(str, eu1Var);
    }

    @Override // p000.zb9.AbstractC16069f
    public void updateOobChannelAddresses(or9 or9Var, List<s45> list) {
        mo8856a().updateOobChannelAddresses(or9Var, list);
    }
}
