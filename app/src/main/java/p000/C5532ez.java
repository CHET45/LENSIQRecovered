package p000;

import android.animation.Animator;

/* JADX INFO: renamed from: ez */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"})
public final class C5532ez {

    /* JADX INFO: renamed from: ez$a */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n*L\n1#1,123:1\n*E\n"})
    public static final class a extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final a f34517a = new a();

        public a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$b */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n*E\n"})
    public static final class b extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final b f34518a = new b();

        public b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$c */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,123:1\n*E\n"})
    public static final class c extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final c f34519a = new c();

        public c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$d */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n*L\n1#1,123:1\n*E\n"})
    public static final class d extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final d f34520a = new d();

        public d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$e */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,123:1\n*E\n"})
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Animator, bth> f34521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Animator, bth> f34522b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<Animator, bth> f34523c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<Animator, bth> f34524d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(qy6<? super Animator, bth> qy6Var, qy6<? super Animator, bth> qy6Var2, qy6<? super Animator, bth> qy6Var3, qy6<? super Animator, bth> qy6Var4) {
            this.f34521a = qy6Var;
            this.f34522b = qy6Var2;
            this.f34523c = qy6Var3;
            this.f34524d = qy6Var4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@yfb Animator animator) {
            this.f34523c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@yfb Animator animator) {
            this.f34522b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@yfb Animator animator) {
            this.f34521a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@yfb Animator animator) {
            this.f34524d.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: ez$f */
    public static final class f extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final f f34525a = new f();

        public f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$g */
    public static final class g extends tt8 implements qy6<Animator, bth> {

        /* JADX INFO: renamed from: a */
        public static final g f34526a = new g();

        public g() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Animator animator) {
            invoke2(animator);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$h */
    public static final class h implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Animator, bth> f34527a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Animator, bth> f34528b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(qy6<? super Animator, bth> qy6Var, qy6<? super Animator, bth> qy6Var2) {
            this.f34527a = qy6Var;
            this.f34528b = qy6Var2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@yfb Animator animator) {
            this.f34527a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@yfb Animator animator) {
            this.f34528b.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: ez$i */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n92#3:125\n93#4:126\n*E\n"})
    public static final class i implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f34529a;

        public i(qy6 qy6Var) {
            this.f34529a = qy6Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@yfb Animator animator) {
            this.f34529a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$j */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n94#3:125\n93#4:126\n*E\n"})
    public static final class j implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f34530a;

        public j(qy6 qy6Var) {
            this.f34530a = qy6Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@yfb Animator animator) {
            this.f34530a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$k */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n92#2:124\n94#3:125\n93#4:126\n*E\n"})
    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f34531a;

        public k(qy6 qy6Var) {
            this.f34531a = qy6Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@yfb Animator animator) {
            this.f34531a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@yfb Animator animator) {
        }
    }

    /* JADX INFO: renamed from: ez$l */
    @dwf({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,123:1\n95#2:124\n92#3:125\n94#4:126\n*E\n"})
    public static final class l implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f34532a;

        public l(qy6 qy6Var) {
            this.f34532a = qy6Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@yfb Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@yfb Animator animator) {
            this.f34532a.invoke(animator);
        }
    }

    @yfb
    public static final Animator.AnimatorListener addListener(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var, @yfb qy6<? super Animator, bth> qy6Var2, @yfb qy6<? super Animator, bth> qy6Var3, @yfb qy6<? super Animator, bth> qy6Var4) {
        e eVar = new e(qy6Var4, qy6Var, qy6Var3, qy6Var2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, qy6 qy6Var4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qy6Var = a.f34517a;
        }
        if ((i2 & 2) != 0) {
            qy6Var2 = b.f34518a;
        }
        if ((i2 & 4) != 0) {
            qy6Var3 = c.f34519a;
        }
        if ((i2 & 8) != 0) {
            qy6Var4 = d.f34520a;
        }
        e eVar = new e(qy6Var4, qy6Var, qy6Var3, qy6Var2);
        animator.addListener(eVar);
        return eVar;
    }

    @yfb
    public static final Animator.AnimatorPauseListener addPauseListener(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var, @yfb qy6<? super Animator, bth> qy6Var2) {
        h hVar = new h(qy6Var2, qy6Var);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, qy6 qy6Var, qy6 qy6Var2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qy6Var = f.f34525a;
        }
        if ((i2 & 2) != 0) {
            qy6Var2 = g.f34526a;
        }
        return addPauseListener(animator, qy6Var, qy6Var2);
    }

    @yfb
    public static final Animator.AnimatorListener doOnCancel(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        i iVar = new i(qy6Var);
        animator.addListener(iVar);
        return iVar;
    }

    @yfb
    public static final Animator.AnimatorListener doOnEnd(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        j jVar = new j(qy6Var);
        animator.addListener(jVar);
        return jVar;
    }

    @yfb
    public static final Animator.AnimatorPauseListener doOnPause(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        return addPauseListener$default(animator, null, qy6Var, 1, null);
    }

    @yfb
    public static final Animator.AnimatorListener doOnRepeat(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        k kVar = new k(qy6Var);
        animator.addListener(kVar);
        return kVar;
    }

    @yfb
    public static final Animator.AnimatorPauseListener doOnResume(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        return addPauseListener$default(animator, qy6Var, null, 2, null);
    }

    @yfb
    public static final Animator.AnimatorListener doOnStart(@yfb Animator animator, @yfb qy6<? super Animator, bth> qy6Var) {
        l lVar = new l(qy6Var);
        animator.addListener(lVar);
        return lVar;
    }
}
