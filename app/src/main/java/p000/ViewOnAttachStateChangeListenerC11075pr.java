package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.C0822b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p000.ViewOnAttachStateChangeListenerC11075pr;

/* JADX INFO: renamed from: pr */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSet.kt\nandroidx/collection/IntSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,650:1\n33#2,6:651\n33#2,4:684\n38#2:697\n33#2,6:698\n33#2,4:729\n38#2:742\n151#2,3:837\n33#2,4:840\n154#2,2:844\n38#2:846\n156#2:847\n151#2,3:875\n33#2,4:878\n154#2,2:882\n38#2:884\n156#2:885\n33#2,6:886\n33#2,6:892\n262#3,4:657\n232#3,7:661\n243#3,3:669\n246#3,2:673\n266#3,2:675\n249#3,6:677\n268#3:683\n262#3,4:848\n232#3,7:852\n243#3,3:860\n246#3,2:864\n266#3,2:866\n249#3,6:868\n268#3:874\n1810#4:668\n1672#4:672\n1810#4:713\n1672#4:717\n1810#4:752\n1672#4:756\n1810#4:796\n1672#4:800\n1810#4:821\n1672#4:825\n1810#4:859\n1672#4:863\n1810#4:907\n1672#4:911\n1810#4:932\n1672#4:936\n1810#4:957\n1672#4:961\n66#5,9:688\n66#5,9:733\n66#5,9:760\n66#5,9:777\n396#6,3:704\n354#6,6:707\n364#6,3:714\n367#6,2:718\n399#6,2:720\n370#6,6:722\n401#6:728\n396#6,3:743\n354#6,6:746\n364#6,3:753\n367#6,2:757\n399#6:759\n400#6:769\n370#6,6:770\n401#6:776\n382#6,4:786\n354#6,6:790\n364#6,3:797\n367#6,2:801\n387#6,2:803\n370#6,6:805\n389#6:811\n408#6,3:812\n354#6,6:815\n364#6,3:822\n367#6,2:826\n412#6,2:828\n370#6,6:830\n414#6:836\n408#6,3:898\n354#6,6:901\n364#6,3:908\n367#6,2:912\n412#6,2:914\n370#6,6:916\n414#6:922\n408#6,3:923\n354#6,6:926\n364#6,3:933\n367#6,2:937\n412#6,2:939\n370#6,6:941\n414#6:947\n408#6,3:948\n354#6,6:951\n364#6,3:958\n367#6,2:962\n412#6,2:964\n370#6,6:966\n414#6:972\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n235#1:651,6\n253#1:684,4\n253#1:697\n268#1:698,6\n281#1:729,4\n281#1:742\n458#1:837,3\n458#1:840,4\n458#1:844,2\n458#1:846\n458#1:847\n466#1:875,3\n466#1:878,4\n466#1:882,2\n466#1:884\n466#1:885\n480#1:886,6\n488#1:892,6\n246#1:657,4\n246#1:661,7\n246#1:669,3\n246#1:673,2\n246#1:675,2\n246#1:677,6\n246#1:683\n464#1:848,4\n464#1:852,7\n464#1:860,3\n464#1:864,2\n464#1:866,2\n464#1:868,6\n464#1:874\n246#1:668\n246#1:672\n275#1:713\n275#1:717\n296#1:752\n296#1:756\n345#1:796\n345#1:800\n456#1:821\n456#1:825\n464#1:859\n464#1:863\n526#1:907\n526#1:911\n537#1:932\n537#1:936\n548#1:957\n548#1:961\n255#1:688,9\n284#1:733,9\n300#1:760,9\n338#1:777,9\n275#1:704,3\n275#1:707,6\n275#1:714,3\n275#1:718,2\n275#1:720,2\n275#1:722,6\n275#1:728\n296#1:743,3\n296#1:746,6\n296#1:753,3\n296#1:757,2\n296#1:759\n296#1:769\n296#1:770,6\n296#1:776\n345#1:786,4\n345#1:790,6\n345#1:797,3\n345#1:801,2\n345#1:803,2\n345#1:805,6\n345#1:811\n456#1:812,3\n456#1:815,6\n456#1:822,3\n456#1:826,2\n456#1:828,2\n456#1:830,6\n456#1:836\n526#1:898,3\n526#1:901,6\n526#1:908,3\n526#1:912,2\n526#1:914,2\n526#1:916,6\n526#1:922\n537#1:923,3\n537#1:926,6\n537#1:933,3\n537#1:937,2\n537#1:939,2\n537#1:941,6\n537#1:947\n548#1:948,3\n548#1:951,6\n548#1:958,3\n548#1:962,2\n548#1:964,2\n548#1:966,6\n548#1:972\n*E\n"})
@e0g(parameters = 0)
public final class ViewOnAttachStateChangeListenerC11075pr implements hv2, kw3, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: M1 */
    public static final int f71664M1 = 8;

    /* JADX INFO: renamed from: N */
    public long f71670N;

    /* JADX INFO: renamed from: X */
    @yfb
    public uxe f71672X;

    /* JADX INFO: renamed from: Y */
    public boolean f71673Y;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AndroidComposeView f71675a;

    /* JADX INFO: renamed from: b */
    @yfb
    public ny6<? extends jv2> f71676b;

    /* JADX INFO: renamed from: c */
    @gib
    public jv2 f71677c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final i5b<pbi> f71678d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final j5b f71679e;

    /* JADX INFO: renamed from: f */
    public long f71680f = 100;

    /* JADX INFO: renamed from: m */
    @yfb
    public a f71681m = a.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: C */
    public boolean f71665C = true;

    /* JADX INFO: renamed from: F */
    @yfb
    public final g70<lw8> f71666F = new g70<>(0, 1, null);

    /* JADX INFO: renamed from: H */
    @yfb
    public final au1<bth> f71667H = nu1.Channel$default(1, null, null, 6, null);

    /* JADX INFO: renamed from: L */
    @yfb
    public final Handler f71668L = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: M */
    @yfb
    public y68<wxe> f71669M = z68.intObjectMapOf();

    /* JADX INFO: renamed from: Q */
    @yfb
    public i5b<uxe> f71671Q = z68.mutableIntObjectMapOf();

    /* JADX INFO: renamed from: Z */
    @yfb
    public final Runnable f71674Z = new Runnable() { // from class: or
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnAttachStateChangeListenerC11075pr.contentCaptureChangeChecker$lambda$0(this.f68363a);
        }
    };

    /* JADX INFO: renamed from: pr$a */
    public enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: renamed from: pr$b */
    @c5e(31)
    @dwf({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,650:1\n13607#2,2:651\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n*L\n568#1:651,2\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final b f71685a = new b();

        private b() {
        }

        private final void doTranslation(ViewOnAttachStateChangeListenerC11075pr viewOnAttachStateChangeListenerC11075pr, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            wxe wxeVar;
            txe semanticsNode;
            C4623d6 c4623d6;
            qy6 qy6Var;
            gl9 gl9VarKeyIterator = am9.keyIterator(longSparseArray);
            while (gl9VarKeyIterator.hasNext()) {
                long jNextLong = gl9VarKeyIterator.nextLong();
                ViewTranslationResponse viewTranslationResponseM20516a = C11603qr.m20516a(longSparseArray.get(jNextLong));
                if (viewTranslationResponseM20516a != null && (value = viewTranslationResponseM20516a.getValue("android:text")) != null && (text = value.getText()) != null && (wxeVar = viewOnAttachStateChangeListenerC11075pr.getCurrentSemanticsNodes$ui_release().get((int) jNextLong)) != null && (semanticsNode = wxeVar.getSemanticsNode()) != null && (c4623d6 = (C4623d6) oxe.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), mxe.f62738a.getSetTextSubstitution())) != null && (qy6Var = (qy6) c4623d6.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(ViewOnAttachStateChangeListenerC11075pr viewOnAttachStateChangeListenerC11075pr, LongSparseArray longSparseArray) {
            f71685a.doTranslation(viewOnAttachStateChangeListenerC11075pr, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
        @p000.c5e(31)
        @p000.ih4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCreateVirtualViewTranslationRequests(@p000.yfb p000.ViewOnAttachStateChangeListenerC11075pr r21, @p000.yfb long[] r22, @p000.yfb int[] r23, @p000.yfb java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r24) {
            /*
                r20 = this;
                r0 = r22
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L78
                r3 = r0[r2]
                y68 r5 = r21.getCurrentSemanticsNodes$ui_release()
                int r3 = (int) r3
                java.lang.Object r3 = r5.get(r3)
                wxe r3 = (p000.wxe) r3
                if (r3 == 0) goto L73
                txe r3 = r3.getSemanticsNode()
                if (r3 == 0) goto L73
                p000.C15259xr.m25419a()
                androidx.compose.ui.platform.AndroidComposeView r4 = r21.getView()
                android.view.autofill.AutofillId r4 = r4.getAutofillId()
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = p000.C14753wr.m24753a(r4, r5)
                nxe r3 = r3.getUnmergedConfig$ui_release()
                zxe r5 = p000.zxe.f106362a
                dye r5 = r5.getText()
                java.lang.Object r3 = p000.oxe.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L73
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r15 = p000.u99.fastJoinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 == 0) goto L73
                lz r3 = new lz
                r16 = 0
                r17 = 0
                r18 = 6
                r19 = 0
                r14 = r3
                r14.<init>(r15, r16, r17, r18, r19)
                java.lang.String r5 = "android:text"
                android.view.translation.TranslationRequestValue r3 = p000.C13171tr.m22752a(r3)
                p000.C13660ur.m23511a(r4, r5, r3)
                android.view.translation.ViewTranslationRequest r3 = p000.C14224vr.m24133a(r4)
                r4 = r24
                r4.accept(r3)
                goto L75
            L73:
                r4 = r24
            L75:
                int r2 = r2 + 1
                goto L4
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.b.onCreateVirtualViewTranslationRequests(pr, long[], int[], java.util.function.Consumer):void");
        }

        @c5e(31)
        @ih4
        public final void onVirtualViewTranslationResponses(@yfb final ViewOnAttachStateChangeListenerC11075pr viewOnAttachStateChangeListenerC11075pr, @yfb final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (md8.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(viewOnAttachStateChangeListenerC11075pr, longSparseArray);
            } else {
                viewOnAttachStateChangeListenerC11075pr.getView().post(new Runnable() { // from class: yr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnAttachStateChangeListenerC11075pr.b.onVirtualViewTranslationResponses$lambda$1(viewOnAttachStateChangeListenerC11075pr, longSparseArray);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: pr$c */
    @ck3(m4009c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", m4010f = "AndroidContentCaptureManager.android.kt", m4011i = {0, 1}, m4012l = {186, nb2.f63872t}, m4013m = "boundsUpdatesEventLoop$ui_release", m4014n = {"this", "this"}, m4015s = {"L$0", "L$0"})
    public static final class c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f71686a;

        /* JADX INFO: renamed from: b */
        public Object f71687b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f71688c;

        /* JADX INFO: renamed from: e */
        public int f71690e;

        public c(zy2<? super c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f71688c = obj;
            this.f71690e |= Integer.MIN_VALUE;
            return ViewOnAttachStateChangeListenerC11075pr.this.boundsUpdatesEventLoop$ui_release(this);
        }
    }

    public ViewOnAttachStateChangeListenerC11075pr(@yfb AndroidComposeView androidComposeView, @yfb ny6<? extends jv2> ny6Var) {
        this.f71675a = androidComposeView;
        this.f71676b = ny6Var;
        int i = 0;
        int i2 = 1;
        jt3 jt3Var = null;
        this.f71678d = new i5b<>(i, i2, jt3Var);
        this.f71679e = new j5b(i, i2, jt3Var);
        this.f71672X = new uxe(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), z68.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int i, pbi pbiVar) {
        if (pbiVar == null) {
            return;
        }
        if (this.f71679e.contains(i)) {
            this.f71679e.remove(i);
        } else {
            this.f71678d.set(i, pbiVar);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int i) {
        if (this.f71678d.containsKey(i)) {
            this.f71678d.remove(i);
        } else {
            this.f71679e.add(i);
        }
    }

    private final void checkForContentCapturePropertyChanges(y68<wxe> y68Var) {
        int i;
        int[] iArr = y68Var.f100489b;
        long[] jArr = y68Var.f100488a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = iArr[(i2 << 3) + i5];
                        uxe uxeVar = this.f71671Q.get(i6);
                        wxe wxeVar = y68Var.get(i6);
                        txe semanticsNode = wxeVar != null ? wxeVar.getSemanticsNode() : null;
                        if (semanticsNode == null) {
                            g28.throwIllegalStateExceptionForNullCheck("no value for specified key");
                            throw new us8();
                        }
                        if (uxeVar == null) {
                            Iterator<Map.Entry<? extends dye<?>, ? extends Object>> it = semanticsNode.getUnmergedConfig$ui_release().iterator();
                            while (it.hasNext()) {
                                dye<?> key = it.next().getKey();
                                zxe zxeVar = zxe.f106362a;
                                if (md8.areEqual(key, zxeVar.getText())) {
                                    List list = (List) oxe.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), zxeVar.getText());
                                    sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(list != null ? (C9041lz) v82.firstOrNull(list) : null));
                                }
                            }
                        } else {
                            Iterator<Map.Entry<? extends dye<?>, ? extends Object>> it2 = semanticsNode.getUnmergedConfig$ui_release().iterator();
                            while (it2.hasNext()) {
                                dye<?> key2 = it2.next().getKey();
                                zxe zxeVar2 = zxe.f106362a;
                                if (md8.areEqual(key2, zxeVar2.getText())) {
                                    List list2 = (List) oxe.getOrNull(uxeVar.getUnmergedConfig(), zxeVar2.getText());
                                    C9041lz c9041lz = list2 != null ? (C9041lz) v82.firstOrNull(list2) : null;
                                    List list3 = (List) oxe.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), zxeVar2.getText());
                                    C9041lz c9041lz2 = list3 != null ? (C9041lz) v82.firstOrNull(list3) : null;
                                    if (!md8.areEqual(c9041lz, c9041lz2)) {
                                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(c9041lz2));
                                    }
                                }
                            }
                        }
                        i = 8;
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void clearTranslatedText() {
        C4623d6 c4623d6;
        ny6 ny6Var;
        y68<wxe> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f100490c;
        long[] jArr = currentSemanticsNodes$ui_release.f100488a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        nxe unmergedConfig$ui_release = ((wxe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (oxe.getOrNull(unmergedConfig$ui_release, zxe.f106362a.getIsShowingTextSubstitution()) != null && (c4623d6 = (C4623d6) oxe.getOrNull(unmergedConfig$ui_release, mxe.f62738a.getClearTextSubstitution())) != null && (ny6Var = (ny6) c4623d6.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(ViewOnAttachStateChangeListenerC11075pr viewOnAttachStateChangeListenerC11075pr) {
        if (viewOnAttachStateChangeListenerC11075pr.isEnabled$ui_release()) {
            z9c.measureAndLayout$default(viewOnAttachStateChangeListenerC11075pr.f71675a, false, 1, null);
            viewOnAttachStateChangeListenerC11075pr.sendSemanticsStructureChangeEvents(viewOnAttachStateChangeListenerC11075pr.f71675a.getSemanticsOwner().getUnmergedRootSemanticsNode(), viewOnAttachStateChangeListenerC11075pr.f71672X);
            viewOnAttachStateChangeListenerC11075pr.sendContentCaptureStructureChangeEvents(viewOnAttachStateChangeListenerC11075pr.f71675a.getSemanticsOwner().getUnmergedRootSemanticsNode(), viewOnAttachStateChangeListenerC11075pr.f71672X);
            viewOnAttachStateChangeListenerC11075pr.checkForContentCapturePropertyChanges(viewOnAttachStateChangeListenerC11075pr.getCurrentSemanticsNodes$ui_release());
            viewOnAttachStateChangeListenerC11075pr.updateSemanticsCopy();
            viewOnAttachStateChangeListenerC11075pr.f71673Y = false;
        }
    }

    @fdi
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    private final void hideTranslatedText() {
        C4623d6 c4623d6;
        qy6 qy6Var;
        y68<wxe> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f100490c;
        long[] jArr = currentSemanticsNodes$ui_release.f100488a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        nxe unmergedConfig$ui_release = ((wxe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (md8.areEqual(oxe.getOrNull(unmergedConfig$ui_release, zxe.f106362a.getIsShowingTextSubstitution()), Boolean.TRUE) && (c4623d6 = (C4623d6) oxe.getOrNull(unmergedConfig$ui_release, mxe.f62738a.getShowTextSubstitution())) != null && (qy6Var = (qy6) c4623d6.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyContentCaptureChanges() {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.notifyContentCaptureChanges():void");
    }

    private final void notifySubtreeStateChangeIfNeeded(lw8 lw8Var) {
        if (this.f71666F.add(lw8Var)) {
            this.f71667H.mo28705trySendJP2dKIU(bth.f14751a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendContentCaptureStructureChangeEvents(p000.txe r14, p000.uxe r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.sendContentCaptureStructureChangeEvents(txe, uxe):void");
    }

    private final void sendContentCaptureTextUpdateEvent(int i, String str) {
        jv2 jv2Var;
        if (Build.VERSION.SDK_INT >= 29 && (jv2Var = this.f71677c) != null) {
            AutofillId autofillIdNewAutofillId = jv2Var.newAutofillId(i);
            if (autofillIdNewAutofillId != null) {
                jv2Var.notifyViewTextChanged(autofillIdNewAutofillId, str);
            } else {
                g28.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
                throw new us8();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSemanticsStructureChangeEvents(p000.txe r17, p000.uxe r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.sendSemanticsStructureChangeEvents(txe, uxe):void");
    }

    private final void showTranslatedText() {
        C4623d6 c4623d6;
        qy6 qy6Var;
        y68<wxe> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f100490c;
        long[] jArr = currentSemanticsNodes$ui_release.f100488a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        nxe unmergedConfig$ui_release = ((wxe) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (md8.areEqual(oxe.getOrNull(unmergedConfig$ui_release, zxe.f106362a.getIsShowingTextSubstitution()), Boolean.FALSE) && (c4623d6 = (C4623d6) oxe.getOrNull(unmergedConfig$ui_release, mxe.f62738a.getShowTextSubstitution())) != null && (qy6Var = (qy6) c4623d6.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final pbi toViewStructure(txe txeVar) {
        km0 autofillId;
        AutofillId autofillId2;
        String strM29878toLegacyClassNameV4PA4sw;
        jv2 jv2Var = this.f71677c;
        if (jv2Var == null || Build.VERSION.SDK_INT < 29 || (autofillId = q8i.getAutofillId(this.f71675a)) == null) {
            return null;
        }
        if (txeVar.getParent() != null) {
            autofillId2 = jv2Var.newAutofillId(r3.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        pbi pbiVarNewVirtualViewStructure = jv2Var.newVirtualViewStructure(autofillId2, txeVar.getId());
        if (pbiVarNewVirtualViewStructure == null) {
            return null;
        }
        nxe unmergedConfig$ui_release = txeVar.getUnmergedConfig$ui_release();
        zxe zxeVar = zxe.f106362a;
        if (unmergedConfig$ui_release.contains(zxeVar.getPassword())) {
            return null;
        }
        Bundle extras = pbiVarNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong("android.view.contentcapture.EventTimestamp", this.f71670N);
        }
        String str = (String) oxe.getOrNull(unmergedConfig$ui_release, zxeVar.getTestTag());
        if (str != null) {
            pbiVarNewVirtualViewStructure.setId(txeVar.getId(), null, null, str);
        }
        List list = (List) oxe.getOrNull(unmergedConfig$ui_release, zxeVar.getText());
        if (list != null) {
            pbiVarNewVirtualViewStructure.setClassName(C0822b.f5775Q);
            pbiVarNewVirtualViewStructure.setText(u99.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        C9041lz c9041lz = (C9041lz) oxe.getOrNull(unmergedConfig$ui_release, zxeVar.getEditableText());
        if (c9041lz != null) {
            pbiVarNewVirtualViewStructure.setClassName(C0822b.f5774P);
            pbiVarNewVirtualViewStructure.setText(c9041lz);
        }
        List list2 = (List) oxe.getOrNull(unmergedConfig$ui_release, zxeVar.getContentDescription());
        if (list2 != null) {
            pbiVarNewVirtualViewStructure.setContentDescription(u99.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        jae jaeVar = (jae) oxe.getOrNull(unmergedConfig$ui_release, zxeVar.getRole());
        if (jaeVar != null && (strM29878toLegacyClassNameV4PA4sw = gye.m29878toLegacyClassNameV4PA4sw(jaeVar.m30500unboximpl())) != null) {
            pbiVarNewVirtualViewStructure.setClassName(strM29878toLegacyClassNameV4PA4sw);
        }
        hug textLayoutResult = gye.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            gug layoutInput = textLayoutResult.getLayoutInput();
            pbiVarNewVirtualViewStructure.setTextStyle(jwg.m30613getValueimpl(layoutInput.getStyle().m33438getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        rud boundsInParent$ui_release = txeVar.getBoundsInParent$ui_release();
        pbiVarNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) boundsInParent$ui_release.getWidth(), (int) boundsInParent$ui_release.getHeight());
        return pbiVarNewVirtualViewStructure;
    }

    private final void updateBuffersOnAppeared(txe txeVar) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(txeVar);
            bufferContentCaptureViewAppeared(txeVar.getId(), toViewStructure(txeVar));
            List<txe> replacedChildren$ui_release = txeVar.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnAppeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateBuffersOnDisappeared(txe txeVar) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(txeVar.getId());
            List<txe> replacedChildren$ui_release = txeVar.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateSemanticsCopy() {
        /*
            r16 = this;
            r0 = r16
            i5b<uxe> r1 = r0.f71671Q
            r1.clear()
            y68 r1 = r16.getCurrentSemanticsNodes$ui_release()
            int[] r2 = r1.f100489b
            java.lang.Object[] r3 = r1.f100490c
            long[] r1 = r1.f100488a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            wxe r12 = (p000.wxe) r12
            i5b<uxe> r14 = r0.f71671Q
            uxe r15 = new uxe
            txe r12 = r12.getSemanticsNode()
            y68 r5 = r16.getCurrentSemanticsNodes$ui_release()
            r15.<init>(r12, r5)
            r14.set(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            uxe r1 = new uxe
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f71675a
            xxe r2 = r2.getSemanticsOwner()
            txe r2 = r2.getUnmergedRootSemanticsNode()
            y68 r3 = r16.getCurrentSemanticsNodes$ui_release()
            r1.<init>(r2, r3)
            r0.f71672X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(txe txeVar) {
        C4623d6 c4623d6;
        qy6 qy6Var;
        qy6 qy6Var2;
        nxe unmergedConfig$ui_release = txeVar.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) oxe.getOrNull(unmergedConfig$ui_release, zxe.f106362a.getIsShowingTextSubstitution());
        if (this.f71681m == a.SHOW_ORIGINAL && md8.areEqual(bool, Boolean.TRUE)) {
            C4623d6 c4623d62 = (C4623d6) oxe.getOrNull(unmergedConfig$ui_release, mxe.f62738a.getShowTextSubstitution());
            if (c4623d62 == null || (qy6Var2 = (qy6) c4623d62.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.f71681m != a.SHOW_TRANSLATED || !md8.areEqual(bool, Boolean.FALSE) || (c4623d6 = (C4623d6) oxe.getOrNull(unmergedConfig$ui_release, mxe.f62738a.getShowTextSubstitution())) == null || (qy6Var = (qy6) c4623d6.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(@p000.yfb p000.zy2<? super p000.bth> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p000.ViewOnAttachStateChangeListenerC11075pr.c
            if (r0 == 0) goto L13
            r0 = r10
            pr$c r0 = (p000.ViewOnAttachStateChangeListenerC11075pr.c) r0
            int r1 = r0.f71690e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71690e = r1
            goto L18
        L13:
            pr$c r0 = new pr$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f71688c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f71690e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.f71687b
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r5 = r0.f71686a
            pr r5 = (p000.ViewOnAttachStateChangeListenerC11075pr) r5
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.f71687b
            mu1 r2 = (p000.mu1) r2
            java.lang.Object r5 = r0.f71686a
            pr r5 = (p000.ViewOnAttachStateChangeListenerC11075pr) r5
            p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            p000.y7e.throwOnFailure(r10)
            au1<bth> r10 = r9.f71667H     // Catch: java.lang.Throwable -> La3
            mu1 r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.f71686a = r5     // Catch: java.lang.Throwable -> L35
            r0.f71687b = r10     // Catch: java.lang.Throwable -> L35
            r0.f71690e = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.isEnabled$ui_release()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.notifyContentCaptureChanges()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.f71673Y     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.f71673Y = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.f71668L     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.f71674Z     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            g70<lw8> r10 = r5.f71666F     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.f71680f     // Catch: java.lang.Throwable -> L35
            r0.f71686a = r5     // Catch: java.lang.Throwable -> L35
            r0.f71687b = r2     // Catch: java.lang.Throwable -> L35
            r0.f71690e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = p000.p34.delay(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
            return r1
        L9b:
            g70<lw8> r10 = r5.f71666F
            r10.clear()
            bth r10 = p000.bth.f14751a
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            g70<lw8> r0 = r5.f71666F
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnAttachStateChangeListenerC11075pr.boundsUpdatesEventLoop$ui_release(zy2):java.lang.Object");
    }

    @gib
    public final jv2 getContentCaptureSession$ui_release() {
        return this.f71677c;
    }

    @yfb
    public final y68<wxe> getCurrentSemanticsNodes$ui_release() {
        if (this.f71665C) {
            this.f71665C = false;
            this.f71669M = gye.getAllUncoveredSemanticsNodesToIntObjectMap(this.f71675a.getSemanticsOwner());
            this.f71670N = System.currentTimeMillis();
        }
        return this.f71669M;
    }

    @yfb
    public final Handler getHandler$ui_release() {
        return this.f71668L;
    }

    @yfb
    public final ny6<jv2> getOnContentCaptureSession() {
        return this.f71676b;
    }

    @yfb
    public final AndroidComposeView getView() {
        return this.f71675a;
    }

    public final boolean isEnabled$ui_release() {
        return hv2.f44925r.isEnabled() && this.f71677c != null;
    }

    public final void onClearTranslation$ui_release() {
        this.f71681m = a.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @c5e(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(@yfb long[] jArr, @yfb int[] iArr, @yfb Consumer<ViewTranslationRequest> consumer) {
        b.f71685a.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onHideTranslation$ui_release() {
        this.f71681m = a.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release(@yfb lw8 lw8Var) {
        this.f71665C = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded(lw8Var);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.f71665C = true;
        if (!isEnabled$ui_release() || this.f71673Y) {
            return;
        }
        this.f71673Y = true;
        this.f71668L.post(this.f71674Z);
    }

    public final void onShowTranslation$ui_release() {
        this.f71681m = a.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // p000.kw3
    public void onStart(@yfb g59 g59Var) {
        this.f71677c = this.f71676b.invoke();
        updateBuffersOnAppeared(this.f71675a.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // p000.kw3
    public void onStop(@yfb g59 g59Var) {
        updateBuffersOnDisappeared(this.f71675a.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.f71677c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@yfb View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@yfb View view) {
        this.f71668L.removeCallbacks(this.f71674Z);
        this.f71677c = null;
    }

    @c5e(31)
    public final void onVirtualViewTranslationResponses$ui_release(@yfb ViewOnAttachStateChangeListenerC11075pr viewOnAttachStateChangeListenerC11075pr, @yfb LongSparseArray<ViewTranslationResponse> longSparseArray) {
        b.f71685a.onVirtualViewTranslationResponses(viewOnAttachStateChangeListenerC11075pr, longSparseArray);
    }

    public final void setContentCaptureSession$ui_release(@gib jv2 jv2Var) {
        this.f71677c = jv2Var;
    }

    public final void setCurrentSemanticsNodes$ui_release(@yfb y68<wxe> y68Var) {
        this.f71669M = y68Var;
    }

    public final void setOnContentCaptureSession(@yfb ny6<? extends jv2> ny6Var) {
        this.f71676b = ny6Var;
    }
}
