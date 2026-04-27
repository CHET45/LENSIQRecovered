package p000;

import androidx.compose.p002ui.C0694a;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,843:1\n1188#2:844\n1#3:845\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n824#1:844\n*E\n"})
public final class geb {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C6274a f39621a;

    /* JADX INFO: renamed from: b */
    public static final int f39622b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f39623c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f39624d = 2;

    /* JADX INFO: renamed from: geb$a */
    public static final class C6274a extends InterfaceC0701e.d {
        @yfb
        public String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: renamed from: geb$b */
    public static final class C6275b extends tt8 implements qy6<InterfaceC0701e.c, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f7b<InterfaceC0701e.c> f39625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6275b(f7b<InterfaceC0701e.c> f7bVar) {
            super(1);
            this.f39625a = f7bVar;
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb InterfaceC0701e.c cVar) {
            this.f39625a.add(cVar);
            return Boolean.TRUE;
        }
    }

    static {
        C6274a c6274a = new C6274a();
        c6274a.setAggregateChildKindSet$ui_release(-1);
        f39621a = c6274a;
    }

    public static final int actionForModifiers(@yfb InterfaceC0701e.c cVar, @yfb InterfaceC0701e.c cVar2) {
        if (md8.areEqual(cVar, cVar2)) {
            return 2;
        }
        return C7247ie.areObjectsOfSameType(cVar, cVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final f7b<InterfaceC0701e.c> fillVector(InterfaceC0701e interfaceC0701e, f7b<InterfaceC0701e.c> f7bVar) {
        f7b f7bVar2 = new f7b(new InterfaceC0701e[kpd.coerceAtLeast(f7bVar.getSize(), 16)], 0);
        f7bVar2.add(interfaceC0701e);
        C6275b c6275b = null;
        while (f7bVar2.isNotEmpty()) {
            InterfaceC0701e interfaceC0701e2 = (InterfaceC0701e) f7bVar2.removeAt(f7bVar2.getSize() - 1);
            if (interfaceC0701e2 instanceof C0694a) {
                C0694a c0694a = (C0694a) interfaceC0701e2;
                f7bVar2.add(c0694a.getInner$ui_release());
                f7bVar2.add(c0694a.getOuter$ui_release());
            } else if (interfaceC0701e2 instanceof InterfaceC0701e.c) {
                f7bVar.add(interfaceC0701e2);
            } else {
                if (c6275b == null) {
                    c6275b = new C6275b(f7bVar);
                }
                interfaceC0701e2.all(c6275b);
                c6275b = c6275b;
            }
        }
        return f7bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends InterfaceC0701e.d> void updateUnsafe(sxa<T> sxaVar, InterfaceC0701e.d dVar) {
        md8.checkNotNull(dVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        sxaVar.update(dVar);
    }
}
