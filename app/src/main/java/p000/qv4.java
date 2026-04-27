package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qv4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hv4 f75894a = new k93(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final hv4 f75895b = new k93(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final hv4 f75896c = new k93(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final hv4 f75897d = new hv4() { // from class: pv4
        @Override // p000.hv4
        public final float transform(float f) {
            return qv4.LinearEasing$lambda$0(f);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f) {
        return f;
    }

    @yfb
    public static final hv4 getFastOutLinearInEasing() {
        return f75896c;
    }

    @yfb
    public static final hv4 getFastOutSlowInEasing() {
        return f75894a;
    }

    @yfb
    public static final hv4 getLinearEasing() {
        return f75897d;
    }

    @yfb
    public static final hv4 getLinearOutSlowInEasing() {
        return f75895b;
    }
}
