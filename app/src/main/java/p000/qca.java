package p000;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Iterator;
import java.util.List;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 5), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n314#2,11:142\n314#2,11:153\n314#2,11:164\n314#2,11:175\n314#2,11:186\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n*L\n44#1:131,11\n56#1:142,11\n69#1:153,11\n81#1:164,11\n111#1:175,11\n123#1:186,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"NewApi", "ClassVerificationFailure"})
public class qca extends dca {

    /* JADX INFO: renamed from: d */
    @yfb
    public final MeasurementManager f73958d;

    /* JADX INFO: renamed from: qca$a */
    @ck3(m4009c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m4010f = "MeasurementManagerImplCommon.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n*L\n94#1:131,2\n*E\n"})
    public static final class C11427a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f73959a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f73960b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nwf f73961c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qca f73962d;

        /* JADX INFO: renamed from: qca$a$a */
        @ck3(m4009c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", m4010f = "MeasurementManagerImplCommon.kt", m4011i = {}, m4012l = {131}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4$1$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4$1$1\n*L\n96#1:131,11\n*E\n"})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public Object f73963a;

            /* JADX INFO: renamed from: b */
            public Object f73964b;

            /* JADX INFO: renamed from: c */
            public Object f73965c;

            /* JADX INFO: renamed from: d */
            public int f73966d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ qca f73967e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Uri f73968f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ nwf f73969m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qca qcaVar, Uri uri, nwf nwfVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f73967e = qcaVar;
                this.f73968f = uri;
                this.f73969m = nwfVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f73967e, this.f73968f, this.f73969m, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f73966d;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    qca qcaVar = this.f73967e;
                    Uri uri = this.f73968f;
                    nwf nwfVar = this.f73969m;
                    this.f73963a = qcaVar;
                    this.f73964b = uri;
                    this.f73965c = nwfVar;
                    this.f73966d = 1;
                    fq1 fq1Var = new fq1(od8.intercepted(this), 1);
                    fq1Var.initCancellability();
                    qcaVar.m20258b().registerSource(uri, nwfVar.getInputEvent(), new p63(), k8c.asOutcomeReceiver(fq1Var));
                    Object result = fq1Var.getResult();
                    if (result == pd8.getCOROUTINE_SUSPENDED()) {
                        jk3.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
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
        public C11427a(nwf nwfVar, qca qcaVar, zy2<? super C11427a> zy2Var) {
            super(2, zy2Var);
            this.f73961c = nwfVar;
            this.f73962d = qcaVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C11427a c11427a = new C11427a(this.f73961c, this.f73962d, zy2Var);
            c11427a.f73960b = obj;
            return c11427a;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C11427a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f73959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f73960b;
            List<Uri> registrationUris = this.f73961c.getRegistrationUris();
            qca qcaVar = this.f73962d;
            nwf nwfVar = this.f73961c;
            Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                fg1.launch$default(x13Var, null, null, new a(qcaVar, (Uri) it.next(), nwfVar, null), 3, null);
            }
            return bth.f14751a;
        }
    }

    public qca(@yfb MeasurementManager measurementManager) {
        md8.checkNotNullParameter(measurementManager, "mMeasurementManager");
        this.f73958d = measurementManager;
    }

    @ih4
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m20251a(qca qcaVar, s54 s54Var, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().deleteRegistrations(s54Var.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m20252c(qca qcaVar, zy2<? super Integer> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().getMeasurementApiStatus(new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @yg5.InterfaceC15652e
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m20253d(qca qcaVar, nwf nwfVar, zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C11427a(nwfVar, qcaVar, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m20254e(qca qcaVar, Uri uri, InputEvent inputEvent, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().registerSource(uri, inputEvent, new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m20255f(qca qcaVar, Uri uri, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().registerTrigger(uri, new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m20256g(qca qcaVar, cji cjiVar, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().registerWebSource(cjiVar.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m20257h(qca qcaVar, lji ljiVar, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qcaVar.m20258b().registerWebTrigger(ljiVar.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final MeasurementManager m20258b() {
        return this.f73958d;
    }

    @Override // p000.dca
    @gib
    @ih4
    public Object deleteRegistrations(@yfb s54 s54Var, @yfb zy2<? super bth> zy2Var) {
        return m20251a(this, s54Var, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object getMeasurementApiStatus(@yfb zy2<? super Integer> zy2Var) {
        return m20252c(this, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @yg5.InterfaceC15652e
    public Object registerSource(@yfb nwf nwfVar, @yfb zy2<? super bth> zy2Var) {
        return m20253d(this, nwfVar, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object registerTrigger(@yfb Uri uri, @yfb zy2<? super bth> zy2Var) {
        return m20255f(this, uri, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object registerWebSource(@yfb cji cjiVar, @yfb zy2<? super bth> zy2Var) {
        return m20256g(this, cjiVar, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object registerWebTrigger(@yfb lji ljiVar, @yfb zy2<? super bth> zy2Var) {
        return m20257h(this, ljiVar, zy2Var);
    }

    @Override // p000.dca
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object registerSource(@yfb Uri uri, @gib InputEvent inputEvent, @yfb zy2<? super bth> zy2Var) {
        return m20254e(this, uri, inputEvent, zy2Var);
    }
}
