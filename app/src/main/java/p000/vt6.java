package p000;

import java.util.List;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public abstract class vt6 extends zb9.AbstractC16073j {
    @Override // p000.zb9.AbstractC16073j
    public bu1 asChannel() {
        return delegate().asChannel();
    }

    public abstract zb9.AbstractC16073j delegate();

    @Override // p000.zb9.AbstractC16073j
    public List<s45> getAllAddresses() {
        return delegate().getAllAddresses();
    }

    @Override // p000.zb9.AbstractC16073j
    public sc0 getAttributes() {
        return delegate().getAttributes();
    }

    @Override // p000.zb9.AbstractC16073j
    public pu1 getChannelLogger() {
        return delegate().getChannelLogger();
    }

    @Override // p000.zb9.AbstractC16073j
    public Object getInternalSubchannel() {
        return delegate().getInternalSubchannel();
    }

    @Override // p000.zb9.AbstractC16073j
    public void requestConnection() {
        delegate().requestConnection();
    }

    @Override // p000.zb9.AbstractC16073j
    public void shutdown() {
        delegate().shutdown();
    }

    @Override // p000.zb9.AbstractC16073j
    public void start(zb9.InterfaceC16075l interfaceC16075l) {
        delegate().start(interfaceC16075l);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", delegate()).toString();
    }

    @Override // p000.zb9.AbstractC16073j
    public void updateAddresses(List<s45> list) {
        delegate().updateAddresses(list);
    }
}
