package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n+ 2 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n*L\n1#1,304:1\n27#2,3:305\n36#2,4:308\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n*L\n156#1:305,3\n161#1:308,4\n*E\n"})
public final class nw4 {
    public static final void backspace(@yfb qw4 qw4Var) {
        if (qw4Var.hasComposition()) {
            qw4Var.delete(qw4Var.getCompositionStart(), qw4Var.getCompositionEnd());
            return;
        }
        if (qw4Var.getCursor() != -1) {
            if (qw4Var.getCursor() != 0) {
                qw4Var.delete(u7g.findPrecedingBreak(qw4Var.toString(), qw4Var.getCursor()), qw4Var.getCursor());
            }
        } else {
            int selectionStart = qw4Var.getSelectionStart();
            int selectionEnd = qw4Var.getSelectionEnd();
            qw4Var.setCursor(qw4Var.getSelectionStart());
            qw4Var.delete(selectionStart, selectionEnd);
        }
    }

    public static final void commitText(@yfb qw4 qw4Var, @yfb String str, int i) {
        if (qw4Var.hasComposition()) {
            qw4Var.replace(qw4Var.getCompositionStart(), qw4Var.getCompositionEnd(), str);
        } else {
            qw4Var.replace(qw4Var.getSelectionStart(), qw4Var.getSelectionEnd(), str);
        }
        qw4Var.setCursor(kpd.coerceIn(i > 0 ? (r0 + i) - 1 : (qw4Var.getCursor() + i) - str.length(), 0, qw4Var.getLength()));
    }

    public static final void deleteAll(@yfb qw4 qw4Var) {
        qw4Var.replace(0, qw4Var.getLength(), "");
    }

    public static final void deleteSurroundingText(@yfb qw4 qw4Var, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
        int selectionEnd = qw4Var.getSelectionEnd();
        int length = selectionEnd + i2;
        if (((i2 ^ length) & (selectionEnd ^ length)) < 0) {
            length = qw4Var.getLength();
        }
        qw4Var.delete(qw4Var.getSelectionEnd(), Math.min(length, qw4Var.getLength()));
        int selectionStart = qw4Var.getSelectionStart();
        int i3 = selectionStart - i;
        if (((i ^ selectionStart) & (selectionStart ^ i3)) < 0) {
            i3 = 0;
        }
        qw4Var.delete(Math.max(0, i3), qw4Var.getSelectionStart());
    }

    public static final void deleteSurroundingTextInCodePoints(@yfb qw4 qw4Var, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
        int i3 = 0;
        int i4 = 0;
        int selectionStart = 0;
        while (true) {
            if (i4 < i) {
                int i5 = selectionStart + 1;
                if (qw4Var.getSelectionStart() <= i5) {
                    selectionStart = qw4Var.getSelectionStart();
                    break;
                } else {
                    selectionStart = isSurrogatePair(qw4Var.get((qw4Var.getSelectionStart() - i5) + (-1)), qw4Var.get(qw4Var.getSelectionStart() - i5)) ? selectionStart + 2 : i5;
                    i4++;
                }
            } else {
                break;
            }
        }
        int length = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i6 = length + 1;
            if (qw4Var.getSelectionEnd() + i6 >= qw4Var.getLength()) {
                length = qw4Var.getLength() - qw4Var.getSelectionEnd();
                break;
            } else {
                length = isSurrogatePair(qw4Var.get((qw4Var.getSelectionEnd() + i6) + (-1)), qw4Var.get(qw4Var.getSelectionEnd() + i6)) ? length + 2 : i6;
                i3++;
            }
        }
        qw4Var.delete(qw4Var.getSelectionEnd(), qw4Var.getSelectionEnd() + length);
        qw4Var.delete(qw4Var.getSelectionStart() - selectionStart, qw4Var.getSelectionStart());
    }

    public static final void finishComposingText(@yfb qw4 qw4Var) {
        qw4Var.commitComposition();
    }

    private static final boolean isSurrogatePair(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    public static final void moveCursor(@yfb qw4 qw4Var, int i) {
        if (qw4Var.getCursor() == -1) {
            qw4Var.setCursor(qw4Var.getSelectionStart());
        }
        int selectionStart = qw4Var.getSelectionStart();
        String string = qw4Var.toString();
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int iFindPrecedingBreak = u7g.findPrecedingBreak(string, selectionStart);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = iFindPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int iFindFollowingBreak = u7g.findFollowingBreak(string, selectionStart);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = iFindFollowingBreak;
            }
        }
        qw4Var.setCursor(selectionStart);
    }

    public static final void setComposingRegion(@yfb qw4 qw4Var, int i, int i2) {
        if (qw4Var.hasComposition()) {
            qw4Var.commitComposition();
        }
        int iCoerceIn = kpd.coerceIn(i, 0, qw4Var.getLength());
        int iCoerceIn2 = kpd.coerceIn(i2, 0, qw4Var.getLength());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                qw4Var.setComposition(iCoerceIn, iCoerceIn2);
            } else {
                qw4Var.setComposition(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public static final void setComposingText(@yfb qw4 qw4Var, @yfb String str, int i) {
        if (qw4Var.hasComposition()) {
            int compositionStart = qw4Var.getCompositionStart();
            qw4Var.replace(compositionStart, qw4Var.getCompositionEnd(), str);
            if (str.length() > 0) {
                qw4Var.setComposition(compositionStart, str.length() + compositionStart);
            }
        } else {
            int selectionStart = qw4Var.getSelectionStart();
            qw4Var.replace(selectionStart, qw4Var.getSelectionEnd(), str);
            if (str.length() > 0) {
                qw4Var.setComposition(selectionStart, str.length() + selectionStart);
            }
        }
        qw4Var.setCursor(kpd.coerceIn(i > 0 ? (r0 + i) - 1 : (qw4Var.getCursor() + i) - str.length(), 0, qw4Var.getLength()));
    }
}
