package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t38 {

    /* JADX INFO: renamed from: t38$a */
    public class C12898a extends t38 {
        @Override // p000.t38
        @hib
        public s38 createInputMerger(@efb String className) {
            return null;
        }
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static t38 getDefaultInputMergerFactory() {
        return new C12898a();
    }

    @hib
    public abstract s38 createInputMerger(@efb String className);

    @hib
    @p7e({p7e.EnumC10826a.f69935b})
    public final s38 createInputMergerWithDefaultFallback(@efb String className) {
        s38 s38VarCreateInputMerger = createInputMerger(className);
        return s38VarCreateInputMerger == null ? s38.fromClassName(className) : s38VarCreateInputMerger;
    }
}
