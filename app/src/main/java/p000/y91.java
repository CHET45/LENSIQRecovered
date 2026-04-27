package p000;

import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class y91 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f100820a = jm8.C7981a.m14177of("ef");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f100821b = jm8.C7981a.m14177of("ty", "v");

    @hib
    /* JADX INFO: renamed from: a */
    public static w91 m25792a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        w91 w91Var = null;
        while (jm8Var.hasNext()) {
            if (jm8Var.selectName(f100820a) != 0) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                jm8Var.beginArray();
                while (jm8Var.hasNext()) {
                    w91 w91VarMaybeParseInnerEffect = maybeParseInnerEffect(jm8Var, bn9Var);
                    if (w91VarMaybeParseInnerEffect != null) {
                        w91Var = w91VarMaybeParseInnerEffect;
                    }
                }
                jm8Var.endArray();
            }
        }
        return w91Var;
    }

    @hib
    private static w91 maybeParseInnerEffect(jm8 jm8Var, bn9 bn9Var) throws IOException {
        jm8Var.beginObject();
        w91 w91Var = null;
        while (true) {
            boolean z = false;
            while (jm8Var.hasNext()) {
                int iSelectName = jm8Var.selectName(f100821b);
                if (iSelectName != 0) {
                    if (iSelectName != 1) {
                        jm8Var.skipName();
                        jm8Var.skipValue();
                    } else if (z) {
                        w91Var = new w91(C10098nx.parseFloat(jm8Var, bn9Var));
                    } else {
                        jm8Var.skipValue();
                    }
                } else if (jm8Var.nextInt() == 0) {
                    z = true;
                }
            }
            jm8Var.endObject();
            return w91Var;
        }
    }
}
