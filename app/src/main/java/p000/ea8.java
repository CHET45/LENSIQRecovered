package p000;

import p000.rn1;
import p000.z22;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class ea8 {

    /* JADX INFO: renamed from: ea8$a */
    public enum EnumC5213a {
        BLOCKING(z22.EnumC15934g.BLOCKING),
        ASYNC(z22.EnumC15934g.ASYNC),
        FUTURE(z22.EnumC15934g.FUTURE);


        /* JADX INFO: renamed from: a */
        public final z22.EnumC15934g f32346a;

        EnumC5213a(z22.EnumC15934g enumC15934g) {
            this.f32346a = enumC15934g;
        }

        /* JADX INFO: renamed from: of */
        public static EnumC5213a m9827of(z22.EnumC15934g enumC15934g) {
            for (EnumC5213a enumC5213a : values()) {
                if (enumC5213a.f32346a == enumC15934g) {
                    return enumC5213a;
                }
            }
            throw new AssertionError("Unknown StubType: " + enumC15934g.name());
        }
    }

    public static EnumC5213a getStubType(rn1 rn1Var) {
        return EnumC5213a.m9827of((z22.EnumC15934g) rn1Var.getOption(z22.f103704c));
    }

    public static rn1.C12165c<z22.EnumC15934g> getStubTypeOption() {
        return z22.f103704c;
    }

    public static rn1 setStubType(rn1 rn1Var, EnumC5213a enumC5213a) {
        return rn1Var.withOption(z22.f103704c, enumC5213a.f32346a);
    }
}
