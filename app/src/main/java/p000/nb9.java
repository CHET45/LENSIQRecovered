package p000;

import androidx.lifecycle.AbstractC1158q;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class nb9 {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* JADX INFO: renamed from: nb9$a */
    public class C9772a<In> implements qxb<In> {

        /* JADX INFO: renamed from: a */
        public Out f63902a = null;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ong f63903b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f63904c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ f07 f63905d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ zpa f63906e;

        /* JADX INFO: renamed from: nb9$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f63907a;

            public a(final Object val$input) {
                this.f63907a = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C9772a.this.f63904c) {
                    try {
                        ?? Apply = C9772a.this.f63905d.apply(this.f63907a);
                        C9772a c9772a = C9772a.this;
                        Out out = c9772a.f63902a;
                        if (out == 0 && Apply != 0) {
                            c9772a.f63902a = Apply;
                            c9772a.f63906e.postValue(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            C9772a c9772a2 = C9772a.this;
                            c9772a2.f63902a = Apply;
                            c9772a2.f63906e.postValue(Apply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C9772a(final ong val$workTaskExecutor, final Object val$lock, final f07 val$mappingMethod, final zpa val$outputLiveData) {
            this.f63903b = val$workTaskExecutor;
            this.f63904c = val$lock;
            this.f63905d = val$mappingMethod;
            this.f63906e = val$outputLiveData;
        }

        @Override // p000.qxb
        public void onChanged(@hib final In input) {
            this.f63903b.executeOnBackgroundThread(new a(input));
        }
    }

    private nb9() {
    }

    public static <In, Out> AbstractC1158q<Out> dedupedMappedLiveDataFor(@efb AbstractC1158q<In> inputLiveData, @efb final f07<In, Out> mappingMethod, @efb final ong workTaskExecutor) {
        Object obj = new Object();
        zpa zpaVar = new zpa();
        zpaVar.addSource(inputLiveData, new C9772a(workTaskExecutor, obj, mappingMethod, zpaVar));
        return zpaVar;
    }
}
