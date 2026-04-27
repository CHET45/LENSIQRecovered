package p000;

import java.io.IOException;
import p000.jm8;

/* JADX INFO: renamed from: jx */
/* JADX INFO: loaded from: classes3.dex */
public class C8130jx {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f52150a = jm8.C7981a.m14177of("a");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f52151b = jm8.C7981a.m14177of("fc", "sc", "sw", "t");

    private C8130jx() {
    }

    public static C7646ix parse(jm8 jm8Var, bn9 bn9Var) throws IOException {
        jm8Var.beginObject();
        C7646ix animatableTextProperties = null;
        while (jm8Var.hasNext()) {
            if (jm8Var.selectName(f52150a) != 0) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                animatableTextProperties = parseAnimatableTextProperties(jm8Var, bn9Var);
            }
        }
        jm8Var.endObject();
        return animatableTextProperties == null ? new C7646ix(null, null, null, null) : animatableTextProperties;
    }

    private static C7646ix parseAnimatableTextProperties(jm8 jm8Var, bn9 bn9Var) throws IOException {
        jm8Var.beginObject();
        C14811ww c14811wwM18170a = null;
        C14811ww c14811wwM18170a2 = null;
        C15326xw c15326xw = null;
        C15326xw c15326xw2 = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f52151b);
            if (iSelectName == 0) {
                c14811wwM18170a = C10098nx.m18170a(jm8Var, bn9Var);
            } else if (iSelectName == 1) {
                c14811wwM18170a2 = C10098nx.m18170a(jm8Var, bn9Var);
            } else if (iSelectName == 2) {
                c15326xw = C10098nx.parseFloat(jm8Var, bn9Var);
            } else if (iSelectName != 3) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var);
            }
        }
        jm8Var.endObject();
        return new C7646ix(c14811wwM18170a, c14811wwM18170a2, c15326xw, c15326xw2);
    }
}
