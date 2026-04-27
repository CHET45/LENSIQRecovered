package p000;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import p000.xvc;

/* JADX INFO: loaded from: classes.dex */
public final class xvc {

    /* JADX INFO: renamed from: xvc$a */
    public static final class C15316a<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f99477a;

        public C15316a(Activity activity) {
            this.f99477a = activity;
        }

        @Override // p000.t66
        public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
            return emit((Rect) obj, (zy2<? super bth>) zy2Var);
        }

        @gib
        public final Object emit(@yfb Rect rect, @yfb zy2<? super bth> zy2Var) {
            o00.f66130a.setPipParamsSourceRectHint(this.f99477a, rect);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: xvc$b */
    @ck3(m4009c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", m4010f = "PipHintTracker.kt", m4011i = {}, m4012l = {85}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15317b extends ugg implements gz6<vdd<? super Rect>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f99478a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f99479b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f99480c;

        /* JADX INFO: renamed from: xvc$b$a */
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f99481a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f99482b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ View.OnLayoutChangeListener f99483c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ b f99484d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, b bVar) {
                super(0);
                this.f99481a = view;
                this.f99482b = onScrollChangedListener;
                this.f99483c = onLayoutChangeListener;
                this.f99484d = bVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f99481a.getViewTreeObserver().removeOnScrollChangedListener(this.f99482b);
                this.f99481a.removeOnLayoutChangeListener(this.f99483c);
                this.f99481a.removeOnAttachStateChangeListener(this.f99484d);
            }
        }

        /* JADX INFO: renamed from: xvc$b$b */
        public static final class b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ vdd<Rect> f99485a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f99486b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f99487c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ View.OnLayoutChangeListener f99488d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(vdd<? super Rect> vddVar, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f99485a = vddVar;
                this.f99486b = view;
                this.f99487c = onScrollChangedListener;
                this.f99488d = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@yfb View view) {
                this.f99485a.mo28705trySendJP2dKIU(xvc.trackPipAnimationHintView$positionInWindow(this.f99486b));
                this.f99486b.getViewTreeObserver().addOnScrollChangedListener(this.f99487c);
                this.f99486b.addOnLayoutChangeListener(this.f99488d);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@yfb View view) {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f99487c);
                view.removeOnLayoutChangeListener(this.f99488d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15317b(View view, zy2<? super C15317b> zy2Var) {
            super(2, zy2Var);
            this.f99480c = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(vdd vddVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            vddVar.mo28705trySendJP2dKIU(xvc.trackPipAnimationHintView$positionInWindow(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(vdd vddVar, View view) {
            vddVar.mo28705trySendJP2dKIU(xvc.trackPipAnimationHintView$positionInWindow(view));
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C15317b c15317b = new C15317b(this.f99480c, zy2Var);
            c15317b.f99479b = obj;
            return c15317b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vdd<? super Rect> vddVar, @gib zy2<? super bth> zy2Var) {
            return ((C15317b) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f99478a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                final vdd vddVar = (vdd) this.f99479b;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: yvc
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        xvc.C15317b.invokeSuspend$lambda$0(vddVar, view, i2, i3, i4, i5, i6, i7, i8, i9);
                    }
                };
                final View view = this.f99480c;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: zvc
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        xvc.C15317b.invokeSuspend$lambda$1(vddVar, view);
                    }
                };
                b bVar = new b(vddVar, this.f99480c, onScrollChangedListener, onLayoutChangeListener);
                if (h00.f41916a.isAttachedToWindow(this.f99480c)) {
                    vddVar.mo28705trySendJP2dKIU(xvc.trackPipAnimationHintView$positionInWindow(this.f99480c));
                    this.f99480c.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.f99480c.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.f99480c.addOnAttachStateChangeListener(bVar);
                a aVar = new a(this.f99480c, onScrollChangedListener, onLayoutChangeListener, bVar);
                this.f99478a = 1;
                if (rdd.awaitClose(vddVar, aVar, this) == coroutine_suspended) {
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

    @c5e(26)
    @gib
    public static final Object trackPipAnimationHintView(@yfb Activity activity, @yfb View view, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = c76.callbackFlow(new C15317b(view, null)).collect(new C15316a(activity), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
