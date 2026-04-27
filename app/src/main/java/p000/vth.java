package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public class vth extends rth<tth, tth> {
    @Override // p000.rth
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo21529h(tth unknowns) {
        return unknowns.getSerializedSize();
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo21530i(tth unknowns) {
        return unknowns.getSerializedSizeAsMessageSet();
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public tth mo21532k(tth target, tth source) {
        return tth.getDefaultInstance().equals(source) ? target : tth.getDefaultInstance().equals(target) ? tth.m22835f(target, source) : target.m22839c(source);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public tth mo21534m() {
        return tth.m22836g();
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo21535n(Object message, tth fields) {
        mo21536o(message, fields);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo21536o(Object message, tth fields) {
        ((v27) message).unknownFields = fields;
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public tth mo21538q(tth fields) {
        fields.makeImmutable();
        return fields;
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21539r(tth fields, rsi writer) throws IOException {
        fields.m22844j(writer);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21540s(tth fields, rsi writer) throws IOException {
        fields.writeTo(writer);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: j */
    public void mo21531j(Object message) {
        mo21528g(message).makeImmutable();
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: p */
    public boolean mo21537p(hrd reader) {
        return false;
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21522a(tth fields, int number, int value) {
        fields.m22843i(hpi.m12536a(number, 5), Integer.valueOf(value));
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21523b(tth fields, int number, long value) {
        fields.m22843i(hpi.m12536a(number, 1), Long.valueOf(value));
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21524c(tth fields, int number, tth subFieldSet) {
        fields.m22843i(hpi.m12536a(number, 3), subFieldSet);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21525d(tth fields, int number, vj1 value) {
        fields.m22843i(hpi.m12536a(number, 2), value);
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21526e(tth fields, int number, long value) {
        fields.m22843i(hpi.m12536a(number, 0), Long.valueOf(value));
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public tth mo21527f(Object message) {
        tth tthVarMo21528g = mo21528g(message);
        if (tthVarMo21528g != tth.getDefaultInstance()) {
            return tthVarMo21528g;
        }
        tth tthVarM22836g = tth.m22836g();
        mo21536o(message, tthVarM22836g);
        return tthVarM22836g;
    }

    @Override // p000.rth
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public tth mo21528g(Object message) {
        return ((v27) message).unknownFields;
    }
}
