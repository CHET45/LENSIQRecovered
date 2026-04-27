package p000;

import java.util.List;
import org.opencv.videoio.Videoio;
import p000.jvd;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,957:1\n750#1,9:958\n759#1,4:976\n763#1,23:987\n706#1,4:1010\n710#1,2:1023\n712#1,8:1032\n750#1,9:1040\n759#1,4:1058\n763#1,23:1069\n750#1,9:1092\n759#1,4:1110\n763#1,23:1121\n664#1,6:1144\n706#1,4:1150\n710#1,2:1163\n712#1,7:1172\n670#1,7:1179\n719#1:1186\n677#1,12:1187\n706#1,4:1199\n710#1,2:1212\n712#1,8:1221\n750#1,9:1229\n759#1,4:1247\n763#1,23:1258\n750#1,9:1281\n759#1,4:1299\n763#1,23:1310\n664#1,6:1333\n706#1,4:1339\n710#1,2:1352\n712#1,7:1361\n670#1,7:1368\n719#1:1375\n677#1,12:1376\n706#1,4:1388\n710#1,2:1401\n712#1,8:1410\n706#1,4:1418\n710#1,2:1431\n712#1,8:1440\n706#1,4:1448\n710#1,2:1461\n712#1,8:1470\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:980\n118#2:986\n116#2,2:1014\n33#2,6:1016\n118#2:1022\n33#2,6:1025\n118#2:1031\n116#2,2:1049\n33#2,6:1051\n118#2:1057\n33#2,6:1062\n118#2:1068\n116#2,2:1101\n33#2,6:1103\n118#2:1109\n33#2,6:1114\n118#2:1120\n116#2,2:1154\n33#2,6:1156\n118#2:1162\n33#2,6:1165\n118#2:1171\n116#2,2:1203\n33#2,6:1205\n118#2:1211\n33#2,6:1214\n118#2:1220\n116#2,2:1238\n33#2,6:1240\n118#2:1246\n33#2,6:1251\n118#2:1257\n116#2,2:1290\n33#2,6:1292\n118#2:1298\n33#2,6:1303\n118#2:1309\n116#2,2:1343\n33#2,6:1345\n118#2:1351\n33#2,6:1354\n118#2:1360\n116#2,2:1392\n33#2,6:1394\n118#2:1400\n33#2,6:1403\n118#2:1409\n116#2,2:1422\n33#2,6:1424\n118#2:1430\n33#2,6:1433\n118#2:1439\n116#2,2:1452\n33#2,6:1454\n118#2:1460\n33#2,6:1463\n118#2:1469\n116#2,2:1478\n33#2,6:1480\n118#2:1486\n116#2,2:1487\n33#2,6:1489\n118#2:1495\n116#2,2:1496\n33#2,6:1498\n118#2:1504\n116#2,2:1505\n33#2,6:1507\n118#2:1513\n116#2,2:1514\n33#2,6:1516\n118#2:1522\n116#2,2:1523\n33#2,6:1525\n118#2:1531\n158#3:1532\n148#3:1533\n77#4:1534\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:958,9\n78#1:976,4\n78#1:987,23\n142#1:1010,4\n142#1:1023,2\n142#1:1032,8\n369#1:1040,9\n369#1:1058,4\n369#1:1069,23\n380#1:1092,9\n380#1:1110,4\n380#1:1121,23\n406#1:1144,6\n406#1:1150,4\n406#1:1163,2\n406#1:1172,7\n406#1:1179,7\n406#1:1186\n406#1:1187,12\n436#1:1199,4\n436#1:1212,2\n436#1:1221,8\n520#1:1229,9\n520#1:1247,4\n520#1:1258,23\n531#1:1281,9\n531#1:1299,4\n531#1:1310,23\n554#1:1333,6\n554#1:1339,4\n554#1:1352,2\n554#1:1361,7\n554#1:1368,7\n554#1:1375\n554#1:1376,12\n584#1:1388,4\n584#1:1401,2\n584#1:1410,8\n669#1:1418,4\n669#1:1431,2\n669#1:1440,8\n669#1:1448,4\n669#1:1461,2\n669#1:1470,8\n78#1:967,2\n78#1:969,6\n78#1:975\n78#1:980,6\n78#1:986\n142#1:1014,2\n142#1:1016,6\n142#1:1022\n142#1:1025,6\n142#1:1031\n369#1:1049,2\n369#1:1051,6\n369#1:1057\n369#1:1062,6\n369#1:1068\n380#1:1101,2\n380#1:1103,6\n380#1:1109\n380#1:1114,6\n380#1:1120\n406#1:1154,2\n406#1:1156,6\n406#1:1162\n406#1:1165,6\n406#1:1171\n436#1:1203,2\n436#1:1205,6\n436#1:1211\n436#1:1214,6\n436#1:1220\n520#1:1238,2\n520#1:1240,6\n520#1:1246\n520#1:1251,6\n520#1:1257\n531#1:1290,2\n531#1:1292,6\n531#1:1298\n531#1:1303,6\n531#1:1309\n554#1:1343,2\n554#1:1345,6\n554#1:1351\n554#1:1354,6\n554#1:1360\n584#1:1392,2\n584#1:1394,6\n584#1:1400\n584#1:1403,6\n584#1:1409\n669#1:1422,2\n669#1:1424,6\n669#1:1430\n669#1:1433,6\n669#1:1439\n669#1:1452,2\n669#1:1454,6\n669#1:1460\n669#1:1463,6\n669#1:1469\n709#1:1478,2\n709#1:1480,6\n709#1:1486\n711#1:1487,2\n711#1:1489,6\n711#1:1495\n758#1:1496,2\n758#1:1498,6\n758#1:1504\n762#1:1505,2\n762#1:1507,6\n762#1:1513\n884#1:1514,2\n884#1:1516,6\n884#1:1522\n937#1:1523,2\n937#1:1525,6\n937#1:1531\n943#1:1532\n944#1:1533\n945#1:1534\n*E\n"})
public final class ho4 {

    /* JADX INFO: renamed from: a */
    public static final float f44253a;

    /* JADX INFO: renamed from: b */
    public static final float f44254b;

    /* JADX INFO: renamed from: c */
    public static final float f44255c;

    /* JADX INFO: renamed from: ho4$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0}, m4012l = {960}, m4013m = "awaitDragOrCancellation-rnUCldI", m4014n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6924a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44256a;

        /* JADX INFO: renamed from: b */
        public Object f44257b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44258c;

        /* JADX INFO: renamed from: d */
        public int f44259d;

        public C6924a(zy2<? super C6924a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44258c = obj;
            this.f44259d |= Integer.MIN_VALUE;
            return ho4.m30056awaitDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: ho4$a0 */
    public static final class C6925a0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6925a0 f44260a = new C6925a0();

        public C6925a0() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0}, m4012l = {960}, m4013m = "awaitHorizontalDragOrCancellation-rnUCldI", m4014n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6926b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44261a;

        /* JADX INFO: renamed from: b */
        public Object f44262b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44263c;

        /* JADX INFO: renamed from: d */
        public int f44264d;

        public C6926b(zy2<? super C6926b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44263c = obj;
            this.f44264d |= Integer.MIN_VALUE;
            return ho4.m30058awaitHorizontalDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: ho4$b0 */
    public static final class C6927b0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6927b0 f44265a = new C6927b0();

        public C6927b0() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4012l = {965, 1007}, m4013m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", m4014n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    public static final class C6928c extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44266C;

        /* JADX INFO: renamed from: a */
        public Object f44267a;

        /* JADX INFO: renamed from: b */
        public Object f44268b;

        /* JADX INFO: renamed from: c */
        public Object f44269c;

        /* JADX INFO: renamed from: d */
        public Object f44270d;

        /* JADX INFO: renamed from: e */
        public Object f44271e;

        /* JADX INFO: renamed from: f */
        public float f44272f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44273m;

        public C6928c(zy2<? super C6928c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44273m = obj;
            this.f44266C |= Integer.MIN_VALUE;
            return ho4.m30059awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$c0 */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m4010f = "DragGestureDetector.kt", m4011i = {0, 1, 1}, m4012l = {472, Videoio.CAP_PROP_XI_IMAGE_IS_COLOR, Videoio.CAP_PROP_XI_CC_MATRIX_03}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m4015s = {"L$0", "L$0", "L$1"})
    public static final class C6929c0 extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f44274a;

        /* JADX INFO: renamed from: b */
        public int f44275b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44276c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<izb, bth> f44277d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<h2d, Float, bth> f44278e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ny6<bth> f44279f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ ny6<bth> f44280m;

        /* JADX INFO: renamed from: ho4$c0$a */
        public static final class a extends tt8 implements qy6<h2d, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gz6<h2d, Float, bth> f44281a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(gz6<? super h2d, ? super Float, bth> gz6Var) {
                super(1);
                this.f44281a = gz6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
                invoke2(h2dVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb h2d h2dVar) {
                this.f44281a.invoke(h2dVar, Float.valueOf(izb.m30430getYimpl(u1d.positionChange(h2dVar))));
                h2dVar.consume();
            }
        }

        /* JADX INFO: renamed from: ho4$c0$b */
        public static final class b extends tt8 implements gz6<h2d, Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f44282a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jvd.C8118e c8118e) {
                super(2);
                this.f44282a = c8118e;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, Float f) {
                invoke(h2dVar, f.floatValue());
                return bth.f14751a;
            }

            public final void invoke(@yfb h2d h2dVar, float f) {
                h2dVar.consume();
                this.f44282a.f52107a = f;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6929c0(qy6<? super izb, bth> qy6Var, gz6<? super h2d, ? super Float, bth> gz6Var, ny6<bth> ny6Var, ny6<bth> ny6Var2, zy2<? super C6929c0> zy2Var) {
            super(2, zy2Var);
            this.f44277d = qy6Var;
            this.f44278e = gz6Var;
            this.f44279f = ny6Var;
            this.f44280m = ny6Var2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6929c0 c6929c0 = new C6929c0(this.f44277d, this.f44278e, this.f44279f, this.f44280m, zy2Var);
            c6929c0.f44276c = obj;
            return c6929c0;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C6929c0) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r12.f44275b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                p000.y7e.throwOnFailure(r13)
                goto La7
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f44274a
                jvd$e r1 = (p000.jvd.C8118e) r1
                java.lang.Object r3 = r12.f44276c
                gn0 r3 = (p000.gn0) r3
                p000.y7e.throwOnFailure(r13)
                goto L72
            L2a:
                java.lang.Object r1 = r12.f44276c
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r13)
                goto L4d
            L32:
                p000.y7e.throwOnFailure(r13)
                java.lang.Object r13 = r12.f44276c
                gn0 r13 = (p000.gn0) r13
                r12.f44276c = r13
                r12.f44275b = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                r8 = r12
                java.lang.Object r1 = p000.dmg.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r11 = r1
                r1 = r13
                r13 = r11
            L4d:
                h2d r13 = (p000.h2d) r13
                jvd$e r10 = new jvd$e
                r10.<init>()
                long r5 = r13.m29909getIdJ3iCeTQ()
                int r7 = r13.m29914getTypeT8wyACA()
                ho4$c0$b r8 = new ho4$c0$b
                r8.<init>(r10)
                r12.f44276c = r1
                r12.f44274a = r10
                r12.f44275b = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = p000.ho4.m30065awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L70
                return r0
            L70:
                r3 = r1
                r1 = r10
            L72:
                h2d r13 = (p000.h2d) r13
                if (r13 == 0) goto Lba
                qy6<izb, bth> r4 = r12.f44277d
                long r5 = r13.m29911getPositionF1C5BW0()
                izb r5 = p000.izb.m30418boximpl(r5)
                r4.invoke(r5)
                gz6<h2d, java.lang.Float, bth> r4 = r12.f44278e
                float r1 = r1.f52107a
                java.lang.Float r1 = p000.wc1.boxFloat(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m29909getIdJ3iCeTQ()
                ho4$c0$a r13 = new ho4$c0$a
                gz6<h2d, java.lang.Float, bth> r1 = r12.f44278e
                r13.<init>(r1)
                r1 = 0
                r12.f44276c = r1
                r12.f44274a = r1
                r12.f44275b = r2
                java.lang.Object r13 = p000.ho4.m30073verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La7
                return r0
            La7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb5
                ny6<bth> r13 = r12.f44279f
                r13.invoke()
                goto Lba
            Lb5:
                ny6<bth> r13 = r12.f44280m
                r13.invoke()
            Lba:
                bth r13 = p000.bth.f14751a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ho4.C6929c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ho4$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4012l = {965, 1007}, m4013m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", m4014n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    public static final class C6930d extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44283C;

        /* JADX INFO: renamed from: a */
        public Object f44284a;

        /* JADX INFO: renamed from: b */
        public Object f44285b;

        /* JADX INFO: renamed from: c */
        public Object f44286c;

        /* JADX INFO: renamed from: d */
        public Object f44287d;

        /* JADX INFO: renamed from: e */
        public Object f44288e;

        /* JADX INFO: renamed from: f */
        public float f44289f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44290m;

        public C6930d(zy2<? super C6930d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44290m = obj;
            this.f44283C |= Integer.MIN_VALUE;
            return ho4.m30060awaitHorizontalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$d0 */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0}, m4012l = {108}, m4013m = "drag-jO51t88", m4014n = {"$this$drag_u2djO51t88", "onDrag"}, m4015s = {"L$0", "L$1"})
    public static final class C6931d0 extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44291a;

        /* JADX INFO: renamed from: b */
        public Object f44292b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44293c;

        /* JADX INFO: renamed from: d */
        public int f44294d;

        public C6931d0(zy2<? super C6931d0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44293c = obj;
            this.f44294d |= Integer.MIN_VALUE;
            return ho4.m30069dragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$e */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0}, m4012l = {891}, m4013m = "awaitLongPressOrCancellation-rnUCldI", m4014n = {"initialDown", "longPress"}, m4015s = {"L$0", "L$1"})
    public static final class C6932e extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44295a;

        /* JADX INFO: renamed from: b */
        public Object f44296b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44297c;

        /* JADX INFO: renamed from: d */
        public int f44298d;

        public C6932e(zy2<? super C6932e> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44297c = obj;
            this.f44298d |= Integer.MIN_VALUE;
            return ho4.m30061awaitLongPressOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: ho4$e0 */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 0}, m4012l = {960}, m4013m = "drag-VnAYq1g", m4014n = {"$this$drag_u2dVnAYq1g", "onDrag", "orientation", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @dwf({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,957:1\n*E\n"})
    public static final class C6933e0 extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44299C;

        /* JADX INFO: renamed from: a */
        public Object f44300a;

        /* JADX INFO: renamed from: b */
        public Object f44301b;

        /* JADX INFO: renamed from: c */
        public Object f44302c;

        /* JADX INFO: renamed from: d */
        public Object f44303d;

        /* JADX INFO: renamed from: e */
        public Object f44304e;

        /* JADX INFO: renamed from: f */
        public Object f44305f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44306m;

        public C6933e0(zy2<? super C6933e0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44306m = obj;
            this.f44299C |= Integer.MIN_VALUE;
            return ho4.m30067dragVnAYq1g(null, 0L, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$f */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 1, 1, 1}, m4012l = {894, 911}, m4013m = "invokeSuspend", m4014n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, m4015s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    @dwf({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,957:1\n86#2,2:958\n33#2,6:960\n88#2:966\n101#2,2:967\n33#2,6:969\n103#2:975\n101#2,2:976\n33#2,6:978\n103#2:984\n116#2,2:985\n33#2,6:987\n118#2:993\n116#2,2:994\n33#2,6:996\n118#2:1002\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n895#1:958,2\n895#1:960,6\n895#1:966\n901#1:967,2\n901#1:969,6\n901#1:975\n912#1:976,2\n912#1:978,6\n912#1:984\n916#1:985,2\n916#1:987,6\n916#1:993\n926#1:994,2\n926#1:996,6\n926#1:1002\n*E\n"})
    public static final class C6934f extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f44307a;

        /* JADX INFO: renamed from: b */
        public int f44308b;

        /* JADX INFO: renamed from: c */
        public int f44309c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f44310d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jvd.C8121h<h2d> f44311e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ jvd.C8121h<h2d> f44312f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6934f(jvd.C8121h<h2d> c8121h, jvd.C8121h<h2d> c8121h2, zy2<? super C6934f> zy2Var) {
            super(2, zy2Var);
            this.f44311e = c8121h;
            this.f44312f = c8121h2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6934f c6934f = new C6934f(this.f44311e, this.f44312f, zy2Var);
            c6934f.f44310d = obj;
            return c6934f;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C6934f) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[EDGE_INSN: B:65:0x00cd->B:41:0x00cd BREAK  A[LOOP:0: B:36:0x00ba->B:40:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, h2d] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ho4.C6934f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ho4$f0 */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0}, m4012l = {966}, m4013m = "horizontalDrag-jO51t88", m4014n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C6935f0 extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44313a;

        /* JADX INFO: renamed from: b */
        public Object f44314b;

        /* JADX INFO: renamed from: c */
        public Object f44315c;

        /* JADX INFO: renamed from: d */
        public Object f44316d;

        /* JADX INFO: renamed from: e */
        public Object f44317e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f44318f;

        /* JADX INFO: renamed from: m */
        public int f44319m;

        public C6935f0(zy2<? super C6935f0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44318f = obj;
            this.f44319m |= Integer.MIN_VALUE;
            return ho4.m30070horizontalDragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$g */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4012l = {965, 1007}, m4013m = "awaitTouchSlopOrCancellation-jO51t88", m4014n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    public static final class C6936g extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44320C;

        /* JADX INFO: renamed from: a */
        public Object f44321a;

        /* JADX INFO: renamed from: b */
        public Object f44322b;

        /* JADX INFO: renamed from: c */
        public Object f44323c;

        /* JADX INFO: renamed from: d */
        public Object f44324d;

        /* JADX INFO: renamed from: e */
        public Object f44325e;

        /* JADX INFO: renamed from: f */
        public float f44326f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44327m;

        public C6936g(zy2<? super C6936g> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44327m = obj;
            this.f44320C |= Integer.MIN_VALUE;
            return ho4.m30063awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$g0 */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0}, m4012l = {966}, m4013m = "verticalDrag-jO51t88", m4014n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C6937g0 extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44328a;

        /* JADX INFO: renamed from: b */
        public Object f44329b;

        /* JADX INFO: renamed from: c */
        public Object f44330c;

        /* JADX INFO: renamed from: d */
        public Object f44331d;

        /* JADX INFO: renamed from: e */
        public Object f44332e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f44333f;

        /* JADX INFO: renamed from: m */
        public int f44334m;

        public C6937g0(zy2<? super C6937g0> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44333f = obj;
            this.f44334m |= Integer.MIN_VALUE;
            return ho4.m30073verticalDragjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$h */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0}, m4012l = {960}, m4013m = "awaitVerticalDragOrCancellation-rnUCldI", m4014n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C6938h extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f44335a;

        /* JADX INFO: renamed from: b */
        public Object f44336b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44337c;

        /* JADX INFO: renamed from: d */
        public int f44338d;

        public C6938h(zy2<? super C6938h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44337c = obj;
            this.f44338d |= Integer.MIN_VALUE;
            return ho4.m30064awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: ho4$i */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4012l = {965, 1007}, m4013m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", m4014n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    public static final class C6939i extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44339C;

        /* JADX INFO: renamed from: a */
        public Object f44340a;

        /* JADX INFO: renamed from: b */
        public Object f44341b;

        /* JADX INFO: renamed from: c */
        public Object f44342c;

        /* JADX INFO: renamed from: d */
        public Object f44343d;

        /* JADX INFO: renamed from: e */
        public Object f44344e;

        /* JADX INFO: renamed from: f */
        public float f44345f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44346m;

        public C6939i(zy2<? super C6939i> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44346m = obj;
            this.f44339C |= Integer.MIN_VALUE;
            return ho4.m30065awaitVerticalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$j */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4010f = "DragGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m4012l = {965, 1007}, m4013m = "awaitVerticalTouchSlopOrCancellation-jO51t88", m4014n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
    public static final class C6940j extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f44347C;

        /* JADX INFO: renamed from: a */
        public Object f44348a;

        /* JADX INFO: renamed from: b */
        public Object f44349b;

        /* JADX INFO: renamed from: c */
        public Object f44350c;

        /* JADX INFO: renamed from: d */
        public Object f44351d;

        /* JADX INFO: renamed from: e */
        public Object f44352e;

        /* JADX INFO: renamed from: f */
        public float f44353f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f44354m;

        public C6940j(zy2<? super C6940j> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f44354m = obj;
            this.f44347C |= Integer.MIN_VALUE;
            return ho4.m30066awaitVerticalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: ho4$k */
    public static final class C6941k extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6941k f44355a = new C6941k();

        public C6941k() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m30074invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m30074invokek4lQ0M(long j) {
        }
    }

    /* JADX INFO: renamed from: ho4$l */
    public static final class C6942l extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6942l f44356a = new C6942l();

        public C6942l() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$m */
    public static final class C6943m extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6943m f44357a = new C6943m();

        public C6943m() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$n */
    public static final class C6944n extends tt8 implements gz6<h2d, izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<izb, bth> f44358a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6944n(qy6<? super izb, bth> qy6Var) {
            super(2);
            this.f44358a = qy6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
            m30075invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m30075invokeUv8p0NA(@yfb h2d h2dVar, long j) {
            this.f44358a.invoke(izb.m30418boximpl(h2dVar.m29911getPositionF1C5BW0()));
        }
    }

    /* JADX INFO: renamed from: ho4$o */
    public static final class C6945o extends tt8 implements qy6<h2d, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f44359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6945o(ny6<bth> ny6Var) {
            super(1);
            this.f44359a = ny6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
            invoke2(h2dVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb h2d h2dVar) {
            this.f44359a.invoke();
        }
    }

    /* JADX INFO: renamed from: ho4$p */
    public static final class C6946p extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C6946p f44360a = new C6946p();

        public C6946p() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: ho4$q */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", m4010f = "DragGestureDetector.kt", m4011i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, m4012l = {238, 244, 965, 1007, 1018}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m4015s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
    @dwf({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,957:1\n750#2,9:958\n759#2,4:976\n763#2,23:987\n664#2,6:1010\n706#2,4:1016\n710#2,2:1029\n712#2,7:1038\n670#2,7:1045\n719#2:1052\n677#2,12:1053\n116#3,2:967\n33#3,6:969\n118#3:975\n33#3,6:980\n118#3:986\n116#3,2:1020\n33#3,6:1022\n118#3:1028\n33#3,6:1031\n118#3:1037\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n*L\n251#1:958,9\n251#1:976,4\n251#1:987,23\n268#1:1010,6\n268#1:1016,4\n268#1:1029,2\n268#1:1038,7\n268#1:1045,7\n268#1:1052\n268#1:1053,12\n251#1:967,2\n251#1:969,6\n251#1:975\n251#1:980,6\n251#1:986\n268#1:1020,2\n268#1:1022,6\n268#1:1028\n268#1:1031,6\n268#1:1037\n*E\n"})
    public static final class C6947q extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public float f44361C;

        /* JADX INFO: renamed from: F */
        public int f44362F;

        /* JADX INFO: renamed from: H */
        public /* synthetic */ Object f44363H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ ny6<Boolean> f44364L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ t7c f44365M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ gz6<h2d, izb, bth> f44366N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ gz6<h2d, izb, bth> f44367Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ ny6<bth> f44368X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ qy6<h2d, bth> f44369Y;

        /* JADX INFO: renamed from: a */
        public Object f44370a;

        /* JADX INFO: renamed from: b */
        public Object f44371b;

        /* JADX INFO: renamed from: c */
        public Object f44372c;

        /* JADX INFO: renamed from: d */
        public Object f44373d;

        /* JADX INFO: renamed from: e */
        public Object f44374e;

        /* JADX INFO: renamed from: f */
        public Object f44375f;

        /* JADX INFO: renamed from: m */
        public boolean f44376m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6947q(ny6<Boolean> ny6Var, t7c t7cVar, gz6<? super h2d, ? super izb, bth> gz6Var, gz6<? super h2d, ? super izb, bth> gz6Var2, ny6<bth> ny6Var2, qy6<? super h2d, bth> qy6Var, zy2<? super C6947q> zy2Var) {
            super(2, zy2Var);
            this.f44364L = ny6Var;
            this.f44365M = t7cVar;
            this.f44366N = gz6Var;
            this.f44367Q = gz6Var2;
            this.f44368X = ny6Var2;
            this.f44369Y = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6947q c6947q = new C6947q(this.f44364L, this.f44365M, this.f44366N, this.f44367Q, this.f44368X, this.f44369Y, zy2Var);
            c6947q.f44363H = obj;
            return c6947q;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C6947q) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0305, code lost:
        
            if (((r2 != null ? r2 == p000.t7c.Vertical ? p000.izb.m30430getYimpl(r5) : p000.izb.m30429getXimpl(r5) : p000.izb.m30427getDistanceimpl(r5)) == 0.0f) == false) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
        
            if (r17 == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0259, code lost:
        
            if (p000.ho4.m30071isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L88;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:105:0x02b9, B:117:0x02e5], limit reached: 145 */
        /* JADX WARN: Path cross not found for [B:45:0x018b, B:47:0x0191], limit reached: 145 */
        /* JADX WARN: Path cross not found for [B:50:0x0198, B:45:0x018b], limit reached: 145 */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0319  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x034b  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02ac A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0181 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0154 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0282 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0290  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0121 -> B:78:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0207 -> B:75:0x020f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0280 -> B:93:0x0283). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 847
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ho4.C6947q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ho4$r */
    public static final class C6948r extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6948r f44377a = new C6948r();

        public C6948r() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m30076invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m30076invokek4lQ0M(long j) {
        }
    }

    /* JADX INFO: renamed from: ho4$s */
    public static final class C6949s extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6949s f44378a = new C6949s();

        public C6949s() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$t */
    public static final class C6950t extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6950t f44379a = new C6950t();

        public C6950t() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$u */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m4010f = "DragGestureDetector.kt", m4011i = {0, 1, 2}, m4012l = {ymh.InterfaceC15722a.f102113q, 317, 322}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, m4015s = {"L$0", "L$0", "L$0"})
    @dwf({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,957:1\n33#2,6:958\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n328#1:958,6\n*E\n"})
    public static final class C6951u extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f44380a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f44381b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<izb, bth> f44382c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ny6<bth> f44383d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ny6<bth> f44384e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<h2d, izb, bth> f44385f;

        /* JADX INFO: renamed from: ho4$u$a */
        public static final class a extends tt8 implements qy6<h2d, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gz6<h2d, izb, bth> f44386a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(gz6<? super h2d, ? super izb, bth> gz6Var) {
                super(1);
                this.f44386a = gz6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
                invoke2(h2dVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb h2d h2dVar) {
                this.f44386a.invoke(h2dVar, izb.m30418boximpl(u1d.positionChange(h2dVar)));
                h2dVar.consume();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6951u(qy6<? super izb, bth> qy6Var, ny6<bth> ny6Var, ny6<bth> ny6Var2, gz6<? super h2d, ? super izb, bth> gz6Var, zy2<? super C6951u> zy2Var) {
            super(2, zy2Var);
            this.f44382c = qy6Var;
            this.f44383d = ny6Var;
            this.f44384e = ny6Var2;
            this.f44385f = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6951u c6951u = new C6951u(this.f44382c, this.f44383d, this.f44384e, this.f44385f, zy2Var);
            c6951u.f44381b = obj;
            return c6951u;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C6951u) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x003c), top: B:47:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x003c), top: B:47:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x003c), top: B:47:0x0009 }] */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r11.f44380a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r11.f44381b
                gn0 r0 = (p000.gn0) r0
                p000.y7e.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L86
            L19:
                r12 = move-exception
                goto Lbd
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                java.lang.Object r1 = r11.f44381b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L5e
            L2c:
                java.lang.Object r1 = r11.f44381b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L4d
            L34:
                p000.y7e.throwOnFailure(r12)
                java.lang.Object r12 = r11.f44381b
                r1 = r12
                gn0 r1 = (p000.gn0) r1
                r11.f44381b = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.f44380a = r4     // Catch: java.util.concurrent.CancellationException -> L19
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = p000.dmg.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L4d
                return r0
            L4d:
                h2d r12 = (p000.h2d) r12     // Catch: java.util.concurrent.CancellationException -> L19
                long r4 = r12.m29909getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L19
                r11.f44381b = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.f44380a = r3     // Catch: java.util.concurrent.CancellationException -> L19
                java.lang.Object r12 = p000.ho4.m30061awaitLongPressOrCancellationrnUCldI(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L5e
                return r0
            L5e:
                h2d r12 = (p000.h2d) r12     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 == 0) goto Lba
                qy6<izb, bth> r3 = r11.f44382c     // Catch: java.util.concurrent.CancellationException -> L19
                long r4 = r12.m29911getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L19
                izb r4 = p000.izb.m30418boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L19
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L19
                long r3 = r12.m29909getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L19
                ho4$u$a r12 = new ho4$u$a     // Catch: java.util.concurrent.CancellationException -> L19
                gz6<h2d, izb, bth> r5 = r11.f44385f     // Catch: java.util.concurrent.CancellationException -> L19
                r12.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L19
                r11.f44381b = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.f44380a = r2     // Catch: java.util.concurrent.CancellationException -> L19
                java.lang.Object r12 = p000.ho4.m30069dragjO51t88(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L85
                return r0
            L85:
                r0 = r1
            L86:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L19
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 == 0) goto Lb5
                t1d r12 = r0.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L19
                java.util.List r12 = r12.getChanges()     // Catch: java.util.concurrent.CancellationException -> L19
                int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L19
                r1 = 0
            L9b:
                if (r1 >= r0) goto Laf
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L19
                h2d r2 = (p000.h2d) r2     // Catch: java.util.concurrent.CancellationException -> L19
                boolean r3 = p000.u1d.changedToUp(r2)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r3 == 0) goto Lac
                r2.consume()     // Catch: java.util.concurrent.CancellationException -> L19
            Lac:
                int r1 = r1 + 1
                goto L9b
            Laf:
                ny6<bth> r12 = r11.f44383d     // Catch: java.util.concurrent.CancellationException -> L19
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
                goto Lba
            Lb5:
                ny6<bth> r12 = r11.f44384e     // Catch: java.util.concurrent.CancellationException -> L19
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
            Lba:
                bth r12 = p000.bth.f14751a
                return r12
            Lbd:
                ny6<bth> r0 = r11.f44384e
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ho4.C6951u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ho4$v */
    public static final class C6952v extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6952v f44387a = new C6952v();

        public C6952v() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m30077invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m30077invokek4lQ0M(long j) {
        }
    }

    /* JADX INFO: renamed from: ho4$w */
    public static final class C6953w extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6953w f44388a = new C6953w();

        public C6953w() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$x */
    public static final class C6954x extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public static final C6954x f44389a = new C6954x();

        public C6954x() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: ho4$y */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m4010f = "DragGestureDetector.kt", m4011i = {0, 1, 1}, m4012l = {620, 622, 633}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m4015s = {"L$0", "L$0", "L$1"})
    public static final class C6955y extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f44390a;

        /* JADX INFO: renamed from: b */
        public int f44391b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f44392c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<izb, bth> f44393d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<h2d, Float, bth> f44394e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ny6<bth> f44395f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ ny6<bth> f44396m;

        /* JADX INFO: renamed from: ho4$y$a */
        public static final class a extends tt8 implements qy6<h2d, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gz6<h2d, Float, bth> f44397a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(gz6<? super h2d, ? super Float, bth> gz6Var) {
                super(1);
                this.f44397a = gz6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar) {
                invoke2(h2dVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb h2d h2dVar) {
                this.f44397a.invoke(h2dVar, Float.valueOf(izb.m30429getXimpl(u1d.positionChange(h2dVar))));
                h2dVar.consume();
            }
        }

        /* JADX INFO: renamed from: ho4$y$b */
        public static final class b extends tt8 implements gz6<h2d, Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f44398a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jvd.C8118e c8118e) {
                super(2);
                this.f44398a = c8118e;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, Float f) {
                invoke(h2dVar, f.floatValue());
                return bth.f14751a;
            }

            public final void invoke(@yfb h2d h2dVar, float f) {
                h2dVar.consume();
                this.f44398a.f52107a = f;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6955y(qy6<? super izb, bth> qy6Var, gz6<? super h2d, ? super Float, bth> gz6Var, ny6<bth> ny6Var, ny6<bth> ny6Var2, zy2<? super C6955y> zy2Var) {
            super(2, zy2Var);
            this.f44393d = qy6Var;
            this.f44394e = gz6Var;
            this.f44395f = ny6Var;
            this.f44396m = ny6Var2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C6955y c6955y = new C6955y(this.f44393d, this.f44394e, this.f44395f, this.f44396m, zy2Var);
            c6955y.f44392c = obj;
            return c6955y;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C6955y) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r12.f44391b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                p000.y7e.throwOnFailure(r13)
                goto La7
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f44390a
                jvd$e r1 = (p000.jvd.C8118e) r1
                java.lang.Object r3 = r12.f44392c
                gn0 r3 = (p000.gn0) r3
                p000.y7e.throwOnFailure(r13)
                goto L72
            L2a:
                java.lang.Object r1 = r12.f44392c
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r13)
                goto L4d
            L32:
                p000.y7e.throwOnFailure(r13)
                java.lang.Object r13 = r12.f44392c
                gn0 r13 = (p000.gn0) r13
                r12.f44392c = r13
                r12.f44391b = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r13
                r8 = r12
                java.lang.Object r1 = p000.dmg.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r11 = r1
                r1 = r13
                r13 = r11
            L4d:
                h2d r13 = (p000.h2d) r13
                jvd$e r10 = new jvd$e
                r10.<init>()
                long r5 = r13.m29909getIdJ3iCeTQ()
                int r7 = r13.m29914getTypeT8wyACA()
                ho4$y$b r8 = new ho4$y$b
                r8.<init>(r10)
                r12.f44392c = r1
                r12.f44390a = r10
                r12.f44391b = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = p000.ho4.m30059awaitHorizontalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L70
                return r0
            L70:
                r3 = r1
                r1 = r10
            L72:
                h2d r13 = (p000.h2d) r13
                if (r13 == 0) goto Lba
                qy6<izb, bth> r4 = r12.f44393d
                long r5 = r13.m29911getPositionF1C5BW0()
                izb r5 = p000.izb.m30418boximpl(r5)
                r4.invoke(r5)
                gz6<h2d, java.lang.Float, bth> r4 = r12.f44394e
                float r1 = r1.f52107a
                java.lang.Float r1 = p000.wc1.boxFloat(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m29909getIdJ3iCeTQ()
                ho4$y$a r13 = new ho4$y$a
                gz6<h2d, java.lang.Float, bth> r1 = r12.f44394e
                r13.<init>(r1)
                r1 = 0
                r12.f44392c = r1
                r12.f44390a = r1
                r12.f44391b = r2
                java.lang.Object r13 = p000.ho4.m30070horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La7
                return r0
            La7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb5
                ny6<bth> r13 = r12.f44395f
                r13.invoke()
                goto Lba
            Lb5:
                ny6<bth> r13 = r12.f44396m
                r13.invoke()
            Lba:
                bth r13 = p000.bth.f14751a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ho4.C6955y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ho4$z */
    public static final class C6956z extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6956z f44399a = new C6956z();

        public C6956z() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m30078invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m30078invokek4lQ0M(long j) {
        }
    }

    static {
        float fM30705constructorimpl = kn4.m30705constructorimpl((float) 0.125d);
        f44253a = fM30705constructorimpl;
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(18);
        f44254b = fM30705constructorimpl2;
        f44255c = fM30705constructorimpl / fM30705constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (p000.u1d.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30056awaitDragOrCancellationrnUCldI(@p000.yfb p000.gn0 r17, long r18, @p000.yfb p000.zy2<? super p000.h2d> r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30056awaitDragOrCancellationrnUCldI(gn0, long, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m30057awaitDragOrUpjO51t88(gn0 gn0Var, long j, qy6<? super h2d, Boolean> qy6Var, zy2<? super h2d> zy2Var) {
        h2d h2dVar;
        jvd.C8120g c8120g = new jvd.C8120g();
        c8120g.f52109a = j;
        while (true) {
            int i = 0;
            o28.mark(0);
            h2d h2dVar2 = null;
            Object objAwaitPointerEvent$default = gn0.awaitPointerEvent$default(gn0Var, null, zy2Var, 1, null);
            o28.mark(1);
            t1d t1dVar = (t1d) objAwaitPointerEvent$default;
            List<h2d> changes = t1dVar.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    h2dVar = null;
                    break;
                }
                h2dVar = changes.get(i2);
                if (Boolean.valueOf(f2d.m28883equalsimpl0(h2dVar.m29909getIdJ3iCeTQ(), c8120g.f52109a)).booleanValue()) {
                    break;
                }
                i2++;
            }
            h2d h2dVar3 = h2dVar;
            if (h2dVar3 == null) {
                return null;
            }
            if (u1d.changedToUpIgnoreConsumed(h2dVar3)) {
                List<h2d> changes2 = t1dVar.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    h2d h2dVar4 = changes2.get(i);
                    if (Boolean.valueOf(h2dVar4.getPressed()).booleanValue()) {
                        h2dVar2 = h2dVar4;
                        break;
                    }
                    i++;
                }
                h2d h2dVar5 = h2dVar2;
                if (h2dVar5 == null) {
                    return h2dVar3;
                }
                c8120g.f52109a = h2dVar5.m29909getIdJ3iCeTQ();
            } else if (qy6Var.invoke(h2dVar3).booleanValue()) {
                return h2dVar3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((p000.izb.m30429getXimpl(p000.u1d.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30058awaitHorizontalDragOrCancellationrnUCldI(@p000.yfb p000.gn0 r17, long r18, @p000.yfb p000.zy2<? super p000.h2d> r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30058awaitHorizontalDragOrCancellationrnUCldI(gn0, long, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0165 -> B:62:0x016b). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30059awaitHorizontalPointerSlopOrCancellationgDDlDlE(@p000.yfb p000.gn0 r19, long r20, int r22, @p000.yfb p000.gz6<? super p000.h2d, ? super java.lang.Float, p000.bth> r23, @p000.yfb p000.zy2<? super p000.h2d> r24) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30059awaitHorizontalPointerSlopOrCancellationgDDlDlE(gn0, long, int, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0169 -> B:62:0x016f). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30060awaitHorizontalTouchSlopOrCancellationjO51t88(@p000.yfb p000.gn0 r18, long r19, @p000.yfb p000.gz6<? super p000.h2d, ? super java.lang.Float, p000.bth> r21, @p000.yfb p000.zy2<? super p000.h2d> r22) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30060awaitHorizontalTouchSlopOrCancellationjO51t88(gn0, long, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, h2d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @p000.gib
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30061awaitLongPressOrCancellationrnUCldI(@p000.yfb p000.gn0 r9, long r10, @p000.yfb p000.zy2<? super p000.h2d> r12) {
        /*
            boolean r0 = r12 instanceof p000.ho4.C6932e
            if (r0 == 0) goto L13
            r0 = r12
            ho4$e r0 = (p000.ho4.C6932e) r0
            int r1 = r0.f44298d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44298d = r1
            goto L18
        L13:
            ho4$e r0 = new ho4$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f44297c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f44298d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f44296b
            jvd$h r9 = (p000.jvd.C8121h) r9
            java.lang.Object r10 = r0.f44295a
            h2d r10 = (p000.h2d) r10
            p000.y7e.throwOnFailure(r12)     // Catch: p000.w1d -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            p000.y7e.throwOnFailure(r12)
            t1d r12 = r9.getCurrentEvent()
            boolean r12 = m30071isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            t1d r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            h2d r7 = (p000.h2d) r7
            long r7 = r7.m29909getIdJ3iCeTQ()
            boolean r7 = p000.f2d.m28883equalsimpl0(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            h2d r10 = (p000.h2d) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            jvd$h r11 = new jvd$h
            r11.<init>()
            jvd$h r12 = new jvd$h
            r12.<init>()
            r12.f52110a = r10
            u8i r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            ho4$f r2 = new ho4$f     // Catch: p000.w1d -> L9a
            r2.<init>(r12, r11, r4)     // Catch: p000.w1d -> L9a
            r0.f44295a = r10     // Catch: p000.w1d -> L9a
            r0.f44296b = r11     // Catch: p000.w1d -> L9a
            r0.f44298d = r3     // Catch: p000.w1d -> L9a
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch: p000.w1d -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.f52110a
            h2d r9 = (p000.h2d) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30061awaitLongPressOrCancellationrnUCldI(gn0, long, zy2):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m30062awaitPointerSlopOrCancellationpn7EDYM(gn0 gn0Var, long j, int i, t7c t7cVar, gz6<? super h2d, ? super izb, bth> gz6Var, zy2<? super h2d> zy2Var) {
        h2d h2dVar;
        zy2<? super h2d> zy2Var2;
        h2d h2dVar2;
        zy2<? super h2d> zy2Var3 = zy2Var;
        if (m30071isPointerUpDmW0f2w(gn0Var.getCurrentEvent(), j)) {
            return null;
        }
        float fM30072pointerSlopE8SPZFQ = m30072pointerSlopE8SPZFQ(gn0Var.getViewConfiguration(), i);
        jvd.C8120g c8120g = new jvd.C8120g();
        c8120g.f52109a = j;
        m5h m5hVar = new m5h(t7cVar);
        while (true) {
            o28.mark(0);
            Object objAwaitPointerEvent$default = gn0.awaitPointerEvent$default(gn0Var, null, zy2Var3, 1, null);
            o28.mark(1);
            t1d t1dVar = (t1d) objAwaitPointerEvent$default;
            List<h2d> changes = t1dVar.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    h2dVar = null;
                    break;
                }
                h2dVar = changes.get(i2);
                if (Boolean.valueOf(f2d.m28883equalsimpl0(h2dVar.m29909getIdJ3iCeTQ(), c8120g.f52109a)).booleanValue()) {
                    break;
                }
                i2++;
            }
            h2d h2dVar3 = h2dVar;
            if (h2dVar3 == null || h2dVar3.isConsumed()) {
                return null;
            }
            if (u1d.changedToUpIgnoreConsumed(h2dVar3)) {
                List<h2d> changes2 = t1dVar.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        h2dVar2 = null;
                        break;
                    }
                    h2dVar2 = changes2.get(i3);
                    if (Boolean.valueOf(h2dVar2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                h2d h2dVar4 = h2dVar2;
                if (h2dVar4 == null) {
                    return null;
                }
                c8120g.f52109a = h2dVar4.m29909getIdJ3iCeTQ();
            } else {
                izb izbVarM30963addPointerInputChangeGcwITfU = m5hVar.m30963addPointerInputChangeGcwITfU(h2dVar3, fM30072pointerSlopE8SPZFQ);
                if (izbVarM30963addPointerInputChangeGcwITfU != null) {
                    gz6Var.invoke(h2dVar3, izbVarM30963addPointerInputChangeGcwITfU);
                    if (h2dVar3.isConsumed()) {
                        return h2dVar3;
                    }
                    m5hVar.reset();
                } else {
                    v1d v1dVar = v1d.Final;
                    o28.mark(0);
                    zy2Var2 = zy2Var;
                    gn0Var.awaitPointerEvent(v1dVar, zy2Var2);
                    o28.mark(1);
                    if (h2dVar3.isConsumed()) {
                        return null;
                    }
                    zy2Var3 = zy2Var2;
                }
            }
            zy2Var2 = zy2Var;
            zy2Var3 = zy2Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015c -> B:62:0x0162). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30063awaitTouchSlopOrCancellationjO51t88(@p000.yfb p000.gn0 r18, long r19, @p000.yfb p000.gz6<? super p000.h2d, ? super p000.izb, p000.bth> r21, @p000.yfb p000.zy2<? super p000.h2d> r22) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30063awaitTouchSlopOrCancellationjO51t88(gn0, long, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((p000.izb.m30430getYimpl(p000.u1d.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30064awaitVerticalDragOrCancellationrnUCldI(@p000.yfb p000.gn0 r17, long r18, @p000.yfb p000.zy2<? super p000.h2d> r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30064awaitVerticalDragOrCancellationrnUCldI(gn0, long, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0165 -> B:62:0x016b). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30065awaitVerticalPointerSlopOrCancellationgDDlDlE(@p000.yfb p000.gn0 r19, long r20, int r22, @p000.yfb p000.gz6<? super p000.h2d, ? super java.lang.Float, p000.bth> r23, @p000.yfb p000.zy2<? super p000.h2d> r24) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30065awaitVerticalPointerSlopOrCancellationgDDlDlE(gn0, long, int, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0169 -> B:62:0x016f). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30066awaitVerticalTouchSlopOrCancellationjO51t88(@p000.yfb p000.gn0 r18, long r19, @p000.yfb p000.gz6<? super p000.h2d, ? super java.lang.Float, p000.bth> r21, @p000.yfb p000.zy2<? super p000.h2d> r22) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30066awaitVerticalTouchSlopOrCancellationjO51t88(gn0, long, gz6, zy2):java.lang.Object");
    }

    @gib
    public static final Object detectDragGestures(@yfb s2d s2dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2, @yfb gz6<? super h2d, ? super izb, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objDetectDragGestures = detectDragGestures(s2dVar, new C6944n(qy6Var), new C6945o(ny6Var), ny6Var2, C6946p.f44360a, null, gz6Var, zy2Var);
        return objDetectDragGestures == pd8.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : bth.f14751a;
    }

    public static /* synthetic */ Object detectDragGestures$default(s2d s2dVar, qy6 qy6Var, ny6 ny6Var, ny6 ny6Var2, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = C6941k.f44355a;
        }
        qy6 qy6Var2 = qy6Var;
        if ((i & 2) != 0) {
            ny6Var = C6942l.f44356a;
        }
        ny6 ny6Var3 = ny6Var;
        if ((i & 4) != 0) {
            ny6Var2 = C6943m.f44357a;
        }
        return detectDragGestures(s2dVar, qy6Var2, ny6Var3, ny6Var2, gz6Var, zy2Var);
    }

    @gib
    public static final Object detectDragGesturesAfterLongPress(@yfb s2d s2dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2, @yfb gz6<? super h2d, ? super izb, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C6951u(qy6Var, ny6Var, ny6Var2, gz6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(s2d s2dVar, qy6 qy6Var, ny6 ny6Var, ny6 ny6Var2, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = C6948r.f44377a;
        }
        qy6 qy6Var2 = qy6Var;
        if ((i & 2) != 0) {
            ny6Var = C6949s.f44378a;
        }
        ny6 ny6Var3 = ny6Var;
        if ((i & 4) != 0) {
            ny6Var2 = C6950t.f44379a;
        }
        return detectDragGesturesAfterLongPress(s2dVar, qy6Var2, ny6Var3, ny6Var2, gz6Var, zy2Var);
    }

    @gib
    public static final Object detectHorizontalDragGestures(@yfb s2d s2dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2, @yfb gz6<? super h2d, ? super Float, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C6955y(qy6Var, gz6Var, ny6Var, ny6Var2, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(s2d s2dVar, qy6 qy6Var, ny6 ny6Var, ny6 ny6Var2, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = C6952v.f44387a;
        }
        qy6 qy6Var2 = qy6Var;
        if ((i & 2) != 0) {
            ny6Var = C6953w.f44388a;
        }
        ny6 ny6Var3 = ny6Var;
        if ((i & 4) != 0) {
            ny6Var2 = C6954x.f44389a;
        }
        return detectHorizontalDragGestures(s2dVar, qy6Var2, ny6Var3, ny6Var2, gz6Var, zy2Var);
    }

    @gib
    public static final Object detectVerticalDragGestures(@yfb s2d s2dVar, @yfb qy6<? super izb, bth> qy6Var, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2, @yfb gz6<? super h2d, ? super Float, bth> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C6929c0(qy6Var, gz6Var, ny6Var, ny6Var2, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(s2d s2dVar, qy6 qy6Var, ny6 ny6Var, ny6 ny6Var2, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qy6Var = C6956z.f44399a;
        }
        qy6 qy6Var2 = qy6Var;
        if ((i & 2) != 0) {
            ny6Var = C6925a0.f44260a;
        }
        ny6 ny6Var3 = ny6Var;
        if ((i & 4) != 0) {
            ny6Var2 = C6927b0.f44265a;
        }
        return detectVerticalDragGestures(s2dVar, qy6Var2, ny6Var3, ny6Var2, gz6Var, zy2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        if (((r3 != null ? r3 == p000.t7c.Vertical ? p000.izb.m30430getYimpl(r4) : p000.izb.m30429getXimpl(r4) : p000.izb.m30427getDistanceimpl(r4)) == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c9, B:47:0x00f3], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30067dragVnAYq1g(@p000.yfb p000.gn0 r19, long r20, @p000.yfb p000.qy6<? super p000.h2d, p000.bth> r22, @p000.gib p000.t7c r23, @p000.yfb p000.qy6<? super p000.h2d, java.lang.Boolean> r24, @p000.yfb p000.zy2<? super p000.h2d> r25) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30067dragVnAYq1g(gn0, long, qy6, t7c, qy6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m30068dragVnAYq1g$$forInline(gn0 gn0Var, long j, qy6<? super h2d, bth> qy6Var, t7c t7cVar, qy6<? super h2d, Boolean> qy6Var2, zy2<? super h2d> zy2Var) {
        h2d h2dVar;
        h2d h2dVar2;
        h2d h2dVar3;
        long jM29909getIdJ3iCeTQ = j;
        if (m30071isPointerUpDmW0f2w(gn0Var.getCurrentEvent(), jM29909getIdJ3iCeTQ)) {
            return null;
        }
        while (true) {
            jvd.C8120g c8120g = new jvd.C8120g();
            c8120g.f52109a = jM29909getIdJ3iCeTQ;
            while (true) {
                o28.mark(0);
                Object objAwaitPointerEvent$default = gn0.awaitPointerEvent$default(gn0Var, null, zy2Var, 1, null);
                o28.mark(1);
                t1d t1dVar = (t1d) objAwaitPointerEvent$default;
                List<h2d> changes = t1dVar.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        h2dVar = null;
                        break;
                    }
                    h2dVar = changes.get(i);
                    if (Boolean.valueOf(f2d.m28883equalsimpl0(h2dVar.m29909getIdJ3iCeTQ(), c8120g.f52109a)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                h2dVar2 = h2dVar;
                if (h2dVar2 == null) {
                    h2dVar2 = null;
                    break;
                }
                if (u1d.changedToUpIgnoreConsumed(h2dVar2)) {
                    List<h2d> changes2 = t1dVar.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            h2dVar3 = null;
                            break;
                        }
                        h2dVar3 = changes2.get(i);
                        if (Boolean.valueOf(h2dVar3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    h2d h2dVar4 = h2dVar3;
                    if (h2dVar4 == null) {
                        break;
                    }
                    c8120g.f52109a = h2dVar4.m29909getIdJ3iCeTQ();
                } else {
                    long jPositionChangeIgnoreConsumed = u1d.positionChangeIgnoreConsumed(h2dVar2);
                    if (Boolean.valueOf(((t7cVar == null ? izb.m30427getDistanceimpl(jPositionChangeIgnoreConsumed) : t7cVar == t7c.Vertical ? izb.m30430getYimpl(jPositionChangeIgnoreConsumed) : izb.m30429getXimpl(jPositionChangeIgnoreConsumed)) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (h2dVar2 == null || qy6Var2.invoke(h2dVar2).booleanValue()) {
                return null;
            }
            if (u1d.changedToUpIgnoreConsumed(h2dVar2)) {
                return h2dVar2;
            }
            qy6Var.invoke(h2dVar2);
            jM29909getIdJ3iCeTQ = h2dVar2.m29909getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30069dragjO51t88(@p000.yfb p000.gn0 r4, long r5, @p000.yfb p000.qy6<? super p000.h2d, p000.bth> r7, @p000.yfb p000.zy2<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof p000.ho4.C6931d0
            if (r0 == 0) goto L13
            r0 = r8
            ho4$d0 r0 = (p000.ho4.C6931d0) r0
            int r1 = r0.f44294d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44294d = r1
            goto L18
        L13:
            ho4$d0 r0 = new ho4$d0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f44293c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f44294d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f44292b
            qy6 r4 = (p000.qy6) r4
            java.lang.Object r5 = r0.f44291a
            gn0 r5 = (p000.gn0) r5
            p000.y7e.throwOnFailure(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p000.y7e.throwOnFailure(r8)
        L3e:
            r0.f44291a = r4
            r0.f44292b = r7
            r0.f44294d = r3
            java.lang.Object r8 = m30056awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            h2d r8 = (p000.h2d) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = p000.wc1.boxBoolean(r4)
            return r4
        L55:
            boolean r5 = p000.u1d.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = p000.wc1.boxBoolean(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m29909getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30069dragjO51t88(gn0, long, qy6, zy2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((r8 != null ? r8 == p000.t7c.Vertical ? p000.izb.m30430getYimpl(r4) : p000.izb.m30429getXimpl(r4) : p000.izb.m30427getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30070horizontalDragjO51t88(@p000.yfb p000.gn0 r18, long r19, @p000.yfb p000.qy6<? super p000.h2d, p000.bth> r21, @p000.yfb p000.zy2<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30070horizontalDragjO51t88(gn0, long, qy6, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m30071isPointerUpDmW0f2w(t1d t1dVar, long j) {
        h2d h2dVar;
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                h2dVar = null;
                break;
            }
            h2dVar = changes.get(i);
            if (f2d.m28883equalsimpl0(h2dVar.m29909getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        h2d h2dVar2 = h2dVar;
        if (h2dVar2 != null && h2dVar2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m30072pointerSlopE8SPZFQ(@yfb u8i u8iVar, int i) {
        return z2d.m33469equalsimpl0(i, z2d.f103875b.m33474getMouseT8wyACA()) ? u8iVar.getTouchSlop() * f44255c : u8iVar.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((r8 != null ? r8 == p000.t7c.Vertical ? p000.izb.m30430getYimpl(r4) : p000.izb.m30429getXimpl(r4) : p000.izb.m30427getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    @p000.gib
    /* JADX INFO: renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m30073verticalDragjO51t88(@p000.yfb p000.gn0 r18, long r19, @p000.yfb p000.qy6<? super p000.h2d, p000.bth> r21, @p000.yfb p000.zy2<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ho4.m30073verticalDragjO51t88(gn0, long, qy6, zy2):java.lang.Object");
    }

    @gib
    public static final Object detectDragGestures(@yfb s2d s2dVar, @yfb gz6<? super h2d, ? super izb, bth> gz6Var, @yfb qy6<? super h2d, bth> qy6Var, @yfb ny6<bth> ny6Var, @yfb ny6<Boolean> ny6Var2, @gib t7c t7cVar, @yfb gz6<? super h2d, ? super izb, bth> gz6Var2, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C6947q(ny6Var2, t7cVar, gz6Var, gz6Var2, ny6Var, qy6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }
}
