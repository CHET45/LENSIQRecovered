package p000;

/* JADX INFO: loaded from: classes.dex */
public final class keh {
    public static final <R> R getIndexTransformationType(@yfb jeh jehVar, int i, @yfb kz6<? super o08, ? super jvg, ? super jvg, ? extends R> kz6Var) {
        long jM30514mapFromTransformedjx7JFs = jehVar.m30514mapFromTransformedjx7JFs(i);
        long jM30517mapToTransformedGEjPoXI = jehVar.m30517mapToTransformedGEjPoXI(jM30514mapFromTransformedjx7JFs);
        return kz6Var.invoke((jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) && jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Untransformed : (jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? (!jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Deletion : o08.Insertion : o08.Replacement, jvg.m30581boximpl(jM30514mapFromTransformedjx7JFs), jvg.m30581boximpl(jM30517mapToTransformedGEjPoXI));
    }
}
