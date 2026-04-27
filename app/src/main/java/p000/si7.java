package p000;

import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class si7 extends ms6 {

    /* JADX INFO: renamed from: a */
    public final zb9.AbstractC16069f f81921a;

    /* JADX INFO: renamed from: si7$a */
    @gdi
    public static final class C12602a extends vt6 {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16073j f81922a;

        /* JADX INFO: renamed from: b */
        public final zb9.InterfaceC16075l f81923b;

        /* JADX INFO: renamed from: si7$a$a */
        public class a implements zb9.InterfaceC16075l {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zb9.InterfaceC16075l f81924a;

            public a(zb9.InterfaceC16075l interfaceC16075l) {
                this.f81924a = interfaceC16075l;
            }

            @Override // p000.zb9.InterfaceC16075l
            public void onSubchannelState(xs2 xs2Var) {
                this.f81924a.onSubchannelState(xs2Var);
                C12602a.this.f81923b.onSubchannelState(xs2Var);
            }
        }

        public C12602a(zb9.AbstractC16073j abstractC16073j, zb9.InterfaceC16075l interfaceC16075l) {
            this.f81922a = (zb9.AbstractC16073j) v7d.checkNotNull(abstractC16073j, "delegate");
            this.f81923b = (zb9.InterfaceC16075l) v7d.checkNotNull(interfaceC16075l, "healthListener");
        }

        @Override // p000.vt6
        public zb9.AbstractC16073j delegate() {
            return this.f81922a;
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public sc0 getAttributes() {
            return super.getAttributes().toBuilder().set(zb9.f104685d, Boolean.TRUE).build();
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public void start(zb9.InterfaceC16075l interfaceC16075l) {
            this.f81922a.start(new a(interfaceC16075l));
        }
    }

    public si7(zb9.AbstractC16069f abstractC16069f) {
        this.f81921a = (zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper");
    }

    @Override // p000.ms6
    /* JADX INFO: renamed from: a */
    public zb9.AbstractC16069f mo8856a() {
        return this.f81921a;
    }

    @Override // p000.ms6, p000.zb9.AbstractC16069f
    public zb9.AbstractC16073j createSubchannel(zb9.C16065b c16065b) {
        zb9.InterfaceC16075l interfaceC16075l = (zb9.InterfaceC16075l) c16065b.getOption(zb9.f104684c);
        zb9.AbstractC16073j abstractC16073jCreateSubchannel = super.createSubchannel(c16065b);
        return (interfaceC16075l == null || abstractC16073jCreateSubchannel.getAttributes().get(zb9.f104685d) != null) ? abstractC16073jCreateSubchannel : new C12602a(abstractC16073jCreateSubchannel, interfaceC16075l);
    }
}
