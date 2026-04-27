package p000;

import java.util.Arrays;
import java.util.Collection;
import p000.nm7;
import p000.o03;

/* JADX INFO: loaded from: classes7.dex */
public class c99 extends qlg {
    private static int currentBulletListLevel(@efb nm7.InterfaceC9940a interfaceC9940a) {
        int i = 0;
        while (true) {
            interfaceC9940a = interfaceC9940a.parent();
            if (interfaceC9940a == null) {
                return i;
            }
            if ("ul".equals(interfaceC9940a.name()) || "ol".equals(interfaceC9940a.name())) {
                i++;
            }
        }
    }

    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
        if (nm7Var.isBlock()) {
            nm7.InterfaceC9940a asBlock = nm7Var.getAsBlock();
            boolean zEquals = "ol".equals(asBlock.name());
            boolean zEquals2 = "ul".equals(asBlock.name());
            if (zEquals || zEquals2) {
                mu9 mu9VarConfiguration = yu9Var.configuration();
                l1e l1eVarRenderProps = yu9Var.renderProps();
                qwf qwfVar = mu9VarConfiguration.spansFactory().get(f99.class);
                int iCurrentBulletListLevel = currentBulletListLevel(asBlock);
                int i = 1;
                for (nm7.InterfaceC9940a interfaceC9940a : asBlock.children()) {
                    qlg.m20435a(yu9Var, pu9Var, interfaceC9940a);
                    if (qwfVar != null && ou9.f68826k.equals(interfaceC9940a.name())) {
                        if (zEquals) {
                            o03.f66149a.set(l1eVarRenderProps, o03.EnumC10128a.ORDERED);
                            o03.f66151c.set(l1eVarRenderProps, Integer.valueOf(i));
                            i++;
                        } else {
                            o03.f66149a.set(l1eVarRenderProps, o03.EnumC10128a.BULLET);
                            o03.f66150b.set(l1eVarRenderProps, Integer.valueOf(iCurrentBulletListLevel));
                        }
                        ywf.setSpans(yu9Var.builder(), qwfVar.getSpans(mu9VarConfiguration, l1eVarRenderProps), interfaceC9940a.start(), interfaceC9940a.end());
                    }
                }
            }
        }
    }

    @Override // p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("ol", "ul");
    }
}
