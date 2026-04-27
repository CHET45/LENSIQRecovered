package p000;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.lqi;

/* JADX INFO: loaded from: classes3.dex */
public final class e5c extends lqi {

    /* JADX INFO: renamed from: e5c$a */
    public static final class C5124a extends lqi.AbstractC8940a<C5124a, e5c> {
        public C5124a(@efb Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.f58487c.f68340d = OverwritingInputMerger.class.getName();
        }

        @Override // p000.lqi.AbstractC8940a
        @efb
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e5c mo9694a() {
            if (this.f58485a && this.f58487c.f68346j.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new e5c(this);
        }

        @Override // p000.lqi.AbstractC8940a
        @efb
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5124a mo9695b() {
            return this;
        }

        @efb
        public C5124a setInputMerger(@efb Class<? extends s38> inputMerger) {
            this.f58487c.f68340d = inputMerger.getName();
            return this;
        }
    }

    public e5c(C5124a builder) {
        super(builder.f58486b, builder.f58487c, builder.f58488d);
    }

    @efb
    public static e5c from(@efb Class<? extends ListenableWorker> workerClass) {
        return new C5124a(workerClass).build();
    }

    @efb
    public static List<e5c> from(@efb List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        Iterator<Class<? extends ListenableWorker>> it = workerClasses.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5124a(it.next()).build());
        }
        return arrayList;
    }
}
