package p000;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class f5c {

    /* JADX INFO: renamed from: a */
    public final int f35377a;

    /* JADX INFO: renamed from: b */
    public final Field f35378b;

    /* JADX INFO: renamed from: c */
    public final Field f35379c;

    public f5c(int id, Field caseField, Field valueField) {
        this.f35377a = id;
        this.f35378b = caseField;
        this.f35379c = valueField;
    }

    public Field getCaseField() {
        return this.f35378b;
    }

    public int getId() {
        return this.f35377a;
    }

    public Field getValueField() {
        return this.f35379c;
    }
}
