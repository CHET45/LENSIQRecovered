package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import p000.hsd;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n24#1,5:510\n94#2,8:515\n94#2,8:523\n94#2,8:531\n94#2,8:539\n160#2:547\n94#2,3:548\n161#2:551\n101#2:552\n162#2:553\n97#2,3:554\n94#2,8:557\n160#2:565\n94#2,3:566\n161#2,2:569\n101#2:571\n97#2,3:572\n94#2,8:575\n94#2,8:583\n94#2,8:591\n160#2:599\n94#2,3:600\n161#2,2:603\n101#2:605\n97#2,3:606\n160#2:609\n94#2,3:610\n161#2,2:613\n101#2:615\n97#2,3:616\n160#2:619\n94#2,3:620\n161#2,2:623\n101#2:625\n97#2,3:626\n160#2:629\n94#2,3:630\n161#2,2:633\n101#2:635\n97#2,3:636\n160#2:639\n94#2,3:640\n161#2,2:643\n101#2:645\n97#2,3:646\n94#2,8:649\n160#2:657\n94#2,3:658\n161#2,2:661\n101#2:663\n97#2,3:664\n94#2,8:667\n94#2,8:675\n94#2,8:683\n1#3:691\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n40#1:510,5\n64#1:515,8\n79#1:523,8\n93#1:531,8\n103#1:539,8\n114#1:547\n114#1:548,3\n114#1:551\n114#1:552\n114#1:553\n114#1:554,3\n125#1:557,8\n140#1:565\n140#1:566,3\n140#1:569,2\n140#1:571\n140#1:572,3\n151#1:575,8\n164#1:583,8\n177#1:591,8\n262#1:599\n262#1:600,3\n262#1:603,2\n262#1:605\n262#1:606,3\n271#1:609\n271#1:610,3\n271#1:613,2\n271#1:615\n271#1:616,3\n307#1:619\n307#1:620,3\n307#1:623,2\n307#1:625\n307#1:626,3\n315#1:629\n315#1:630,3\n315#1:633,2\n315#1:635\n315#1:636,3\n328#1:639\n328#1:640,3\n328#1:643,2\n328#1:645\n328#1:646,3\n433#1:649,8\n441#1:657\n441#1:658,3\n441#1:661,2\n441#1:663\n441#1:664,3\n448#1:667,8\n462#1:675,8\n476#1:683,8\n*E\n"})
public final /* synthetic */ class gv1 {

    /* JADX INFO: renamed from: gv1$a */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0}, m4012l = {434}, m4013m = "any", m4014n = {"$this$consume$iv"}, m4015s = {"L$0"})
    public static final class C6552a<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41242a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41243b;

        /* JADX INFO: renamed from: c */
        public int f41244c;

        public C6552a(zy2<? super C6552a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41243b = obj;
            this.f41244c |= Integer.MIN_VALUE;
            return gv1.any(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$a0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0}, m4012l = {Videoio.CAP_PROP_XI_GAMMAC}, m4013m = "none", m4014n = {"$this$consume$iv"}, m4015s = {"L$0"})
    public static final class C6553a0<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41245a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41246b;

        /* JADX INFO: renamed from: c */
        public int f41247c;

        public C6553a0(zy2<? super C6553a0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41246b = obj;
            this.f41247c |= Integer.MIN_VALUE;
            return gv1.none(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$b */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {41}, m4013m = "consumeEach", m4014n = {"action", "channel$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6554b<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41248a;

        /* JADX INFO: renamed from: b */
        public Object f41249b;

        /* JADX INFO: renamed from: c */
        public Object f41250c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41251d;

        /* JADX INFO: renamed from: e */
        public int f41252e;

        public C6554b(zy2<? super C6554b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41251d = obj;
            this.f41252e |= Integer.MIN_VALUE;
            return gv1.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$b0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", m4010f = "Deprecated.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6555b0 extends ugg implements gz6<Object, zy2<Object>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41253a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41254b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hsd<Object> f41255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6555b0(hsd<Object> hsdVar, zy2<? super C6555b0> zy2Var) {
            super(2, zy2Var);
            this.f41255c = hsdVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6555b0 c6555b0 = new C6555b0(this.f41255c, zy2Var);
            c6555b0.f41254b = obj;
            return c6555b0;
        }

        @Override // p000.gz6
        public final Object invoke(Object obj, zy2<Object> zy2Var) {
            return ((C6555b0) create(obj, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f41253a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            Object obj2 = this.f41254b;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.f41255c + a18.f100c);
        }
    }

    /* JADX INFO: renamed from: gv1$c */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {514}, m4013m = "count", m4014n = {"count", "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6556c<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41256a;

        /* JADX INFO: renamed from: b */
        public Object f41257b;

        /* JADX INFO: renamed from: c */
        public Object f41258c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41259d;

        /* JADX INFO: renamed from: e */
        public int f41260e;

        public C6556c(zy2<? super C6556c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41259d = obj;
            this.f41260e |= Integer.MIN_VALUE;
            return gv1.count(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$c0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {166, 169}, m4013m = "single", m4014n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C6557c0<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41261a;

        /* JADX INFO: renamed from: b */
        public Object f41262b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f41263c;

        /* JADX INFO: renamed from: d */
        public int f41264d;

        public C6557c0(zy2<? super C6557c0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41263c = obj;
            this.f41264d |= Integer.MIN_VALUE;
            return gv1.single(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$d */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", m4010f = "Deprecated.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6558d extends ugg implements gz6<Object, zy2<Object>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41265a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41266b;

        public C6558d(zy2<? super C6558d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6558d c6558d = new C6558d(zy2Var);
            c6558d.f41266b = obj;
            return c6558d;
        }

        @Override // p000.gz6
        public final Object invoke(Object obj, zy2<Object> zy2Var) {
            return ((C6558d) create(obj, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f41265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return this.f41266b;
        }
    }

    /* JADX INFO: renamed from: gv1$d0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {179, 182}, m4013m = "singleOrNull", m4014n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C6559d0<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41267a;

        /* JADX INFO: renamed from: b */
        public Object f41268b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f41269c;

        /* JADX INFO: renamed from: d */
        public int f41270d;

        public C6559d0(zy2<? super C6559d0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41269c = obj;
            this.f41270d |= Integer.MIN_VALUE;
            return gv1.singleOrNull(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: gv1$e */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 1, 2, 2, 2}, m4012l = {Videoio.CAP_PROP_XI_AE_MAX_LIMIT, Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 420}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, m4015s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    public static final class C6560e<E> extends ugg implements gz6<vdd<? super E>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41271a;

        /* JADX INFO: renamed from: b */
        public Object f41272b;

        /* JADX INFO: renamed from: c */
        public Object f41273c;

        /* JADX INFO: renamed from: d */
        public int f41274d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41275e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hsd<E> f41276f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ gz6<E, zy2<? super K>, Object> f41277m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6560e(hsd<? extends E> hsdVar, gz6<? super E, ? super zy2<? super K>, ? extends Object> gz6Var, zy2<? super C6560e> zy2Var) {
            super(2, zy2Var);
            this.f41276f = hsdVar;
            this.f41277m = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6560e c6560e = new C6560e(this.f41276f, this.f41277m, zy2Var);
            c6560e.f41275e = obj;
            return c6560e;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super E> vddVar, zy2<? super bth> zy2Var) {
            return ((C6560e) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.HashSet] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, nye] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a1 -> B:29:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:28:0x00b6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to gv1$e<E> for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r10.f41274d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L51
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r10.f41273c
                java.lang.Object r5 = r10.f41272b
                mu1 r5 = (p000.mu1) r5
                java.lang.Object r6 = r10.f41271a
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f41275e
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r11)
                goto Lb6
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                java.lang.Object r1 = r10.f41273c
                java.lang.Object r5 = r10.f41272b
                mu1 r5 = (p000.mu1) r5
                java.lang.Object r6 = r10.f41271a
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f41275e
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9d
            L41:
                java.lang.Object r1 = r10.f41272b
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r10.f41271a
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.f41275e
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r11)
                goto L79
            L51:
                p000.y7e.throwOnFailure(r11)
                java.lang.Object r11 = r10.f41275e
                vdd r11 = (p000.vdd) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                hsd<E> r5 = r10.f41276f
                mu1 r5 = r5.iterator()
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L67:
                r10.f41275e = r6
                r10.f41271a = r5
                r10.f41272b = r1
                r11 = 0
                r10.f41273c = r11
                r10.f41274d = r4
                java.lang.Object r11 = r1.hasNext(r10)
                if (r11 != r0) goto L79
                return r0
            L79:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbd
                java.lang.Object r11 = r1.next()
                gz6<E, zy2<? super K>, java.lang.Object> r7 = r10.f41277m
                r10.f41275e = r6
                r10.f41271a = r5
                r10.f41272b = r1
                r10.f41273c = r11
                r10.f41274d = r3
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r0) goto L98
                return r0
            L98:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9d:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lba
                r10.f41275e = r7
                r10.f41271a = r6
                r10.f41272b = r1
                r10.f41273c = r11
                r10.f41274d = r2
                java.lang.Object r5 = r7.send(r5, r10)
                if (r5 != r0) goto Lb4
                return r0
            Lb4:
                r5 = r1
                r1 = r11
            Lb6:
                r6.add(r1)
                r1 = r5
            Lba:
                r5 = r6
                r6 = r7
                goto L67
            Lbd:
                bth r11 = p000.bth.f14751a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6560e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$e0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {284, 285}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "remaining", "$this$produce", "remaining"}, m4015s = {"L$0", "I$0", "L$0", "I$0"})
    @dwf({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    public static final class C6561e0 extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41278a;

        /* JADX INFO: renamed from: b */
        public int f41279b;

        /* JADX INFO: renamed from: c */
        public int f41280c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41281d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f41282e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hsd<Object> f41283f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6561e0(int i, hsd<Object> hsdVar, zy2<? super C6561e0> zy2Var) {
            super(2, zy2Var);
            this.f41282e = i;
            this.f41283f = hsdVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6561e0 c6561e0 = new C6561e0(this.f41282e, this.f41283f, zy2Var);
            c6561e0.f41281d = obj;
            return c6561e0;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6561e0) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r7.f41280c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                int r1 = r7.f41279b
                java.lang.Object r4 = r7.f41278a
                mu1 r4 = (p000.mu1) r4
                java.lang.Object r5 = r7.f41281d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r8)
            L1b:
                r8 = r5
                goto L7b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                int r1 = r7.f41279b
                java.lang.Object r4 = r7.f41278a
                mu1 r4 = (p000.mu1) r4
                java.lang.Object r5 = r7.f41281d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r8)
                goto L60
            L33:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f41281d
                vdd r8 = (p000.vdd) r8
                int r1 = r7.f41282e
                if (r1 != 0) goto L41
                bth r8 = p000.bth.f14751a
                return r8
            L41:
                if (r1 < 0) goto L45
                r4 = r3
                goto L46
            L45:
                r4 = 0
            L46:
                if (r4 == 0) goto L85
                hsd<java.lang.Object> r4 = r7.f41283f
                mu1 r4 = r4.iterator()
            L4e:
                r7.f41281d = r8
                r7.f41278a = r4
                r7.f41279b = r1
                r7.f41280c = r3
                java.lang.Object r5 = r4.hasNext(r7)
                if (r5 != r0) goto L5d
                return r0
            L5d:
                r6 = r5
                r5 = r8
                r8 = r6
            L60:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r4.next()
                r7.f41281d = r5
                r7.f41278a = r4
                r7.f41279b = r1
                r7.f41280c = r2
                java.lang.Object r8 = r5.send(r8, r7)
                if (r8 != r0) goto L1b
                return r0
            L7b:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L4e
                bth r8 = p000.bth.f14751a
                return r8
            L82:
                bth r8 = p000.bth.f14751a
                return r8
            L85:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Requested element count "
                r8.append(r0)
                r8.append(r1)
                java.lang.String r0 = " is less than zero."
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6561e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$f */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 2}, m4012l = {nb2.f63870r, tpc.f85549b, 200}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, m4015s = {"L$0", "I$0", "L$0", "L$0"})
    @dwf({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    public static final class C6562f extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41284a;

        /* JADX INFO: renamed from: b */
        public int f41285b;

        /* JADX INFO: renamed from: c */
        public int f41286c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41287d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f41288e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hsd<Object> f41289f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6562f(int i, hsd<Object> hsdVar, zy2<? super C6562f> zy2Var) {
            super(2, zy2Var);
            this.f41288e = i;
            this.f41289f = hsdVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6562f c6562f = new C6562f(this.f41288e, this.f41289f, zy2Var);
            c6562f.f41287d = obj;
            return c6562f;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6562f) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            if (r1 == 0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:23:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a4 -> B:8:0x001c). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6562f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$f0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m4010f = "Deprecated.kt", m4011i = {0, 1, 1, 2}, m4012l = {299, 300, 301}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m4015s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C6563f0 extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41290a;

        /* JADX INFO: renamed from: b */
        public Object f41291b;

        /* JADX INFO: renamed from: c */
        public int f41292c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41293d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ hsd<Object> f41294e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<Object, zy2<? super Boolean>, Object> f41295f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6563f0(hsd<Object> hsdVar, gz6<Object, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super C6563f0> zy2Var) {
            super(2, zy2Var);
            this.f41294e = hsdVar;
            this.f41295f = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6563f0 c6563f0 = new C6563f0(this.f41294e, this.f41295f, zy2Var);
            c6563f0.f41293d = obj;
            return c6563f0;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6563f0) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0097 -> B:13:0x004d). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r8.f41292c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f41290a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r8.f41293d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r9)
                goto L4d
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f41291b
                java.lang.Object r5 = r8.f41290a
                mu1 r5 = (p000.mu1) r5
                java.lang.Object r6 = r8.f41293d
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r9)
                goto L7c
            L33:
                java.lang.Object r1 = r8.f41290a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r8.f41293d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r9)
                goto L5a
            L3f:
                p000.y7e.throwOnFailure(r9)
                java.lang.Object r9 = r8.f41293d
                vdd r9 = (p000.vdd) r9
                hsd<java.lang.Object> r1 = r8.f41294e
                mu1 r1 = r1.iterator()
                r5 = r9
            L4d:
                r8.f41293d = r5
                r8.f41290a = r1
                r8.f41292c = r4
                java.lang.Object r9 = r1.hasNext(r8)
                if (r9 != r0) goto L5a
                return r0
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9a
                java.lang.Object r9 = r1.next()
                gz6<java.lang.Object, zy2<? super java.lang.Boolean>, java.lang.Object> r6 = r8.f41295f
                r8.f41293d = r5
                r8.f41290a = r1
                r8.f41291b = r9
                r8.f41292c = r3
                java.lang.Object r6 = r6.invoke(r9, r8)
                if (r6 != r0) goto L77
                return r0
            L77:
                r7 = r1
                r1 = r9
                r9 = r6
                r6 = r5
                r5 = r7
            L7c:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L87
                bth r9 = p000.bth.f14751a
                return r9
            L87:
                r8.f41293d = r6
                r8.f41290a = r5
                r9 = 0
                r8.f41291b = r9
                r8.f41292c = r2
                java.lang.Object r9 = r6.send(r1, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1 = r5
                r5 = r6
                goto L4d
            L9a:
                bth r9 = p000.bth.f14751a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6563f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$g */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m4010f = "Deprecated.kt", m4011i = {0, 1, 1, 2, 3, 4}, m4012l = {211, nb2.f63868p, 213, 217, bw3.f14995j}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, m4015s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    public static final class C6564g extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41296a;

        /* JADX INFO: renamed from: b */
        public Object f41297b;

        /* JADX INFO: renamed from: c */
        public int f41298c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41299d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ hsd<Object> f41300e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<Object, zy2<? super Boolean>, Object> f41301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6564g(hsd<Object> hsdVar, gz6<Object, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super C6564g> zy2Var) {
            super(2, zy2Var);
            this.f41300e = hsdVar;
            this.f41301f = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6564g c6564g = new C6564g(this.f41300e, this.f41301f, zy2Var);
            c6564g.f41299d = obj;
            return c6564g;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6564g) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009f -> B:16:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ec -> B:10:0x0023). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6564g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$g0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {514, 308}, m4013m = "toChannel", m4014n = {FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv", FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C6565g0<E, C extends nye<? super E>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41302a;

        /* JADX INFO: renamed from: b */
        public Object f41303b;

        /* JADX INFO: renamed from: c */
        public Object f41304c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41305d;

        /* JADX INFO: renamed from: e */
        public int f41306e;

        public C6565g0(zy2<? super C6565g0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41305d = obj;
            this.f41306e |= Integer.MIN_VALUE;
            return av1.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$h */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0}, m4012l = {68}, m4013m = "elementAt", m4014n = {"$this$consume$iv", "index", "count"}, m4015s = {"L$0", "I$0", "I$1"})
    public static final class C6566h<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public int f41307a;

        /* JADX INFO: renamed from: b */
        public int f41308b;

        /* JADX INFO: renamed from: c */
        public Object f41309c;

        /* JADX INFO: renamed from: d */
        public Object f41310d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41311e;

        /* JADX INFO: renamed from: f */
        public int f41312f;

        public C6566h(zy2<? super C6566h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41311e = obj;
            this.f41312f |= Integer.MIN_VALUE;
            return gv1.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: gv1$h0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {514}, m4013m = "toCollection", m4014n = {FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6567h0<E, C extends Collection<? super E>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41313a;

        /* JADX INFO: renamed from: b */
        public Object f41314b;

        /* JADX INFO: renamed from: c */
        public Object f41315c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41316d;

        /* JADX INFO: renamed from: e */
        public int f41317e;

        public C6567h0(zy2<? super C6567h0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41316d = obj;
            this.f41317e |= Integer.MIN_VALUE;
            return av1.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$i */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0}, m4012l = {83}, m4013m = "elementAtOrNull", m4014n = {"$this$consume$iv", "index", "count"}, m4015s = {"L$0", "I$0", "I$1"})
    public static final class C6568i<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public int f41318a;

        /* JADX INFO: renamed from: b */
        public int f41319b;

        /* JADX INFO: renamed from: c */
        public Object f41320c;

        /* JADX INFO: renamed from: d */
        public Object f41321d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41322e;

        /* JADX INFO: renamed from: f */
        public int f41323f;

        public C6568i(zy2<? super C6568i> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41322e = obj;
            this.f41323f |= Integer.MIN_VALUE;
            return gv1.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: gv1$i0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {514}, m4013m = "toMap", m4014n = {FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6569i0<K, V, M extends Map<? super K, ? super V>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41324a;

        /* JADX INFO: renamed from: b */
        public Object f41325b;

        /* JADX INFO: renamed from: c */
        public Object f41326c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41327d;

        /* JADX INFO: renamed from: e */
        public int f41328e;

        public C6569i0(zy2<? super C6569i0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41327d = obj;
            this.f41328e |= Integer.MIN_VALUE;
            return av1.toMap(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: gv1$j */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m4010f = "Deprecated.kt", m4011i = {0, 1, 1, 2}, m4012l = {nb2.f63862j, nb2.f63863k, nb2.f63863k}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$produce", "e", "$this$produce"}, m4015s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class C6570j<E> extends ugg implements gz6<vdd<? super E>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41329a;

        /* JADX INFO: renamed from: b */
        public Object f41330b;

        /* JADX INFO: renamed from: c */
        public int f41331c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41332d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ hsd<E> f41333e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<E, zy2<? super Boolean>, Object> f41334f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6570j(hsd<? extends E> hsdVar, gz6<? super E, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super C6570j> zy2Var) {
            super(2, zy2Var);
            this.f41333e = hsdVar;
            this.f41334f = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6570j c6570j = new C6570j(this.f41333e, this.f41334f, zy2Var);
            c6570j.f41332d = obj;
            return c6570j;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super E> vddVar, zy2<? super bth> zy2Var) {
            return ((C6570j) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v13, types: [vdd] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, nye] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r8v0 */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r9.f41331c
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L43
                if (r1 == r5) goto L37
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r9.f41329a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r6 = r9.f41332d
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r10)
                goto L51
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f41330b
                java.lang.Object r6 = r9.f41329a
                mu1 r6 = (p000.mu1) r6
                java.lang.Object r7 = r9.f41332d
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r10)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L81
            L37:
                java.lang.Object r1 = r9.f41329a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r6 = r9.f41332d
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r10)
                goto L60
            L43:
                p000.y7e.throwOnFailure(r10)
                java.lang.Object r10 = r9.f41332d
                vdd r10 = (p000.vdd) r10
                hsd<E> r1 = r9.f41333e
                mu1 r1 = r1.iterator()
                r6 = r10
            L51:
                r9.f41332d = r6
                r9.f41329a = r1
                r9.f41330b = r2
                r9.f41331c = r5
                java.lang.Object r10 = r1.hasNext(r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r1.next()
                gz6<E, zy2<? super java.lang.Boolean>, java.lang.Object> r7 = r9.f41334f
                r9.f41332d = r6
                r9.f41329a = r1
                r9.f41330b = r10
                r9.f41331c = r4
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r0) goto L7d
                return r0
            L7d:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L81:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                r9.f41332d = r7
                r9.f41329a = r1
                r9.f41330b = r2
                r9.f41331c = r3
                java.lang.Object r10 = r7.send(r6, r9)
                if (r10 != r0) goto L98
                return r0
            L98:
                r6 = r7
                goto L51
            L9a:
                bth r10 = p000.bth.f14751a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6570j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$j0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {400, 401}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "index", "$this$produce", "index"}, m4015s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C6571j0 extends ugg implements gz6<vdd<? super q08<Object>>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41335a;

        /* JADX INFO: renamed from: b */
        public int f41336b;

        /* JADX INFO: renamed from: c */
        public int f41337c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41338d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ hsd<Object> f41339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6571j0(hsd<Object> hsdVar, zy2<? super C6571j0> zy2Var) {
            super(2, zy2Var);
            this.f41339e = hsdVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6571j0 c6571j0 = new C6571j0(this.f41339e, zy2Var);
            c6571j0.f41338d = obj;
            return c6571j0;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super q08<Object>> vddVar, zy2<? super bth> zy2Var) {
            return ((C6571j0) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:11:0x0044). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r10.f41337c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f41336b
                java.lang.Object r4 = r10.f41335a
                mu1 r4 = (p000.mu1) r4
                java.lang.Object r5 = r10.f41338d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r11)
                r11 = r5
                r8 = r4
                r4 = r1
                r1 = r8
                goto L44
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f41336b
                java.lang.Object r4 = r10.f41335a
                mu1 r4 = (p000.mu1) r4
                java.lang.Object r5 = r10.f41338d
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r11)
                goto L59
            L36:
                p000.y7e.throwOnFailure(r11)
                java.lang.Object r11 = r10.f41338d
                vdd r11 = (p000.vdd) r11
                hsd<java.lang.Object> r1 = r10.f41339e
                mu1 r1 = r1.iterator()
                r4 = 0
            L44:
                r10.f41338d = r11
                r10.f41335a = r1
                r10.f41336b = r4
                r10.f41337c = r3
                java.lang.Object r5 = r1.hasNext(r10)
                if (r5 != r0) goto L53
                return r0
            L53:
                r8 = r5
                r5 = r11
                r11 = r8
                r9 = r4
                r4 = r1
                r1 = r9
            L59:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L7f
                java.lang.Object r11 = r4.next()
                q08 r6 = new q08
                int r7 = r1 + 1
                r6.<init>(r1, r11)
                r10.f41338d = r5
                r10.f41335a = r4
                r10.f41336b = r7
                r10.f41337c = r2
                java.lang.Object r11 = r5.send(r6, r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                r1 = r4
                r11 = r5
                r4 = r7
                goto L44
            L7f:
                bth r11 = p000.bth.f14751a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6571j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$k */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 1, 2, 2}, m4012l = {241, 242, 242}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, m4015s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    public static final class C6572k extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41340a;

        /* JADX INFO: renamed from: b */
        public Object f41341b;

        /* JADX INFO: renamed from: c */
        public int f41342c;

        /* JADX INFO: renamed from: d */
        public int f41343d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41344e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hsd<Object> f41345f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<Integer, Object, zy2<? super Boolean>, Object> f41346m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6572k(hsd<Object> hsdVar, kz6<? super Integer, Object, ? super zy2<? super Boolean>, ? extends Object> kz6Var, zy2<? super C6572k> zy2Var) {
            super(2, zy2Var);
            this.f41345f = hsdVar;
            this.f41346m = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6572k c6572k = new C6572k(this.f41345f, this.f41346m, zy2Var);
            c6572k.f41344e = obj;
            return c6572k;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6572k) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r11.f41343d
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L49
                if (r1 == r5) goto L3b
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                int r1 = r11.f41342c
                java.lang.Object r6 = r11.f41340a
                mu1 r6 = (p000.mu1) r6
                java.lang.Object r7 = r11.f41344e
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r12)
                goto L5b
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f41342c
                java.lang.Object r6 = r11.f41341b
                java.lang.Object r7 = r11.f41340a
                mu1 r7 = (p000.mu1) r7
                java.lang.Object r8 = r11.f41344e
                vdd r8 = (p000.vdd) r8
                p000.y7e.throwOnFailure(r12)
                r10 = r7
                r7 = r6
                r6 = r10
                goto L95
            L3b:
                int r1 = r11.f41342c
                java.lang.Object r6 = r11.f41340a
                mu1 r6 = (p000.mu1) r6
                java.lang.Object r7 = r11.f41344e
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r12)
                goto L6c
            L49:
                p000.y7e.throwOnFailure(r12)
                java.lang.Object r12 = r11.f41344e
                vdd r12 = (p000.vdd) r12
                hsd<java.lang.Object> r1 = r11.f41345f
                mu1 r1 = r1.iterator()
                r6 = 0
                r7 = r12
                r10 = r6
                r6 = r1
                r1 = r10
            L5b:
                r11.f41344e = r7
                r11.f41340a = r6
                r11.f41341b = r2
                r11.f41342c = r1
                r11.f41343d = r5
                java.lang.Object r12 = r6.hasNext(r11)
                if (r12 != r0) goto L6c
                return r0
            L6c:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r6.next()
                kz6<java.lang.Integer, java.lang.Object, zy2<? super java.lang.Boolean>, java.lang.Object> r8 = r11.f41346m
                int r9 = r1 + 1
                java.lang.Integer r1 = p000.wc1.boxInt(r1)
                r11.f41344e = r7
                r11.f41340a = r6
                r11.f41341b = r12
                r11.f41342c = r9
                r11.f41343d = r4
                java.lang.Object r1 = r8.invoke(r1, r12, r11)
                if (r1 != r0) goto L91
                return r0
            L91:
                r8 = r7
                r7 = r12
                r12 = r1
                r1 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lae
                r11.f41344e = r8
                r11.f41340a = r6
                r11.f41341b = r2
                r11.f41342c = r1
                r11.f41343d = r3
                java.lang.Object r12 = r8.send(r7, r11)
                if (r12 != r0) goto Lae
                return r0
            Lae:
                r7 = r8
                goto L5b
            Lb0:
                bth r12 = p000.bth.f14751a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6572k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: gv1$k0 */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m4010f = "Deprecated.kt", m4011i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m4012l = {514, Videoio.CAP_PROP_XI_ACQ_FRAME_BURST_COUNT, ymh.InterfaceC15728g.f102250i}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @dwf({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n498#1:510\n498#1:511,3\n498#1:514,2\n498#1:516\n498#1:517,3\n*E\n"})
    public static final class C6573k0<V> extends ugg implements gz6<vdd<? super V>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ hsd<R> f41347C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ hsd<E> f41348F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ gz6<E, R, V> f41349H;

        /* JADX INFO: renamed from: a */
        public Object f41350a;

        /* JADX INFO: renamed from: b */
        public Object f41351b;

        /* JADX INFO: renamed from: c */
        public Object f41352c;

        /* JADX INFO: renamed from: d */
        public Object f41353d;

        /* JADX INFO: renamed from: e */
        public Object f41354e;

        /* JADX INFO: renamed from: f */
        public int f41355f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f41356m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6573k0(hsd<? extends R> hsdVar, hsd<? extends E> hsdVar2, gz6<? super E, ? super R, ? extends V> gz6Var, zy2<? super C6573k0> zy2Var) {
            super(2, zy2Var);
            this.f41347C = hsdVar;
            this.f41348F = hsdVar2;
            this.f41349H = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6573k0 c6573k0 = new C6573k0(this.f41347C, this.f41348F, this.f41349H, zy2Var);
            c6573k0.f41356m = obj;
            return c6573k0;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super V> vddVar, zy2<? super bth> zy2Var) {
            return ((C6573k0) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0088, B:27:0x009d, B:29:0x00a5, B:39:0x00ef, B:20:0x006b, B:23:0x0080), top: B:50:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:33:0x00c5, B:35:0x00cd, B:15:0x004b), top: B:46:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:24:0x0088, B:27:0x009d, B:29:0x00a5, B:39:0x00ef, B:20:0x006b, B:23:0x0080), top: B:50:0x000a }] */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6573k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$l */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", m4010f = "Deprecated.kt", m4011i = {}, m4012l = {252}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6574l extends ugg implements gz6<Object, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41357a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41358b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<Object, zy2<? super Boolean>, Object> f41359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6574l(gz6<Object, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super C6574l> zy2Var) {
            super(2, zy2Var);
            this.f41359c = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6574l c6574l = new C6574l(this.f41359c, zy2Var);
            c6574l.f41358b = obj;
            return c6574l;
        }

        @Override // p000.gz6
        public final Object invoke(Object obj, zy2<? super Boolean> zy2Var) {
            return ((C6574l) create(obj, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f41357a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                Object obj2 = this.f41358b;
                gz6<Object, zy2<? super Boolean>, Object> gz6Var = this.f41359c;
                this.f41357a = 1;
                obj = gz6Var.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return wc1.boxBoolean(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: gv1$m */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m4010f = "Deprecated.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6575m<E> extends ugg implements gz6<E, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41360a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f41361b;

        public C6575m(zy2<? super C6575m> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6575m c6575m = new C6575m(zy2Var);
            c6575m.f41361b = obj;
            return c6575m;
        }

        @Override // p000.gz6
        public final Object invoke(E e, zy2<? super Boolean> zy2Var) {
            return ((C6575m) create(e, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f41360a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(this.f41361b != null);
        }
    }

    /* JADX INFO: renamed from: gv1$n */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {514}, m4013m = "filterNotNullTo", m4014n = {FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6576n<E, C extends Collection<? super E>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41362a;

        /* JADX INFO: renamed from: b */
        public Object f41363b;

        /* JADX INFO: renamed from: c */
        public Object f41364c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41365d;

        /* JADX INFO: renamed from: e */
        public int f41366e;

        public C6576n(zy2<? super C6576n> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41365d = obj;
            this.f41366e |= Integer.MIN_VALUE;
            return gv1.filterNotNullTo((hsd) null, (Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$o */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1}, m4012l = {514, Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000}, m4013m = "filterNotNullTo", m4014n = {FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv", FirebaseAnalytics.C3552d.f23234z, "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C6577o<E, C extends nye<? super E>> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41367a;

        /* JADX INFO: renamed from: b */
        public Object f41368b;

        /* JADX INFO: renamed from: c */
        public Object f41369c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41370d;

        /* JADX INFO: renamed from: e */
        public int f41371e;

        public C6577o(zy2<? super C6577o> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41370d = obj;
            this.f41371e |= Integer.MIN_VALUE;
            return gv1.filterNotNullTo((hsd) null, (nye) null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$p */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {95}, m4013m = "first", m4014n = {"$this$consume$iv", "iterator"}, m4015s = {"L$0", "L$1"})
    public static final class C6578p<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41372a;

        /* JADX INFO: renamed from: b */
        public Object f41373b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f41374c;

        /* JADX INFO: renamed from: d */
        public int f41375d;

        public C6578p(zy2<? super C6578p> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41374c = obj;
            this.f41375d |= Integer.MIN_VALUE;
            return gv1.first(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$q */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0}, m4012l = {105}, m4013m = "firstOrNull", m4014n = {"$this$consume$iv", "iterator"}, m4015s = {"L$0", "L$1"})
    public static final class C6579q<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41376a;

        /* JADX INFO: renamed from: b */
        public Object f41377b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f41378c;

        /* JADX INFO: renamed from: d */
        public int f41379d;

        public C6579q(zy2<? super C6579q> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41378c = obj;
            this.f41379d |= Integer.MIN_VALUE;
            return gv1.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$r */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m4010f = "Deprecated.kt", m4011i = {0, 1, 2}, m4012l = {351, 352, 352}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$produce", "$this$produce"}, m4015s = {"L$0", "L$0", "L$0"})
    public static final class C6580r extends ugg implements gz6<vdd<Object>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41380a;

        /* JADX INFO: renamed from: b */
        public int f41381b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f41382c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ hsd<Object> f41383d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<Object, zy2<? super hsd<Object>>, Object> f41384e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6580r(hsd<Object> hsdVar, gz6<Object, ? super zy2<? super hsd<Object>>, ? extends Object> gz6Var, zy2<? super C6580r> zy2Var) {
            super(2, zy2Var);
            this.f41383d = hsdVar;
            this.f41384e = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6580r c6580r = new C6580r(this.f41383d, this.f41384e, zy2Var);
            c6580r.f41382c = obj;
            return c6580r;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
            return ((C6580r) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:13:0x004b). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r7.f41381b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f41380a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r7.f41382c
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r8)
                goto L4b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f41380a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r7.f41382c
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r8)
                goto L73
            L31:
                java.lang.Object r1 = r7.f41380a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r5 = r7.f41382c
                vdd r5 = (p000.vdd) r5
                p000.y7e.throwOnFailure(r8)
                goto L58
            L3d:
                p000.y7e.throwOnFailure(r8)
                java.lang.Object r8 = r7.f41382c
                vdd r8 = (p000.vdd) r8
                hsd<java.lang.Object> r1 = r7.f41383d
                mu1 r1 = r1.iterator()
                r5 = r8
            L4b:
                r7.f41382c = r5
                r7.f41380a = r1
                r7.f41381b = r4
                java.lang.Object r8 = r1.hasNext(r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r1.next()
                gz6<java.lang.Object, zy2<? super hsd<java.lang.Object>>, java.lang.Object> r6 = r7.f41384e
                r7.f41382c = r5
                r7.f41380a = r1
                r7.f41381b = r3
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r0) goto L73
                return r0
            L73:
                hsd r8 = (p000.hsd) r8
                r7.f41382c = r5
                r7.f41380a = r1
                r7.f41381b = r2
                java.lang.Object r8 = p000.av1.toChannel(r8, r5, r7)
                if (r8 != r0) goto L4b
                return r0
            L82:
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6580r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$s */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0}, m4012l = {514}, m4013m = "indexOf", m4014n = {"element", "index", "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C6581s<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41385a;

        /* JADX INFO: renamed from: b */
        public Object f41386b;

        /* JADX INFO: renamed from: c */
        public Object f41387c;

        /* JADX INFO: renamed from: d */
        public Object f41388d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41389e;

        /* JADX INFO: renamed from: f */
        public int f41390f;

        public C6581s(zy2<? super C6581s> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41389e = obj;
            this.f41390f |= Integer.MIN_VALUE;
            return gv1.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$t */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 1}, m4012l = {127, 130}, m4013m = "last", m4014n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m4015s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C6582t<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41391a;

        /* JADX INFO: renamed from: b */
        public Object f41392b;

        /* JADX INFO: renamed from: c */
        public Object f41393c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41394d;

        /* JADX INFO: renamed from: e */
        public int f41395e;

        public C6582t(zy2<? super C6582t> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41394d = obj;
            this.f41395e |= Integer.MIN_VALUE;
            return gv1.last(null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$u */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0, 0}, m4012l = {514}, m4013m = "lastIndexOf", m4014n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C6583u<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41396a;

        /* JADX INFO: renamed from: b */
        public Object f41397b;

        /* JADX INFO: renamed from: c */
        public Object f41398c;

        /* JADX INFO: renamed from: d */
        public Object f41399d;

        /* JADX INFO: renamed from: e */
        public Object f41400e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f41401f;

        /* JADX INFO: renamed from: m */
        public int f41402m;

        public C6583u(zy2<? super C6583u> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41401f = obj;
            this.f41402m |= Integer.MIN_VALUE;
            return gv1.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$v */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 1}, m4012l = {153, 156}, m4013m = "lastOrNull", m4014n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, m4015s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C6584v<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41403a;

        /* JADX INFO: renamed from: b */
        public Object f41404b;

        /* JADX INFO: renamed from: c */
        public Object f41405c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f41406d;

        /* JADX INFO: renamed from: e */
        public int f41407e;

        public C6584v(zy2<? super C6584v> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41406d = obj;
            this.f41407e |= Integer.MIN_VALUE;
            return gv1.lastOrNull(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: gv1$w */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 2, 2}, m4012l = {514, 363, 363}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, m4015s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @dwf({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n362#1:510\n362#1:511,3\n362#1:514,2\n362#1:516\n362#1:517,3\n*E\n"})
    public static final class C6585w<R> extends ugg implements gz6<vdd<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ gz6<E, zy2<? super R>, Object> f41408C;

        /* JADX INFO: renamed from: a */
        public Object f41409a;

        /* JADX INFO: renamed from: b */
        public Object f41410b;

        /* JADX INFO: renamed from: c */
        public Object f41411c;

        /* JADX INFO: renamed from: d */
        public Object f41412d;

        /* JADX INFO: renamed from: e */
        public int f41413e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f41414f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ hsd<E> f41415m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6585w(hsd<? extends E> hsdVar, gz6<? super E, ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C6585w> zy2Var) {
            super(2, zy2Var);
            this.f41415m = hsdVar;
            this.f41408C = gz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6585w c6585w = new C6585w(this.f41415m, this.f41408C, zy2Var);
            c6585w.f41414f = obj;
            return c6585w;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super R> vddVar, zy2<? super bth> zy2Var) {
            return ((C6585w) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:24:0x0075, B:28:0x0089, B:30:0x0091, B:38:0x00c5, B:20:0x005f, B:23:0x006e), top: B:45:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:24:0x0075, B:28:0x0089, B:30:0x0091, B:38:0x00c5, B:20:0x005f, B:23:0x006e), top: B:45:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c0 -> B:24:0x0075). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6585w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: gv1$x */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m4010f = "Deprecated.kt", m4011i = {0, 0, 1, 1, 2, 2}, m4012l = {374, 375, 375}, m4013m = "invokeSuspend", m4014n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, m4015s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class C6586x<R> extends ugg implements gz6<vdd<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f41416a;

        /* JADX INFO: renamed from: b */
        public Object f41417b;

        /* JADX INFO: renamed from: c */
        public int f41418c;

        /* JADX INFO: renamed from: d */
        public int f41419d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41420e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ hsd<E> f41421f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<Integer, E, zy2<? super R>, Object> f41422m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6586x(hsd<? extends E> hsdVar, kz6<? super Integer, ? super E, ? super zy2<? super R>, ? extends Object> kz6Var, zy2<? super C6586x> zy2Var) {
            super(2, zy2Var);
            this.f41421f = hsdVar;
            this.f41422m = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C6586x c6586x = new C6586x(this.f41421f, this.f41422m, zy2Var);
            c6586x.f41420e = obj;
            return c6586x;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super R> vddVar, zy2<? super bth> zy2Var) {
            return ((C6586x) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:13:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to gv1$x<R> for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r10.f41419d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f41418c
                java.lang.Object r5 = r10.f41416a
                mu1 r5 = (p000.mu1) r5
                java.lang.Object r6 = r10.f41420e
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r11)
                r11 = r6
                goto L59
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f41418c
                java.lang.Object r5 = r10.f41417b
                vdd r5 = (p000.vdd) r5
                java.lang.Object r6 = r10.f41416a
                mu1 r6 = (p000.mu1) r6
                java.lang.Object r7 = r10.f41420e
                vdd r7 = (p000.vdd) r7
                p000.y7e.throwOnFailure(r11)
                goto L94
            L3a:
                int r1 = r10.f41418c
                java.lang.Object r5 = r10.f41416a
                mu1 r5 = (p000.mu1) r5
                java.lang.Object r6 = r10.f41420e
                vdd r6 = (p000.vdd) r6
                p000.y7e.throwOnFailure(r11)
                goto L6b
            L48:
                p000.y7e.throwOnFailure(r11)
                java.lang.Object r11 = r10.f41420e
                vdd r11 = (p000.vdd) r11
                hsd<E> r1 = r10.f41421f
                mu1 r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L59:
                r10.f41420e = r11
                r10.f41416a = r5
                r10.f41418c = r1
                r10.f41419d = r4
                java.lang.Object r6 = r5.hasNext(r10)
                if (r6 != r0) goto L68
                return r0
            L68:
                r9 = r6
                r6 = r11
                r11 = r9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r5.next()
                kz6<java.lang.Integer, E, zy2<? super R>, java.lang.Object> r7 = r10.f41422m
                int r8 = r1 + 1
                java.lang.Integer r1 = p000.wc1.boxInt(r1)
                r10.f41420e = r6
                r10.f41416a = r5
                r10.f41417b = r6
                r10.f41418c = r8
                r10.f41419d = r3
                java.lang.Object r11 = r7.invoke(r1, r11, r10)
                if (r11 != r0) goto L90
                return r0
            L90:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L94:
                r10.f41420e = r7
                r10.f41416a = r6
                r8 = 0
                r10.f41417b = r8
                r10.f41418c = r1
                r10.f41419d = r2
                java.lang.Object r11 = r5.send(r11, r10)
                if (r11 != r0) goto La6
                return r0
            La6:
                r5 = r6
                r11 = r7
                goto L59
            La9:
                bth r11 = p000.bth.f14751a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gv1.C6586x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gv1$y */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0, 1, 1, 1, 1}, m4012l = {Videoio.CAP_PROP_XI_WB_KB, Videoio.CAP_PROP_XI_HEIGHT}, m4013m = "maxWith", m4014n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C6587y<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41423a;

        /* JADX INFO: renamed from: b */
        public Object f41424b;

        /* JADX INFO: renamed from: c */
        public Object f41425c;

        /* JADX INFO: renamed from: d */
        public Object f41426d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41427e;

        /* JADX INFO: renamed from: f */
        public int f41428f;

        public C6587y(zy2<? super C6587y> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41427e = obj;
            this.f41428f |= Integer.MIN_VALUE;
            return gv1.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gv1$z */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m4010f = "Deprecated.kt", m4011i = {0, 0, 0, 1, 1, 1, 1}, m4012l = {464, Videoio.CAP_PROP_XI_COOLING}, m4013m = "minWith", m4014n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class C6588z<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f41429a;

        /* JADX INFO: renamed from: b */
        public Object f41430b;

        /* JADX INFO: renamed from: c */
        public Object f41431c;

        /* JADX INFO: renamed from: d */
        public Object f41432d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f41433e;

        /* JADX INFO: renamed from: f */
        public int f41434f;

        public C6588z(zy2<? super C6588z> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f41433e = obj;
            this.f41434f |= Integer.MIN_VALUE;
            return gv1.minWith(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object any(p000.hsd r4, p000.zy2 r5) {
        /*
            boolean r0 = r5 instanceof p000.gv1.C6552a
            if (r0 == 0) goto L13
            r0 = r5
            gv1$a r0 = (p000.gv1.C6552a) r0
            int r1 = r0.f41244c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41244c = r1
            goto L18
        L13:
            gv1$a r0 = new gv1$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41243b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41244c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f41242a
            hsd r4 = (p000.hsd) r4
            p000.y7e.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p000.y7e.throwOnFailure(r5)
            mu1 r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f41242a = r4     // Catch: java.lang.Throwable -> L2d
            r0.f41244c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = 0
            p000.av1.cancelConsumed(r4, r0)
            return r5
        L4e:
            throw r5     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            p000.av1.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.any(hsd, zy2):java.lang.Object");
    }

    @xxb
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(@yfb ud1<E> ud1Var, @yfb qy6<? super hsd<? extends E>, ? extends R> qy6Var) {
        hsd<E> hsdVarOpenSubscription = ud1Var.openSubscription();
        try {
            return qy6Var.invoke(hsdVarOpenSubscription);
        } finally {
            o28.finallyStart(1);
            hsd.C6996a.cancel$default((hsd) hsdVarOpenSubscription, (CancellationException) null, 1, (Object) null);
            o28.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:42:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:42:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @p000.gib
    @p000.q64(level = p000.u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(@p000.yfb p000.ud1<E> r6, @p000.yfb p000.qy6<? super E, p000.bth> r7, @p000.yfb p000.zy2<? super p000.bth> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6554b
            if (r0 == 0) goto L13
            r0 = r8
            gv1$b r0 = (p000.gv1.C6554b) r0
            int r1 = r0.f41252e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41252e = r1
            goto L18
        L13:
            gv1$b r0 = new gv1$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41251d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41252e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.f41250c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41249b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41248a
            qy6 r2 = (p000.qy6) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L65
        L3a:
            r6 = move-exception
            goto L8d
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            p000.y7e.throwOnFailure(r8)
            hsd r6 = r6.openSubscription()
            mu1 r8 = r6.iterator()     // Catch: java.lang.Throwable -> L89
            r5 = r8
            r8 = r6
            r6 = r5
        L52:
            r0.f41248a = r7     // Catch: java.lang.Throwable -> L86
            r0.f41249b = r8     // Catch: java.lang.Throwable -> L86
            r0.f41250c = r6     // Catch: java.lang.Throwable -> L86
            r0.f41252e = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L61
            return r1
        L61:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L77
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L77
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L77
            r8 = r0
            r0 = r2
            goto L52
        L77:
            r6 = move-exception
            r7 = r0
            goto L8d
        L7a:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L77
            p000.o28.finallyStart(r4)
            p000.hsd.C6996a.cancel$default(r0, r3, r4, r3)
            p000.o28.finallyEnd(r4)
            return r6
        L86:
            r6 = move-exception
            r7 = r8
            goto L8d
        L89:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8d:
            p000.o28.finallyStart(r4)
            p000.hsd.C6996a.cancel$default(r7, r3, r4, r3)
            p000.o28.finallyEnd(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.consumeEach(ud1, qy6, zy2):java.lang.Object");
    }

    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> Object consumeEach$$forInline(ud1<E> ud1Var, qy6<? super E, bth> qy6Var, zy2<? super bth> zy2Var) {
        hsd<E> hsdVarOpenSubscription = ud1Var.openSubscription();
        try {
            mu1<E> it = hsdVarOpenSubscription.iterator();
            while (true) {
                o28.mark(3);
                o28.mark(0);
                Object objHasNext = it.hasNext(null);
                o28.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                    hsd.C6996a.cancel$default((hsd) hsdVarOpenSubscription, (CancellationException) null, 1, (Object) null);
                    o28.finallyEnd(1);
                    return bthVar;
                }
                qy6Var.invoke(it.next());
            }
        } catch (Throwable th) {
            o28.finallyStart(1);
            hsd.C6996a.cancel$default((hsd) hsdVarOpenSubscription, (CancellationException) null, 1, (Object) null);
            o28.finallyEnd(1);
            throw th;
        }
    }

    @yfb
    @yjd
    public static final qy6<Throwable, bth> consumes(@yfb final hsd<?> hsdVar) {
        return new qy6() { // from class: dv1
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return gv1.consumes$lambda$24$ChannelsKt__DeprecatedKt(hsdVar, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth consumes$lambda$24$ChannelsKt__DeprecatedKt(hsd hsdVar, Throwable th) {
        av1.cancelConsumed(hsdVar, th);
        return bth.f14751a;
    }

    @yfb
    @yjd
    public static final qy6<Throwable, bth> consumesAll(@yfb final hsd<?>... hsdVarArr) {
        return new qy6() { // from class: ev1
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return gv1.consumesAll$lambda$2$ChannelsKt__DeprecatedKt(hsdVarArr, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth consumesAll$lambda$2$ChannelsKt__DeprecatedKt(hsd[] hsdVarArr, Throwable th) throws Throwable {
        Throwable th2 = null;
        for (hsd hsdVar : hsdVarArr) {
            try {
                av1.cancelConsumed(hsdVar, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    a85.addSuppressed(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return bth.f14751a;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0060, B:27:0x0068, B:28:0x0072), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0060, B:27:0x0068, B:28:0x0072), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:25:0x0060). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object count(p000.hsd r6, p000.zy2 r7) {
        /*
            boolean r0 = r7 instanceof p000.gv1.C6556c
            if (r0 == 0) goto L13
            r0 = r7
            gv1$c r0 = (p000.gv1.C6556c) r0
            int r1 = r0.f41260e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41260e = r1
            goto L18
        L13:
            gv1$c r0 = new gv1$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41259d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41260e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f41258c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r2 = r0.f41257b
            hsd r2 = (p000.hsd) r2
            java.lang.Object r4 = r0.f41256a
            jvd$f r4 = (p000.jvd.C8119f) r4
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            p000.y7e.throwOnFailure(r7)
            jvd$f r7 = new jvd$f
            r7.<init>()
            mu1 r2 = r6.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.f41256a = r4     // Catch: java.lang.Throwable -> L7f
            r0.f41257b = r7     // Catch: java.lang.Throwable -> L7f
            r0.f41258c = r6     // Catch: java.lang.Throwable -> L7f
            r0.f41260e = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.f52108a     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.f52108a = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            p000.av1.cancelConsumed(r2, r6)
            int r6 = r4.f52108a
            java.lang.Integer r6 = p000.wc1.boxInt(r6)
            return r6
        L7f:
            r6 = move-exception
            r2 = r7
            goto L85
        L82:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            p000.av1.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.count(hsd, zy2):java.lang.Object");
    }

    @yfb
    @yjd
    public static final <E, K> hsd<E> distinctBy(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super K>, ? extends Object> gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6560e(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd distinctBy$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return av1.distinctBy(hsdVar, e13Var, gz6Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd drop(hsd hsdVar, int i, e13 e13Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6562f(i, hsdVar, null), 6, null);
    }

    public static /* synthetic */ hsd drop$default(hsd hsdVar, int i, e13 e13Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            e13Var = df4.getUnconfined();
        }
        return drop(hsdVar, i, e13Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd dropWhile(hsd hsdVar, e13 e13Var, gz6 gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6564g(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd dropWhile$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return dropWhile(hsdVar, e13Var, gz6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:46:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0064, B:27:0x006c, B:33:0x007d, B:34:0x0094), top: B:46:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:25:0x0064). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAt(p000.hsd r9, int r10, p000.zy2 r11) {
        /*
            boolean r0 = r11 instanceof p000.gv1.C6566h
            if (r0 == 0) goto L13
            r0 = r11
            gv1$h r0 = (p000.gv1.C6566h) r0
            int r1 = r0.f41312f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41312f = r1
            goto L18
        L13:
            gv1$h r0 = new gv1$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f41311e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41312f
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r9 = r0.f41308b
            int r10 = r0.f41307a
            java.lang.Object r2 = r0.f41310d
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r6 = r0.f41309c
            hsd r6 = (p000.hsd) r6
            p000.y7e.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lb1
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            p000.y7e.throwOnFailure(r11)
            if (r10 < 0) goto L99
            mu1 r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.f41309c = r9     // Catch: java.lang.Throwable -> L95
            r0.f41310d = r11     // Catch: java.lang.Throwable -> L95
            r0.f41307a = r10     // Catch: java.lang.Throwable -> L95
            r0.f41308b = r2     // Catch: java.lang.Throwable -> L95
            r0.f41312f = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            p000.av1.cancelConsumed(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r4)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb1
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r0.append(r4)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            p000.av1.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.elementAt(hsd, int, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:27:0x0068, B:29:0x0070, B:23:0x0053, B:22:0x004e), top: B:43:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:27:0x0068). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAtOrNull(p000.hsd r8, int r9, p000.zy2 r10) {
        /*
            boolean r0 = r10 instanceof p000.gv1.C6568i
            if (r0 == 0) goto L13
            r0 = r10
            gv1$i r0 = (p000.gv1.C6568i) r0
            int r1 = r0.f41323f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41323f = r1
            goto L18
        L13:
            gv1$i r0 = new gv1$i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41322e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41323f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r8 = r0.f41319b
            int r9 = r0.f41318a
            java.lang.Object r2 = r0.f41321d
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r5 = r0.f41320c
            hsd r5 = (p000.hsd) r5
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3b
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L68
        L3b:
            r8 = move-exception
            goto L88
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            p000.y7e.throwOnFailure(r10)
            if (r9 >= 0) goto L4e
            p000.av1.cancelConsumed(r8, r4)
            return r4
        L4e:
            mu1 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L53:
            r0.f41320c = r8     // Catch: java.lang.Throwable -> L80
            r0.f41321d = r10     // Catch: java.lang.Throwable -> L80
            r0.f41318a = r9     // Catch: java.lang.Throwable -> L80
            r0.f41319b = r2     // Catch: java.lang.Throwable -> L80
            r0.f41323f = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L80
            if (r5 != r1) goto L64
            return r1
        L64:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L80
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r10 == 0) goto L84
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L80
            int r6 = r2 + 1
            if (r9 != r2) goto L7c
            p000.av1.cancelConsumed(r8, r4)
            return r10
        L7c:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L53
        L80:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L88
        L84:
            p000.av1.cancelConsumed(r8, r4)
            return r4
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            p000.av1.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.elementAtOrNull(hsd, int, zy2):java.lang.Object");
    }

    @yfb
    @yjd
    public static final <E> hsd<E> filter(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6570j(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd filter$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return av1.filter(hsdVar, e13Var, gz6Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd filterIndexed(hsd hsdVar, e13 e13Var, kz6 kz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6572k(hsdVar, kz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd filterIndexed$default(hsd hsdVar, e13 e13Var, kz6 kz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return filterIndexed(hsdVar, e13Var, kz6Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd filterNot(hsd hsdVar, e13 e13Var, gz6 gz6Var) {
        return av1.filter(hsdVar, e13Var, new C6574l(gz6Var, null));
    }

    public static /* synthetic */ hsd filterNot$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return filterNot(hsdVar, e13Var, gz6Var);
    }

    @yfb
    @yjd
    public static final <E> hsd<E> filterNotNull(@yfb hsd<? extends E> hsdVar) {
        hsd<E> hsdVarFilter$default = filter$default(hsdVar, null, new C6575m(null), 1, null);
        md8.checkNotNull(hsdVarFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return hsdVarFilter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:29:0x006a, B:21:0x004a, B:31:0x006f), top: B:40:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:29:0x006a, B:21:0x004a, B:31:0x006f), top: B:40:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(p000.hsd r5, java.util.Collection r6, p000.zy2 r7) {
        /*
            boolean r0 = r7 instanceof p000.gv1.C6576n
            if (r0 == 0) goto L13
            r0 = r7
            gv1$n r0 = (p000.gv1.C6576n) r0
            int r1 = r0.f41366e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41366e = r1
            goto L18
        L13:
            gv1$n r0 = new gv1$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41365d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41366e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f41364c
            mu1 r5 = (p000.mu1) r5
            java.lang.Object r6 = r0.f41363b
            hsd r6 = (p000.hsd) r6
            java.lang.Object r2 = r0.f41362a
            java.util.Collection r2 = (java.util.Collection) r2
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            p000.y7e.throwOnFailure(r7)
            mu1 r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f41362a = r7     // Catch: java.lang.Throwable -> L35
            r0.f41363b = r6     // Catch: java.lang.Throwable -> L35
            r0.f41364c = r5     // Catch: java.lang.Throwable -> L35
            r0.f41366e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            bth r5 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            p000.av1.cancelConsumed(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            p000.av1.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.filterNotNullTo(hsd, java.util.Collection, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x0053, B:25:0x005b, B:28:0x0064, B:29:0x006b), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object first(p000.hsd r5, p000.zy2 r6) {
        /*
            boolean r0 = r6 instanceof p000.gv1.C6578p
            if (r0 == 0) goto L13
            r0 = r6
            gv1$p r0 = (p000.gv1.C6578p) r0
            int r1 = r0.f41375d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41375d = r1
            goto L18
        L13:
            gv1$p r0 = new gv1$p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41374c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41375d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f41373b
            mu1 r5 = (p000.mu1) r5
            java.lang.Object r0 = r0.f41372a
            hsd r0 = (p000.hsd) r0
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            p000.y7e.throwOnFailure(r6)
            mu1 r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.f41372a = r5     // Catch: java.lang.Throwable -> L6c
            r0.f41373b = r6     // Catch: java.lang.Throwable -> L6c
            r0.f41375d = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            p000.av1.cancelConsumed(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            p000.av1.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.first(hsd, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(p000.hsd r5, p000.zy2 r6) {
        /*
            boolean r0 = r6 instanceof p000.gv1.C6579q
            if (r0 == 0) goto L13
            r0 = r6
            gv1$q r0 = (p000.gv1.C6579q) r0
            int r1 = r0.f41379d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41379d = r1
            goto L18
        L13:
            gv1$q r0 = new gv1$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41378c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41379d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f41377b
            mu1 r5 = (p000.mu1) r5
            java.lang.Object r0 = r0.f41376a
            hsd r0 = (p000.hsd) r0
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            p000.y7e.throwOnFailure(r6)
            mu1 r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.f41376a = r5     // Catch: java.lang.Throwable -> L68
            r0.f41377b = r6     // Catch: java.lang.Throwable -> L68
            r0.f41379d = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            p000.av1.cancelConsumed(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            p000.av1.cancelConsumed(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            p000.av1.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.firstOrNull(hsd, zy2):java.lang.Object");
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd flatMap(hsd hsdVar, e13 e13Var, gz6 gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6580r(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd flatMap$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return flatMap(hsdVar, e13Var, gz6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:25:0x0067, B:27:0x0070, B:29:0x007a, B:32:0x0084, B:21:0x0053, B:33:0x008b), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object indexOf(p000.hsd r7, java.lang.Object r8, p000.zy2 r9) {
        /*
            boolean r0 = r9 instanceof p000.gv1.C6581s
            if (r0 == 0) goto L13
            r0 = r9
            gv1$s r0 = (p000.gv1.C6581s) r0
            int r1 = r0.f41390f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41390f = r1
            goto L18
        L13:
            gv1$s r0 = new gv1$s
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41389e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41390f
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f41388d
            mu1 r7 = (p000.mu1) r7
            java.lang.Object r8 = r0.f41387c
            hsd r8 = (p000.hsd) r8
            java.lang.Object r2 = r0.f41386b
            jvd$f r2 = (p000.jvd.C8119f) r2
            java.lang.Object r4 = r0.f41385a
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            p000.y7e.throwOnFailure(r9)
            jvd$f r9 = new jvd$f
            r9.<init>()
            mu1 r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.f41385a = r9     // Catch: java.lang.Throwable -> L37
            r0.f41386b = r2     // Catch: java.lang.Throwable -> L37
            r0.f41387c = r8     // Catch: java.lang.Throwable -> L37
            r0.f41388d = r7     // Catch: java.lang.Throwable -> L37
            r0.f41390f = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = p000.md8.areEqual(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.f52108a     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = p000.wc1.boxInt(r7)     // Catch: java.lang.Throwable -> L37
            p000.av1.cancelConsumed(r8, r5)
            return r7
        L84:
            int r9 = r2.f52108a     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.f52108a = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L37
            p000.av1.cancelConsumed(r8, r5)
            r7 = -1
            java.lang.Integer r7 = p000.wc1.boxInt(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            p000.av1.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.indexOf(hsd, java.lang.Object, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:37:0x008b, B:39:0x0093), top: B:51:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0087 -> B:37:0x008b). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object last(p000.hsd r6, p000.zy2 r7) {
        /*
            boolean r0 = r7 instanceof p000.gv1.C6582t
            if (r0 == 0) goto L13
            r0 = r7
            gv1$t r0 = (p000.gv1.C6582t) r0
            int r1 = r0.f41395e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41395e = r1
            goto L18
        L13:
            gv1$t r0 = new gv1$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41394d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41395e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.f41393c
            java.lang.Object r2 = r0.f41392b
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r4 = r0.f41391a
            hsd r4 = (p000.hsd) r4
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L8b
        L36:
            r6 = move-exception
            r2 = r4
            goto Laa
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.f41392b
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r2 = r0.f41391a
            hsd r2 = (p000.hsd) r2
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4e
            goto L69
        L4e:
            r6 = move-exception
            goto Laa
        L51:
            p000.y7e.throwOnFailure(r7)
            mu1 r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f41391a = r6     // Catch: java.lang.Throwable -> L9e
            r0.f41392b = r7     // Catch: java.lang.Throwable -> L9e
            r0.f41395e = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L69:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L78:
            r0.f41391a = r6     // Catch: java.lang.Throwable -> L9e
            r0.f41392b = r2     // Catch: java.lang.Throwable -> L9e
            r0.f41393c = r7     // Catch: java.lang.Throwable -> L9e
            r0.f41395e = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r4 != r1) goto L87
            return r1
        L87:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L99
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L78
        L99:
            r7 = 0
            p000.av1.cancelConsumed(r4, r7)
            return r6
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto Laa
        La2:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        Laa:
            throw r6     // Catch: java.lang.Throwable -> Lab
        Lab:
            r7 = move-exception
            p000.av1.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.last(hsd, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007d, B:29:0x0087, B:30:0x008b, B:21:0x005f, B:31:0x0092), top: B:42:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0037, B:25:0x0075, B:27:0x007d, B:29:0x0087, B:30:0x008b, B:21:0x005f, B:31:0x0092), top: B:42:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:25:0x0075). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(p000.hsd r7, java.lang.Object r8, p000.zy2 r9) {
        /*
            boolean r0 = r9 instanceof p000.gv1.C6583u
            if (r0 == 0) goto L13
            r0 = r9
            gv1$u r0 = (p000.gv1.C6583u) r0
            int r1 = r0.f41402m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41402m = r1
            goto L18
        L13:
            gv1$u r0 = new gv1$u
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41401f
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41402m
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.f41400e
            mu1 r7 = (p000.mu1) r7
            java.lang.Object r8 = r0.f41399d
            hsd r8 = (p000.hsd) r8
            java.lang.Object r2 = r0.f41398c
            jvd$f r2 = (p000.jvd.C8119f) r2
            java.lang.Object r4 = r0.f41397b
            jvd$f r4 = (p000.jvd.C8119f) r4
            java.lang.Object r5 = r0.f41396a
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            p000.y7e.throwOnFailure(r9)
            jvd$f r9 = new jvd$f
            r9.<init>()
            r2 = -1
            r9.f52108a = r2
            jvd$f r2 = new jvd$f
            r2.<init>()
            mu1 r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.f41396a = r9     // Catch: java.lang.Throwable -> L3b
            r0.f41397b = r4     // Catch: java.lang.Throwable -> L3b
            r0.f41398c = r2     // Catch: java.lang.Throwable -> L3b
            r0.f41399d = r8     // Catch: java.lang.Throwable -> L3b
            r0.f41400e = r7     // Catch: java.lang.Throwable -> L3b
            r0.f41402m = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = p000.md8.areEqual(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.f52108a     // Catch: java.lang.Throwable -> L3b
            r4.f52108a = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.f52108a     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.f52108a = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L3b
            r7 = 0
            p000.av1.cancelConsumed(r8, r7)
            int r7 = r4.f52108a
            java.lang.Integer r7 = p000.wc1.boxInt(r7)
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            p000.av1.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.lastIndexOf(hsd, java.lang.Object, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:39:0x008f, B:41:0x0097), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008b -> B:39:0x008f). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(p000.hsd r7, p000.zy2 r8) {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6584v
            if (r0 == 0) goto L13
            r0 = r8
            gv1$v r0 = (p000.gv1.C6584v) r0
            int r1 = r0.f41407e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41407e = r1
            goto L18
        L13:
            gv1$v r0 = new gv1$v
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41406d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41407e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f41405c
            java.lang.Object r2 = r0.f41404b
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r4 = r0.f41403a
            hsd r4 = (p000.hsd) r4
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f41404b
            mu1 r7 = (p000.mu1) r7
            java.lang.Object r2 = r0.f41403a
            hsd r2 = (p000.hsd) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            p000.y7e.throwOnFailure(r8)
            mu1 r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.f41403a = r7     // Catch: java.lang.Throwable -> La1
            r0.f41404b = r8     // Catch: java.lang.Throwable -> La1
            r0.f41407e = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            p000.av1.cancelConsumed(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.f41403a = r7     // Catch: java.lang.Throwable -> La1
            r0.f41404b = r2     // Catch: java.lang.Throwable -> La1
            r0.f41405c = r8     // Catch: java.lang.Throwable -> La1
            r0.f41407e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            p000.av1.cancelConsumed(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            p000.av1.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.lastOrNull(hsd, zy2):java.lang.Object");
    }

    @yfb
    @yjd
    public static final <E, R> hsd<R> map(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb gz6<? super E, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6585w(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd map$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return av1.map(hsdVar, e13Var, gz6Var);
    }

    @yfb
    @yjd
    public static final <E, R> hsd<R> mapIndexed(@yfb hsd<? extends E> hsdVar, @yfb e13 e13Var, @yfb kz6<? super Integer, ? super E, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6586x(hsdVar, kz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd mapIndexed$default(hsd hsdVar, e13 e13Var, kz6 kz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return av1.mapIndexed(hsdVar, e13Var, kz6Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd mapIndexedNotNull(hsd hsdVar, e13 e13Var, kz6 kz6Var) {
        return av1.filterNotNull(av1.mapIndexed(hsdVar, e13Var, kz6Var));
    }

    public static /* synthetic */ hsd mapIndexedNotNull$default(hsd hsdVar, e13 e13Var, kz6 kz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return mapIndexedNotNull(hsdVar, e13Var, kz6Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd mapNotNull(hsd hsdVar, e13 e13Var, gz6 gz6Var) {
        return av1.filterNotNull(av1.map(hsdVar, e13Var, gz6Var));
    }

    public static /* synthetic */ hsd mapNotNull$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return mapNotNull(hsdVar, e13Var, gz6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object maxWith(p000.hsd r8, java.util.Comparator r9, p000.zy2 r10) {
        /*
            boolean r0 = r10 instanceof p000.gv1.C6587y
            if (r0 == 0) goto L13
            r0 = r10
            gv1$y r0 = (p000.gv1.C6587y) r0
            int r1 = r0.f41428f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41428f = r1
            goto L18
        L13:
            gv1$y r0 = new gv1$y
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41427e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41428f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5f
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r8 = r0.f41426d
            java.lang.Object r9 = r0.f41425c
            mu1 r9 = (p000.mu1) r9
            java.lang.Object r2 = r0.f41424b
            hsd r2 = (p000.hsd) r2
            java.lang.Object r4 = r0.f41423a
            java.util.Comparator r4 = (java.util.Comparator) r4
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L40
            r7 = r0
            r0 = r8
            r8 = r2
        L3d:
            r2 = r7
            goto La3
        L40:
            r8 = move-exception
            r9 = r2
            goto Lc2
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            java.lang.Object r8 = r0.f41425c
            mu1 r8 = (p000.mu1) r8
            java.lang.Object r9 = r0.f41424b
            hsd r9 = (p000.hsd) r9
            java.lang.Object r2 = r0.f41423a
            java.util.Comparator r2 = (java.util.Comparator) r2
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5c
            goto L7a
        L5c:
            r8 = move-exception
            goto Lc2
        L5f:
            p000.y7e.throwOnFailure(r10)
            mu1 r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb9
            r0.f41423a = r9     // Catch: java.lang.Throwable -> Lb9
            r0.f41424b = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f41425c = r10     // Catch: java.lang.Throwable -> Lb9
            r0.f41428f = r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r1) goto L75
            return r1
        L75:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L5c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r10 != 0) goto L86
            p000.av1.cancelConsumed(r9, r5)
            return r5
        L86:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L5c
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L8e:
            r0.f41423a = r4     // Catch: java.lang.Throwable -> Lb9
            r0.f41424b = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f41425c = r9     // Catch: java.lang.Throwable -> Lb9
            r0.f41426d = r10     // Catch: java.lang.Throwable -> Lb9
            r0.f41428f = r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r1) goto L9f
            return r1
        L9f:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L3d
        La3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r10 == 0) goto Lbe
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb9
            int r6 = r4.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb9
            if (r6 >= 0) goto Lb7
        Lb5:
            r0 = r2
            goto L8e
        Lb7:
            r10 = r0
            goto Lb5
        Lb9:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lc2
        Lbe:
            p000.av1.cancelConsumed(r8, r5)
            return r0
        Lc2:
            throw r8     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r10 = move-exception
            p000.av1.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.maxWith(hsd, java.util.Comparator, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:40:0x00a3, B:42:0x00ab, B:36:0x008e, B:26:0x0062), top: B:58:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009f -> B:15:0x003d). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object minWith(p000.hsd r8, java.util.Comparator r9, p000.zy2 r10) {
        /*
            boolean r0 = r10 instanceof p000.gv1.C6588z
            if (r0 == 0) goto L13
            r0 = r10
            gv1$z r0 = (p000.gv1.C6588z) r0
            int r1 = r0.f41434f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41434f = r1
            goto L18
        L13:
            gv1$z r0 = new gv1$z
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41433e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41434f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5f
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r8 = r0.f41432d
            java.lang.Object r9 = r0.f41431c
            mu1 r9 = (p000.mu1) r9
            java.lang.Object r2 = r0.f41430b
            hsd r2 = (p000.hsd) r2
            java.lang.Object r4 = r0.f41429a
            java.util.Comparator r4 = (java.util.Comparator) r4
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L40
            r7 = r0
            r0 = r8
            r8 = r2
        L3d:
            r2 = r7
            goto La3
        L40:
            r8 = move-exception
            r9 = r2
            goto Lc2
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            java.lang.Object r8 = r0.f41431c
            mu1 r8 = (p000.mu1) r8
            java.lang.Object r9 = r0.f41430b
            hsd r9 = (p000.hsd) r9
            java.lang.Object r2 = r0.f41429a
            java.util.Comparator r2 = (java.util.Comparator) r2
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5c
            goto L7a
        L5c:
            r8 = move-exception
            goto Lc2
        L5f:
            p000.y7e.throwOnFailure(r10)
            mu1 r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb9
            r0.f41429a = r9     // Catch: java.lang.Throwable -> Lb9
            r0.f41430b = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f41431c = r10     // Catch: java.lang.Throwable -> Lb9
            r0.f41434f = r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r1) goto L75
            return r1
        L75:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L5c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r10 != 0) goto L86
            p000.av1.cancelConsumed(r9, r5)
            return r5
        L86:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L5c
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L8e:
            r0.f41429a = r4     // Catch: java.lang.Throwable -> Lb9
            r0.f41430b = r8     // Catch: java.lang.Throwable -> Lb9
            r0.f41431c = r9     // Catch: java.lang.Throwable -> Lb9
            r0.f41432d = r10     // Catch: java.lang.Throwable -> Lb9
            r0.f41434f = r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r1) goto L9f
            return r1
        L9f:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L3d
        La3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb9
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb9
            if (r10 == 0) goto Lbe
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb9
            int r6 = r4.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb9
            if (r6 <= 0) goto Lb7
        Lb5:
            r0 = r2
            goto L8e
        Lb7:
            r10 = r0
            goto Lb5
        Lb9:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lc2
        Lbe:
            p000.av1.cancelConsumed(r8, r5)
            return r0
        Lc2:
            throw r8     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r10 = move-exception
            p000.av1.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.minWith(hsd, java.util.Comparator, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object none(p000.hsd r4, p000.zy2 r5) {
        /*
            boolean r0 = r5 instanceof p000.gv1.C6553a0
            if (r0 == 0) goto L13
            r0 = r5
            gv1$a0 r0 = (p000.gv1.C6553a0) r0
            int r1 = r0.f41247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41247c = r1
            goto L18
        L13:
            gv1$a0 r0 = new gv1$a0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41246b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41247c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f41245a
            hsd r4 = (p000.hsd) r4
            p000.y7e.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p000.y7e.throwOnFailure(r5)
            mu1 r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f41245a = r4     // Catch: java.lang.Throwable -> L2d
            r0.f41247c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r5 = r5 ^ r3
            java.lang.Boolean r5 = p000.wc1.boxBoolean(r5)     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            p000.av1.cancelConsumed(r4, r0)
            return r5
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            p000.av1.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.none(hsd, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:20:0x0046, B:29:0x0064, B:31:0x006c, B:41:0x0096, B:42:0x009d), top: B:53:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object single(p000.hsd r6, p000.zy2 r7) {
        /*
            boolean r0 = r7 instanceof p000.gv1.C6557c0
            if (r0 == 0) goto L13
            r0 = r7
            gv1$c0 r0 = (p000.gv1.C6557c0) r0
            int r1 = r0.f41264d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41264d = r1
            goto L18
        L13:
            gv1$c0 r0 = new gv1$c0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41263c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41264d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f41262b
            java.lang.Object r0 = r0.f41261a
            hsd r0 = (p000.hsd) r0
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f41262b
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r2 = r0.f41261a
            hsd r2 = (p000.hsd) r2
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            p000.y7e.throwOnFailure(r7)
            mu1 r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f41261a = r6     // Catch: java.lang.Throwable -> L9e
            r0.f41262b = r7     // Catch: java.lang.Throwable -> L9e
            r0.f41264d = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.f41261a = r2     // Catch: java.lang.Throwable -> L4a
            r0.f41262b = r7     // Catch: java.lang.Throwable -> L4a
            r0.f41264d = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            p000.av1.cancelConsumed(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            p000.av1.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.single(hsd, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(p000.hsd r7, p000.zy2 r8) {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6559d0
            if (r0 == 0) goto L13
            r0 = r8
            gv1$d0 r0 = (p000.gv1.C6559d0) r0
            int r1 = r0.f41270d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41270d = r1
            goto L18
        L13:
            gv1$d0 r0 = new gv1$d0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41269c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41270d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f41268b
            java.lang.Object r0 = r0.f41267a
            hsd r0 = (p000.hsd) r0
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f41268b
            mu1 r7 = (p000.mu1) r7
            java.lang.Object r2 = r0.f41267a
            hsd r2 = (p000.hsd) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            p000.y7e.throwOnFailure(r8)
            mu1 r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.f41267a = r7     // Catch: java.lang.Throwable -> L96
            r0.f41268b = r8     // Catch: java.lang.Throwable -> L96
            r0.f41270d = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            p000.av1.cancelConsumed(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.f41267a = r2     // Catch: java.lang.Throwable -> L4b
            r0.f41268b = r8     // Catch: java.lang.Throwable -> L4b
            r0.f41270d = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            p000.av1.cancelConsumed(r0, r5)
            return r5
        L92:
            p000.av1.cancelConsumed(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            p000.av1.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.singleOrNull(hsd, zy2):java.lang.Object");
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd take(hsd hsdVar, int i, e13 e13Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6561e0(i, hsdVar, null), 6, null);
    }

    public static /* synthetic */ hsd take$default(hsd hsdVar, int i, e13 e13Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            e13Var = df4.getUnconfined();
        }
        return take(hsdVar, i, e13Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd takeWhile(hsd hsdVar, e13 e13Var, gz6 gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6563f0(hsdVar, gz6Var, null), 6, null);
    }

    public static /* synthetic */ hsd takeWhile$default(hsd hsdVar, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return takeWhile(hsdVar, e13Var, gz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0034, B:28:0x0070, B:30:0x0078, B:33:0x008b, B:20:0x0051), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0034, B:28:0x0070, B:30:0x0078, B:33:0x008b, B:20:0x0051), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, nye] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends nye<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [hsd] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [hsd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:14:0x0037). Please report as a decompilation issue!!! */
    @p000.gib
    @p000.yjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends p000.nye<? super E>> java.lang.Object toChannel(@p000.yfb p000.hsd<? extends E> r6, @p000.yfb C r7, @p000.yfb p000.zy2<? super C> r8) {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6565g0
            if (r0 == 0) goto L13
            r0 = r8
            gv1$g0 r0 = (p000.gv1.C6565g0) r0
            int r1 = r0.f41306e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41306e = r1
            goto L18
        L13:
            gv1$g0 r0 = new gv1$g0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41305d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41306e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f41304c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41303b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41302a
            nye r2 = (p000.nye) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            r6 = move-exception
            goto L96
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f41304c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41303b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41302a
            nye r2 = (p000.nye) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
            goto L70
        L55:
            p000.y7e.throwOnFailure(r8)
            mu1 r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.f41302a = r7     // Catch: java.lang.Throwable -> L92
            r0.f41303b = r6     // Catch: java.lang.Throwable -> L92
            r0.f41304c = r8     // Catch: java.lang.Throwable -> L92
            r0.f41306e = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3b
            r0.f41302a = r2     // Catch: java.lang.Throwable -> L3b
            r0.f41303b = r7     // Catch: java.lang.Throwable -> L3b
            r0.f41304c = r6     // Catch: java.lang.Throwable -> L3b
            r0.f41306e = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L37
            return r1
        L8b:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L3b
            r6 = 0
            p000.av1.cancelConsumed(r7, r6)
            return r2
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            p000.av1.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.toChannel(hsd, nye, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @p000.gib
    @p000.yjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(@p000.yfb p000.hsd<? extends E> r5, @p000.yfb C r6, @p000.yfb p000.zy2<? super C> r7) {
        /*
            boolean r0 = r7 instanceof p000.gv1.C6567h0
            if (r0 == 0) goto L13
            r0 = r7
            gv1$h0 r0 = (p000.gv1.C6567h0) r0
            int r1 = r0.f41317e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41317e = r1
            goto L18
        L13:
            gv1$h0 r0 = new gv1$h0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41316d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41317e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f41315c
            mu1 r5 = (p000.mu1) r5
            java.lang.Object r6 = r0.f41314b
            hsd r6 = (p000.hsd) r6
            java.lang.Object r2 = r0.f41313a
            java.util.Collection r2 = (java.util.Collection) r2
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            p000.y7e.throwOnFailure(r7)
            mu1 r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f41313a = r7     // Catch: java.lang.Throwable -> L35
            r0.f41314b = r6     // Catch: java.lang.Throwable -> L35
            r0.f41315c = r5     // Catch: java.lang.Throwable -> L35
            r0.f41317e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            bth r5 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            p000.av1.cancelConsumed(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            p000.av1.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.toCollection(hsd, java.util.Collection, zy2):java.lang.Object");
    }

    @gib
    @yjd
    public static final <E> Object toMutableSet(@yfb hsd<? extends E> hsdVar, @yfb zy2<? super Set<E>> zy2Var) {
        return av1.toCollection(hsdVar, new LinkedHashSet(), zy2Var);
    }

    @q64(level = u64.f86867c, message = "Binary compatibility")
    public static final /* synthetic */ hsd withIndex(hsd hsdVar, e13 e13Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumes(hsdVar), new C6571j0(hsdVar, null), 6, null);
    }

    public static /* synthetic */ hsd withIndex$default(hsd hsdVar, e13 e13Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = df4.getUnconfined();
        }
        return withIndex(hsdVar, e13Var);
    }

    public static /* synthetic */ hsd zip$default(hsd hsdVar, hsd hsdVar2, e13 e13Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            e13Var = df4.getUnconfined();
        }
        return av1.zip(hsdVar, hsdVar2, e13Var, gz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x0077), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x0077), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @p000.gib
    @p000.yjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(@p000.yfb p000.hsd<? extends p000.scc<? extends K, ? extends V>> r6, @p000.yfb M r7, @p000.yfb p000.zy2<? super M> r8) {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6569i0
            if (r0 == 0) goto L13
            r0 = r8
            gv1$i0 r0 = (p000.gv1.C6569i0) r0
            int r1 = r0.f41328e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41328e = r1
            goto L18
        L13:
            gv1$i0 r0 = new gv1$i0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41327d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41328e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f41326c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41325b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41324a
            java.util.Map r2 = (java.util.Map) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            p000.y7e.throwOnFailure(r8)
            mu1 r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f41324a = r8     // Catch: java.lang.Throwable -> L35
            r0.f41325b = r7     // Catch: java.lang.Throwable -> L35
            r0.f41326c = r6     // Catch: java.lang.Throwable -> L35
            r0.f41328e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            scc r8 = (p000.scc) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            p000.av1.cancelConsumed(r7, r6)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            p000.av1.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.toMap(hsd, java.util.Map, zy2):java.lang.Object");
    }

    @yfb
    @yjd
    public static final <E, R, V> hsd<V> zip(@yfb hsd<? extends E> hsdVar, @yfb hsd<? extends R> hsdVar2, @yfb e13 e13Var, @yfb gz6<? super E, ? super R, ? extends V> gz6Var) {
        return rdd.produce$default(q77.f73410a, e13Var, 0, null, av1.consumesAll(hsdVar, hsdVar2), new C6573k0(hsdVar2, hsdVar, gz6Var, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:36:0x008f, B:20:0x004f), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:36:0x008f, B:20:0x004f), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, nye] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [hsd] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [nye] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [hsd] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [hsd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:35:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:35:0x008b). Please report as a decompilation issue!!! */
    @p000.q64(level = p000.u64.f86867c, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(p000.hsd r6, p000.nye r7, p000.zy2 r8) {
        /*
            boolean r0 = r8 instanceof p000.gv1.C6577o
            if (r0 == 0) goto L13
            r0 = r8
            gv1$o r0 = (p000.gv1.C6577o) r0
            int r1 = r0.f41371e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41371e = r1
            goto L18
        L13:
            gv1$o r0 = new gv1$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41370d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41371e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.f41369c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41368b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41367a
            nye r2 = (p000.nye) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L8b
        L38:
            r6 = move-exception
            goto L9a
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.f41369c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f41368b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f41367a
            nye r2 = (p000.nye) r2
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L6e
        L53:
            p000.y7e.throwOnFailure(r8)
            mu1 r8 = r6.iterator()     // Catch: java.lang.Throwable -> L96
        L5a:
            r0.f41367a = r7     // Catch: java.lang.Throwable -> L96
            r0.f41368b = r6     // Catch: java.lang.Throwable -> L96
            r0.f41369c = r8     // Catch: java.lang.Throwable -> L96
            r0.f41371e = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8b
            r0.f41367a = r2     // Catch: java.lang.Throwable -> L38
            r0.f41368b = r7     // Catch: java.lang.Throwable -> L38
            r0.f41369c = r6     // Catch: java.lang.Throwable -> L38
            r0.f41371e = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 != r1) goto L8b
            return r1
        L8b:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5a
        L8f:
            bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L38
            r6 = 0
            p000.av1.cancelConsumed(r7, r6)
            return r2
        L96:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L9a:
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            p000.av1.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gv1.filterNotNullTo(hsd, nye, zy2):java.lang.Object");
    }
}
