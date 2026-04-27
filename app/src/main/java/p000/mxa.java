package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,253:1\n96#2,7:254\n96#2,7:261\n96#2,7:268\n84#3:275\n251#4,5:276\n62#4:281\n63#4,8:283\n432#4,6:291\n442#4,2:298\n444#4,8:303\n452#4,9:314\n461#4,8:326\n72#4,7:334\n1#5:282\n264#6:297\n245#7,3:300\n248#7,3:323\n1208#8:311\n1187#8,2:312\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n151#1:254,7\n154#1:261,7\n167#1:268,7\n171#1:275\n171#1:276,5\n171#1:281\n171#1:283,8\n171#1:291,6\n171#1:298,2\n171#1:303,8\n171#1:314,9\n171#1:326,8\n171#1:334,7\n171#1:282\n171#1:297\n171#1:300,3\n171#1:323,3\n171#1:311\n171#1:312,2\n*E\n"})
public interface mxa extends qxa, v34 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$d] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$d] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f7b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f7b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p000.qxa
    default <T> T getCurrent(@yfb fxa<T> fxaVar) {
        feb nodes$ui_release;
        if (!getNode().isAttached()) {
            g28.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        int iM30687constructorimpl = keb.m30687constructorimpl(32);
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(this);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        ?? Pop = parent$ui_release;
                        ?? f7bVar = 0;
                        while (Pop != 0) {
                            if (Pop instanceof mxa) {
                                mxa mxaVar = (mxa) Pop;
                                if (mxaVar.getProvidedValues().contains$ui_release(fxaVar)) {
                                    return (T) mxaVar.getProvidedValues().get$ui_release(fxaVar);
                                }
                            } else if ((Pop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (Pop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) Pop).getDelegate$ui_release();
                                int i = 0;
                                Pop = Pop;
                                f7bVar = f7bVar;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        f7bVar = f7bVar;
                                        if (i == 1) {
                                            Pop = delegate$ui_release;
                                        } else {
                                            if (f7bVar == 0) {
                                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (Pop != 0) {
                                                f7bVar.add(Pop);
                                                Pop = 0;
                                            }
                                            f7bVar.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    Pop = Pop;
                                    f7bVar = f7bVar;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = w34.pop(f7bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return fxaVar.getDefaultFactory$ui_release().invoke();
    }

    @yfb
    default lxa getProvidedValues() {
        return j05.f49233b;
    }

    default <T> void provide(@yfb fxa<T> fxaVar, T t) {
        if (!(getProvidedValues() != j05.f49233b)) {
            g28.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!getProvidedValues().contains$ui_release(fxaVar)) {
            g28.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + fxaVar + " was not found.");
        }
        getProvidedValues().mo30446set$ui_release(fxaVar, t);
    }
}
