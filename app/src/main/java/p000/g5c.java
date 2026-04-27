package p000;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class g5c {

    /* JADX INFO: renamed from: a */
    public final int f38820a;

    /* JADX INFO: renamed from: b */
    public final Field f38821b;

    /* JADX INFO: renamed from: c */
    public final Field f38822c;

    public g5c(int id, Field caseField, Field valueField) {
        this.f38820a = id;
        this.f38821b = caseField;
        this.f38822c = valueField;
    }

    public Field getCaseField() {
        return this.f38821b;
    }

    public int getId() {
        return this.f38820a;
    }

    public Field getValueField() {
        return this.f38822c;
    }
}
