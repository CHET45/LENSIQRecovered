package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0392R;
import androidx.appcompat.view.menu.C0447h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class tfg extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final String f84553e = "SupportMenuInflater";

    /* JADX INFO: renamed from: f */
    public static final String f84554f = "menu";

    /* JADX INFO: renamed from: g */
    public static final String f84555g = "group";

    /* JADX INFO: renamed from: h */
    public static final String f84556h = "item";

    /* JADX INFO: renamed from: i */
    public static final int f84557i = 0;

    /* JADX INFO: renamed from: j */
    public static final Class<?>[] f84558j;

    /* JADX INFO: renamed from: k */
    public static final Class<?>[] f84559k;

    /* JADX INFO: renamed from: a */
    public final Object[] f84560a;

    /* JADX INFO: renamed from: b */
    public final Object[] f84561b;

    /* JADX INFO: renamed from: c */
    public Context f84562c;

    /* JADX INFO: renamed from: d */
    public Object f84563d;

    /* JADX INFO: renamed from: tfg$a */
    public static class MenuItemOnMenuItemClickListenerC13017a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f84564c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public Object f84565a;

        /* JADX INFO: renamed from: b */
        public Method f84566b;

        public MenuItemOnMenuItemClickListenerC13017a(Object obj, String str) {
            this.f84565a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f84566b = cls.getMethod(str, f84564c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f84566b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f84566b.invoke(this.f84565a, menuItem)).booleanValue();
                }
                this.f84566b.invoke(this.f84565a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: tfg$b */
    public class C13018b {

        /* JADX INFO: renamed from: G */
        public static final int f84567G = 0;

        /* JADX INFO: renamed from: H */
        public static final int f84568H = 0;

        /* JADX INFO: renamed from: I */
        public static final int f84569I = 0;

        /* JADX INFO: renamed from: J */
        public static final int f84570J = 0;

        /* JADX INFO: renamed from: K */
        public static final int f84571K = 0;

        /* JADX INFO: renamed from: L */
        public static final boolean f84572L = false;

        /* JADX INFO: renamed from: M */
        public static final boolean f84573M = true;

        /* JADX INFO: renamed from: N */
        public static final boolean f84574N = true;

        /* JADX INFO: renamed from: A */
        public AbstractC14977x8 f84575A;

        /* JADX INFO: renamed from: B */
        public CharSequence f84576B;

        /* JADX INFO: renamed from: C */
        public CharSequence f84577C;

        /* JADX INFO: renamed from: D */
        public ColorStateList f84578D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f84579E = null;

        /* JADX INFO: renamed from: a */
        public Menu f84581a;

        /* JADX INFO: renamed from: b */
        public int f84582b;

        /* JADX INFO: renamed from: c */
        public int f84583c;

        /* JADX INFO: renamed from: d */
        public int f84584d;

        /* JADX INFO: renamed from: e */
        public int f84585e;

        /* JADX INFO: renamed from: f */
        public boolean f84586f;

        /* JADX INFO: renamed from: g */
        public boolean f84587g;

        /* JADX INFO: renamed from: h */
        public boolean f84588h;

        /* JADX INFO: renamed from: i */
        public int f84589i;

        /* JADX INFO: renamed from: j */
        public int f84590j;

        /* JADX INFO: renamed from: k */
        public CharSequence f84591k;

        /* JADX INFO: renamed from: l */
        public CharSequence f84592l;

        /* JADX INFO: renamed from: m */
        public int f84593m;

        /* JADX INFO: renamed from: n */
        public char f84594n;

        /* JADX INFO: renamed from: o */
        public int f84595o;

        /* JADX INFO: renamed from: p */
        public char f84596p;

        /* JADX INFO: renamed from: q */
        public int f84597q;

        /* JADX INFO: renamed from: r */
        public int f84598r;

        /* JADX INFO: renamed from: s */
        public boolean f84599s;

        /* JADX INFO: renamed from: t */
        public boolean f84600t;

        /* JADX INFO: renamed from: u */
        public boolean f84601u;

        /* JADX INFO: renamed from: v */
        public int f84602v;

        /* JADX INFO: renamed from: w */
        public int f84603w;

        /* JADX INFO: renamed from: x */
        public String f84604x;

        /* JADX INFO: renamed from: y */
        public String f84605y;

        /* JADX INFO: renamed from: z */
        public String f84606z;

        public C13018b(Menu menu) {
            this.f84581a = menu;
            resetGroup();
        }

        private char getShortcut(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T newInstance(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, tfg.this.f84562c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(tfg.f84553e, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void setItem(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f84599s).setVisible(this.f84600t).setEnabled(this.f84601u).setCheckable(this.f84598r >= 1).setTitleCondensed(this.f84592l).setIcon(this.f84593m);
            int i = this.f84602v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f84606z != null) {
                if (tfg.this.f84562c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC13017a(tfg.this.m22493a(), this.f84606z));
            }
            if (this.f84598r >= 2) {
                if (menuItem instanceof C0447h) {
                    ((C0447h) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof hra) {
                    ((hra) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.f84604x;
            if (str != null) {
                menuItem.setActionView((View) newInstance(str, tfg.f84558j, tfg.this.f84560a));
                z = true;
            }
            int i2 = this.f84603w;
            if (i2 > 0) {
                if (z) {
                    Log.w(tfg.f84553e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC14977x8 abstractC14977x8 = this.f84575A;
            if (abstractC14977x8 != null) {
                era.setActionProvider(menuItem, abstractC14977x8);
            }
            era.setContentDescription(menuItem, this.f84576B);
            era.setTooltipText(menuItem, this.f84577C);
            era.setAlphabeticShortcut(menuItem, this.f84594n, this.f84595o);
            era.setNumericShortcut(menuItem, this.f84596p, this.f84597q);
            PorterDuff.Mode mode = this.f84579E;
            if (mode != null) {
                era.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.f84578D;
            if (colorStateList != null) {
                era.setIconTintList(menuItem, colorStateList);
            }
        }

        public void addItem() {
            this.f84588h = true;
            setItem(this.f84581a.add(this.f84582b, this.f84589i, this.f84590j, this.f84591k));
        }

        public SubMenu addSubMenuItem() {
            this.f84588h = true;
            SubMenu subMenuAddSubMenu = this.f84581a.addSubMenu(this.f84582b, this.f84589i, this.f84590j, this.f84591k);
            setItem(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean hasAddedItem() {
            return this.f84588h;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = tfg.this.f84562c.obtainStyledAttributes(attributeSet, C0392R.styleable.MenuGroup);
            this.f84582b = typedArrayObtainStyledAttributes.getResourceId(C0392R.styleable.MenuGroup_android_id, 0);
            this.f84583c = typedArrayObtainStyledAttributes.getInt(C0392R.styleable.MenuGroup_android_menuCategory, 0);
            this.f84584d = typedArrayObtainStyledAttributes.getInt(C0392R.styleable.MenuGroup_android_orderInCategory, 0);
            this.f84585e = typedArrayObtainStyledAttributes.getInt(C0392R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f84586f = typedArrayObtainStyledAttributes.getBoolean(C0392R.styleable.MenuGroup_android_visible, true);
            this.f84587g = typedArrayObtainStyledAttributes.getBoolean(C0392R.styleable.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(tfg.this.f84562c, attributeSet, C0392R.styleable.MenuItem);
            this.f84589i = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.MenuItem_android_id, 0);
            this.f84590j = (t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_android_menuCategory, this.f84583c) & (-65536)) | (t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_android_orderInCategory, this.f84584d) & 65535);
            this.f84591k = t2hVarObtainStyledAttributes.getText(C0392R.styleable.MenuItem_android_title);
            this.f84592l = t2hVarObtainStyledAttributes.getText(C0392R.styleable.MenuItem_android_titleCondensed);
            this.f84593m = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.MenuItem_android_icon, 0);
            this.f84594n = getShortcut(t2hVarObtainStyledAttributes.getString(C0392R.styleable.MenuItem_android_alphabeticShortcut));
            this.f84595o = t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.f84596p = getShortcut(t2hVarObtainStyledAttributes.getString(C0392R.styleable.MenuItem_android_numericShortcut));
            this.f84597q = t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_numericModifiers, 4096);
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.MenuItem_android_checkable)) {
                this.f84598r = t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f84598r = this.f84585e;
            }
            this.f84599s = t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.MenuItem_android_checked, false);
            this.f84600t = t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.MenuItem_android_visible, this.f84586f);
            this.f84601u = t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.MenuItem_android_enabled, this.f84587g);
            this.f84602v = t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_showAsAction, -1);
            this.f84606z = t2hVarObtainStyledAttributes.getString(C0392R.styleable.MenuItem_android_onClick);
            this.f84603w = t2hVarObtainStyledAttributes.getResourceId(C0392R.styleable.MenuItem_actionLayout, 0);
            this.f84604x = t2hVarObtainStyledAttributes.getString(C0392R.styleable.MenuItem_actionViewClass);
            String string = t2hVarObtainStyledAttributes.getString(C0392R.styleable.MenuItem_actionProviderClass);
            this.f84605y = string;
            boolean z = string != null;
            if (z && this.f84603w == 0 && this.f84604x == null) {
                this.f84575A = (AbstractC14977x8) newInstance(string, tfg.f84559k, tfg.this.f84561b);
            } else {
                if (z) {
                    Log.w(tfg.f84553e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f84575A = null;
            }
            this.f84576B = t2hVarObtainStyledAttributes.getText(C0392R.styleable.MenuItem_contentDescription);
            this.f84577C = t2hVarObtainStyledAttributes.getText(C0392R.styleable.MenuItem_tooltipText);
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.MenuItem_iconTintMode)) {
                this.f84579E = qq4.parseTintMode(t2hVarObtainStyledAttributes.getInt(C0392R.styleable.MenuItem_iconTintMode, -1), this.f84579E);
            } else {
                this.f84579E = null;
            }
            if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.MenuItem_iconTint)) {
                this.f84578D = t2hVarObtainStyledAttributes.getColorStateList(C0392R.styleable.MenuItem_iconTint);
            } else {
                this.f84578D = null;
            }
            t2hVarObtainStyledAttributes.recycle();
            this.f84588h = false;
        }

        public void resetGroup() {
            this.f84582b = 0;
            this.f84583c = 0;
            this.f84584d = 0;
            this.f84585e = 0;
            this.f84586f = true;
            this.f84587g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f84558j = clsArr;
        f84559k = clsArr;
    }

    public tfg(Context context) {
        super(context);
        this.f84562c = context;
        Object[] objArr = {context};
        this.f84560a = objArr;
        this.f84561b = objArr;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C13018b c13018b = new C13018b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f84554f)) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c13018b.resetGroup();
                    } else if (name2.equals("item")) {
                        if (!c13018b.hasAddedItem()) {
                            AbstractC14977x8 abstractC14977x8 = c13018b.f84575A;
                            if (abstractC14977x8 == null || !abstractC14977x8.hasSubMenu()) {
                                c13018b.addItem();
                            } else {
                                c13018b.addSubMenuItem();
                            }
                        }
                    } else if (name2.equals(f84554f)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c13018b.readGroup(attributeSet);
                } else if (name3.equals("item")) {
                    c13018b.readItem(attributeSet);
                } else if (name3.equals(f84554f)) {
                    parseMenu(xmlPullParser, attributeSet, c13018b.addSubMenuItem());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m22493a() {
        if (this.f84563d == null) {
            this.f84563d = findRealOwner(this.f84562c);
        }
        return this.f84563d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@uw8 int i, Menu menu) {
        if (!(menu instanceof sfg)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f84562c.getResources().getLayout(i);
                    parseMenu(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
