package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
@e0g(parameters = 0)
public final class ul2 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: g */
    public static final int f88283g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final txe f88284a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final l78 f88285b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC13572a f88286c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x13 f88287d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final wxd f88288e;

    /* JADX INFO: renamed from: f */
    public int f88289f;

    /* JADX INFO: renamed from: ul2$a */
    public interface InterfaceC13572a {
        void onSessionEnded();

        void onSessionStarted();
    }

    /* JADX INFO: renamed from: ul2$b */
    @ck3(m4009c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", m4010f = "ComposeScrollCaptureCallback.android.kt", m4011i = {}, m4012l = {190}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13573b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f88290a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f88292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13573b(Runnable runnable, zy2<? super C13573b> zy2Var) {
            super(2, zy2Var);
            this.f88292c = runnable;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return ul2.this.new C13573b(this.f88292c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13573b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f88290a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                wxd wxdVar = ul2.this.f88288e;
                this.f88290a = 1;
                if (wxdVar.scrollTo(0.0f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            ul2.this.f88286c.onSessionEnded();
            this.f88292c.run();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: ul2$c */
    @ck3(m4009c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", m4010f = "ComposeScrollCaptureCallback.android.kt", m4011i = {}, m4012l = {116}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13574c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f88293a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScrollCaptureSession f88295c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Rect f88296d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Consumer<Rect> f88297e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13574c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, zy2<? super C13574c> zy2Var) {
            super(2, zy2Var);
            this.f88295c = scrollCaptureSession;
            this.f88296d = rect;
            this.f88297e = consumer;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return ul2.this.new C13574c(this.f88295c, this.f88296d, this.f88297e, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13574c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f88293a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ul2 ul2Var = ul2.this;
                ScrollCaptureSession scrollCaptureSession = this.f88295c;
                l78 composeIntRect = vud.toComposeIntRect(this.f88296d);
                this.f88293a = 1;
                obj = ul2Var.onScrollCaptureImageRequest(scrollCaptureSession, composeIntRect, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            this.f88297e.accept(vud.toAndroidRect((l78) obj));
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: ul2$d */
    @ck3(m4009c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", m4010f = "ComposeScrollCaptureCallback.android.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m4012l = {129, 132}, m4013m = "onScrollCaptureImageRequest", m4014n = {"this", i7f.f45937b, "captureArea", "targetMin", "targetMax", "this", i7f.f45937b, "captureArea", "targetMin", "targetMax"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class C13575d extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f88298C;

        /* JADX INFO: renamed from: a */
        public Object f88299a;

        /* JADX INFO: renamed from: b */
        public Object f88300b;

        /* JADX INFO: renamed from: c */
        public Object f88301c;

        /* JADX INFO: renamed from: d */
        public int f88302d;

        /* JADX INFO: renamed from: e */
        public int f88303e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f88304f;

        public C13575d(zy2<? super C13575d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f88304f = obj;
            this.f88298C |= Integer.MIN_VALUE;
            return ul2.this.onScrollCaptureImageRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ul2$e */
    public static final class C13576e extends tt8 implements qy6<Long, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13576e f88306a = new C13576e();

        public C13576e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
        }
    }

    /* JADX INFO: renamed from: ul2$f */
    @ck3(m4009c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", m4010f = "ComposeScrollCaptureCallback.android.kt", m4011i = {0}, m4012l = {85}, m4013m = "invokeSuspend", m4014n = {"reverseScrolling"}, m4015s = {"Z$0"})
    @dwf({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,319:1\n81#2,9:320\n*S KotlinDebug\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n*L\n74#1:320,9\n*E\n"})
    public static final class C13577f extends ugg implements gz6<Float, zy2<? super Float>, Object> {

        /* JADX INFO: renamed from: a */
        public boolean f88307a;

        /* JADX INFO: renamed from: b */
        public int f88308b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ float f88309c;

        public C13577f(zy2<? super C13577f> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C13577f c13577f = ul2.this.new C13577f(zy2Var);
            c13577f.f88309c = ((Number) obj).floatValue();
            return c13577f;
        }

        @gib
        public final Object invoke(float f, @gib zy2<? super Float> zy2Var) {
            return ((C13577f) create(Float.valueOf(f), zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            boolean z;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f88308b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                float f = this.f88309c;
                gz6<izb, zy2<? super izb>, Object> scrollCaptureScrollByAction = pre.getScrollCaptureScrollByAction(ul2.this.f88284a);
                if (scrollCaptureScrollByAction == null) {
                    g28.throwIllegalStateExceptionForNullCheck("Required value was null.");
                    throw new us8();
                }
                boolean reverseScrolling = ((ire) ul2.this.f88284a.getUnmergedConfig$ui_release().get(zxe.f106362a.getVerticalScrollAxisRange())).getReverseScrolling();
                if (reverseScrolling) {
                    f = -f;
                }
                izb izbVarM30418boximpl = izb.m30418boximpl(mzb.Offset(0.0f, f));
                this.f88307a = reverseScrolling;
                this.f88308b = 1;
                obj = scrollCaptureScrollByAction.invoke(izbVarM30418boximpl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = reverseScrolling;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.f88307a;
                y7e.throwOnFailure(obj);
            }
            float fM30430getYimpl = izb.m30430getYimpl(((izb) obj).m30439unboximpl());
            if (z) {
                fM30430getYimpl = -fM30430getYimpl;
            }
            return wc1.boxFloat(fM30430getYimpl);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Float f, zy2<? super Float> zy2Var) {
            return invoke(f.floatValue(), zy2Var);
        }
    }

    public ul2(@yfb txe txeVar, @yfb l78 l78Var, @yfb x13 x13Var, @yfb InterfaceC13572a interfaceC13572a) {
        this.f88284a = txeVar;
        this.f88285b = l78Var;
        this.f88286c = interfaceC13572a;
        this.f88287d = y13.plus(x13Var, ud4.f87610a);
        this.f88288e = new wxd(l78Var.getHeight(), new C13577f(null));
    }

    private final void drawDebugBackground(Canvas canvas) {
        canvas.drawColor(j92.m30490toArgb8_81llA(w82.C14471a.m32975hslJlNiLsg$default(w82.f93556b, tod.f85517a.nextFloat() * 360.0f, 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.f88289f), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.f88289f++;
    }

    public void onScrollCaptureEnd(@yfb Runnable runnable) {
        fg1.launch$default(this.f88287d, web.f94038b, null, new C13573b(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(@yfb ScrollCaptureSession scrollCaptureSession, @yfb CancellationSignal cancellationSignal, @yfb Rect rect, @yfb Consumer<Rect> consumer) {
        wl2.launchWithCancellationSignal(this.f88287d, cancellationSignal, new C13574c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(@yfb CancellationSignal cancellationSignal, @yfb Consumer<Rect> consumer) {
        consumer.accept(vud.toAndroidRect(this.f88285b));
    }

    public void onScrollCaptureStart(@yfb ScrollCaptureSession scrollCaptureSession, @yfb CancellationSignal cancellationSignal, @yfb Runnable runnable) {
        this.f88288e.reset();
        this.f88289f = 0;
        this.f88286c.onSessionStarted();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onScrollCaptureImageRequest(android.view.ScrollCaptureSession r9, p000.l78 r10, p000.zy2<? super p000.l78> r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ul2.onScrollCaptureImageRequest(android.view.ScrollCaptureSession, l78, zy2):java.lang.Object");
    }
}
