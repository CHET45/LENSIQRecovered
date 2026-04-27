package p000;

import java.util.List;
import p000.qnh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n26#2:258\n26#2:259\n26#2:260\n26#2:261\n26#2:262\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n172#1:257\n209#1:258\n226#1:259\n239#1:260\n246#1:261\n252#1:262\n*E\n"})
@e0g(parameters = 0)
public final class pnh {

    /* JADX INFO: renamed from: c */
    public static final int f71509c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final cig f71510a = whg.createSynchronizedObject();

    /* JADX INFO: renamed from: b */
    @yfb
    public final np9<onh, qnh> f71511b = new np9<>(16);

    /* JADX INFO: renamed from: pnh$a */
    @dwf({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n198#1:257\n*E\n"})
    public static final class C11041a extends tt8 implements qy6<qnh, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ onh f71513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11041a(onh onhVar) {
            super(1);
            this.f71513b = onhVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qnh qnhVar) {
            invoke2(qnhVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qnh qnhVar) {
            cig lock$ui_text_release = pnh.this.getLock$ui_text_release();
            pnh pnhVar = pnh.this;
            onh onhVar = this.f71513b;
            synchronized (lock$ui_text_release) {
                try {
                    if (qnhVar.getCacheable()) {
                        pnhVar.f71511b.put(onhVar, qnhVar);
                    } else {
                        pnhVar.f71511b.remove(onhVar);
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @gib
    public final qnh get$ui_text_release(@yfb onh onhVar) {
        qnh qnhVar;
        synchronized (this.f71510a) {
            qnhVar = this.f71511b.get(onhVar);
        }
        return qnhVar;
    }

    @yfb
    public final cig getLock$ui_text_release() {
        return this.f71510a;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.f71510a) {
            size = this.f71511b.size();
        }
        return size;
    }

    public final void preWarmCache(@yfb List<onh> list, @yfb qy6<? super onh, ? extends qnh> qy6Var) {
        qnh qnhVar;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onh onhVar = list.get(i);
            synchronized (this.f71510a) {
                qnhVar = this.f71511b.get(onhVar);
            }
            if (qnhVar == null) {
                try {
                    qnh qnhVarInvoke = qy6Var.invoke(onhVar);
                    if (qnhVarInvoke instanceof qnh.C11570a) {
                        continue;
                    } else {
                        synchronized (this.f71510a) {
                            this.f71511b.put(onhVar, qnhVarInvoke);
                        }
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    @yfb
    public final i2g<Object> runCached(@yfb onh onhVar, @yfb qy6<? super qy6<? super qnh, bth>, ? extends qnh> qy6Var) {
        synchronized (this.f71510a) {
            qnh qnhVar = this.f71511b.get(onhVar);
            if (qnhVar != null) {
                if (qnhVar.getCacheable()) {
                    return qnhVar;
                }
                this.f71511b.remove(onhVar);
            }
            try {
                qnh qnhVarInvoke = qy6Var.invoke(new C11041a(onhVar));
                synchronized (this.f71510a) {
                    try {
                        if (this.f71511b.get(onhVar) == null && qnhVarInvoke.getCacheable()) {
                            this.f71511b.put(onhVar, qnhVarInvoke);
                        }
                        bth bthVar = bth.f14751a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qnhVarInvoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
