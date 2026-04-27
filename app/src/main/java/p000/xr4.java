package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class xr4 {

    /* JADX INFO: renamed from: f */
    public static final jm8.C7981a f99018f = jm8.C7981a.m14177of("ef");

    /* JADX INFO: renamed from: g */
    public static final jm8.C7981a f99019g = jm8.C7981a.m14177of(SearchView.f3153k3, "v");

    /* JADX INFO: renamed from: a */
    public C14811ww f99020a;

    /* JADX INFO: renamed from: b */
    public C15326xw f99021b;

    /* JADX INFO: renamed from: c */
    public C15326xw f99022c;

    /* JADX INFO: renamed from: d */
    public C15326xw f99023d;

    /* JADX INFO: renamed from: e */
    public C15326xw f99024e;

    private void maybeParseInnerEffect(jm8 jm8Var, bn9 bn9Var) throws IOException {
        jm8Var.beginObject();
        String strNextString = "";
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f99019g);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.f99023d = C10098nx.parseFloat(jm8Var, bn9Var);
                        break;
                    case "Opacity":
                        this.f99021b = C10098nx.parseFloat(jm8Var, bn9Var, false);
                        break;
                    case "Direction":
                        this.f99022c = C10098nx.parseFloat(jm8Var, bn9Var, false);
                        break;
                    case "Shadow Color":
                        this.f99020a = C10098nx.m18170a(jm8Var, bn9Var);
                        break;
                    case "Softness":
                        this.f99024e = C10098nx.parseFloat(jm8Var, bn9Var);
                        break;
                    default:
                        jm8Var.skipValue();
                        break;
                }
            } else {
                jm8Var.skipName();
                jm8Var.skipValue();
            }
        }
        jm8Var.endObject();
    }

    @hib
    /* JADX INFO: renamed from: a */
    public wr4 m25421a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        C15326xw c15326xw;
        C15326xw c15326xw2;
        C15326xw c15326xw3;
        C15326xw c15326xw4;
        while (jm8Var.hasNext()) {
            if (jm8Var.selectName(f99018f) != 0) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                jm8Var.beginArray();
                while (jm8Var.hasNext()) {
                    maybeParseInnerEffect(jm8Var, bn9Var);
                }
                jm8Var.endArray();
            }
        }
        C14811ww c14811ww = this.f99020a;
        if (c14811ww == null || (c15326xw = this.f99021b) == null || (c15326xw2 = this.f99022c) == null || (c15326xw3 = this.f99023d) == null || (c15326xw4 = this.f99024e) == null) {
            return null;
        }
        return new wr4(c14811ww, c15326xw, c15326xw2, c15326xw3, c15326xw4);
    }
}
