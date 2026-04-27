package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.InterfaceC0701e.d;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
@e0g(parameters = 2)
public abstract class sxa<N extends InterfaceC0701e.d> implements InterfaceC0701e.c, b58 {

    /* JADX INFO: renamed from: b */
    public static final int f83200b = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public f58 f83201a;

    private final f58 getInspectorValues() {
        f58 f58Var = this.f83201a;
        if (f58Var != null) {
            return f58Var;
        }
        f58 f58Var2 = new f58();
        f58Var2.setName(vvd.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(f58Var2);
        this.f83201a = f58Var2;
        return f58Var2;
    }

    @yfb
    public abstract N create();

    public abstract boolean equals(@gib Object obj);

    @Override // p000.b58
    @yfb
    public final vye<e2i> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // p000.b58
    @gib
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // p000.b58
    @gib
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(@yfb f58 f58Var) {
        C7247ie.tryPopulateReflectively(f58Var, this);
    }

    public abstract void update(@yfb N n);
}
