package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1062:1\n68#1,7:1063\n272#1,14:1070\n272#1,14:1084\n272#1,14:1098\n272#1,14:1112\n272#1,14:1126\n272#1,14:1140\n329#1,26:1154\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n112#1:1063,7\n151#1:1070,14\n168#1:1084,14\n189#1:1098,14\n206#1:1112,14\n232#1:1126,14\n248#1:1140,14\n298#1:1154,26\n*E\n"})
public final class jp4 {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m30529clipPathKD09W0M(@yfb ip4 ip4Var, @yfb vic vicVar, int i, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31597clipPathmtrdDE(vicVar, i);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m30530clipPathKD09W0M$default(ip4 ip4Var, vic vicVar, int i, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31597clipPathmtrdDE(vicVar, i);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m30531clipRectrOu3jXo(@yfb ip4 ip4Var, float f, float f2, float f3, float f4, int i, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31598clipRectN_I0leg(f, f2, f3, f4, i);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m30532clipRectrOu3jXo$default(ip4 ip4Var, float f, float f2, float f3, float f4, int i, qy6 qy6Var, int i2, Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc());
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = x42.f96262b.m33213getIntersectrtfAjoo();
        }
        int i3 = i;
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31598clipRectN_I0leg(f5, f6, f7, f8, i3);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    @q64(level = u64.f86867c, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* JADX INFO: renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m30533drawGRGpd60(ip4 ip4Var, c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j, qy6<? super ip4, bth> qy6Var) {
        c64 density = ip4Var.getDrawContext().getDensity();
        ov8 layoutDirection = ip4Var.getDrawContext().getLayoutDirection();
        vq1 canvas = ip4Var.getDrawContext().getCanvas();
        long jMo28019getSizeNHjbRc = ip4Var.getDrawContext().mo28019getSizeNHjbRc();
        u97 graphicsLayer = ip4Var.getDrawContext().getGraphicsLayer();
        bp4 drawContext = ip4Var.getDrawContext();
        drawContext.setDensity(c64Var);
        drawContext.setLayoutDirection(ov8Var);
        drawContext.setCanvas(vq1Var);
        drawContext.mo28020setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        vq1Var.save();
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            vq1Var.restore();
            bp4 drawContext2 = ip4Var.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection);
            drawContext2.setCanvas(canvas);
            drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m30534drawymL40Pk(@yfb ip4 ip4Var, @yfb c64 c64Var, @yfb ov8 ov8Var, @yfb vq1 vq1Var, long j, @gib u97 u97Var, @yfb qy6<? super ip4, bth> qy6Var) {
        c64 density = ip4Var.getDrawContext().getDensity();
        ov8 layoutDirection = ip4Var.getDrawContext().getLayoutDirection();
        vq1 canvas = ip4Var.getDrawContext().getCanvas();
        long jMo28019getSizeNHjbRc = ip4Var.getDrawContext().mo28019getSizeNHjbRc();
        u97 graphicsLayer = ip4Var.getDrawContext().getGraphicsLayer();
        bp4 drawContext = ip4Var.getDrawContext();
        drawContext.setDensity(c64Var);
        drawContext.setLayoutDirection(ov8Var);
        drawContext.setCanvas(vq1Var);
        drawContext.mo28020setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(u97Var);
        vq1Var.save();
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            vq1Var.restore();
            bp4 drawContext2 = ip4Var.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection);
            drawContext2.setCanvas(canvas);
            drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m30535drawymL40Pk$default(ip4 ip4Var, c64 c64Var, ov8 ov8Var, vq1 vq1Var, long j, u97 u97Var, qy6 qy6Var, int i, Object obj) {
        if ((i & 16) != 0) {
            u97Var = null;
        }
        c64 density = ip4Var.getDrawContext().getDensity();
        ov8 layoutDirection = ip4Var.getDrawContext().getLayoutDirection();
        vq1 canvas = ip4Var.getDrawContext().getCanvas();
        long jMo28019getSizeNHjbRc = ip4Var.getDrawContext().mo28019getSizeNHjbRc();
        u97 graphicsLayer = ip4Var.getDrawContext().getGraphicsLayer();
        bp4 drawContext = ip4Var.getDrawContext();
        drawContext.setDensity(c64Var);
        drawContext.setLayoutDirection(ov8Var);
        drawContext.setCanvas(vq1Var);
        drawContext.mo28020setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(u97Var);
        vq1Var.save();
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            vq1Var.restore();
            bp4 drawContext2 = ip4Var.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection);
            drawContext2.setCanvas(canvas);
            drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            o28.finallyEnd(1);
        }
    }

    public static final void drawIntoCanvas(@yfb ip4 ip4Var, @yfb qy6<? super vq1, bth> qy6Var) {
        qy6Var.invoke(ip4Var.getDrawContext().getCanvas());
    }

    public static final void inset(@yfb ip4 ip4Var, float f, float f2, float f3, float f4, @yfb qy6<? super ip4, bth> qy6Var) {
        ip4Var.getDrawContext().getTransform().inset(f, f2, f3, f4);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            ip4Var.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void inset$default(ip4 ip4Var, float f, float f2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        ip4Var.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            float f3 = -f;
            float f4 = -f2;
            ip4Var.getDrawContext().getTransform().inset(f3, f4, f3, f4);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m30536rotateRg1IO4c(@yfb ip4 ip4Var, float f, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31601rotateUv8p0NA(f, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m30537rotateRg1IO4c$default(ip4 ip4Var, float f, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ip4Var.mo30272getCenterF1C5BW0();
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31601rotateUv8p0NA(f, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m30538rotateRadRg1IO4c(@yfb ip4 ip4Var, float f, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31601rotateUv8p0NA(n34.degrees(f), j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m30539rotateRadRg1IO4c$default(ip4 ip4Var, float f, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ip4Var.mo30272getCenterF1C5BW0();
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31601rotateUv8p0NA(n34.degrees(f), j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m30540scaleFgt4K4Q(@yfb ip4 ip4Var, float f, float f2, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31602scale0AR0LA0(f, f2, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m30541scaleFgt4K4Q$default(ip4 ip4Var, float f, float f2, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 4) != 0) {
            j = ip4Var.mo30272getCenterF1C5BW0();
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31602scale0AR0LA0(f, f2, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m30542scaleRg1IO4c(@yfb ip4 ip4Var, float f, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31602scale0AR0LA0(f, f, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m30543scaleRg1IO4c$default(ip4 ip4Var, float f, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ip4Var.mo30272getCenterF1C5BW0();
        }
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31602scale0AR0LA0(f, f, j);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    public static final void translate(@yfb ip4 ip4Var, float f, float f2, @yfb qy6<? super ip4, bth> qy6Var) {
        ip4Var.getDrawContext().getTransform().translate(f, f2);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            ip4Var.getDrawContext().getTransform().translate(-f, -f2);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void translate$default(ip4 ip4Var, float f, float f2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        ip4Var.getDrawContext().getTransform().translate(f, f2);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            ip4Var.getDrawContext().getTransform().translate(-f, -f2);
            o28.finallyEnd(1);
        }
    }

    public static final void withTransform(@yfb ip4 ip4Var, @yfb qy6<? super tp4, bth> qy6Var, @yfb qy6<? super ip4, bth> qy6Var2) {
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            qy6Var.invoke(drawContext.getTransform());
            qy6Var2.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    public static final void inset(@yfb ip4 ip4Var, float f, @yfb qy6<? super ip4, bth> qy6Var) {
        ip4Var.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            float f2 = -f;
            ip4Var.getDrawContext().getTransform().inset(f2, f2, f2, f2);
            o28.finallyEnd(1);
        }
    }

    public static final void inset(@yfb ip4 ip4Var, float f, float f2, @yfb qy6<? super ip4, bth> qy6Var) {
        ip4Var.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            float f3 = -f;
            float f4 = -f2;
            ip4Var.getDrawContext().getTransform().inset(f3, f4, f3, f4);
            o28.finallyEnd(1);
        }
    }
}
