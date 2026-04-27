package p000;

import p000.gwe;
import p000.mwe;

/* JADX INFO: loaded from: classes.dex */
public interface mwe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9574a f62568a = C9574a.f62569a;

    /* JADX INFO: renamed from: mwe$a */
    public static final class C9574a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C9574a f62569a = new C9574a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final mwe f62570b = new mwe() { // from class: hwe
            @Override // p000.mwe
            public final gwe adjust(vwe vweVar) {
                return mwe.C9574a.None$lambda$0(vweVar);
            }
        };

        /* JADX INFO: renamed from: c */
        @yfb
        public static final mwe f62571c = new mwe() { // from class: iwe
            @Override // p000.mwe
            public final gwe adjust(vwe vweVar) {
                return mwe.C9574a.Character$lambda$1(vweVar);
            }
        };

        /* JADX INFO: renamed from: d */
        @yfb
        public static final mwe f62572d = new mwe() { // from class: jwe
            @Override // p000.mwe
            public final gwe adjust(vwe vweVar) {
                return mwe.C9574a.Word$lambda$2(vweVar);
            }
        };

        /* JADX INFO: renamed from: e */
        @yfb
        public static final mwe f62573e = new mwe() { // from class: kwe
            @Override // p000.mwe
            public final gwe adjust(vwe vweVar) {
                return mwe.C9574a.Paragraph$lambda$3(vweVar);
            }
        };

        /* JADX INFO: renamed from: f */
        @yfb
        public static final mwe f62574f = new mwe() { // from class: lwe
            @Override // p000.mwe
            public final gwe adjust(vwe vweVar) {
                return mwe.C9574a.CharacterWithWordAccelerate$lambda$4(vweVar);
            }
        };

        /* JADX INFO: renamed from: mwe$a$a */
        public static final class a implements ic1 {

            /* JADX INFO: renamed from: a */
            public static final a f62575a = new a();

            @Override // p000.ic1
            /* JADX INFO: renamed from: getBoundary-fzxv0v0 */
            public final long mo30191getBoundaryfzxv0v0(@yfb ewe eweVar, int i) {
                return t7g.getParagraphBoundary(eweVar.getInputText(), i);
            }
        }

        /* JADX INFO: renamed from: mwe$a$b */
        public static final class b implements ic1 {

            /* JADX INFO: renamed from: a */
            public static final b f62576a = new b();

            @Override // p000.ic1
            /* JADX INFO: renamed from: getBoundary-fzxv0v0 */
            public final long mo30191getBoundaryfzxv0v0(@yfb ewe eweVar, int i) {
                return eweVar.getTextLayoutResult().m30131getWordBoundaryjx7JFs(i);
            }
        }

        private C9574a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gwe Character$lambda$1(vwe vweVar) {
            return nwe.ensureAtLeastOneChar(f62570b.adjust(vweVar), vweVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gwe CharacterWithWordAccelerate$lambda$4(vwe vweVar) {
            gwe.C6633a end;
            gwe.C6633a c6633aUpdateSelectionBoundary;
            gwe.C6633a start;
            gwe.C6633a end2;
            gwe previousSelection = vweVar.getPreviousSelection();
            if (previousSelection == null) {
                return f62572d.adjust(vweVar);
            }
            if (vweVar.isStartHandle()) {
                end = previousSelection.getStart();
                c6633aUpdateSelectionBoundary = nwe.updateSelectionBoundary(vweVar, vweVar.getStartInfo(), end);
                end2 = previousSelection.getEnd();
                start = c6633aUpdateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                c6633aUpdateSelectionBoundary = nwe.updateSelectionBoundary(vweVar, vweVar.getEndInfo(), end);
                start = previousSelection.getStart();
                end2 = c6633aUpdateSelectionBoundary;
            }
            if (md8.areEqual(c6633aUpdateSelectionBoundary, end)) {
                return previousSelection;
            }
            return nwe.ensureAtLeastOneChar(new gwe(start, end2, vweVar.getCrossStatus() == z83.CROSSED || (vweVar.getCrossStatus() == z83.COLLAPSED && start.getOffset() > end2.getOffset())), vweVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gwe None$lambda$0(vwe vweVar) {
            return new gwe(vweVar.getStartInfo().anchorForOffset(vweVar.getStartInfo().getRawStartHandleOffset()), vweVar.getEndInfo().anchorForOffset(vweVar.getEndInfo().getRawEndHandleOffset()), vweVar.getCrossStatus() == z83.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gwe Paragraph$lambda$3(vwe vweVar) {
            return nwe.adjustToBoundaries(vweVar, a.f62575a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gwe Word$lambda$2(vwe vweVar) {
            return nwe.adjustToBoundaries(vweVar, b.f62576a);
        }

        @yfb
        public final mwe getCharacter() {
            return f62571c;
        }

        @yfb
        public final mwe getCharacterWithWordAccelerate() {
            return f62574f;
        }

        @yfb
        public final mwe getNone() {
            return f62570b;
        }

        @yfb
        public final mwe getParagraph() {
            return f62573e;
        }

        @yfb
        public final mwe getWord() {
            return f62572d;
        }
    }

    @yfb
    gwe adjust(@yfb vwe vweVar);
}
