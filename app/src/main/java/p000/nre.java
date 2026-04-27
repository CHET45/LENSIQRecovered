package p000;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.function.Consumer;
import p000.ul2;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
@dwf({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n81#2:239\n107#2,2:240\n1208#3:242\n1187#3,2:243\n637#4:245\n48#4:246\n523#4:247\n1#5:248\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n*L\n54#1:239\n54#1:240,2\n81#1:242\n81#1:243,2\n93#1:245\n93#1:246\n93#1:247\n*E\n"})
@e0g(parameters = 1)
public final class nre implements ul2.InterfaceC13572a {

    /* JADX INFO: renamed from: b */
    public static final int f65393b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f65394a = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: nre$a */
    public /* synthetic */ class C10026a extends C8813lh implements qy6<ore, bth> {
        public C10026a(Object obj) {
            super(1, obj, f7b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ore oreVar) {
            invoke2(oreVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ore oreVar) {
            ((f7b) this.f57533a).add(oreVar);
        }
    }

    /* JADX INFO: renamed from: nre$b */
    public static final class C10027b extends tt8 implements qy6<ore, Comparable<?>> {

        /* JADX INFO: renamed from: a */
        public static final C10027b f65395a = new C10027b();

        public C10027b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Comparable<?> invoke(@yfb ore oreVar) {
            return Integer.valueOf(oreVar.getDepth());
        }
    }

    /* JADX INFO: renamed from: nre$c */
    public static final class C10028c extends tt8 implements qy6<ore, Comparable<?>> {

        /* JADX INFO: renamed from: a */
        public static final C10028c f65396a = new C10028c();

        public C10028c() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Comparable<?> invoke(@yfb ore oreVar) {
            return Integer.valueOf(oreVar.getViewportBoundsInWindow().getHeight());
        }
    }

    private final void setScrollCaptureInProgress(boolean z) {
        this.f65394a.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress() {
        return ((Boolean) this.f65394a.getValue()).booleanValue();
    }

    @ih4
    public final void onScrollCaptureSearch(@yfb View view, @yfb xxe xxeVar, @yfb e13 e13Var, @yfb Consumer<ScrollCaptureTarget> consumer) {
        f7b f7bVar = new f7b(new ore[16], 0);
        pre.m19722a(xxeVar.getUnmergedRootSemanticsNode(), 0, new C10026a(f7bVar), 2, null);
        f7bVar.sortWith(md2.compareBy(C10027b.f65395a, C10028c.f65396a));
        ore oreVar = (ore) (f7bVar.isEmpty() ? null : f7bVar.getContent()[f7bVar.getSize() - 1]);
        if (oreVar == null) {
            return;
        }
        ul2 ul2Var = new ul2(oreVar.getNode(), oreVar.getViewportBoundsInWindow(), y13.CoroutineScope(e13Var), this);
        rud rudVarBoundsInRoot = nv8.boundsInRoot(oreVar.getCoordinates());
        long jM30828getTopLeftnOccac = oreVar.getViewportBoundsInWindow().m30828getTopLeftnOccac();
        ScrollCaptureTarget scrollCaptureTargetM17538a = mre.m17538a(view, vud.toAndroidRect(m78.roundToIntRect(rudVarBoundsInRoot)), new Point(a78.m27201getXimpl(jM30828getTopLeftnOccac), a78.m27202getYimpl(jM30828getTopLeftnOccac)), kre.m14974a(ul2Var));
        scrollCaptureTargetM17538a.setScrollBounds(vud.toAndroidRect(oreVar.getViewportBoundsInWindow()));
        consumer.accept(scrollCaptureTargetM17538a);
    }

    @Override // p000.ul2.InterfaceC13572a
    public void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }

    @Override // p000.ul2.InterfaceC13572a
    public void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }
}
