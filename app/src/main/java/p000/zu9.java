package p000;

import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zu9 {

    /* JADX INFO: renamed from: zu9$a */
    public class C16257a extends zu9 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yu9.InterfaceC15812b f106123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mu9 f106124b;

        public C16257a(yu9.InterfaceC15812b interfaceC15812b, mu9 mu9Var) {
            this.f106123a = interfaceC15812b;
            this.f106124b = mu9Var;
        }

        @Override // p000.zu9
        @efb
        /* JADX INFO: renamed from: a */
        public yu9 mo27096a() {
            return this.f106123a.build(this.f106124b, new m1e());
        }
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static zu9 m27095b(@efb yu9.InterfaceC15812b interfaceC15812b, @efb mu9 mu9Var) {
        return new C16257a(interfaceC15812b, mu9Var);
    }

    @efb
    /* JADX INFO: renamed from: a */
    public abstract yu9 mo27096a();
}
