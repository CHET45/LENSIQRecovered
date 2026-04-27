package p000;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.C0626c0;
import androidx.compose.foundation.layout.C0629e;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0723l;
import androidx.compose.p002ui.input.key.C0743a;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.mediarouter.media.C1340j;
import java.util.List;
import p000.ssf;
import p000.xl2;
import p000.xr8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1252:1\n1223#2,6:1253\n1223#2,6:1259\n1223#2,6:1265\n1223#2,6:1277\n1223#2,6:1283\n1223#2,6:1289\n1223#2,6:1295\n1223#2,6:1301\n1223#2,3:1315\n1226#2,3:1321\n1223#2,6:1325\n1223#2,6:1331\n1223#2,6:1337\n1223#2,6:1343\n1223#2,6:1349\n1223#2,6:1355\n1223#2,6:1361\n1223#2,6:1367\n1223#2,6:1373\n1223#2,6:1379\n1223#2,6:1385\n1223#2,6:1432\n1223#2,6:1439\n1223#2,6:1445\n1223#2,6:1451\n77#3:1271\n77#3:1272\n77#3:1273\n77#3:1274\n77#3:1275\n77#3:1276\n77#3:1307\n77#3:1308\n77#3:1309\n77#3:1438\n488#4:1310\n487#4,4:1311\n491#4,2:1318\n495#4:1324\n487#5:1320\n71#6:1391\n68#6,6:1392\n74#6:1426\n78#6:1430\n78#7,6:1398\n85#7,4:1413\n89#7,2:1423\n93#7:1429\n368#8,9:1404\n377#8:1425\n378#8,2:1427\n4032#9,6:1417\n1#10:1431\n602#11,8:1457\n81#12:1465\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n222#1:1253,6\n223#1:1259,6\n224#1:1265,6\n242#1:1277,6\n245#1:1283,6\n259#1:1289,6\n288#1:1295,6\n291#1:1301,6\n304#1:1315,3\n304#1:1321,3\n305#1:1325,6\n312#1:1331,6\n354#1:1337,6\n380#1:1343,6\n381#1:1349,6\n409#1:1355,6\n426#1:1361,6\n463#1:1367,6\n617#1:1373,6\n621#1:1379,6\n648#1:1385,6\n1192#1:1432,6\n1195#1:1439,6\n1197#1:1445,6\n1209#1:1451,6\n229#1:1271\n230#1:1272\n231#1:1273\n232#1:1274\n233#1:1275\n234#1:1276\n297#1:1307\n298#1:1308\n299#1:1309\n1193#1:1438\n304#1:1310\n304#1:1311,4\n304#1:1318,2\n304#1:1324\n304#1:1320\n803#1:1391\n803#1:1392,6\n803#1:1426\n803#1:1430\n803#1:1398,6\n803#1:1413,4\n803#1:1423,2\n803#1:1429\n803#1:1404,9\n803#1:1425\n803#1:1427,2\n803#1:1417,6\n1237#1:1457,8\n353#1:1465\n*E\n"})
public final class r03 {

    /* JADX INFO: renamed from: r03$a */
    public static final class C11776a extends tt8 implements qy6<hug, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11776a f76444a = new C11776a();

        public C11776a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(hug hugVar) {
            invoke2(hugVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb hug hugVar) {
        }
    }

    /* JADX INFO: renamed from: r03$b */
    @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {357}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11777b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f76445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z39 f76446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<Boolean> f76447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ stg f76448d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ osg f76449e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nw7 f76450f;

        /* JADX INFO: renamed from: r03$b$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<Boolean> f76451a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2g<Boolean> i2gVar) {
                super(0);
                this.f76451a = i2gVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(r03.CoreTextField$lambda$11(this.f76451a));
            }
        }

        /* JADX INFO: renamed from: r03$b$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76452a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ stg f76453b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ osg f76454c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ nw7 f76455d;

            public b(z39 z39Var, stg stgVar, osg osgVar, nw7 nw7Var) {
                this.f76452a = z39Var;
                this.f76453b = stgVar;
                this.f76454c = osgVar;
                this.f76455d = nw7Var;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit(((Boolean) obj).booleanValue(), (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(boolean z, @yfb zy2<? super bth> zy2Var) {
                if (z && this.f76452a.getHasFocus()) {
                    r03.startInputSession(this.f76453b, this.f76452a, this.f76454c.getValue$foundation_release(), this.f76455d, this.f76454c.getOffsetMapping$foundation_release());
                } else {
                    r03.endInputSession(this.f76452a);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11777b(z39 z39Var, i2g<Boolean> i2gVar, stg stgVar, osg osgVar, nw7 nw7Var, zy2<? super C11777b> zy2Var) {
            super(2, zy2Var);
            this.f76446b = z39Var;
            this.f76447c = i2gVar;
            this.f76448d = stgVar;
            this.f76449e = osgVar;
            this.f76450f = nw7Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C11777b(this.f76446b, this.f76447c, this.f76448d, this.f76449e, this.f76450f, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11777b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f76445a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(this.f76447c));
                    b bVar = new b(this.f76446b, this.f76448d, this.f76449e, this.f76450f);
                    this.f76445a = 1;
                    if (y56VarSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                r03.endInputSession(this.f76446b);
                return bth.f14751a;
            } catch (Throwable th) {
                r03.endInputSession(this.f76446b);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r03$c */
    @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1252:1\n64#2,5:1253\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3$1\n*L\n618#1:1253,5\n*E\n"})
    public static final class C11778c extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f76456a;

        /* JADX INFO: renamed from: r03$c$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3$1\n*L\n1#1,497:1\n618#2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f76457a;

            public a(osg osgVar) {
                this.f76457a = osgVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f76457a.hideSelectionToolbar$foundation_release();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11778c(osg osgVar) {
            super(1);
            this.f76456a = osgVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f76456a);
        }
    }

    /* JADX INFO: renamed from: r03$d */
    @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1252:1\n64#2,5:1253\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4$1\n*L\n632#1:1253,5\n*E\n"})
    public static final class C11779d extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76458a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ stg f76459b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zsg f76460c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ nw7 f76461d;

        /* JADX INFO: renamed from: r03$d$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4$1\n*L\n1#1,497:1\n632#2:498\n*E\n"})
        public static final class a implements vf4 {
            @Override // p000.vf4
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11779d(z39 z39Var, stg stgVar, zsg zsgVar, nw7 nw7Var) {
            super(1);
            this.f76458a = z39Var;
            this.f76459b = stgVar;
            this.f76460c = zsgVar;
            this.f76461d = nw7Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            if (this.f76458a.getHasFocus()) {
                z39 z39Var = this.f76458a;
                z39Var.setInputSession(rrg.f79167a.restartInput$foundation_release(this.f76459b, this.f76460c, z39Var.getProcessor(), this.f76461d, this.f76458a.getOnValueChange(), this.f76458a.getOnImeActionPerformed()));
            }
            return new a();
        }
    }

    /* JADX INFO: renamed from: r03$e */
    public static final class C11780e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ kdi f76462C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ InterfaceC0701e f76463F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ InterfaceC0701e f76464H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ InterfaceC0701e f76465L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ InterfaceC0701e f76466M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ nzb f76467M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ md1 f76468N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ osg f76469Q;

        /* JADX INFO: renamed from: V1 */
        public final /* synthetic */ c64 f76470V1;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ boolean f76471X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ boolean f76472Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ qy6<hug, bth> f76473Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f76474a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z39 f76475b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f76476c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f76477d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f76478e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nsg f76479f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ zsg f76480m;

        /* JADX INFO: renamed from: r03$e$a */
        @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1252:1\n1223#2,6:1253\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1\n*L\n712#1:1253,6\n*E\n"})
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ InterfaceC0701e f76481C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ InterfaceC0701e f76482F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ InterfaceC0701e f76483H;

            /* JADX INFO: renamed from: L */
            public final /* synthetic */ InterfaceC0701e f76484L;

            /* JADX INFO: renamed from: M */
            public final /* synthetic */ md1 f76485M;

            /* JADX INFO: renamed from: M1 */
            public final /* synthetic */ c64 f76486M1;

            /* JADX INFO: renamed from: N */
            public final /* synthetic */ osg f76487N;

            /* JADX INFO: renamed from: Q */
            public final /* synthetic */ boolean f76488Q;

            /* JADX INFO: renamed from: X */
            public final /* synthetic */ boolean f76489X;

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ qy6<hug, bth> f76490Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ nzb f76491Z;

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76492a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yvg f76493b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f76494c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f76495d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ nsg f76496e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ zsg f76497f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ kdi f76498m;

            /* JADX INFO: renamed from: r03$e$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1252:1\n78#2:1253\n76#2,8:1254\n85#2,4:1271\n89#2,2:1281\n93#2:1286\n368#3,9:1262\n377#3,3:1283\n4032#4,6:1275\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n722#1:1253\n722#1:1254,8\n722#1:1271,4\n722#1:1281,2\n722#1:1286\n722#1:1262,9\n722#1:1283,3\n722#1:1275,6\n*E\n"})
            public static final class C16510a extends tt8 implements gz6<zl2, Integer, bth> {

                /* JADX INFO: renamed from: C */
                public final /* synthetic */ c64 f76499C;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ int f76500F;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ osg f76501a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ z39 f76502b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f76503c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f76504d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ qy6<hug, bth> f76505e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ zsg f76506f;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ nzb f76507m;

                /* JADX INFO: renamed from: r03$e$a$a$a, reason: collision with other inner class name */
                @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1252:1\n602#2,8:1253\n26#3:1261\n26#3:1262\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n*L\n729#1:1253,8\n761#1:1261\n762#1:1262\n*E\n"})
                public static final class C16511a implements uba {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ z39 f76508a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ qy6<hug, bth> f76509b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ zsg f76510c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ nzb f76511d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ c64 f76512e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ int f76513f;

                    /* JADX INFO: renamed from: r03$e$a$a$a$a, reason: collision with other inner class name */
                    public static final class C16512a extends tt8 implements qy6<AbstractC0767t.a, bth> {

                        /* JADX INFO: renamed from: a */
                        public static final C16512a f76514a = new C16512a();

                        public C16512a() {
                            super(1);
                        }

                        @Override // p000.qy6
                        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                            invoke2(aVar);
                            return bth.f14751a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@yfb AbstractC0767t.a aVar) {
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public C16511a(z39 z39Var, qy6<? super hug, bth> qy6Var, zsg zsgVar, nzb nzbVar, c64 c64Var, int i) {
                        this.f76508a = z39Var;
                        this.f76509b = qy6Var;
                        this.f76510c = zsgVar;
                        this.f76511d = nzbVar;
                        this.f76512e = c64Var;
                        this.f76513f = i;
                    }

                    @Override // p000.uba
                    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
                        this.f76508a.getTextDelegate().layoutIntrinsics(gd8Var.getLayoutDirection());
                        return this.f76508a.getTextDelegate().getMaxIntrinsicWidth();
                    }

                    @Override // p000.uba
                    @yfb
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
                        ssf.C12771a c12771a = ssf.f82790e;
                        z39 z39Var = this.f76508a;
                        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
                        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            iug layoutResult = z39Var.getLayoutResult();
                            hug value = layoutResult != null ? layoutResult.getValue() : null;
                            djh<Integer, Integer, hug> djhVarM32173layout_EkL_Y$foundation_release = rrg.f79167a.m32173layout_EkL_Y$foundation_release(this.f76508a.getTextDelegate(), j, interfaceC0761n.getLayoutDirection(), value);
                            int iIntValue = djhVarM32173layout_EkL_Y$foundation_release.component1().intValue();
                            int iIntValue2 = djhVarM32173layout_EkL_Y$foundation_release.component2().intValue();
                            hug hugVarComponent3 = djhVarM32173layout_EkL_Y$foundation_release.component3();
                            if (!md8.areEqual(value, hugVarComponent3)) {
                                this.f76508a.setLayoutResult(new iug(hugVarComponent3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                this.f76509b.invoke(hugVarComponent3);
                                r03.notifyFocusedRect(this.f76508a, this.f76510c, this.f76511d);
                            }
                            this.f76508a.m33492setMinHeightForSingleLineField0680j_4(this.f76512e.mo27170toDpu2uoSUM(this.f76513f == 1 ? uqg.ceilToIntPx(hugVarComponent3.getLineBottom(0)) : 0));
                            return interfaceC0761n.layout(iIntValue, iIntValue2, xt9.mapOf(vkh.m24050to(C10463om.getFirstBaseline(), Integer.valueOf(Math.round(hugVarComponent3.getFirstBaseline()))), vkh.m24050to(C10463om.getLastBaseline(), Integer.valueOf(Math.round(hugVarComponent3.getLastBaseline())))), C16512a.f76514a);
                        } finally {
                            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16510a(osg osgVar, z39 z39Var, boolean z, boolean z2, qy6<? super hug, bth> qy6Var, zsg zsgVar, nzb nzbVar, c64 c64Var, int i) {
                    super(2);
                    this.f76501a = osgVar;
                    this.f76502b = z39Var;
                    this.f76503c = z;
                    this.f76504d = z2;
                    this.f76505e = qy6Var;
                    this.f76506f = zsgVar;
                    this.f76507m = nzbVar;
                    this.f76499C = c64Var;
                    this.f76500F = i;
                }

                @Override // p000.gz6
                public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                    invoke(zl2Var, num.intValue());
                    return bth.f14751a;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
                @p000.bl2(applier = "androidx.compose.ui.UiComposable")
                @p000.hk2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(@p000.gib p000.zl2 r11, int r12) {
                    /*
                        Method dump skipped, instruction units count: 259
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.r03.C11780e.a.C16510a.invoke(zl2, int):void");
                }
            }

            /* JADX INFO: renamed from: r03$e$a$b */
            public static final class b extends tt8 implements ny6<iug> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ z39 f76515a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(z39 z39Var) {
                    super(0);
                    this.f76515a = z39Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.ny6
                @gib
                public final iug invoke() {
                    return this.f76515a.getLayoutResult();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(z39 z39Var, yvg yvgVar, int i, int i2, nsg nsgVar, zsg zsgVar, kdi kdiVar, InterfaceC0701e interfaceC0701e, InterfaceC0701e interfaceC0701e2, InterfaceC0701e interfaceC0701e3, InterfaceC0701e interfaceC0701e4, md1 md1Var, osg osgVar, boolean z, boolean z2, qy6<? super hug, bth> qy6Var, nzb nzbVar, c64 c64Var) {
                super(2);
                this.f76492a = z39Var;
                this.f76493b = yvgVar;
                this.f76494c = i;
                this.f76495d = i2;
                this.f76496e = nsgVar;
                this.f76497f = zsgVar;
                this.f76498m = kdiVar;
                this.f76481C = interfaceC0701e;
                this.f76482F = interfaceC0701e2;
                this.f76483H = interfaceC0701e3;
                this.f76484L = interfaceC0701e4;
                this.f76485M = md1Var;
                this.f76487N = osgVar;
                this.f76488Q = z;
                this.f76489X = z2;
                this.f76490Y = qy6Var;
                this.f76491Z = nzbVar;
                this.f76486M1 = c64Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                }
                InterfaceC0701e interfaceC0701eHeightInLines = kj7.heightInLines(C0626c0.m27410heightInVpY3zN4$default(InterfaceC0701e.f5158d1, this.f76492a.m33488getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.f76493b, this.f76494c, this.f76495d);
                nsg nsgVar = this.f76496e;
                zsg zsgVar = this.f76497f;
                kdi kdiVar = this.f76498m;
                boolean zChangedInstance = zl2Var.changedInstance(this.f76492a);
                z39 z39Var = this.f76492a;
                Object objRememberedValue = zl2Var.rememberedValue();
                if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                    objRememberedValue = new b(z39Var);
                    zl2Var.updateRememberedValue(objRememberedValue);
                }
                nif.SimpleLayout(od1.bringIntoViewRequester(vsg.textFieldMinSize(msg.textFieldScroll(interfaceC0701eHeightInLines, nsgVar, zsgVar, kdiVar, (ny6) objRememberedValue).then(this.f76481C).then(this.f76482F), this.f76493b).then(this.f76483H).then(this.f76484L), this.f76485M), mk2.rememberComposableLambda(-363167407, true, new C16510a(this.f76487N, this.f76492a, this.f76488Q, this.f76489X, this.f76490Y, this.f76497f, this.f76491Z, this.f76486M1, this.f76495d), zl2Var, 54), zl2Var, 48, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11780e(kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, z39 z39Var, yvg yvgVar, int i, int i2, nsg nsgVar, zsg zsgVar, kdi kdiVar, InterfaceC0701e interfaceC0701e, InterfaceC0701e interfaceC0701e2, InterfaceC0701e interfaceC0701e3, InterfaceC0701e interfaceC0701e4, md1 md1Var, osg osgVar, boolean z, boolean z2, qy6<? super hug, bth> qy6Var, nzb nzbVar, c64 c64Var) {
            super(2);
            this.f76474a = kz6Var;
            this.f76475b = z39Var;
            this.f76476c = yvgVar;
            this.f76477d = i;
            this.f76478e = i2;
            this.f76479f = nsgVar;
            this.f76480m = zsgVar;
            this.f76462C = kdiVar;
            this.f76463F = interfaceC0701e;
            this.f76464H = interfaceC0701e2;
            this.f76465L = interfaceC0701e3;
            this.f76466M = interfaceC0701e4;
            this.f76468N = md1Var;
            this.f76469Q = osgVar;
            this.f76471X = z;
            this.f76472Y = z2;
            this.f76473Z = qy6Var;
            this.f76467M1 = nzbVar;
            this.f76470V1 = c64Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-374338080, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
            }
            this.f76474a.invoke(mk2.rememberComposableLambda(2032502107, true, new a(this.f76475b, this.f76476c, this.f76477d, this.f76478e, this.f76479f, this.f76480m, this.f76462C, this.f76463F, this.f76464H, this.f76465L, this.f76466M, this.f76468N, this.f76469Q, this.f76471X, this.f76472Y, this.f76473Z, this.f76467M1, this.f76470V1), zl2Var, 54), zl2Var, 6);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: r03$f */
    public static final class C11781f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ he1 f76516C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f76517F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int f76518H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f76519L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ nw7 f76520M;

        /* JADX INFO: renamed from: M1 */
        public final /* synthetic */ int f76521M1;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ tr8 f76522N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ boolean f76523Q;

        /* JADX INFO: renamed from: V1 */
        public final /* synthetic */ int f76524V1;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ boolean f76525X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f76526Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ int f76527Z;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zsg f76528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zsg, bth> f76529b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f76530c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ yvg f76531d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kdi f76532e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qy6<hug, bth> f76533f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ l5b f76534m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11781f(zsg zsgVar, qy6<? super zsg, bth> qy6Var, InterfaceC0701e interfaceC0701e, yvg yvgVar, kdi kdiVar, qy6<? super hug, bth> qy6Var2, l5b l5bVar, he1 he1Var, boolean z, int i, int i2, nw7 nw7Var, tr8 tr8Var, boolean z2, boolean z3, kz6<? super gz6<? super zl2, ? super Integer, bth>, ? super zl2, ? super Integer, bth> kz6Var, int i3, int i4, int i5) {
            super(2);
            this.f76528a = zsgVar;
            this.f76529b = qy6Var;
            this.f76530c = interfaceC0701e;
            this.f76531d = yvgVar;
            this.f76532e = kdiVar;
            this.f76533f = qy6Var2;
            this.f76534m = l5bVar;
            this.f76516C = he1Var;
            this.f76517F = z;
            this.f76518H = i;
            this.f76519L = i2;
            this.f76520M = nw7Var;
            this.f76522N = tr8Var;
            this.f76523Q = z2;
            this.f76525X = z3;
            this.f76526Y = kz6Var;
            this.f76527Z = i3;
            this.f76521M1 = i4;
            this.f76524V1 = i5;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            r03.CoreTextField(this.f76528a, this.f76529b, this.f76530c, this.f76531d, this.f76532e, this.f76533f, this.f76534m, this.f76516C, this.f76517F, this.f76518H, this.f76519L, this.f76520M, this.f76522N, this.f76523Q, this.f76525X, this.f76526Y, zl2Var, tsd.updateChangedFlags(this.f76527Z | 1), tsd.updateChangedFlags(this.f76521M1), this.f76524V1);
        }
    }

    /* JADX INFO: renamed from: r03$g */
    public static final class C11782g extends tt8 implements qy6<mv8, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76535a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11782g(z39 z39Var) {
            super(1);
            this.f76535a = z39Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mv8 mv8Var) {
            invoke2(mv8Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mv8 mv8Var) {
            iug layoutResult = this.f76535a.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            layoutResult.setDecorationBoxCoordinates(mv8Var);
        }
    }

    /* JADX INFO: renamed from: r03$h */
    @dwf({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1252:1\n256#2:1253\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1$1\n*L\n411#1:1253\n*E\n"})
    public static final class C11783h extends tt8 implements qy6<ip4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zsg f76537b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nzb f76538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11783h(z39 z39Var, zsg zsgVar, nzb nzbVar) {
            super(1);
            this.f76536a = z39Var;
            this.f76537b = zsgVar;
            this.f76538c = nzbVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            iug layoutResult = this.f76536a.getLayoutResult();
            if (layoutResult != null) {
                zsg zsgVar = this.f76537b;
                z39 z39Var = this.f76536a;
                nzb nzbVar = this.f76538c;
                rrg.f79167a.m32172drawQ1vqE60$foundation_release(ip4Var.getDrawContext().getCanvas(), zsgVar, z39Var.m33490getSelectionPreviewHighlightRanged9O1mEE(), z39Var.m33487getDeletionPreviewHighlightRanged9O1mEE(), nzbVar, layoutResult.getValue(), z39Var.getHighlightPaint(), z39Var.m33489getSelectionBackgroundColor0d7_KjU());
            }
        }
    }

    /* JADX INFO: renamed from: r03$i */
    public static final class C11784i extends tt8 implements qy6<in6, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ osg f76539C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ x13 f76540F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ md1 f76541H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f76543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f76544c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ stg f76545d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ zsg f76546e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nw7 f76547f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ nzb f76548m;

        /* JADX INFO: renamed from: r03$i$a */
        @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {340}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f76549a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ md1 f76550b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zsg f76551c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ z39 f76552d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ iug f76553e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ nzb f76554f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(md1 md1Var, zsg zsgVar, z39 z39Var, iug iugVar, nzb nzbVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f76550b = md1Var;
                this.f76551c = zsgVar;
                this.f76552d = z39Var;
                this.f76553e = iugVar;
                this.f76554f = nzbVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f76550b, this.f76551c, this.f76552d, this.f76553e, this.f76554f, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f76549a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    md1 md1Var = this.f76550b;
                    zsg zsgVar = this.f76551c;
                    sqg textDelegate = this.f76552d.getTextDelegate();
                    hug value = this.f76553e.getValue();
                    nzb nzbVar = this.f76554f;
                    this.f76549a = 1;
                    if (r03.bringSelectionEndIntoView(md1Var, zsgVar, textDelegate, value, nzbVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11784i(z39 z39Var, boolean z, boolean z2, stg stgVar, zsg zsgVar, nw7 nw7Var, nzb nzbVar, osg osgVar, x13 x13Var, md1 md1Var) {
            super(1);
            this.f76542a = z39Var;
            this.f76543b = z;
            this.f76544c = z2;
            this.f76545d = stgVar;
            this.f76546e = zsgVar;
            this.f76547f = nw7Var;
            this.f76548m = nzbVar;
            this.f76539C = osgVar;
            this.f76540F = x13Var;
            this.f76541H = md1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(in6 in6Var) {
            invoke2(in6Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb in6 in6Var) {
            iug layoutResult;
            if (this.f76542a.getHasFocus() == in6Var.isFocused()) {
                return;
            }
            this.f76542a.setHasFocus(in6Var.isFocused());
            if (this.f76542a.getHasFocus() && this.f76543b && !this.f76544c) {
                r03.startInputSession(this.f76545d, this.f76542a, this.f76546e, this.f76547f, this.f76548m);
            } else {
                r03.endInputSession(this.f76542a);
            }
            if (in6Var.isFocused() && (layoutResult = this.f76542a.getLayoutResult()) != null) {
                fg1.launch$default(this.f76540F, null, null, new a(this.f76541H, this.f76546e, this.f76542a, layoutResult, this.f76548m, null), 3, null);
            }
            if (in6Var.isFocused()) {
                return;
            }
            osg.m31641deselect_kEHs6E$foundation_release$default(this.f76539C, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: r03$j */
    public static final class C11785j extends tt8 implements qy6<mv8, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76555a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f76556b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ sli f76557c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ osg f76558d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ zsg f76559e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nzb f76560f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11785j(z39 z39Var, boolean z, sli sliVar, osg osgVar, zsg zsgVar, nzb nzbVar) {
            super(1);
            this.f76555a = z39Var;
            this.f76556b = z;
            this.f76557c = sliVar;
            this.f76558d = osgVar;
            this.f76559e = zsgVar;
            this.f76560f = nzbVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mv8 mv8Var) {
            invoke2(mv8Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mv8 mv8Var) {
            this.f76555a.setLayoutCoordinates(mv8Var);
            iug layoutResult = this.f76555a.getLayoutResult();
            if (layoutResult != null) {
                layoutResult.setInnerTextFieldCoordinates(mv8Var);
            }
            if (this.f76556b) {
                if (this.f76555a.getHandleState() == ce7.Selection) {
                    if (this.f76555a.getShowFloatingToolbar() && this.f76557c.isWindowFocused()) {
                        this.f76558d.showSelectionToolbar$foundation_release();
                    } else {
                        this.f76558d.hideSelectionToolbar$foundation_release();
                    }
                    this.f76555a.setShowSelectionHandleStart(psg.isSelectionHandleInVisibleBound(this.f76558d, true));
                    this.f76555a.setShowSelectionHandleEnd(psg.isSelectionHandleInVisibleBound(this.f76558d, false));
                    this.f76555a.setShowCursorHandle(jvg.m30587getCollapsedimpl(this.f76559e.m33527getSelectiond9O1mEE()));
                } else if (this.f76555a.getHandleState() == ce7.Cursor) {
                    this.f76555a.setShowCursorHandle(psg.isSelectionHandleInVisibleBound(this.f76558d, true));
                }
                r03.notifyFocusedRect(this.f76555a, this.f76559e, this.f76560f);
                iug layoutResult2 = this.f76555a.getLayoutResult();
                if (layoutResult2 != null) {
                    z39 z39Var = this.f76555a;
                    zsg zsgVar = this.f76559e;
                    nzb nzbVar = this.f76560f;
                    ytg inputSession = z39Var.getInputSession();
                    if (inputSession == null || !z39Var.getHasFocus()) {
                        return;
                    }
                    rrg.f79167a.updateTextLayoutResult$foundation_release(inputSession, zsgVar, nzbVar, layoutResult2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r03$k */
    public static final class C11786k extends tt8 implements qy6<Boolean, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11786k(z39 z39Var) {
            super(1);
            this.f76561a = z39Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return bth.f14751a;
        }

        public final void invoke(boolean z) {
            this.f76561a.setInTouchMode(z);
        }
    }

    /* JADX INFO: renamed from: r03$l */
    public static final class C11787l extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0723l f76563b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f76564c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f76565d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ osg f76566e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nzb f76567f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11787l(z39 z39Var, C0723l c0723l, boolean z, boolean z2, osg osgVar, nzb nzbVar) {
            super(1);
            this.f76562a = z39Var;
            this.f76563b = c0723l;
            this.f76564c = z;
            this.f76565d = z2;
            this.f76566e = osgVar;
            this.f76567f = nzbVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m32058invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m32058invokek4lQ0M(long j) {
            r03.tapToFocus(this.f76562a, this.f76563b, !this.f76564c);
            if (this.f76562a.getHasFocus() && this.f76565d) {
                if (this.f76562a.getHandleState() == ce7.Selection) {
                    this.f76566e.m31645deselect_kEHs6E$foundation_release(izb.m30418boximpl(j));
                    return;
                }
                iug layoutResult = this.f76562a.getLayoutResult();
                if (layoutResult != null) {
                    z39 z39Var = this.f76562a;
                    rrg.f79167a.m32174setCursorOffsetULxng0E$foundation_release(j, layoutResult, z39Var.getProcessor(), this.f76567f, z39Var.getOnValueChange());
                    if (z39Var.getTextDelegate().getText().length() > 0) {
                        z39Var.setHandleState(ce7.Cursor);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r03$m */
    public static final class C11788m extends tt8 implements ny6<nsg> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t7c f76568a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11788m(t7c t7cVar) {
            super(0);
            this.f76568a = t7cVar;
        }

        @Override // p000.ny6
        @yfb
        public final nsg invoke() {
            return new nsg(this.f76568a, 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: r03$n */
    public static final class C11789n extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ nzb f76569C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ osg f76570F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ C0723l f76571H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ieh f76572a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zsg f76573b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f76574c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f76575d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f76576e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nw7 f76577f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ z39 f76578m;

        /* JADX INFO: renamed from: r03$n$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f76579a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(osg osgVar) {
                super(0);
                this.f76579a = osgVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                this.f76579a.paste$foundation_release();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$b */
        public static final class b extends tt8 implements qy6<List<hug>, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76580a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z39 z39Var) {
                super(1);
                this.f76580a = z39Var;
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb List<hug> list) {
                boolean z;
                if (this.f76580a.getLayoutResult() != null) {
                    iug layoutResult = this.f76580a.getLayoutResult();
                    md8.checkNotNull(layoutResult);
                    list.add(layoutResult.getValue());
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX INFO: renamed from: r03$n$c */
        public static final class c extends tt8 implements qy6<C9041lz, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76581a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ eye f76582b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(z39 z39Var, eye eyeVar) {
                super(1);
                this.f76581a = z39Var;
                this.f76582b = eyeVar;
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb C9041lz c9041lz) {
                bth bthVar;
                ytg inputSession = this.f76581a.getInputSession();
                if (inputSession != null) {
                    z39 z39Var = this.f76581a;
                    rrg.f79167a.onEditCommand$foundation_release(l82.listOf((Object[]) new lw4[]{new x44(), new ac2(c9041lz, 1)}), z39Var.getProcessor(), z39Var.getOnValueChange(), inputSession);
                    bthVar = bth.f14751a;
                } else {
                    bthVar = null;
                }
                if (bthVar == null) {
                    this.f76581a.getOnValueChange().invoke(new zsg(c9041lz.getText(), kvg.TextRange(c9041lz.getText().length()), (jvg) null, 4, (jt3) null));
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$d */
        public static final class d extends tt8 implements qy6<C9041lz, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f76583a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f76584b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ z39 f76585c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ eye f76586d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ zsg f76587e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z, boolean z2, z39 z39Var, eye eyeVar, zsg zsgVar) {
                super(1);
                this.f76583a = z;
                this.f76584b = z2;
                this.f76585c = z39Var;
                this.f76586d = eyeVar;
                this.f76587e = zsgVar;
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb C9041lz c9041lz) {
                bth bthVar;
                if (this.f76583a || !this.f76584b) {
                    return Boolean.FALSE;
                }
                ytg inputSession = this.f76585c.getInputSession();
                if (inputSession != null) {
                    z39 z39Var = this.f76585c;
                    rrg.f79167a.onEditCommand$foundation_release(l82.listOf((Object[]) new lw4[]{new ew5(), new ac2(c9041lz, 1)}), z39Var.getProcessor(), z39Var.getOnValueChange(), inputSession);
                    bthVar = bth.f14751a;
                } else {
                    bthVar = null;
                }
                if (bthVar == null) {
                    zsg zsgVar = this.f76587e;
                    this.f76585c.getOnValueChange().invoke(new zsg(m9g.replaceRange((CharSequence) zsgVar.getText(), jvg.m30593getStartimpl(zsgVar.m33527getSelectiond9O1mEE()), jvg.m30588getEndimpl(zsgVar.m33527getSelectiond9O1mEE()), (CharSequence) c9041lz).toString(), kvg.TextRange(jvg.m30593getStartimpl(zsgVar.m33527getSelectiond9O1mEE()) + c9041lz.length()), (jvg) null, 4, (jt3) null));
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$e */
        public static final class e extends tt8 implements kz6<Integer, Integer, Boolean, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ nzb f76588a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f76589b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zsg f76590c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ osg f76591d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z39 f76592e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(nzb nzbVar, boolean z, zsg zsgVar, osg osgVar, z39 z39Var) {
                super(3);
                this.f76588a = nzbVar;
                this.f76589b = z;
                this.f76590c = zsgVar;
                this.f76591d = osgVar;
                this.f76592e = z39Var;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            @yfb
            public final Boolean invoke(int i, int i2, boolean z) {
                if (!z) {
                    i = this.f76588a.transformedToOriginal(i);
                }
                if (!z) {
                    i2 = this.f76588a.transformedToOriginal(i2);
                }
                boolean z2 = false;
                if (this.f76589b && (i != jvg.m30593getStartimpl(this.f76590c.m33527getSelectiond9O1mEE()) || i2 != jvg.m30588getEndimpl(this.f76590c.m33527getSelectiond9O1mEE()))) {
                    if (Math.min(i, i2) < 0 || Math.max(i, i2) > this.f76590c.getAnnotatedString().length()) {
                        this.f76591d.exitSelectionMode$foundation_release();
                    } else {
                        if (z || i == i2) {
                            this.f76591d.exitSelectionMode$foundation_release();
                        } else {
                            osg.enterSelectionMode$foundation_release$default(this.f76591d, false, 1, null);
                        }
                        this.f76592e.getOnValueChange().invoke(new zsg(this.f76590c.getAnnotatedString(), kvg.TextRange(i, i2), (jvg) null, 4, (jt3) null));
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }

        /* JADX INFO: renamed from: r03$n$f */
        public static final class f extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76593a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ nw7 f76594b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(z39 z39Var, nw7 nw7Var) {
                super(0);
                this.f76593a = z39Var;
                this.f76594b = nw7Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                this.f76593a.getOnImeActionPerformed().invoke(mw7.m31065boximpl(this.f76594b.m31264getImeActioneUduSuo()));
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$g */
        public static final class g extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z39 f76595a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0723l f76596b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f76597c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(z39 z39Var, C0723l c0723l, boolean z) {
                super(0);
                this.f76595a = z39Var;
                this.f76596b = c0723l;
                this.f76597c = z;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                r03.tapToFocus(this.f76595a, this.f76596b, !this.f76597c);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$h */
        public static final class h extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f76598a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(osg osgVar) {
                super(0);
                this.f76598a = osgVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                osg.enterSelectionMode$foundation_release$default(this.f76598a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$i */
        public static final class i extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f76599a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(osg osgVar) {
                super(0);
                this.f76599a = osgVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                osg.copy$foundation_release$default(this.f76599a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: r03$n$j */
        public static final class j extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ osg f76600a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(osg osgVar) {
                super(0);
                this.f76600a = osgVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                this.f76600a.cut$foundation_release();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11789n(ieh iehVar, zsg zsgVar, boolean z, boolean z2, boolean z3, nw7 nw7Var, z39 z39Var, nzb nzbVar, osg osgVar, C0723l c0723l) {
            super(1);
            this.f76572a = iehVar;
            this.f76573b = zsgVar;
            this.f76574c = z;
            this.f76575d = z2;
            this.f76576e = z3;
            this.f76577f = nw7Var;
            this.f76578m = z39Var;
            this.f76569C = nzbVar;
            this.f76570F = osgVar;
            this.f76571H = c0723l;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setEditableText(eyeVar, this.f76572a.getText());
            bye.m28186setTextSelectionRangeFDrldGo(eyeVar, this.f76573b.m33527getSelectiond9O1mEE());
            if (!this.f76574c) {
                bye.disabled(eyeVar);
            }
            if (this.f76575d) {
                bye.password(eyeVar);
            }
            boolean z = this.f76574c && !this.f76576e;
            bye.setEditable(eyeVar, z);
            bye.getTextLayoutResult$default(eyeVar, null, new b(this.f76578m), 1, null);
            if (z) {
                bye.setText$default(eyeVar, null, new c(this.f76578m, eyeVar), 1, null);
                bye.insertTextAtCursor$default(eyeVar, null, new d(this.f76576e, this.f76574c, this.f76578m, eyeVar, this.f76573b), 1, null);
            }
            bye.setSelection$default(eyeVar, null, new e(this.f76569C, this.f76574c, this.f76573b, this.f76570F, this.f76578m), 1, null);
            bye.m28181onImeAction9UiTYpY$default(eyeVar, this.f76577f.m31264getImeActioneUduSuo(), null, new f(this.f76578m, this.f76577f), 2, null);
            bye.onClick$default(eyeVar, null, new g(this.f76578m, this.f76571H, this.f76576e), 1, null);
            bye.onLongClick$default(eyeVar, null, new h(this.f76570F), 1, null);
            if (!jvg.m30587getCollapsedimpl(this.f76573b.m33527getSelectiond9O1mEE()) && !this.f76575d) {
                bye.copyText$default(eyeVar, null, new i(this.f76570F), 1, null);
                if (this.f76574c && !this.f76576e) {
                    bye.cutText$default(eyeVar, null, new j(this.f76570F), 1, null);
                }
            }
            if (!this.f76574c || this.f76576e) {
                return;
            }
            bye.pasteText$default(eyeVar, null, new a(this.f76570F), 1, null);
        }
    }

    /* JADX INFO: renamed from: r03$o */
    public static final class C11790o extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76601a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0723l f76602b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nw7 f76603c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t39 f76604d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11790o(z39 z39Var, C0723l c0723l, nw7 nw7Var, t39 t39Var) {
            super(0);
            this.f76601a = z39Var;
            this.f76602b = c0723l;
            this.f76603c = nw7Var;
            this.f76604d = t39Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            if (!this.f76601a.getHasFocus()) {
                this.f76602b.requestFocus();
            }
            int iM31265getKeyboardTypePjHm6EE = this.f76603c.m31265getKeyboardTypePjHm6EE();
            xr8.C15260a c15260a = xr8.f99029b;
            if (!xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33260getPasswordPjHm6EE()) && !xr8.m33241equalsimpl0(this.f76603c.m31265getKeyboardTypePjHm6EE(), c15260a.m33259getNumberPasswordPjHm6EE())) {
                this.f76604d.startStylusHandwriting();
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: r03$p */
    public static final class C11791p extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f76605a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ osg f76606b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zl2, Integer, bth> f76607c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f76608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11791p(InterfaceC0701e interfaceC0701e, osg osgVar, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f76605a = interfaceC0701e;
            this.f76606b = osgVar;
            this.f76607c = gz6Var;
            this.f76608d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            r03.CoreTextFieldRootBox(this.f76605a, this.f76606b, this.f76607c, zl2Var, tsd.updateChangedFlags(this.f76608d | 1));
        }
    }

    /* JADX INFO: renamed from: r03$q */
    public static final class C11792q extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f76609a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f76610b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f76611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11792q(osg osgVar, boolean z, int i) {
            super(2);
            this.f76609a = osgVar;
            this.f76610b = z;
            this.f76611c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            r03.SelectionToolbarAndHandles(this.f76609a, this.f76610b, zl2Var, tsd.updateChangedFlags(this.f76611c | 1));
        }
    }

    /* JADX INFO: renamed from: r03$r */
    public static final class C11793r implements qzb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f76612a;

        public C11793r(long j) {
            this.f76612a = j;
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0 */
        public final long mo29872provideF1C5BW0() {
            return this.f76612a;
        }
    }

    /* JADX INFO: renamed from: r03$s */
    @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {1198}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11794s extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f76613a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f76614b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zqg f76615c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ osg f76616d;

        /* JADX INFO: renamed from: r03$s$a */
        @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f76617a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f76618b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s2d f76619c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ zqg f76620d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ osg f76621e;

            /* JADX INFO: renamed from: r03$s$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {1202}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class C16513a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f76622a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ s2d f76623b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zqg f76624c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16513a(s2d s2dVar, zqg zqgVar, zy2<? super C16513a> zy2Var) {
                    super(2, zy2Var);
                    this.f76623b = s2dVar;
                    this.f76624c = zqgVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16513a(this.f76623b, this.f76624c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16513a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f76622a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        s2d s2dVar = this.f76623b;
                        zqg zqgVar = this.f76624c;
                        this.f76622a = 1;
                        if (ql9.detectDownAndDragGesturesWithObserver(s2dVar, zqgVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: r03$s$a$b */
            @ck3(m4009c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", m4010f = "CoreTextField.kt", m4011i = {}, m4012l = {1205}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f76625a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ s2d f76626b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ osg f76627c;

                /* JADX INFO: renamed from: r03$s$a$b$a, reason: collision with other inner class name */
                public static final class C16514a extends tt8 implements qy6<izb, bth> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ osg f76628a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16514a(osg osgVar) {
                        super(1);
                        this.f76628a = osgVar;
                    }

                    @Override // p000.qy6
                    public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
                        m32059invokek4lQ0M(izbVar.m30439unboximpl());
                        return bth.f14751a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m32059invokek4lQ0M(long j) {
                        this.f76628a.showSelectionToolbar$foundation_release();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(s2d s2dVar, osg osgVar, zy2<? super b> zy2Var) {
                    super(2, zy2Var);
                    this.f76626b = s2dVar;
                    this.f76627c = osgVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new b(this.f76626b, this.f76627c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f76625a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        s2d s2dVar = this.f76626b;
                        C16514a c16514a = new C16514a(this.f76627c);
                        this.f76625a = 1;
                        if (dmg.detectTapGestures$default(s2dVar, null, null, null, c16514a, this, 7, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    return bth.f14751a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s2d s2dVar, zqg zqgVar, osg osgVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f76619c = s2dVar;
                this.f76620d = zqgVar;
                this.f76621e = osgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f76619c, this.f76620d, this.f76621e, zy2Var);
                aVar.f76618b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f76617a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f76618b;
                b23 b23Var = b23.f12444d;
                fg1.launch$default(x13Var, null, b23Var, new C16513a(this.f76619c, this.f76620d, null), 1, null);
                fg1.launch$default(x13Var, null, b23Var, new b(this.f76619c, this.f76621e, null), 1, null);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11794s(zqg zqgVar, osg osgVar, zy2<? super C11794s> zy2Var) {
            super(2, zy2Var);
            this.f76615c = zqgVar;
            this.f76616d = osgVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C11794s c11794s = new C11794s(this.f76615c, this.f76616d, zy2Var);
            c11794s.f76614b = obj;
            return c11794s;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C11794s) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f76613a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                a aVar = new a((s2d) this.f76614b, this.f76615c, this.f76616d, null);
                this.f76613a = 1;
                if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: r03$t */
    public static final class C11795t extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f76629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11795t(long j) {
            super(1);
            this.f76629a = j;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            eyeVar.set(uwe.getSelectionHandleInfoKey(), new twe(zd7.Cursor, this.f76629a, swe.Middle, true, null));
        }
    }

    /* JADX INFO: renamed from: r03$u */
    public static final class C11796u extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ osg f76630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f76631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11796u(osg osgVar, int i) {
            super(2);
            this.f76630a = osgVar;
            this.f76631b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            r03.TextFieldCursorHandle(this.f76630a, zl2Var, tsd.updateChangedFlags(this.f76631b | 1));
        }
    }

    /* JADX INFO: renamed from: r03$v */
    public static final class C11797v extends tt8 implements qy6<kq8, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f76632a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ osg f76633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11797v(z39 z39Var, osg osgVar) {
            super(1);
            this.f76632a = z39Var;
            this.f76633b = osgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(kq8 kq8Var) {
            return m32060invokeZmokQxo(kq8Var.m30741unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m32060invokeZmokQxo(@yfb KeyEvent keyEvent) {
            boolean z;
            if (this.f76632a.getHandleState() == ce7.Selection && mq8.m31038cancelsTextSelectionZmokQxo(keyEvent)) {
                z = true;
                osg.m31641deselect_kEHs6E$foundation_release$default(this.f76633b, null, 1, null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05bd A[PHI: r12 r36 r42
  0x05bd: PHI (r12v16 nw7) = (r12v11 nw7), (r12v17 nw7) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]
  0x05bd: PHI (r36v10 int) = (r36v7 int), (r36v12 int) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]
  0x05bd: PHI (r42v3 int) = (r42v1 int), (r42v4 int) binds: [B:316:0x05bb, B:313:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @p000.hk2
    @p000.ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(@p000.yfb p000.zsg r54, @p000.yfb p000.qy6<? super p000.zsg, p000.bth> r55, @p000.gib androidx.compose.p002ui.InterfaceC0701e r56, @p000.gib p000.yvg r57, @p000.gib p000.kdi r58, @p000.gib p000.qy6<? super p000.hug, p000.bth> r59, @p000.gib p000.l5b r60, @p000.gib p000.he1 r61, boolean r62, int r63, int r64, @p000.gib p000.nw7 r65, @p000.gib p000.tr8 r66, boolean r67, boolean r68, @p000.gib p000.kz6<? super p000.gz6<? super p000.zl2, ? super java.lang.Integer, p000.bth>, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r69, @p000.gib p000.zl2 r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instruction units count: 2545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r03.CoreTextField(zsg, qy6, androidx.compose.ui.e, yvg, kdi, qy6, l5b, he1, boolean, int, int, nw7, tr8, boolean, boolean, kz6, zl2, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(i2g<Boolean> i2gVar) {
        return i2gVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(InterfaceC0701e interfaceC0701e, osg osgVar, gz6<? super zl2, ? super Integer, bth> gz6Var, zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-20551815);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(osgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-20551815, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            uba ubaVarMaybeCachedBoxMeasurePolicy = pc1.maybeCachedBoxMeasurePolicy(InterfaceC9407mm.f61437a.getTopStart(), true);
            int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2VarStartRestartGroup, 0);
            qn2 currentCompositionLocalMap = zl2VarStartRestartGroup.getCurrentCompositionLocalMap();
            InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2VarStartRestartGroup, interfaceC0701e);
            xl2.C15179a c15179a = xl2.f98343p;
            ny6<xl2> constructor = c15179a.getConstructor();
            if (zl2VarStartRestartGroup.getApplier() == null) {
                dl2.invalidApplier();
            }
            zl2VarStartRestartGroup.startReusableNode();
            if (zl2VarStartRestartGroup.getInserting()) {
                zl2VarStartRestartGroup.createNode(constructor);
            } else {
                zl2VarStartRestartGroup.useNode();
            }
            zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2VarStartRestartGroup);
            twh.m32456setimpl(zl2VarM32449constructorimpl, ubaVarMaybeCachedBoxMeasurePolicy, c15179a.getSetMeasurePolicy());
            twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
            gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
            if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
            C0629e c0629e = C0629e.f4557a;
            ay2.ContextMenuArea(osgVar, gz6Var, zl2VarStartRestartGroup, (i2 >> 3) & 126);
            zl2VarStartRestartGroup.endNode();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11791p(interfaceC0701e, osgVar, gz6Var, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void SelectionToolbarAndHandles(osg osgVar, boolean z, zl2 zl2Var, int i) {
        int i2;
        iug layoutResult;
        hug value;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(626339208);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(osgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                zl2VarStartRestartGroup.startReplaceGroup(-1286242594);
                z39 state$foundation_release = osgVar.getState$foundation_release();
                hug hugVar = null;
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    z39 state$foundation_release2 = osgVar.getState$foundation_release();
                    if (!(state$foundation_release2 != null ? state$foundation_release2.isLayoutResultStale() : true)) {
                        hugVar = value;
                    }
                }
                if (hugVar == null) {
                    zl2VarStartRestartGroup.startReplaceGroup(-1285984396);
                } else {
                    zl2VarStartRestartGroup.startReplaceGroup(-1285984395);
                    if (jvg.m30587getCollapsedimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE())) {
                        zl2VarStartRestartGroup.startReplaceGroup(-1679637798);
                        zl2VarStartRestartGroup.endReplaceGroup();
                    } else {
                        zl2VarStartRestartGroup.startReplaceGroup(-1680616096);
                        int iOriginalToTransformed = osgVar.getOffsetMapping$foundation_release().originalToTransformed(jvg.m30593getStartimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE()));
                        int iOriginalToTransformed2 = osgVar.getOffsetMapping$foundation_release().originalToTransformed(jvg.m30588getEndimpl(osgVar.getValue$foundation_release().m33527getSelectiond9O1mEE()));
                        q5e bidiRunDirection = hugVar.getBidiRunDirection(iOriginalToTransformed);
                        q5e bidiRunDirection2 = hugVar.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                        z39 state$foundation_release3 = osgVar.getState$foundation_release();
                        if (state$foundation_release3 == null || !state$foundation_release3.getShowSelectionHandleStart()) {
                            zl2VarStartRestartGroup.startReplaceGroup(-1679975078);
                            zl2VarStartRestartGroup.endReplaceGroup();
                        } else {
                            zl2VarStartRestartGroup.startReplaceGroup(-1680216289);
                            psg.TextFieldSelectionHandle(true, bidiRunDirection, osgVar, zl2VarStartRestartGroup, ((i2 << 6) & C1340j.f10444b) | 6);
                            zl2VarStartRestartGroup.endReplaceGroup();
                        }
                        z39 state$foundation_release4 = osgVar.getState$foundation_release();
                        if (state$foundation_release4 == null || !state$foundation_release4.getShowSelectionHandleEnd()) {
                            zl2VarStartRestartGroup.startReplaceGroup(-1679655654);
                            zl2VarStartRestartGroup.endReplaceGroup();
                        } else {
                            zl2VarStartRestartGroup.startReplaceGroup(-1679895904);
                            psg.TextFieldSelectionHandle(false, bidiRunDirection2, osgVar, zl2VarStartRestartGroup, ((i2 << 6) & C1340j.f10444b) | 6);
                            zl2VarStartRestartGroup.endReplaceGroup();
                        }
                        zl2VarStartRestartGroup.endReplaceGroup();
                    }
                    z39 state$foundation_release5 = osgVar.getState$foundation_release();
                    if (state$foundation_release5 != null) {
                        if (osgVar.isTextChanged$foundation_release()) {
                            state$foundation_release5.setShowFloatingToolbar(false);
                        }
                        if (state$foundation_release5.getHasFocus()) {
                            if (state$foundation_release5.getShowFloatingToolbar()) {
                                osgVar.showSelectionToolbar$foundation_release();
                            } else {
                                osgVar.hideSelectionToolbar$foundation_release();
                            }
                        }
                        bth bthVar = bth.f14751a;
                    }
                }
                zl2VarStartRestartGroup.endReplaceGroup();
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(651305535);
                zl2VarStartRestartGroup.endReplaceGroup();
                osgVar.hideSelectionToolbar$foundation_release();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11792q(osgVar, z, i));
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void TextFieldCursorHandle(@yfb osg osgVar, @gib zl2 zl2Var, int i) {
        int i2;
        C9041lz transformedText$foundation_release;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1436003720);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(osgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            z39 state$foundation_release = osgVar.getState$foundation_release();
            if (state$foundation_release == null || !state$foundation_release.getShowCursorHandle() || (transformedText$foundation_release = osgVar.getTransformedText$foundation_release()) == null || transformedText$foundation_release.length() <= 0) {
                zl2VarStartRestartGroup.startReplaceGroup(-284257090);
                zl2VarStartRestartGroup.endReplaceGroup();
            } else {
                zl2VarStartRestartGroup.startReplaceGroup(-285446808);
                boolean zChanged = zl2VarStartRestartGroup.changed(osgVar);
                Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                    objRememberedValue = osgVar.cursorDragObserver$foundation_release();
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                zqg zqgVar = (zqg) objRememberedValue;
                long jM31647getCursorPositiontuRUvjQ$foundation_release = osgVar.m31647getCursorPositiontuRUvjQ$foundation_release((c64) zl2VarStartRestartGroup.consume(sn2.getLocalDensity()));
                boolean zChanged2 = zl2VarStartRestartGroup.changed(jM31647getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                    objRememberedValue2 = new C11793r(jM31647getCursorPositiontuRUvjQ$foundation_release);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                qzb qzbVar = (qzb) objRememberedValue2;
                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(zqgVar) | zl2VarStartRestartGroup.changedInstance(osgVar);
                Object objRememberedValue3 = zl2VarStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == zl2.f105372a.getEmpty()) {
                    objRememberedValue3 = new C11794s(zqgVar, osgVar, null);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                InterfaceC0701e interfaceC0701ePointerInput = vgg.pointerInput(aVar, zqgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3);
                boolean zChanged3 = zl2VarStartRestartGroup.changed(jM31647getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue4 = zl2VarStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == zl2.f105372a.getEmpty()) {
                    objRememberedValue4 = new C11795t(jM31647getCursorPositiontuRUvjQ$foundation_release);
                    zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                C16220zr.m33511CursorHandleUSBMPiE(qzbVar, qxe.semantics$default(interfaceC0701ePointerInput, false, (qy6) objRememberedValue4, 1, null), 0L, zl2VarStartRestartGroup, 0, 4);
                zl2VarStartRestartGroup.endReplaceGroup();
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11796u(osgVar, i));
        }
    }

    @gib
    public static final Object bringSelectionEndIntoView(@yfb md1 md1Var, @yfb zsg zsgVar, @yfb sqg sqgVar, @yfb hug hugVar, @yfb nzb nzbVar, @yfb zy2<? super bth> zy2Var) {
        int iOriginalToTransformed = nzbVar.originalToTransformed(jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()));
        Object objBringIntoView = md1Var.bringIntoView(iOriginalToTransformed < hugVar.getLayoutInput().getText().length() ? hugVar.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? hugVar.getBoundingBox(iOriginalToTransformed - 1) : new rud(0.0f, 0.0f, 1.0f, r78.m32086getHeightimpl(srg.computeSizeForDefaultText$default(sqgVar.getStyle(), sqgVar.getDensity(), sqgVar.getFontFamilyResolver(), null, 0, 24, null))), zy2Var);
        return objBringIntoView == pd8.getCOROUTINE_SUSPENDED() ? objBringIntoView : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(z39 z39Var) {
        ytg inputSession = z39Var.getInputSession();
        if (inputSession != null) {
            rrg.f79167a.onBlur$foundation_release(inputSession, z39Var.getProcessor(), z39Var.getOnValueChange());
        }
        z39Var.setInputSession(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(z39 z39Var, zsg zsgVar, nzb nzbVar) {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            iug layoutResult = z39Var.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            ytg inputSession = z39Var.getInputSession();
            if (inputSession == null) {
                return;
            }
            mv8 layoutCoordinates = z39Var.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            rrg.f79167a.notifyFocusedRect$foundation_release(zsgVar, z39Var.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, z39Var.getHasFocus(), nzbVar);
            bth bthVar = bth.f14751a;
        } finally {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        }
    }

    private static final InterfaceC0701e previewKeyEventToDeselectOnBack(InterfaceC0701e interfaceC0701e, z39 z39Var, osg osgVar) {
        return C0743a.onPreviewKeyEvent(interfaceC0701e, new C11797v(z39Var, osgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(stg stgVar, z39 z39Var, zsg zsgVar, nw7 nw7Var, nzb nzbVar) {
        z39Var.setInputSession(rrg.f79167a.onFocus$foundation_release(stgVar, zsgVar, z39Var.getProcessor(), nw7Var, z39Var.getOnValueChange(), z39Var.getOnImeActionPerformed()));
        notifyFocusedRect(z39Var, zsgVar, nzbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(z39 z39Var, C0723l c0723l, boolean z) {
        suf keyboardController;
        if (!z39Var.getHasFocus()) {
            c0723l.requestFocus();
        } else {
            if (!z || (keyboardController = z39Var.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }
}
