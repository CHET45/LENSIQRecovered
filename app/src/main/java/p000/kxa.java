package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n1208#2:123\n1187#2,2:124\n1208#2:126\n1187#2,2:127\n1208#2:129\n1187#2,2:130\n1208#2:132\n1187#2,2:133\n1208#2:172\n1187#2,2:173\n476#3,7:135\n523#3:142\n483#3,4:143\n476#3,7:147\n523#3:154\n483#3,4:155\n728#3,2:240\n728#3,2:242\n728#3,2:244\n728#3,2:246\n728#3,2:248\n728#3,2:250\n1855#4,2:159\n84#5:161\n310#6:162\n167#6:163\n168#6:171\n169#6,12:175\n311#6:187\n432#6,5:188\n312#6,2:193\n437#6:195\n442#6,2:197\n444#6,17:202\n461#6,8:222\n314#6:230\n181#6,8:231\n315#6:239\n42#7,7:164\n264#8:196\n245#9,3:199\n248#9,3:219\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:123\n44#1:124,2\n45#1:126\n45#1:127,2\n46#1:129\n46#1:130,2\n47#1:132\n47#1:133,2\n93#1:172\n93#1:173,2\n64#1:135,7\n65#1:142\n64#1:143,4\n77#1:147,7\n78#1:154\n77#1:155,4\n105#1:240,2\n106#1:242,2\n111#1:244,2\n112#1:246,2\n117#1:248,2\n118#1:250,2\n85#1:159,2\n93#1:161\n93#1:162\n93#1:163\n93#1:171\n93#1:175,12\n93#1:187\n93#1:188,5\n93#1:193,2\n93#1:195\n93#1:197,2\n93#1:202,17\n93#1:222,8\n93#1:230\n93#1:231,8\n93#1:239\n93#1:164,7\n93#1:196\n93#1:199,3\n93#1:219,3\n*E\n"})
@e0g(parameters = 0)
public final class kxa {

    /* JADX INFO: renamed from: g */
    public static final int f55562g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z9c f55563a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f7b<dp0> f55564b = new f7b<>(new dp0[16], 0);

    /* JADX INFO: renamed from: c */
    @yfb
    public final f7b<fxa<?>> f55565c = new f7b<>(new fxa[16], 0);

    /* JADX INFO: renamed from: d */
    @yfb
    public final f7b<lw8> f55566d = new f7b<>(new lw8[16], 0);

    /* JADX INFO: renamed from: e */
    @yfb
    public final f7b<fxa<?>> f55567e = new f7b<>(new fxa[16], 0);

    /* JADX INFO: renamed from: f */
    public boolean f55568f;

    /* JADX INFO: renamed from: kxa$a */
    public static final class C8546a extends tt8 implements ny6<bth> {
        public C8546a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kxa.this.triggerUpdates();
        }
    }

    public kxa(@yfb z9c z9cVar) {
        this.f55563a = z9cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    private final void invalidateConsumersOfNodeForKey(InterfaceC0701e.d dVar, fxa<?> fxaVar, Set<dp0> set) {
        int iM30687constructorimpl = keb.m30687constructorimpl(32);
        if (!dVar.getNode().isAttached()) {
            g28.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        f7b f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
        InterfaceC0701e.d child$ui_release = dVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            w34.addLayoutNodeChildren(f7bVar, dVar.getNode());
        } else {
            f7bVar.add(child$ui_release);
        }
        while (f7bVar.isNotEmpty()) {
            InterfaceC0701e.d dVar2 = (InterfaceC0701e.d) f7bVar.removeAt(f7bVar.getSize() - 1);
            if ((dVar2.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                for (InterfaceC0701e.d child$ui_release2 = dVar2; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = child$ui_release2;
                        f7b f7bVar2 = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof mxa) {
                                mxa mxaVar = (mxa) dVarPop;
                                if (mxaVar instanceof dp0) {
                                    dp0 dp0Var = (dp0) mxaVar;
                                    if ((dp0Var.getElement() instanceof gxa) && dp0Var.getReadValues().contains(fxaVar)) {
                                        set.add(mxaVar);
                                    }
                                }
                                if (mxaVar.getProvidedValues().contains$ui_release(fxaVar)) {
                                    break;
                                }
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar2 == null) {
                                                f7bVar2 = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != 0) {
                                                f7bVar2.add(dVarPop);
                                                dVarPop = 0;
                                            }
                                            f7bVar2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    dVarPop = dVarPop;
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar2);
                        }
                    }
                }
            }
            w34.addLayoutNodeChildren(f7bVar, dVar2);
        }
    }

    @yfb
    public final z9c getOwner() {
        return this.f55563a;
    }

    public final void insertedProvider(@yfb dp0 dp0Var, @yfb fxa<?> fxaVar) {
        this.f55564b.add(dp0Var);
        this.f55565c.add(fxaVar);
        invalidate();
    }

    public final void invalidate() {
        if (this.f55568f) {
            return;
        }
        this.f55568f = true;
        this.f55563a.registerOnEndApplyChangesListener(new C8546a());
    }

    public final void removedProvider(@yfb dp0 dp0Var, @yfb fxa<?> fxaVar) {
        this.f55566d.add(w34.requireLayoutNode(dp0Var));
        this.f55567e.add(fxaVar);
        invalidate();
    }

    public final void triggerUpdates() {
        int i = 0;
        this.f55568f = false;
        HashSet hashSet = new HashSet();
        f7b<lw8> f7bVar = this.f55566d;
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i2 = 0;
            do {
                lw8 lw8Var = content[i2];
                fxa<?> fxaVar = this.f55567e.getContent()[i2];
                if (lw8Var.getNodes$ui_release().getHead$ui_release().isAttached()) {
                    invalidateConsumersOfNodeForKey(lw8Var.getNodes$ui_release().getHead$ui_release(), fxaVar, hashSet);
                }
                i2++;
            } while (i2 < size);
        }
        this.f55566d.clear();
        this.f55567e.clear();
        f7b<dp0> f7bVar2 = this.f55564b;
        int size2 = f7bVar2.getSize();
        if (size2 > 0) {
            dp0[] content2 = f7bVar2.getContent();
            do {
                dp0 dp0Var = content2[i];
                fxa<?> fxaVar2 = this.f55565c.getContent()[i];
                if (dp0Var.isAttached()) {
                    invalidateConsumersOfNodeForKey(dp0Var, fxaVar2, hashSet);
                }
                i++;
            } while (i < size2);
        }
        this.f55564b.clear();
        this.f55565c.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((dp0) it.next()).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(@yfb dp0 dp0Var, @yfb fxa<?> fxaVar) {
        this.f55564b.add(dp0Var);
        this.f55565c.add(fxaVar);
        invalidate();
    }
}
