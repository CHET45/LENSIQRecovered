package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public class wth extends sth<uth, uth> {
    @Override // p000.sth
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo22235h(uth unknowns) {
        return unknowns.getSerializedSize();
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo22236i(uth unknowns) {
        return unknowns.getSerializedSizeAsMessageSet();
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public uth mo22238k(uth target, uth source) {
        return uth.getDefaultInstance().equals(source) ? target : uth.getDefaultInstance().equals(target) ? uth.m23569f(target, source) : target.m23573c(source);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public uth mo22240m() {
        return uth.m23570g();
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo22241n(Object message, uth fields) {
        mo22242o(message, fields);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo22242o(Object message, uth fields) {
        ((u27) message).unknownFields = fields;
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public uth mo22244q(uth fields) {
        fields.makeImmutable();
        return fields;
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22245r(uth fields, qsi writer) throws IOException {
        fields.m23578j(writer);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22246s(uth fields, qsi writer) throws IOException {
        fields.writeTo(writer);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: j */
    public void mo22237j(Object message) {
        mo22234g(message).makeImmutable();
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: p */
    public boolean mo22243p(ird reader) {
        return false;
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo22228a(uth fields, int number, int value) {
        fields.m23577i(gpi.m11819a(number, 5), Integer.valueOf(value));
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22229b(uth fields, int number, long value) {
        fields.m23577i(gpi.m11819a(number, 1), Long.valueOf(value));
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22230c(uth fields, int number, uth subFieldSet) {
        fields.m23577i(gpi.m11819a(number, 3), subFieldSet);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo22231d(uth fields, int number, wj1 value) {
        fields.m23577i(gpi.m11819a(number, 2), value);
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22232e(uth fields, int number, long value) {
        fields.m23577i(gpi.m11819a(number, 0), Long.valueOf(value));
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public uth mo22233f(Object message) {
        uth uthVarMo22234g = mo22234g(message);
        if (uthVarMo22234g != uth.getDefaultInstance()) {
            return uthVarMo22234g;
        }
        uth uthVarM23570g = uth.m23570g();
        mo22242o(message, uthVarM23570g);
        return uthVarM23570g;
    }

    @Override // p000.sth
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public uth mo22234g(Object message) {
        return ((u27) message).unknownFields;
    }
}
