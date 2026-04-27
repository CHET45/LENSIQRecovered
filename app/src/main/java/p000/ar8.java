package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ar8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zq8 f11676a = new C1579c(commonKeyMapping(new ogd() { // from class: ar8.b
        @Override // p000.ogd, p000.jp8
        @gib
        public Object get(@gib Object obj) {
            return Boolean.valueOf(oq8.m31590isCtrlPressedZmokQxo(((kq8) obj).m30741unboximpl()));
        }
    }));

    /* JADX INFO: renamed from: ar8$a */
    public static final class C1577a implements zq8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<kq8, Boolean> f11677a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1577a(qy6<? super kq8, Boolean> qy6Var) {
            this.f11677a = qy6Var;
        }

        @Override // p000.zq8
        @gib
        /* JADX INFO: renamed from: map-ZmokQxo, reason: not valid java name */
        public hq8 mo27875mapZmokQxo(@yfb KeyEvent keyEvent) {
            if (this.f11677a.invoke(kq8.m30735boximpl(keyEvent)).booleanValue() && oq8.m31592isShiftPressedZmokQxo(keyEvent)) {
                if (cq8.m28251equalsimpl0(oq8.m31586getKeyZmokQxo(keyEvent), qt9.f75702a.m32023getZEK5gGoQ())) {
                    return hq8.REDO;
                }
                return null;
            }
            if (this.f11677a.invoke(kq8.m30735boximpl(keyEvent)).booleanValue()) {
                long jM31586getKeyZmokQxo = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32003getCEK5gGoQ()) ? true : cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32013getInsertEK5gGoQ())) {
                    return hq8.COPY;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32020getVEK5gGoQ())) {
                    return hq8.PASTE;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32021getXEK5gGoQ())) {
                    return hq8.CUT;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32000getAEK5gGoQ())) {
                    return hq8.SELECT_ALL;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32022getYEK5gGoQ())) {
                    return hq8.REDO;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32023getZEK5gGoQ())) {
                    return hq8.UNDO;
                }
                return null;
            }
            if (oq8.m31590isCtrlPressedZmokQxo(keyEvent)) {
                return null;
            }
            if (oq8.m31592isShiftPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo2 = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var2 = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32008getDirectionLeftEK5gGoQ())) {
                    return hq8.SELECT_LEFT_CHAR;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32009getDirectionRightEK5gGoQ())) {
                    return hq8.SELECT_RIGHT_CHAR;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32010getDirectionUpEK5gGoQ())) {
                    return hq8.SELECT_UP;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32007getDirectionDownEK5gGoQ())) {
                    return hq8.SELECT_DOWN;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32017getPageUpEK5gGoQ())) {
                    return hq8.SELECT_PAGE_UP;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32016getPageDownEK5gGoQ())) {
                    return hq8.SELECT_PAGE_DOWN;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32015getMoveHomeEK5gGoQ())) {
                    return hq8.SELECT_LINE_START;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32014getMoveEndEK5gGoQ())) {
                    return hq8.SELECT_LINE_END;
                }
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32013getInsertEK5gGoQ())) {
                    return hq8.PASTE;
                }
                return null;
            }
            long jM31586getKeyZmokQxo3 = oq8.m31586getKeyZmokQxo(keyEvent);
            qt9 qt9Var3 = qt9.f75702a;
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32008getDirectionLeftEK5gGoQ())) {
                return hq8.LEFT_CHAR;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32009getDirectionRightEK5gGoQ())) {
                return hq8.RIGHT_CHAR;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32010getDirectionUpEK5gGoQ())) {
                return hq8.UP;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32007getDirectionDownEK5gGoQ())) {
                return hq8.DOWN;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32017getPageUpEK5gGoQ())) {
                return hq8.PAGE_UP;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32016getPageDownEK5gGoQ())) {
                return hq8.PAGE_DOWN;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32015getMoveHomeEK5gGoQ())) {
                return hq8.LINE_START;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32014getMoveEndEK5gGoQ())) {
                return hq8.LINE_END;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32011getEnterEK5gGoQ())) {
                return hq8.NEW_LINE;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32002getBackspaceEK5gGoQ())) {
                return hq8.DELETE_PREV_CHAR;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32006getDeleteEK5gGoQ())) {
                return hq8.DELETE_NEXT_CHAR;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32018getPasteEK5gGoQ())) {
                return hq8.PASTE;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32005getCutEK5gGoQ())) {
                return hq8.CUT;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32004getCopyEK5gGoQ())) {
                return hq8.COPY;
            }
            if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32019getTabEK5gGoQ())) {
                return hq8.TAB;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ar8$c */
    public static final class C1579c implements zq8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zq8 f11679a;

        public C1579c(zq8 zq8Var) {
            this.f11679a = zq8Var;
        }

        @Override // p000.zq8
        @gib
        /* JADX INFO: renamed from: map-ZmokQxo */
        public hq8 mo27875mapZmokQxo(@yfb KeyEvent keyEvent) {
            hq8 hq8Var = null;
            if (oq8.m31592isShiftPressedZmokQxo(keyEvent) && oq8.m31590isCtrlPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32008getDirectionLeftEK5gGoQ())) {
                    hq8Var = hq8.SELECT_LEFT_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32009getDirectionRightEK5gGoQ())) {
                    hq8Var = hq8.SELECT_RIGHT_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32010getDirectionUpEK5gGoQ())) {
                    hq8Var = hq8.SELECT_PREV_PARAGRAPH;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo, qt9Var.m32007getDirectionDownEK5gGoQ())) {
                    hq8Var = hq8.SELECT_NEXT_PARAGRAPH;
                }
            } else if (oq8.m31590isCtrlPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo2 = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var2 = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32008getDirectionLeftEK5gGoQ())) {
                    hq8Var = hq8.LEFT_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32009getDirectionRightEK5gGoQ())) {
                    hq8Var = hq8.RIGHT_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32010getDirectionUpEK5gGoQ())) {
                    hq8Var = hq8.PREV_PARAGRAPH;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32007getDirectionDownEK5gGoQ())) {
                    hq8Var = hq8.NEXT_PARAGRAPH;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32012getHEK5gGoQ())) {
                    hq8Var = hq8.DELETE_PREV_CHAR;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32006getDeleteEK5gGoQ())) {
                    hq8Var = hq8.DELETE_NEXT_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32002getBackspaceEK5gGoQ())) {
                    hq8Var = hq8.DELETE_PREV_WORD;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo2, qt9Var2.m32001getBackslashEK5gGoQ())) {
                    hq8Var = hq8.DESELECT;
                }
            } else if (oq8.m31592isShiftPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo3 = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var3 = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32015getMoveHomeEK5gGoQ())) {
                    hq8Var = hq8.SELECT_LINE_LEFT;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo3, qt9Var3.m32014getMoveEndEK5gGoQ())) {
                    hq8Var = hq8.SELECT_LINE_RIGHT;
                }
            } else if (oq8.m31589isAltPressedZmokQxo(keyEvent)) {
                long jM31586getKeyZmokQxo4 = oq8.m31586getKeyZmokQxo(keyEvent);
                qt9 qt9Var4 = qt9.f75702a;
                if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo4, qt9Var4.m32002getBackspaceEK5gGoQ())) {
                    hq8Var = hq8.DELETE_FROM_LINE_START;
                } else if (cq8.m28251equalsimpl0(jM31586getKeyZmokQxo4, qt9Var4.m32006getDeleteEK5gGoQ())) {
                    hq8Var = hq8.DELETE_TO_LINE_END;
                }
            }
            return hq8Var == null ? this.f11679a.mo27875mapZmokQxo(keyEvent) : hq8Var;
        }
    }

    @yfb
    public static final zq8 commonKeyMapping(@yfb qy6<? super kq8, Boolean> qy6Var) {
        return new C1577a(qy6Var);
    }

    @yfb
    public static final zq8 getDefaultKeyMapping() {
        return f11676a;
    }
}
