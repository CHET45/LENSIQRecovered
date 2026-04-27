package p000;

import java.util.List;
import p000.oo6;
import p000.ra0;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
public final class no6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final scc<List<xn6>, Object> firstImmediatelyAvailable(List<? extends xn6> list, onh onhVar, ra0 ra0Var, ywc ywcVar, qy6<? super onh, ? extends Object> qy6Var) {
        Object objLoadBlocking;
        xn6 xn6Var;
        Object objM32723constructorimpl;
        xn6 xn6Var2;
        int size = list.size();
        List listMutableListOf = null;
        for (int i = 0; i < size; i++) {
            xn6 xn6Var3 = list.get(i);
            int iMo30174getLoadingStrategyPKNRLFQ = xn6Var3.mo30174getLoadingStrategyPKNRLFQ();
            oo6.C10484a c10484a = oo6.f68233b;
            if (oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31524getBlockingPKNRLFQ())) {
                synchronized (ra0Var.f77508d) {
                    try {
                        ra0.C11962b c11962b = new ra0.C11962b(xn6Var3, ywcVar.getCacheKey());
                        ra0.C11961a c11961a = (ra0.C11961a) ra0Var.f77506b.get(c11962b);
                        if (c11961a == null) {
                            c11961a = (ra0.C11961a) ra0Var.f77507c.get(c11962b);
                        }
                        if (c11961a != null) {
                            objLoadBlocking = c11961a.m32101unboximpl();
                            xn6Var = xn6Var3;
                        } else {
                            bth bthVar = bth.f14751a;
                            try {
                                objLoadBlocking = ywcVar.loadBlocking(xn6Var3);
                                xn6Var = xn6Var3;
                                ra0.put$default(ra0Var, xn6Var3, ywcVar, objLoadBlocking, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + xn6Var3, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objLoadBlocking != null) {
                    return vkh.m24050to(listMutableListOf, hp6.m30099synthesizeTypefaceFxwP2eA(onhVar.m31515getFontSynthesisGVVA2EU(), objLoadBlocking, xn6Var, onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + xn6Var);
            }
            if (oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31525getOptionalLocalPKNRLFQ())) {
                synchronized (ra0Var.f77508d) {
                    try {
                        ra0.C11962b c11962b2 = new ra0.C11962b(xn6Var3, ywcVar.getCacheKey());
                        ra0.C11961a c11961a2 = (ra0.C11961a) ra0Var.f77506b.get(c11962b2);
                        if (c11961a2 == null) {
                            c11961a2 = (ra0.C11961a) ra0Var.f77507c.get(c11962b2);
                        }
                        if (c11961a2 != null) {
                            objM32723constructorimpl = c11961a2.m32101unboximpl();
                            xn6Var2 = xn6Var3;
                        } else {
                            bth bthVar2 = bth.f14751a;
                            try {
                                v7e.C13927a c13927a = v7e.f90266b;
                                objM32723constructorimpl = v7e.m32723constructorimpl(ywcVar.loadBlocking(xn6Var3));
                            } catch (Throwable th2) {
                                v7e.C13927a c13927a2 = v7e.f90266b;
                                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th2));
                            }
                            if (v7e.m32729isFailureimpl(objM32723constructorimpl)) {
                                objM32723constructorimpl = null;
                            }
                            xn6Var2 = xn6Var3;
                            ra0.put$default(ra0Var, xn6Var3, ywcVar, objM32723constructorimpl, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objM32723constructorimpl != null) {
                    return vkh.m24050to(listMutableListOf, hp6.m30099synthesizeTypefaceFxwP2eA(onhVar.m31515getFontSynthesisGVVA2EU(), objM32723constructorimpl, xn6Var2, onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA()));
                }
            } else {
                if (!oo6.m31519equalsimpl0(iMo30174getLoadingStrategyPKNRLFQ, c10484a.m31523getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + xn6Var3);
                }
                ra0.C11961a c11961aM32093get1ASDuI8 = ra0Var.m32093get1ASDuI8(xn6Var3, ywcVar);
                if (c11961aM32093get1ASDuI8 != null) {
                    if (!ra0.C11961a.m32099isPermanentFailureimpl(c11961aM32093get1ASDuI8.m32101unboximpl()) && c11961aM32093get1ASDuI8.m32101unboximpl() != null) {
                        return vkh.m24050to(listMutableListOf, hp6.m30099synthesizeTypefaceFxwP2eA(onhVar.m31515getFontSynthesisGVVA2EU(), c11961aM32093get1ASDuI8.m32101unboximpl(), xn6Var3, onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = l82.mutableListOf(xn6Var3);
                } else {
                    listMutableListOf.add(xn6Var3);
                }
            }
        }
        return vkh.m24050to(listMutableListOf, qy6Var.invoke(onhVar));
    }
}
