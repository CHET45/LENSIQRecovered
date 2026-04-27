package p000;

import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import androidx.mediarouter.media.C1340j;
import java.util.Arrays;
import p000.jvd;
import p000.z49;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,747:1\n74#2:748\n74#2:755\n74#2:762\n74#2:769\n74#2:776\n74#2:786\n74#2:793\n74#2:800\n74#2:807\n74#2:814\n74#2:824\n1116#3,6:749\n1116#3,6:756\n1116#3,6:763\n1116#3,6:770\n1116#3,6:780\n1116#3,6:787\n1116#3,6:794\n1116#3,6:801\n1116#3,6:808\n1116#3,6:818\n1116#3,6:825\n83#4,3:777\n83#4,3:815\n81#5:831\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n56#1:748\n134#1:755\n197#1:762\n262#1:769\n323#1:776\n349#1:786\n467#1:793\n530#1:800\n595#1:807\n656#1:814\n682#1:824\n67#1:749,6\n137#1:756,6\n200#1:763,6\n265#1:770,6\n326#1:780,6\n359#1:787,6\n470#1:794,6\n533#1:801,6\n598#1:808,6\n659#1:818,6\n692#1:825,6\n326#1:777,3\n659#1:815,3\n66#1:831\n*E\n"})
public final class z49 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f104055a = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f104056b = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: renamed from: z49$a */
    @dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,747:1\n64#2,5:748\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n76#1:748,5\n*E\n"})
    public static final class C15987a extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104057a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1143j.a f104058b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<ny6<bth>> f104059c;

        /* JADX INFO: renamed from: z49$a$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n1#1,497:1\n77#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g59 f104060a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC1154n f104061b;

            public a(g59 g59Var, InterfaceC1154n interfaceC1154n) {
                this.f104060a = g59Var;
                this.f104061b = interfaceC1154n;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f104060a.getLifecycle().removeObserver(this.f104061b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15987a(g59 g59Var, AbstractC1143j.a aVar, i2g<? extends ny6<bth>> i2gVar) {
            super(1);
            this.f104057a = g59Var;
            this.f104058b = aVar;
            this.f104059c = i2gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AbstractC1143j.a aVar, i2g i2gVar, g59 g59Var, AbstractC1143j.a aVar2) {
            if (aVar2 == aVar) {
                z49.LifecycleEventEffect$lambda$0(i2gVar).invoke();
            }
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            final AbstractC1143j.a aVar = this.f104058b;
            final i2g<ny6<bth>> i2gVar = this.f104059c;
            InterfaceC1154n interfaceC1154n = new InterfaceC1154n() { // from class: y49
                @Override // androidx.lifecycle.InterfaceC1154n
                public final void onStateChanged(g59 g59Var, AbstractC1143j.a aVar2) {
                    z49.C15987a.invoke$lambda$0(aVar, i2gVar, g59Var, aVar2);
                }
            };
            this.f104057a.getLifecycle().addObserver(interfaceC1154n);
            return new a(this.f104057a, interfaceC1154n);
        }
    }

    /* JADX INFO: renamed from: z49$b */
    public static final class C15988b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1143j.a f104062a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f104063b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<bth> f104064c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104065d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104066e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15988b(AbstractC1143j.a aVar, g59 g59Var, ny6<bth> ny6Var, int i, int i2) {
            super(2);
            this.f104062a = aVar;
            this.f104063b = g59Var;
            this.f104064c = ny6Var;
            this.f104065d = i;
            this.f104066e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleEventEffect(this.f104062a, this.f104063b, this.f104064c, zl2Var, tsd.updateChangedFlags(this.f104065d | 1), this.f104066e);
        }
    }

    /* JADX INFO: renamed from: z49$c */
    public static final class C15989c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104067a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f104068b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<l59, i59> f104069c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104070d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104071e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15989c(Object obj, g59 g59Var, qy6<? super l59, ? extends i59> qy6Var, int i, int i2) {
            super(2);
            this.f104067a = obj;
            this.f104068b = g59Var;
            this.f104069c = qy6Var;
            this.f104070d = i;
            this.f104071e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleResumeEffect(this.f104067a, this.f104068b, this.f104069c, zl2Var, tsd.updateChangedFlags(this.f104070d | 1), this.f104071e);
        }
    }

    /* JADX INFO: renamed from: z49$d */
    public static final class C15990d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104072a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f104073b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ g59 f104074c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<l59, i59> f104075d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104076e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f104077f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15990d(Object obj, Object obj2, g59 g59Var, qy6<? super l59, ? extends i59> qy6Var, int i, int i2) {
            super(2);
            this.f104072a = obj;
            this.f104073b = obj2;
            this.f104074c = g59Var;
            this.f104075d = qy6Var;
            this.f104076e = i;
            this.f104077f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleResumeEffect(this.f104072a, this.f104073b, this.f104074c, this.f104075d, zl2Var, tsd.updateChangedFlags(this.f104076e | 1), this.f104077f);
        }
    }

    /* JADX INFO: renamed from: z49$e */
    public static final class C15991e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104078a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f104079b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f104080c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g59 f104081d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<l59, i59> f104082e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f104083f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f104084m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15991e(Object obj, Object obj2, Object obj3, g59 g59Var, qy6<? super l59, ? extends i59> qy6Var, int i, int i2) {
            super(2);
            this.f104078a = obj;
            this.f104079b = obj2;
            this.f104080c = obj3;
            this.f104081d = g59Var;
            this.f104082e = qy6Var;
            this.f104083f = i;
            this.f104084m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleResumeEffect(this.f104078a, this.f104079b, this.f104080c, this.f104081d, this.f104082e, zl2Var, tsd.updateChangedFlags(this.f104083f | 1), this.f104084m);
        }
    }

    /* JADX INFO: renamed from: z49$f */
    public static final class C15992f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f104085a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f104086b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<l59, i59> f104087c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104088d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104089e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15992f(Object[] objArr, g59 g59Var, qy6<? super l59, ? extends i59> qy6Var, int i, int i2) {
            super(2);
            this.f104085a = objArr;
            this.f104086b = g59Var;
            this.f104087c = qy6Var;
            this.f104088d = i;
            this.f104089e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            Object[] objArr = this.f104085a;
            z49.LifecycleResumeEffect(Arrays.copyOf(objArr, objArr.length), this.f104086b, (qy6<? super l59, ? extends i59>) this.f104087c, zl2Var, tsd.updateChangedFlags(this.f104088d | 1), this.f104089e);
        }
    }

    /* JADX INFO: renamed from: z49$g */
    public static final class C15993g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104090a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<l59, i59> f104091b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f104092c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15993g(g59 g59Var, qy6<? super l59, ? extends i59> qy6Var, int i, int i2) {
            super(2);
            this.f104090a = g59Var;
            this.f104091b = qy6Var;
            this.f104092c = i;
            this.f104093d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleResumeEffect(this.f104090a, this.f104091b, zl2Var, tsd.updateChangedFlags(this.f104092c | 1), this.f104093d);
        }
    }

    /* JADX INFO: renamed from: z49$h */
    @dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,747:1\n64#2,5:748\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n*L\n708#1:748,5\n*E\n"})
    public static final class C15994h extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104094a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l59 f104095b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<l59, i59> f104096c;

        /* JADX INFO: renamed from: z49$h$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f104097a;

            static {
                int[] iArr = new int[AbstractC1143j.a.values().length];
                try {
                    iArr[AbstractC1143j.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f104097a = iArr;
            }
        }

        /* JADX INFO: renamed from: z49$h$b */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1$1\n*L\n1#1,497:1\n709#2,3:498\n*E\n"})
        public static final class b implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g59 f104098a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC1154n f104099b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h f104100c;

            public b(g59 g59Var, InterfaceC1154n interfaceC1154n, jvd.C8121h c8121h) {
                this.f104098a = g59Var;
                this.f104099b = interfaceC1154n;
                this.f104100c = c8121h;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f104098a.getLifecycle().removeObserver(this.f104099b);
                i59 i59Var = (i59) this.f104100c.f52110a;
                if (i59Var != null) {
                    i59Var.runPauseOrOnDisposeEffect();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15994h(g59 g59Var, l59 l59Var, qy6<? super l59, ? extends i59> qy6Var) {
            super(1);
            this.f104094a = g59Var;
            this.f104095b = l59Var;
            this.f104096c = qy6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        public static final void invoke$lambda$1(l59 l59Var, jvd.C8121h c8121h, qy6 qy6Var, g59 g59Var, AbstractC1143j.a aVar) {
            i59 i59Var;
            int i = a.f104097a[aVar.ordinal()];
            if (i == 1) {
                c8121h.f52110a = qy6Var.invoke(l59Var);
            } else if (i == 2 && (i59Var = (i59) c8121h.f52110a) != null) {
                i59Var.runPauseOrOnDisposeEffect();
            }
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            final jvd.C8121h c8121h = new jvd.C8121h();
            final l59 l59Var = this.f104095b;
            final qy6<l59, i59> qy6Var = this.f104096c;
            InterfaceC1154n interfaceC1154n = new InterfaceC1154n() { // from class: a59
                @Override // androidx.lifecycle.InterfaceC1154n
                public final void onStateChanged(g59 g59Var, AbstractC1143j.a aVar) {
                    z49.C15994h.invoke$lambda$1(l59Var, c8121h, qy6Var, g59Var, aVar);
                }
            };
            this.f104094a.getLifecycle().addObserver(interfaceC1154n);
            return new b(this.f104094a, interfaceC1154n, c8121h);
        }
    }

    /* JADX INFO: renamed from: z49$i */
    public static final class C15995i extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104101a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l59 f104102b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<l59, i59> f104103c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104104d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15995i(g59 g59Var, l59 l59Var, qy6<? super l59, ? extends i59> qy6Var, int i) {
            super(2);
            this.f104101a = g59Var;
            this.f104102b = l59Var;
            this.f104103c = qy6Var;
            this.f104104d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleResumeEffectImpl(this.f104101a, this.f104102b, this.f104103c, zl2Var, tsd.updateChangedFlags(this.f104104d | 1));
        }
    }

    /* JADX INFO: renamed from: z49$j */
    public static final class C15996j extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104105a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f104106b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<m59, n59> f104107c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104108d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104109e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15996j(Object obj, g59 g59Var, qy6<? super m59, ? extends n59> qy6Var, int i, int i2) {
            super(2);
            this.f104105a = obj;
            this.f104106b = g59Var;
            this.f104107c = qy6Var;
            this.f104108d = i;
            this.f104109e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleStartEffect(this.f104105a, this.f104106b, this.f104107c, zl2Var, tsd.updateChangedFlags(this.f104108d | 1), this.f104109e);
        }
    }

    /* JADX INFO: renamed from: z49$k */
    public static final class C15997k extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104110a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f104111b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ g59 f104112c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<m59, n59> f104113d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104114e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f104115f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15997k(Object obj, Object obj2, g59 g59Var, qy6<? super m59, ? extends n59> qy6Var, int i, int i2) {
            super(2);
            this.f104110a = obj;
            this.f104111b = obj2;
            this.f104112c = g59Var;
            this.f104113d = qy6Var;
            this.f104114e = i;
            this.f104115f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleStartEffect(this.f104110a, this.f104111b, this.f104112c, this.f104113d, zl2Var, tsd.updateChangedFlags(this.f104114e | 1), this.f104115f);
        }
    }

    /* JADX INFO: renamed from: z49$l */
    public static final class C15998l extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f104116a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f104117b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f104118c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ g59 f104119d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<m59, n59> f104120e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f104121f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f104122m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15998l(Object obj, Object obj2, Object obj3, g59 g59Var, qy6<? super m59, ? extends n59> qy6Var, int i, int i2) {
            super(2);
            this.f104116a = obj;
            this.f104117b = obj2;
            this.f104118c = obj3;
            this.f104119d = g59Var;
            this.f104120e = qy6Var;
            this.f104121f = i;
            this.f104122m = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleStartEffect(this.f104116a, this.f104117b, this.f104118c, this.f104119d, this.f104120e, zl2Var, tsd.updateChangedFlags(this.f104121f | 1), this.f104122m);
        }
    }

    /* JADX INFO: renamed from: z49$m */
    public static final class C15999m extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f104123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ g59 f104124b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<m59, n59> f104125c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104126d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f104127e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15999m(Object[] objArr, g59 g59Var, qy6<? super m59, ? extends n59> qy6Var, int i, int i2) {
            super(2);
            this.f104123a = objArr;
            this.f104124b = g59Var;
            this.f104125c = qy6Var;
            this.f104126d = i;
            this.f104127e = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            Object[] objArr = this.f104123a;
            z49.LifecycleStartEffect(Arrays.copyOf(objArr, objArr.length), this.f104124b, (qy6<? super m59, ? extends n59>) this.f104125c, zl2Var, tsd.updateChangedFlags(this.f104126d | 1), this.f104127e);
        }
    }

    /* JADX INFO: renamed from: z49$n */
    public static final class C16000n extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104128a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<m59, n59> f104129b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f104130c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16000n(g59 g59Var, qy6<? super m59, ? extends n59> qy6Var, int i, int i2) {
            super(2);
            this.f104128a = g59Var;
            this.f104129b = qy6Var;
            this.f104130c = i;
            this.f104131d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleStartEffect(this.f104128a, this.f104129b, zl2Var, tsd.updateChangedFlags(this.f104130c | 1), this.f104131d);
        }
    }

    /* JADX INFO: renamed from: z49$o */
    @dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,747:1\n64#2,5:748\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n*L\n375#1:748,5\n*E\n"})
    public static final class C16001o extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m59 f104133b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<m59, n59> f104134c;

        /* JADX INFO: renamed from: z49$o$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f104135a;

            static {
                int[] iArr = new int[AbstractC1143j.a.values().length];
                try {
                    iArr[AbstractC1143j.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1143j.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f104135a = iArr;
            }
        }

        /* JADX INFO: renamed from: z49$o$b */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1$1\n*L\n1#1,497:1\n376#2,3:498\n*E\n"})
        public static final class b implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g59 f104136a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC1154n f104137b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h f104138c;

            public b(g59 g59Var, InterfaceC1154n interfaceC1154n, jvd.C8121h c8121h) {
                this.f104136a = g59Var;
                this.f104137b = interfaceC1154n;
                this.f104138c = c8121h;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f104136a.getLifecycle().removeObserver(this.f104137b);
                n59 n59Var = (n59) this.f104138c.f52110a;
                if (n59Var != null) {
                    n59Var.runStopOrDisposeEffect();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16001o(g59 g59Var, m59 m59Var, qy6<? super m59, ? extends n59> qy6Var) {
            super(1);
            this.f104132a = g59Var;
            this.f104133b = m59Var;
            this.f104134c = qy6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        public static final void invoke$lambda$1(m59 m59Var, jvd.C8121h c8121h, qy6 qy6Var, g59 g59Var, AbstractC1143j.a aVar) {
            n59 n59Var;
            int i = a.f104135a[aVar.ordinal()];
            if (i == 1) {
                c8121h.f52110a = qy6Var.invoke(m59Var);
            } else if (i == 2 && (n59Var = (n59) c8121h.f52110a) != null) {
                n59Var.runStopOrDisposeEffect();
            }
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            final jvd.C8121h c8121h = new jvd.C8121h();
            final m59 m59Var = this.f104133b;
            final qy6<m59, n59> qy6Var = this.f104134c;
            InterfaceC1154n interfaceC1154n = new InterfaceC1154n() { // from class: b59
                @Override // androidx.lifecycle.InterfaceC1154n
                public final void onStateChanged(g59 g59Var, AbstractC1143j.a aVar) {
                    z49.C16001o.invoke$lambda$1(m59Var, c8121h, qy6Var, g59Var, aVar);
                }
            };
            this.f104132a.getLifecycle().addObserver(interfaceC1154n);
            return new b(this.f104132a, interfaceC1154n, c8121h);
        }
    }

    /* JADX INFO: renamed from: z49$p */
    public static final class C16002p extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g59 f104139a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m59 f104140b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<m59, n59> f104141c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f104142d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16002p(g59 g59Var, m59 m59Var, qy6<? super m59, ? extends n59> qy6Var, int i) {
            super(2);
            this.f104139a = g59Var;
            this.f104140b = m59Var;
            this.f104141c = qy6Var;
            this.f104142d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            z49.LifecycleStartEffectImpl(this.f104139a, this.f104140b, this.f104141c, zl2Var, tsd.updateChangedFlags(this.f104142d | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleEventEffect(@p000.yfb androidx.lifecycle.AbstractC1143j.a r7, @p000.gib p000.g59 r8, @p000.yfb p000.ny6<p000.bth> r9, @p000.gib p000.zl2 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleEventEffect(androidx.lifecycle.j$a, g59, ny6, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ny6<bth> LifecycleEventEffect$lambda$0(i2g<? extends ny6<bth>> i2gVar) {
        return i2gVar.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(@p000.gib java.lang.Object r7, @p000.gib p000.g59 r8, @p000.yfb p000.qy6<? super p000.l59, ? extends p000.i59> r9, @p000.gib p000.zl2 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleResumeEffect(java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    public static final void LifecycleResumeEffectImpl(g59 g59Var, l59 l59Var, qy6<? super l59, ? extends i59> qy6Var, zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(912823238);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(g59Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(l59Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(912823238, i2, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:690)");
            }
            zl2VarStartRestartGroup.startReplaceableGroup(657406551);
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(l59Var) | ((i2 & C1340j.f10444b) == 256) | zl2VarStartRestartGroup.changedInstance(g59Var);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C15994h(g59Var, l59Var, qy6Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            zl2VarStartRestartGroup.endReplaceableGroup();
            jx4.DisposableEffect(g59Var, l59Var, (qy6) objRememberedValue, zl2VarStartRestartGroup, i2 & 126);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C15995i(g59Var, l59Var, qy6Var, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(@p000.gib java.lang.Object r7, @p000.gib p000.g59 r8, @p000.yfb p000.qy6<? super p000.m59, ? extends p000.n59> r9, @p000.gib p000.zl2 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleStartEffect(java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    public static final void LifecycleStartEffectImpl(g59 g59Var, m59 m59Var, qy6<? super m59, ? extends n59> qy6Var, zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(228371534);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(g59Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(m59Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(228371534, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            zl2VarStartRestartGroup.startReplaceableGroup(-1076218375);
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(m59Var) | ((i2 & C1340j.f10444b) == 256) | zl2VarStartRestartGroup.changedInstance(g59Var);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C16001o(g59Var, m59Var, qy6Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            zl2VarStartRestartGroup.endReplaceableGroup();
            jx4.DisposableEffect(g59Var, m59Var, (qy6) objRememberedValue, zl2VarStartRestartGroup, i2 & 126);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C16002p(g59Var, m59Var, qy6Var, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(@p000.gib java.lang.Object r8, @p000.gib java.lang.Object r9, @p000.gib p000.g59 r10, @p000.yfb p000.qy6<? super p000.l59, ? extends p000.i59> r11, @p000.gib p000.zl2 r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleResumeEffect(java.lang.Object, java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(@p000.gib java.lang.Object r8, @p000.gib java.lang.Object r9, @p000.gib p000.g59 r10, @p000.yfb p000.qy6<? super p000.m59, ? extends p000.n59> r11, @p000.gib p000.zl2 r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleStartEffect(java.lang.Object, java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(@p000.gib java.lang.Object r11, @p000.gib java.lang.Object r12, @p000.gib java.lang.Object r13, @p000.gib p000.g59 r14, @p000.yfb p000.qy6<? super p000.l59, ? extends p000.i59> r15, @p000.gib p000.zl2 r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(@p000.gib java.lang.Object r11, @p000.gib java.lang.Object r12, @p000.gib java.lang.Object r13, @p000.gib p000.g59 r14, @p000.yfb p000.qy6<? super p000.m59, ? extends p000.n59> r15, @p000.gib p000.zl2 r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, g59, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[LOOP:1: B:54:0x00c3->B:55:0x00c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(@p000.yfb java.lang.Object[] r7, @p000.gib p000.g59 r8, @p000.yfb p000.qy6<? super p000.l59, ? extends p000.i59> r9, @p000.gib p000.zl2 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleResumeEffect(java.lang.Object[], g59, qy6, zl2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[LOOP:1: B:54:0x00c3->B:55:0x00c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(@p000.yfb java.lang.Object[] r7, @p000.gib p000.g59 r8, @p000.yfb p000.qy6<? super p000.m59, ? extends p000.n59> r9, @p000.gib p000.zl2 r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z49.LifecycleStartEffect(java.lang.Object[], g59, qy6, zl2, int, int):void");
    }

    @hk2
    @q64(level = u64.f86866b, message = f104056b)
    public static final void LifecycleResumeEffect(@gib g59 g59Var, @yfb qy6<? super l59, ? extends i59> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-747476210);
        int i3 = i & 1;
        if (i3 == 0 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
            are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
            if (areVarEndRestartGroup != null) {
                areVarEndRestartGroup.updateScope(new C15993g(g59Var, qy6Var, i, i2));
                return;
            }
            return;
        }
        zl2VarStartRestartGroup.startDefaults();
        if (i3 != 0 && !zl2VarStartRestartGroup.getDefaultsInvalid()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
            if ((i2 & 1) != 0) {
                i &= -15;
            }
        } else if ((i2 & 1) != 0) {
            i &= -15;
        }
        zl2VarStartRestartGroup.endDefaults();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-747476210, i, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:683)");
        }
        throw new IllegalStateException(f104056b);
    }

    @hk2
    @q64(level = u64.f86866b, message = f104055a)
    public static final void LifecycleStartEffect(@gib g59 g59Var, @yfb qy6<? super m59, ? extends n59> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-50807951);
        int i3 = i & 1;
        if (i3 == 0 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
            are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
            if (areVarEndRestartGroup != null) {
                areVarEndRestartGroup.updateScope(new C16000n(g59Var, qy6Var, i, i2));
                return;
            }
            return;
        }
        zl2VarStartRestartGroup.startDefaults();
        if (i3 != 0 && !zl2VarStartRestartGroup.getDefaultsInvalid()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
            if ((i2 & 1) != 0) {
                i &= -15;
            }
        } else if ((i2 & 1) != 0) {
            i &= -15;
        }
        zl2VarStartRestartGroup.endDefaults();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-50807951, i, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)");
        }
        throw new IllegalStateException(f104055a);
    }
}
