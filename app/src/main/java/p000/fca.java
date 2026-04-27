package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class fca extends qca {
    /* JADX WARN: Illegal instructions before constructor call */
    public fca(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        md8.checkNotNullExpressionValue(measurementManager, "get(context)");
        super(measurementManager);
    }
}
