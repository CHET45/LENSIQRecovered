package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.semantics.AppendedSemanticsElement;
import androidx.compose.p002ui.semantics.ClearAndSetSemanticsElement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1179#2,2:210\n1253#2,4:212\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n205#1:210,2\n205#1:212,4\n*E\n"})
public final class qxe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static AtomicInteger f76281a = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(f58 f58Var, nxe nxeVar) {
        f2i properties = f58Var.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kpd.coerceAtLeast(wt9.mapCapacity(m82.collectionSizeOrDefault(nxeVar, 10)), 16));
        for (Map.Entry<? extends dye<?>, ? extends Object> entry : nxeVar) {
            dye<?> key = entry.getKey();
            scc sccVarM24050to = vkh.m24050to(key.getName(), entry.getValue());
            linkedHashMap.put(sccVarM24050to.getFirst(), sccVarM24050to.getSecond());
        }
        properties.set("properties", linkedHashMap);
    }

    @yfb
    public static final InterfaceC0701e clearAndSetSemantics(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super eye, bth> qy6Var) {
        return interfaceC0701e.then(new ClearAndSetSemanticsElement(qy6Var));
    }

    public static final int generateSemanticsId() {
        return f76281a.addAndGet(1);
    }

    @yfb
    public static final InterfaceC0701e semantics(@yfb InterfaceC0701e interfaceC0701e, boolean z, @yfb qy6<? super eye, bth> qy6Var) {
        return interfaceC0701e.then(new AppendedSemanticsElement(z, qy6Var));
    }

    public static /* synthetic */ InterfaceC0701e semantics$default(InterfaceC0701e interfaceC0701e, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semantics(interfaceC0701e, z, qy6Var);
    }
}
