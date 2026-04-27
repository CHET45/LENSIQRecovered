package p000;

import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
public final class vn1 {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC14172b f91763f = new C14171a();

    /* JADX INFO: renamed from: a */
    public final q0h f91764a;

    /* JADX INFO: renamed from: b */
    public final zk9 f91765b = al9.create();

    /* JADX INFO: renamed from: c */
    public final zk9 f91766c = al9.create();

    /* JADX INFO: renamed from: d */
    public final zk9 f91767d = al9.create();

    /* JADX INFO: renamed from: e */
    public volatile long f91768e;

    /* JADX INFO: renamed from: vn1$a */
    public class C14171a implements InterfaceC14172b {
        @Override // p000.vn1.InterfaceC14172b
        public vn1 create() {
            return new vn1(q0h.f72713a);
        }
    }

    /* JADX INFO: renamed from: vn1$b */
    public interface InterfaceC14172b {
        vn1 create();
    }

    public vn1(q0h q0hVar) {
        this.f91764a = q0hVar;
    }

    public static InterfaceC14172b getDefaultFactory() {
        return f91763f;
    }

    /* JADX INFO: renamed from: a */
    public void m24076a(da8.C4685b.a aVar) {
        aVar.setCallsStarted(this.f91765b.value()).setCallsSucceeded(this.f91766c.value()).setCallsFailed(this.f91767d.value()).setLastCallStartedNanos(this.f91768e);
    }

    /* JADX INFO: renamed from: b */
    public void m24077b(da8.C4693j.a aVar) {
        aVar.setCallsStarted(this.f91765b.value()).setCallsSucceeded(this.f91766c.value()).setCallsFailed(this.f91767d.value()).setLastCallStartedNanos(this.f91768e);
    }

    public void reportCallEnded(boolean z) {
        if (z) {
            this.f91766c.add(1L);
        } else {
            this.f91767d.add(1L);
        }
    }

    public void reportCallStarted() {
        this.f91765b.add(1L);
        this.f91768e = this.f91764a.currentTimeNanos();
    }
}
