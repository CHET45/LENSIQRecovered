package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,253:1\n1#2:254\n11335#3:255\n11670#3,3:256\n37#4,2:259\n37#4,2:272\n37#4,2:274\n151#5,3:261\n33#5,4:264\n154#5,2:268\n38#5:270\n156#5:271\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n211#1:255\n211#1:256,3\n211#1:259,2\n237#1:272,2\n251#1:274,2\n237#1:261,3\n237#1:264,4\n237#1:268,2\n237#1:270\n237#1:271\n*E\n"})
public final class nxa {
    @yfb
    public static final lxa modifierLocalMapOf() {
        return j05.f49233b;
    }

    @yfb
    public static final <T> lxa modifierLocalMapOf(@yfb fxa<T> fxaVar) {
        return new xmf(fxaVar);
    }

    @yfb
    public static final <T> lxa modifierLocalMapOf(@yfb scc<? extends fxa<T>, ? extends T> sccVar) {
        xmf xmfVar = new xmf(sccVar.getFirst());
        xmfVar.mo30446set$ui_release(sccVar.getFirst(), sccVar.getSecond());
        return xmfVar;
    }

    @yfb
    public static final lxa modifierLocalMapOf(@yfb fxa<?> fxaVar, @yfb fxa<?> fxaVar2, @yfb fxa<?>... fxaVarArr) {
        scc sccVarM24050to = vkh.m24050to(fxaVar, null);
        fzf fzfVar = new fzf(2);
        fzfVar.add(vkh.m24050to(fxaVar2, null));
        ArrayList arrayList = new ArrayList(fxaVarArr.length);
        for (fxa<?> fxaVar3 : fxaVarArr) {
            arrayList.add(vkh.m24050to(fxaVar3, null));
        }
        fzfVar.addSpread(arrayList.toArray(new scc[0]));
        return new r2b(sccVarM24050to, (scc[]) fzfVar.toArray(new scc[fzfVar.size()]));
    }

    @yfb
    public static final lxa modifierLocalMapOf(@yfb scc<? extends fxa<?>, ? extends Object> sccVar, @yfb scc<? extends fxa<?>, ? extends Object> sccVar2, @yfb scc<? extends fxa<?>, ? extends Object>... sccVarArr) {
        fzf fzfVar = new fzf(2);
        fzfVar.add(sccVar2);
        fzfVar.addSpread(sccVarArr);
        return new r2b(sccVar, (scc[]) fzfVar.toArray(new scc[fzfVar.size()]));
    }

    @q64(level = u64.f86867c, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ lxa modifierLocalMapOf(fxa... fxaVarArr) {
        int length = fxaVarArr.length;
        if (length == 0) {
            return j05.f49233b;
        }
        if (length != 1) {
            scc sccVarM24050to = vkh.m24050to(e80.first(fxaVarArr), null);
            List listDrop = e80.drop(fxaVarArr, 1);
            ArrayList arrayList = new ArrayList(listDrop.size());
            int size = listDrop.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(vkh.m24050to((fxa) listDrop.get(i), null));
            }
            scc[] sccVarArr = (scc[]) arrayList.toArray(new scc[0]);
            return new r2b(sccVarM24050to, (scc[]) Arrays.copyOf(sccVarArr, sccVarArr.length));
        }
        return new xmf((fxa) e80.first(fxaVarArr));
    }

    @q64(level = u64.f86867c, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ lxa modifierLocalMapOf(scc... sccVarArr) {
        int length = sccVarArr.length;
        if (length == 0) {
            return j05.f49233b;
        }
        if (length != 1) {
            scc sccVar = (scc) e80.first(sccVarArr);
            scc[] sccVarArr2 = (scc[]) e80.drop(sccVarArr, 1).toArray(new scc[0]);
            return new r2b(sccVar, (scc[]) Arrays.copyOf(sccVarArr2, sccVarArr2.length));
        }
        return new r2b((scc) e80.first(sccVarArr), new scc[0]);
    }
}
